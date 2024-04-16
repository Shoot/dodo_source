package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class AFc1oSDK<ResponseBody> {
    private final ExecutorService AFInAppEventParameterName;
    private final AtomicBoolean AFInAppEventType = new AtomicBoolean(false);
    public final AFc1sSDK AFKeystoreWrapper;
    private final AFc1mSDK valueOf;
    private final AFc1hSDK<ResponseBody> values;

    public AFc1oSDK(AFc1sSDK aFc1sSDK, ExecutorService executorService, AFc1mSDK aFc1mSDK, AFc1hSDK<ResponseBody> aFc1hSDK) {
        this.AFKeystoreWrapper = aFc1sSDK;
        this.AFInAppEventParameterName = executorService;
        this.valueOf = aFc1mSDK;
        this.values = aFc1hSDK;
    }

    public final AFc1dSDK<ResponseBody> values() throws IOException {
        if (!this.AFInAppEventType.getAndSet(true)) {
            AFc1dSDK<String> AFInAppEventParameterName = this.valueOf.AFInAppEventParameterName(this.AFKeystoreWrapper);
            try {
                return new AFc1dSDK<>(this.values.values(AFInAppEventParameterName.getBody()), AFInAppEventParameterName.AFInAppEventParameterName, AFInAppEventParameterName.values, AFInAppEventParameterName.valueOf, AFInAppEventParameterName.AFInAppEventType);
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e);
                throw new ParsingException(e.getMessage(), e, AFInAppEventParameterName);
            }
        }
        throw new IllegalStateException("Http call is already executed");
    }
}
