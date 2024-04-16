package defpackage;

import com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressPresenter;
/* compiled from: DeliveryAddressPresenter_Factory.java */
/* renamed from: ww2  reason: default package */
/* loaded from: classes2.dex */
public final class ww2 implements no3<DeliveryAddressPresenter> {
    private final as8<xu2> a;
    private final as8<fv2> b;
    private final as8<ny1> c;
    private final as8<gc> d;

    public ww2(as8<xu2> as8Var, as8<fv2> as8Var2, as8<ny1> as8Var3, as8<gc> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static ww2 a(as8<xu2> as8Var, as8<fv2> as8Var2, as8<ny1> as8Var3, as8<gc> as8Var4) {
        return new ww2(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static DeliveryAddressPresenter c(xu2 xu2Var, fv2 fv2Var, ny1 ny1Var, gc gcVar) {
        return new DeliveryAddressPresenter(xu2Var, fv2Var, ny1Var, gcVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public DeliveryAddressPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
