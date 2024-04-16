package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.InterruptedIOException;
/* loaded from: classes.dex */
public final class AFd1cSDK extends AFd1tSDK<AFd1aSDK> {
    private final AFb1fSDK AFLogger;
    private final AFc1pSDK AFLogger$LogLevel;
    private final AFe1wSDK AFVersionDeclaration;
    public AFb1kSDK afDebugLog;
    @Nullable
    public final AFd1dSDK afErrorLog;
    private final AFe1xSDK afErrorLogForExcManagerOnly;
    private final AFe1zSDK afInfoLog;
    @Nullable
    public AFd1aSDK afRDLog;
    private final String afWarnLog;
    private final AFe1uSDK getLevel;

    public AFd1cSDK(@NonNull AFe1zSDK aFe1zSDK, @NonNull AFb1fSDK aFb1fSDK, @NonNull AFe1xSDK aFe1xSDK, @NonNull AFe1wSDK aFe1wSDK, @NonNull AFc1pSDK aFc1pSDK, @NonNull AFe1uSDK aFe1uSDK, @NonNull String str, @Nullable AFd1dSDK aFd1dSDK) {
        super(AFd1wSDK.RC_CDN, new AFd1wSDK[0], "UpdateRemoteConfiguration");
        this.afRDLog = null;
        this.afInfoLog = aFe1zSDK;
        this.AFLogger = aFb1fSDK;
        this.afErrorLogForExcManagerOnly = aFe1xSDK;
        this.AFVersionDeclaration = aFe1wSDK;
        this.AFLogger$LogLevel = aFc1pSDK;
        this.getLevel = aFe1uSDK;
        this.afWarnLog = str;
        this.afErrorLog = aFd1dSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.appsflyer.internal.AFd1aSDK afErrorLog() throws java.lang.InterruptedException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1cSDK.afErrorLog():com.appsflyer.internal.AFd1aSDK");
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    @NonNull
    public final AFc1aSDK AFInAppEventParameterName() throws Exception {
        try {
            AFd1aSDK afErrorLog = afErrorLog();
            this.afRDLog = afErrorLog;
            if (afErrorLog == AFd1aSDK.FAILURE) {
                return AFc1aSDK.FAILURE;
            }
            return AFc1aSDK.SUCCESS;
        } catch (InterruptedIOException | InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("RC update config failed", e);
            this.afRDLog = AFd1aSDK.FAILURE;
            return AFc1aSDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    public final long AFInAppEventType() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFd1tSDK
    public final boolean valueOf() {
        return false;
    }

    private void valueOf(String str, long j, AFf1xSDK aFf1xSDK, @Nullable String str2, @Nullable AFc1dSDK<AFb1oSDK> aFc1dSDK) {
        AFInAppEventParameterName(str, j, aFc1dSDK, aFc1dSDK != null ? aFc1dSDK.getBody() : null, aFf1xSDK, str2 != null ? str2 : null, null);
    }

    private void AFInAppEventParameterName(String str, long j, @Nullable AFc1dSDK<?> aFc1dSDK, AFb1oSDK aFb1oSDK, AFf1xSDK aFf1xSDK, @Nullable String str2, @Nullable Throwable th) {
        long j2;
        int i;
        Throwable th2;
        long j3;
        if (aFc1dSDK != null) {
            j2 = aFc1dSDK.AFInAppEventType.values;
            i = aFc1dSDK.getStatusCode();
        } else {
            j2 = 0;
            i = 0;
        }
        if (th instanceof HttpException) {
            th2 = th.getCause();
            j3 = ((HttpException) th).getMetrics().values;
        } else {
            th2 = th;
            j3 = j2;
        }
        this.afDebugLog = new AFb1kSDK(aFb1oSDK != null ? aFb1oSDK.AFInAppEventType : null, str, j3, System.currentTimeMillis() - j, i, aFf1xSDK, str2, th2);
    }
}
