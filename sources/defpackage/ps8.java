package defpackage;

import com.dodopizza.persistence.entity.cart.StateEntity;
import kotlin.Metadata;
/* compiled from: OrderStep.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lps8;", "Lui7;", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "b", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "()Lcom/dodopizza/persistence/entity/cart/StateEntity;", "state", "<init>", "(Lcom/dodopizza/persistence/entity/cart/StateEntity;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ps8  reason: default package */
/* loaded from: classes4.dex */
public final class ps8 extends ui7 {
    private final StateEntity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps8(StateEntity stateEntity) {
        super(stateEntity.getWorkflowId(), null);
        z65.h(stateEntity, "state");
        this.b = stateEntity;
    }

    public final StateEntity b() {
        return this.b;
    }
}
