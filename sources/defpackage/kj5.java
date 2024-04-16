package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.landing.LandingDto;
import ru.dodopizza.backend.domain.landing.LandingLocalitySocialLinkDto;
/* compiled from: LandingConverter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lkj5;", "Ljj5;", "Lru/dodopizza/backend/domain/landing/LandingLocalitySocialLinkDto;", "landingLocalitySocialLinkDto", "Ltj5;", "b", "Lru/dodopizza/backend/domain/landing/LandingDto;", "landingDto", "Lhj5;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: kj5  reason: default package */
/* loaded from: classes4.dex */
public final class kj5 implements jj5 {
    private final tj5 b(LandingLocalitySocialLinkDto landingLocalitySocialLinkDto) {
        return new tj5(landingLocalitySocialLinkDto.getName(), landingLocalitySocialLinkDto.getUrl());
    }

    @Override // defpackage.jj5
    public hj5 a(LandingDto landingDto) {
        int w;
        z65.h(landingDto, "landingDto");
        String heading = landingDto.getLandingContent().getHeading();
        String subheading = landingDto.getLandingContent().getSubheading();
        String promoText = landingDto.getLandingContent().getPromoText();
        String personalDataAgreementUrl = landingDto.getLandingContent().getPersonalDataAgreementUrl();
        String termsOfServiceUrl = landingDto.getLandingContent().getTermsOfServiceUrl();
        String actionButtonText = landingDto.getLandingContent().getActionButtonText();
        String pizzeriaAddress = landingDto.getLandingContent().getPizzeriaAddress();
        List<LandingLocalitySocialLinkDto> socialLinks = landingDto.getLandingLocalityInfo().getSocialLinks();
        w = lc1.w(socialLinks, 10);
        ArrayList arrayList = new ArrayList(w);
        for (LandingLocalitySocialLinkDto landingLocalitySocialLinkDto : socialLinks) {
            arrayList.add(b(landingLocalitySocialLinkDto));
        }
        return new hj5(heading, subheading, promoText, personalDataAgreementUrl, termsOfServiceUrl, actionButtonText, pizzeriaAddress, arrayList);
    }
}
