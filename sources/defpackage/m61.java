package defpackage;
/* compiled from: CheckoutStateModule_ProvideAnalyticsHelperFactory.java */
/* renamed from: m61  reason: default package */
/* loaded from: classes3.dex */
public final class m61 implements no3<ad> {
    private final l61 a;
    private final as8<ava> b;
    private final as8<a98> c;
    private final as8<gc> d;
    private final as8<jgb> e;
    private final as8<j2c> f;

    public m61(l61 l61Var, as8<ava> as8Var, as8<a98> as8Var2, as8<gc> as8Var3, as8<jgb> as8Var4, as8<j2c> as8Var5) {
        this.a = l61Var;
        this.b = as8Var;
        this.c = as8Var2;
        this.d = as8Var3;
        this.e = as8Var4;
        this.f = as8Var5;
    }

    public static m61 a(l61 l61Var, as8<ava> as8Var, as8<a98> as8Var2, as8<gc> as8Var3, as8<jgb> as8Var4, as8<j2c> as8Var5) {
        return new m61(l61Var, as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static ad c(l61 l61Var, ava avaVar, a98 a98Var, gc gcVar, jgb jgbVar, j2c j2cVar) {
        return (ad) jh8.e(l61Var.a(avaVar, a98Var, gcVar, jgbVar, j2cVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ad get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
