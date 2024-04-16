package defpackage;
/* compiled from: MyMath.java */
/* renamed from: pr6  reason: default package */
/* loaded from: classes3.dex */
public class pr6 {
    public static double a(double d) {
        while (d < 0.0d) {
            d += 360.0d;
        }
        while (d >= 360.0d) {
            d -= 360.0d;
        }
        return d;
    }

    public static int b(double d) {
        int i = (int) d;
        if (i <= d) {
            return i;
        }
        return i - 1;
    }

    public static long c(double d) {
        long j = (long) d;
        if (j <= d) {
            return j;
        }
        return j - 1;
    }

    public static double d(double d, double d2, Boolean bool) {
        double a = a(d2 - d);
        if (bool != null) {
            if (bool.booleanValue()) {
                return a;
            }
            return a - 360.0d;
        } else if (a < 180.0d) {
            return a;
        } else {
            return a - 360.0d;
        }
    }

    public static int e(float f) {
        int i = 1;
        int i2 = 0;
        int i3 = 1;
        while (i3 <= f) {
            i3 *= 2;
            i2 = i;
            i++;
        }
        return i2;
    }

    public static int f(int i, int i2) {
        if (i > 0) {
            return i % i2;
        }
        while (i < 0) {
            i += i2;
        }
        return i;
    }
}
