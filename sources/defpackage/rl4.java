package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.ym;
import kotlin.Metadata;
import kotlin.Pair;
import ru.dodopizza.app.presentation.product.card.halves.HalvesProductCardPresenter;
/* compiled from: HalvesProductCardModule.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJB\u0010\r\u001a\u00020\f2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J8\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007J\b\u0010\u001c\u001a\u00020\u001bH\u0007¨\u0006\u001f"}, d2 = {"Lrl4;", "", "Lkotlin/Pair;", "", "chosenHalves", "Lym$d;", "screen", "menuItemId", "Lql4;", "interactor", "Lf63;", "dodoRouter", "Lru/dodopizza/app/presentation/product/card/halves/HalvesProductCardPresenter;", "b", "Lah6;", "menuService", "Lds0;", "cartService", "Lsq0;", "cartItemDataFactory", "Lg78;", "pizzaDoughNameFormatter", "Le78;", "pizzaConceptService", "Lgc;", "analytics", "a", "Lvu4;", c.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: rl4  reason: default package */
/* loaded from: classes3.dex */
public final class rl4 {
    public static final rl4 a = new rl4();

    private rl4() {
    }

    public final ql4 a(ah6 ah6Var, ds0 ds0Var, sq0 sq0Var, g78 g78Var, e78 e78Var, gc gcVar) {
        z65.h(ah6Var, "menuService");
        z65.h(ds0Var, "cartService");
        z65.h(sq0Var, "cartItemDataFactory");
        z65.h(g78Var, "pizzaDoughNameFormatter");
        z65.h(e78Var, "pizzaConceptService");
        z65.h(gcVar, "analytics");
        return new ql4(ah6Var, ds0Var, sq0Var, g78Var, e78Var, gcVar);
    }

    public final HalvesProductCardPresenter b(Pair<String, String> pair, ym.d dVar, String str, ql4 ql4Var, f63 f63Var) {
        z65.h(pair, "chosenHalves");
        z65.h(dVar, "screen");
        z65.h(str, "menuItemId");
        z65.h(ql4Var, "interactor");
        z65.h(f63Var, "dodoRouter");
        return new HalvesProductCardPresenter(pair, ql4Var, dVar, f63Var, str);
    }

    public final vu4 c() {
        return new el4();
    }
}
