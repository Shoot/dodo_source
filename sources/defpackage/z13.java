package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.gms.common.d;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: z13  reason: default package */
/* loaded from: classes2.dex */
public final class z13 {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;

    public static boolean a(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (d == null) {
            boolean z = false;
            if (ad8.h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            d = Boolean.valueOf(z);
        }
        return d.booleanValue();
    }

    public static boolean b() {
        int i = d.a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    public static boolean c(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (a == null) {
            boolean z = false;
            if (ad8.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            a = Boolean.valueOf(z);
        }
        return a.booleanValue();
    }

    @TargetApi(26)
    public static boolean d(@NonNull Context context) {
        if (!c(context) || ad8.g()) {
            if (e(context)) {
                if (!ad8.h() || ad8.k()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @TargetApi(21)
    public static boolean e(@NonNull Context context) {
        if (b == null) {
            boolean z = false;
            if (ad8.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static boolean f(@NonNull Context context) {
        if (c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            c = Boolean.valueOf(z);
        }
        return c.booleanValue();
    }
}
