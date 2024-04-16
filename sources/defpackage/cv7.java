package defpackage;
/* compiled from: PaymentModule_ProvideMakePaymentAnalyticsFactory.java */
/* renamed from: cv7  reason: default package */
/* loaded from: classes3.dex */
public final class cv7 implements no3<q56> {
    private final as8<gc> a;
    private final as8<ava> b;

    public cv7(as8<gc> as8Var, as8<ava> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static cv7 a(as8<gc> as8Var, as8<ava> as8Var2) {
        return new cv7(as8Var, as8Var2);
    }

    public static q56 c(gc gcVar, ava avaVar) {
        return (q56) jh8.e(gu7.a.v(gcVar, avaVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public q56 get() {
        return c(this.a.get(), this.b.get());
    }
}
