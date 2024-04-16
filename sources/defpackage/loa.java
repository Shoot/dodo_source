package defpackage;

import defpackage.ym;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.product.card.snacks.SnackProductCardPresenter;
/* compiled from: SnackProductCardModule.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJH\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007J0\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¨\u0006\u001e"}, d2 = {"Lloa;", "", "", "menuItemId", "menuItemIdV5", "Lym$d;", "screen", "Lkoa;", "snackProductCardInteractor", "Lf63;", "dodoRouter", "Lf5b;", "systemTimeProvider", "Lt18;", "personalPriceTimer", "Lru/dodopizza/app/presentation/product/card/snacks/SnackProductCardPresenter;", "a", "Lah6;", "menuService", "Lds0;", "cartService", "Lsq0;", "cartItemDataFactory", "Lgc;", "analytics", "Lue6;", "menuItemV5ImageResolver", "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: loa  reason: default package */
/* loaded from: classes3.dex */
public final class loa {
    public static final loa a = new loa();

    private loa() {
    }

    public final SnackProductCardPresenter a(String str, String str2, ym.d dVar, koa koaVar, f63 f63Var, f5b f5bVar, t18 t18Var) {
        z65.h(str, "menuItemId");
        z65.h(dVar, "screen");
        z65.h(koaVar, "snackProductCardInteractor");
        z65.h(f63Var, "dodoRouter");
        z65.h(f5bVar, "systemTimeProvider");
        z65.h(t18Var, "personalPriceTimer");
        return new SnackProductCardPresenter(koaVar, dVar, str, str2, f63Var, f5bVar, t18Var);
    }

    public final koa b(ah6 ah6Var, ds0 ds0Var, sq0 sq0Var, gc gcVar, ue6 ue6Var) {
        z65.h(ah6Var, "menuService");
        z65.h(ds0Var, "cartService");
        z65.h(sq0Var, "cartItemDataFactory");
        z65.h(gcVar, "analytics");
        z65.h(ue6Var, "menuItemV5ImageResolver");
        return new koa(ah6Var, ds0Var, sq0Var, gcVar, ue6Var);
    }
}
