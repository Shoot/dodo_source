package defpackage;
/* compiled from: CashChargeModule_ProvideMoneyInputValidatorFactory.java */
/* renamed from: us0  reason: default package */
/* loaded from: classes3.dex */
public final class us0 implements no3<vn6> {
    private final as8<hq3> a;

    public us0(as8<hq3> as8Var) {
        this.a = as8Var;
    }

    public static us0 a(as8<hq3> as8Var) {
        return new us0(as8Var);
    }

    public static vn6 c(hq3 hq3Var) {
        return (vn6) jh8.e(qs0.a.d(hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public vn6 get() {
        return c(this.a.get());
    }
}
