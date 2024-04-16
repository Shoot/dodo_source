package ru.dodopizza.app.data.dto.request;

import com.dodopizza.persistence.entity.cart.StateEntity;
import ru.dodopizza.backend.domain.state.dto.DeliveryAddressDto;
/* loaded from: classes3.dex */
public class StateRequest {
    @uca("DeferredOrderDateTime")
    @mn3
    public String deferredOrderTime;
    @uca("address")
    @mn3
    public DeliveryAddressDto deliveryAddress;
    @uca("pizzeria")
    @mn3
    public String pizzeriaId;
    @uca("stateId")
    @mn3
    public String stateId;

    public StateRequest(StateEntity stateEntity, DeliveryAddressDto deliveryAddressDto, String str) {
        this.deliveryAddress = deliveryAddressDto;
        if (stateEntity == null) {
            this.stateId = null;
        } else {
            this.stateId = stateEntity.getWorkflowId();
        }
        if (str != null && str.isEmpty()) {
            str = null;
        }
        this.deferredOrderTime = str;
    }

    public StateRequest() {
    }

    public StateRequest(String str) {
        this.stateId = str;
    }
}
