package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.uo0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.controlling.dto.MysteryShopperCheckupDto;
/* compiled from: MysteryShopperCheckupMapper.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, d2 = {"Lbs6;", "", "Lru/dodopizza/backend/domain/controlling/dto/MysteryShopperCheckupDto;", "dto", "Lds6;", e.a, "Lcs6;", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/backend/domain/controlling/dto/MysteryShopperCheckupDto$CardBodyBlockDto;", "blockDto", "Luo0;", c.a, "Luo0$a;", "b", "Luo0$b;", "f", "Las6;", "a", "Lhs6;", "Lhs6;", "formInfoMapper", "<init>", "(Lhs6;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bs6  reason: default package */
/* loaded from: classes.dex */
public final class bs6 {
    private final hs6 a;

    public bs6(hs6 hs6Var) {
        z65.h(hs6Var, "formInfoMapper");
        this.a = hs6Var;
    }

    private final uo0.a b(MysteryShopperCheckupDto.CardBodyBlockDto cardBodyBlockDto) {
        return new uo0.a(cardBodyBlockDto.getIconUrl(), cardBodyBlockDto.getText());
    }

    private final uo0 c(MysteryShopperCheckupDto.CardBodyBlockDto cardBodyBlockDto) {
        String blockType = cardBodyBlockDto.getBlockType();
        if (z65.c(blockType, "BulletListItem")) {
            return b(cardBodyBlockDto);
        }
        if (z65.c(blockType, "Text")) {
            return f(cardBodyBlockDto);
        }
        throw new IllegalStateException(("Unsupported card body block type: " + blockType).toString());
    }

    private final cs6 d(MysteryShopperCheckupDto mysteryShopperCheckupDto) {
        int w;
        String cardTitle = mysteryShopperCheckupDto.getCardTitle();
        List<MysteryShopperCheckupDto.CardBodyBlockDto> cardBody = mysteryShopperCheckupDto.getCardBody();
        w = lc1.w(cardBody, 10);
        ArrayList arrayList = new ArrayList(w);
        for (MysteryShopperCheckupDto.CardBodyBlockDto cardBodyBlockDto : cardBody) {
            arrayList.add(c(cardBodyBlockDto));
        }
        return new cs6(cardTitle, arrayList, mysteryShopperCheckupDto.getButtonTitle());
    }

    private final ds6 e(MysteryShopperCheckupDto mysteryShopperCheckupDto) {
        int w;
        String cardTitle = mysteryShopperCheckupDto.getCardTitle();
        List<MysteryShopperCheckupDto.CardBodyBlockDto> cardBody = mysteryShopperCheckupDto.getCardBody();
        w = lc1.w(cardBody, 10);
        ArrayList arrayList = new ArrayList(w);
        for (MysteryShopperCheckupDto.CardBodyBlockDto cardBodyBlockDto : cardBody) {
            arrayList.add(c(cardBodyBlockDto));
        }
        return new ds6(cardTitle, arrayList, mysteryShopperCheckupDto.getButtonTitle(), this.a.a(mysteryShopperCheckupDto));
    }

    private final uo0.b f(MysteryShopperCheckupDto.CardBodyBlockDto cardBodyBlockDto) {
        return new uo0.b(cardBodyBlockDto.getText());
    }

    public final as6 a(MysteryShopperCheckupDto mysteryShopperCheckupDto) {
        z65.h(mysteryShopperCheckupDto, "dto");
        if (!mysteryShopperCheckupDto.getShowCheckup()) {
            return tl6.a;
        }
        if (mysteryShopperCheckupDto.getButtonEnabled()) {
            return e(mysteryShopperCheckupDto);
        }
        return d(mysteryShopperCheckupDto);
    }
}
