package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.n;
import defpackage.t70;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FillContent.java */
/* renamed from: vu3  reason: default package */
/* loaded from: classes.dex */
public class vu3 implements y83, t70.b, qf5 {
    private final Path a;
    private final Paint b;
    private final v70 c;
    private final String d;
    private final boolean e;
    private final List<qr7> f;
    private final t70<Integer, Integer> g;
    private final t70<Integer, Integer> h;
    private t70<ColorFilter, ColorFilter> i;
    private final n j;
    private t70<Float, Float> k;
    float l;
    private g93 m;

    public vu3(n nVar, v70 v70Var, aha ahaVar) {
        Path path = new Path();
        this.a = path;
        this.b = new yi5(1);
        this.f = new ArrayList();
        this.c = v70Var;
        this.d = ahaVar.d();
        this.e = ahaVar.f();
        this.j = nVar;
        if (v70Var.v() != null) {
            t70<Float, Float> a = v70Var.v().a().a();
            this.k = a;
            a.a(this);
            v70Var.i(this.k);
        }
        if (v70Var.x() != null) {
            this.m = new g93(this, v70Var, v70Var.x());
        }
        if (ahaVar.b() != null && ahaVar.e() != null) {
            path.setFillType(ahaVar.c());
            t70<Integer, Integer> a2 = ahaVar.b().a();
            this.g = a2;
            a2.a(this);
            v70Var.i(a2);
            t70<Integer, Integer> a3 = ahaVar.e().a();
            this.h = a3;
            a3.a(this);
            v70Var.i(a3);
            return;
        }
        this.g = null;
        this.h = null;
    }

    @Override // defpackage.t70.b
    public void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.dt1
    public void b(List<dt1> list, List<dt1> list2) {
        for (int i = 0; i < list2.size(); i++) {
            dt1 dt1Var = list2.get(i);
            if (dt1Var instanceof qr7) {
                this.f.add((qr7) dt1Var);
            }
        }
    }

    @Override // defpackage.y83
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i = 0; i < this.f.size(); i++) {
            this.a.addPath(this.f.get(i).getPath(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.pf5
    public <T> void f(T t, b06<T> b06Var) {
        g93 g93Var;
        g93 g93Var2;
        g93 g93Var3;
        g93 g93Var4;
        g93 g93Var5;
        if (t == xz5.a) {
            this.g.n(b06Var);
        } else if (t == xz5.d) {
            this.h.n(b06Var);
        } else if (t == xz5.K) {
            t70<ColorFilter, ColorFilter> t70Var = this.i;
            if (t70Var != null) {
                this.c.G(t70Var);
            }
            if (b06Var == null) {
                this.i = null;
                return;
            }
            dwb dwbVar = new dwb(b06Var);
            this.i = dwbVar;
            dwbVar.a(this);
            this.c.i(this.i);
        } else if (t == xz5.j) {
            t70<Float, Float> t70Var2 = this.k;
            if (t70Var2 != null) {
                t70Var2.n(b06Var);
                return;
            }
            dwb dwbVar2 = new dwb(b06Var);
            this.k = dwbVar2;
            dwbVar2.a(this);
            this.c.i(this.k);
        } else if (t == xz5.e && (g93Var5 = this.m) != null) {
            g93Var5.c(b06Var);
        } else if (t == xz5.G && (g93Var4 = this.m) != null) {
            g93Var4.f(b06Var);
        } else if (t == xz5.H && (g93Var3 = this.m) != null) {
            g93Var3.d(b06Var);
        } else if (t == xz5.I && (g93Var2 = this.m) != null) {
            g93Var2.e(b06Var);
        } else if (t == xz5.J && (g93Var = this.m) != null) {
            g93Var.g(b06Var);
        }
    }

    @Override // defpackage.pf5
    public void g(of5 of5Var, int i, List<of5> list, of5 of5Var2) {
        ql6.k(of5Var, i, list, of5Var2, this);
    }

    @Override // defpackage.dt1
    public String getName() {
        return this.d;
    }

    @Override // defpackage.y83
    public void h(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        oi5.a("FillContent#draw");
        this.b.setColor((ql6.c((int) ((((i / 255.0f) * this.h.h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((xc1) this.g).p() & 16777215));
        t70<ColorFilter, ColorFilter> t70Var = this.i;
        if (t70Var != null) {
            this.b.setColorFilter(t70Var.h());
        }
        t70<Float, Float> t70Var2 = this.k;
        if (t70Var2 != null) {
            float floatValue = t70Var2.h().floatValue();
            if (floatValue == 0.0f) {
                this.b.setMaskFilter(null);
            } else if (floatValue != this.l) {
                this.b.setMaskFilter(this.c.w(floatValue));
            }
            this.l = floatValue;
        }
        g93 g93Var = this.m;
        if (g93Var != null) {
            g93Var.b(this.b);
        }
        this.a.reset();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.a.addPath(this.f.get(i2).getPath(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        oi5.b("FillContent#draw");
    }
}
