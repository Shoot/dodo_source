package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.state.WorkflowApi;
/* compiled from: SetDeliveryLocationService.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Llfa;", "Lkfa;", "Le91;", "clientDeliveryLocation", "", "setDeliveryOrderType", "", "stateId", "", "a", "Lru/dodopizza/backend/domain/state/WorkflowApi;", "Lru/dodopizza/backend/domain/state/WorkflowApi;", "workflowApi", "Ldua;", "b", "Ldua;", "stateAnalyzer", "Lgy2;", c.a, "Lgy2;", "converter", "<init>", "(Lru/dodopizza/backend/domain/state/WorkflowApi;Ldua;Lgy2;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lfa  reason: default package */
/* loaded from: classes4.dex */
public final class lfa implements kfa {
    private final WorkflowApi a;
    private final dua b;
    private final gy2 c;

    public lfa(WorkflowApi workflowApi, dua duaVar, gy2 gy2Var) {
        z65.h(workflowApi, "workflowApi");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(gy2Var, "converter");
        this.a = workflowApi;
        this.b = duaVar;
        this.c = gy2Var;
    }

    @Override // defpackage.kfa
    public void a(e91 e91Var, boolean z, String str) {
        z65.h(e91Var, "clientDeliveryLocation");
        z65.h(str, "stateId");
        this.b.d(this.a.setDeliveryLocation(this.c.a(str, e91Var, z)));
    }
}
