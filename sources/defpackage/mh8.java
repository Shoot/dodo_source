package defpackage;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.state.WorkflowApi;
import ru.dodopizza.backend.domain.state.dto.SetPizzeriaRequestDto;
import ru.dodopizza.backend.domain.state.dto.SetRestaurantPizzeriaRequestDto;
/* compiled from: PredefinePizzeriaService.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lmh8;", "Llh8;", "", "pizzeriaId", "workFlowId", "", "a", "b", "Lru/dodopizza/backend/domain/state/WorkflowApi;", "Lru/dodopizza/backend/domain/state/WorkflowApi;", "getWorkflowApi", "()Lru/dodopizza/backend/domain/state/WorkflowApi;", "workflowApi", "Ldua;", "Ldua;", "getStateAnalyzer", "()Ldua;", "stateAnalyzer", "<init>", "(Lru/dodopizza/backend/domain/state/WorkflowApi;Ldua;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mh8  reason: default package */
/* loaded from: classes4.dex */
public final class mh8 implements lh8 {
    private final WorkflowApi a;
    private final dua b;

    public mh8(WorkflowApi workflowApi, dua duaVar) {
        z65.h(workflowApi, "workflowApi");
        z65.h(duaVar, "stateAnalyzer");
        this.a = workflowApi;
        this.b = duaVar;
    }

    @Override // defpackage.lh8
    public void a(String str, String str2) {
        z65.h(str, "pizzeriaId");
        z65.h(str2, "workFlowId");
        this.b.d(this.a.setPizzeria(new SetPizzeriaRequestDto(str2, str)));
    }

    @Override // defpackage.lh8
    public void b(String str, String str2) {
        z65.h(str, "pizzeriaId");
        z65.h(str2, "workFlowId");
        this.b.d(this.a.setRestaurantPizzeria(new SetRestaurantPizzeriaRequestDto(str2, str)));
    }
}
