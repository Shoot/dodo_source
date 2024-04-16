package com.appsflyer.internal;

import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class AFd1kSDK<Result> extends AFd1tSDK<AFc1dSDK<Result>> {
    private AFa1lSDK AFLogger;
    @Nullable
    public AFc1dSDK<Result> afDebugLog;
    protected final AFc1pSDK afErrorLog;
    @Nullable
    private String afErrorLogForExcManagerOnly;
    protected final AFb1uSDK afInfoLog;
    public final AFe1xSDK afRDLog;

    private AFd1kSDK(@NonNull AFd1wSDK aFd1wSDK, @NonNull AFd1wSDK[] aFd1wSDKArr, @NonNull AFc1pSDK aFc1pSDK, @NonNull AFe1xSDK aFe1xSDK, @NonNull AFb1uSDK aFb1uSDK, @NonNull AFa1lSDK aFa1lSDK, @Nullable String str) {
        super(aFd1wSDK, aFd1wSDKArr, str);
        this.afErrorLog = aFc1pSDK;
        this.afRDLog = aFe1xSDK;
        this.afInfoLog = aFb1uSDK;
        this.AFLogger = aFa1lSDK;
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    @CallSuper
    @NonNull
    public AFc1aSDK AFInAppEventParameterName() throws Exception {
        if (getLevel() && this.afRDLog.AFKeystoreWrapper()) {
            AppsFlyerRequestListener afErrorLog = afErrorLog();
            if (afErrorLog != null) {
                afErrorLog.onError(RequestError.STOP_TRACKING, AFb1dSDK.AFInAppEventParameterName);
            }
            throw new AFd1pSDK();
        }
        String str = this.afRDLog.AFInAppEventType;
        if (str != null && !str.trim().isEmpty()) {
            AFc1oSDK<Result> AFInAppEventParameterName = AFInAppEventParameterName(str);
            if (AFLogger()) {
                values(AFInAppEventParameterName.AFKeystoreWrapper);
            }
            AFc1dSDK<Result> values = AFInAppEventParameterName.values();
            this.afDebugLog = values;
            this.afInfoLog.AFInAppEventType(AFInAppEventParameterName.AFKeystoreWrapper.values(), values.getStatusCode(), values.getBody().toString());
            AppsFlyerRequestListener afErrorLog2 = afErrorLog();
            if (afErrorLog2 != null) {
                if (values.isSuccessful()) {
                    afErrorLog2.onSuccess();
                } else {
                    int i = RequestError.RESPONSE_CODE_FAILURE;
                    StringBuilder sb = new StringBuilder();
                    sb.append(AFb1dSDK.values);
                    sb.append(" ");
                    sb.append(values.getStatusCode());
                    afErrorLog2.onError(i, sb.toString());
                }
            }
            if (values.isSuccessful()) {
                return AFc1aSDK.SUCCESS;
            }
            return AFc1aSDK.FAILURE;
        }
        AppsFlyerRequestListener afErrorLog3 = afErrorLog();
        if (afErrorLog3 != null) {
            afErrorLog3.onError(RequestError.NO_DEV_KEY, AFb1dSDK.AFKeystoreWrapper);
        }
        throw new AFd1uSDK();
    }

    @WorkerThread
    protected abstract AFc1oSDK<Result> AFInAppEventParameterName(@NonNull String str);

    @Override // com.appsflyer.internal.AFd1tSDK
    public long AFInAppEventType() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    @CallSuper
    public void AFKeystoreWrapper() {
        String str;
        if (this.AFInAppEventType == AFc1aSDK.SUCCESS) {
            String str2 = this.afErrorLogForExcManagerOnly;
            if (str2 != null) {
                this.AFLogger.AFInAppEventType(str2);
            }
        } else if (!valueOf() && (str = this.afErrorLogForExcManagerOnly) != null) {
            this.AFLogger.AFInAppEventType(str);
        }
    }

    protected abstract boolean AFLogger();

    @Nullable
    protected abstract AppsFlyerRequestListener afErrorLog();

    protected boolean getLevel() {
        return true;
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    public boolean valueOf() {
        if (afDebugLog() instanceof AFd1pSDK) {
            return false;
        }
        if (this.AFInAppEventType == AFc1aSDK.TIMEOUT) {
            return true;
        }
        Throwable afDebugLog = afDebugLog();
        if (!(afDebugLog instanceof IOException) || (afDebugLog instanceof ParsingException)) {
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    public final void values() {
        String str;
        super.values();
        if (!AFLogger() || (str = this.afRDLog.AFInAppEventType) == null || str.trim().isEmpty()) {
            return;
        }
        values(AFInAppEventParameterName(str).AFKeystoreWrapper);
    }

    public AFd1kSDK(@NonNull AFd1wSDK aFd1wSDK, @NonNull AFd1wSDK[] aFd1wSDKArr, @NonNull AFc1xSDK aFc1xSDK, @Nullable String str) {
        this(aFd1wSDK, aFd1wSDKArr, aFc1xSDK.AFKeystoreWrapper(), aFc1xSDK.AFVersionDeclaration(), aFc1xSDK.AFLogger$LogLevel(), aFc1xSDK.afWarnLog(), str);
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    @CallSuper
    public final void AFInAppEventType(Throwable th) {
        AFLogger.afErrorLog("Error while sending request to server: ".concat(String.valueOf(th)), th, true);
        AppsFlyerRequestListener afErrorLog = afErrorLog();
        if (afErrorLog != null) {
            String message = th.getMessage();
            int i = RequestError.NETWORK_FAILURE;
            if (message == null) {
                message = "";
            }
            afErrorLog.onError(i, message);
        }
    }

    public AFd1kSDK(@NonNull AFd1wSDK aFd1wSDK, @NonNull AFd1wSDK[] aFd1wSDKArr, @NonNull AFc1xSDK aFc1xSDK, @Nullable String str, @Nullable String str2) {
        this(aFd1wSDK, aFd1wSDKArr, aFc1xSDK.AFKeystoreWrapper(), aFc1xSDK.AFVersionDeclaration(), aFc1xSDK.AFLogger$LogLevel(), aFc1xSDK.afWarnLog(), str);
        this.afErrorLogForExcManagerOnly = str2;
    }

    @WorkerThread
    private void values(AFc1sSDK aFc1sSDK) {
        String str = this.afErrorLogForExcManagerOnly;
        this.afErrorLogForExcManagerOnly = this.AFLogger.values(new AFc1rSDK(aFc1sSDK.values(), aFc1sSDK.AFInAppEventType(), "6.10.0", this.AFKeystoreWrapper));
        if (str != null) {
            this.AFLogger.AFInAppEventType(str);
        }
    }
}
