package defpackage;
/* compiled from: MenuUpdateInteractor_Factory.java */
/* renamed from: fh6  reason: default package */
/* loaded from: classes4.dex */
public final class fh6 implements no3<eh6> {
    private final as8<dt5> a;
    private final as8<ah6> b;
    private final as8<hq3> c;
    private final as8<k63> d;
    private final as8<bia> e;
    private final as8<ava> f;
    private final as8<gc> g;
    private final as8<ih6> h;
    private final as8<kx1> i;
    private final as8<qx1> j;

    public fh6(as8<dt5> as8Var, as8<ah6> as8Var2, as8<hq3> as8Var3, as8<k63> as8Var4, as8<bia> as8Var5, as8<ava> as8Var6, as8<gc> as8Var7, as8<ih6> as8Var8, as8<kx1> as8Var9, as8<qx1> as8Var10) {
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
    }

    public static fh6 a(as8<dt5> as8Var, as8<ah6> as8Var2, as8<hq3> as8Var3, as8<k63> as8Var4, as8<bia> as8Var5, as8<ava> as8Var6, as8<gc> as8Var7, as8<ih6> as8Var8, as8<kx1> as8Var9, as8<qx1> as8Var10) {
        return new fh6(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10);
    }

    public static eh6 c(dt5 dt5Var, ah6 ah6Var, hq3 hq3Var, k63 k63Var, bia biaVar, ava avaVar, gc gcVar, ih6 ih6Var, kx1 kx1Var, qx1 qx1Var) {
        return new eh6(dt5Var, ah6Var, hq3Var, k63Var, biaVar, avaVar, gcVar, ih6Var, kx1Var, qx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public eh6 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
