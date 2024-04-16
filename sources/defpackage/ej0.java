package defpackage;

import ru.dodopizza.backend.domain.menu.BuyMoreAPI;
/* compiled from: BuyMoreModule_ProvideBuyMoreServiceFactory.java */
/* renamed from: ej0  reason: default package */
/* loaded from: classes3.dex */
public final class ej0 implements no3<gj0> {
    private final as8<BuyMoreAPI> a;
    private final as8<xi0> b;
    private final as8<dt5> c;

    public ej0(as8<BuyMoreAPI> as8Var, as8<xi0> as8Var2, as8<dt5> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static ej0 a(as8<BuyMoreAPI> as8Var, as8<xi0> as8Var2, as8<dt5> as8Var3) {
        return new ej0(as8Var, as8Var2, as8Var3);
    }

    public static gj0 c(BuyMoreAPI buyMoreAPI, xi0 xi0Var, dt5 dt5Var) {
        return (gj0) jh8.e(aj0.a.c(buyMoreAPI, xi0Var, dt5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gj0 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
