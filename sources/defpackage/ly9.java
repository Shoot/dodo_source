package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.search.SearchPresenter;
/* compiled from: SearchModule.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J0\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u001a"}, d2 = {"Lly9;", "", "Lah6;", "menuService", "Le78;", "pizzaConceptService", "Lzd6;", "menuItemDescriptionUpdater", "Lze6;", "menuItemVOConverter", "Lhy9;", c.a, "interactor", "Lk63;", "domainEvents", "Lf63;", "router", "Lgc;", "analytics", "Lhl8;", "productCardScreenFactory", "Lru/dodopizza/app/presentation/search/SearchPresenter;", "b", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ly9  reason: default package */
/* loaded from: classes3.dex */
public final class ly9 {
    public static final ly9 a = new ly9();

    private ly9() {
    }

    public final zd6 a(ah6 ah6Var) {
        z65.h(ah6Var, "menuService");
        return new ae6(ah6Var);
    }

    public final SearchPresenter b(hy9 hy9Var, k63 k63Var, f63 f63Var, gc gcVar, hl8 hl8Var) {
        z65.h(hy9Var, "interactor");
        z65.h(k63Var, "domainEvents");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(hl8Var, "productCardScreenFactory");
        return new SearchPresenter(hy9Var, k63Var, f63Var, gcVar, hl8Var);
    }

    public final hy9 c(ah6 ah6Var, e78 e78Var, zd6 zd6Var, ze6 ze6Var) {
        z65.h(ah6Var, "menuService");
        z65.h(e78Var, "pizzaConceptService");
        z65.h(zd6Var, "menuItemDescriptionUpdater");
        z65.h(ze6Var, "menuItemVOConverter");
        return new iy9(ah6Var, e78Var, zd6Var, ze6Var);
    }
}
