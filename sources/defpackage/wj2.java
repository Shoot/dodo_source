package defpackage;

import android.content.Context;
import defpackage.mmb;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerTransportRuntimeComponent.java */
/* renamed from: wj2  reason: default package */
/* loaded from: classes2.dex */
public final class wj2 extends mmb {
    private as8<Executor> a;
    private as8<Context> b;
    private as8 c;
    private as8 d;
    private as8 e;
    private as8<String> f;
    private as8<gs9> g;
    private as8<zv9> h;
    private as8<t7c> i;
    private as8<qr2> j;
    private as8<isb> k;
    private as8<e7c> l;
    private as8<lmb> m;

    /* compiled from: DaggerTransportRuntimeComponent.java */
    /* renamed from: wj2$b */
    /* loaded from: classes2.dex */
    private static final class b implements mmb.a {
        private Context a;

        private b() {
        }

        @Override // defpackage.mmb.a
        public mmb a() {
            fh8.a(this.a, Context.class);
            return new wj2(this.a);
        }

        @Override // defpackage.mmb.a
        /* renamed from: c */
        public b b(Context context) {
            this.a = (Context) fh8.b(context);
            return this;
        }
    }

    public static mmb.a c() {
        return new b();
    }

    private void e(Context context) {
        this.a = q63.a(dm3.a());
        oo3 a2 = a55.a(context);
        this.b = a2;
        m22 a3 = m22.a(a2, ngb.a(), ogb.a());
        this.c = a3;
        this.d = q63.a(ni6.a(this.b, a3));
        this.e = pw9.a(this.b, hl3.a(), jl3.a());
        this.f = q63.a(il3.a(this.b));
        this.g = q63.a(hs9.a(ngb.a(), ogb.a(), kl3.a(), this.e, this.f));
        gw9 b2 = gw9.b(ngb.a());
        this.h = b2;
        iw9 a4 = iw9.a(this.b, this.g, b2, ogb.a());
        this.i = a4;
        as8<Executor> as8Var = this.a;
        as8 as8Var2 = this.d;
        as8<gs9> as8Var3 = this.g;
        this.j = rr2.a(as8Var, as8Var2, a4, as8Var3, as8Var3);
        as8<Context> as8Var4 = this.b;
        as8 as8Var5 = this.d;
        as8<gs9> as8Var6 = this.g;
        this.k = jsb.a(as8Var4, as8Var5, as8Var6, this.i, this.a, as8Var6, ngb.a(), ogb.a(), this.g);
        as8<Executor> as8Var7 = this.a;
        as8<gs9> as8Var8 = this.g;
        this.l = f7c.a(as8Var7, as8Var8, this.i, as8Var8);
        this.m = q63.a(nmb.a(ngb.a(), ogb.a(), this.j, this.k, this.l));
    }

    @Override // defpackage.mmb
    el3 a() {
        return this.g.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.mmb
    public lmb b() {
        return this.m.get();
    }

    private wj2(Context context) {
        e(context);
    }
}
