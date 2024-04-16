package defpackage;
/* compiled from: PizzaProductCardModule_ProvidePizzaProductCardVOFactoryFactory.java */
/* renamed from: u78  reason: default package */
/* loaded from: classes2.dex */
public final class u78 implements no3<y78> {
    private final as8<ah6> a;
    private final as8<mxa> b;
    private final as8<g78> c;
    private final as8<e78> d;
    private final as8<ds0> e;
    private final as8<c62> f;
    private final as8<wr2> g;

    public u78(as8<ah6> as8Var, as8<mxa> as8Var2, as8<g78> as8Var3, as8<e78> as8Var4, as8<ds0> as8Var5, as8<c62> as8Var6, as8<wr2> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static u78 a(as8<ah6> as8Var, as8<mxa> as8Var2, as8<g78> as8Var3, as8<e78> as8Var4, as8<ds0> as8Var5, as8<c62> as8Var6, as8<wr2> as8Var7) {
        return new u78(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static y78 c(ah6 ah6Var, mxa mxaVar, g78 g78Var, e78 e78Var, ds0 ds0Var, c62 c62Var, wr2 wr2Var) {
        return (y78) jh8.e(r78.a.c(ah6Var, mxaVar, g78Var, e78Var, ds0Var, c62Var, wr2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public y78 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
