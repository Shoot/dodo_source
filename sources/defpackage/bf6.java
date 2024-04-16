package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import ru.dodopizza.app.domain.menu.promo.ProductPromoAction;
import ru.dodopizza.app.domain.menu.promo.PromoActionCode;
/* compiled from: MenuItemVOConverter.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u001c\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002\u001a\u0014\u0010\r\u001a\u00020\t*\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u000e"}, d2 = {"Lqd6;", "menuItem", "Ll18;", "personalPrice", "Lkotlin/Pair;", "Lhn6;", "f", "Lz83;", "drinksTwoColumnChecker", "", "isForSearch", e.a, "Lye6;", DateTokenConverter.CONVERTER_KEY, "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: bf6  reason: default package */
/* loaded from: classes4.dex */
public final class bf6 {
    public static final /* synthetic */ boolean a(ye6 ye6Var, boolean z) {
        return d(ye6Var, z);
    }

    public static final /* synthetic */ boolean b(qd6 qd6Var, z83 z83Var, boolean z) {
        return e(qd6Var, z83Var, z);
    }

    public static final /* synthetic */ Pair c(qd6 qd6Var, l18 l18Var) {
        return f(qd6Var, l18Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(ye6 ye6Var, boolean z) {
        String str;
        Object obj;
        if (!ye6Var.p()) {
            Iterator<T> it = ye6Var.F().iterator();
            while (true) {
                str = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (((ProductPromoAction) obj).getKind() == 0) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ProductPromoAction productPromoAction = (ProductPromoAction) obj;
            if (productPromoAction != null) {
                str = productPromoAction.getCode();
            }
            if (z65.c(str, PromoActionCode.HERO.getCode()) && (((ye6Var instanceof rc9) || (ye6Var instanceof b93)) && !z)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(qd6 qd6Var, z83 z83Var, boolean z) {
        if (z65.c(qd6Var.h(), kl8.c.getId()) && z83Var.isEnabled() && !z) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<hn6, hn6> f(qd6 qd6Var, l18 l18Var) {
        if (rn6.c(l18Var.c(), qd6Var.k()) < 0) {
            return new Pair<>(l18Var.c(), qd6Var.k());
        }
        return new Pair<>(qd6Var.k(), null);
    }
}
