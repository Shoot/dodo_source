package defpackage;
/* compiled from: RepositoryModule_ProvideStateProviderFactory.java */
/* renamed from: yh9  reason: default package */
/* loaded from: classes3.dex */
public final class yh9 implements no3<ava> {
    private final tg9 a;
    private final as8<cva> b;

    public yh9(tg9 tg9Var, as8<cva> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static yh9 a(tg9 tg9Var, as8<cva> as8Var) {
        return new yh9(tg9Var, as8Var);
    }

    public static ava c(tg9 tg9Var, cva cvaVar) {
        return (ava) jh8.e(tg9Var.E(cvaVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ava get() {
        return c(this.a, this.b.get());
    }
}
