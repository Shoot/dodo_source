package ru.dodopizza.backend.domain.country.dto;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.BonusActionEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CountryDto.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/dodopizza/backend/domain/country/dto/CountryDto;", "", Action.NAME_ATTRIBUTE, "", "code", "isoName", "currency", "Lru/dodopizza/backend/domain/country/dto/CurrencyDto;", "languages", "", "features", "Lru/dodopizza/backend/domain/country/dto/FeatureDto;", "phone", "Lru/dodopizza/backend/domain/country/dto/PhoneDto;", "feedback", "Lru/dodopizza/backend/domain/country/dto/FeedbackDto;", "state", "", "websites", "Lru/dodopizza/backend/domain/country/dto/WebsitesDto;", "baseUrl", BonusActionEntity.ORDER, "mapBounds", "Lru/dodopizza/backend/domain/country/dto/MapBoundsDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/country/dto/CurrencyDto;Ljava/util/List;Ljava/util/List;Lru/dodopizza/backend/domain/country/dto/PhoneDto;Lru/dodopizza/backend/domain/country/dto/FeedbackDto;ILru/dodopizza/backend/domain/country/dto/WebsitesDto;Ljava/lang/String;ILru/dodopizza/backend/domain/country/dto/MapBoundsDto;)V", "getBaseUrl", "()Ljava/lang/String;", "getCode", "getCurrency", "()Lru/dodopizza/backend/domain/country/dto/CurrencyDto;", "getFeatures", "()Ljava/util/List;", "getFeedback", "()Lru/dodopizza/backend/domain/country/dto/FeedbackDto;", "getIsoName", "getLanguages", "getMapBounds", "()Lru/dodopizza/backend/domain/country/dto/MapBoundsDto;", "getName", "getOrder", "()I", "getPhone", "()Lru/dodopizza/backend/domain/country/dto/PhoneDto;", "getState", "getWebsites", "()Lru/dodopizza/backend/domain/country/dto/WebsitesDto;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CountryDto {
    @uca("baseUrl")
    private final String baseUrl;
    @uca("code")
    private final String code;
    @uca("currency")
    private final CurrencyDto currency;
    @uca("features")
    private final List<FeatureDto> features;
    @uca("feedback")
    private final FeedbackDto feedback;
    @uca("isoName")
    private final String isoName;
    @uca("languages")
    private final List<String> languages;
    @uca("mapBounds")
    private final MapBoundsDto mapBounds;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca(BonusActionEntity.ORDER)
    private final int order;
    @uca("phone")
    private final PhoneDto phone;
    @uca("state")
    private final int state;
    @uca("websites")
    private final WebsitesDto websites;

    public CountryDto(String str, String str2, String str3, CurrencyDto currencyDto, List<String> list, List<FeatureDto> list2, PhoneDto phoneDto, FeedbackDto feedbackDto, int i, WebsitesDto websitesDto, String str4, int i2, MapBoundsDto mapBoundsDto) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "code");
        z65.h(str3, "isoName");
        z65.h(currencyDto, "currency");
        z65.h(list, "languages");
        z65.h(list2, "features");
        z65.h(str4, "baseUrl");
        this.name = str;
        this.code = str2;
        this.isoName = str3;
        this.currency = currencyDto;
        this.languages = list;
        this.features = list2;
        this.phone = phoneDto;
        this.feedback = feedbackDto;
        this.state = i;
        this.websites = websitesDto;
        this.baseUrl = str4;
        this.order = i2;
        this.mapBounds = mapBoundsDto;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getCode() {
        return this.code;
    }

    public final CurrencyDto getCurrency() {
        return this.currency;
    }

    public final List<FeatureDto> getFeatures() {
        return this.features;
    }

    public final FeedbackDto getFeedback() {
        return this.feedback;
    }

    public final String getIsoName() {
        return this.isoName;
    }

    public final List<String> getLanguages() {
        return this.languages;
    }

    public final MapBoundsDto getMapBounds() {
        return this.mapBounds;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOrder() {
        return this.order;
    }

    public final PhoneDto getPhone() {
        return this.phone;
    }

    public final int getState() {
        return this.state;
    }

    public final WebsitesDto getWebsites() {
        return this.websites;
    }

    public /* synthetic */ CountryDto(String str, String str2, String str3, CurrencyDto currencyDto, List list, List list2, PhoneDto phoneDto, FeedbackDto feedbackDto, int i, WebsitesDto websitesDto, String str4, int i2, MapBoundsDto mapBoundsDto, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, currencyDto, list, list2, (i3 & 64) != 0 ? null : phoneDto, (i3 & 128) != 0 ? null : feedbackDto, i, (i3 & 512) != 0 ? null : websitesDto, str4, i2, (i3 & 4096) != 0 ? null : mapBoundsDto);
    }
}
