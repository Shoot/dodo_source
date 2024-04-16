package com.appsflyer.internal;

import android.support.annotation.Nullable;
/* loaded from: classes.dex */
public final class AFe1fSDK extends AFa1sSDK {
    @Nullable
    public final AFd1wSDK afWarnLog;

    @Deprecated
    public AFe1fSDK() {
        this.afWarnLog = null;
    }

    @Override // com.appsflyer.internal.AFa1sSDK
    public final AFd1wSDK values() {
        AFd1wSDK aFd1wSDK = this.afWarnLog;
        if (aFd1wSDK != null) {
            return aFd1wSDK;
        }
        return AFd1wSDK.CACHED_EVENT;
    }

    public AFe1fSDK(String str, byte[] bArr, String str2, @Nullable AFd1wSDK aFd1wSDK) {
        super(null, str, Boolean.FALSE, null);
        this.afErrorLog = str2;
        AFInAppEventParameterName(bArr);
        this.afWarnLog = aFd1wSDK;
    }
}
