package defpackage;

import ru.dodopizza.backend.domain.pizzeria.PizzeriaAPI;
/* compiled from: CheckoutModule_ProvideDeferredTimeServiceFactory.java */
/* renamed from: i51  reason: default package */
/* loaded from: classes3.dex */
public final class i51 implements no3<nt2> {
    private final as8<pgb> a;
    private final as8<ava> b;
    private final as8<PizzeriaAPI> c;
    private final as8<f5b> d;
    private final as8<hq3> e;
    private final as8<ml0> f;

    public i51(as8<pgb> as8Var, as8<ava> as8Var2, as8<PizzeriaAPI> as8Var3, as8<f5b> as8Var4, as8<hq3> as8Var5, as8<ml0> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static i51 a(as8<pgb> as8Var, as8<ava> as8Var2, as8<PizzeriaAPI> as8Var3, as8<f5b> as8Var4, as8<hq3> as8Var5, as8<ml0> as8Var6) {
        return new i51(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static nt2 c(pgb pgbVar, ava avaVar, PizzeriaAPI pizzeriaAPI, f5b f5bVar, hq3 hq3Var, ml0 ml0Var) {
        return (nt2) jh8.e(d51.a.e(pgbVar, avaVar, pizzeriaAPI, f5bVar, hq3Var, ml0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public nt2 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
