package defpackage;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import defpackage.gtb;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: UpsaleStateRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001¨\u0006\u0004"}, d2 = {"Lgtb;", "Lcom/dodopizza/persistence/entity/UpsaleStateEntity;", "a", "b", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: jtb  reason: default package */
/* loaded from: classes4.dex */
public final class jtb {
    public static final UpsaleStateEntity a(gtb gtbVar) {
        z65.h(gtbVar, "<this>");
        if (gtbVar instanceof gtb.d) {
            return new UpsaleStateEntity(gtbVar.a(), 1);
        }
        if (gtbVar instanceof gtb.b) {
            return new UpsaleStateEntity(gtbVar.a(), 2);
        }
        if (gtbVar instanceof gtb.c) {
            return new UpsaleStateEntity(gtbVar.a(), 3);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final gtb b(UpsaleStateEntity upsaleStateEntity) {
        z65.h(upsaleStateEntity, "<this>");
        gtb.a aVar = gtb.d;
        String workflowId = upsaleStateEntity.getWorkflowId();
        if (workflowId == null) {
            workflowId = "";
        }
        return aVar.a(workflowId, upsaleStateEntity.getState());
    }
}
