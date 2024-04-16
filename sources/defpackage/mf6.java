package defpackage;

import ru.dodopizza.backend.domain.menu.MenuAPI;
/* compiled from: MenuModule_ProvideHotAndReadyServiceFactory.java */
/* renamed from: mf6  reason: default package */
/* loaded from: classes3.dex */
public final class mf6 implements no3<gp4> {
    private final as8<ava> a;
    private final as8<cp4> b;
    private final as8<ep4> c;
    private final as8<MenuAPI> d;
    private final as8<ne6> e;
    private final as8<pe6> f;
    private final as8<ip4> g;
    private final as8<k63> h;
    private final as8<hq3> i;

    public mf6(as8<ava> as8Var, as8<cp4> as8Var2, as8<ep4> as8Var3, as8<MenuAPI> as8Var4, as8<ne6> as8Var5, as8<pe6> as8Var6, as8<ip4> as8Var7, as8<k63> as8Var8, as8<hq3> as8Var9) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
        this.i = as8Var9;
    }

    public static mf6 a(as8<ava> as8Var, as8<cp4> as8Var2, as8<ep4> as8Var3, as8<MenuAPI> as8Var4, as8<ne6> as8Var5, as8<pe6> as8Var6, as8<ip4> as8Var7, as8<k63> as8Var8, as8<hq3> as8Var9) {
        return new mf6(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9);
    }

    public static gp4 c(ava avaVar, cp4 cp4Var, ep4 ep4Var, MenuAPI menuAPI, ne6 ne6Var, pe6 pe6Var, ip4 ip4Var, k63 k63Var, hq3 hq3Var) {
        return (gp4) jh8.e(jf6.a.c(avaVar, cp4Var, ep4Var, menuAPI, ne6Var, pe6Var, ip4Var, k63Var, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gp4 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
