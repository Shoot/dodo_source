package ru.dodopizza.backend.domain.locality.dto;

import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LocalityInfoDtoV3.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u0006 "}, d2 = {"Lru/dodopizza/backend/domain/locality/dto/LocalityInfoDtoV3;", "", "localityId", "", MessageAttributes.UUID, "deliveryZoneMapUrl", "userAgreement", "Lru/dodopizza/backend/domain/locality/dto/UserAgreementDto;", "legalInformation", "Lru/dodopizza/backend/domain/locality/dto/LegalInformationsDto;", "socialLinks", "Lru/dodopizza/backend/domain/locality/dto/SocialLinksDto;", "callCenterPhone", "isLanding", "", "orderTypeDiscountDto", "Lru/dodopizza/backend/domain/locality/dto/OrderTypeDiscountDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/locality/dto/UserAgreementDto;Lru/dodopizza/backend/domain/locality/dto/LegalInformationsDto;Lru/dodopizza/backend/domain/locality/dto/SocialLinksDto;Ljava/lang/String;ZLru/dodopizza/backend/domain/locality/dto/OrderTypeDiscountDto;)V", "getCallCenterPhone", "()Ljava/lang/String;", "getDeliveryZoneMapUrl", "()Z", "getLegalInformation", "()Lru/dodopizza/backend/domain/locality/dto/LegalInformationsDto;", "getLocalityId", "getOrderTypeDiscountDto", "()Lru/dodopizza/backend/domain/locality/dto/OrderTypeDiscountDto;", "getSocialLinks", "()Lru/dodopizza/backend/domain/locality/dto/SocialLinksDto;", "getUserAgreement", "()Lru/dodopizza/backend/domain/locality/dto/UserAgreementDto;", "getUuid", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocalityInfoDtoV3 {
    @uca("callCenterPhone")
    private final String callCenterPhone;
    @uca("deliveryZoneMapUrl")
    private final String deliveryZoneMapUrl;
    @uca("isLanding")
    private final boolean isLanding;
    @uca("legalInformation")
    private final LegalInformationsDto legalInformation;
    @uca("id")
    private final String localityId;
    @uca("discount")
    private final OrderTypeDiscountDto orderTypeDiscountDto;
    @uca("socialLinks")
    private final SocialLinksDto socialLinks;
    @uca("userAgreement")
    private final UserAgreementDto userAgreement;
    @uca("uuId")
    private final String uuid;

    public LocalityInfoDtoV3(String str, String str2, String str3, UserAgreementDto userAgreementDto, LegalInformationsDto legalInformationsDto, SocialLinksDto socialLinksDto, String str4, boolean z, OrderTypeDiscountDto orderTypeDiscountDto) {
        z65.h(str, "localityId");
        z65.h(str2, MessageAttributes.UUID);
        z65.h(userAgreementDto, "userAgreement");
        z65.h(legalInformationsDto, "legalInformation");
        z65.h(socialLinksDto, "socialLinks");
        z65.h(orderTypeDiscountDto, "orderTypeDiscountDto");
        this.localityId = str;
        this.uuid = str2;
        this.deliveryZoneMapUrl = str3;
        this.userAgreement = userAgreementDto;
        this.legalInformation = legalInformationsDto;
        this.socialLinks = socialLinksDto;
        this.callCenterPhone = str4;
        this.isLanding = z;
        this.orderTypeDiscountDto = orderTypeDiscountDto;
    }

    public final String getCallCenterPhone() {
        return this.callCenterPhone;
    }

    public final String getDeliveryZoneMapUrl() {
        return this.deliveryZoneMapUrl;
    }

    public final LegalInformationsDto getLegalInformation() {
        return this.legalInformation;
    }

    public final String getLocalityId() {
        return this.localityId;
    }

    public final OrderTypeDiscountDto getOrderTypeDiscountDto() {
        return this.orderTypeDiscountDto;
    }

    public final SocialLinksDto getSocialLinks() {
        return this.socialLinks;
    }

    public final UserAgreementDto getUserAgreement() {
        return this.userAgreement;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final boolean isLanding() {
        return this.isLanding;
    }

    public /* synthetic */ LocalityInfoDtoV3(String str, String str2, String str3, UserAgreementDto userAgreementDto, LegalInformationsDto legalInformationsDto, SocialLinksDto socialLinksDto, String str4, boolean z, OrderTypeDiscountDto orderTypeDiscountDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, userAgreementDto, legalInformationsDto, socialLinksDto, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? false : z, orderTypeDiscountDto);
    }
}
