package defpackage;

import com.dodopizza.activeorder.feature.orderdetails.presentation.b;
/* compiled from: OrderDetailsVOFactoryImpl_Factory.java */
/* renamed from: nd7  reason: default package */
/* loaded from: classes.dex */
public final class nd7 implements no3<b> {
    private final as8<g78> a;
    private final as8<hq3> b;
    private final as8<e78> c;

    public nd7(as8<g78> as8Var, as8<hq3> as8Var2, as8<e78> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static nd7 a(as8<g78> as8Var, as8<hq3> as8Var2, as8<e78> as8Var3) {
        return new nd7(as8Var, as8Var2, as8Var3);
    }

    public static b c(g78 g78Var, hq3 hq3Var, e78 e78Var) {
        return new b(g78Var, hq3Var, e78Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public b get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
