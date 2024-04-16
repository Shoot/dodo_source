package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.n;
/* compiled from: GradientStrokeContent.java */
/* renamed from: bi4  reason: default package */
/* loaded from: classes.dex */
public class bi4 extends j80 {
    private final t70<PointF, PointF> A;
    private dwb B;
    private final String r;
    private final boolean s;
    private final py5<LinearGradient> t;
    private final py5<RadialGradient> u;
    private final RectF v;
    private final di4 w;
    private final int x;
    private final t70<th4, th4> y;
    private final t70<PointF, PointF> z;

    public bi4(n nVar, v70 v70Var, ai4 ai4Var) {
        super(nVar, v70Var, ai4Var.b().a(), ai4Var.g().a(), ai4Var.i(), ai4Var.k(), ai4Var.m(), ai4Var.h(), ai4Var.c());
        this.t = new py5<>();
        this.u = new py5<>();
        this.v = new RectF();
        this.r = ai4Var.j();
        this.w = ai4Var.f();
        this.s = ai4Var.n();
        this.x = (int) (nVar.G().d() / 32.0f);
        t70<th4, th4> a = ai4Var.e().a();
        this.y = a;
        a.a(this);
        v70Var.i(a);
        t70<PointF, PointF> a2 = ai4Var.l().a();
        this.z = a2;
        a2.a(this);
        v70Var.i(a2);
        t70<PointF, PointF> a3 = ai4Var.d().a();
        this.A = a3;
        a3.a(this);
        v70Var.i(a3);
    }

    private int[] j(int[] iArr) {
        dwb dwbVar = this.B;
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

    private int k() {
        int i;
        int round = Math.round(this.z.f() * this.x);
        int round2 = Math.round(this.A.f() * this.x);
        int round3 = Math.round(this.y.f() * this.x);
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

    private LinearGradient l() {
        long k = k();
        LinearGradient g = this.t.g(k);
        if (g != null) {
            return g;
        }
        PointF h = this.z.h();
        PointF h2 = this.A.h();
        th4 h3 = this.y.h();
        LinearGradient linearGradient = new LinearGradient(h.x, h.y, h2.x, h2.y, j(h3.a()), h3.b(), Shader.TileMode.CLAMP);
        this.t.l(k, linearGradient);
        return linearGradient;
    }

    private RadialGradient m() {
        float f;
        float f2;
        long k = k();
        RadialGradient g = this.u.g(k);
        if (g != null) {
            return g;
        }
        PointF h = this.z.h();
        PointF h2 = this.A.h();
        th4 h3 = this.y.h();
        int[] j = j(h3.a());
        float[] b = h3.b();
        RadialGradient radialGradient = new RadialGradient(h.x, h.y, (float) Math.hypot(h2.x - f, h2.y - f2), j, b, Shader.TileMode.CLAMP);
        this.u.l(k, radialGradient);
        return radialGradient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j80, defpackage.pf5
    public <T> void f(T t, b06<T> b06Var) {
        super.f(t, b06Var);
        if (t == xz5.L) {
            dwb dwbVar = this.B;
            if (dwbVar != null) {
                this.f.G(dwbVar);
            }
            if (b06Var == null) {
                this.B = null;
                return;
            }
            dwb dwbVar2 = new dwb(b06Var);
            this.B = dwbVar2;
            dwbVar2.a(this);
            this.f.i(this.B);
        }
    }

    @Override // defpackage.dt1
    public String getName() {
        return this.r;
    }

    @Override // defpackage.j80, defpackage.y83
    public void h(Canvas canvas, Matrix matrix, int i) {
        Shader m;
        if (this.s) {
            return;
        }
        d(this.v, matrix, false);
        if (this.w == di4.LINEAR) {
            m = l();
        } else {
            m = m();
        }
        m.setLocalMatrix(matrix);
        this.i.setShader(m);
        super.h(canvas, matrix, i);
    }
}
