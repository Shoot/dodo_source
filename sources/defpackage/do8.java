package defpackage;
/* compiled from: ProfileModule_ProvideSelectDeliveryAddressDataFactoryFactory.java */
/* renamed from: do8  reason: default package */
/* loaded from: classes3.dex */
public final class do8 implements no3<f5a> {
    private final as8<fq0> a;
    private final as8<ay1> b;
    private final as8<ava> c;
    private final as8<jv5> d;
    private final as8<x42> e;

    public do8(as8<fq0> as8Var, as8<ay1> as8Var2, as8<ava> as8Var3, as8<jv5> as8Var4, as8<x42> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static do8 a(as8<fq0> as8Var, as8<ay1> as8Var2, as8<ava> as8Var3, as8<jv5> as8Var4, as8<x42> as8Var5) {
        return new do8(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static f5a c(fq0 fq0Var, ay1 ay1Var, ava avaVar, jv5 jv5Var, x42 x42Var) {
        return (f5a) jh8.e(xn8.a.f(fq0Var, ay1Var, avaVar, jv5Var, x42Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public f5a get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
