package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dtov5.AdditionalDataDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.AllergyAdviceDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.ComboTemplateSlotDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.ComboTemplateSlotProductDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.FoodValueDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.ImageDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.IngredientDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.IngredientGroupDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.MenuDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.MenuItemDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.PackageDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.PackageGroupDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.ProductDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.QuantityVariationDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.SaleTimeDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.SectionDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.SectionItemDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.SubsectionDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.TraitDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.VariationDtoV5;
import ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper;
/* compiled from: MenuConverterV5.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b<\u0010=J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002J\f\u0010\n\u001a\u00020\t*\u00020\bH\u0002J\f\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002J\f\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002J\f\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002J\f\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002J\f\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002J\f\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002J\f\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002J\f\u0010\"\u001a\u00020!*\u00020 H\u0002J\f\u0010%\u001a\u00020$*\u00020#H\u0002J\f\u0010(\u001a\u00020'*\u00020&H\u0002J\f\u0010+\u001a\u00020**\u00020)H\u0002J\f\u0010.\u001a\u00020-*\u00020,H\u0002J\f\u00101\u001a\u000200*\u00020/H\u0002J\f\u00104\u001a\u000203*\u000202H\u0002J\f\u00107\u001a\u000206*\u000205H\u0002J\u000e\u0010;\u001a\u00020:2\u0006\u00109\u001a\u000208¨\u0006>"}, d2 = {"Lkd6;", "", "Lru/dodopizza/backend/domain/menu/dtov5/SectionItemDtoV5;", "Ly2a;", "p", "Lru/dodopizza/backend/domain/menu/dtov5/SubsectionDtoV5;", "Lo1b;", "q", "Lru/dodopizza/backend/domain/menu/dtov5/MenuItemDtoV5;", "Lte6;", "j", "Lru/dodopizza/backend/domain/menu/dtov5/SaleTimeDtoV5;", "Lbt9;", "o", "Lru/dodopizza/backend/domain/menu/dtov5/ComboTemplateSlotDtoV5;", "Lfj1;", e.a, "Lru/dodopizza/backend/domain/menu/dtov5/ComboTemplateSlotProductDtoV5;", "Lej1;", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/backend/domain/menu/dtov5/ImageDtoV5;", "Lwv4;", "g", "Lru/dodopizza/backend/domain/menu/dtov5/VariationDtoV5;", "Ldxb;", Image.TYPE_SMALL, "Lru/dodopizza/backend/domain/menu/dtov5/ProductDtoV5;", "Ltm8;", Image.TYPE_MEDIUM, "Lru/dodopizza/backend/domain/menu/dtov5/FoodValueDtoV5;", "Lu44;", "f", "Lru/dodopizza/backend/domain/menu/dtov5/IngredientGroupDtoV5;", "Ln25;", Image.TYPE_HIGH, "Lru/dodopizza/backend/domain/menu/dtov5/IngredientDtoV5;", "Lo25;", "i", "Lru/dodopizza/backend/domain/menu/dtov5/QuantityVariationDtoV5;", "Ltu8;", "n", "Lru/dodopizza/backend/domain/menu/dtov5/PackageGroupDtoV5;", "Lno7;", "k", "Lru/dodopizza/backend/domain/menu/dtov5/PackageDtoV5;", "Lyo7;", "l", "Lru/dodopizza/backend/domain/menu/dtov5/TraitDtoV5;", "Ldkb;", "r", "Lru/dodopizza/backend/domain/menu/dtov5/AllergyAdviceDtoV5;", "Lac;", c.a, "Lru/dodopizza/backend/domain/menu/dtov5/AdditionalDataDtoV5;", "Lv6;", "b", "Lru/dodopizza/backend/domain/menu/dtov5/MenuDtoV5;", "menuDtoV5", "Lkh6;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: kd6  reason: default package */
/* loaded from: classes4.dex */
public final class kd6 {
    private final v6 b(AdditionalDataDtoV5 additionalDataDtoV5) {
        return new v6(additionalDataDtoV5.getKey(), additionalDataDtoV5.getValue());
    }

    private final ac c(AllergyAdviceDtoV5 allergyAdviceDtoV5) {
        return new ac(allergyAdviceDtoV5.getContains(), allergyAdviceDtoV5.getMayContain());
    }

    private final ej1 d(ComboTemplateSlotProductDtoV5 comboTemplateSlotProductDtoV5) {
        return new ej1(m(comboTemplateSlotProductDtoV5.getProduct().getValue()), kn6.c.b(comboTemplateSlotProductDtoV5.getExtraPrice()), comboTemplateSlotProductDtoV5.getIndex());
    }

    private final fj1 e(ComboTemplateSlotDtoV5 comboTemplateSlotDtoV5) {
        int w;
        String id = comboTemplateSlotDtoV5.getId();
        String name = comboTemplateSlotDtoV5.getName();
        String defaultProductId = comboTemplateSlotDtoV5.getDefaultProductId();
        List<ReferenceWrapper<ComboTemplateSlotProductDtoV5>> products = comboTemplateSlotDtoV5.getProducts();
        w = lc1.w(products, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(d((ComboTemplateSlotProductDtoV5) ((ReferenceWrapper) it.next()).getValue()));
        }
        return new fj1(id, name, defaultProductId, arrayList, comboTemplateSlotDtoV5.getIndex());
    }

    private final u44 f(FoodValueDtoV5 foodValueDtoV5) {
        return new u44(foodValueDtoV5.getProteins(), foodValueDtoV5.getFats(), foodValueDtoV5.getCarbohydrates(), foodValueDtoV5.getCalories(), foodValueDtoV5.getWeight());
    }

    private final wv4 g(ImageDtoV5 imageDtoV5) {
        return new wv4(imageDtoV5.getUrlPattern(), imageDtoV5.getImageMeta());
    }

    private final n25 h(IngredientGroupDtoV5 ingredientGroupDtoV5) {
        int w;
        int w2;
        String code = ingredientGroupDtoV5.getCode();
        boolean isBasis = ingredientGroupDtoV5.isBasis();
        String name = ingredientGroupDtoV5.getName();
        d71 valueOf = d71.valueOf(ingredientGroupDtoV5.getChoiceType());
        int totalQuantityMin = ingredientGroupDtoV5.getTotalQuantityMin();
        int totalQuantityMax = ingredientGroupDtoV5.getTotalQuantityMax();
        List<ReferenceWrapper<IngredientDtoV5>> ingredients = ingredientGroupDtoV5.getIngredients();
        w = lc1.w(ingredients, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = ingredients.iterator();
        while (it.hasNext()) {
            arrayList.add(i((IngredientDtoV5) ((ReferenceWrapper) it.next()).getValue()));
        }
        int index = ingredientGroupDtoV5.getIndex();
        List<AdditionalDataDtoV5> additionalData = ingredientGroupDtoV5.getAdditionalData();
        w2 = lc1.w(additionalData, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (AdditionalDataDtoV5 additionalDataDtoV5 : additionalData) {
            arrayList2.add(b(additionalDataDtoV5));
        }
        return new n25(code, isBasis, name, valueOf, totalQuantityMin, totalQuantityMax, arrayList, index, arrayList2);
    }

    private final o25 i(IngredientDtoV5 ingredientDtoV5) {
        int w;
        String materialTypeId = ingredientDtoV5.getMaterialTypeId();
        String name = ingredientDtoV5.getName();
        int quantity = ingredientDtoV5.getQuantity();
        List<ReferenceWrapper<QuantityVariationDtoV5>> quantityVariations = ingredientDtoV5.getQuantityVariations();
        w = lc1.w(quantityVariations, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = quantityVariations.iterator();
        while (it.hasNext()) {
            arrayList.add(n((QuantityVariationDtoV5) ((ReferenceWrapper) it.next()).getValue()));
        }
        return new o25(materialTypeId, name, quantity, arrayList, ingredientDtoV5.getIndex(), ingredientDtoV5.getImageLink());
    }

    private final te6 j(MenuItemDtoV5 menuItemDtoV5) {
        int w;
        hn6 hn6Var;
        int w2;
        int w3;
        int w4;
        SaleTimeDtoV5 value;
        String id = menuItemDtoV5.getId();
        String name = menuItemDtoV5.getName();
        String description = menuItemDtoV5.getDescription();
        List<ReferenceWrapper<ImageDtoV5>> images = menuItemDtoV5.getImages();
        w = lc1.w(images, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = images.iterator();
        while (it.hasNext()) {
            arrayList.add(g((ImageDtoV5) ((ReferenceWrapper) it.next()).getValue()));
        }
        Integer maxCountPerOrder = menuItemDtoV5.getMaxCountPerOrder();
        se6 valueOf = se6.valueOf(menuItemDtoV5.getType());
        Double price = menuItemDtoV5.getPrice();
        bt9 bt9Var = null;
        if (price != null) {
            hn6Var = kn6.c.b(price.doubleValue());
        } else {
            hn6Var = null;
        }
        ReferenceWrapper<SaleTimeDtoV5> saleTime = menuItemDtoV5.getSaleTime();
        if (saleTime != null && (value = saleTime.getValue()) != null) {
            bt9Var = o(value);
        }
        List<ReferenceWrapper<ComboTemplateSlotDtoV5>> slots = menuItemDtoV5.getSlots();
        w2 = lc1.w(slots, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        Iterator<T> it2 = slots.iterator();
        while (it2.hasNext()) {
            arrayList2.add(e((ComboTemplateSlotDtoV5) ((ReferenceWrapper) it2.next()).getValue()));
        }
        List<ReferenceWrapper<VariationDtoV5>> variations = menuItemDtoV5.getVariations();
        w3 = lc1.w(variations, 10);
        ArrayList arrayList3 = new ArrayList(w3);
        Iterator<T> it3 = variations.iterator();
        while (it3.hasNext()) {
            arrayList3.add(s((VariationDtoV5) ((ReferenceWrapper) it3.next()).getValue()));
        }
        List<AdditionalDataDtoV5> additionalData = menuItemDtoV5.getAdditionalData();
        w4 = lc1.w(additionalData, 10);
        ArrayList arrayList4 = new ArrayList(w4);
        for (AdditionalDataDtoV5 additionalDataDtoV5 : additionalData) {
            arrayList4.add(b(additionalDataDtoV5));
        }
        return new te6(id, name, description, arrayList, maxCountPerOrder, valueOf, hn6Var, bt9Var, arrayList2, arrayList3, arrayList4, null, 2048, null);
    }

    private final no7 k(PackageGroupDtoV5 packageGroupDtoV5) {
        int w;
        int w2;
        String code = packageGroupDtoV5.getCode();
        String name = packageGroupDtoV5.getName();
        d71 valueOf = d71.valueOf(packageGroupDtoV5.getChoiceType());
        int totalQuantityMin = packageGroupDtoV5.getTotalQuantityMin();
        int totalQuantityMax = packageGroupDtoV5.getTotalQuantityMax();
        List<ReferenceWrapper<PackageDtoV5>> packageOptions = packageGroupDtoV5.getPackageOptions();
        w = lc1.w(packageOptions, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = packageOptions.iterator();
        while (it.hasNext()) {
            arrayList.add(l((PackageDtoV5) ((ReferenceWrapper) it.next()).getValue()));
        }
        int index = packageGroupDtoV5.getIndex();
        List<AdditionalDataDtoV5> additionalData = packageGroupDtoV5.getAdditionalData();
        w2 = lc1.w(additionalData, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (AdditionalDataDtoV5 additionalDataDtoV5 : additionalData) {
            arrayList2.add(b(additionalDataDtoV5));
        }
        return new no7(code, name, valueOf, totalQuantityMin, totalQuantityMax, arrayList, index, arrayList2);
    }

    private final yo7 l(PackageDtoV5 packageDtoV5) {
        int w;
        String materialTypeId = packageDtoV5.getMaterialTypeId();
        String name = packageDtoV5.getName();
        int quantity = packageDtoV5.getQuantity();
        List<ReferenceWrapper<QuantityVariationDtoV5>> quantityVariations = packageDtoV5.getQuantityVariations();
        w = lc1.w(quantityVariations, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = quantityVariations.iterator();
        while (it.hasNext()) {
            arrayList.add(n((QuantityVariationDtoV5) ((ReferenceWrapper) it.next()).getValue()));
        }
        return new yo7(materialTypeId, name, quantity, arrayList, packageDtoV5.getIndex(), packageDtoV5.getImageLink());
    }

    private final tm8 m(ProductDtoV5 productDtoV5) {
        int w;
        int w2;
        int w3;
        int w4;
        String id = productDtoV5.getId();
        String metaProductId = productDtoV5.getMetaProductId();
        String name = productDtoV5.getName();
        String size = productDtoV5.getSize();
        String sizeName = productDtoV5.getSizeName();
        hn6 b = kn6.c.b(productDtoV5.getPrice());
        u44 f = f(productDtoV5.getFoodValue().getValue());
        List<ReferenceWrapper<IngredientGroupDtoV5>> ingredientGroups = productDtoV5.getIngredientGroups();
        w = lc1.w(ingredientGroups, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = ingredientGroups.iterator();
        while (it.hasNext()) {
            arrayList.add(h((IngredientGroupDtoV5) ((ReferenceWrapper) it.next()).getValue()));
        }
        List<ReferenceWrapper<PackageGroupDtoV5>> packageGroups = productDtoV5.getPackageGroups();
        w2 = lc1.w(packageGroups, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        Iterator<T> it2 = packageGroups.iterator();
        while (it2.hasNext()) {
            arrayList2.add(k((PackageGroupDtoV5) ((ReferenceWrapper) it2.next()).getValue()));
        }
        List<ReferenceWrapper<ImageDtoV5>> images = productDtoV5.getImages();
        w3 = lc1.w(images, 10);
        ArrayList arrayList3 = new ArrayList(w3);
        Iterator<T> it3 = images.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((ImageDtoV5) ((ReferenceWrapper) it3.next()).getValue()));
        }
        String description = productDtoV5.getDescription();
        dkb r = r(productDtoV5.getTraits().getValue());
        ac c = c(productDtoV5.getAllergyAdvice().getValue());
        List<AdditionalDataDtoV5> additionalData = productDtoV5.getAdditionalData();
        w4 = lc1.w(additionalData, 10);
        ArrayList arrayList4 = new ArrayList(w4);
        for (AdditionalDataDtoV5 additionalDataDtoV5 : additionalData) {
            arrayList4.add(b(additionalDataDtoV5));
        }
        return new tm8(id, metaProductId, name, size, sizeName, b, f, arrayList, arrayList2, arrayList3, description, r, c, arrayList4);
    }

    private final tu8 n(QuantityVariationDtoV5 quantityVariationDtoV5) {
        return new tu8(quantityVariationDtoV5.getName(), quantityVariationDtoV5.getQuantity(), kn6.c.b(quantityVariationDtoV5.getPrice()));
    }

    private final bt9 o(SaleTimeDtoV5 saleTimeDtoV5) {
        return new bt9(saleTimeDtoV5.getStart(), saleTimeDtoV5.getEnd());
    }

    private final y2a p(SectionItemDtoV5 sectionItemDtoV5) {
        te6 te6Var;
        o1b o1bVar;
        int w;
        SubsectionDtoV5 value;
        MenuItemDtoV5 value2;
        x2a valueOf = x2a.valueOf(sectionItemDtoV5.getType());
        ReferenceWrapper<MenuItemDtoV5> menuItem = sectionItemDtoV5.getMenuItem();
        if (menuItem != null && (value2 = menuItem.getValue()) != null) {
            te6Var = j(value2);
        } else {
            te6Var = null;
        }
        ReferenceWrapper<SubsectionDtoV5> subSection = sectionItemDtoV5.getSubSection();
        if (subSection != null && (value = subSection.getValue()) != null) {
            o1bVar = q(value);
        } else {
            o1bVar = null;
        }
        int index = sectionItemDtoV5.getIndex();
        List<AdditionalDataDtoV5> additionalData = sectionItemDtoV5.getAdditionalData();
        w = lc1.w(additionalData, 10);
        ArrayList arrayList = new ArrayList(w);
        for (AdditionalDataDtoV5 additionalDataDtoV5 : additionalData) {
            arrayList.add(b(additionalDataDtoV5));
        }
        return new y2a(valueOf, te6Var, o1bVar, index, arrayList);
    }

    private final o1b q(SubsectionDtoV5 subsectionDtoV5) {
        int w;
        int w2;
        String code = subsectionDtoV5.getCode();
        String title = subsectionDtoV5.getTitle();
        List<ReferenceWrapper<SectionItemDtoV5>> items = subsectionDtoV5.getItems();
        w = lc1.w(items, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(p((SectionItemDtoV5) ((ReferenceWrapper) it.next()).getValue()));
        }
        List<AdditionalDataDtoV5> additionalData = subsectionDtoV5.getAdditionalData();
        w2 = lc1.w(additionalData, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (AdditionalDataDtoV5 additionalDataDtoV5 : additionalData) {
            arrayList2.add(b(additionalDataDtoV5));
        }
        return new o1b(code, title, arrayList, arrayList2);
    }

    private final dkb r(TraitDtoV5 traitDtoV5) {
        return new dkb(traitDtoV5.getSpicy(), traitDtoV5.getVegan(), traitDtoV5.getForChildren(), traitDtoV5.getBaked(), traitDtoV5.getDrink(), traitDtoV5.getFood(), traitDtoV5.getDigital(), traitDtoV5.getMaterial(), traitDtoV5.getHotAndReady(), traitDtoV5.getAlcohol(), traitDtoV5.getPizza(), traitDtoV5.getSauce());
    }

    private final dxb s(VariationDtoV5 variationDtoV5) {
        int w;
        tm8 m = m(variationDtoV5.getProduct().getValue());
        int index = variationDtoV5.getIndex();
        boolean isDefault = variationDtoV5.isDefault();
        List<AdditionalDataDtoV5> additionalData = variationDtoV5.getAdditionalData();
        w = lc1.w(additionalData, 10);
        ArrayList arrayList = new ArrayList(w);
        for (AdditionalDataDtoV5 additionalDataDtoV5 : additionalData) {
            arrayList.add(b(additionalDataDtoV5));
        }
        return new dxb(m, index, isDefault, arrayList);
    }

    public final kh6 a(MenuDtoV5 menuDtoV5) {
        int w;
        int w2;
        int w3;
        z65.h(menuDtoV5, "menuDtoV5");
        List<ReferenceWrapper<MenuItemDtoV5>> items = menuDtoV5.getItems();
        w = lc1.w(items, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(j((MenuItemDtoV5) ((ReferenceWrapper) it.next()).getValue()));
        }
        List<ReferenceWrapper<SectionDtoV5>> structure = menuDtoV5.getStructure();
        w2 = lc1.w(structure, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        Iterator<T> it2 = structure.iterator();
        while (it2.hasNext()) {
            ReferenceWrapper referenceWrapper = (ReferenceWrapper) it2.next();
            String code = ((SectionDtoV5) referenceWrapper.getValue()).getCode();
            String title = ((SectionDtoV5) referenceWrapper.getValue()).getTitle();
            List<ReferenceWrapper<SectionItemDtoV5>> items2 = ((SectionDtoV5) referenceWrapper.getValue()).getItems();
            w3 = lc1.w(items2, 10);
            ArrayList arrayList3 = new ArrayList(w3);
            Iterator<T> it3 = items2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(p((SectionItemDtoV5) ((ReferenceWrapper) it3.next()).getValue()));
            }
            arrayList2.add(new z2a(code, title, arrayList3, ((SectionDtoV5) referenceWrapper.getValue()).getIndex()));
        }
        return new kh6(arrayList, arrayList2);
    }
}
