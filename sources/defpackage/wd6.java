package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.kl8;
import defpackage.km8;
import defpackage.qd6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.app.domain.menu.promo.ProductPromoAction;
import ru.dodopizza.app.domain.menu.promo.PromoActionItem;
import ru.dodopizza.backend.domain.menu.dto.CustomShoppingItemDto;
import ru.dodopizza.backend.domain.menu.dto.MenuItemDto;
import ru.dodopizza.backend.domain.menu.dto.MenuItemTypeDto;
import ru.dodopizza.backend.domain.menu.dto.PizzaSizeDto;
import ru.dodopizza.backend.domain.menu.dto.ProductImageDto;
import ru.dodopizza.backend.domain.menu.dto.ShoppingItemDto;
/* compiled from: MenuItemConverter.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\b\u0007\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0015\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00020&0\u0015\u0012\u0006\u0010.\u001a\u00020\r¢\u0006\u0004\b6\u00107J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\f\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\"\u0010\u0013\u001a\u00020\u0012*\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u0018\u001a\u00020\u0017*\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0002J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0010H\u0002J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0010H\u0002J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010H\u0002J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001cH\u0002J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00152\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0010H\u0002J$\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00150'*\b\u0012\u0004\u0012\u00020&0\u0015H\u0002J \u0010*\u001a\b\u0012\u0004\u0012\u00020$0\u0010*\b\u0012\u0004\u0012\u00020&0\u00152\u0006\u0010)\u001a\u00020\"H\u0002J\u0012\u0010+\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010,\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010.\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00100R&\u00102\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00150'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00101¨\u00068"}, d2 = {"Lwd6;", "Ltd6;", "Lru/dodopizza/backend/domain/menu/dto/MenuItemDto;", "menuItemDto", "Lqd6;", "k", "Lqja;", "shoppingInfo", "Lqd6$e;", "q", "i", "Lqd6$c;", "n", "", "isPizza", "l", "", "shoppingItems", "Lqd6$f;", "r", "j", "", "customShoppingItems", "Lqd6$d;", "o", "Lru/dodopizza/backend/domain/menu/dto/CustomShoppingItemDto;", "customShoppingItemDto", "f", "Lru/dodopizza/backend/domain/menu/dto/ShoppingItemDto;", "g", DateTokenConverter.CONVERTER_KEY, c.a, "shoppingItemDto", Image.TYPE_MEDIUM, "", "productIds", "Lru/dodopizza/app/domain/menu/promo/ProductPromoAction;", Image.TYPE_HIGH, "Lru/dodopizza/app/domain/menu/promo/PromoActionItem;", "", e.a, ShoppingInfoEntity.FIELD_PRODUCT_ID, "p", "b", "a", "Z", "isTransparentImageUrlEnabled", "", "Ljava/util/Set;", "Ljava/util/Map;", "productIdToProductActionItemMap", "Lfl8;", "products", "availablePromoActionItems", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wd6  reason: default package */
/* loaded from: classes4.dex */
public final class wd6 implements td6 {
    private final boolean a;
    private final Set<String> b;
    private final Map<String, Collection<PromoActionItem>> c;

    /* compiled from: MenuItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wd6$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuItemTypeDto.values().length];
            try {
                iArr[MenuItemTypeDto.SIMPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MenuItemTypeDto.PIZZA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MenuItemTypeDto.VARIABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MenuItemTypeDto.HALVES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MenuItemTypeDto.COMBO_TEMPLATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wd6(Collection<? extends fl8> collection, Collection<PromoActionItem> collection2, boolean z) {
        int w;
        Set<String> K0;
        z65.h(collection, "products");
        z65.h(collection2, "availablePromoActionItems");
        this.a = z;
        Collection<? extends fl8> collection3 = collection;
        w = lc1.w(collection3, 10);
        ArrayList arrayList = new ArrayList(w);
        for (fl8 fl8Var : collection3) {
            arrayList.add(fl8Var.getId());
        }
        K0 = sc1.K0(arrayList);
        this.b = K0;
        this.c = e(collection2);
    }

    private final List<qja> c(List<CustomShoppingItemDto> list) {
        qja qjaVar;
        ArrayList arrayList = new ArrayList();
        for (CustomShoppingItemDto customShoppingItemDto : list) {
            boolean contains = this.b.contains(customShoppingItemDto.getProductId());
            if (contains) {
                qjaVar = f(customShoppingItemDto);
            } else if (!contains) {
                qjaVar = null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (qjaVar != null) {
                arrayList.add(qjaVar);
            }
        }
        return arrayList;
    }

    private final List<qja> d(List<ShoppingItemDto> list) {
        qja qjaVar;
        ArrayList arrayList = new ArrayList();
        for (ShoppingItemDto shoppingItemDto : list) {
            boolean contains = this.b.contains(shoppingItemDto.getProductId());
            if (contains) {
                qjaVar = m(shoppingItemDto);
            } else if (!contains) {
                qjaVar = null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (qjaVar != null) {
                arrayList.add(qjaVar);
            }
        }
        return arrayList;
    }

    private final Map<String, Collection<PromoActionItem>> e(Collection<PromoActionItem> collection) {
        HashMap hashMap = new HashMap();
        for (PromoActionItem promoActionItem : collection) {
            for (String str : promoActionItem.getApplyToProducts()) {
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = kc1.h(promoActionItem);
                } else {
                    arrayList.add(promoActionItem);
                }
                hashMap.put(str, arrayList);
            }
        }
        return hashMap;
    }

    private final qja f(CustomShoppingItemDto customShoppingItemDto) {
        return new rja(customShoppingItemDto.getId(), kn6.c.b(customShoppingItemDto.getPrice()), customShoppingItemDto.getProductId(), null, false, customShoppingItemDto.getShoppingId());
    }

    private final qja g(List<ShoppingItemDto> list) {
        Object b0;
        b0 = sc1.b0(list);
        ShoppingItemDto shoppingItemDto = (ShoppingItemDto) b0;
        if (shoppingItemDto == null) {
            return null;
        }
        boolean contains = this.b.contains(shoppingItemDto.getProductId());
        if (contains) {
            return m(shoppingItemDto);
        }
        if (!contains) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Collection<ProductPromoAction> h(List<String> list) {
        List<ProductPromoAction> list2;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Collection<PromoActionItem> collection = this.c.get(str);
            if (collection != null) {
                list2 = p(collection, str);
            } else {
                list2 = null;
            }
            if (list2 == null) {
                list2 = kc1.l();
            }
            pc1.C(arrayList, list2);
        }
        return arrayList;
    }

    private final qd6 i(MenuItemDto menuItemDto) {
        qja g = g(menuItemDto.getShoppingItems());
        if (g != null) {
            return n(menuItemDto, g);
        }
        return null;
    }

    private final qd6 j(MenuItemDto menuItemDto) {
        List<qja> d = d(menuItemDto.getShoppingItems());
        List<qja> c = c(menuItemDto.getCustomShoppingItems());
        if (!d.isEmpty()) {
            List<qja> list = c;
            if (!list.isEmpty()) {
                return o(menuItemDto, d, list);
            }
        }
        return null;
    }

    private final qd6 k(MenuItemDto menuItemDto) {
        qja g = g(menuItemDto.getShoppingItems());
        if (g != null) {
            return q(menuItemDto, g);
        }
        return null;
    }

    private final qd6 l(MenuItemDto menuItemDto, boolean z) {
        List<qja> d = d(menuItemDto.getShoppingItems());
        if (!(!d.isEmpty())) {
            d = null;
        }
        if (d == null) {
            return null;
        }
        return r(menuItemDto, d, z);
    }

    private final qja m(ShoppingItemDto shoppingItemDto) {
        return new rja(shoppingItemDto.getId(), kn6.c.b(shoppingItemDto.getPrice()), shoppingItemDto.getProductId(), null, false, shoppingItemDto.getId());
    }

    private final qd6.c n(MenuItemDto menuItemDto, qja qjaVar) {
        String str;
        String str2;
        List<String> e;
        String value;
        String a2;
        String id = menuItemDto.getId();
        String forwardCompatibilityId = menuItemDto.getForwardCompatibilityId();
        String str3 = "";
        if (forwardCompatibilityId == null) {
            str = "";
        } else {
            str = forwardCompatibilityId;
        }
        String name = menuItemDto.getName();
        kl8 a3 = kl8.a.a.a(menuItemDto.getCategory());
        String description = menuItemDto.getDescription();
        String description2 = menuItemDto.getDescription();
        ProductImageDto image = menuItemDto.getImage();
        if (image == null || (a2 = ug6.a(image, this.a)) == null) {
            str2 = "";
        } else {
            str2 = a2;
        }
        int priority = menuItemDto.getPriority();
        PizzaSizeDto size = menuItemDto.getSize();
        String str4 = (size == null || (str4 = size.getMeasure()) == null) ? "" : "";
        km8.a aVar = km8.c;
        PizzaSizeDto size2 = menuItemDto.getSize();
        if (size2 != null && (value = size2.getValue()) != null) {
            str3 = value;
        }
        km8 km8Var = new km8(str4, aVar.a(str3));
        String menuCategoryId = menuItemDto.getMenuCategoryId();
        List<String> subMenuCategoryIds = menuItemDto.getSubMenuCategoryIds();
        if (subMenuCategoryIds == null) {
            subMenuCategoryIds = kc1.l();
        }
        List<String> list = subMenuCategoryIds;
        e = jc1.e(qjaVar.t());
        return new qd6.c(id, str, name, a3, description, description2, str2, priority, qjaVar, km8Var, menuCategoryId, list, h(e));
    }

    private final qd6.d o(MenuItemDto menuItemDto, List<? extends qja> list, Collection<? extends qja> collection) {
        String str;
        String str2;
        int w;
        String a2;
        String id = menuItemDto.getId();
        String forwardCompatibilityId = menuItemDto.getForwardCompatibilityId();
        if (forwardCompatibilityId == null) {
            str = "";
        } else {
            str = forwardCompatibilityId;
        }
        String name = menuItemDto.getName();
        kl8 a3 = kl8.a.a.a(menuItemDto.getCategory());
        String description = menuItemDto.getDescription();
        String description2 = menuItemDto.getDescription();
        int priority = menuItemDto.getPriority();
        ProductImageDto image = menuItemDto.getImage();
        if (image == null || (a2 = ug6.a(image, this.a)) == null) {
            str2 = "";
        } else {
            str2 = a2;
        }
        List<? extends qja> list2 = list;
        String menuCategoryId = menuItemDto.getMenuCategoryId();
        List<String> subMenuCategoryIds = menuItemDto.getSubMenuCategoryIds();
        if (subMenuCategoryIds == null) {
            subMenuCategoryIds = kc1.l();
        }
        List<String> list3 = subMenuCategoryIds;
        List<? extends qja> list4 = list;
        w = lc1.w(list4, 10);
        ArrayList arrayList = new ArrayList(w);
        for (qja qjaVar : list4) {
            arrayList.add(qjaVar.t());
        }
        return new qd6.d(id, str, name, a3, description, description2, priority, str2, list2, collection, menuCategoryId, list3, h(arrayList));
    }

    private final List<ProductPromoAction> p(Collection<PromoActionItem> collection, String str) {
        int w;
        String str2;
        Collection<PromoActionItem> collection2 = collection;
        w = lc1.w(collection2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (PromoActionItem promoActionItem : collection2) {
            String code = promoActionItem.getCode();
            int kind = promoActionItem.getKind();
            Object params = promoActionItem.getParams();
            if (params != null) {
                str2 = params.toString();
            } else {
                str2 = null;
            }
            arrayList.add(new ProductPromoAction(str, code, kind, (String) mh5.c(str2, "")));
        }
        return arrayList;
    }

    private final qd6.e q(MenuItemDto menuItemDto, qja qjaVar) {
        String str;
        String str2;
        List<String> e;
        String value;
        String a2;
        String id = menuItemDto.getId();
        String forwardCompatibilityId = menuItemDto.getForwardCompatibilityId();
        String str3 = "";
        if (forwardCompatibilityId == null) {
            str = "";
        } else {
            str = forwardCompatibilityId;
        }
        String name = menuItemDto.getName();
        kl8 a3 = kl8.a.a.a(menuItemDto.getCategory());
        String description = menuItemDto.getDescription();
        String description2 = menuItemDto.getDescription();
        ProductImageDto image = menuItemDto.getImage();
        if (image == null || (a2 = ug6.a(image, this.a)) == null) {
            str2 = "";
        } else {
            str2 = a2;
        }
        int priority = menuItemDto.getPriority();
        PizzaSizeDto size = menuItemDto.getSize();
        String str4 = (size == null || (str4 = size.getMeasure()) == null) ? "" : "";
        km8.a aVar = km8.c;
        PizzaSizeDto size2 = menuItemDto.getSize();
        if (size2 != null && (value = size2.getValue()) != null) {
            str3 = value;
        }
        km8 km8Var = new km8(str4, aVar.a(str3));
        String menuCategoryId = menuItemDto.getMenuCategoryId();
        List<String> subMenuCategoryIds = menuItemDto.getSubMenuCategoryIds();
        if (subMenuCategoryIds == null) {
            subMenuCategoryIds = kc1.l();
        }
        List<String> list = subMenuCategoryIds;
        e = jc1.e(qjaVar.t());
        return new qd6.e(id, str, name, a3, description, description2, str2, priority, qjaVar, km8Var, menuCategoryId, list, h(e), null, false, 16384, null);
    }

    private final qd6.f r(MenuItemDto menuItemDto, List<? extends qja> list, boolean z) {
        String str;
        String str2;
        int w;
        String a2;
        String id = menuItemDto.getId();
        String forwardCompatibilityId = menuItemDto.getForwardCompatibilityId();
        if (forwardCompatibilityId == null) {
            str = "";
        } else {
            str = forwardCompatibilityId;
        }
        String name = menuItemDto.getName();
        kl8 a3 = kl8.a.a.a(menuItemDto.getCategory());
        String description = menuItemDto.getDescription();
        String description2 = menuItemDto.getDescription();
        ProductImageDto image = menuItemDto.getImage();
        if (image == null || (a2 = ug6.a(image, this.a)) == null) {
            str2 = "";
        } else {
            str2 = a2;
        }
        int priority = menuItemDto.getPriority();
        String menuCategoryId = menuItemDto.getMenuCategoryId();
        List<String> subMenuCategoryIds = menuItemDto.getSubMenuCategoryIds();
        if (subMenuCategoryIds == null) {
            subMenuCategoryIds = kc1.l();
        }
        List<String> list2 = subMenuCategoryIds;
        List<? extends qja> list3 = list;
        w = lc1.w(list3, 10);
        ArrayList arrayList = new ArrayList(w);
        for (qja qjaVar : list3) {
            arrayList.add(qjaVar.t());
        }
        return new qd6.f(id, str, name, a3, description, description2, str2, priority, list, menuCategoryId, list2, z, h(arrayList), null, false, 16384, null);
    }

    @Override // defpackage.td6
    public qd6 a(MenuItemDto menuItemDto) {
        String str;
        String str2;
        int w;
        String url;
        z65.h(menuItemDto, "menuItemDto");
        qja g = g(menuItemDto.getShoppingItems());
        if (g == null) {
            return null;
        }
        String id = menuItemDto.getId();
        String forwardCompatibilityId = menuItemDto.getForwardCompatibilityId();
        if (forwardCompatibilityId == null) {
            str = "";
        } else {
            str = forwardCompatibilityId;
        }
        String name = menuItemDto.getName();
        kl8 a2 = kl8.a.a.a(menuItemDto.getCategory());
        String description = menuItemDto.getDescription();
        String description2 = menuItemDto.getDescription();
        int priority = menuItemDto.getPriority();
        ProductImageDto image = menuItemDto.getImage();
        if (image == null || (url = image.getUrl()) == null) {
            str2 = "";
        } else {
            str2 = url;
        }
        String menuCategoryId = menuItemDto.getMenuCategoryId();
        List<String> subMenuCategoryIds = menuItemDto.getSubMenuCategoryIds();
        if (subMenuCategoryIds == null) {
            subMenuCategoryIds = kc1.l();
        }
        List<String> list = subMenuCategoryIds;
        List<ShoppingItemDto> shoppingItems = menuItemDto.getShoppingItems();
        w = lc1.w(shoppingItems, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ShoppingItemDto shoppingItemDto : shoppingItems) {
            arrayList.add(shoppingItemDto.getProductId());
        }
        return new qd6.b(id, str, name, a2, description, description2, priority, str2, g, menuCategoryId, list, h(arrayList));
    }

    @Override // defpackage.td6
    public qd6 b(MenuItemDto menuItemDto) {
        z65.h(menuItemDto, "menuItemDto");
        int i = a.$EnumSwitchMapping$0[menuItemDto.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return i(menuItemDto);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return j(menuItemDto);
                }
                return l(menuItemDto, false);
            }
            return l(menuItemDto, true);
        }
        return k(menuItemDto);
    }
}
