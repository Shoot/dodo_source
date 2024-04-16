package defpackage;
/* compiled from: DeliveryAddressListModule_ProvideAddressFormatterFactoryFactory.java */
/* renamed from: qv2  reason: default package */
/* loaded from: classes2.dex */
public final class qv2 implements no3<i8> {
    private final as8<hq3> a;

    public qv2(as8<hq3> as8Var) {
        this.a = as8Var;
    }

    public static qv2 a(as8<hq3> as8Var) {
        return new qv2(as8Var);
    }

    public static i8 c(hq3 hq3Var) {
        return (i8) jh8.e(ov2.a.b(hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public i8 get() {
        return c(this.a.get());
    }
}
