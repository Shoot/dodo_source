package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.n;
import defpackage.mha;
import defpackage.t70;
import java.util.List;
/* compiled from: RectangleContent.java */
/* renamed from: q99  reason: default package */
/* loaded from: classes.dex */
public class q99 implements t70.b, qf5, qr7 {
    private final String c;
    private final boolean d;
    private final n e;
    private final t70<?, PointF> f;
    private final t70<?, PointF> g;
    private final t70<?, Float> h;
    private boolean k;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final to1 i = new to1();
    private t70<Float, Float> j = null;

    public q99(n nVar, v70 v70Var, r99 r99Var) {
        this.c = r99Var.c();
        this.d = r99Var.f();
        this.e = nVar;
        t70<PointF, PointF> a = r99Var.d().a();
        this.f = a;
        t70<PointF, PointF> a2 = r99Var.e().a();
        this.g = a2;
        t70<Float, Float> a3 = r99Var.b().a();
        this.h = a3;
        v70Var.i(a);
        v70Var.i(a2);
        v70Var.i(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    private void e() {
        this.k = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.t70.b
    public void a() {
        e();
    }

    @Override // defpackage.dt1
    public void b(List<dt1> list, List<dt1> list2) {
        for (int i = 0; i < list.size(); i++) {
            dt1 dt1Var = list.get(i);
            if (dt1Var instanceof bnb) {
                bnb bnbVar = (bnb) dt1Var;
                if (bnbVar.j() == mha.a.SIMULTANEOUSLY) {
                    this.i.a(bnbVar);
                    bnbVar.e(this);
                }
            }
            if (dt1Var instanceof oo9) {
                this.j = ((oo9) dt1Var).g();
            }
        }
    }

    @Override // defpackage.pf5
    public <T> void f(T t, b06<T> b06Var) {
        if (t == xz5.l) {
            this.g.n(b06Var);
        } else if (t == xz5.n) {
            this.f.n(b06Var);
        } else if (t == xz5.m) {
            this.h.n(b06Var);
        }
    }

    @Override // defpackage.pf5
    public void g(of5 of5Var, int i, List<of5> list, of5 of5Var2) {
        ql6.k(of5Var, i, list, of5Var2, this);
    }

    @Override // defpackage.dt1
    public String getName() {
        return this.c;
    }

    @Override // defpackage.qr7
    public Path getPath() {
        float p;
        t70<Float, Float> t70Var;
        if (this.k) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.k = true;
            return this.a;
        }
        PointF h = this.g.h();
        float f = h.x / 2.0f;
        float f2 = h.y / 2.0f;
        t70<?, Float> t70Var2 = this.h;
        if (t70Var2 == null) {
            p = 0.0f;
        } else {
            p = ((hz3) t70Var2).p();
        }
        if (p == 0.0f && (t70Var = this.j) != null) {
            p = Math.min(t70Var.h().floatValue(), Math.min(f, f2));
        }
        float min = Math.min(f, f2);
        if (p > min) {
            p = min;
        }
        PointF h2 = this.f.h();
        this.a.moveTo(h2.x + f, (h2.y - f2) + p);
        this.a.lineTo(h2.x + f, (h2.y + f2) - p);
        int i = (p > 0.0f ? 1 : (p == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.b;
            float f3 = h2.x;
            float f4 = p * 2.0f;
            float f5 = h2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((h2.x - f) + p, h2.y + f2);
        if (i > 0) {
            RectF rectF2 = this.b;
            float f6 = h2.x;
            float f7 = h2.y;
            float f8 = p * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(h2.x - f, (h2.y - f2) + p);
        if (i > 0) {
            RectF rectF3 = this.b;
            float f9 = h2.x;
            float f10 = h2.y;
            float f11 = p * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((h2.x + f) - p, h2.y - f2);
        if (i > 0) {
            RectF rectF4 = this.b;
            float f12 = h2.x;
            float f13 = p * 2.0f;
            float f14 = h2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.i.b(this.a);
        this.k = true;
        return this.a;
    }
}
