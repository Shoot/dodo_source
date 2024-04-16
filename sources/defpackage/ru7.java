package defpackage;
/* compiled from: PaymentModule_ProvideEncryptionDataConverterRegistryFactory.java */
/* renamed from: ru7  reason: default package */
/* loaded from: classes3.dex */
public final class ru7 implements no3<sh3> {
    private final as8<qh3> a;

    public ru7(as8<qh3> as8Var) {
        this.a = as8Var;
    }

    public static ru7 a(as8<qh3> as8Var) {
        return new ru7(as8Var);
    }

    public static sh3 c(qh3 qh3Var) {
        return (sh3) jh8.e(gu7.a.k(qh3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public sh3 get() {
        return c(this.a.get());
    }
}
