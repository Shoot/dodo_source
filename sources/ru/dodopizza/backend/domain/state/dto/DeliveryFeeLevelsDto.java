package ru.dodopizza.backend.domain.state.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: DynamicDeliveryDto.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/DeliveryFeeLevelsDto;", "", "feeLevels", "", "Lru/dodopizza/backend/domain/state/dto/ClientDeliveryFeeLevelDto;", "(Ljava/util/List;)V", "getFeeLevels", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryFeeLevelsDto {
    @uca("feeLevels")
    private final List<ClientDeliveryFeeLevelDto> feeLevels;

    public DeliveryFeeLevelsDto(List<ClientDeliveryFeeLevelDto> list) {
        z65.h(list, "feeLevels");
        this.feeLevels = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryFeeLevelsDto copy$default(DeliveryFeeLevelsDto deliveryFeeLevelsDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deliveryFeeLevelsDto.feeLevels;
        }
        return deliveryFeeLevelsDto.copy(list);
    }

    public final List<ClientDeliveryFeeLevelDto> component1() {
        return this.feeLevels;
    }

    public final DeliveryFeeLevelsDto copy(List<ClientDeliveryFeeLevelDto> list) {
        z65.h(list, "feeLevels");
        return new DeliveryFeeLevelsDto(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DeliveryFeeLevelsDto) && z65.c(this.feeLevels, ((DeliveryFeeLevelsDto) obj).feeLevels)) {
            return true;
        }
        return false;
    }

    public final List<ClientDeliveryFeeLevelDto> getFeeLevels() {
        return this.feeLevels;
    }

    public int hashCode() {
        return this.feeLevels.hashCode();
    }

    public String toString() {
        List<ClientDeliveryFeeLevelDto> list = this.feeLevels;
        return "DeliveryFeeLevelsDto(feeLevels=" + list + ")";
    }
}
