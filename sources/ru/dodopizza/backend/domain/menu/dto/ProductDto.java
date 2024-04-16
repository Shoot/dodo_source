package ru.dodopizza.backend.domain.menu.dto;

import ch.qos.logback.core.joran.action.Action;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ProductDto.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BË\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0010\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001eJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u000eHÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010HÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0010HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J÷\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00102\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u00020PHÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 ¨\u0006R"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/ProductDto;", "", "id", "", Action.NAME_ATTRIBUTE, "pizzaId", MessageAttributes.TYPE, "size", "Lru/dodopizza/backend/domain/menu/dto/PizzaSizeDto;", "category", "sizeGroup", "allergens", "description", "foodValue", "Lru/dodopizza/backend/domain/menu/dto/FoodValueDto;", "ingredients", "", "Lru/dodopizza/backend/domain/menu/dto/IngredientDto;", "allergensCanContain", "toppings", "Lru/dodopizza/backend/domain/menu/dto/ToppingDto;", "images", "Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "productIds", "weight", "dough", "comboTemplateSlots", "Lru/dodopizza/backend/domain/menu/dto/ComboTemplateSlotDto;", "sizeSchemeId", "doughSchemeId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/menu/dto/PizzaSizeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/dodopizza/backend/domain/menu/dto/FoodValueDto;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAllergens", "()Ljava/lang/String;", "getAllergensCanContain", "getCategory", "getComboTemplateSlots", "()Ljava/util/List;", "getDescription", "getDough", "getDoughSchemeId", "getFoodValue", "()Lru/dodopizza/backend/domain/menu/dto/FoodValueDto;", "getId", "getImages", "getIngredients", "getName", "getPizzaId", "getProductIds", "getSize", "()Lru/dodopizza/backend/domain/menu/dto/PizzaSizeDto;", "getSizeGroup", "getSizeSchemeId", "getToppings", "getType", "getWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDto {
    @uca("allergens")
    private final String allergens;
    @uca("allergensCanContain")
    private final String allergensCanContain;
    @uca("category")
    private final String category;
    @uca("slots")
    private final List<ComboTemplateSlotDto> comboTemplateSlots;
    @uca("description")
    private final String description;
    @uca("dough")
    private final String dough;
    @uca("doughSchemeId")
    private final String doughSchemeId;
    @uca("foodValue")
    private final FoodValueDto foodValue;
    @uca("id")
    private final String id;
    @uca("images")
    private final List<ProductImageDto> images;
    @uca("ingredients")
    private final List<IngredientDto> ingredients;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("pizzaId")
    private final String pizzaId;
    @uca("productIds")
    private final List<String> productIds;
    @uca("size")
    private final PizzaSizeDto size;
    @uca("sizeGroup")
    private final String sizeGroup;
    @uca("sizeSchemeId")
    private final String sizeSchemeId;
    @uca("toppings")
    private final List<ToppingDto> toppings;
    @uca(MessageAttributes.TYPE)
    private final String type;
    @uca("weight")
    private final String weight;

    public ProductDto(String str, String str2, String str3, String str4, PizzaSizeDto pizzaSizeDto, String str5, String str6, String str7, String str8, FoodValueDto foodValueDto, List<IngredientDto> list, String str9, List<ToppingDto> list2, List<ProductImageDto> list3, List<String> list4, String str10, String str11, List<ComboTemplateSlotDto> list5, String str12, String str13) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "pizzaId");
        z65.h(str4, MessageAttributes.TYPE);
        z65.h(pizzaSizeDto, "size");
        z65.h(str5, "category");
        z65.h(str7, "allergens");
        z65.h(str8, "description");
        z65.h(foodValueDto, "foodValue");
        z65.h(list, "ingredients");
        z65.h(str9, "allergensCanContain");
        z65.h(list2, "toppings");
        z65.h(list3, "images");
        z65.h(list4, "productIds");
        z65.h(str10, "weight");
        z65.h(list5, "comboTemplateSlots");
        this.id = str;
        this.name = str2;
        this.pizzaId = str3;
        this.type = str4;
        this.size = pizzaSizeDto;
        this.category = str5;
        this.sizeGroup = str6;
        this.allergens = str7;
        this.description = str8;
        this.foodValue = foodValueDto;
        this.ingredients = list;
        this.allergensCanContain = str9;
        this.toppings = list2;
        this.images = list3;
        this.productIds = list4;
        this.weight = str10;
        this.dough = str11;
        this.comboTemplateSlots = list5;
        this.sizeSchemeId = str12;
        this.doughSchemeId = str13;
    }

    public final String component1() {
        return this.id;
    }

    public final FoodValueDto component10() {
        return this.foodValue;
    }

    public final List<IngredientDto> component11() {
        return this.ingredients;
    }

    public final String component12() {
        return this.allergensCanContain;
    }

    public final List<ToppingDto> component13() {
        return this.toppings;
    }

    public final List<ProductImageDto> component14() {
        return this.images;
    }

    public final List<String> component15() {
        return this.productIds;
    }

    public final String component16() {
        return this.weight;
    }

    public final String component17() {
        return this.dough;
    }

    public final List<ComboTemplateSlotDto> component18() {
        return this.comboTemplateSlots;
    }

    public final String component19() {
        return this.sizeSchemeId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component20() {
        return this.doughSchemeId;
    }

    public final String component3() {
        return this.pizzaId;
    }

    public final String component4() {
        return this.type;
    }

    public final PizzaSizeDto component5() {
        return this.size;
    }

    public final String component6() {
        return this.category;
    }

    public final String component7() {
        return this.sizeGroup;
    }

    public final String component8() {
        return this.allergens;
    }

    public final String component9() {
        return this.description;
    }

    public final ProductDto copy(String str, String str2, String str3, String str4, PizzaSizeDto pizzaSizeDto, String str5, String str6, String str7, String str8, FoodValueDto foodValueDto, List<IngredientDto> list, String str9, List<ToppingDto> list2, List<ProductImageDto> list3, List<String> list4, String str10, String str11, List<ComboTemplateSlotDto> list5, String str12, String str13) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "pizzaId");
        z65.h(str4, MessageAttributes.TYPE);
        z65.h(pizzaSizeDto, "size");
        z65.h(str5, "category");
        z65.h(str7, "allergens");
        z65.h(str8, "description");
        z65.h(foodValueDto, "foodValue");
        z65.h(list, "ingredients");
        z65.h(str9, "allergensCanContain");
        z65.h(list2, "toppings");
        z65.h(list3, "images");
        z65.h(list4, "productIds");
        z65.h(str10, "weight");
        z65.h(list5, "comboTemplateSlots");
        return new ProductDto(str, str2, str3, str4, pizzaSizeDto, str5, str6, str7, str8, foodValueDto, list, str9, list2, list3, list4, str10, str11, list5, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDto)) {
            return false;
        }
        ProductDto productDto = (ProductDto) obj;
        if (z65.c(this.id, productDto.id) && z65.c(this.name, productDto.name) && z65.c(this.pizzaId, productDto.pizzaId) && z65.c(this.type, productDto.type) && z65.c(this.size, productDto.size) && z65.c(this.category, productDto.category) && z65.c(this.sizeGroup, productDto.sizeGroup) && z65.c(this.allergens, productDto.allergens) && z65.c(this.description, productDto.description) && z65.c(this.foodValue, productDto.foodValue) && z65.c(this.ingredients, productDto.ingredients) && z65.c(this.allergensCanContain, productDto.allergensCanContain) && z65.c(this.toppings, productDto.toppings) && z65.c(this.images, productDto.images) && z65.c(this.productIds, productDto.productIds) && z65.c(this.weight, productDto.weight) && z65.c(this.dough, productDto.dough) && z65.c(this.comboTemplateSlots, productDto.comboTemplateSlots) && z65.c(this.sizeSchemeId, productDto.sizeSchemeId) && z65.c(this.doughSchemeId, productDto.doughSchemeId)) {
            return true;
        }
        return false;
    }

    public final String getAllergens() {
        return this.allergens;
    }

    public final String getAllergensCanContain() {
        return this.allergensCanContain;
    }

    public final String getCategory() {
        return this.category;
    }

    public final List<ComboTemplateSlotDto> getComboTemplateSlots() {
        return this.comboTemplateSlots;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDough() {
        return this.dough;
    }

    public final String getDoughSchemeId() {
        return this.doughSchemeId;
    }

    public final FoodValueDto getFoodValue() {
        return this.foodValue;
    }

    public final String getId() {
        return this.id;
    }

    public final List<ProductImageDto> getImages() {
        return this.images;
    }

    public final List<IngredientDto> getIngredients() {
        return this.ingredients;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPizzaId() {
        return this.pizzaId;
    }

    public final List<String> getProductIds() {
        return this.productIds;
    }

    public final PizzaSizeDto getSize() {
        return this.size;
    }

    public final String getSizeGroup() {
        return this.sizeGroup;
    }

    public final String getSizeSchemeId() {
        return this.sizeSchemeId;
    }

    public final List<ToppingDto> getToppings() {
        return this.toppings;
    }

    public final String getType() {
        return this.type;
    }

    public final String getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.pizzaId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.size.hashCode()) * 31) + this.category.hashCode()) * 31;
        String str = this.sizeGroup;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (((((((((((((((((((hashCode4 + hashCode) * 31) + this.allergens.hashCode()) * 31) + this.description.hashCode()) * 31) + this.foodValue.hashCode()) * 31) + this.ingredients.hashCode()) * 31) + this.allergensCanContain.hashCode()) * 31) + this.toppings.hashCode()) * 31) + this.images.hashCode()) * 31) + this.productIds.hashCode()) * 31) + this.weight.hashCode()) * 31;
        String str2 = this.dough;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode2) * 31) + this.comboTemplateSlots.hashCode()) * 31;
        String str3 = this.sizeSchemeId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i2 = (hashCode6 + hashCode3) * 31;
        String str4 = this.doughSchemeId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.pizzaId;
        String str4 = this.type;
        PizzaSizeDto pizzaSizeDto = this.size;
        String str5 = this.category;
        String str6 = this.sizeGroup;
        String str7 = this.allergens;
        String str8 = this.description;
        FoodValueDto foodValueDto = this.foodValue;
        List<IngredientDto> list = this.ingredients;
        String str9 = this.allergensCanContain;
        List<ToppingDto> list2 = this.toppings;
        List<ProductImageDto> list3 = this.images;
        List<String> list4 = this.productIds;
        String str10 = this.weight;
        String str11 = this.dough;
        List<ComboTemplateSlotDto> list5 = this.comboTemplateSlots;
        String str12 = this.sizeSchemeId;
        String str13 = this.doughSchemeId;
        return "ProductDto(id=" + str + ", name=" + str2 + ", pizzaId=" + str3 + ", type=" + str4 + ", size=" + pizzaSizeDto + ", category=" + str5 + ", sizeGroup=" + str6 + ", allergens=" + str7 + ", description=" + str8 + ", foodValue=" + foodValueDto + ", ingredients=" + list + ", allergensCanContain=" + str9 + ", toppings=" + list2 + ", images=" + list3 + ", productIds=" + list4 + ", weight=" + str10 + ", dough=" + str11 + ", comboTemplateSlots=" + list5 + ", sizeSchemeId=" + str12 + ", doughSchemeId=" + str13 + ")";
    }
}
