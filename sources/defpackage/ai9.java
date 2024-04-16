package defpackage;
/* compiled from: RepositoryModule_ProvideStopRepositoryFactory.java */
/* renamed from: ai9  reason: default package */
/* loaded from: classes3.dex */
public final class ai9 implements no3<mxa> {
    private final tg9 a;
    private final as8<ava> b;

    public ai9(tg9 tg9Var, as8<ava> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static ai9 a(tg9 tg9Var, as8<ava> as8Var) {
        return new ai9(tg9Var, as8Var);
    }

    public static mxa c(tg9 tg9Var, ava avaVar) {
        return (mxa) jh8.e(tg9Var.G(avaVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public mxa get() {
        return c(this.a, this.b.get());
    }
}
