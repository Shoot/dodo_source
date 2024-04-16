package ru.dodopizza.backend.domain.state.dto.personalization;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: DynamicDeliveryDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0017\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\t\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R$\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/personalization/DynamicDeliveryDto;", "", "additionalData", "", "", "(Ljava/util/Map;)V", "getAdditionalData", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DynamicDeliveryDto {
    @uca("additionalData")
    private final Map<String, String> additionalData;

    public DynamicDeliveryDto(Map<String, String> map) {
        this.additionalData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicDeliveryDto copy$default(DynamicDeliveryDto dynamicDeliveryDto, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = dynamicDeliveryDto.additionalData;
        }
        return dynamicDeliveryDto.copy(map);
    }

    public final Map<String, String> component1() {
        return this.additionalData;
    }

    public final DynamicDeliveryDto copy(Map<String, String> map) {
        return new DynamicDeliveryDto(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DynamicDeliveryDto) && z65.c(this.additionalData, ((DynamicDeliveryDto) obj).additionalData)) {
            return true;
        }
        return false;
    }

    public final Map<String, String> getAdditionalData() {
        return this.additionalData;
    }

    public int hashCode() {
        Map<String, String> map = this.additionalData;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        Map<String, String> map = this.additionalData;
        return "DynamicDeliveryDto(additionalData=" + map + ")";
    }
}
