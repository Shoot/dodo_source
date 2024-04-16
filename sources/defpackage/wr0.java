package defpackage;

import ru.dodopizza.backend.domain.cart.CartAPI;
/* compiled from: CartQueueItemSenderImpl_Factory.java */
/* renamed from: wr0  reason: default package */
/* loaded from: classes4.dex */
public final class wr0 implements no3<vr0> {
    private final as8<CartAPI> a;
    private final as8<f8c> b;
    private final as8<dua> c;
    private final as8<hq3> d;
    private final as8<as0> e;

    public wr0(as8<CartAPI> as8Var, as8<f8c> as8Var2, as8<dua> as8Var3, as8<hq3> as8Var4, as8<as0> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static wr0 a(as8<CartAPI> as8Var, as8<f8c> as8Var2, as8<dua> as8Var3, as8<hq3> as8Var4, as8<as0> as8Var5) {
        return new wr0(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static vr0 c(as8<CartAPI> as8Var, f8c f8cVar, dua duaVar, hq3 hq3Var, as0 as0Var) {
        return new vr0(as8Var, f8cVar, duaVar, hq3Var, as0Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public vr0 get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
