package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
/* compiled from: ThemeUtils.java */
/* loaded from: classes.dex */
public class a0 {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    static final int[] b = {-16842910};
    static final int[] c = {16842908};
    static final int[] d = {16843518};
    static final int[] e = {16842919};
    static final int[] f = {16842912};
    static final int[] g = {16842913};
    static final int[] h = {-16842919, -16842908};
    static final int[] i = new int[0];
    private static final int[] j = new int[1];

    public static void a(@NonNull View view, @NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n29.A0);
        try {
            if (!obtainStyledAttributes.hasValue(n29.F0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(@NonNull Context context, int i2) {
        ColorStateList e2 = e(context, i2);
        if (e2 != null && e2.isStateful()) {
            return e2.getColorForState(b, e2.getDefaultColor());
        }
        TypedValue f2 = f();
        context.getTheme().resolveAttribute(16842803, f2, true);
        return d(context, i2, f2.getFloat());
    }

    public static int c(@NonNull Context context, int i2) {
        int[] iArr = j;
        iArr[0] = i2;
        e0 u = e0.u(context, null, iArr);
        try {
            return u.b(0, 0);
        } finally {
            u.w();
        }
    }

    static int d(@NonNull Context context, int i2, float f2) {
        int c2 = c(context, i2);
        return qf1.p(c2, Math.round(Color.alpha(c2) * f2));
    }

    public static ColorStateList e(@NonNull Context context, int i2) {
        int[] iArr = j;
        iArr[0] = i2;
        e0 u = e0.u(context, null, iArr);
        try {
            return u.c(0);
        } finally {
            u.w();
        }
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
