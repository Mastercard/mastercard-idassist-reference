/*
 Copyright (c) 2021 Mastercard

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.mastercard.developer.exception;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Appender;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mastercard.dis.mids.ApiException;
import com.mastercard.dis.mids.JSON;
import com.mastercard.dis.mids.model.id.verification.ApiError;
import com.mastercard.dis.mids.model.id.verification.Error;
import com.mastercard.dis.mids.model.id.verification.Errors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.LoggerFactory;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class ExceptionUtilTest {

    private static final String ERROR_MESSAGE = "error message";
    private static final int ERROR_CODE = 1;
    private static final String RESPONSE_BODY = "{\"ip\":\"192.167.1.15\"}";

    @Captor
    private ArgumentCaptor<ILoggingEvent> loggingEventCaptor;
    @Mock
    private Appender<ILoggingEvent> mockedAppender;

    private Gson gson = new GsonBuilder().create();

    @Mock
    private JSON json;

    @InjectMocks
    private ExceptionUtil exceptionUtil;

    @BeforeEach
    public void setUp() {
        ch.qos.logback.classic.Logger root = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(ExceptionUtil.class);
        root.addAppender(mockedAppender);
        ReflectionTestUtils.setField(json, "gson", gson);
    }

    @Test
    void logAndConvertToServiceException_notNullApiException_loggingAndReturningServiceException_throwException_and_logged_twice() {
        ApiException apiExceptionExample = new ApiException(ERROR_MESSAGE, ERROR_CODE, Collections.emptyMap(), "{data:{testError: invalid_format}}");

        ServiceException serviceException = exceptionUtil.logAndConvertToServiceException(apiExceptionExample);
        assertNotNull(serviceException);

        verify(mockedAppender, times(2)).doAppend(loggingEventCaptor.capture());
    }

    @Test
    void logAndConvertToServiceException_notNullApiException_loggingAndReturningServiceException() {
        ApiException apiExceptionExample = createApiExceptionExample();

        ServiceException serviceException = exceptionUtil.logAndConvertToServiceException(apiExceptionExample);
        assertNotNull(serviceException);

        verify(mockedAppender, times(1)).doAppend(loggingEventCaptor.capture());
        assertEquals("Error while processing request " + apiExceptionExample.getMessage() + " " + apiExceptionExample.getResponseBody(), loggingEventCaptor.getValue().getFormattedMessage());
        assertEquals(apiExceptionExample, serviceException.getCause());
        assertEquals(RESPONSE_BODY, serviceException.getErrors().getError().get(0).getDescription());
    }

    private ApiException createApiExceptionExample() {
        ApiError apiError = new ApiError();
        Errors errors = new Errors();
        errors.setError(Collections.singletonList(new Error().description(RESPONSE_BODY)));
        apiError.setErrors(errors);
        return new ApiException(ERROR_MESSAGE, ERROR_CODE, Collections.emptyMap(), apiError.toJson());
    }
}