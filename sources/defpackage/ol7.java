package defpackage;

import com.dodopizza.order.feature.menu.ordertypeswitcher.c;
/* compiled from: OrderTypeSwitcherModule_ProvideOrderTypeSwitcherExternalRouterFactory.java */
/* renamed from: ol7  reason: default package */
/* loaded from: classes3.dex */
public final class ol7 implements no3<c> {
    private final as8<f63> a;
    private final as8<dt5> b;
    private final as8<ay1> c;

    public ol7(as8<f63> as8Var, as8<dt5> as8Var2, as8<ay1> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static ol7 a(as8<f63> as8Var, as8<dt5> as8Var2, as8<ay1> as8Var3) {
        return new ol7(as8Var, as8Var2, as8Var3);
    }

    public static c c(f63 f63Var, dt5 dt5Var, as8<ay1> as8Var) {
        return (c) jh8.e(ll7.a.c(f63Var, dt5Var, as8Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public c get() {
        return c(this.a.get(), this.b.get(), this.c);
    }
}
