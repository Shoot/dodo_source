package com.appsflyer.internal;
/* loaded from: classes.dex */
public final class AFe1bSDK extends AFa1sSDK {
    @Override // com.appsflyer.internal.AFa1sSDK
    public final boolean afInfoLog() {
        return true;
    }

    @Override // com.appsflyer.internal.AFa1sSDK
    public final AFd1wSDK values() {
        if (this.afDebugLog == 1) {
            return AFd1wSDK.CONVERSION;
        }
        return AFd1wSDK.LAUNCH;
    }
}
