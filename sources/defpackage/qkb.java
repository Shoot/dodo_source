package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import defpackage.t70;
import java.util.Collections;
/* compiled from: TransformKeyframeAnimation.java */
/* renamed from: qkb  reason: default package */
/* loaded from: classes.dex */
public class qkb {
    private final Matrix a = new Matrix();
    private final Matrix b;
    private final Matrix c;
    private final Matrix d;
    private final float[] e;
    private t70<PointF, PointF> f;
    private t70<?, PointF> g;
    private t70<jv9, jv9> h;
    private t70<Float, Float> i;
    private t70<Integer, Integer> j;
    private hz3 k;
    private hz3 l;
    private t70<?, Float> m;
    private t70<?, Float> n;

    public qkb(bk bkVar) {
        t70<PointF, PointF> a;
        t70<PointF, PointF> a2;
        t70<jv9, jv9> a3;
        t70<Float, Float> a4;
        hz3 hz3Var;
        hz3 hz3Var2;
        if (bkVar.c() == null) {
            a = null;
        } else {
            a = bkVar.c().a();
        }
        this.f = a;
        if (bkVar.f() == null) {
            a2 = null;
        } else {
            a2 = bkVar.f().a();
        }
        this.g = a2;
        if (bkVar.h() == null) {
            a3 = null;
        } else {
            a3 = bkVar.h().a();
        }
        this.h = a3;
        if (bkVar.g() == null) {
            a4 = null;
        } else {
            a4 = bkVar.g().a();
        }
        this.i = a4;
        if (bkVar.i() == null) {
            hz3Var = null;
        } else {
            hz3Var = (hz3) bkVar.i().a();
        }
        this.k = hz3Var;
        if (hz3Var != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        if (bkVar.j() == null) {
            hz3Var2 = null;
        } else {
            hz3Var2 = (hz3) bkVar.j().a();
        }
        this.l = hz3Var2;
        if (bkVar.e() != null) {
            this.j = bkVar.e().a();
        }
        if (bkVar.k() != null) {
            this.m = bkVar.k().a();
        } else {
            this.m = null;
        }
        if (bkVar.d() != null) {
            this.n = bkVar.d().a();
        } else {
            this.n = null;
        }
    }

    private void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public void a(v70 v70Var) {
        v70Var.i(this.j);
        v70Var.i(this.m);
        v70Var.i(this.n);
        v70Var.i(this.f);
        v70Var.i(this.g);
        v70Var.i(this.h);
        v70Var.i(this.i);
        v70Var.i(this.k);
        v70Var.i(this.l);
    }

    public void b(t70.b bVar) {
        t70<Integer, Integer> t70Var = this.j;
        if (t70Var != null) {
            t70Var.a(bVar);
        }
        t70<?, Float> t70Var2 = this.m;
        if (t70Var2 != null) {
            t70Var2.a(bVar);
        }
        t70<?, Float> t70Var3 = this.n;
        if (t70Var3 != null) {
            t70Var3.a(bVar);
        }
        t70<PointF, PointF> t70Var4 = this.f;
        if (t70Var4 != null) {
            t70Var4.a(bVar);
        }
        t70<?, PointF> t70Var5 = this.g;
        if (t70Var5 != null) {
            t70Var5.a(bVar);
        }
        t70<jv9, jv9> t70Var6 = this.h;
        if (t70Var6 != null) {
            t70Var6.a(bVar);
        }
        t70<Float, Float> t70Var7 = this.i;
        if (t70Var7 != null) {
            t70Var7.a(bVar);
        }
        hz3 hz3Var = this.k;
        if (hz3Var != null) {
            hz3Var.a(bVar);
        }
        hz3 hz3Var2 = this.l;
        if (hz3Var2 != null) {
            hz3Var2.a(bVar);
        }
    }

    public <T> boolean c(T t, b06<T> b06Var) {
        if (t == xz5.f) {
            t70<PointF, PointF> t70Var = this.f;
            if (t70Var == null) {
                this.f = new dwb(b06Var, new PointF());
                return true;
            }
            t70Var.n(b06Var);
            return true;
        } else if (t == xz5.g) {
            t70<?, PointF> t70Var2 = this.g;
            if (t70Var2 == null) {
                this.g = new dwb(b06Var, new PointF());
                return true;
            }
            t70Var2.n(b06Var);
            return true;
        } else {
            if (t == xz5.h) {
                t70<?, PointF> t70Var3 = this.g;
                if (t70Var3 instanceof hsa) {
                    ((hsa) t70Var3).r(b06Var);
                    return true;
                }
            }
            if (t == xz5.i) {
                t70<?, PointF> t70Var4 = this.g;
                if (t70Var4 instanceof hsa) {
                    ((hsa) t70Var4).s(b06Var);
                    return true;
                }
            }
            if (t == xz5.o) {
                t70<jv9, jv9> t70Var5 = this.h;
                if (t70Var5 == null) {
                    this.h = new dwb(b06Var, new jv9());
                    return true;
                }
                t70Var5.n(b06Var);
                return true;
            } else if (t == xz5.p) {
                t70<Float, Float> t70Var6 = this.i;
                if (t70Var6 == null) {
                    this.i = new dwb(b06Var, Float.valueOf(0.0f));
                    return true;
                }
                t70Var6.n(b06Var);
                return true;
            } else if (t == xz5.c) {
                t70<Integer, Integer> t70Var7 = this.j;
                if (t70Var7 == null) {
                    this.j = new dwb(b06Var, 100);
                    return true;
                }
                t70Var7.n(b06Var);
                return true;
            } else if (t == xz5.C) {
                t70<?, Float> t70Var8 = this.m;
                if (t70Var8 == null) {
                    this.m = new dwb(b06Var, Float.valueOf(100.0f));
                    return true;
                }
                t70Var8.n(b06Var);
                return true;
            } else if (t == xz5.D) {
                t70<?, Float> t70Var9 = this.n;
                if (t70Var9 == null) {
                    this.n = new dwb(b06Var, Float.valueOf(100.0f));
                    return true;
                }
                t70Var9.n(b06Var);
                return true;
            } else if (t == xz5.q) {
                if (this.k == null) {
                    this.k = new hz3(Collections.singletonList(new lg5(Float.valueOf(0.0f))));
                }
                this.k.n(b06Var);
                return true;
            } else if (t == xz5.r) {
                if (this.l == null) {
                    this.l = new hz3(Collections.singletonList(new lg5(Float.valueOf(0.0f))));
                }
                this.l.n(b06Var);
                return true;
            } else {
                return false;
            }
        }
    }

    public t70<?, Float> e() {
        return this.n;
    }

    public Matrix f() {
        float cos;
        float sin;
        float p;
        PointF h;
        this.a.reset();
        t70<?, PointF> t70Var = this.g;
        if (t70Var != null && (h = t70Var.h()) != null) {
            float f = h.x;
            if (f != 0.0f || h.y != 0.0f) {
                this.a.preTranslate(f, h.y);
            }
        }
        t70<Float, Float> t70Var2 = this.i;
        if (t70Var2 != null) {
            if (t70Var2 instanceof dwb) {
                p = t70Var2.h().floatValue();
            } else {
                p = ((hz3) t70Var2).p();
            }
            if (p != 0.0f) {
                this.a.preRotate(p);
            }
        }
        hz3 hz3Var = this.k;
        if (hz3Var != null) {
            hz3 hz3Var2 = this.l;
            if (hz3Var2 == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-hz3Var2.p()) + 90.0f));
            }
            hz3 hz3Var3 = this.l;
            if (hz3Var3 == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-hz3Var3.p()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(hz3Var.p()));
            d();
            float[] fArr = this.e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.b.setValues(fArr);
            d();
            float[] fArr2 = this.e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.c.setValues(fArr2);
            d();
            float[] fArr3 = this.e;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.d.setValues(fArr3);
            this.c.preConcat(this.b);
            this.d.preConcat(this.c);
            this.a.preConcat(this.d);
        }
        t70<jv9, jv9> t70Var3 = this.h;
        if (t70Var3 != null) {
            jv9 h2 = t70Var3.h();
            if (h2.b() != 1.0f || h2.c() != 1.0f) {
                this.a.preScale(h2.b(), h2.c());
            }
        }
        t70<PointF, PointF> t70Var4 = this.f;
        if (t70Var4 != null) {
            PointF h3 = t70Var4.h();
            float f3 = h3.x;
            if (f3 != 0.0f || h3.y != 0.0f) {
                this.a.preTranslate(-f3, -h3.y);
            }
        }
        return this.a;
    }

    public Matrix g(float f) {
        PointF h;
        jv9 h2;
        float f2;
        t70<?, PointF> t70Var = this.g;
        PointF pointF = null;
        if (t70Var == null) {
            h = null;
        } else {
            h = t70Var.h();
        }
        t70<jv9, jv9> t70Var2 = this.h;
        if (t70Var2 == null) {
            h2 = null;
        } else {
            h2 = t70Var2.h();
        }
        this.a.reset();
        if (h != null) {
            this.a.preTranslate(h.x * f, h.y * f);
        }
        if (h2 != null) {
            double d = f;
            this.a.preScale((float) Math.pow(h2.b(), d), (float) Math.pow(h2.c(), d));
        }
        t70<Float, Float> t70Var3 = this.i;
        if (t70Var3 != null) {
            float floatValue = t70Var3.h().floatValue();
            t70<PointF, PointF> t70Var4 = this.f;
            if (t70Var4 != null) {
                pointF = t70Var4.h();
            }
            Matrix matrix = this.a;
            float f3 = floatValue * f;
            float f4 = 0.0f;
            if (pointF == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF.x;
            }
            if (pointF != null) {
                f4 = pointF.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return this.a;
    }

    public t70<?, Integer> h() {
        return this.j;
    }

    public t70<?, Float> i() {
        return this.m;
    }

    public void j(float f) {
        t70<Integer, Integer> t70Var = this.j;
        if (t70Var != null) {
            t70Var.m(f);
        }
        t70<?, Float> t70Var2 = this.m;
        if (t70Var2 != null) {
            t70Var2.m(f);
        }
        t70<?, Float> t70Var3 = this.n;
        if (t70Var3 != null) {
            t70Var3.m(f);
        }
        t70<PointF, PointF> t70Var4 = this.f;
        if (t70Var4 != null) {
            t70Var4.m(f);
        }
        t70<?, PointF> t70Var5 = this.g;
        if (t70Var5 != null) {
            t70Var5.m(f);
        }
        t70<jv9, jv9> t70Var6 = this.h;
        if (t70Var6 != null) {
            t70Var6.m(f);
        }
        t70<Float, Float> t70Var7 = this.i;
        if (t70Var7 != null) {
            t70Var7.m(f);
        }
        hz3 hz3Var = this.k;
        if (hz3Var != null) {
            hz3Var.m(f);
        }
        hz3 hz3Var2 = this.l;
        if (hz3Var2 != null) {
            hz3Var2.m(f);
        }
    }
}
