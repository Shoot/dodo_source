package ru.dodopizza.app.domain.menu.promo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PromoActionsService.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/domain/menu/promo/PromoActionsServiceImpl;", "Lru/dodopizza/app/domain/menu/promo/PromoActionsService;", "", "Lru/dodopizza/app/domain/menu/promo/PromoActionItem;", "items", "", "savePromoActions", "promoActionItems", "getAvailablePromoActions", "Lru/dodopizza/app/domain/menu/promo/PromoActionsRepository;", "promoActionsRepository", "Lru/dodopizza/app/domain/menu/promo/PromoActionsRepository;", "Lhq3;", "featureService", "Lhq3;", "<init>", "(Lru/dodopizza/app/domain/menu/promo/PromoActionsRepository;Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PromoActionsServiceImpl implements PromoActionsService {
    private final hq3 featureService;
    private final PromoActionsRepository promoActionsRepository;

    public PromoActionsServiceImpl(PromoActionsRepository promoActionsRepository, hq3 hq3Var) {
        z65.h(promoActionsRepository, "promoActionsRepository");
        z65.h(hq3Var, "featureService");
        this.promoActionsRepository = promoActionsRepository;
        this.featureService = hq3Var;
    }

    @Override // ru.dodopizza.app.domain.menu.promo.PromoActionsService
    public Collection<PromoActionItem> getAvailablePromoActions(Collection<PromoActionItem> collection) {
        List l;
        z65.h(collection, "promoActionItems");
        if (!this.featureService.a(bq3.E5)) {
            l = kc1.l();
            return l;
        }
        ArrayList arrayList = new ArrayList();
        for (PromoActionItem promoActionItem : collection) {
            if (z65.c(promoActionItem.getCode(), PromoActionCode.HERO.getCode()) && this.featureService.a(bq3.F5)) {
                arrayList.add(promoActionItem);
            } else if (z65.c(promoActionItem.getCode(), PromoActionCode.ASSISTANT.getCode())) {
                arrayList.add(promoActionItem);
            }
        }
        return arrayList;
    }

    @Override // ru.dodopizza.app.domain.menu.promo.PromoActionsService
    public void savePromoActions(Collection<PromoActionItem> collection) {
        z65.h(collection, "items");
        this.promoActionsRepository.save(collection);
    }
}
