package defpackage;

import java.util.Collection;
import kotlin.Metadata;
import ru.dodopizza.app.domain.menu.promo.PromoActionItem;
/* compiled from: MenuItemConverterFactory.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lvd6;", "Lud6;", "", "Lfl8;", "products", "Lru/dodopizza/app/domain/menu/promo/PromoActionItem;", "availablePromoActionItems", "Ltd6;", "a", "Lhq3;", "Lhq3;", "featureService", "<init>", "(Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vd6  reason: default package */
/* loaded from: classes4.dex */
public final class vd6 implements ud6 {
    private final hq3 a;

    public vd6(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        this.a = hq3Var;
    }

    @Override // defpackage.ud6
    public td6 a(Collection<? extends fl8> collection, Collection<PromoActionItem> collection2) {
        z65.h(collection, "products");
        z65.h(collection2, "availablePromoActionItems");
        return new wd6(collection, collection2, this.a.a(bq3.j6));
    }
}
