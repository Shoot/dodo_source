package defpackage;
/* compiled from: KustoModule_ProvideKustoMetaDataCollectorFactory.java */
/* renamed from: gi5  reason: default package */
/* loaded from: classes3.dex */
public final class gi5 implements no3<ai5> {
    private final as8<ji5> a;
    private final as8<ih4> b;

    public gi5(as8<ji5> as8Var, as8<ih4> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static gi5 a(as8<ji5> as8Var, as8<ih4> as8Var2) {
        return new gi5(as8Var, as8Var2);
    }

    public static ai5 c(ji5 ji5Var, ih4 ih4Var) {
        return (ai5) jh8.e(bi5.a.e(ji5Var, ih4Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ai5 get() {
        return c(this.a.get(), this.b.get());
    }
}
