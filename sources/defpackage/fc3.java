package defpackage;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.bonus.EasyBonusApi;
import ru.dodopizza.backend.domain.bonus.dto.BonusActionDto;
import ru.dodopizza.backend.domain.bonus.dto.EasyBonusRequestDto;
/* compiled from: EasyBonusServiceImpl.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lfc3;", "Lec3;", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "", "Lce0;", "getEasyBonusActions", "bonusActionId", "a", "Lru/dodopizza/backend/domain/bonus/EasyBonusApi;", "Lru/dodopizza/backend/domain/bonus/EasyBonusApi;", "easyBonusApi", "Lde0;", "b", "Lde0;", "bonusActionDtoMapper", "Lhq3;", c.a, "Lhq3;", "featureService", "<init>", "(Lru/dodopizza/backend/domain/bonus/EasyBonusApi;Lde0;Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fc3  reason: default package */
/* loaded from: classes4.dex */
public final class fc3 implements ec3 {
    private final EasyBonusApi a;
    private final de0 b;
    private final hq3 c;

    public fc3(EasyBonusApi easyBonusApi, de0 de0Var, hq3 hq3Var) {
        z65.h(easyBonusApi, "easyBonusApi");
        z65.h(de0Var, "bonusActionDtoMapper");
        z65.h(hq3Var, "featureService");
        this.a = easyBonusApi;
        this.b = de0Var;
        this.c = hq3Var;
    }

    @Override // defpackage.ec3
    public ce0 a(String str, String str2) {
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(str2, "bonusActionId");
        return this.b.b(this.a.applyEasyBonusAction(new EasyBonusRequestDto(str, str2)), this.c.a(bq3.j6));
    }

    @Override // defpackage.ec3
    public List<ce0> getEasyBonusActions(String str) {
        int w;
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        List<BonusActionDto> easyBonusActions = this.a.getEasyBonusActions(str);
        boolean a = this.c.a(bq3.j6);
        List<BonusActionDto> list = easyBonusActions;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (BonusActionDto bonusActionDto : list) {
            arrayList.add(this.b.b(bonusActionDto, a));
        }
        return arrayList;
    }
}
