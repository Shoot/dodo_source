package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.n;
import defpackage.mha;
import defpackage.t70;
import java.util.List;
/* compiled from: EllipseContent.java */
/* renamed from: bf3  reason: default package */
/* loaded from: classes.dex */
public class bf3 implements qr7, t70.b, qf5 {
    private final String b;
    private final n c;
    private final t70<?, PointF> d;
    private final t70<?, PointF> e;
    private final z71 f;
    private boolean h;
    private final Path a = new Path();
    private final to1 g = new to1();

    public bf3(n nVar, v70 v70Var, z71 z71Var) {
        this.b = z71Var.b();
        this.c = nVar;
        t70<PointF, PointF> a = z71Var.d().a();
        this.d = a;
        t70<PointF, PointF> a2 = z71Var.c().a();
        this.e = a2;
        this.f = z71Var;
        v70Var.i(a);
        v70Var.i(a2);
        a.a(this);
        a2.a(this);
    }

    private void e() {
        this.h = false;
        this.c.invalidateSelf();
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
                    this.g.a(bnbVar);
                    bnbVar.e(this);
                }
            }
        }
    }

    @Override // defpackage.pf5
    public <T> void f(T t, b06<T> b06Var) {
        if (t == xz5.k) {
            this.d.n(b06Var);
        } else if (t == xz5.n) {
            this.e.n(b06Var);
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
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e()) {
            this.h = true;
            return this.a;
        }
        PointF h = this.d.h();
        float f = h.x / 2.0f;
        float f2 = h.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.a.reset();
        if (this.f.f()) {
            float f5 = -f2;
            this.a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF h2 = this.e.h();
        this.a.offset(h2.x, h2.y);
        this.a.close();
        this.g.b(this.a);
        this.h = true;
        return this.a;
    }
}
