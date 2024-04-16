package defpackage;

import android.graphics.Rect;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
/* compiled from: TileSystem.java */
/* renamed from: cgb  reason: default package */
/* loaded from: classes3.dex */
public abstract class cgb {
    private static int a = 256;
    private static int b = 29;

    public static int B(long j, double d) {
        return pr6.b(j / d);
    }

    public static Rect C(p99 p99Var, double d, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        rect.left = B(p99Var.a, d);
        rect.top = B(p99Var.b, d);
        rect.right = B(p99Var.c, d);
        rect.bottom = B(p99Var.d, d);
        return rect;
    }

    public static double D(double d) {
        return e(d - l(d));
    }

    public static int E() {
        return a;
    }

    public static void M(int i) {
        b = Math.min(29, 62 - ((int) ((Math.log(i) / Math.log(2.0d)) + 0.5d)));
        a = i;
    }

    public static int P(long j) {
        return (int) Math.max(Math.min(j, 2147483647L), -2147483648L);
    }

    private static double Q(double d, double d2, double d3, double d4) {
        if (d2 <= d3) {
            if (d4 <= (d3 - d2) + 1.0d) {
                while (d < d2) {
                    d += d4;
                }
                while (d > d3) {
                    d -= d4;
                }
                return d;
            }
            throw new IllegalArgumentException("interval must be equal or smaller than maxValue-minValue: min: " + d2 + " max:" + d3 + " int:" + d4);
        }
        throw new IllegalArgumentException("minValue must be smaller than maxValue: " + d2 + ">" + d3);
    }

    public static double a(double d, double d2, double d3) {
        return Math.min(Math.max(d, d2), d3);
    }

    public static long b(double d, double d2, boolean z) {
        long c = pr6.c(d);
        if (!z) {
            return c;
        }
        if (c <= 0) {
            return 0L;
        }
        long c2 = pr6.c(d2 - 1.0d);
        if (c >= d2) {
            return c2;
        }
        return c;
    }

    public static double c(double d, double d2) {
        return d(Q(d, -90.0d, 90.0d, 180.0d), e(d2));
    }

    public static double d(double d, double d2) {
        return (((Math.cos((a(d, -90.0d, 90.0d) * 3.141592653589793d) / 180.0d) * 2.0d) * 3.141592653589793d) * 6378137.0d) / d2;
    }

    public static double e(double d) {
        return E() * j(d);
    }

    public static double j(double d) {
        return Math.pow(2.0d, d);
    }

    public static int l(double d) {
        return pr6.b(d);
    }

    public static int u() {
        return b;
    }

    public static long v(int i, double d) {
        return Math.round(i * d);
    }

    public abstract double A();

    public abstract double F(double d);

    public double G(double d, boolean z) {
        if (z) {
            d = a(d, A(), t());
        }
        double F = F(d);
        if (z) {
            return a(F, 0.0d, 1.0d);
        }
        return F;
    }

    public double H(long j, double d, boolean z) {
        double d2 = j;
        if (z) {
            return a(d2 / d, 0.0d, 1.0d);
        }
        return d2 / d;
    }

    public abstract double I(double d);

    public double J(double d, boolean z) {
        if (z) {
            d = a(d, z(), s());
        }
        double I = I(d);
        if (z) {
            return a(I, 0.0d, 1.0d);
        }
        return I;
    }

    public boolean K(double d) {
        if (d >= z() && d <= s()) {
            return true;
        }
        return false;
    }

    public boolean L(double d) {
        if (d >= A() && d <= t()) {
            return true;
        }
        return false;
    }

    public String N() {
        return "[" + z() + "," + s() + "]";
    }

    public String O() {
        return "[" + A() + "," + t() + "]";
    }

    public double f(double d) {
        return a(d, z(), s());
    }

    public double g(double d) {
        while (d < -180.0d) {
            d += 360.0d;
        }
        double d2 = d;
        while (d2 > 180.0d) {
            d2 -= 360.0d;
        }
        return a(d2, A(), t());
    }

    public double h(BoundingBox boundingBox, int i, int i2) {
        double r = r(boundingBox.n(), boundingBox.o(), i);
        double o = o(boundingBox.k(), boundingBox.l(), i2);
        if (r == Double.MIN_VALUE) {
            return o;
        }
        if (o == Double.MIN_VALUE) {
            return r;
        }
        return Math.min(o, r);
    }

    public long i(long j, double d, boolean z) {
        double d2;
        if (z) {
            d2 = Q(j, 0.0d, d, d);
        } else {
            d2 = j;
        }
        return b(d2, d, z);
    }

    public GeoPoint k(long j, long j2, double d, GeoPoint geoPoint, boolean z, boolean z2) {
        if (geoPoint == null) {
            geoPoint = new GeoPoint(0.0d, 0.0d);
        }
        geoPoint.f(n(H(j2, d, z2), z2));
        geoPoint.i(q(H(j, d, z), z));
        return geoPoint;
    }

    public abstract double m(double d);

    public double n(double d, boolean z) {
        if (z) {
            d = a(d, 0.0d, 1.0d);
        }
        double m = m(d);
        if (z) {
            return a(m, z(), s());
        }
        return m;
    }

    public double o(double d, double d2, int i) {
        double J = J(d2, true) - J(d, true);
        if (J <= 0.0d) {
            return Double.MIN_VALUE;
        }
        return Math.log((i / J) / E()) / Math.log(2.0d);
    }

    public abstract double p(double d);

    public double q(double d, boolean z) {
        if (z) {
            d = a(d, 0.0d, 1.0d);
        }
        double p = p(d);
        if (z) {
            return a(p, A(), t());
        }
        return p;
    }

    public double r(double d, double d2, int i) {
        double G = G(d, true) - G(d2, true);
        if (G < 0.0d) {
            G += 1.0d;
        }
        if (G == 0.0d) {
            return Double.MIN_VALUE;
        }
        return Math.log((i / G) / E()) / Math.log(2.0d);
    }

    public abstract double s();

    public abstract double t();

    public long w(double d, double d2, boolean z) {
        return b(d * d2, d2, z);
    }

    public long x(double d, double d2, boolean z) {
        return w(G(d, z), d2, z);
    }

    public long y(double d, double d2, boolean z) {
        return w(J(d, z), d2, z);
    }

    public abstract double z();
}
