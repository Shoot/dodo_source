package ru.dodopizza.app.domain.menu.promo;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PromoActionsRepository.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&¨\u0006\t"}, d2 = {"Lru/dodopizza/app/domain/menu/promo/PromoActionsRepository;", "", "getAll", "", "Lru/dodopizza/app/domain/menu/promo/PromoActionItem;", "save", "", "categories", "", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PromoActionsRepository {
    List<PromoActionItem> getAll();

    void save(Collection<PromoActionItem> collection);
}
