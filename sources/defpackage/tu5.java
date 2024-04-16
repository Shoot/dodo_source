package defpackage;
/* compiled from: LocalityModule_ProvideLocalityInfoRepositoryConverterFactory.java */
/* renamed from: tu5  reason: default package */
/* loaded from: classes3.dex */
public final class tu5 implements no3<ot5> {
    private final as8<dv5> a;

    public tu5(as8<dv5> as8Var) {
        this.a = as8Var;
    }

    public static tu5 a(as8<dv5> as8Var) {
        return new tu5(as8Var);
    }

    public static ot5 c(dv5 dv5Var) {
        return (ot5) jh8.e(iu5.a.g(dv5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ot5 get() {
        return c(this.a.get());
    }
}
