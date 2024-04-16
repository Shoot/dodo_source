package ru.dodopizza.backend.domain.state.dto.personalization;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: PersonalizationDto.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"getDepartmentMinDeliveryPrice", "", "Lru/dodopizza/backend/domain/state/dto/personalization/PersonalizationDto;", "(Lru/dodopizza/backend/domain/state/dto/personalization/PersonalizationDto;)Ljava/lang/Double;", "getPersonalizedMinDeliveryPrice", "backend"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PersonalizationDtoKt {
    public static final Double getDepartmentMinDeliveryPrice(PersonalizationDto personalizationDto) {
        String str;
        z65.h(personalizationDto, "<this>");
        Map<String, String> minDeliveryPrice = personalizationDto.getMinDeliveryPrice();
        if (minDeliveryPrice != null && (str = minDeliveryPrice.get("departmentMinDeliveryPrice")) != null) {
            return Double.valueOf(Double.parseDouble(str));
        }
        return null;
    }

    public static final Double getPersonalizedMinDeliveryPrice(PersonalizationDto personalizationDto) {
        String str;
        z65.h(personalizationDto, "<this>");
        Map<String, String> minDeliveryPrice = personalizationDto.getMinDeliveryPrice();
        if (minDeliveryPrice != null && (str = minDeliveryPrice.get("personalizedMinDeliveryPrice")) != null) {
            return Double.valueOf(Double.parseDouble(str));
        }
        return null;
    }
}
