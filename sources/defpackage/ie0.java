package defpackage;
/* compiled from: BonusActionModule_ProvidePersonalOfferVOConverterFactory.java */
/* renamed from: ie0  reason: default package */
/* loaded from: classes3.dex */
public final class ie0 implements no3<l08> {
    private final as8<fda> a;
    private final as8<f5b> b;
    private final as8<bq> c;
    private final as8<hq3> d;

    public ie0(as8<fda> as8Var, as8<f5b> as8Var2, as8<bq> as8Var3, as8<hq3> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static ie0 a(as8<fda> as8Var, as8<f5b> as8Var2, as8<bq> as8Var3, as8<hq3> as8Var4) {
        return new ie0(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static l08 c(fda fdaVar, f5b f5bVar, bq bqVar, hq3 hq3Var) {
        return (l08) jh8.e(fe0.a.c(fdaVar, f5bVar, bqVar, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public l08 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
