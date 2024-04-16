package com.huawei.hms.aaid.encrypt;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.opendevice.c;
/* loaded from: classes.dex */
public class PushEncrypter {
    public static String decrypter(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return o9.f(str, c.b(context));
    }

    public static String encrypter(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return o9.j(str, c.b(context));
    }

    public static String encrypterOld(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return o9.k(str, c.a(context));
    }
}
