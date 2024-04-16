package ru.dodopizza.backend.domain.covid;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.common.ImageUrls;
/* compiled from: CovidWarningInfoDto.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lru/dodopizza/backend/domain/covid/CovidWarningInfoDto;", "", "title", "", "text", "imageUrl", "checkoutText", "imageUrls", "Lru/dodopizza/backend/domain/common/ImageUrls;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/common/ImageUrls;)V", "getCheckoutText", "()Ljava/lang/String;", "getImageUrl", "getImageUrls", "()Lru/dodopizza/backend/domain/common/ImageUrls;", "getText", "getTitle", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CovidWarningInfoDto {
    @uca("checkoutText")
    private final String checkoutText;
    @uca("imageUrl")
    private final String imageUrl;
    @uca("imageUrls")
    private final ImageUrls imageUrls;
    @uca("text")
    private final String text;
    @uca("title")
    private final String title;

    public CovidWarningInfoDto(String str, String str2, String str3, String str4, ImageUrls imageUrls) {
        z65.h(str, "title");
        z65.h(str2, "text");
        z65.h(str3, "imageUrl");
        z65.h(str4, "checkoutText");
        this.title = str;
        this.text = str2;
        this.imageUrl = str3;
        this.checkoutText = str4;
        this.imageUrls = imageUrls;
    }

    public final String getCheckoutText() {
        return this.checkoutText;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final ImageUrls getImageUrls() {
        return this.imageUrls;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }
}
