package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.MoneyType;
import com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity;
import com.dodopizza.persistence.entity.menu.ComboTemplateSlotProductEntity;
import com.dodopizza.persistence.entity.menu.DoughTypeEntity;
import com.dodopizza.persistence.entity.menu.ProductEntity;
import com.dodopizza.persistence.entity.menu.ProductIngredientEntity;
import com.dodopizza.persistence.entity.menu.SizeGroupEntity;
import com.dodopizza.persistence.entity.menu.ToppingEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.m78;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
/* compiled from: producttransforms.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001c\u0010\u0007\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\bH\u0002\u001a\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000bH\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\rH\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0011H\u0002\u001a\u001e\u0010\u0013\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0014H\u0002\u001a\u001e\u0010\u0016\u001a\u00020\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u001a\u001e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002\u001a\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u001a\u001e\u0010!\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002\u001a\u0010\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0002\u001a\u0010\u0010'\u001a\u00020\"2\u0006\u0010&\u001a\u00020$H\u0002\u001a\u0010\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0002\u001a\u0010\u0010-\u001a\u00020(2\u0006\u0010,\u001a\u00020*H\u0002\u001a\u000e\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.\u001a\u000e\u00103\u001a\u00020.2\u0006\u00102\u001a\u000200\u001a\u0010\u00105\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\u0010\u00107\u001a\u0002062\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¨\u00068"}, d2 = {"Lfl8;", "product", "Lcom/dodopizza/persistence/entity/menu/ProductEntity;", "t", "", "products", "entity", Image.TYPE_MEDIUM, "Lqma;", "u", "n", "Lm78;", "i", "Lswb;", "x", "l", "o", "Lao1;", "f", "k", "Lzi1;", c.a, "j", "Lcj1;", "slot", "Lcom/dodopizza/persistence/entity/menu/ComboTemplateSlotEntity;", e.a, "productEntities", DateTokenConverter.CONVERTER_KEY, "Ldj1;", "slotProduct", "Lcom/dodopizza/persistence/entity/menu/ComboTemplateSlotProductEntity;", "b", "a", "Ltl8;", "productImage", "Lcom/dodopizza/persistence/entity/ImageEntity;", "r", "productImageEntity", "q", "Lul8;", "ingredient", "Lcom/dodopizza/persistence/entity/menu/ProductIngredientEntity;", Image.TYPE_HIGH, "productIngredientEntity", "g", "Lejb;", "topping", "Lcom/dodopizza/persistence/entity/menu/ToppingEntity;", "w", "toppingEntity", "v", "Lrl8;", "p", "Lkm8;", Image.TYPE_SMALL, "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: vm8  reason: default package */
/* loaded from: classes4.dex */
public final class vm8 {
    private static final dj1 a(ComboTemplateSlotProductEntity comboTemplateSlotProductEntity, List<? extends ProductEntity> list) {
        for (ProductEntity productEntity : list) {
            if (z65.c(productEntity.getId(), comboTemplateSlotProductEntity.getProductId())) {
                String id = comboTemplateSlotProductEntity.getId();
                z65.e(id);
                int priority = comboTemplateSlotProductEntity.getPriority();
                fl8 m = m(list, productEntity);
                MoneyType price = comboTemplateSlotProductEntity.getPrice();
                z65.e(price);
                hn6 b = wn6.b(price);
                MoneyType extraPrice = comboTemplateSlotProductEntity.getExtraPrice();
                z65.e(extraPrice);
                return new dj1(id, priority, m, b, wn6.b(extraPrice));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private static final ComboTemplateSlotProductEntity b(dj1 dj1Var) {
        return new ComboTemplateSlotProductEntity(dj1Var.d(), dj1Var.g().getId(), dj1Var.f(), wn6.a(dj1Var.e()), wn6.a(dj1Var.c()));
    }

    private static final ProductEntity c(zi1 zi1Var) {
        String id = zi1Var.getId();
        String name = zi1Var.getName();
        String e = zi1Var.e();
        String f = zi1Var.f();
        String b = zi1Var.b();
        String c = zi1Var.c();
        k0 k0Var = new k0();
        for (ul8 ul8Var : zi1Var.k()) {
            k0Var.add(h(ul8Var));
        }
        k0 k0Var2 = new k0();
        for (tl8 tl8Var : zi1Var.j()) {
            k0Var2.add(r(tl8Var));
        }
        String a = zi1Var.m().a();
        String value = zi1Var.m().getValue();
        String b2 = zi1Var.i().b();
        String d = zi1Var.i().d();
        String a2 = zi1Var.i().a();
        String c2 = zi1Var.i().c();
        String e2 = zi1Var.i().e();
        String l = zi1Var.l();
        k0 k0Var3 = new k0();
        for (Iterator it = zi1Var.r().iterator(); it.hasNext(); it = it) {
            k0Var3.add(e((cj1) it.next()));
        }
        return new ProductEntity(id, name, e, f, b, c, k0Var, k0Var2, a, value, b2, d, a2, c2, e2, "combo_template", null, null, null, null, null, l, k0Var3, null, 10420224, null);
    }

    private static final cj1 d(ComboTemplateSlotEntity comboTemplateSlotEntity, List<? extends ProductEntity> list) {
        int w;
        String id = comboTemplateSlotEntity.getId();
        z65.e(id);
        String name = comboTemplateSlotEntity.getName();
        int priority = comboTemplateSlotEntity.getPriority();
        String defaultProduct = comboTemplateSlotEntity.getDefaultProduct();
        if (defaultProduct == null) {
            defaultProduct = "";
        }
        String str = defaultProduct;
        k0<ComboTemplateSlotProductEntity> slotProducts = comboTemplateSlotEntity.getSlotProducts();
        w = lc1.w(slotProducts, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ComboTemplateSlotProductEntity comboTemplateSlotProductEntity : slotProducts) {
            z65.e(comboTemplateSlotProductEntity);
            arrayList.add(a(comboTemplateSlotProductEntity, list));
        }
        return new cj1(id, name, priority, str, arrayList);
    }

    private static final ComboTemplateSlotEntity e(cj1 cj1Var) {
        String e = cj1Var.e();
        String f = cj1Var.f();
        int g = cj1Var.g();
        String c = cj1Var.c();
        k0 k0Var = new k0();
        for (dj1 dj1Var : cj1Var.h()) {
            k0Var.add(b(dj1Var));
        }
        return new ComboTemplateSlotEntity(e, f, g, c, k0Var);
    }

    private static final ProductEntity f(ao1 ao1Var) {
        String id = ao1Var.getId();
        String name = ao1Var.getName();
        String e = ao1Var.e();
        String f = ao1Var.f();
        String b = ao1Var.b();
        String c = ao1Var.c();
        k0 k0Var = new k0();
        for (ul8 ul8Var : ao1Var.k()) {
            k0Var.add(h(ul8Var));
        }
        k0 k0Var2 = new k0();
        for (tl8 tl8Var : ao1Var.j()) {
            k0Var2.add(r(tl8Var));
        }
        String a = ao1Var.m().a();
        String value = ao1Var.m().getValue();
        String b2 = ao1Var.i().b();
        String d = ao1Var.i().d();
        String a2 = ao1Var.i().a();
        String c2 = ao1Var.i().c();
        String e2 = ao1Var.i().e();
        String q = ao1Var.q();
        k0 k0Var3 = new k0();
        for (Iterator it = ao1Var.o().iterator(); it.hasNext(); it = it) {
            k0Var3.add(t((fl8) it.next()));
        }
        return new ProductEntity(id, name, e, f, b, c, k0Var, k0Var2, a, value, b2, d, a2, c2, e2, ProductEntity.TYPE_COMPOSITE, null, null, null, q, k0Var3, ao1Var.l(), null, null, 13041664, null);
    }

    private static final ul8 g(ProductIngredientEntity productIngredientEntity) {
        String id = productIngredientEntity.getId();
        z65.e(id);
        return new ul8(id, productIngredientEntity.getParentId(), productIngredientEntity.getName(), productIngredientEntity.isRemovable());
    }

    private static final ProductIngredientEntity h(ul8 ul8Var) {
        return new ProductIngredientEntity(ul8Var.getId(), ul8Var.c(), ul8Var.getName(), ul8Var.d());
    }

    private static final ProductEntity i(m78 m78Var) {
        String id = m78Var.getId();
        String name = m78Var.getName();
        String e = m78Var.e();
        String f = m78Var.f();
        String b = m78Var.b();
        String c = m78Var.c();
        k0 k0Var = new k0();
        for (ul8 ul8Var : m78Var.k()) {
            k0Var.add(h(ul8Var));
        }
        k0 k0Var2 = new k0();
        for (tl8 tl8Var : m78Var.j()) {
            k0Var2.add(r(tl8Var));
        }
        String a = m78Var.m().a();
        String value = m78Var.m().getValue();
        String b2 = m78Var.i().b();
        String d = m78Var.i().d();
        String a2 = m78Var.i().a();
        String c2 = m78Var.i().c();
        String e2 = m78Var.i().e();
        DoughTypeEntity c3 = rw9.c(m78Var.o());
        SizeGroupEntity f2 = rw9.f(m78Var.s());
        String name2 = m78Var.r().name();
        String l = m78Var.l();
        k0 k0Var3 = new k0();
        for (Iterator it = m78Var.a().iterator(); it.hasNext(); it = it) {
            k0Var3.add(w((ejb) it.next()));
        }
        return new ProductEntity(id, name, e, f, b, c, k0Var, k0Var2, a, value, b2, d, a2, c2, e2, ProductEntity.TYPE_PIZZA, c3, f2, name2, null, null, l, null, k0Var3, 5767168, null);
    }

    private static final zi1 j(List<? extends ProductEntity> list, ProductEntity productEntity) {
        int w;
        int w2;
        String id = productEntity.getId();
        z65.e(id);
        String name = productEntity.getName();
        String category = productEntity.getCategory();
        String description = productEntity.getDescription();
        k0<ImageEntity> images = productEntity.getImages();
        w = lc1.w(images, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ImageEntity imageEntity : images) {
            arrayList.add(q(imageEntity));
        }
        k0<ComboTemplateSlotEntity> comboTemplatesSlots = productEntity.getComboTemplatesSlots();
        w2 = lc1.w(comboTemplatesSlots, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (ComboTemplateSlotEntity comboTemplateSlotEntity : comboTemplatesSlots) {
            z65.e(comboTemplateSlotEntity);
            arrayList2.add(d(comboTemplateSlotEntity, list));
        }
        return new zi1(id, name, category, description, arrayList, arrayList2);
    }

    private static final ao1 k(List<? extends ProductEntity> list, ProductEntity productEntity) {
        int w;
        int w2;
        String id = productEntity.getId();
        z65.e(id);
        String name = productEntity.getName();
        String category = productEntity.getCategory();
        String description = productEntity.getDescription();
        k0<ImageEntity> images = productEntity.getImages();
        w = lc1.w(images, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ImageEntity imageEntity : images) {
            arrayList.add(q(imageEntity));
        }
        String metaProductId = productEntity.getMetaProductId();
        String weight = productEntity.getWeight();
        k0<ProductEntity> components = productEntity.getComponents();
        w2 = lc1.w(components, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (ProductEntity productEntity2 : components) {
            z65.e(productEntity2);
            arrayList2.add(m(list, productEntity2));
        }
        return new ao1(id, name, category, description, arrayList, metaProductId, weight, arrayList2);
    }

    private static final m78 l(ProductEntity productEntity) {
        int w;
        int w2;
        String id = productEntity.getId();
        z65.e(id);
        String name = productEntity.getName();
        String description = productEntity.getDescription();
        String allergens = productEntity.getAllergens();
        String allergensCanContain = productEntity.getAllergensCanContain();
        rl8 p = p(productEntity);
        k0<ProductIngredientEntity> ingredients = productEntity.getIngredients();
        w = lc1.w(ingredients, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ProductIngredientEntity productIngredientEntity : ingredients) {
            arrayList.add(g(productIngredientEntity));
        }
        k0<ImageEntity> images = productEntity.getImages();
        w2 = lc1.w(images, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (ImageEntity imageEntity : images) {
            arrayList2.add(q(imageEntity));
        }
        km8 s = s(productEntity);
        SizeGroupEntity sizeGroup = productEntity.getSizeGroup();
        z65.e(sizeGroup);
        fna e = rw9.e(sizeGroup);
        DoughTypeEntity doughType = productEntity.getDoughType();
        z65.e(doughType);
        w63 b = rw9.b(doughType);
        m78.a valueOf = m78.a.valueOf(productEntity.getPortion());
        String metaProductId = productEntity.getMetaProductId();
        k0<ToppingEntity> toppings = productEntity.getToppings();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ToppingEntity toppingEntity : toppings) {
            linkedHashSet.add(v(toppingEntity));
        }
        return new m78(id, name, description, allergens, allergensCanContain, p, arrayList, arrayList2, s, metaProductId, linkedHashSet, e, b, valueOf);
    }

    public static final fl8 m(List<? extends ProductEntity> list, ProductEntity productEntity) {
        z65.h(list, "products");
        z65.h(productEntity, "entity");
        String type = productEntity.getType();
        switch (type.hashCode()) {
            case -1405309941:
                if (type.equals("combo_template")) {
                    return j(list, productEntity);
                }
                break;
            case -1399754105:
                if (type.equals(ProductEntity.TYPE_COMPOSITE)) {
                    return k(list, productEntity);
                }
                break;
            case -1249586564:
                if (type.equals("variable")) {
                    return o(productEntity);
                }
                break;
            case -902265784:
                if (type.equals(ProductEntity.TYPE_SINGLE)) {
                    return n(productEntity);
                }
                break;
            case 106683528:
                if (type.equals(ProductEntity.TYPE_PIZZA)) {
                    return l(productEntity);
                }
                break;
        }
        String type2 = productEntity.getType();
        throw new IllegalArgumentException("ProductEntity type " + type2 + " not found in domain");
    }

    private static final qma n(ProductEntity productEntity) {
        int w;
        int w2;
        String id = productEntity.getId();
        z65.e(id);
        String name = productEntity.getName();
        String category = productEntity.getCategory();
        String description = productEntity.getDescription();
        String allergens = productEntity.getAllergens();
        String allergensCanContain = productEntity.getAllergensCanContain();
        rl8 p = p(productEntity);
        k0<ProductIngredientEntity> ingredients = productEntity.getIngredients();
        w = lc1.w(ingredients, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ProductIngredientEntity productIngredientEntity : ingredients) {
            arrayList.add(g(productIngredientEntity));
        }
        k0<ImageEntity> images = productEntity.getImages();
        w2 = lc1.w(images, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (ImageEntity imageEntity : images) {
            arrayList2.add(q(imageEntity));
        }
        km8 s = s(productEntity);
        String metaProductId = productEntity.getMetaProductId();
        k0<ToppingEntity> toppings = productEntity.getToppings();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ToppingEntity toppingEntity : toppings) {
            linkedHashSet.add(v(toppingEntity));
        }
        return new qma(id, name, category, description, allergens, allergensCanContain, p, arrayList, arrayList2, s, metaProductId, linkedHashSet);
    }

    private static final swb o(ProductEntity productEntity) {
        int w;
        int w2;
        String id = productEntity.getId();
        z65.e(id);
        String name = productEntity.getName();
        String category = productEntity.getCategory();
        String description = productEntity.getDescription();
        k0<ImageEntity> images = productEntity.getImages();
        w = lc1.w(images, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ImageEntity imageEntity : images) {
            arrayList.add(q(imageEntity));
        }
        String allergens = productEntity.getAllergens();
        String allergensCanContain = productEntity.getAllergensCanContain();
        k0<ProductIngredientEntity> ingredients = productEntity.getIngredients();
        w2 = lc1.w(ingredients, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (ProductIngredientEntity productIngredientEntity : ingredients) {
            arrayList2.add(g(productIngredientEntity));
        }
        String metaProductId = productEntity.getMetaProductId();
        rl8 p = p(productEntity);
        km8 s = s(productEntity);
        SizeGroupEntity sizeGroup = productEntity.getSizeGroup();
        z65.e(sizeGroup);
        fna e = rw9.e(sizeGroup);
        k0<ToppingEntity> toppings = productEntity.getToppings();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ToppingEntity toppingEntity : toppings) {
            linkedHashSet.add(v(toppingEntity));
        }
        return new swb(id, name, description, allergens, allergensCanContain, p, arrayList2, arrayList, s, metaProductId, category, linkedHashSet, e);
    }

    private static final rl8 p(ProductEntity productEntity) {
        return new rl8(productEntity.getFoodValueFats(), productEntity.getFoodValueProteins(), productEntity.getFoodValueCarbohydrates(), productEntity.getFoodValueKiloCalories(), productEntity.getFoodValueWeight());
    }

    private static final tl8 q(ImageEntity imageEntity) {
        return new tl8(imageEntity.getSize(), imageEntity.getUrl());
    }

    private static final ImageEntity r(tl8 tl8Var) {
        return new ImageEntity(tl8Var.a(), tl8Var.b());
    }

    private static final km8 s(ProductEntity productEntity) {
        return new km8(productEntity.getSizeMeasure(), productEntity.getSizeValue());
    }

    public static final ProductEntity t(fl8 fl8Var) {
        z65.h(fl8Var, "product");
        if (fl8Var instanceof qma) {
            return u((qma) fl8Var);
        }
        if (fl8Var instanceof m78) {
            return i((m78) fl8Var);
        }
        if (fl8Var instanceof ao1) {
            return f((ao1) fl8Var);
        }
        if (fl8Var instanceof zi1) {
            return c((zi1) fl8Var);
        }
        if (fl8Var instanceof swb) {
            return x((swb) fl8Var);
        }
        String name = fl8Var.getClass().getName();
        throw new IllegalArgumentException("Can't convert " + name + " to entity");
    }

    private static final ProductEntity u(qma qmaVar) {
        String id = qmaVar.getId();
        String name = qmaVar.getName();
        String e = qmaVar.e();
        String f = qmaVar.f();
        String b = qmaVar.b();
        String c = qmaVar.c();
        k0 k0Var = new k0();
        for (ul8 ul8Var : qmaVar.k()) {
            k0Var.add(h(ul8Var));
        }
        k0 k0Var2 = new k0();
        for (tl8 tl8Var : qmaVar.j()) {
            k0Var2.add(r(tl8Var));
        }
        return new ProductEntity(id, name, e, f, b, c, k0Var, k0Var2, qmaVar.m().a(), qmaVar.m().getValue(), qmaVar.i().b(), qmaVar.i().d(), qmaVar.i().a(), qmaVar.i().c(), qmaVar.i().e(), ProductEntity.TYPE_SINGLE, null, null, null, null, null, qmaVar.l(), null, null, 14614528, null);
    }

    public static final ejb v(ToppingEntity toppingEntity) {
        z65.h(toppingEntity, "toppingEntity");
        String uuid = toppingEntity.getUuid();
        String parentUuid = toppingEntity.getParentUuid();
        String name = toppingEntity.getName();
        String imageUrl = toppingEntity.getImageUrl();
        MoneyType price = toppingEntity.getPrice();
        z65.e(price);
        return new ejb(uuid, parentUuid, name, imageUrl, wn6.b(price), toppingEntity.isInStop(), toppingEntity.getCanAddToVariation());
    }

    public static final ToppingEntity w(ejb ejbVar) {
        z65.h(ejbVar, "topping");
        return new ToppingEntity(ejbVar.d(), ejbVar.c(), ejbVar.getName(), ejbVar.b(), wn6.a(ejbVar.h()), ejbVar.e(), ejbVar.a());
    }

    private static final ProductEntity x(swb swbVar) {
        String id = swbVar.getId();
        String name = swbVar.getName();
        String e = swbVar.e();
        String f = swbVar.f();
        String b = swbVar.b();
        String c = swbVar.c();
        k0 k0Var = new k0();
        for (ul8 ul8Var : swbVar.k()) {
            k0Var.add(h(ul8Var));
        }
        k0 k0Var2 = new k0();
        for (tl8 tl8Var : swbVar.j()) {
            k0Var2.add(r(tl8Var));
        }
        String a = swbVar.m().a();
        String value = swbVar.m().getValue();
        String b2 = swbVar.i().b();
        String d = swbVar.i().d();
        String a2 = swbVar.i().a();
        String c2 = swbVar.i().c();
        String e2 = swbVar.i().e();
        SizeGroupEntity f2 = rw9.f(swbVar.r());
        String l = swbVar.l();
        k0 k0Var3 = new k0();
        for (Iterator it = swbVar.a().iterator(); it.hasNext(); it = it) {
            k0Var3.add(w((ejb) it.next()));
        }
        return new ProductEntity(id, name, e, f, b, c, k0Var, k0Var2, a, value, b2, d, a2, c2, e2, "variable", null, f2, null, null, null, l, null, k0Var3, 6094848, null);
    }
}
