package ru.dodopizza.backend.domain.payment.dto.app2app;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import kotlin.Metadata;
/* compiled from: PayByApp2AppRequestDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/dodopizza/backend/domain/payment/dto/app2app/PayByApp2AppRequestDto;", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "", "app2AppData", "Lru/dodopizza/backend/domain/payment/dto/app2app/App2AppData;", "(Ljava/lang/String;Lru/dodopizza/backend/domain/payment/dto/app2app/App2AppData;)V", "getApp2AppData", "()Lru/dodopizza/backend/domain/payment/dto/app2app/App2AppData;", "getWorkflowId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PayByApp2AppRequestDto {
    @uca("data")
    private final App2AppData app2AppData;
    @uca(UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID)
    private final String workflowId;

    public PayByApp2AppRequestDto(String str, App2AppData app2AppData) {
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(app2AppData, "app2AppData");
        this.workflowId = str;
        this.app2AppData = app2AppData;
    }

    public static /* synthetic */ PayByApp2AppRequestDto copy$default(PayByApp2AppRequestDto payByApp2AppRequestDto, String str, App2AppData app2AppData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payByApp2AppRequestDto.workflowId;
        }
        if ((i & 2) != 0) {
            app2AppData = payByApp2AppRequestDto.app2AppData;
        }
        return payByApp2AppRequestDto.copy(str, app2AppData);
    }

    public final String component1() {
        return this.workflowId;
    }

    public final App2AppData component2() {
        return this.app2AppData;
    }

    public final PayByApp2AppRequestDto copy(String str, App2AppData app2AppData) {
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(app2AppData, "app2AppData");
        return new PayByApp2AppRequestDto(str, app2AppData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayByApp2AppRequestDto)) {
            return false;
        }
        PayByApp2AppRequestDto payByApp2AppRequestDto = (PayByApp2AppRequestDto) obj;
        if (z65.c(this.workflowId, payByApp2AppRequestDto.workflowId) && z65.c(this.app2AppData, payByApp2AppRequestDto.app2AppData)) {
            return true;
        }
        return false;
    }

    public final App2AppData getApp2AppData() {
        return this.app2AppData;
    }

    public final String getWorkflowId() {
        return this.workflowId;
    }

    public int hashCode() {
        return (this.workflowId.hashCode() * 31) + this.app2AppData.hashCode();
    }

    public String toString() {
        String str = this.workflowId;
        App2AppData app2AppData = this.app2AppData;
        return "PayByApp2AppRequestDto(workflowId=" + str + ", app2AppData=" + app2AppData + ")";
    }
}
