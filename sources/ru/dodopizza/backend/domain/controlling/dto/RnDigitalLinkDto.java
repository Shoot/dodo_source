package ru.dodopizza.backend.domain.controlling.dto;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.common.ImageUrls;
/* compiled from: RnDigitalLinkDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/dodopizza/backend/domain/controlling/dto/RnDigitalLinkDto;", "", "showCheckup", "", "formLink", "", "title", "productImageUrl", "productImageUrls", "Lru/dodopizza/backend/domain/common/ImageUrls;", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/common/ImageUrls;)V", "getFormLink", "()Ljava/lang/String;", "getProductImageUrl", "getProductImageUrls", "()Lru/dodopizza/backend/domain/common/ImageUrls;", "getShowCheckup", "()Z", "getTitle", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RnDigitalLinkDto {
    @uca("formLink")
    private final String formLink;
    @uca("productImageUrl")
    private final String productImageUrl;
    @uca("productImageUrls")
    private final ImageUrls productImageUrls;
    @uca("showCheckup")
    private final boolean showCheckup;
    @uca("title")
    private final String title;

    public RnDigitalLinkDto(boolean z, String str, String str2, String str3, ImageUrls imageUrls) {
        this.showCheckup = z;
        this.formLink = str;
        this.title = str2;
        this.productImageUrl = str3;
        this.productImageUrls = imageUrls;
    }

    public final String getFormLink() {
        return this.formLink;
    }

    public final String getProductImageUrl() {
        return this.productImageUrl;
    }

    public final ImageUrls getProductImageUrls() {
        return this.productImageUrls;
    }

    public final boolean getShowCheckup() {
        return this.showCheckup;
    }

    public final String getTitle() {
        return this.title;
    }
}
