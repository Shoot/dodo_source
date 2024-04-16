package defpackage;

import ru.dodopizza.backend.domain.state.WorkflowApi;
/* compiled from: CheckoutModule_ProvideCheckoutDetailsServiceFactory.java */
/* renamed from: f51  reason: default package */
/* loaded from: classes3.dex */
public final class f51 implements no3<t41> {
    private final as8<WorkflowApi> a;
    private final as8<f8c> b;
    private final as8<ava> c;
    private final as8<dua> d;
    private final as8<v53> e;
    private final as8<pv0> f;
    private final as8<tw7> g;
    private final as8<jgb> h;
    private final as8<pgb> i;
    private final as8<mk7> j;
    private final as8<gy2> k;

    public f51(as8<WorkflowApi> as8Var, as8<f8c> as8Var2, as8<ava> as8Var3, as8<dua> as8Var4, as8<v53> as8Var5, as8<pv0> as8Var6, as8<tw7> as8Var7, as8<jgb> as8Var8, as8<pgb> as8Var9, as8<mk7> as8Var10, as8<gy2> as8Var11) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
        this.i = as8Var9;
        this.j = as8Var10;
        this.k = as8Var11;
    }

    public static f51 a(as8<WorkflowApi> as8Var, as8<f8c> as8Var2, as8<ava> as8Var3, as8<dua> as8Var4, as8<v53> as8Var5, as8<pv0> as8Var6, as8<tw7> as8Var7, as8<jgb> as8Var8, as8<pgb> as8Var9, as8<mk7> as8Var10, as8<gy2> as8Var11) {
        return new f51(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10, as8Var11);
    }

    public static t41 c(WorkflowApi workflowApi, f8c f8cVar, ava avaVar, dua duaVar, v53 v53Var, pv0 pv0Var, tw7 tw7Var, jgb jgbVar, pgb pgbVar, mk7 mk7Var, gy2 gy2Var) {
        return (t41) jh8.e(d51.a.b(workflowApi, f8cVar, avaVar, duaVar, v53Var, pv0Var, tw7Var, jgbVar, pgbVar, mk7Var, gy2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public t41 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get());
    }
}
