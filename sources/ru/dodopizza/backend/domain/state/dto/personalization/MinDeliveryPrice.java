package ru.dodopizza.backend.domain.state.dto.personalization;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: PersonalizationDto.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J>\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R$\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/personalization/MinDeliveryPrice;", "", "departmentMinDeliveryPrice", "", "personalizedMinDeliveryPrice", "additionalData", "", "", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;)V", "getAdditionalData", "()Ljava/util/Map;", "getDepartmentMinDeliveryPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPersonalizedMinDeliveryPrice", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;)Lru/dodopizza/backend/domain/state/dto/personalization/MinDeliveryPrice;", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MinDeliveryPrice {
    @uca("additionalData")
    private final Map<String, String> additionalData;
    @uca("departmentMinDeliveryPrice")
    private final Double departmentMinDeliveryPrice;
    @uca("personalizedMinDeliveryPrice")
    private final Double personalizedMinDeliveryPrice;

    public MinDeliveryPrice(Double d, Double d2, Map<String, String> map) {
        this.departmentMinDeliveryPrice = d;
        this.personalizedMinDeliveryPrice = d2;
        this.additionalData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MinDeliveryPrice copy$default(MinDeliveryPrice minDeliveryPrice, Double d, Double d2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            d = minDeliveryPrice.departmentMinDeliveryPrice;
        }
        if ((i & 2) != 0) {
            d2 = minDeliveryPrice.personalizedMinDeliveryPrice;
        }
        if ((i & 4) != 0) {
            map = minDeliveryPrice.additionalData;
        }
        return minDeliveryPrice.copy(d, d2, map);
    }

    public final Double component1() {
        return this.departmentMinDeliveryPrice;
    }

    public final Double component2() {
        return this.personalizedMinDeliveryPrice;
    }

    public final Map<String, String> component3() {
        return this.additionalData;
    }

    public final MinDeliveryPrice copy(Double d, Double d2, Map<String, String> map) {
        return new MinDeliveryPrice(d, d2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinDeliveryPrice)) {
            return false;
        }
        MinDeliveryPrice minDeliveryPrice = (MinDeliveryPrice) obj;
        if (z65.c(this.departmentMinDeliveryPrice, minDeliveryPrice.departmentMinDeliveryPrice) && z65.c(this.personalizedMinDeliveryPrice, minDeliveryPrice.personalizedMinDeliveryPrice) && z65.c(this.additionalData, minDeliveryPrice.additionalData)) {
            return true;
        }
        return false;
    }

    public final Map<String, String> getAdditionalData() {
        return this.additionalData;
    }

    public final Double getDepartmentMinDeliveryPrice() {
        return this.departmentMinDeliveryPrice;
    }

    public final Double getPersonalizedMinDeliveryPrice() {
        return this.personalizedMinDeliveryPrice;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Double d = this.departmentMinDeliveryPrice;
        int i = 0;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i2 = hashCode * 31;
        Double d2 = this.personalizedMinDeliveryPrice;
        if (d2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Map<String, String> map = this.additionalData;
        if (map != null) {
            i = map.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        Double d = this.departmentMinDeliveryPrice;
        Double d2 = this.personalizedMinDeliveryPrice;
        Map<String, String> map = this.additionalData;
        return "MinDeliveryPrice(departmentMinDeliveryPrice=" + d + ", personalizedMinDeliveryPrice=" + d2 + ", additionalData=" + map + ")";
    }
}
