package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.kl8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.app.domain.menu.promo.PromoActionItem;
import ru.dodopizza.app.domain.menu.promo.PromoActionsService;
import ru.dodopizza.backend.domain.menu.dto.MenuCategoryDto;
import ru.dodopizza.backend.domain.menu.dto.MenuDto;
import ru.dodopizza.backend.domain.menu.dto.MenuItemDto;
import ru.dodopizza.backend.domain.menu.dto.PopularProductDto;
import ru.dodopizza.backend.domain.menu.dto.PromoActionItemDto;
import ru.dodopizza.backend.domain.menu.dto.SubCategoryDto;
/* compiled from: MenuConverterImpl.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003*\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\bH\u0002J\f\u0010\r\u001a\u00020\f*\u00020\bH\u0002J\f\u0010\u000f\u001a\u00020\f*\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003*\u00020\u0002H\u0002J\u0012\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003*\u00020\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#¨\u0006'"}, d2 = {"Ljd6;", "Lid6;", "Lru/dodopizza/backend/domain/menu/dto/MenuDto;", "", "Lkl8;", "g", "Ldd6;", e.a, "Lru/dodopizza/backend/domain/menu/dto/MenuCategoryDto;", "", "Lx0b;", "i", "Ly33;", c.a, "Lru/dodopizza/backend/domain/menu/dto/SubCategoryDto;", DateTokenConverter.CONVERTER_KEY, "", "displayType", "b", "f", "Lru/dodopizza/app/domain/menu/promo/PromoActionItem;", Image.TYPE_HIGH, "menuDto", "Lbd6;", "a", "Lrg6;", "Lrg6;", "menuProductsConverterFactory", "Lud6;", "Lud6;", "menuItemConverterFactory", "Lhq3;", "Lhq3;", "featureService", "Lru/dodopizza/app/domain/menu/promo/PromoActionsService;", "Lru/dodopizza/app/domain/menu/promo/PromoActionsService;", "promoActionsService", "<init>", "(Lrg6;Lud6;Lhq3;Lru/dodopizza/app/domain/menu/promo/PromoActionsService;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jd6  reason: default package */
/* loaded from: classes4.dex */
public final class jd6 implements id6 {
    private final rg6 a;
    private final ud6 b;
    private final hq3 c;
    private final PromoActionsService d;

    public jd6(rg6 rg6Var, ud6 ud6Var, hq3 hq3Var, PromoActionsService promoActionsService) {
        z65.h(rg6Var, "menuProductsConverterFactory");
        z65.h(ud6Var, "menuItemConverterFactory");
        z65.h(hq3Var, "featureService");
        z65.h(promoActionsService, "promoActionsService");
        this.a = rg6Var;
        this.b = ud6Var;
        this.c = hq3Var;
        this.d = promoActionsService;
    }

    private final y33 b(String str) {
        if (this.c.a(bq3.v5)) {
            if (str == null || z65.c(str, "regular")) {
                return y33.a;
            }
            if (z65.c(str, "loyalty")) {
                return y33.b;
            }
            throw new IllegalArgumentException("Unknown menu display type \"" + str + "\"");
        }
        return y33.a;
    }

    private final y33 c(MenuCategoryDto menuCategoryDto) {
        return b(menuCategoryDto.getDisplayType());
    }

    private final y33 d(SubCategoryDto subCategoryDto) {
        return b(subCategoryDto.getDisplayType());
    }

    private final Collection<dd6> e(MenuDto menuDto) {
        int w;
        List<MenuCategoryDto> menuCategories = menuDto.getMenuCategories();
        w = lc1.w(menuCategories, 10);
        ArrayList arrayList = new ArrayList(w);
        for (MenuCategoryDto menuCategoryDto : menuCategories) {
            arrayList.add(new dd6(menuCategoryDto.getId(), menuCategoryDto.getName(), menuCategoryDto.getPosition(), menuCategoryDto.getAnalyticsName(), c(menuCategoryDto), menuCategoryDto.getShowHeroProduct(), i(menuCategoryDto)));
        }
        return arrayList;
    }

    private final Collection<String> f(MenuDto menuDto) {
        int w;
        List<PopularProductDto> popularProducts = menuDto.getPopularProducts();
        w = lc1.w(popularProducts, 10);
        ArrayList arrayList = new ArrayList(w);
        for (PopularProductDto popularProductDto : popularProducts) {
            arrayList.add(popularProductDto.getMenuItemId());
        }
        return arrayList;
    }

    private final Collection<kl8> g(MenuDto menuDto) {
        int w;
        List<Integer> prioritizedCategories = menuDto.getPrioritizedCategories();
        w = lc1.w(prioritizedCategories, 10);
        ArrayList arrayList = new ArrayList(w);
        for (Number number : prioritizedCategories) {
            arrayList.add(kl8.a.a.b(String.valueOf(number.intValue())));
        }
        return arrayList;
    }

    private final Collection<PromoActionItem> h(MenuDto menuDto) {
        int w;
        List<PromoActionItemDto> promoActions = menuDto.getPromoActions();
        if (promoActions == null) {
            promoActions = kc1.l();
        }
        List<PromoActionItemDto> list = promoActions;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (PromoActionItemDto promoActionItemDto : list) {
            arrayList.add(new PromoActionItem(promoActionItemDto.getApplyToProducts(), promoActionItemDto.getCode(), promoActionItemDto.getId(), promoActionItemDto.getKind(), promoActionItemDto.getParams()));
        }
        return arrayList;
    }

    private final List<x0b> i(MenuCategoryDto menuCategoryDto) {
        List<x0b> l;
        int w;
        List<SubCategoryDto> subCategories = menuCategoryDto.getSubCategories();
        if (subCategories == null) {
            l = kc1.l();
            return l;
        }
        List<SubCategoryDto> list = subCategories;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (SubCategoryDto subCategoryDto : list) {
            arrayList.add(new x0b(subCategoryDto.getId(), subCategoryDto.getName(), subCategoryDto.getPosition(), subCategoryDto.getAnalyticsName(), d(subCategoryDto), subCategoryDto.getShowHeroProduct()));
        }
        return arrayList;
    }

    @Override // defpackage.id6
    public bd6 a(MenuDto menuDto) {
        List q0;
        z65.h(menuDto, "menuDto");
        Collection<fl8> a = this.a.a(menuDto.getProductSchemes()).a(menuDto.getProducts());
        td6 a2 = this.b.a(a, this.d.getAvailablePromoActions(h(menuDto)));
        ArrayList arrayList = new ArrayList();
        for (MenuItemDto menuItemDto : menuDto.getItems()) {
            qd6 b = a2.b(menuItemDto);
            if (b != null) {
                arrayList.add(b);
            }
        }
        List<MenuItemDto> assistantItems = menuDto.getAssistantItems();
        if (assistantItems == null) {
            assistantItems = kc1.l();
        }
        ArrayList arrayList2 = new ArrayList();
        for (MenuItemDto menuItemDto2 : assistantItems) {
            qd6 a3 = a2.a(menuItemDto2);
            if (a3 != null) {
                arrayList2.add(a3);
            }
        }
        q0 = sc1.q0(arrayList, arrayList2);
        return new bd6(q0, a, g(menuDto), f(menuDto), e(menuDto), h(menuDto));
    }
}
