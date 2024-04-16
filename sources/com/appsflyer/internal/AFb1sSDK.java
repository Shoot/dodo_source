package com.appsflyer.internal;
/* loaded from: classes.dex */
public final class AFb1sSDK {
    final String AFInAppEventParameterName;
    private final boolean AFKeystoreWrapper;
    final long values;

    public AFb1sSDK() {
    }

    public AFb1sSDK(String str, long j, boolean z) {
        this.AFInAppEventParameterName = str;
        this.values = j;
        this.AFKeystoreWrapper = z;
    }

    public final boolean AFInAppEventType() {
        return this.AFKeystoreWrapper;
    }
}
