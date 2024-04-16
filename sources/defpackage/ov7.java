package defpackage;
/* compiled from: PaymentModule_ProvidePaymentWayMapperFactory.java */
/* renamed from: ov7  reason: default package */
/* loaded from: classes3.dex */
public final class ov7 implements no3<ow7> {
    private final as8<nw7> a;
    private final as8<xg4> b;

    public ov7(as8<nw7> as8Var, as8<xg4> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static ov7 a(as8<nw7> as8Var, as8<xg4> as8Var2) {
        return new ov7(as8Var, as8Var2);
    }

    public static ow7 c(nw7 nw7Var, xg4 xg4Var) {
        return (ow7) jh8.e(gu7.a.H(nw7Var, xg4Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ow7 get() {
        return c(this.a.get(), this.b.get());
    }
}
