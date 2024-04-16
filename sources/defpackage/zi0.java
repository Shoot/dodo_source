package defpackage;

import kotlin.Metadata;
import ru.dodopizza.app.presentation.product.card.combo.BuyMorePresenter;
/* compiled from: BuyMoreModule.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\u0015"}, d2 = {"Lzi0;", "", "Lsi0;", "buyMoreInfo", "Lds0;", "cartService", "Luja;", "shoppingItemRepository", "Lsq0;", "cartItemDataFactory", "Lgc;", "analytics", "Lui0;", "a", "Lf63;", "dodoRouter", "buyMoreInteractor", "Lru/dodopizza/app/presentation/product/card/combo/BuyMorePresenter;", "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: zi0  reason: default package */
/* loaded from: classes3.dex */
public final class zi0 {
    public static final zi0 a = new zi0();

    private zi0() {
    }

    public final ui0 a(si0 si0Var, ds0 ds0Var, uja ujaVar, sq0 sq0Var, gc gcVar) {
        z65.h(si0Var, "buyMoreInfo");
        z65.h(ds0Var, "cartService");
        z65.h(ujaVar, "shoppingItemRepository");
        z65.h(sq0Var, "cartItemDataFactory");
        z65.h(gcVar, "analytics");
        return new ui0(si0Var, ds0Var, ujaVar, sq0Var, gcVar);
    }

    public final BuyMorePresenter b(f63 f63Var, ui0 ui0Var, gc gcVar) {
        z65.h(f63Var, "dodoRouter");
        z65.h(ui0Var, "buyMoreInteractor");
        z65.h(gcVar, "analytics");
        return new BuyMorePresenter(ui0Var, f63Var, gcVar);
    }
}
