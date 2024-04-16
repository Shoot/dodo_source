package ru.dodopizza.app.domain.menu.promo;

import java.util.Collection;
import kotlin.Metadata;
/* compiled from: PromoActionsService.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\t"}, d2 = {"Lru/dodopizza/app/domain/menu/promo/PromoActionsService;", "", "getAvailablePromoActions", "", "Lru/dodopizza/app/domain/menu/promo/PromoActionItem;", "promoActionItems", "savePromoActions", "", "items", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PromoActionsService {
    Collection<PromoActionItem> getAvailablePromoActions(Collection<PromoActionItem> collection);

    void savePromoActions(Collection<PromoActionItem> collection);
}
