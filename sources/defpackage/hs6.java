package defpackage;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.controlling.dto.MysteryShopperCheckupDto;
/* compiled from: MysteryShopperFormInfoMapper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lhs6;", "", "Lru/dodopizza/backend/domain/controlling/dto/MysteryShopperCheckupDto;", "dto", "Lgs6;", "a", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hs6  reason: default package */
/* loaded from: classes.dex */
public final class hs6 {
    public final gs6 a(MysteryShopperCheckupDto mysteryShopperCheckupDto) {
        z65.h(mysteryShopperCheckupDto, "dto");
        String formLink = mysteryShopperCheckupDto.getFormLink();
        if (formLink != null) {
            return new gs6(formLink);
        }
        throw new IllegalArgumentException("Form link is missing".toString());
    }
}
