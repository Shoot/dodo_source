package defpackage;
/* compiled from: PaymentModule_ProvidePaymentWayRepositoryFactory.java */
/* renamed from: pv7  reason: default package */
/* loaded from: classes3.dex */
public final class pv7 implements no3<qw7> {
    private final as8<jk2> a;
    private final as8<ow7> b;

    public pv7(as8<jk2> as8Var, as8<ow7> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static pv7 a(as8<jk2> as8Var, as8<ow7> as8Var2) {
        return new pv7(as8Var, as8Var2);
    }

    public static qw7 c(jk2 jk2Var, ow7 ow7Var) {
        return (qw7) jh8.e(gu7.a.I(jk2Var, ow7Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public qw7 get() {
        return c(this.a.get(), this.b.get());
    }
}
