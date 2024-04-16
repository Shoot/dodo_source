package defpackage;

import ru.dodopizza.backend.domain.state.WorkflowApi;
/* compiled from: SetDeliveryLocationServiceImpl_Factory.java */
/* renamed from: mfa  reason: default package */
/* loaded from: classes4.dex */
public final class mfa implements no3<lfa> {
    private final as8<WorkflowApi> a;
    private final as8<dua> b;
    private final as8<gy2> c;

    public mfa(as8<WorkflowApi> as8Var, as8<dua> as8Var2, as8<gy2> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static mfa a(as8<WorkflowApi> as8Var, as8<dua> as8Var2, as8<gy2> as8Var3) {
        return new mfa(as8Var, as8Var2, as8Var3);
    }

    public static lfa c(WorkflowApi workflowApi, dua duaVar, gy2 gy2Var) {
        return new lfa(workflowApi, duaVar, gy2Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public lfa get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
