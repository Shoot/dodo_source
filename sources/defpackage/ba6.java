package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: MaterialColors.java */
/* renamed from: ba6  reason: default package */
/* loaded from: classes2.dex */
public class ba6 {
    public static int a(int i, int i2) {
        return qf1.p(i, (Color.alpha(i) * i2) / 255);
    }

    public static int b(@NonNull Context context, int i, int i2) {
        TypedValue a = x96.a(context, i);
        if (a != null) {
            return a.data;
        }
        return i2;
    }

    public static int c(Context context, int i, String str) {
        return x96.d(context, i, str);
    }

    public static int d(@NonNull View view, int i) {
        return x96.e(view, i);
    }

    public static int e(@NonNull View view, int i, int i2) {
        return b(view.getContext(), i, i2);
    }

    public static boolean f(int i) {
        if (i != 0 && qf1.f(i) > 0.5d) {
            return true;
        }
        return false;
    }

    public static int g(int i, int i2) {
        return qf1.k(i2, i);
    }

    public static int h(int i, int i2, float f) {
        return g(i, qf1.p(i2, Math.round(Color.alpha(i2) * f)));
    }

    public static int i(@NonNull View view, int i, int i2, float f) {
        return h(d(view, i), d(view, i2), f);
    }
}
