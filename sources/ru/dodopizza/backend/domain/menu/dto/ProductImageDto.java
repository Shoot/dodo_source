package ru.dodopizza.backend.domain.menu.dto;

import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.common.ImageUrls;
/* compiled from: ProductImageDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "", "size", "", MessageAttributes.TYPE, RemoteMessageConst.Notification.URL, "", "urls", "Lru/dodopizza/backend/domain/common/ImageUrls;", "(IILjava/lang/String;Lru/dodopizza/backend/domain/common/ImageUrls;)V", "getSize", "()I", "getType", "getUrl", "()Ljava/lang/String;", "getUrls", "()Lru/dodopizza/backend/domain/common/ImageUrls;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductImageDto {
    @uca("size")
    private final int size;
    @uca(MessageAttributes.TYPE)
    private final int type;
    @uca(RemoteMessageConst.Notification.URL)
    private final String url;
    @uca("urls")
    private final ImageUrls urls;

    public ProductImageDto() {
        this(0, 0, null, null, 15, null);
    }

    public final int getSize() {
        return this.size;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final ImageUrls getUrls() {
        return this.urls;
    }

    public ProductImageDto(int i, int i2, String str, ImageUrls imageUrls) {
        this.size = i;
        this.type = i2;
        this.url = str;
        this.urls = imageUrls;
    }

    public /* synthetic */ ProductImageDto(int i, int i2, String str, ImageUrls imageUrls, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? null : imageUrls);
    }
}
