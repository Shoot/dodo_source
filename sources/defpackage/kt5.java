package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.locality.dto.LegalInformationDto;
import ru.dodopizza.backend.domain.locality.dto.LegalInformationsDto;
import ru.dodopizza.backend.domain.locality.dto.LocalityInfoDtoV3;
import ru.dodopizza.backend.domain.locality.dto.OrderTypeDiscountDto;
import ru.dodopizza.backend.domain.locality.dto.SocialLinkDto;
import ru.dodopizza.backend.domain.locality.dto.SocialLinksDto;
/* compiled from: LocalityInfoConverter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0002J\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\u0014"}, d2 = {"Lkt5;", "", "Lru/dodopizza/backend/domain/locality/dto/LegalInformationDto;", "dto", "Lwo5;", "b", "Lru/dodopizza/backend/domain/locality/dto/SocialLinkDto;", "Lcqa;", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/backend/domain/locality/dto/OrderTypeDiscountDto;", "Lnk7;", c.a, "Ldt5;", "locality", "Lru/dodopizza/backend/domain/locality/dto/LocalityInfoDtoV3;", "localityInfoDto", "Ljt5;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: kt5  reason: default package */
/* loaded from: classes4.dex */
public final class kt5 {
    private final wo5 b(LegalInformationDto legalInformationDto) {
        String title = legalInformationDto.getTitle();
        String str = "";
        if (title == null) {
            title = "";
        }
        String url = legalInformationDto.getUrl();
        if (url == null) {
            url = "";
        }
        String text = legalInformationDto.getText();
        if (text != null) {
            str = text;
        }
        Integer typeId = legalInformationDto.getTypeId();
        z65.e(typeId);
        return new wo5(title, url, str, typeId.intValue());
    }

    private final nk7 c(OrderTypeDiscountDto orderTypeDiscountDto) {
        int carryout = orderTypeDiscountDto.getCarryout();
        int restaurant = orderTypeDiscountDto.getRestaurant();
        String carryoutText = orderTypeDiscountDto.getCarryoutText();
        String str = "";
        if (carryoutText == null) {
            carryoutText = "";
        }
        String restaurantText = orderTypeDiscountDto.getRestaurantText();
        if (restaurantText != null) {
            str = restaurantText;
        }
        return new nk7(carryout, restaurant, carryoutText, str);
    }

    private final cqa d(SocialLinkDto socialLinkDto) {
        String name = socialLinkDto.getName();
        String str = "";
        if (name == null) {
            name = "";
        }
        String url = socialLinkDto.getUrl();
        if (url != null) {
            str = url;
        }
        return new cqa(name, str);
    }

    public final jt5 a(dt5 dt5Var, LocalityInfoDtoV3 localityInfoDtoV3) {
        int w;
        int w2;
        z65.h(dt5Var, "locality");
        z65.h(localityInfoDtoV3, "localityInfoDto");
        eub eubVar = new eub(localityInfoDtoV3.getUserAgreement().getTitle(), localityInfoDtoV3.getUserAgreement().getUrl());
        String a = mt5.a.a(dt5Var);
        String uuid = localityInfoDtoV3.getUuid();
        String deliveryZoneMapUrl = localityInfoDtoV3.getDeliveryZoneMapUrl();
        z65.e(deliveryZoneMapUrl);
        LegalInformationsDto<LegalInformationDto> legalInformation = localityInfoDtoV3.getLegalInformation();
        w = lc1.w(legalInformation, 10);
        ArrayList arrayList = new ArrayList(w);
        for (LegalInformationDto legalInformationDto : legalInformation) {
            arrayList.add(b(legalInformationDto));
        }
        SocialLinksDto<SocialLinkDto> socialLinks = localityInfoDtoV3.getSocialLinks();
        w2 = lc1.w(socialLinks, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (SocialLinkDto socialLinkDto : socialLinks) {
            arrayList2.add(d(socialLinkDto));
        }
        String callCenterPhone = localityInfoDtoV3.getCallCenterPhone();
        if (callCenterPhone == null) {
            callCenterPhone = "";
        }
        return new jt5(a, uuid, dt5Var, deliveryZoneMapUrl, eubVar, arrayList, arrayList2, callCenterPhone, localityInfoDtoV3.isLanding(), c(localityInfoDtoV3.getOrderTypeDiscountDto()));
    }
}
