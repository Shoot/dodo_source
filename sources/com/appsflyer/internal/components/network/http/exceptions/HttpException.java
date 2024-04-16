package com.appsflyer.internal.components.network.http.exceptions;

import android.support.annotation.NonNull;
import com.appsflyer.internal.AFc1jSDK;
import java.io.IOException;
/* loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFc1jSDK AFInAppEventType;

    public HttpException(@NonNull Throwable th, @NonNull AFc1jSDK aFc1jSDK) {
        super(th.getMessage(), th);
        this.AFInAppEventType = aFc1jSDK;
    }

    @NonNull
    public AFc1jSDK getMetrics() {
        return this.AFInAppEventType;
    }
}
