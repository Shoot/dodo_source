package com.appsflyer.internal;

import android.support.annotation.Nullable;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.net.MalformedURLException;
import java.net.URL;
/* loaded from: classes.dex */
public final class AFd1fSDK extends AFd1kSDK<String> {
    private final AFe1fSDK AFLogger;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AFd1fSDK(@android.support.annotation.NonNull com.appsflyer.internal.AFe1fSDK r8, @android.support.annotation.NonNull com.appsflyer.internal.AFc1xSDK r9) {
        /*
            r7 = this;
            com.appsflyer.internal.AFd1wSDK r0 = r8.afWarnLog
            if (r0 == 0) goto L6
        L4:
            r2 = r0
            goto L9
        L6:
            com.appsflyer.internal.AFd1wSDK r0 = com.appsflyer.internal.AFd1wSDK.CACHED_EVENT
            goto L4
        L9:
            r0 = 1
            com.appsflyer.internal.AFd1wSDK[] r3 = new com.appsflyer.internal.AFd1wSDK[r0]
            r0 = 0
            com.appsflyer.internal.AFd1wSDK r1 = com.appsflyer.internal.AFd1wSDK.RC_CDN
            r3[r0] = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.afErrorLog
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            java.lang.String r1 = values(r8)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = r8.afErrorLog
            r1 = r7
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.AFLogger = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1fSDK.<init>(com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFc1xSDK):void");
    }

    private static String values(AFe1fSDK aFe1fSDK) {
        try {
            return new URL(aFe1fSDK.AFLogger).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    protected final AFc1oSDK<String> AFInAppEventParameterName(String str) {
        String encodeToString = Base64.encodeToString(this.AFLogger.valueOf(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        ((AFd1kSDK) this).afInfoLog.valueOf(this.AFLogger.AFLogger, encodeToString);
        return this.afErrorLog.values(this.AFLogger);
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    protected final boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @Nullable
    protected final AppsFlyerRequestListener afErrorLog() {
        return this.AFLogger.AFInAppEventType;
    }
}
