package ru.dodopizza.backend.domain.order.dto;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import kotlin.Metadata;
/* compiled from: RepeatOrderDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/dodopizza/backend/domain/order/dto/RepeatOrderDto;", "", "id", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getWorkflowId", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RepeatOrderDto {
    @uca("orderId")
    private final String id;
    @uca("stateId")
    private final String workflowId;

    public RepeatOrderDto(String str, String str2) {
        z65.h(str, "id");
        z65.h(str2, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        this.id = str;
        this.workflowId = str2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getWorkflowId() {
        return this.workflowId;
    }
}
