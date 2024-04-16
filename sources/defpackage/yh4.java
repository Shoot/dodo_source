package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import com.airbnb.lottie.n;
import defpackage.t70;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GradientFillContent.java */
/* renamed from: yh4  reason: default package */
/* loaded from: classes.dex */
public class yh4 implements y83, t70.b, qf5 {
    @NonNull
    private final String a;
    private final boolean b;
    private final v70 c;
    private final py5<LinearGradient> d = new py5<>();
    private final py5<RadialGradient> e = new py5<>();
    private final Path f;
    private final Paint g;
    private final RectF h;
    private final List<qr7> i;
    private final di4 j;
    private final t70<th4, th4> k;
    private final t70<Integer, Integer> l;
    private final t70<PointF, PointF> m;
    private final t70<PointF, PointF> n;
    private t70<ColorFilter, ColorFilter> o;
    private dwb p;
    private final n q;
    private final int r;
    private t70<Float, Float> s;
    float t;
    private g93 u;

    public yh4(n nVar, v70 v70Var, xh4 xh4Var) {
        Path path = new Path();
        this.f = path;
        this.g = new yi5(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = v70Var;
        this.a = xh4Var.f();
        this.b = xh4Var.i();
        this.q = nVar;
        this.j = xh4Var.e();
        path.setFillType(xh4Var.c());
        this.r = (int) (nVar.G().d() / 32.0f);
        t70<th4, th4> a = xh4Var.d().a();
        this.k = a;
        a.a(this);
        v70Var.i(a);
        t70<Integer, Integer> a2 = xh4Var.g().a();
        this.l = a2;
        a2.a(this);
        v70Var.i(a2);
        t70<PointF, PointF> a3 = xh4Var.h().a();
        this.m = a3;
        a3.a(this);
        v70Var.i(a3);
        t70<PointF, PointF> a4 = xh4Var.b().a();
        this.n = a4;
        a4.a(this);
        v70Var.i(a4);
        if (v70Var.v() != null) {
            t70<Float, Float> a5 = v70Var.v().a().a();
            this.s = a5;
            a5.a(this);
            v70Var.i(this.s);
        }
        if (v70Var.x() != null) {
            this.u = new g93(this, v70Var, v70Var.x());
        }
    }

    private int[] e(int[] iArr) {
        dwb dwbVar = this.p;
        if (dwbVar != null) {
            Integer[] numArr = (Integer[]) dwbVar.h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private int i() {
        int i;
        int round = Math.round(this.m.f() * this.r);
        int round2 = Math.round(this.n.f() * this.r);
        int round3 = Math.round(this.k.f() * this.r);
        if (round != 0) {
            i = 527 * round;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    private LinearGradient j() {
        long i = i();
        LinearGradient g = this.d.g(i);
        if (g != null) {
            return g;
        }
        PointF h = this.m.h();
        PointF h2 = this.n.h();
        th4 h3 = this.k.h();
        LinearGradient linearGradient = new LinearGradient(h.x, h.y, h2.x, h2.y, e(h3.a()), h3.b(), Shader.TileMode.CLAMP);
        this.d.l(i, linearGradient);
        return linearGradient;
    }

    private RadialGradient k() {
        float f;
        long i = i();
        RadialGradient g = this.e.g(i);
        if (g != null) {
            return g;
        }
        PointF h = this.m.h();
        PointF h2 = this.n.h();
        th4 h3 = this.k.h();
        int[] e = e(h3.a());
        float[] b = h3.b();
        float f2 = h.x;
        float f3 = h.y;
        float hypot = (float) Math.hypot(h2.x - f2, h2.y - f3);
        if (hypot <= 0.0f) {
            f = 0.001f;
        } else {
            f = hypot;
        }
        RadialGradient radialGradient = new RadialGradient(f2, f3, f, e, b, Shader.TileMode.CLAMP);
        this.e.l(i, radialGradient);
        return radialGradient;
    }

    @Override // defpackage.t70.b
    public void a() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.dt1
    public void b(List<dt1> list, List<dt1> list2) {
        for (int i = 0; i < list2.size(); i++) {
            dt1 dt1Var = list2.get(i);
            if (dt1Var instanceof qr7) {
                this.i.add((qr7) dt1Var);
            }
        }
    }

    @Override // defpackage.y83
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); i++) {
            this.f.addPath(this.i.get(i).getPath(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pf5
    public <T> void f(T t, b06<T> b06Var) {
        g93 g93Var;
        g93 g93Var2;
        g93 g93Var3;
        g93 g93Var4;
        g93 g93Var5;
        if (t == xz5.d) {
            this.l.n(b06Var);
        } else if (t == xz5.K) {
            t70<ColorFilter, ColorFilter> t70Var = this.o;
            if (t70Var != null) {
                this.c.G(t70Var);
            }
            if (b06Var == null) {
                this.o = null;
                return;
            }
            dwb dwbVar = new dwb(b06Var);
            this.o = dwbVar;
            dwbVar.a(this);
            this.c.i(this.o);
        } else if (t == xz5.L) {
            dwb dwbVar2 = this.p;
            if (dwbVar2 != null) {
                this.c.G(dwbVar2);
            }
            if (b06Var == null) {
                this.p = null;
                return;
            }
            this.d.c();
            this.e.c();
            dwb dwbVar3 = new dwb(b06Var);
            this.p = dwbVar3;
            dwbVar3.a(this);
            this.c.i(this.p);
        } else if (t == xz5.j) {
            t70<Float, Float> t70Var2 = this.s;
            if (t70Var2 != null) {
                t70Var2.n(b06Var);
                return;
            }
            dwb dwbVar4 = new dwb(b06Var);
            this.s = dwbVar4;
            dwbVar4.a(this);
            this.c.i(this.s);
        } else if (t == xz5.e && (g93Var5 = this.u) != null) {
            g93Var5.c(b06Var);
        } else if (t == xz5.G && (g93Var4 = this.u) != null) {
            g93Var4.f(b06Var);
        } else if (t == xz5.H && (g93Var3 = this.u) != null) {
            g93Var3.d(b06Var);
        } else if (t == xz5.I && (g93Var2 = this.u) != null) {
            g93Var2.e(b06Var);
        } else if (t == xz5.J && (g93Var = this.u) != null) {
            g93Var.g(b06Var);
        }
    }

    @Override // defpackage.pf5
    public void g(of5 of5Var, int i, List<of5> list, of5 of5Var2) {
        ql6.k(of5Var, i, list, of5Var2, this);
    }

    @Override // defpackage.dt1
    public String getName() {
        return this.a;
    }

    @Override // defpackage.y83
    public void h(Canvas canvas, Matrix matrix, int i) {
        Shader k;
        if (this.b) {
            return;
        }
        oi5.a("GradientFillContent#draw");
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(this.i.get(i2).getPath(), matrix);
        }
        this.f.computeBounds(this.h, false);
        if (this.j == di4.LINEAR) {
            k = j();
        } else {
            k = k();
        }
        k.setLocalMatrix(matrix);
        this.g.setShader(k);
        t70<ColorFilter, ColorFilter> t70Var = this.o;
        if (t70Var != null) {
            this.g.setColorFilter(t70Var.h());
        }
        t70<Float, Float> t70Var2 = this.s;
        if (t70Var2 != null) {
            float floatValue = t70Var2.h().floatValue();
            if (floatValue == 0.0f) {
                this.g.setMaskFilter(null);
            } else if (floatValue != this.t) {
                this.g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = floatValue;
        }
        g93 g93Var = this.u;
        if (g93Var != null) {
            g93Var.b(this.g);
        }
        this.g.setAlpha(ql6.c((int) ((((i / 255.0f) * this.l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f, this.g);
        oi5.b("GradientFillContent#draw");
    }
}
