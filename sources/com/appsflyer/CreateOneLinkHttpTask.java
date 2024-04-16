package com.appsflyer;

import android.support.annotation.WorkerThread;
import com.appsflyer.internal.AFc1mSDK;
import java.util.concurrent.ExecutorService;
@Deprecated
/* loaded from: classes.dex */
public final class CreateOneLinkHttpTask {
    public final ExecutorService AFInAppEventParameterName;
    public final AFc1mSDK AFInAppEventType;

    @Deprecated
    /* loaded from: classes.dex */
    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask() {
    }

    public CreateOneLinkHttpTask(AFc1mSDK aFc1mSDK, ExecutorService executorService) {
        this.AFInAppEventType = aFc1mSDK;
        this.AFInAppEventParameterName = executorService;
    }
}
