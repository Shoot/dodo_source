package defpackage;

import com.dodopizza.geo.feature.selectdeliveryaddress.b;
import com.dodopizza.geo.feature.selectdeliveryaddress.c;
/* compiled from: SelectDeliveryAddressModule_ProvideSelectDeliveryAddressRouterFactory.java */
/* renamed from: p5a  reason: default package */
/* loaded from: classes2.dex */
public final class p5a implements no3<c> {
    private final as8<f63> a;
    private final as8<b> b;

    public p5a(as8<f63> as8Var, as8<b> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static p5a a(as8<f63> as8Var, as8<b> as8Var2) {
        return new p5a(as8Var, as8Var2);
    }

    public static c c(f63 f63Var, b bVar) {
        return (c) jh8.e(i5a.a.g(f63Var, bVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public c get() {
        return c(this.a.get(), this.b.get());
    }
}
