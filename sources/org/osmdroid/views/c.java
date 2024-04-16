package org.osmdroid.views;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
/* compiled from: Projection.java */
/* loaded from: classes3.dex */
public class c implements os4 {
    private long a;
    private long b;
    private long c;
    private long d;
    private final Matrix e;
    private final Matrix f;
    private final float[] g;
    private final BoundingBox h;
    private final double i;
    private final Rect j;
    private final Rect k;
    private boolean l;
    private boolean m;
    private final double n;
    private final double o;
    private final float p;
    private final GeoPoint q;
    private final cgb r;
    private final int s;
    private final int t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(MapView mapView) {
        this(mapView.getZoomLevelDouble(), mapView.q(null), mapView.getExpectedCenter(), mapView.getMapScrollX(), mapView.getMapScrollY(), mapView.getMapOrientation(), mapView.v(), mapView.y(), MapView.getTileSystem(), mapView.getMapCenterOffsetX(), mapView.getMapCenterOffsetY());
    }

    public static long B(long j, long j2, double d, int i, int i2) {
        long j3;
        while (true) {
            j3 = j2 - j;
            if (j3 >= 0) {
                break;
            }
            j2 = (long) (j2 + d);
        }
        if (j3 < i - (i2 * 2)) {
            long j4 = j3 / 2;
            long j5 = i / 2;
            long j6 = (j5 - j4) - j;
            if (j6 > 0) {
                return j6;
            }
            long j7 = (j5 + j4) - j2;
            if (j7 >= 0) {
                return 0L;
            }
            return j7;
        }
        long j8 = i2 - j;
        if (j8 < 0) {
            return j8;
        }
        long j9 = (i - i2) - j2;
        if (j9 <= 0) {
            return 0L;
        }
        return j9;
    }

    private void D() {
        f(z(), A(), this.q);
        float f = this.p;
        if (f != 0.0f && f != 180.0f) {
            ue4.c(this.k, z(), A(), this.p, this.j);
        } else {
            Rect rect = this.j;
            Rect rect2 = this.k;
            rect.left = rect2.left;
            rect.top = rect2.top;
            rect.right = rect2.right;
            rect.bottom = rect2.bottom;
        }
        Rect rect3 = this.j;
        GeoPoint g = g(rect3.right, rect3.top, null, true);
        cgb tileSystem = MapView.getTileSystem();
        if (g.b() > tileSystem.s()) {
            g = new GeoPoint(tileSystem.s(), g.c());
        }
        if (g.b() < tileSystem.z()) {
            g = new GeoPoint(tileSystem.z(), g.c());
        }
        Rect rect4 = this.j;
        GeoPoint g2 = g(rect4.left, rect4.bottom, null, true);
        if (g2.b() > tileSystem.s()) {
            g2 = new GeoPoint(tileSystem.s(), g2.c());
        }
        if (g2.b() < tileSystem.z()) {
            g2 = new GeoPoint(tileSystem.z(), g2.c());
        }
        this.h.s(g.b(), g.c(), g2.b(), g2.c());
    }

    private Point d(int i, int i2, Point point, Matrix matrix, boolean z) {
        if (point == null) {
            point = new Point();
        }
        if (z) {
            float[] fArr = this.g;
            fArr[0] = i;
            fArr[1] = i2;
            matrix.mapPoints(fArr);
            float[] fArr2 = this.g;
            point.x = (int) fArr2[0];
            point.y = (int) fArr2[1];
        } else {
            point.x = i;
            point.y = i2;
        }
        return point;
    }

    private long j(long j, int i, int i2, double d) {
        long j2 = (i + i2) / 2;
        long j3 = i;
        long j4 = 0;
        if (j < j3) {
            while (j < j3) {
                long j5 = j;
                j = (long) (j + d);
                j4 = j5;
            }
            if (j < i2) {
                return j;
            }
            if (Math.abs(j2 - j) < Math.abs(j2 - j4)) {
                return j;
            }
            return j4;
        }
        while (j >= j3) {
            long j6 = j;
            j = (long) (j - d);
            j4 = j6;
        }
        if (j4 < i2) {
            return j4;
        }
        if (Math.abs(j2 - j) < Math.abs(j2 - j4)) {
            return j;
        }
        return j4;
    }

    private long m(long j, boolean z, long j2, int i, int i2) {
        long j3 = j + j2;
        if (z) {
            return j(j3, i, i2, this.n);
        }
        return j3;
    }

    private long p(long j, boolean z) {
        long j2 = this.a;
        Rect rect = this.k;
        return m(j, z, j2, rect.left, rect.right);
    }

    private long s(long j, boolean z) {
        long j2 = this.b;
        Rect rect = this.k;
        return m(j, z, j2, rect.top, rect.bottom);
    }

    public int A() {
        Rect rect = this.k;
        return ((rect.bottom + rect.top) / 2) + this.t;
    }

    public double C() {
        return this.i;
    }

    public void E(Canvas canvas, boolean z) {
        if (this.p != 0.0f || z) {
            canvas.restore();
        }
    }

    public Point F(int i, int i2, Point point) {
        boolean z;
        Matrix matrix = this.e;
        if (this.p != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        return d(i, i2, point, matrix, z);
    }

    public void G(Canvas canvas, boolean z, boolean z2) {
        Matrix matrix;
        if (this.p != 0.0f || z2) {
            canvas.save();
            if (z) {
                matrix = this.e;
            } else {
                matrix = this.f;
            }
            canvas.concat(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H(MapView mapView) {
        if (mapView.getMapScrollX() == this.c && mapView.getMapScrollY() == this.d) {
            return false;
        }
        mapView.I(this.c, this.d);
        return true;
    }

    public gd8 I(int i, int i2, gd8 gd8Var) {
        if (gd8Var == null) {
            gd8Var = new gd8();
        }
        gd8Var.a = i(v(i), this.l);
        gd8Var.b = i(w(i2), this.m);
        return gd8Var;
    }

    public Point J(vr4 vr4Var, Point point) {
        return K(vr4Var, point, false);
    }

    public Point K(vr4 vr4Var, Point point, boolean z) {
        if (point == null) {
            point = new Point();
        }
        point.x = cgb.P(o(vr4Var.c(), z));
        point.y = cgb.P(r(vr4Var.b(), z));
        return point;
    }

    public Point L(int i, int i2, Point point) {
        boolean z;
        Matrix matrix = this.f;
        if (this.p != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        return d(i, i2, point, matrix, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(double d, double d2, boolean z, int i) {
        long j;
        long j2 = 0;
        if (z) {
            j = B(q(d), q(d2), this.n, this.k.height(), i);
        } else {
            j = 0;
            j2 = B(n(d), n(d2), this.n, this.k.width(), i);
        }
        b(j2, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(long j, long j2) {
        if (j == 0 && j2 == 0) {
            return;
        }
        this.a += j;
        this.b += j2;
        this.c -= j;
        this.d -= j2;
        D();
    }

    public void c(vr4 vr4Var, PointF pointF) {
        if (pointF == null || vr4Var == null) {
            return;
        }
        Point L = L((int) pointF.x, (int) pointF.y, null);
        Point J = J(vr4Var, null);
        b(L.x - J.x, L.y - J.y);
    }

    public vr4 f(int i, int i2, GeoPoint geoPoint) {
        return g(i, i2, geoPoint, false);
    }

    public vr4 g(int i, int i2, GeoPoint geoPoint, boolean z) {
        boolean z2;
        boolean z3;
        cgb cgbVar = this.r;
        long i3 = i(v(i), this.l);
        long i4 = i(w(i2), this.m);
        double d = this.n;
        if (!this.l && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!this.m && !z) {
            z3 = false;
        } else {
            z3 = true;
        }
        return cgbVar.k(i3, i4, d, geoPoint, z2, z3);
    }

    public BoundingBox h() {
        return this.h;
    }

    public long i(long j, boolean z) {
        return this.r.i(j, this.n, z);
    }

    public GeoPoint k() {
        return this.q;
    }

    public Matrix l() {
        return this.f;
    }

    public long n(double d) {
        return p(this.r.x(d, this.n, false), false);
    }

    public long o(double d, boolean z) {
        boolean z2;
        cgb cgbVar = this.r;
        double d2 = this.n;
        if (!this.l && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        return p(cgbVar.x(d, d2, z2), this.l);
    }

    public long q(double d) {
        return s(this.r.y(d, this.n, false), false);
    }

    public long r(double d, boolean z) {
        boolean z2;
        cgb cgbVar = this.r;
        double d2 = this.n;
        if (!this.m && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        return s(cgbVar.y(d, d2, z2), this.m);
    }

    public long t(int i) {
        return cgb.v(i, this.o);
    }

    public p99 u(p99 p99Var) {
        if (p99Var == null) {
            p99Var = new p99();
        }
        Rect rect = this.k;
        int i = rect.left;
        float f = i;
        int i2 = rect.right;
        float f2 = i2;
        int i3 = rect.top;
        float f3 = i3;
        int i4 = rect.bottom;
        float f4 = i4;
        if (this.p != 0.0f) {
            float[] fArr = {i, i3, i2, i4, i, i4, i2, i3};
            this.f.mapPoints(fArr);
            for (int i5 = 0; i5 < 8; i5 += 2) {
                float f5 = fArr[i5];
                if (f > f5) {
                    f = f5;
                }
                if (f2 < f5) {
                    f2 = f5;
                }
                float f6 = fArr[i5 + 1];
                if (f3 > f6) {
                    f3 = f6;
                }
                if (f4 < f6) {
                    f4 = f6;
                }
            }
        }
        p99Var.a = v((int) f);
        p99Var.b = w((int) f3);
        p99Var.c = v((int) f2);
        p99Var.d = w((int) f4);
        return p99Var;
    }

    public long v(int i) {
        return i - this.a;
    }

    public long w(int i) {
        return i - this.b;
    }

    public float x() {
        return this.p;
    }

    public Rect y(int i, int i2, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        rect.left = cgb.P(p(t(i), false));
        rect.top = cgb.P(s(t(i2), false));
        rect.right = cgb.P(p(t(i + 1), false));
        rect.bottom = cgb.P(s(t(i2 + 1), false));
        return rect;
    }

    public int z() {
        Rect rect = this.k;
        return ((rect.right + rect.left) / 2) + this.s;
    }

    public c(double d, Rect rect, GeoPoint geoPoint, long j, long j2, float f, boolean z, boolean z2, cgb cgbVar, int i, int i2) {
        Matrix matrix = new Matrix();
        this.e = matrix;
        Matrix matrix2 = new Matrix();
        this.f = matrix2;
        this.g = new float[2];
        this.h = new BoundingBox();
        this.j = new Rect();
        this.q = new GeoPoint(0.0d, 0.0d);
        this.s = i;
        this.t = i2;
        this.i = d;
        this.l = z;
        this.m = z2;
        this.r = cgbVar;
        double e = cgb.e(d);
        this.n = e;
        this.o = cgb.D(d);
        this.k = rect;
        GeoPoint geoPoint2 = geoPoint != null ? geoPoint : new GeoPoint(0.0d, 0.0d);
        this.c = j;
        this.d = j2;
        this.a = (z() - this.c) - cgbVar.x(geoPoint2.c(), e, this.l);
        this.b = (A() - this.d) - cgbVar.y(geoPoint2.b(), e, this.m);
        this.p = f;
        matrix.preRotate(f, z(), A());
        matrix.invert(matrix2);
        D();
    }

    public void e() {
    }

    public c(double d, int i, int i2, GeoPoint geoPoint, float f, boolean z, boolean z2, int i3, int i4) {
        this(d, new Rect(0, 0, i, i2), geoPoint, 0L, 0L, f, z, z2, MapView.getTileSystem(), i3, i4);
    }
}
