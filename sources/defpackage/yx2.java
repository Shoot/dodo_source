package defpackage;

import ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter;
/* compiled from: DeliveryLocationDetailsModule_ProvideDeliveryLocationDetailsPresenterFactory.java */
/* renamed from: yx2  reason: default package */
/* loaded from: classes3.dex */
public final class yx2 implements no3<DeliveryLocationDetailsPresenter> {
    private final vx2 a;
    private final as8<f63> b;
    private final as8<sx2> c;
    private final as8<rx2> d;
    private final as8<hq3> e;
    private final as8<gc> f;
    private final as8<ay1> g;

    public yx2(vx2 vx2Var, as8<f63> as8Var, as8<sx2> as8Var2, as8<rx2> as8Var3, as8<hq3> as8Var4, as8<gc> as8Var5, as8<ay1> as8Var6) {
        this.a = vx2Var;
        this.b = as8Var;
        this.c = as8Var2;
        this.d = as8Var3;
        this.e = as8Var4;
        this.f = as8Var5;
        this.g = as8Var6;
    }

    public static yx2 a(vx2 vx2Var, as8<f63> as8Var, as8<sx2> as8Var2, as8<rx2> as8Var3, as8<hq3> as8Var4, as8<gc> as8Var5, as8<ay1> as8Var6) {
        return new yx2(vx2Var, as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static DeliveryLocationDetailsPresenter c(vx2 vx2Var, f63 f63Var, sx2 sx2Var, rx2 rx2Var, hq3 hq3Var, gc gcVar, ay1 ay1Var) {
        return (DeliveryLocationDetailsPresenter) jh8.e(vx2Var.b(f63Var, sx2Var, rx2Var, hq3Var, gcVar, ay1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public DeliveryLocationDetailsPresenter get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
