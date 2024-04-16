package defpackage;

import com.dodopizza.geo.feature.deliveryaddresslist.presentation.DeliveryAddressListPresenter;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.a;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
/* compiled from: DeliveryAddressListModule_ProvideDeliveryAddressListPresenterFactory.java */
/* renamed from: tv2  reason: default package */
/* loaded from: classes2.dex */
public final class tv2 implements no3<DeliveryAddressListPresenter> {
    private final as8<iv2> a;
    private final as8<c> b;
    private final as8<a> c;
    private final as8<gc> d;
    private final as8<hq3> e;

    public tv2(as8<iv2> as8Var, as8<c> as8Var2, as8<a> as8Var3, as8<gc> as8Var4, as8<hq3> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static tv2 a(as8<iv2> as8Var, as8<c> as8Var2, as8<a> as8Var3, as8<gc> as8Var4, as8<hq3> as8Var5) {
        return new tv2(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static DeliveryAddressListPresenter c(iv2 iv2Var, c cVar, a aVar, gc gcVar, hq3 hq3Var) {
        return (DeliveryAddressListPresenter) jh8.e(ov2.a.e(iv2Var, cVar, aVar, gcVar, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public DeliveryAddressListPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
