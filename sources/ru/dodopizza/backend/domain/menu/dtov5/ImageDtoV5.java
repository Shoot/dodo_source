package ru.dodopizza.backend.domain.menu.dtov5;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: ImageDtoV5.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/ImageDtoV5;", "", "urlPattern", "", "imageMeta", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getImageMeta", "()Ljava/util/Map;", "getUrlPattern", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageDtoV5 {
    @uca("imageMeta")
    private final Map<String, Object> imageMeta;
    @uca("urlPattern")
    private final String urlPattern;

    public ImageDtoV5(String str, Map<String, ? extends Object> map) {
        z65.h(str, "urlPattern");
        z65.h(map, "imageMeta");
        this.urlPattern = str;
        this.imageMeta = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageDtoV5 copy$default(ImageDtoV5 imageDtoV5, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageDtoV5.urlPattern;
        }
        if ((i & 2) != 0) {
            map = imageDtoV5.imageMeta;
        }
        return imageDtoV5.copy(str, map);
    }

    public final String component1() {
        return this.urlPattern;
    }

    public final Map<String, Object> component2() {
        return this.imageMeta;
    }

    public final ImageDtoV5 copy(String str, Map<String, ? extends Object> map) {
        z65.h(str, "urlPattern");
        z65.h(map, "imageMeta");
        return new ImageDtoV5(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageDtoV5)) {
            return false;
        }
        ImageDtoV5 imageDtoV5 = (ImageDtoV5) obj;
        if (z65.c(this.urlPattern, imageDtoV5.urlPattern) && z65.c(this.imageMeta, imageDtoV5.imageMeta)) {
            return true;
        }
        return false;
    }

    public final Map<String, Object> getImageMeta() {
        return this.imageMeta;
    }

    public final String getUrlPattern() {
        return this.urlPattern;
    }

    public int hashCode() {
        return (this.urlPattern.hashCode() * 31) + this.imageMeta.hashCode();
    }

    public String toString() {
        String str = this.urlPattern;
        Map<String, Object> map = this.imageMeta;
        return "ImageDtoV5(urlPattern=" + str + ", imageMeta=" + map + ")";
    }
}
