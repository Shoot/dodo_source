package ru.dodopizza.app.domain.menu.promo;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PromoActionsRepository.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/dodopizza/app/domain/menu/promo/PromoActionsRepositoryImpl;", "Lru/dodopizza/app/domain/menu/promo/PromoActionsRepository;", "()V", "cache", "", "Lru/dodopizza/app/domain/menu/promo/PromoActionItem;", "getAll", "save", "", "categories", "", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromoActionsRepositoryImpl implements PromoActionsRepository {
    private volatile List<PromoActionItem> cache;

    public PromoActionsRepositoryImpl() {
        List<PromoActionItem> l;
        l = kc1.l();
        this.cache = l;
    }

    @Override // ru.dodopizza.app.domain.menu.promo.PromoActionsRepository
    public List<PromoActionItem> getAll() {
        List<PromoActionItem> F0;
        F0 = sc1.F0(this.cache);
        return F0;
    }

    @Override // ru.dodopizza.app.domain.menu.promo.PromoActionsRepository
    public void save(Collection<PromoActionItem> collection) {
        List<PromoActionItem> F0;
        z65.h(collection, "categories");
        F0 = sc1.F0(collection);
        this.cache = F0;
    }
}
