package com.appsflyer.attribution;

import android.support.annotation.NonNull;
/* loaded from: classes.dex */
public interface AppsFlyerRequestListener {
    void onError(int i, @NonNull String str);

    void onSuccess();
}
