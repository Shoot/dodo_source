package defpackage;

import ru.dodopizza.backend.domain.state.WorkflowApi;
/* compiled from: CustomerModule_ProvideTaxPayerIdServiceFactory.java */
/* renamed from: l52  reason: default package */
/* loaded from: classes3.dex */
public final class l52 implements no3<z7b> {
    private final as8<hq3> a;
    private final as8<f8c> b;
    private final as8<ava> c;
    private final as8<WorkflowApi> d;
    private final as8<dua> e;

    public l52(as8<hq3> as8Var, as8<f8c> as8Var2, as8<ava> as8Var3, as8<WorkflowApi> as8Var4, as8<dua> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static l52 a(as8<hq3> as8Var, as8<f8c> as8Var2, as8<ava> as8Var3, as8<WorkflowApi> as8Var4, as8<dua> as8Var5) {
        return new l52(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static z7b c(hq3 hq3Var, f8c f8cVar, ava avaVar, WorkflowApi workflowApi, dua duaVar) {
        return (z7b) jh8.e(g52.a.e(hq3Var, f8cVar, avaVar, workflowApi, duaVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public z7b get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
