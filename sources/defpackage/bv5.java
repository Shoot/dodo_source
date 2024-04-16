package defpackage;

import com.dodopizza.geo.feature.deliveryaddresslist.presentation.d;
/* compiled from: LocalityModule_ProvideOnDeliveryLocationSelectedListenerFactory.java */
/* renamed from: bv5  reason: default package */
/* loaded from: classes3.dex */
public final class bv5 implements no3<d> {
    private final as8<t41> a;
    private final as8<qi8> b;
    private final as8<hq3> c;

    public bv5(as8<t41> as8Var, as8<qi8> as8Var2, as8<hq3> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static bv5 a(as8<t41> as8Var, as8<qi8> as8Var2, as8<hq3> as8Var3) {
        return new bv5(as8Var, as8Var2, as8Var3);
    }

    public static d c(t41 t41Var, qi8 qi8Var, hq3 hq3Var) {
        return (d) jh8.e(ju5.a.h(t41Var, qi8Var, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public d get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
