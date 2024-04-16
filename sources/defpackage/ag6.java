package defpackage;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.dodopizza.persistence.entity.personalization.MenuPersonalPriceInfoEntity;
import com.dodopizza.persistence.entity.personalization.PersonalCategoryEntity;
import com.dodopizza.persistence.entity.personalization.PersonalizationEntity;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MenuPersonalPriceInfoRepository.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lag6;", "Lzf6;", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "Lvf6;", "find", "Lyz7;", "a", "", "getAll", "Lava;", "Lava;", "stateProvider", "Lxf6;", "b", "Lxf6;", "menuPersonalPriceInfoConverter", "<init>", "(Lava;Lxf6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ag6  reason: default package */
/* loaded from: classes4.dex */
public final class ag6 implements zf6 {
    private final ava a;
    private final xf6 b;

    public ag6(ava avaVar, xf6 xf6Var) {
        z65.h(avaVar, "stateProvider");
        z65.h(xf6Var, "menuPersonalPriceInfoConverter");
        this.a = avaVar;
        this.b = xf6Var;
    }

    @Override // defpackage.zf6
    public yz7 a() {
        PersonalCategoryEntity personalCategory;
        PersonalizationEntity personalization = this.a.e().getPersonalization();
        if (personalization != null && (personalCategory = personalization.getPersonalCategory()) != null) {
            return new yz7(personalCategory.getIndex(), personalCategory.getCategoryId(), personalCategory.getName());
        }
        return null;
    }

    @Override // defpackage.zf6
    public vf6 find(String str) {
        Object obj;
        boolean v;
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        Iterator<T> it = getAll().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                v = l0b.v(((vf6) obj).g(), str, true);
                if (v) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (vf6) obj;
    }

    @Override // defpackage.zf6
    public Collection<vf6> getAll() {
        List list;
        k0<MenuPersonalPriceInfoEntity> menuPersonalPricesInfo;
        int w;
        PersonalizationEntity personalization = this.a.e().getPersonalization();
        if (personalization != null && (menuPersonalPricesInfo = personalization.getMenuPersonalPricesInfo()) != null) {
            xf6 xf6Var = this.b;
            w = lc1.w(menuPersonalPricesInfo, 10);
            list = new ArrayList(w);
            for (MenuPersonalPriceInfoEntity menuPersonalPriceInfoEntity : menuPersonalPricesInfo) {
                list.add(xf6Var.a(menuPersonalPriceInfoEntity));
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = kc1.l();
        }
        return list;
    }
}
