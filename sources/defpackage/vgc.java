package defpackage;

import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity;
import com.dodopizza.persistence.entity.menu.DoughTypeEntity;
import com.dodopizza.persistence.entity.menu.ProductEntity;
import com.dodopizza.persistence.entity.menu.ProductIngredientEntity;
import com.dodopizza.persistence.entity.menu.SizeGroupEntity;
import com.dodopizza.persistence.entity.menu.ToppingEntity;
import io.realm.k0;
/* compiled from: com_dodopizza_persistence_entity_menu_ProductEntityRealmProxyInterface.java */
/* renamed from: vgc  reason: default package */
/* loaded from: classes3.dex */
public interface vgc {
    String realmGet$allergens();

    String realmGet$allergensCanContain();

    String realmGet$category();

    k0<ComboTemplateSlotEntity> realmGet$comboTemplatesSlots();

    k0<ProductEntity> realmGet$components();

    String realmGet$description();

    DoughTypeEntity realmGet$doughType();

    String realmGet$foodValueCarbohydrates();

    String realmGet$foodValueFats();

    String realmGet$foodValueKiloCalories();

    String realmGet$foodValueProteins();

    String realmGet$foodValueWeight();

    String realmGet$id();

    k0<ImageEntity> realmGet$images();

    k0<ProductIngredientEntity> realmGet$ingredients();

    String realmGet$metaProductId();

    String realmGet$name();

    String realmGet$portion();

    SizeGroupEntity realmGet$sizeGroup();

    String realmGet$sizeMeasure();

    String realmGet$sizeValue();

    k0<ToppingEntity> realmGet$toppings();

    String realmGet$type();

    String realmGet$weight();

    void realmSet$allergens(String str);

    void realmSet$allergensCanContain(String str);

    void realmSet$category(String str);

    void realmSet$comboTemplatesSlots(k0<ComboTemplateSlotEntity> k0Var);

    void realmSet$components(k0<ProductEntity> k0Var);

    void realmSet$description(String str);

    void realmSet$doughType(DoughTypeEntity doughTypeEntity);

    void realmSet$foodValueCarbohydrates(String str);

    void realmSet$foodValueFats(String str);

    void realmSet$foodValueKiloCalories(String str);

    void realmSet$foodValueProteins(String str);

    void realmSet$foodValueWeight(String str);

    void realmSet$id(String str);

    void realmSet$images(k0<ImageEntity> k0Var);

    void realmSet$ingredients(k0<ProductIngredientEntity> k0Var);

    void realmSet$metaProductId(String str);

    void realmSet$name(String str);

    void realmSet$portion(String str);

    void realmSet$sizeGroup(SizeGroupEntity sizeGroupEntity);

    void realmSet$sizeMeasure(String str);

    void realmSet$sizeValue(String str);

    void realmSet$toppings(k0<ToppingEntity> k0Var);

    void realmSet$type(String str);

    void realmSet$weight(String str);
}
