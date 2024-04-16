package defpackage;

import ru.dodopizza.app.domain.DodopizzaApi;
/* compiled from: CatchAddressModule_ProvideCatchAddressInteractorFactory.java */
/* renamed from: ot0  reason: default package */
/* loaded from: classes3.dex */
public final class ot0 implements no3<lt0> {
    private final as8<DodopizzaApi> a;
    private final as8<x42> b;
    private final as8<vg7> c;
    private final as8<gc> d;
    private final as8<h8> e;

    public ot0(as8<DodopizzaApi> as8Var, as8<x42> as8Var2, as8<vg7> as8Var3, as8<gc> as8Var4, as8<h8> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static ot0 a(as8<DodopizzaApi> as8Var, as8<x42> as8Var2, as8<vg7> as8Var3, as8<gc> as8Var4, as8<h8> as8Var5) {
        return new ot0(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static lt0 c(DodopizzaApi dodopizzaApi, x42 x42Var, vg7 vg7Var, gc gcVar, h8 h8Var) {
        return (lt0) jh8.e(nt0.a.a(dodopizzaApi, x42Var, vg7Var, gcVar, h8Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public lt0 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
