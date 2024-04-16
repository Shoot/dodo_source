package defpackage;
/* compiled from: ProfileModule_ProvideDeliveryAddressListDataFactoryFactory.java */
/* renamed from: yn8  reason: default package */
/* loaded from: classes3.dex */
public final class yn8 implements no3<jv2> {
    private final as8<fq0> a;
    private final as8<ay1> b;
    private final as8<ava> c;
    private final as8<jv5> d;

    public yn8(as8<fq0> as8Var, as8<ay1> as8Var2, as8<ava> as8Var3, as8<jv5> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static yn8 a(as8<fq0> as8Var, as8<ay1> as8Var2, as8<ava> as8Var3, as8<jv5> as8Var4) {
        return new yn8(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static jv2 c(fq0 fq0Var, ay1 ay1Var, ava avaVar, jv5 jv5Var) {
        return (jv2) jh8.e(xn8.a.a(fq0Var, ay1Var, avaVar, jv5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public jv2 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
