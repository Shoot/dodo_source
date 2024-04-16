package defpackage;
/* compiled from: RepositoryModule_ProvidePersonalPriceConverterFactory.java */
/* renamed from: ph9  reason: default package */
/* loaded from: classes3.dex */
public final class ph9 implements no3<xf6> {
    private final tg9 a;
    private final as8<fda> b;

    public ph9(tg9 tg9Var, as8<fda> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static ph9 a(tg9 tg9Var, as8<fda> as8Var) {
        return new ph9(tg9Var, as8Var);
    }

    public static xf6 c(tg9 tg9Var, fda fdaVar) {
        return (xf6) jh8.e(tg9Var.v(fdaVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public xf6 get() {
        return c(this.a, this.b.get());
    }
}
