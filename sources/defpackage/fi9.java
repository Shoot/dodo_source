package defpackage;
/* compiled from: RepositoryModule_ProvideWorkflowIdProviderFactory.java */
/* renamed from: fi9  reason: default package */
/* loaded from: classes3.dex */
public final class fi9 implements no3<f8c> {
    private final tg9 a;
    private final as8<cva> b;

    public fi9(tg9 tg9Var, as8<cva> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static fi9 a(tg9 tg9Var, as8<cva> as8Var) {
        return new fi9(tg9Var, as8Var);
    }

    public static f8c c(tg9 tg9Var, cva cvaVar) {
        return (f8c) jh8.e(tg9Var.L(cvaVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public f8c get() {
        return c(this.a, this.b.get());
    }
}
