package defpackage;
/* compiled from: CheckoutDetailsModule_ProvideCheckoutDetailsRouterFactory.java */
/* renamed from: m41  reason: default package */
/* loaded from: classes3.dex */
public final class m41 implements no3<s41> {
    private final as8<f63> a;

    public m41(as8<f63> as8Var) {
        this.a = as8Var;
    }

    public static m41 a(as8<f63> as8Var) {
        return new m41(as8Var);
    }

    public static s41 c(f63 f63Var) {
        return (s41) jh8.e(l41.a.a(f63Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public s41 get() {
        return c(this.a.get());
    }
}
