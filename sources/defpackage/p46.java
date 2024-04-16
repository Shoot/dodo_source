package defpackage;

import ru.dodopizza.app.presentation.main.MainActivityPresenter;
import ru.dodopizza.app.presentation.main.a;
/* compiled from: MainActivityPresenter_Factory.java */
/* renamed from: p46  reason: default package */
/* loaded from: classes4.dex */
public final class p46 implements no3<MainActivityPresenter> {
    private final as8<Cdo> a;
    private final as8<f63> b;
    private final as8<ci8> c;
    private final as8<gc> d;
    private final as8<l46> e;
    private final as8<dq3> f;
    private final as8<hp> g;
    private final as8<vc6> h;
    private final as8<k63> i;
    private final as8<fz4> j;
    private final as8<m37> k;
    private final as8<e55> l;
    private final as8<mqb> m;
    private final as8<a> n;

    public p46(as8<Cdo> as8Var, as8<f63> as8Var2, as8<ci8> as8Var3, as8<gc> as8Var4, as8<l46> as8Var5, as8<dq3> as8Var6, as8<hp> as8Var7, as8<vc6> as8Var8, as8<k63> as8Var9, as8<fz4> as8Var10, as8<m37> as8Var11, as8<e55> as8Var12, as8<mqb> as8Var13, as8<a> as8Var14) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
        this.i = as8Var9;
        this.j = as8Var10;
        this.k = as8Var11;
        this.l = as8Var12;
        this.m = as8Var13;
        this.n = as8Var14;
    }

    public static p46 a(as8<Cdo> as8Var, as8<f63> as8Var2, as8<ci8> as8Var3, as8<gc> as8Var4, as8<l46> as8Var5, as8<dq3> as8Var6, as8<hp> as8Var7, as8<vc6> as8Var8, as8<k63> as8Var9, as8<fz4> as8Var10, as8<m37> as8Var11, as8<e55> as8Var12, as8<mqb> as8Var13, as8<a> as8Var14) {
        return new p46(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10, as8Var11, as8Var12, as8Var13, as8Var14);
    }

    public static MainActivityPresenter c(Cdo cdo, f63 f63Var, ci8 ci8Var, gc gcVar, l46 l46Var, dq3 dq3Var, hp hpVar, vc6 vc6Var, k63 k63Var, fz4 fz4Var, m37 m37Var, e55 e55Var, mqb mqbVar, a aVar) {
        return new MainActivityPresenter(cdo, f63Var, ci8Var, gcVar, l46Var, dq3Var, hpVar, vc6Var, k63Var, fz4Var, m37Var, e55Var, mqbVar, aVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public MainActivityPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get());
    }
}
