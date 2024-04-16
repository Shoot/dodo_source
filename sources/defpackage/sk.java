package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* compiled from: AnimationUtils.java */
/* renamed from: sk  reason: default package */
/* loaded from: classes2.dex */
public class sk {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new bp3();
    public static final TimeInterpolator c = new ap3();
    public static final TimeInterpolator d = new eq5();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        if (f5 < f3) {
            return f;
        }
        if (f5 > f4) {
            return f2;
        }
        return a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
