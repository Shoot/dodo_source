package defpackage;
/* compiled from: MathUtils.java */
/* renamed from: ma6  reason: default package */
/* loaded from: classes2.dex */
public final class ma6 {
    public static float a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static float b(float f, float f2, float f3, float f4, float f5, float f6) {
        return d(a(f, f2, f3, f4), a(f, f2, f5, f4), a(f, f2, f5, f6), a(f, f2, f3, f6));
    }

    public static float c(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    private static float d(float f, float f2, float f3, float f4) {
        if (f <= f2 || f <= f3 || f <= f4) {
            if (f2 > f3 && f2 > f4) {
                return f2;
            }
            if (f3 > f4) {
                return f3;
            }
            return f4;
        }
        return f;
    }
}
