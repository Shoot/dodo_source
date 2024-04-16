package defpackage;
/* compiled from: CartModule_ProvideMinDeliveryPriceInfoProviderFactory.java */
/* renamed from: kr0  reason: default package */
/* loaded from: classes3.dex */
public final class kr0 implements no3<ej6> {
    private final as8<cs0> a;
    private final as8<fq0> b;
    private final as8<hq3> c;

    public kr0(as8<cs0> as8Var, as8<fq0> as8Var2, as8<hq3> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static kr0 a(as8<cs0> as8Var, as8<fq0> as8Var2, as8<hq3> as8Var3) {
        return new kr0(as8Var, as8Var2, as8Var3);
    }

    public static ej6 c(cs0 cs0Var, fq0 fq0Var, hq3 hq3Var) {
        return (ej6) jh8.e(yq0.a.l(cs0Var, fq0Var, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ej6 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
