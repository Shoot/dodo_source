package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class b {
    public static final int a = d.a;
    private static final b b = new b();

    @NonNull
    public static b f() {
        return b;
    }

    public int a(@NonNull Context context) {
        return d.a(context);
    }

    public Intent b(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            return lad.c("com.google.android.gms");
        } else if (context != null && z13.d(context)) {
            return lad.a();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(t8c.a(context).e(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return lad.b("com.google.android.gms", sb.toString());
        }
    }

    public PendingIntent c(@NonNull Context context, int i, int i2) {
        return d(context, i, i2, null);
    }

    public PendingIntent d(@NonNull Context context, int i, int i2, String str) {
        Intent b2 = b(context, i, str);
        if (b2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, b2, dvc.a | 134217728);
    }

    @NonNull
    public String e(int i) {
        return d.b(i);
    }

    public int g(@NonNull Context context) {
        return h(context, a);
    }

    public int h(@NonNull Context context, int i) {
        int f = d.f(context, i);
        if (d.g(context, f)) {
            return 18;
        }
        return f;
    }

    public boolean i(@NonNull Context context, @NonNull String str) {
        return d.k(context, str);
    }

    public boolean j(int i) {
        return d.i(i);
    }
}
