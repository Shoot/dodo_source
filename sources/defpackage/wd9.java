package defpackage;

import com.dodopizza.order.feature.product.card.presentation.removeingredient.RemoveIngredientsPresenter;
import java.util.List;
import kotlin.Metadata;
/* compiled from: RemoveIngredientsModule.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\r"}, d2 = {"Lwd9;", "", "", "menuItemId", "", "Lvl8;", "ingredients", "Lgc;", "analytics", "Lcom/dodopizza/order/feature/product/card/presentation/removeingredient/RemoveIngredientsPresenter;", "a", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wd9  reason: default package */
/* loaded from: classes2.dex */
public final class wd9 {
    public static final wd9 a = new wd9();

    private wd9() {
    }

    public final RemoveIngredientsPresenter a(String str, List<vl8> list, gc gcVar) {
        z65.h(str, "menuItemId");
        z65.h(list, "ingredients");
        z65.h(gcVar, "analytics");
        return new RemoveIngredientsPresenter(str, list, gcVar);
    }
}
