package ru.dodopizza.backend.domain.payment.dto.v2;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PayByNewCardRequestDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/dodopizza/backend/domain/payment/dto/v2/PayByNewCardRequestDto;", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "", "token", "saveCard", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getSaveCard", "()Z", "getToken", "()Ljava/lang/String;", "getWorkflowId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PayByNewCardRequestDto {
    @uca("saveCard")
    private final boolean saveCard;
    @uca("paymentToken")
    private final String token;
    @uca(UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID)
    private final String workflowId;

    public PayByNewCardRequestDto(String str, String str2, boolean z) {
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(str2, "token");
        this.workflowId = str;
        this.token = str2;
        this.saveCard = z;
    }

    public static /* synthetic */ PayByNewCardRequestDto copy$default(PayByNewCardRequestDto payByNewCardRequestDto, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payByNewCardRequestDto.workflowId;
        }
        if ((i & 2) != 0) {
            str2 = payByNewCardRequestDto.token;
        }
        if ((i & 4) != 0) {
            z = payByNewCardRequestDto.saveCard;
        }
        return payByNewCardRequestDto.copy(str, str2, z);
    }

    public final String component1() {
        return this.workflowId;
    }

    public final String component2() {
        return this.token;
    }

    public final boolean component3() {
        return this.saveCard;
    }

    public final PayByNewCardRequestDto copy(String str, String str2, boolean z) {
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(str2, "token");
        return new PayByNewCardRequestDto(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayByNewCardRequestDto)) {
            return false;
        }
        PayByNewCardRequestDto payByNewCardRequestDto = (PayByNewCardRequestDto) obj;
        if (z65.c(this.workflowId, payByNewCardRequestDto.workflowId) && z65.c(this.token, payByNewCardRequestDto.token) && this.saveCard == payByNewCardRequestDto.saveCard) {
            return true;
        }
        return false;
    }

    public final boolean getSaveCard() {
        return this.saveCard;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getWorkflowId() {
        return this.workflowId;
    }

    public int hashCode() {
        return (((this.workflowId.hashCode() * 31) + this.token.hashCode()) * 31) + a91.a(this.saveCard);
    }

    public String toString() {
        String str = this.workflowId;
        String str2 = this.token;
        boolean z = this.saveCard;
        return "PayByNewCardRequestDto(workflowId=" + str + ", token=" + str2 + ", saveCard=" + z + ")";
    }

    public /* synthetic */ PayByNewCardRequestDto(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, z);
    }
}
