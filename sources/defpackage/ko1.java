package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.airbnb.lottie.n;
import defpackage.em5;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CompositionLayer.java */
/* renamed from: ko1  reason: default package */
/* loaded from: classes.dex */
public class ko1 extends v70 {
    private t70<Float, Float> D;
    private final List<v70> E;
    private final RectF F;
    private final RectF G;
    private final Paint H;
    private boolean I;

    /* compiled from: CompositionLayer.java */
    /* renamed from: ko1$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[em5.b.values().length];
            a = iArr;
            try {
                iArr[em5.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[em5.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ko1(n nVar, em5 em5Var, List<em5> list, ez5 ez5Var) {
        super(nVar, em5Var);
        int i;
        v70 v70Var;
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Paint();
        this.I = true;
        pj u = em5Var.u();
        if (u != null) {
            t70<Float, Float> a2 = u.a();
            this.D = a2;
            i(a2);
            this.D.a(this);
        } else {
            this.D = null;
        }
        py5 py5Var = new py5(ez5Var.k().size());
        int size = list.size() - 1;
        v70 v70Var2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            em5 em5Var2 = list.get(size);
            v70 u2 = v70.u(this, em5Var2, nVar, ez5Var);
            if (u2 != null) {
                py5Var.l(u2.y().d(), u2);
                if (v70Var2 != null) {
                    v70Var2.I(u2);
                    v70Var2 = null;
                } else {
                    this.E.add(0, u2);
                    int i2 = a.a[em5Var2.h().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        v70Var2 = u2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < py5Var.o(); i++) {
            v70 v70Var3 = (v70) py5Var.g(py5Var.j(i));
            if (v70Var3 != null && (v70Var = (v70) py5Var.g(v70Var3.y().j())) != null) {
                v70Var3.K(v70Var);
            }
        }
    }

    @Override // defpackage.v70
    protected void H(of5 of5Var, int i, List<of5> list, of5 of5Var2) {
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            this.E.get(i2).g(of5Var, i, list, of5Var2);
        }
    }

    @Override // defpackage.v70
    public void J(boolean z) {
        super.J(z);
        for (v70 v70Var : this.E) {
            v70Var.J(z);
        }
    }

    @Override // defpackage.v70
    public void L(float f) {
        super.L(f);
        if (this.D != null) {
            f = ((this.D.h().floatValue() * this.q.b().i()) - this.q.b().p()) / (this.p.G().e() + 0.01f);
        }
        if (this.D == null) {
            f -= this.q.r();
        }
        if (this.q.v() != 0.0f && !"__container".equals(this.q.i())) {
            f /= this.q.v();
        }
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.E.get(size).L(f);
        }
    }

    public void O(boolean z) {
        this.I = z;
    }

    @Override // defpackage.v70, defpackage.y83
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.F.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.E.get(size).d(this.F, this.o, true);
            rectF.union(this.F);
        }
    }

    @Override // defpackage.v70, defpackage.pf5
    public <T> void f(T t, b06<T> b06Var) {
        super.f(t, b06Var);
        if (t == xz5.E) {
            if (b06Var == null) {
                t70<Float, Float> t70Var = this.D;
                if (t70Var != null) {
                    t70Var.n(null);
                    return;
                }
                return;
            }
            dwb dwbVar = new dwb(b06Var);
            this.D = dwbVar;
            dwbVar.a(this);
            i(this.D);
        }
    }

    @Override // defpackage.v70
    void t(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        oi5.a("CompositionLayer#draw");
        this.G.set(0.0f, 0.0f, this.q.l(), this.q.k());
        matrix.mapRect(this.G);
        if (this.p.b0() && this.E.size() > 1 && i != 255) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.H.setAlpha(i);
            fvb.m(canvas, this.G, this.H);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.E.size() - 1; size >= 0; size--) {
            if ((!this.I && "__container".equals(this.q.i())) || this.G.isEmpty() || canvas.clipRect(this.G)) {
                this.E.get(size).h(canvas, matrix, i);
            }
        }
        canvas.restore();
        oi5.b("CompositionLayer#draw");
    }
}
