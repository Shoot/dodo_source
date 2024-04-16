package com.appsflyer.internal;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
/* loaded from: classes.dex */
public final class AFb1iSDK {
    @Nullable
    public static Application AFKeystoreWrapper;
    @NonNull
    public AFf1xSDK AFInAppEventParameterName;
    private boolean valueOf;

    public AFb1iSDK() {
    }

    public AFb1iSDK(boolean z, AFf1xSDK aFf1xSDK) {
        this.valueOf = z;
        this.AFInAppEventParameterName = aFf1xSDK;
    }

    public final boolean AFKeystoreWrapper() {
        return this.valueOf;
    }
}
