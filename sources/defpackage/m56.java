package defpackage;

import ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter;
import ru.dodopizza.app.presentation.mainscreen.a;
/* compiled from: MainScreenPresenter_Factory.java */
/* renamed from: m56  reason: default package */
/* loaded from: classes4.dex */
public final class m56 implements no3<MainScreenPresenter> {
    private final as8<a> a;
    private final as8<k63> b;
    private final as8<f63> c;
    private final as8<wo2> d;
    private final as8<zt6> e;
    private final as8<wt6> f;
    private final as8<qt6> g;
    private final as8<zb3> h;
    private final as8<y18> i;
    private final as8<hq3> j;
    private final as8<n56> k;
    private final as8<hl8> l;
    private final as8<ih4> m;
    private final as8<jo> n;

    public m56(as8<a> as8Var, as8<k63> as8Var2, as8<f63> as8Var3, as8<wo2> as8Var4, as8<zt6> as8Var5, as8<wt6> as8Var6, as8<qt6> as8Var7, as8<zb3> as8Var8, as8<y18> as8Var9, as8<hq3> as8Var10, as8<n56> as8Var11, as8<hl8> as8Var12, as8<ih4> as8Var13, as8<jo> as8Var14) {
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

    public static m56 a(as8<a> as8Var, as8<k63> as8Var2, as8<f63> as8Var3, as8<wo2> as8Var4, as8<zt6> as8Var5, as8<wt6> as8Var6, as8<qt6> as8Var7, as8<zb3> as8Var8, as8<y18> as8Var9, as8<hq3> as8Var10, as8<n56> as8Var11, as8<hl8> as8Var12, as8<ih4> as8Var13, as8<jo> as8Var14) {
        return new m56(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10, as8Var11, as8Var12, as8Var13, as8Var14);
    }

    public static MainScreenPresenter c(a aVar, k63 k63Var, f63 f63Var, wo2 wo2Var, zt6 zt6Var, wt6 wt6Var, qt6 qt6Var, zb3 zb3Var, y18 y18Var, hq3 hq3Var, n56 n56Var, hl8 hl8Var, ih4 ih4Var, jo joVar) {
        return new MainScreenPresenter(aVar, k63Var, f63Var, wo2Var, zt6Var, wt6Var, qt6Var, zb3Var, y18Var, hq3Var, n56Var, hl8Var, ih4Var, joVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public MainScreenPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get());
    }
}
