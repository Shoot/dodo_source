package defpackage;

import defpackage.ym;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter;
/* compiled from: VariableProductCardModule.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J^\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007JH\u0010%\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0007¨\u0006("}, d2 = {"Lxwb;", "", "Lwwb;", "interactor", "", "cartItemId", "menuItemId", "Lym$d;", "screen", "Lf63;", "router", "Lhq3;", "featureService", "Lf5b;", "systemTimeProvider", "Ljn6;", "moneyFactory", "Lt18;", "personalPriceTimer", "Lgc;", "analytics", "Lru/dodopizza/app/presentation/product/card/variable/VariableProductCardPresenter;", "b", "Lah6;", "menuService", "Lds0;", "cartService", "Lc62;", "customizationService", "Lsq0;", "cartItemDataFactory", "Lmxa;", "stopRepository", "Lwr2;", "defaultShoppingItemSelectorFactory", "Lava;", "stateProvider", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: xwb  reason: default package */
/* loaded from: classes3.dex */
public final class xwb {
    public static final xwb a = new xwb();

    private xwb() {
    }

    public final wwb a(ah6 ah6Var, ds0 ds0Var, c62 c62Var, sq0 sq0Var, mxa mxaVar, gc gcVar, wr2 wr2Var, ava avaVar) {
        z65.h(ah6Var, "menuService");
        z65.h(ds0Var, "cartService");
        z65.h(c62Var, "customizationService");
        z65.h(sq0Var, "cartItemDataFactory");
        z65.h(mxaVar, "stopRepository");
        z65.h(gcVar, "analytics");
        z65.h(wr2Var, "defaultShoppingItemSelectorFactory");
        z65.h(avaVar, "stateProvider");
        return new wwb(ah6Var, ds0Var, c62Var, sq0Var, mxaVar, gcVar, avaVar, wr2Var);
    }

    public final VariableProductCardPresenter b(wwb wwbVar, String str, String str2, ym.d dVar, f63 f63Var, hq3 hq3Var, f5b f5bVar, jn6 jn6Var, t18 t18Var, gc gcVar) {
        z65.h(wwbVar, "interactor");
        z65.h(str, "cartItemId");
        z65.h(str2, "menuItemId");
        z65.h(dVar, "screen");
        z65.h(f63Var, "router");
        z65.h(hq3Var, "featureService");
        z65.h(f5bVar, "systemTimeProvider");
        z65.h(jn6Var, "moneyFactory");
        z65.h(t18Var, "personalPriceTimer");
        z65.h(gcVar, "analytics");
        return new VariableProductCardPresenter(wwbVar, str, str2, dVar, hq3Var, f63Var, f5bVar, jn6Var, t18Var, gcVar);
    }
}
