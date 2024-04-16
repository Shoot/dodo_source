package defpackage;
/* compiled from: FoodMenuModule_ProvideMinDeliveryPriceProviderFactory.java */
/* renamed from: o44  reason: default package */
/* loaded from: classes3.dex */
public final class o44 implements no3<fj6> {
    private final as8<ava> a;
    private final as8<hq3> b;
    private final as8<fq0> c;
    private final as8<ej6> d;

    public o44(as8<ava> as8Var, as8<hq3> as8Var2, as8<fq0> as8Var3, as8<ej6> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static o44 a(as8<ava> as8Var, as8<hq3> as8Var2, as8<fq0> as8Var3, as8<ej6> as8Var4) {
        return new o44(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static fj6 c(ava avaVar, hq3 hq3Var, fq0 fq0Var, ej6 ej6Var) {
        return (fj6) jh8.e(f44.a.i(avaVar, hq3Var, fq0Var, ej6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public fj6 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
