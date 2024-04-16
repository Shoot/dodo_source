package defpackage;

import com.dodopizza.geo.feature.deliveryaddresslist.presentation.a;
import com.dodopizza.geo.feature.deliveryaddresslist.presentation.d;
/* compiled from: DeliveryAddressListModule_ProvideDeliveryAddressListInteractorFactory.java */
/* renamed from: sv2  reason: default package */
/* loaded from: classes2.dex */
public final class sv2 implements no3<a> {
    private final as8<k9a> a;
    private final as8<iv2> b;
    private final as8<x42> c;
    private final as8<pu2> d;
    private final as8<j9a> e;
    private final as8<k6a> f;
    private final as8<d> g;

    public sv2(as8<k9a> as8Var, as8<iv2> as8Var2, as8<x42> as8Var3, as8<pu2> as8Var4, as8<j9a> as8Var5, as8<k6a> as8Var6, as8<d> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static sv2 a(as8<k9a> as8Var, as8<iv2> as8Var2, as8<x42> as8Var3, as8<pu2> as8Var4, as8<j9a> as8Var5, as8<k6a> as8Var6, as8<d> as8Var7) {
        return new sv2(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static a c(k9a k9aVar, iv2 iv2Var, x42 x42Var, pu2 pu2Var, j9a j9aVar, k6a k6aVar, d dVar) {
        return (a) jh8.e(ov2.a.d(k9aVar, iv2Var, x42Var, pu2Var, j9aVar, k6aVar, dVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public a get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
