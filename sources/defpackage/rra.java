package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.bonus.BonusActionApi;
import ru.dodopizza.backend.domain.bonus.dto.BonusActionDto;
/* compiled from: SpecialOfferService.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lrra;", "Lqra;", "", "localityId", "Ljk7;", "orderType", "orderPizzeriaId", "", "Lce0;", "a", "Lru/dodopizza/backend/domain/bonus/BonusActionApi;", "Lru/dodopizza/backend/domain/bonus/BonusActionApi;", "bonusActionApi", "Lde0;", "b", "Lde0;", "bonusActionDtoMapper", "Lhq3;", c.a, "Lhq3;", "featureService", "<init>", "(Lru/dodopizza/backend/domain/bonus/BonusActionApi;Lde0;Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rra  reason: default package */
/* loaded from: classes4.dex */
public final class rra implements qra {
    private final BonusActionApi a;
    private final de0 b;
    private final hq3 c;

    public rra(BonusActionApi bonusActionApi, de0 de0Var, hq3 hq3Var) {
        z65.h(bonusActionApi, "bonusActionApi");
        z65.h(de0Var, "bonusActionDtoMapper");
        z65.h(hq3Var, "featureService");
        this.a = bonusActionApi;
        this.b = de0Var;
        this.c = hq3Var;
    }

    @Override // defpackage.qra
    public Collection<ce0> a(String str, jk7 jk7Var, String str2) {
        List<BonusActionDto> localityBonusActions;
        int w;
        z65.h(str, "localityId");
        z65.h(jk7Var, "orderType");
        if (str2 != null && str2.length() != 0) {
            if (jk7Var == jk7.g) {
                localityBonusActions = this.a.getRestaurantBonusActions(str2);
            } else {
                localityBonusActions = this.a.getDeliveryBonusActions(str2);
            }
        } else {
            localityBonusActions = this.a.getLocalityBonusActions(str);
        }
        boolean a = this.c.a(bq3.j6);
        List<BonusActionDto> list = localityBonusActions;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (BonusActionDto bonusActionDto : list) {
            arrayList.add(this.b.b(bonusActionDto, a));
        }
        return arrayList;
    }
}
