package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.NonNull;
/* compiled from: EdgeToEdgeUtils.java */
/* renamed from: yc3  reason: default package */
/* loaded from: classes2.dex */
public class yc3 {
    public static void a(@NonNull Window window, boolean z, Integer num, Integer num2) {
        boolean z2;
        boolean z3 = false;
        if (num != null && num.intValue() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        z3 = (num2 == null || num2.intValue() == 0) ? true : true;
        if (z2 || z3) {
            int b = ba6.b(window.getContext(), 16842801, -16777216);
            if (z2) {
                num = Integer.valueOf(b);
            }
            if (z3) {
                num2 = Integer.valueOf(b);
            }
        }
        w4c.b(window, !z);
        int c = c(window.getContext(), z);
        int b2 = b(window.getContext(), z);
        window.setStatusBarColor(c);
        window.setNavigationBarColor(b2);
        boolean d = d(c, ba6.f(num.intValue()));
        boolean d2 = d(b2, ba6.f(num2.intValue()));
        z5c a = w4c.a(window, window.getDecorView());
        if (a != null) {
            a.b(d);
            a.a(d2);
        }
    }

    @TargetApi(21)
    private static int b(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return qf1.p(ba6.b(context, 16843858, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return ba6.b(context, 16843858, -16777216);
    }

    @TargetApi(21)
    private static int c(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 23) {
            return qf1.p(ba6.b(context, 16843857, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return ba6.b(context, 16843857, -16777216);
    }

    private static boolean d(int i, boolean z) {
        if (!ba6.f(i) && (i != 0 || !z)) {
            return false;
        }
        return true;
    }
}
