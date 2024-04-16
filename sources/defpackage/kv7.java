package defpackage;
/* compiled from: PaymentModule_ProvidePaymentRepositoryFactory.java */
/* renamed from: kv7  reason: default package */
/* loaded from: classes3.dex */
public final class kv7 implements no3<xv7> {
    private final as8<jk2> a;

    public kv7(as8<jk2> as8Var) {
        this.a = as8Var;
    }

    public static kv7 a(as8<jk2> as8Var) {
        return new kv7(as8Var);
    }

    public static xv7 c(jk2 jk2Var) {
        return (xv7) jh8.e(gu7.a.D(jk2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public xv7 get() {
        return c(this.a.get());
    }
}
