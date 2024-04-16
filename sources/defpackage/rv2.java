package defpackage;
/* compiled from: DeliveryAddressListModule_ProvideDeliverablePlaceFormatterFactory.java */
/* renamed from: rv2  reason: default package */
/* loaded from: classes2.dex */
public final class rv2 implements no3<pu2> {
    private final as8<h8> a;
    private final as8<ly2> b;

    public rv2(as8<h8> as8Var, as8<ly2> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static rv2 a(as8<h8> as8Var, as8<ly2> as8Var2) {
        return new rv2(as8Var, as8Var2);
    }

    public static pu2 c(h8 h8Var, ly2 ly2Var) {
        return (pu2) jh8.e(ov2.a.c(h8Var, ly2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public pu2 get() {
        return c(this.a.get(), this.b.get());
    }
}
