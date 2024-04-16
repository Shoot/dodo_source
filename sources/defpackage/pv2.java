package defpackage;
/* compiled from: DeliveryAddressListModule_ProvideAddressFormatterFactory.java */
/* renamed from: pv2  reason: default package */
/* loaded from: classes2.dex */
public final class pv2 implements no3<h8> {
    private final as8<iv2> a;
    private final as8<i8> b;

    public pv2(as8<iv2> as8Var, as8<i8> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static pv2 a(as8<iv2> as8Var, as8<i8> as8Var2) {
        return new pv2(as8Var, as8Var2);
    }

    public static h8 c(iv2 iv2Var, i8 i8Var) {
        return (h8) jh8.e(ov2.a.a(iv2Var, i8Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public h8 get() {
        return c(this.a.get(), this.b.get());
    }
}
