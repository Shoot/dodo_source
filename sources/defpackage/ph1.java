package defpackage;
/* compiled from: ComboModule_ProvideComboSlotServiceFactory.java */
/* renamed from: ph1  reason: default package */
/* loaded from: classes3.dex */
public final class ph1 implements no3<gi1> {
    private final as8<ah6> a;
    private final as8<mxa> b;
    private final as8<gp4> c;
    private final as8<g78> d;
    private final as8<ds0> e;
    private final as8<c62> f;
    private final as8<ei1> g;

    public ph1(as8<ah6> as8Var, as8<mxa> as8Var2, as8<gp4> as8Var3, as8<g78> as8Var4, as8<ds0> as8Var5, as8<c62> as8Var6, as8<ei1> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static ph1 a(as8<ah6> as8Var, as8<mxa> as8Var2, as8<gp4> as8Var3, as8<g78> as8Var4, as8<ds0> as8Var5, as8<c62> as8Var6, as8<ei1> as8Var7) {
        return new ph1(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static gi1 c(ah6 ah6Var, mxa mxaVar, gp4 gp4Var, g78 g78Var, ds0 ds0Var, c62 c62Var, ei1 ei1Var) {
        return (gi1) jh8.e(mh1.a.c(ah6Var, mxaVar, gp4Var, g78Var, ds0Var, c62Var, ei1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gi1 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
