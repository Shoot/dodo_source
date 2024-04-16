package defpackage;
/* compiled from: PaymentModule_ProvideCheckoutApiOkHttpClientFactory.java */
/* renamed from: pu7  reason: default package */
/* loaded from: classes3.dex */
public final class pu7 implements no3<b77> {
    private final as8<rn2> a;

    public pu7(as8<rn2> as8Var) {
        this.a = as8Var;
    }

    public static pu7 a(as8<rn2> as8Var) {
        return new pu7(as8Var);
    }

    public static b77 c(rn2 rn2Var) {
        return (b77) jh8.e(gu7.a.i(rn2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public b77 get() {
        return c(this.a.get());
    }
}
