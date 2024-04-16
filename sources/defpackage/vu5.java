package defpackage;
/* compiled from: LocalityModule_ProvideLocalityRepositoryConverterFactory.java */
/* renamed from: vu5  reason: default package */
/* loaded from: classes3.dex */
public final class vu5 implements no3<ev5> {
    private final as8<ht5> a;

    public vu5(as8<ht5> as8Var) {
        this.a = as8Var;
    }

    public static vu5 a(as8<ht5> as8Var) {
        return new vu5(as8Var);
    }

    public static ev5 c(ht5 ht5Var) {
        return (ev5) jh8.e(iu5.a.i(ht5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ev5 get() {
        return c(this.a.get());
    }
}
