package defpackage;

import com.dodopizza.persistence.entity.cart.StateEntity;
import kotlin.Metadata;
/* compiled from: WorkflowExtensions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/StateEntity;", "", "currentWorkflowId", "", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: d8c  reason: default package */
/* loaded from: classes4.dex */
public final class d8c {
    public static final boolean a(StateEntity stateEntity, String str) {
        z65.h(stateEntity, "<this>");
        z65.h(str, "currentWorkflowId");
        if (!z65.c(str, stateEntity.getWorkflowId()) && !z65.c(str, StateEntity.Companion.getDEFAULT().getWorkflowId())) {
            return false;
        }
        return true;
    }
}
