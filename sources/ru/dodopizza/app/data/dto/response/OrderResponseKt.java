package ru.dodopizza.app.data.dto.response;

import com.dodopizza.persistence.entity.StateErrorEntity;
import io.realm.k0;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: OrderResponse.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0005"}, d2 = {"isFailed", "", "Lru/dodopizza/app/data/dto/response/OrderResponse;", "isFailedToPlace", "isSuccessful", "base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderResponseKt {
    public static final boolean isFailed(OrderResponse orderResponse) {
        z65.h(orderResponse, "<this>");
        Integer step = orderResponse.getState().getStep();
        if (step == null || step.intValue() != 6) {
            Integer step2 = orderResponse.getState().getStep();
            if (step2 != null && step2.intValue() == 2) {
                k0<StateErrorEntity> errors = orderResponse.getState().getErrors();
                if (!(errors instanceof Collection) || !errors.isEmpty()) {
                    for (StateErrorEntity stateErrorEntity : errors) {
                        Integer errorCode = stateErrorEntity.getErrorCode();
                        if (errorCode != null && errorCode.intValue() == 27) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean isFailedToPlace(OrderResponse orderResponse) {
        Integer step;
        Integer step2;
        z65.h(orderResponse, "<this>");
        Integer step3 = orderResponse.getState().getStep();
        if ((step3 == null || step3.intValue() != 5) && (((step = orderResponse.getState().getStep()) == null || step.intValue() != 4) && ((step2 = orderResponse.getState().getStep()) == null || step2.intValue() != 2))) {
            return false;
        }
        return true;
    }

    public static final boolean isSuccessful(OrderResponse orderResponse) {
        z65.h(orderResponse, "<this>");
        if (orderResponse.getCreatedOrder() == null && orderResponse.getState().getPlacedOrderId() == null) {
            return false;
        }
        return true;
    }
}
