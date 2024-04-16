package defpackage;
/* compiled from: PaymentMethodListModule_ProvidePaymentMethodListRouterFactory.java */
/* renamed from: tt7  reason: default package */
/* loaded from: classes3.dex */
public final class tt7 implements no3<ut7> {
    private final as8<f63> a;

    public tt7(as8<f63> as8Var) {
        this.a = as8Var;
    }

    public static tt7 a(as8<f63> as8Var) {
        return new tt7(as8Var);
    }

    public static ut7 c(f63 f63Var) {
        return (ut7) jh8.e(qt7.a.c(f63Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ut7 get() {
        return c(this.a.get());
    }
}
