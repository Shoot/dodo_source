package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;
/* loaded from: classes3.dex */
public abstract class l1 {
    public static j1 a;

    public static synchronized j1 a() {
        j1 j1Var;
        synchronized (l1.class) {
            try {
                if (a == null) {
                    a = o1.c().b();
                }
                j1Var = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j1Var;
    }

    public static boolean b() {
        return o1.c().a();
    }

    public static void c() {
        if (a() != null && w0.b().a()) {
            a.a(-1);
        }
    }

    public static void a(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !w0.b().a()) {
            return;
        }
        if (i == 1 || i == 0) {
            a.a(i, str, linkedHashMap);
            return;
        }
        y.d("hmsSdk", "Data type no longer collects range.type: " + i);
    }

    @Deprecated
    public static void a(Context context, String str, String str2) {
        if (a() != null) {
            a.a(context, str, str2);
        }
    }
}
