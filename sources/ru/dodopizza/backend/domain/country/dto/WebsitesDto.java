package ru.dodopizza.backend.domain.country.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: WebsitesDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lru/dodopizza/backend/domain/country/dto/WebsitesDto;", "", "controlling", "", "general", "recruiting", "noGloves", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getControlling", "()Ljava/lang/String;", "getGeneral", "getNoGloves", "getRecruiting", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebsitesDto {
    @uca("controlling")
    private final String controlling;
    @uca("general")
    private final String general;
    @uca("noGloves")
    private final String noGloves;
    @uca("recruiting")
    private final String recruiting;

    public WebsitesDto() {
        this(null, null, null, null, 15, null);
    }

    public final String getControlling() {
        return this.controlling;
    }

    public final String getGeneral() {
        return this.general;
    }

    public final String getNoGloves() {
        return this.noGloves;
    }

    public final String getRecruiting() {
        return this.recruiting;
    }

    public WebsitesDto(String str, String str2, String str3, String str4) {
        z65.h(str, "controlling");
        z65.h(str2, "general");
        z65.h(str3, "recruiting");
        z65.h(str4, "noGloves");
        this.controlling = str;
        this.general = str2;
        this.recruiting = str3;
        this.noGloves = str4;
    }

    public /* synthetic */ WebsitesDto(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
