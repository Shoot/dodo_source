package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.ym;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter;
/* compiled from: ComboTemplateModule.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJH\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007J0\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¨\u0006\u001f"}, d2 = {"Lui1;", "", "", "menuId", "", "slot", "selectedProductId", "Lym$d;", "screen", "Lqi1;", "comboConstructorInteractor", "Lah1;", "comboCustomizeInteractor", "Lgc;", "analytics", "Lru/dodopizza/app/presentation/product/card/combo/constructor/ComboTemplateConstructorPresenter;", c.a, "Lah6;", "menuService", "Lc62;", "customizationService", "Lmxa;", "stopRepository", "Lgp4;", "hotAndReadyService", "Lhq3;", "featureService", "b", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ui1  reason: default package */
/* loaded from: classes3.dex */
public final class ui1 {
    public static final ui1 a = new ui1();

    private ui1() {
    }

    public final ah1 a(c62 c62Var, mxa mxaVar) {
        z65.h(c62Var, "customizationService");
        z65.h(mxaVar, "stopRepository");
        return new ah1(c62Var, mxaVar, null, 4, null);
    }

    public final qi1 b(ah6 ah6Var, c62 c62Var, mxa mxaVar, gp4 gp4Var, hq3 hq3Var) {
        z65.h(ah6Var, "menuService");
        z65.h(c62Var, "customizationService");
        z65.h(mxaVar, "stopRepository");
        z65.h(gp4Var, "hotAndReadyService");
        z65.h(hq3Var, "featureService");
        return new ri1(ah6Var, c62Var, mxaVar, gp4Var, hq3Var);
    }

    public final ComboTemplateConstructorPresenter c(String str, int i, String str2, ym.d dVar, qi1 qi1Var, ah1 ah1Var, gc gcVar) {
        z65.h(str, "menuId");
        z65.h(str2, "selectedProductId");
        z65.h(dVar, "screen");
        z65.h(qi1Var, "comboConstructorInteractor");
        z65.h(ah1Var, "comboCustomizeInteractor");
        z65.h(gcVar, "analytics");
        return new ComboTemplateConstructorPresenter(str, i, str2, qi1Var, ah1Var, gcVar, dVar);
    }
}
