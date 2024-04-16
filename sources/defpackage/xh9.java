package defpackage;
/* compiled from: RepositoryModule_ProvideStateConverterFactory.java */
/* renamed from: xh9  reason: default package */
/* loaded from: classes3.dex */
public final class xh9 implements no3<gua> {
    private final tg9 a;
    private final as8<hua> b;

    public xh9(tg9 tg9Var, as8<hua> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static xh9 a(tg9 tg9Var, as8<hua> as8Var) {
        return new xh9(tg9Var, as8Var);
    }

    public static gua c(tg9 tg9Var, hua huaVar) {
        return (gua) jh8.e(tg9Var.D(huaVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gua get() {
        return c(this.a, this.b.get());
    }
}
