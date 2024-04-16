package ru.dodopizza.backend.domain.loyalty.dto.history;

import java.util.List;
import kotlin.Metadata;
/* compiled from: LoyaltyHistoryDto.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/dodopizza/backend/domain/loyalty/dto/history/LoyaltyHistoryDto;", "", "operations", "", "Lru/dodopizza/backend/domain/loyalty/dto/history/LoyaltyOperationDto;", "(Ljava/util/List;)V", "getOperations", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoyaltyHistoryDto {
    @uca("operations")
    private final List<LoyaltyOperationDto> operations;

    public LoyaltyHistoryDto(List<LoyaltyOperationDto> list) {
        z65.h(list, "operations");
        this.operations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoyaltyHistoryDto copy$default(LoyaltyHistoryDto loyaltyHistoryDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = loyaltyHistoryDto.operations;
        }
        return loyaltyHistoryDto.copy(list);
    }

    public final List<LoyaltyOperationDto> component1() {
        return this.operations;
    }

    public final LoyaltyHistoryDto copy(List<LoyaltyOperationDto> list) {
        z65.h(list, "operations");
        return new LoyaltyHistoryDto(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LoyaltyHistoryDto) && z65.c(this.operations, ((LoyaltyHistoryDto) obj).operations)) {
            return true;
        }
        return false;
    }

    public final List<LoyaltyOperationDto> getOperations() {
        return this.operations;
    }

    public int hashCode() {
        return this.operations.hashCode();
    }

    public String toString() {
        List<LoyaltyOperationDto> list = this.operations;
        return "LoyaltyHistoryDto(operations=" + list + ")";
    }
}
