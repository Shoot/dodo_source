package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.controlling.MysteryShopperCheckupApi;
import ru.dodopizza.backend.domain.controlling.dto.MysteryShopperCheckupRequestDto;
/* compiled from: MysteryShopperCheckupServiceImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, d2 = {"Lfs6;", "Les6;", "", "orderUuid", "Las6;", "b", c.a, "orderId", "a", "Lru/dodopizza/backend/domain/controlling/MysteryShopperCheckupApi;", "Lru/dodopizza/backend/domain/controlling/MysteryShopperCheckupApi;", "mysteryShopperCheckupApi", "Lbs6;", "Lbs6;", "mysteryShopperCheckupMapper", "<init>", "(Lru/dodopizza/backend/domain/controlling/MysteryShopperCheckupApi;Lbs6;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fs6  reason: default package */
/* loaded from: classes.dex */
public final class fs6 implements es6 {
    private final MysteryShopperCheckupApi a;
    private final bs6 b;

    public fs6(MysteryShopperCheckupApi mysteryShopperCheckupApi, bs6 bs6Var) {
        z65.h(mysteryShopperCheckupApi, "mysteryShopperCheckupApi");
        z65.h(bs6Var, "mysteryShopperCheckupMapper");
        this.a = mysteryShopperCheckupApi;
        this.b = bs6Var;
    }

    private final as6 b(String str) {
        return this.b.a(this.a.getMysteryShopperCheckup(new MysteryShopperCheckupRequestDto(str)));
    }

    private final String c(String str) {
        String F;
        F = l0b.F(str, "-", "", false, 4, null);
        return F;
    }

    @Override // defpackage.es6
    public as6 a(String str) {
        z65.h(str, "orderId");
        return b(c(str));
    }
}
