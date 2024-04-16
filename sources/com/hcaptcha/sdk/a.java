package com.hcaptcha.sdk;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
/* loaded from: classes.dex */
final class a {
    public static <T extends Parcelable> T a(Bundle bundle, String str, Class<T> cls) {
        Object parcelable;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundle.getParcelable(str, cls);
            return (T) parcelable;
        }
        return (T) bundle.getParcelable(str);
    }

    public static <T extends Serializable> T b(Bundle bundle, String str, Class<T> cls) {
        Serializable serializable;
        if (Build.VERSION.SDK_INT >= 33) {
            serializable = bundle.getSerializable(str, cls);
            return (T) serializable;
        }
        return (T) bundle.getSerializable(str);
    }
}
