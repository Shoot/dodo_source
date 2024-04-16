package defpackage;

import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.dodopizza.geo.feature.selectdeliveryaddress.b;
/* compiled from: SelectDeliveryAddressModule_ProvideDeliveryAddressListRoutingHandlerFactory.java */
/* renamed from: j5a  reason: default package */
/* loaded from: classes2.dex */
public final class j5a implements no3<c> {
    private final as8<f63> a;
    private final as8<a> b;
    private final as8<b> c;

    public j5a(as8<f63> as8Var, as8<a> as8Var2, as8<b> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static j5a a(as8<f63> as8Var, as8<a> as8Var2, as8<b> as8Var3) {
        return new j5a(as8Var, as8Var2, as8Var3);
    }

    public static c c(f63 f63Var, a aVar, b bVar) {
        return (c) jh8.e(i5a.a.a(f63Var, aVar, bVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public c get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
