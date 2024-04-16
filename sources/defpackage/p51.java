package defpackage;

import com.dodopizza.geo.feature.selectdeliveryaddress.a;
/* compiled from: CheckoutModule_ProvideSelectDeliveryAddressAppRouterFactory.java */
/* renamed from: p51  reason: default package */
/* loaded from: classes3.dex */
public final class p51 implements no3<a> {
    private final c51 a;
    private final as8<f63> b;

    public p51(c51 c51Var, as8<f63> as8Var) {
        this.a = c51Var;
        this.b = as8Var;
    }

    public static p51 a(c51 c51Var, as8<f63> as8Var) {
        return new p51(c51Var, as8Var);
    }

    public static a c(c51 c51Var, f63 f63Var) {
        return (a) jh8.e(c51Var.c(f63Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public a get() {
        return c(this.a, this.b.get());
    }
}
