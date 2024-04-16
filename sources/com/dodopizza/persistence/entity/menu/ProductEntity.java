package com.dodopizza.persistence.entity.menu;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.ImageEntity;
import im.threads.business.transport.MessageAttributes;
import io.realm.k0;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ProductEntity.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0001aB\u009b\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0019\u0012\b\b\u0002\u0010%\u001a\u00020\u0003\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\b\b\u0002\u0010+\u001a\u00020\u0003\u0012\b\b\u0002\u0010.\u001a\u00020\u0003\u0012\b\b\u0002\u00101\u001a\u00020\u0003\u0012\b\b\u0002\u00104\u001a\u00020\u0003\u0012\b\b\u0002\u00107\u001a\u00020\u0003\u0012\b\b\u0002\u0010:\u001a\u00020\u0003\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\b\b\u0002\u0010K\u001a\u00020\u0003\u0012\b\b\u0002\u0010N\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019\u0012\b\b\u0002\u0010T\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\u0019\u0012\u000e\b\u0002\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u0019¢\u0006\u0004\b_\u0010`R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\"\u0010\u0016\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\"\u0010%\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0005\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\"\u0010(\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0005\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\"\u0010+\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0005\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\"\u0010.\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0005\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR\"\u00101\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0005\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\tR\"\u00104\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0005\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\tR\"\u00107\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0005\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR\"\u0010:\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0005\u001a\u0004\b;\u0010\u0007\"\u0004\b<\u0010\tR$\u0010>\u001a\u0004\u0018\u00010=8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010E\u001a\u0004\u0018\u00010D8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010K\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0005\u001a\u0004\bL\u0010\u0007\"\u0004\bM\u0010\tR\"\u0010N\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0005\u001a\u0004\bO\u0010\u0007\"\u0004\bP\u0010\tR(\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00000\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u001c\u001a\u0004\bR\u0010\u001e\"\u0004\bS\u0010 R\"\u0010T\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bT\u0010\u0005\u001a\u0004\bU\u0010\u0007\"\u0004\bV\u0010\tR(\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bX\u0010\u001c\u001a\u0004\bY\u0010\u001e\"\u0004\bZ\u0010 R(\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\\\u0010\u001c\u001a\u0004\b]\u0010\u001e\"\u0004\b^\u0010 ¨\u0006b"}, d2 = {"Lcom/dodopizza/persistence/entity/menu/ProductEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", Action.NAME_ATTRIBUTE, "getName", "setName", "category", "getCategory", "setCategory", "description", "getDescription", "setDescription", "allergens", "getAllergens", "setAllergens", "allergensCanContain", "getAllergensCanContain", "setAllergensCanContain", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/menu/ProductIngredientEntity;", "ingredients", "Lio/realm/k0;", "getIngredients", "()Lio/realm/k0;", "setIngredients", "(Lio/realm/k0;)V", "Lcom/dodopizza/persistence/entity/ImageEntity;", "images", "getImages", "setImages", "sizeMeasure", "getSizeMeasure", "setSizeMeasure", "sizeValue", "getSizeValue", "setSizeValue", "foodValueFats", "getFoodValueFats", "setFoodValueFats", "foodValueProteins", "getFoodValueProteins", "setFoodValueProteins", "foodValueCarbohydrates", "getFoodValueCarbohydrates", "setFoodValueCarbohydrates", "foodValueKiloCalories", "getFoodValueKiloCalories", "setFoodValueKiloCalories", "foodValueWeight", "getFoodValueWeight", "setFoodValueWeight", MessageAttributes.TYPE, "getType", "setType", "Lcom/dodopizza/persistence/entity/menu/DoughTypeEntity;", "doughType", "Lcom/dodopizza/persistence/entity/menu/DoughTypeEntity;", "getDoughType", "()Lcom/dodopizza/persistence/entity/menu/DoughTypeEntity;", "setDoughType", "(Lcom/dodopizza/persistence/entity/menu/DoughTypeEntity;)V", "Lcom/dodopizza/persistence/entity/menu/SizeGroupEntity;", "sizeGroup", "Lcom/dodopizza/persistence/entity/menu/SizeGroupEntity;", "getSizeGroup", "()Lcom/dodopizza/persistence/entity/menu/SizeGroupEntity;", "setSizeGroup", "(Lcom/dodopizza/persistence/entity/menu/SizeGroupEntity;)V", "portion", "getPortion", "setPortion", "weight", "getWeight", "setWeight", "components", "getComponents", "setComponents", "metaProductId", "getMetaProductId", "setMetaProductId", "Lcom/dodopizza/persistence/entity/menu/ComboTemplateSlotEntity;", "comboTemplatesSlots", "getComboTemplatesSlots", "setComboTemplatesSlots", "Lcom/dodopizza/persistence/entity/menu/ToppingEntity;", "toppings", "getToppings", "setToppings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/k0;Lio/realm/k0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dodopizza/persistence/entity/menu/DoughTypeEntity;Lcom/dodopizza/persistence/entity/menu/SizeGroupEntity;Ljava/lang/String;Ljava/lang/String;Lio/realm/k0;Ljava/lang/String;Lio/realm/k0;Lio/realm/k0;)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class ProductEntity extends n0 implements yi3, vgc {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_COMBO_TEMPLATE = "combo_template";
    public static final String TYPE_COMPOSITE = "composite";
    public static final String TYPE_PIZZA = "pizza";
    public static final String TYPE_SINGLE = "single";
    public static final String TYPE_VARIABLE = "variable";
    private String allergens;
    private String allergensCanContain;
    private String category;
    private k0<ComboTemplateSlotEntity> comboTemplatesSlots;
    private k0<ProductEntity> components;
    private String description;
    private DoughTypeEntity doughType;
    private String foodValueCarbohydrates;
    private String foodValueFats;
    private String foodValueKiloCalories;
    private String foodValueProteins;
    private String foodValueWeight;
    private String id;
    private k0<ImageEntity> images;
    private k0<ProductIngredientEntity> ingredients;
    private String metaProductId;
    private String name;
    private String portion;
    private SizeGroupEntity sizeGroup;
    private String sizeMeasure;
    private String sizeValue;
    private k0<ToppingEntity> toppings;
    private String type;
    private String weight;

    /* compiled from: ProductEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/dodopizza/persistence/entity/menu/ProductEntity$Companion;", "", "()V", "TYPE_COMBO_TEMPLATE", "", "TYPE_COMPOSITE", "TYPE_PIZZA", "TYPE_SINGLE", "TYPE_VARIABLE", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProductEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getAllergens() {
        return realmGet$allergens();
    }

    public String getAllergensCanContain() {
        return realmGet$allergensCanContain();
    }

    public String getCategory() {
        return realmGet$category();
    }

    public k0<ComboTemplateSlotEntity> getComboTemplatesSlots() {
        return realmGet$comboTemplatesSlots();
    }

    public k0<ProductEntity> getComponents() {
        return realmGet$components();
    }

    public String getDescription() {
        return realmGet$description();
    }

    public DoughTypeEntity getDoughType() {
        return realmGet$doughType();
    }

    public String getFoodValueCarbohydrates() {
        return realmGet$foodValueCarbohydrates();
    }

    public String getFoodValueFats() {
        return realmGet$foodValueFats();
    }

    public String getFoodValueKiloCalories() {
        return realmGet$foodValueKiloCalories();
    }

    public String getFoodValueProteins() {
        return realmGet$foodValueProteins();
    }

    public String getFoodValueWeight() {
        return realmGet$foodValueWeight();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public k0<ImageEntity> getImages() {
        return realmGet$images();
    }

    public k0<ProductIngredientEntity> getIngredients() {
        return realmGet$ingredients();
    }

    public String getMetaProductId() {
        return realmGet$metaProductId();
    }

    public String getName() {
        return realmGet$name();
    }

    public String getPortion() {
        return realmGet$portion();
    }

    public SizeGroupEntity getSizeGroup() {
        return realmGet$sizeGroup();
    }

    public String getSizeMeasure() {
        return realmGet$sizeMeasure();
    }

    public String getSizeValue() {
        return realmGet$sizeValue();
    }

    public k0<ToppingEntity> getToppings() {
        return realmGet$toppings();
    }

    public String getType() {
        return realmGet$type();
    }

    public String getWeight() {
        return realmGet$weight();
    }

    @Override // defpackage.vgc
    public String realmGet$allergens() {
        return this.allergens;
    }

    @Override // defpackage.vgc
    public String realmGet$allergensCanContain() {
        return this.allergensCanContain;
    }

    @Override // defpackage.vgc
    public String realmGet$category() {
        return this.category;
    }

    @Override // defpackage.vgc
    public k0 realmGet$comboTemplatesSlots() {
        return this.comboTemplatesSlots;
    }

    @Override // defpackage.vgc
    public k0 realmGet$components() {
        return this.components;
    }

    @Override // defpackage.vgc
    public String realmGet$description() {
        return this.description;
    }

    @Override // defpackage.vgc
    public DoughTypeEntity realmGet$doughType() {
        return this.doughType;
    }

    @Override // defpackage.vgc
    public String realmGet$foodValueCarbohydrates() {
        return this.foodValueCarbohydrates;
    }

    @Override // defpackage.vgc
    public String realmGet$foodValueFats() {
        return this.foodValueFats;
    }

    @Override // defpackage.vgc
    public String realmGet$foodValueKiloCalories() {
        return this.foodValueKiloCalories;
    }

    @Override // defpackage.vgc
    public String realmGet$foodValueProteins() {
        return this.foodValueProteins;
    }

    @Override // defpackage.vgc
    public String realmGet$foodValueWeight() {
        return this.foodValueWeight;
    }

    @Override // defpackage.vgc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.vgc
    public k0 realmGet$images() {
        return this.images;
    }

    @Override // defpackage.vgc
    public k0 realmGet$ingredients() {
        return this.ingredients;
    }

    @Override // defpackage.vgc
    public String realmGet$metaProductId() {
        return this.metaProductId;
    }

    @Override // defpackage.vgc
    public String realmGet$name() {
        return this.name;
    }

    @Override // defpackage.vgc
    public String realmGet$portion() {
        return this.portion;
    }

    @Override // defpackage.vgc
    public SizeGroupEntity realmGet$sizeGroup() {
        return this.sizeGroup;
    }

    @Override // defpackage.vgc
    public String realmGet$sizeMeasure() {
        return this.sizeMeasure;
    }

    @Override // defpackage.vgc
    public String realmGet$sizeValue() {
        return this.sizeValue;
    }

    @Override // defpackage.vgc
    public k0 realmGet$toppings() {
        return this.toppings;
    }

    @Override // defpackage.vgc
    public String realmGet$type() {
        return this.type;
    }

    @Override // defpackage.vgc
    public String realmGet$weight() {
        return this.weight;
    }

    @Override // defpackage.vgc
    public void realmSet$allergens(String str) {
        this.allergens = str;
    }

    @Override // defpackage.vgc
    public void realmSet$allergensCanContain(String str) {
        this.allergensCanContain = str;
    }

    @Override // defpackage.vgc
    public void realmSet$category(String str) {
        this.category = str;
    }

    @Override // defpackage.vgc
    public void realmSet$comboTemplatesSlots(k0 k0Var) {
        this.comboTemplatesSlots = k0Var;
    }

    @Override // defpackage.vgc
    public void realmSet$components(k0 k0Var) {
        this.components = k0Var;
    }

    @Override // defpackage.vgc
    public void realmSet$description(String str) {
        this.description = str;
    }

    @Override // defpackage.vgc
    public void realmSet$doughType(DoughTypeEntity doughTypeEntity) {
        this.doughType = doughTypeEntity;
    }

    @Override // defpackage.vgc
    public void realmSet$foodValueCarbohydrates(String str) {
        this.foodValueCarbohydrates = str;
    }

    @Override // defpackage.vgc
    public void realmSet$foodValueFats(String str) {
        this.foodValueFats = str;
    }

    @Override // defpackage.vgc
    public void realmSet$foodValueKiloCalories(String str) {
        this.foodValueKiloCalories = str;
    }

    @Override // defpackage.vgc
    public void realmSet$foodValueProteins(String str) {
        this.foodValueProteins = str;
    }

    @Override // defpackage.vgc
    public void realmSet$foodValueWeight(String str) {
        this.foodValueWeight = str;
    }

    @Override // defpackage.vgc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.vgc
    public void realmSet$images(k0 k0Var) {
        this.images = k0Var;
    }

    @Override // defpackage.vgc
    public void realmSet$ingredients(k0 k0Var) {
        this.ingredients = k0Var;
    }

    @Override // defpackage.vgc
    public void realmSet$metaProductId(String str) {
        this.metaProductId = str;
    }

    @Override // defpackage.vgc
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // defpackage.vgc
    public void realmSet$portion(String str) {
        this.portion = str;
    }

    @Override // defpackage.vgc
    public void realmSet$sizeGroup(SizeGroupEntity sizeGroupEntity) {
        this.sizeGroup = sizeGroupEntity;
    }

    @Override // defpackage.vgc
    public void realmSet$sizeMeasure(String str) {
        this.sizeMeasure = str;
    }

    @Override // defpackage.vgc
    public void realmSet$sizeValue(String str) {
        this.sizeValue = str;
    }

    @Override // defpackage.vgc
    public void realmSet$toppings(k0 k0Var) {
        this.toppings = k0Var;
    }

    @Override // defpackage.vgc
    public void realmSet$type(String str) {
        this.type = str;
    }

    @Override // defpackage.vgc
    public void realmSet$weight(String str) {
        this.weight = str;
    }

    public void setAllergens(String str) {
        z65.h(str, "<set-?>");
        realmSet$allergens(str);
    }

    public void setAllergensCanContain(String str) {
        z65.h(str, "<set-?>");
        realmSet$allergensCanContain(str);
    }

    public void setCategory(String str) {
        z65.h(str, "<set-?>");
        realmSet$category(str);
    }

    public void setComboTemplatesSlots(k0<ComboTemplateSlotEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$comboTemplatesSlots(k0Var);
    }

    public void setComponents(k0<ProductEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$components(k0Var);
    }

    public void setDescription(String str) {
        z65.h(str, "<set-?>");
        realmSet$description(str);
    }

    public void setDoughType(DoughTypeEntity doughTypeEntity) {
        realmSet$doughType(doughTypeEntity);
    }

    public void setFoodValueCarbohydrates(String str) {
        z65.h(str, "<set-?>");
        realmSet$foodValueCarbohydrates(str);
    }

    public void setFoodValueFats(String str) {
        z65.h(str, "<set-?>");
        realmSet$foodValueFats(str);
    }

    public void setFoodValueKiloCalories(String str) {
        z65.h(str, "<set-?>");
        realmSet$foodValueKiloCalories(str);
    }

    public void setFoodValueProteins(String str) {
        z65.h(str, "<set-?>");
        realmSet$foodValueProteins(str);
    }

    public void setFoodValueWeight(String str) {
        z65.h(str, "<set-?>");
        realmSet$foodValueWeight(str);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setImages(k0<ImageEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$images(k0Var);
    }

    public void setIngredients(k0<ProductIngredientEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$ingredients(k0Var);
    }

    public void setMetaProductId(String str) {
        z65.h(str, "<set-?>");
        realmSet$metaProductId(str);
    }

    public void setName(String str) {
        z65.h(str, "<set-?>");
        realmSet$name(str);
    }

    public void setPortion(String str) {
        z65.h(str, "<set-?>");
        realmSet$portion(str);
    }

    public void setSizeGroup(SizeGroupEntity sizeGroupEntity) {
        realmSet$sizeGroup(sizeGroupEntity);
    }

    public void setSizeMeasure(String str) {
        z65.h(str, "<set-?>");
        realmSet$sizeMeasure(str);
    }

    public void setSizeValue(String str) {
        z65.h(str, "<set-?>");
        realmSet$sizeValue(str);
    }

    public void setToppings(k0<ToppingEntity> k0Var) {
        z65.h(k0Var, "<set-?>");
        realmSet$toppings(k0Var);
    }

    public void setType(String str) {
        z65.h(str, "<set-?>");
        realmSet$type(str);
    }

    public void setWeight(String str) {
        z65.h(str, "<set-?>");
        realmSet$weight(str);
    }

    public /* synthetic */ ProductEntity(String str, String str2, String str3, String str4, String str5, String str6, k0 k0Var, k0 k0Var2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, DoughTypeEntity doughTypeEntity, SizeGroupEntity sizeGroupEntity, String str15, String str16, k0 k0Var3, String str17, k0 k0Var4, k0 k0Var5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? new k0() : k0Var, (i & 128) != 0 ? new k0() : k0Var2, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11, (i & 8192) != 0 ? "" : str12, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? TYPE_SINGLE : str14, (i & 65536) != 0 ? null : doughTypeEntity, (i & 131072) != 0 ? null : sizeGroupEntity, (i & 262144) != 0 ? "" : str15, (i & 524288) != 0 ? "" : str16, (i & 1048576) != 0 ? new k0() : k0Var3, (i & 2097152) != 0 ? "" : str17, (i & 4194304) != 0 ? new k0() : k0Var4, (i & 8388608) != 0 ? new k0() : k0Var5);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public ProductEntity(String str, String str2, String str3, String str4, String str5, String str6, k0<ProductIngredientEntity> k0Var, k0<ImageEntity> k0Var2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, DoughTypeEntity doughTypeEntity, SizeGroupEntity sizeGroupEntity, String str15, String str16, k0<ProductEntity> k0Var3, String str17, k0<ComboTemplateSlotEntity> k0Var4, k0<ToppingEntity> k0Var5) {
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "category");
        z65.h(str4, "description");
        z65.h(str5, "allergens");
        z65.h(str6, "allergensCanContain");
        z65.h(k0Var, "ingredients");
        z65.h(k0Var2, "images");
        z65.h(str7, "sizeMeasure");
        z65.h(str8, "sizeValue");
        z65.h(str9, "foodValueFats");
        z65.h(str10, "foodValueProteins");
        z65.h(str11, "foodValueCarbohydrates");
        z65.h(str12, "foodValueKiloCalories");
        z65.h(str13, "foodValueWeight");
        z65.h(str14, MessageAttributes.TYPE);
        z65.h(str15, "portion");
        z65.h(str16, "weight");
        z65.h(k0Var3, "components");
        z65.h(str17, "metaProductId");
        z65.h(k0Var4, "comboTemplatesSlots");
        z65.h(k0Var5, "toppings");
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$name(str2);
        realmSet$category(str3);
        realmSet$description(str4);
        realmSet$allergens(str5);
        realmSet$allergensCanContain(str6);
        realmSet$ingredients(k0Var);
        realmSet$images(k0Var2);
        realmSet$sizeMeasure(str7);
        realmSet$sizeValue(str8);
        realmSet$foodValueFats(str9);
        realmSet$foodValueProteins(str10);
        realmSet$foodValueCarbohydrates(str11);
        realmSet$foodValueKiloCalories(str12);
        realmSet$foodValueWeight(str13);
        realmSet$type(str14);
        realmSet$doughType(doughTypeEntity);
        realmSet$sizeGroup(sizeGroupEntity);
        realmSet$portion(str15);
        realmSet$weight(str16);
        realmSet$components(k0Var3);
        realmSet$metaProductId(str17);
        realmSet$comboTemplatesSlots(k0Var4);
        realmSet$toppings(k0Var5);
    }
}
