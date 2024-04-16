package defpackage;

import com.dodopizza.geo.feature.selectdeliveryaddress.SelectDeliveryAddressPresenter;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.dodopizza.geo.feature.selectdeliveryaddress.b;
import com.dodopizza.geo.feature.selectdeliveryaddress.c;
/* compiled from: SelectDeliveryAddressModule_ProvideSelectDeliveryAddressPresenterFactory.java */
/* renamed from: o5a  reason: default package */
/* loaded from: classes2.dex */
public final class o5a implements no3<SelectDeliveryAddressPresenter> {
    private final as8<hq3> a;
    private final as8<b> b;
    private final as8<gc> c;
    private final as8<c> d;
    private final as8<a> e;

    public o5a(as8<hq3> as8Var, as8<b> as8Var2, as8<gc> as8Var3, as8<c> as8Var4, as8<a> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static o5a a(as8<hq3> as8Var, as8<b> as8Var2, as8<gc> as8Var3, as8<c> as8Var4, as8<a> as8Var5) {
        return new o5a(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static SelectDeliveryAddressPresenter c(hq3 hq3Var, b bVar, gc gcVar, c cVar, a aVar) {
        return (SelectDeliveryAddressPresenter) jh8.e(i5a.a.f(hq3Var, bVar, gcVar, cVar, aVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public SelectDeliveryAddressPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
