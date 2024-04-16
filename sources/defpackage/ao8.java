package defpackage;

import android.content.Context;
import ru.dodopizza.app.presentation.profile.ProfilePresenter;
/* compiled from: ProfileModule_ProvideProfilePresenterFactory.java */
/* renamed from: ao8  reason: default package */
/* loaded from: classes3.dex */
public final class ao8 implements no3<ProfilePresenter> {
    private final as8<f63> a;
    private final as8<ef4> b;
    private final as8<wg6> c;
    private final as8<df4> d;
    private final as8<k63> e;
    private final as8<kn8> f;
    private final as8<zxa> g;
    private final as8<hq3> h;
    private final as8<f5b> i;
    private final as8<ih4> j;
    private final as8<Context> k;
    private final as8<ps1> l;
    private final as8<mh0> m;
    private final as8<gc> n;
    private final as8<i00> o;
    private final as8<zt6> p;
    private final as8<wt6> q;

    public ao8(as8<f63> as8Var, as8<ef4> as8Var2, as8<wg6> as8Var3, as8<df4> as8Var4, as8<k63> as8Var5, as8<kn8> as8Var6, as8<zxa> as8Var7, as8<hq3> as8Var8, as8<f5b> as8Var9, as8<ih4> as8Var10, as8<Context> as8Var11, as8<ps1> as8Var12, as8<mh0> as8Var13, as8<gc> as8Var14, as8<i00> as8Var15, as8<zt6> as8Var16, as8<wt6> as8Var17) {
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
        this.o = as8Var15;
        this.p = as8Var16;
        this.q = as8Var17;
    }

    public static ao8 a(as8<f63> as8Var, as8<ef4> as8Var2, as8<wg6> as8Var3, as8<df4> as8Var4, as8<k63> as8Var5, as8<kn8> as8Var6, as8<zxa> as8Var7, as8<hq3> as8Var8, as8<f5b> as8Var9, as8<ih4> as8Var10, as8<Context> as8Var11, as8<ps1> as8Var12, as8<mh0> as8Var13, as8<gc> as8Var14, as8<i00> as8Var15, as8<zt6> as8Var16, as8<wt6> as8Var17) {
        return new ao8(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10, as8Var11, as8Var12, as8Var13, as8Var14, as8Var15, as8Var16, as8Var17);
    }

    public static ProfilePresenter c(f63 f63Var, ef4 ef4Var, wg6 wg6Var, df4 df4Var, k63 k63Var, kn8 kn8Var, zxa zxaVar, hq3 hq3Var, f5b f5bVar, ih4 ih4Var, Context context, ps1 ps1Var, mh0 mh0Var, gc gcVar, i00 i00Var, zt6 zt6Var, wt6 wt6Var) {
        return (ProfilePresenter) jh8.e(xn8.a.c(f63Var, ef4Var, wg6Var, df4Var, k63Var, kn8Var, zxaVar, hq3Var, f5bVar, ih4Var, context, ps1Var, mh0Var, gcVar, i00Var, zt6Var, wt6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ProfilePresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get());
    }
}
