package defpackage;

import com.dodopizza.order.feature.menu.adapters.menuitem.MenuCategoryItemVH;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: MenuCategoryItemBinder.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R,\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Led6;", "Loyb;", "Lcom/dodopizza/order/feature/menu/adapters/menuitem/MenuCategoryItemVH;", "Lfd6;", "view", "data", "", "position", "", "f", "Lkotlin/Function3;", "Ldh6;", "a", "Ly84;", "onClick", "<init>", "(Ly84;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ed6  reason: default package */
/* loaded from: classes2.dex */
public final class ed6 extends oyb<MenuCategoryItemVH, fd6> {
    private final y84<dh6, Integer, Integer, Unit> a;

    /* JADX WARN: Multi-variable type inference failed */
    public ed6(y84<? super dh6, ? super Integer, ? super Integer, Unit> y84Var) {
        z65.h(y84Var, "onClick");
        this.a = y84Var;
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void b(MenuCategoryItemVH menuCategoryItemVH, fd6 fd6Var, int i) {
        int i2;
        z65.h(menuCategoryItemVH, "view");
        z65.h(fd6Var, "data");
        menuCategoryItemVH.initialize(this.a, i);
        menuCategoryItemVH.setTitle(fd6Var.b().d());
        if (!fd6Var.c().isEmpty()) {
            menuCategoryItemVH.showSubcategoryTabs(fd6Var.c());
        } else {
            menuCategoryItemVH.hideSubcategoryTabs();
        }
        List<dh6> c = fd6Var.c();
        ListIterator<dh6> listIterator = c.listIterator(c.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (listIterator.previous().g()) {
                    i2 = listIterator.nextIndex();
                    break;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        menuCategoryItemVH.scrollToSelectedElement(i2);
    }
}
