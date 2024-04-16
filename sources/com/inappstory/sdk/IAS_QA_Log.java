package com.inappstory.sdk;

import android.annotation.SuppressLint;
import com.inappstory.sdk.stories.api.models.logs.ApiLogRequest;
import com.inappstory.sdk.stories.api.models.logs.ApiLogResponse;
import com.inappstory.sdk.stories.api.models.logs.ExceptionLog;
import com.inappstory.sdk.stories.api.models.logs.WebConsoleLog;
@SuppressLint({"IAS debug api"})
/* loaded from: classes3.dex */
public interface IAS_QA_Log {
    void getApiRequestLog(ApiLogRequest apiLogRequest);

    void getApiRequestResponseLog(ApiLogRequest apiLogRequest, ApiLogResponse apiLogResponse);

    void getApiResponseLog(ApiLogResponse apiLogResponse);

    void getExceptionLog(ExceptionLog exceptionLog);

    void getWebConsoleLog(WebConsoleLog webConsoleLog);
}
