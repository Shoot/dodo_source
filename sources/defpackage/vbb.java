package defpackage;

import java.util.List;
/* compiled from: TextKeyframeAnimation.java */
/* renamed from: vbb  reason: default package */
/* loaded from: classes.dex */
public class vbb extends mg5<k53> {

    /* compiled from: TextKeyframeAnimation.java */
    /* renamed from: vbb$a */
    /* loaded from: classes.dex */
    class a extends b06<k53> {
        final /* synthetic */ qz5 d;
        final /* synthetic */ b06 e;
        final /* synthetic */ k53 f;

        a(qz5 qz5Var, b06 b06Var, k53 k53Var) {
            this.d = qz5Var;
            this.e = b06Var;
            this.f = k53Var;
        }

        @Override // defpackage.b06
        /* renamed from: d */
        public k53 a(qz5<k53> qz5Var) {
            k53 g;
            this.d.h(qz5Var.f(), qz5Var.a(), qz5Var.g().a, qz5Var.b().a, qz5Var.d(), qz5Var.c(), qz5Var.e());
            String str = (String) this.e.a(this.d);
            if (qz5Var.c() == 1.0f) {
                g = qz5Var.b();
            } else {
                g = qz5Var.g();
            }
            k53 k53Var = g;
            this.f.a(str, k53Var.b, k53Var.c, k53Var.d, k53Var.e, k53Var.f, k53Var.g, k53Var.h, k53Var.i, k53Var.j, k53Var.k);
            return this.f;
        }
    }

    public vbb(List<lg5<k53>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t70
    /* renamed from: p */
    public k53 i(lg5<k53> lg5Var, float f) {
        k53 k53Var;
        float floatValue;
        k53 k53Var2;
        b06<A> b06Var = this.e;
        if (b06Var != 0) {
            float f2 = lg5Var.g;
            Float f3 = lg5Var.h;
            if (f3 == null) {
                floatValue = Float.MAX_VALUE;
            } else {
                floatValue = f3.floatValue();
            }
            k53 k53Var3 = lg5Var.b;
            k53 k53Var4 = k53Var3;
            k53 k53Var5 = lg5Var.c;
            if (k53Var5 == null) {
                k53Var2 = k53Var3;
            } else {
                k53Var2 = k53Var5;
            }
            return (k53) b06Var.b(f2, floatValue, k53Var4, k53Var2, f, d(), f());
        } else if (f == 1.0f && (k53Var = lg5Var.c) != null) {
            return k53Var;
        } else {
            return lg5Var.b;
        }
    }

    public void q(b06<String> b06Var) {
        super.n(new a(new qz5(), b06Var, new k53()));
    }
}
