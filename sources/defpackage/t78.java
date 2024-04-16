package defpackage;
/* compiled from: PizzaProductCardModule_ProvidePizzaProductCardInteractorFactory.java */
/* renamed from: t78  reason: default package */
/* loaded from: classes2.dex */
public final class t78 implements no3<q78> {
    private final as8<ah6> a;
    private final as8<ds0> b;
    private final as8<c62> c;
    private final as8<sq0> d;
    private final as8<gc> e;
    private final as8<y78> f;

    public t78(as8<ah6> as8Var, as8<ds0> as8Var2, as8<c62> as8Var3, as8<sq0> as8Var4, as8<gc> as8Var5, as8<y78> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static t78 a(as8<ah6> as8Var, as8<ds0> as8Var2, as8<c62> as8Var3, as8<sq0> as8Var4, as8<gc> as8Var5, as8<y78> as8Var6) {
        return new t78(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static q78 c(ah6 ah6Var, ds0 ds0Var, c62 c62Var, sq0 sq0Var, gc gcVar, y78 y78Var) {
        return (q78) jh8.e(r78.a.b(ah6Var, ds0Var, c62Var, sq0Var, gcVar, y78Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public q78 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
