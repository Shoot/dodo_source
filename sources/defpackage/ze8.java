package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.n;
import defpackage.af8;
import defpackage.mha;
import defpackage.t70;
import java.util.List;
/* compiled from: PolystarContent.java */
/* renamed from: ze8  reason: default package */
/* loaded from: classes.dex */
public class ze8 implements qr7, t70.b, qf5 {
    private final String b;
    private final n c;
    private final af8.a d;
    private final boolean e;
    private final boolean f;
    private final t70<?, Float> g;
    private final t70<?, PointF> h;
    private final t70<?, Float> i;
    private final t70<?, Float> j;
    private final t70<?, Float> k;
    private final t70<?, Float> l;
    private final t70<?, Float> m;
    private boolean o;
    private final Path a = new Path();
    private final to1 n = new to1();

    /* compiled from: PolystarContent.java */
    /* renamed from: ze8$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[af8.a.values().length];
            a = iArr;
            try {
                iArr[af8.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[af8.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ze8(n nVar, v70 v70Var, af8 af8Var) {
        this.c = nVar;
        this.b = af8Var.d();
        af8.a j = af8Var.j();
        this.d = j;
        this.e = af8Var.k();
        this.f = af8Var.l();
        t70<Float, Float> a2 = af8Var.g().a();
        this.g = a2;
        t70<PointF, PointF> a3 = af8Var.h().a();
        this.h = a3;
        t70<Float, Float> a4 = af8Var.i().a();
        this.i = a4;
        t70<Float, Float> a5 = af8Var.e().a();
        this.k = a5;
        t70<Float, Float> a6 = af8Var.f().a();
        this.m = a6;
        af8.a aVar = af8.a.STAR;
        if (j == aVar) {
            this.j = af8Var.b().a();
            this.l = af8Var.c().a();
        } else {
            this.j = null;
            this.l = null;
        }
        v70Var.i(a2);
        v70Var.i(a3);
        v70Var.i(a4);
        v70Var.i(a5);
        v70Var.i(a6);
        if (j == aVar) {
            v70Var.i(this.j);
            v70Var.i(this.l);
        }
        a2.a(this);
        a3.a(this);
        a4.a(this);
        a5.a(this);
        a6.a(this);
        if (j == aVar) {
            this.j.a(this);
            this.l.a(this);
        }
    }

    private void e() {
        double floatValue;
        int i;
        double d;
        double d2;
        double d3;
        int floor = (int) Math.floor(this.g.h().floatValue());
        t70<?, Float> t70Var = this.i;
        if (t70Var == null) {
            floatValue = 0.0d;
        } else {
            floatValue = t70Var.h().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d4 = floor;
        float floatValue2 = this.m.h().floatValue() / 100.0f;
        float floatValue3 = this.k.h().floatValue();
        double d5 = floatValue3;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.a.moveTo(cos, sin);
        double d6 = (float) (6.283185307179586d / d4);
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (d5 * Math.sin(d7));
            if (floatValue2 != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d3 = d6;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f = floatValue3 * floatValue2 * 0.25f;
                this.a.cubicTo(cos - (cos3 * f), sin - (((float) Math.sin(atan2)) * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                i = i2;
                d = d7;
                d2 = d5;
                d3 = d6;
                this.a.lineTo(cos2, sin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF h = this.h.h();
        this.a.offset(h.x, h.y);
        this.a.close();
    }

    private void i() {
        double floatValue;
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        double d;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        double d2;
        float f10;
        float f11;
        float f12;
        double d3;
        float f13;
        float f14;
        float f15;
        float f16;
        float floatValue2 = this.g.h().floatValue();
        t70<?, Float> t70Var = this.i;
        if (t70Var == null) {
            floatValue = 0.0d;
        } else {
            floatValue = t70Var.h().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d4 = floatValue2;
        float f17 = (float) (6.283185307179586d / d4);
        if (this.f) {
            f17 *= -1.0f;
        }
        float f18 = f17 / 2.0f;
        float f19 = floatValue2 - ((int) floatValue2);
        int i2 = (f19 > 0.0f ? 1 : (f19 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f19) * f18;
        }
        float floatValue3 = this.k.h().floatValue();
        float floatValue4 = this.j.h().floatValue();
        t70<?, Float> t70Var2 = this.l;
        if (t70Var2 != null) {
            f = t70Var2.h().floatValue() / 100.0f;
        } else {
            f = 0.0f;
        }
        t70<?, Float> t70Var3 = this.m;
        if (t70Var3 != null) {
            f2 = t70Var3.h().floatValue() / 100.0f;
        } else {
            f2 = 0.0f;
        }
        if (i2 != 0) {
            f6 = ((floatValue3 - floatValue4) * f19) + floatValue4;
            i = i2;
            double d5 = f6;
            float cos = (float) (d5 * Math.cos(radians));
            f5 = (float) (d5 * Math.sin(radians));
            this.a.moveTo(cos, f5);
            d = radians + ((f17 * f19) / 2.0f);
            f3 = cos;
            f4 = f18;
        } else {
            i = i2;
            double d6 = floatValue3;
            float cos2 = (float) (Math.cos(radians) * d6);
            float sin = (float) (d6 * Math.sin(radians));
            this.a.moveTo(cos2, sin);
            f3 = cos2;
            f4 = f18;
            d = radians + f4;
            f5 = sin;
            f6 = 0.0f;
        }
        double ceil = Math.ceil(d4) * 2.0d;
        int i3 = 0;
        float f20 = f4;
        float f21 = f3;
        boolean z = false;
        while (true) {
            double d7 = i3;
            if (d7 < ceil) {
                if (z) {
                    f7 = floatValue3;
                } else {
                    f7 = floatValue4;
                }
                int i4 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
                if (i4 != 0 && d7 == ceil - 2.0d) {
                    f8 = f17;
                    f9 = (f17 * f19) / 2.0f;
                } else {
                    f8 = f17;
                    f9 = f20;
                }
                if (i4 != 0 && d7 == ceil - 1.0d) {
                    d2 = d7;
                    f10 = f6;
                } else {
                    d2 = d7;
                    f10 = f6;
                    f6 = f7;
                }
                double d8 = f6;
                double d9 = ceil;
                float cos3 = (float) (d8 * Math.cos(d));
                float sin2 = (float) (d8 * Math.sin(d));
                if (f == 0.0f && f2 == 0.0f) {
                    this.a.lineTo(cos3, sin2);
                    d3 = d;
                    f11 = f;
                    f12 = f2;
                } else {
                    f11 = f;
                    double atan2 = (float) (Math.atan2(f5, f21) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f12 = f2;
                    d3 = d;
                    double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z) {
                        f13 = f11;
                    } else {
                        f13 = f12;
                    }
                    if (z) {
                        f14 = f12;
                    } else {
                        f14 = f11;
                    }
                    if (z) {
                        f15 = floatValue4;
                    } else {
                        f15 = floatValue3;
                    }
                    if (z) {
                        f16 = floatValue3;
                    } else {
                        f16 = floatValue4;
                    }
                    float f22 = f15 * f13 * 0.47829f;
                    float f23 = cos4 * f22;
                    float f24 = f22 * sin3;
                    float f25 = f16 * f14 * 0.47829f;
                    float f26 = cos5 * f25;
                    float f27 = f25 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f23 *= f19;
                            f24 *= f19;
                        } else if (d2 == d9 - 1.0d) {
                            f26 *= f19;
                            f27 *= f19;
                        }
                    }
                    this.a.cubicTo(f21 - f23, f5 - f24, cos3 + f26, sin2 + f27, cos3, sin2);
                }
                d = d3 + f9;
                z = !z;
                i3++;
                f21 = cos3;
                f5 = sin2;
                f2 = f12;
                f = f11;
                f6 = f10;
                f17 = f8;
                ceil = d9;
            } else {
                PointF h = this.h.h();
                this.a.offset(h.x, h.y);
                this.a.close();
                return;
            }
        }
    }

    private void j() {
        this.o = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.t70.b
    public void a() {
        j();
    }

    @Override // defpackage.dt1
    public void b(List<dt1> list, List<dt1> list2) {
        for (int i = 0; i < list.size(); i++) {
            dt1 dt1Var = list.get(i);
            if (dt1Var instanceof bnb) {
                bnb bnbVar = (bnb) dt1Var;
                if (bnbVar.j() == mha.a.SIMULTANEOUSLY) {
                    this.n.a(bnbVar);
                    bnbVar.e(this);
                }
            }
        }
    }

    @Override // defpackage.pf5
    public <T> void f(T t, b06<T> b06Var) {
        t70<?, Float> t70Var;
        t70<?, Float> t70Var2;
        if (t == xz5.w) {
            this.g.n(b06Var);
        } else if (t == xz5.x) {
            this.i.n(b06Var);
        } else if (t == xz5.n) {
            this.h.n(b06Var);
        } else if (t == xz5.y && (t70Var2 = this.j) != null) {
            t70Var2.n(b06Var);
        } else if (t == xz5.z) {
            this.k.n(b06Var);
        } else if (t == xz5.A && (t70Var = this.l) != null) {
            t70Var.n(b06Var);
        } else if (t == xz5.B) {
            this.m.n(b06Var);
        }
    }

    @Override // defpackage.pf5
    public void g(of5 of5Var, int i, List<of5> list, of5 of5Var2) {
        ql6.k(of5Var, i, list, of5Var2, this);
    }

    @Override // defpackage.dt1
    public String getName() {
        return this.b;
    }

    @Override // defpackage.qr7
    public Path getPath() {
        if (this.o) {
            return this.a;
        }
        this.a.reset();
        if (this.e) {
            this.o = true;
            return this.a;
        }
        int i = a.a[this.d.ordinal()];
        if (i != 1) {
            if (i == 2) {
                e();
            }
        } else {
            i();
        }
        this.a.close();
        this.n.b(this.a);
        this.o = true;
        return this.a;
    }
}
