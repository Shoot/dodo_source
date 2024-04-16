package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.ym;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter;
import ru.dodopizza.app.presentation.product.card.combo.b;
/* compiled from: ComboProductCardModule.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106J~\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007JV\u0010.\u001a\u00020-2\b\b\u0001\u0010\"\u001a\u00020!2\b\b\u0001\u0010#\u001a\u00020!2\b\b\u0001\u0010%\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007J(\u00103\u001a\u00020)2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u00104\u001a\u00020'2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¨\u00067"}, d2 = {"Lvh1;", "", "Lah6;", "menuService", "Lds0;", "cartService", "Lv52;", "customerSettingsService", "Lc62;", "customizationService", "Lgj0;", "buyMoreService", "Lvc6;", "memoryDataSource", "Lmxa;", "stopRepository", "Lgp4;", "hotAndReadyService", "Lsq0;", "cartItemDataFactory", "Lgc;", "analytics", "Lhq3;", "featureService", "", "Lsi8;", "preferredSlotProducts", "Lgi1;", "comboSlotsService", "Ljn6;", "moneyFactory", "Lru/dodopizza/app/presentation/product/card/combo/b;", DateTokenConverter.CONVERTER_KEY, "", "menuItemId", "cartItemId", "Lym$d;", "screen", "comboProductCardInteractor", "Lah1;", "comboCustomizeBuilderInteractor", "Lti0;", "buyMoreInfoInteractor", "Lf63;", "dodoRouter", "Lru/dodopizza/app/presentation/product/card/combo/ComboProductCardPresenter;", "b", "Lava;", "stateProvider", "Luja;", "shoppingItemRepository", "a", c.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: vh1  reason: default package */
/* loaded from: classes3.dex */
public final class vh1 {
    public static final vh1 a = new vh1();

    private vh1() {
    }

    public final ti0 a(gj0 gj0Var, ava avaVar, uja ujaVar, ah6 ah6Var) {
        z65.h(gj0Var, "buyMoreService");
        z65.h(avaVar, "stateProvider");
        z65.h(ujaVar, "shoppingItemRepository");
        z65.h(ah6Var, "menuService");
        return new ti0(gj0Var, avaVar, ujaVar, ah6Var);
    }

    public final ComboProductCardPresenter b(String str, String str2, ym.d dVar, hq3 hq3Var, b bVar, ah1 ah1Var, ti0 ti0Var, f63 f63Var, jn6 jn6Var) {
        z65.h(str, "menuItemId");
        z65.h(str2, "cartItemId");
        z65.h(dVar, "screen");
        z65.h(hq3Var, "featureService");
        z65.h(bVar, "comboProductCardInteractor");
        z65.h(ah1Var, "comboCustomizeBuilderInteractor");
        z65.h(ti0Var, "buyMoreInfoInteractor");
        z65.h(f63Var, "dodoRouter");
        z65.h(jn6Var, "moneyFactory");
        return new ComboProductCardPresenter(str2, bVar, ti0Var, ah1Var, hq3Var, jn6Var, dVar, str, f63Var);
    }

    public final ah1 c(c62 c62Var, mxa mxaVar) {
        z65.h(c62Var, "customizationService");
        z65.h(mxaVar, "stopRepository");
        return new ah1(c62Var, mxaVar, null, 4, null);
    }

    public final b d(ah6 ah6Var, ds0 ds0Var, v52 v52Var, c62 c62Var, gj0 gj0Var, vc6 vc6Var, mxa mxaVar, gp4 gp4Var, sq0 sq0Var, gc gcVar, hq3 hq3Var, List<si8> list, gi1 gi1Var, jn6 jn6Var) {
        z65.h(ah6Var, "menuService");
        z65.h(ds0Var, "cartService");
        z65.h(v52Var, "customerSettingsService");
        z65.h(c62Var, "customizationService");
        z65.h(gj0Var, "buyMoreService");
        z65.h(vc6Var, "memoryDataSource");
        z65.h(mxaVar, "stopRepository");
        z65.h(gp4Var, "hotAndReadyService");
        z65.h(sq0Var, "cartItemDataFactory");
        z65.h(gcVar, "analytics");
        z65.h(hq3Var, "featureService");
        z65.h(list, "preferredSlotProducts");
        z65.h(gi1Var, "comboSlotsService");
        z65.h(jn6Var, "moneyFactory");
        return new b(ah6Var, ds0Var, v52Var, c62Var, gj0Var, vc6Var, mxaVar, gp4Var, sq0Var, gcVar, hq3Var, list, gi1Var, jn6Var);
    }
}
