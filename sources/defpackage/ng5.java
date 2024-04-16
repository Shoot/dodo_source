package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.xb5;
import java.io.IOException;
import java.lang.ref.WeakReference;
/* compiled from: KeyframeParser.java */
/* renamed from: ng5  reason: default package */
/* loaded from: classes.dex */
class ng5 {
    private static cra<WeakReference<Interpolator>> b;
    private static final Interpolator a = new LinearInterpolator();
    static xb5.a c = xb5.a.a("t", Image.TYPE_SMALL, e.a, "o", "i", Image.TYPE_HIGH, RemoteMessageConst.TO, "ti");
    static xb5.a d = xb5.a.a("x", "y");

    ng5() {
    }

    private static WeakReference<Interpolator> a(int i) {
        WeakReference<Interpolator> g;
        synchronized (ng5.class) {
            g = g().g(i);
        }
        return g;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolator;
        Interpolator linearInterpolator;
        pointF.x = ql6.b(pointF.x, -1.0f, 1.0f);
        pointF.y = ql6.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = ql6.b(pointF2.x, -1.0f, 1.0f);
        float b2 = ql6.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b2;
        int i = fvb.i(pointF.x, pointF.y, pointF2.x, b2);
        WeakReference<Interpolator> a2 = a(i);
        if (a2 != null) {
            interpolator = a2.get();
        } else {
            interpolator = null;
        }
        if (a2 == null || interpolator == null) {
            try {
                linearInterpolator = tr7.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = tr7.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            try {
                h(i, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> lg5<T> c(xb5 xb5Var, ez5 ez5Var, float f, jwb<T> jwbVar, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return e(ez5Var, xb5Var, f, jwbVar);
        }
        if (z) {
            return d(ez5Var, xb5Var, f, jwbVar);
        }
        return f(xb5Var, f, jwbVar);
    }

    private static <T> lg5<T> d(ez5 ez5Var, xb5 xb5Var, float f, jwb<T> jwbVar) throws IOException {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t;
        xb5Var.c();
        PointF pointF = null;
        PointF pointF2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = 0.0f;
        while (xb5Var.j()) {
            switch (xb5Var.u(c)) {
                case 0:
                    f2 = (float) xb5Var.l();
                    break;
                case 1:
                    t3 = jwbVar.a(xb5Var, f);
                    break;
                case 2:
                    t2 = jwbVar.a(xb5Var, f);
                    break;
                case 3:
                    pointF = wc5.e(xb5Var, 1.0f);
                    break;
                case 4:
                    pointF2 = wc5.e(xb5Var, 1.0f);
                    break;
                case 5:
                    if (xb5Var.m() == 1) {
                        z = true;
                        break;
                    } else {
                        z = false;
                        break;
                    }
                case 6:
                    pointF3 = wc5.e(xb5Var, f);
                    break;
                case 7:
                    pointF4 = wc5.e(xb5Var, f);
                    break;
                default:
                    xb5Var.y();
                    break;
            }
        }
        xb5Var.i();
        if (z) {
            interpolator2 = a;
            t = t3;
        } else {
            if (pointF != null && pointF2 != null) {
                interpolator = b(pointF, pointF2);
            } else {
                interpolator = a;
            }
            interpolator2 = interpolator;
            t = t2;
        }
        lg5<T> lg5Var = new lg5<>(ez5Var, t3, t, interpolator2, f2, null);
        lg5Var.o = pointF3;
        lg5Var.p = pointF4;
        return lg5Var;
    }

    private static <T> lg5<T> e(ez5 ez5Var, xb5 xb5Var, float f, jwb<T> jwbVar) throws IOException {
        Interpolator interpolator;
        Interpolator b2;
        Interpolator b3;
        T t;
        PointF pointF;
        lg5<T> lg5Var;
        PointF pointF2;
        float f2;
        PointF pointF3;
        float f3;
        xb5Var.c();
        PointF pointF4 = null;
        boolean z = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t2 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f4 = 0.0f;
        PointF pointF11 = null;
        T t3 = null;
        while (xb5Var.j()) {
            switch (xb5Var.u(c)) {
                case 0:
                    pointF2 = pointF4;
                    f4 = (float) xb5Var.l();
                    break;
                case 1:
                    pointF2 = pointF4;
                    t2 = jwbVar.a(xb5Var, f);
                    break;
                case 2:
                    pointF2 = pointF4;
                    t3 = jwbVar.a(xb5Var, f);
                    break;
                case 3:
                    pointF2 = pointF4;
                    f2 = f4;
                    PointF pointF12 = pointF11;
                    if (xb5Var.r() == xb5.b.BEGIN_OBJECT) {
                        xb5Var.c();
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        while (xb5Var.j()) {
                            int u = xb5Var.u(d);
                            if (u != 0) {
                                if (u != 1) {
                                    xb5Var.y();
                                } else {
                                    xb5.b r = xb5Var.r();
                                    xb5.b bVar = xb5.b.NUMBER;
                                    if (r == bVar) {
                                        f8 = (float) xb5Var.l();
                                        f6 = f8;
                                    } else {
                                        xb5Var.b();
                                        f6 = (float) xb5Var.l();
                                        if (xb5Var.r() == bVar) {
                                            f8 = (float) xb5Var.l();
                                        } else {
                                            f8 = f6;
                                        }
                                        xb5Var.e();
                                    }
                                }
                            } else {
                                xb5.b r2 = xb5Var.r();
                                xb5.b bVar2 = xb5.b.NUMBER;
                                if (r2 == bVar2) {
                                    f7 = (float) xb5Var.l();
                                    f5 = f7;
                                } else {
                                    xb5Var.b();
                                    f5 = (float) xb5Var.l();
                                    if (xb5Var.r() == bVar2) {
                                        f7 = (float) xb5Var.l();
                                    } else {
                                        f7 = f5;
                                    }
                                    xb5Var.e();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f5, f6);
                        PointF pointF14 = new PointF(f7, f8);
                        xb5Var.i();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f4 = f2;
                        break;
                    } else {
                        pointF5 = wc5.e(xb5Var, f);
                        f4 = f2;
                        pointF11 = pointF12;
                        break;
                    }
                case 4:
                    if (xb5Var.r() == xb5.b.BEGIN_OBJECT) {
                        xb5Var.c();
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        while (xb5Var.j()) {
                            PointF pointF15 = pointF11;
                            int u2 = xb5Var.u(d);
                            if (u2 != 0) {
                                pointF3 = pointF4;
                                if (u2 != 1) {
                                    xb5Var.y();
                                } else {
                                    xb5.b r3 = xb5Var.r();
                                    xb5.b bVar3 = xb5.b.NUMBER;
                                    if (r3 == bVar3) {
                                        f12 = (float) xb5Var.l();
                                        f4 = f4;
                                        f10 = f12;
                                    } else {
                                        float f13 = f4;
                                        xb5Var.b();
                                        float l = (float) xb5Var.l();
                                        if (xb5Var.r() == bVar3) {
                                            f3 = (float) xb5Var.l();
                                        } else {
                                            f3 = l;
                                        }
                                        xb5Var.e();
                                        f4 = f13;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f12 = f3;
                                        f10 = l;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f14 = f4;
                                xb5.b r4 = xb5Var.r();
                                xb5.b bVar4 = xb5.b.NUMBER;
                                if (r4 == bVar4) {
                                    f11 = (float) xb5Var.l();
                                    f4 = f14;
                                    f9 = f11;
                                } else {
                                    xb5Var.b();
                                    f9 = (float) xb5Var.l();
                                    if (xb5Var.r() == bVar4) {
                                        f11 = (float) xb5Var.l();
                                    } else {
                                        f11 = f9;
                                    }
                                    xb5Var.e();
                                    f4 = f14;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f2 = f4;
                        PointF pointF16 = new PointF(f9, f10);
                        PointF pointF17 = new PointF(f11, f12);
                        xb5Var.i();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f4 = f2;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = wc5.e(xb5Var, f);
                        break;
                    }
                case 5:
                    if (xb5Var.m() == 1) {
                        z = true;
                    } else {
                        z = false;
                        continue;
                    }
                case 6:
                    pointF11 = wc5.e(xb5Var, f);
                    continue;
                case 7:
                    pointF4 = wc5.e(xb5Var, f);
                    continue;
                default:
                    xb5Var.y();
                    continue;
            }
            pointF4 = pointF2;
        }
        PointF pointF18 = pointF4;
        float f15 = f4;
        PointF pointF19 = pointF11;
        xb5Var.i();
        if (z) {
            interpolator = a;
            t = t2;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = b(pointF5, pointF6);
            } else if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                b2 = b(pointF7, pointF9);
                b3 = b(pointF8, pointF10);
                t = t3;
                interpolator = null;
                if (b2 == null && b3 != null) {
                    pointF = pointF19;
                    lg5Var = new lg5<>(ez5Var, t2, t, b2, b3, f15, null);
                } else {
                    pointF = pointF19;
                    lg5Var = new lg5<>(ez5Var, t2, t, interpolator, f15, null);
                }
                lg5Var.o = pointF;
                lg5Var.p = pointF18;
                return lg5Var;
            } else {
                interpolator = a;
            }
            t = t3;
        }
        b2 = null;
        b3 = null;
        if (b2 == null) {
        }
        pointF = pointF19;
        lg5Var = new lg5<>(ez5Var, t2, t, interpolator, f15, null);
        lg5Var.o = pointF;
        lg5Var.p = pointF18;
        return lg5Var;
    }

    private static <T> lg5<T> f(xb5 xb5Var, float f, jwb<T> jwbVar) throws IOException {
        return new lg5<>(jwbVar.a(xb5Var, f));
    }

    private static cra<WeakReference<Interpolator>> g() {
        if (b == null) {
            b = new cra<>();
        }
        return b;
    }

    private static void h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (ng5.class) {
            b.m(i, weakReference);
        }
    }
}
