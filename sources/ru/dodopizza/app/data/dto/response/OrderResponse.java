package ru.dodopizza.app.data.dto.response;

import com.dodopizza.persistence.entity.cart.StateEntity;
import kotlin.Metadata;
/* compiled from: OrderResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lru/dodopizza/app/data/dto/response/OrderResponse;", "", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "state", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "getState", "()Lcom/dodopizza/persistence/entity/cart/StateEntity;", "Lbc7;", "createdOrder", "Lbc7;", "getCreatedOrder", "()Lbc7;", "<init>", "(Lcom/dodopizza/persistence/entity/cart/StateEntity;Lbc7;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class OrderResponse {
    private final bc7 createdOrder;
    private final StateEntity state;

    public OrderResponse(StateEntity stateEntity, bc7 bc7Var) {
        z65.h(stateEntity, "state");
        this.state = stateEntity;
        this.createdOrder = bc7Var;
    }

    public final bc7 getCreatedOrder() {
        return this.createdOrder;
    }

    public final StateEntity getState() {
        return this.state;
    }
}
