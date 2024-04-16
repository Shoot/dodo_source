package defpackage;
/* compiled from: RepositoryModule_ProvideStateAnalyzerFactory.java */
/* renamed from: wh9  reason: default package */
/* loaded from: classes3.dex */
public final class wh9 implements no3<dua> {
    private final tg9 a;
    private final as8<eua> b;

    public wh9(tg9 tg9Var, as8<eua> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static wh9 a(tg9 tg9Var, as8<eua> as8Var) {
        return new wh9(tg9Var, as8Var);
    }

    public static dua c(tg9 tg9Var, eua euaVar) {
        return (dua) jh8.e(tg9Var.C(euaVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public dua get() {
        return c(this.a, this.b.get());
    }
}
