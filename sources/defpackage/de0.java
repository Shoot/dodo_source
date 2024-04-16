package defpackage;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.bonus.dto.BonusActionDto;
import ru.dodopizza.backend.domain.common.ImageUrls;
/* compiled from: BonusActionDtoMapper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003¨\u0006\r"}, d2 = {"Lde0;", "", "Lru/dodopizza/backend/domain/bonus/dto/BonusActionDto;", "", "transparent", "", "a", "dto", "isTransparentImageUrlEnabled", "Lce0;", "b", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: de0  reason: default package */
/* loaded from: classes4.dex */
public final class de0 {
    private final String a(BonusActionDto bonusActionDto, boolean z) {
        String imageUrl;
        if (z) {
            ImageUrls imageUrls = bonusActionDto.getImageUrls();
            if (imageUrls != null) {
                imageUrl = imageUrls.getWebp();
            } else {
                imageUrl = null;
            }
        } else {
            imageUrl = bonusActionDto.getImageUrl();
        }
        if (imageUrl == null) {
            return "";
        }
        return imageUrl;
    }

    public final ce0 b(BonusActionDto bonusActionDto, boolean z) {
        String str;
        String str2;
        String str3;
        z65.h(bonusActionDto, "dto");
        String id = bonusActionDto.getId();
        if (id == null) {
            str = "";
        } else {
            str = id;
        }
        String title = bonusActionDto.getTitle();
        if (title == null) {
            str2 = "";
        } else {
            str2 = title;
        }
        String description = bonusActionDto.getDescription();
        if (description == null) {
            str3 = "";
        } else {
            str3 = description;
        }
        return new ce0(str, str2, str3, a(bonusActionDto, z), new xp(yp.a.a(bonusActionDto.getActionType()), bonusActionDto.getActionValue()));
    }
}
