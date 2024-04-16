package defpackage;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.common.ImageUrls;
import ru.dodopizza.backend.domain.menu.dto.ProductImageDto;
/* compiled from: MenuProductsConverter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0007"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "", "transparent", "Ltl8;", "b", "", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ug6  reason: default package */
/* loaded from: classes4.dex */
public final class ug6 {
    public static final String a(ProductImageDto productImageDto, boolean z) {
        String str = null;
        if (productImageDto != null) {
            if (z) {
                ImageUrls urls = productImageDto.getUrls();
                if (urls != null) {
                    str = urls.getWebp();
                }
            } else {
                str = productImageDto.getUrl();
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static final tl8 b(ProductImageDto productImageDto, boolean z) {
        Integer num;
        if (productImageDto != null) {
            num = Integer.valueOf(productImageDto.getType());
        } else {
            num = null;
        }
        return new tl8(((Number) mh5.c(num, 0)).intValue(), a(productImageDto, z));
    }
}
