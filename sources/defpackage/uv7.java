package defpackage;
/* compiled from: PaymentModule_ProvideSberPayFeatureStateResolverFactory.java */
/* renamed from: uv7  reason: default package */
/* loaded from: classes3.dex */
public final class uv7 implements no3<ut9> {
    private final as8<hq3> a;
    private final as8<cu9> b;

    public uv7(as8<hq3> as8Var, as8<cu9> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static uv7 a(as8<hq3> as8Var, as8<cu9> as8Var2) {
        return new uv7(as8Var, as8Var2);
    }

    public static ut9 c(hq3 hq3Var, cu9 cu9Var) {
        return (ut9) jh8.e(gu7.a.N(hq3Var, cu9Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ut9 get() {
        return c(this.a.get(), this.b.get());
    }
}
