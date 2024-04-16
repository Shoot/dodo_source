package defpackage;

import ru.dodopizza.backend.domain.state.WorkflowApi;
/* compiled from: PredefinePizzeriaServiceImpl_Factory.java */
/* renamed from: nh8  reason: default package */
/* loaded from: classes4.dex */
public final class nh8 implements no3<mh8> {
    private final as8<WorkflowApi> a;
    private final as8<dua> b;

    public nh8(as8<WorkflowApi> as8Var, as8<dua> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static nh8 a(as8<WorkflowApi> as8Var, as8<dua> as8Var2) {
        return new nh8(as8Var, as8Var2);
    }

    public static mh8 c(WorkflowApi workflowApi, dua duaVar) {
        return new mh8(workflowApi, duaVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public mh8 get() {
        return c(this.a.get(), this.b.get());
    }
}
