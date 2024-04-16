package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.n;
/* compiled from: StrokeContent.java */
/* renamed from: r0b  reason: default package */
/* loaded from: classes.dex */
public class r0b extends j80 {
    private final v70 r;
    private final String s;
    private final boolean t;
    private final t70<Integer, Integer> u;
    private t70<ColorFilter, ColorFilter> v;

    public r0b(n nVar, v70 v70Var, kha khaVar) {
        super(nVar, v70Var, khaVar.b().a(), khaVar.e().a(), khaVar.g(), khaVar.i(), khaVar.j(), khaVar.f(), khaVar.d());
        this.r = v70Var;
        this.s = khaVar.h();
        this.t = khaVar.k();
        t70<Integer, Integer> a = khaVar.c().a();
        this.u = a;
        a.a(this);
        v70Var.i(a);
    }

    @Override // defpackage.j80, defpackage.pf5
    public <T> void f(T t, b06<T> b06Var) {
        super.f(t, b06Var);
        if (t == xz5.b) {
            this.u.n(b06Var);
        } else if (t == xz5.K) {
            t70<ColorFilter, ColorFilter> t70Var = this.v;
            if (t70Var != null) {
                this.r.G(t70Var);
            }
            if (b06Var == null) {
                this.v = null;
                return;
            }
            dwb dwbVar = new dwb(b06Var);
            this.v = dwbVar;
            dwbVar.a(this);
            this.r.i(this.u);
        }
    }

    @Override // defpackage.dt1
    public String getName() {
        return this.s;
    }

    @Override // defpackage.j80, defpackage.y83
    public void h(Canvas canvas, Matrix matrix, int i) {
        if (this.t) {
            return;
        }
        this.i.setColor(((xc1) this.u).p());
        t70<ColorFilter, ColorFilter> t70Var = this.v;
        if (t70Var != null) {
            this.i.setColorFilter(t70Var.h());
        }
        super.h(canvas, matrix, i);
    }
}
