package defpackage;
/* compiled from: PaymentModule_ProvideApp2AppFeatureStateResolverFactory.java */
/* renamed from: lu7  reason: default package */
/* loaded from: classes3.dex */
public final class lu7 implements no3<rm> {
    private final as8<hq3> a;

    public lu7(as8<hq3> as8Var) {
        this.a = as8Var;
    }

    public static lu7 a(as8<hq3> as8Var) {
        return new lu7(as8Var);
    }

    public static rm c(hq3 hq3Var) {
        return (rm) jh8.e(gu7.a.e(hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public rm get() {
        return c(this.a.get());
    }
}
