package ru.dodopizza.backend.domain.menu.dtov5;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper;
/* compiled from: ProductDtoV5.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\u000e\u0012\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\u000e\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000b\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e¢\u0006\u0002\u0010\u001dJ\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0015\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\u000eHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bHÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00180\u000bHÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000bHÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000eHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0015\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\u000eHÆ\u0003J\u0015\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\u000eHÆ\u0003Jã\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\u000e2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\u000e2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000b2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000eHÆ\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\"\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!¨\u0006G"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/ProductDtoV5;", "", "id", "", "metaProductId", Action.NAME_ATTRIBUTE, "size", "sizeName", "price", "", "foodValue", "Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "Lru/dodopizza/backend/domain/menu/dtov5/FoodValueDtoV5;", "ingredientGroups", "", "Lru/dodopizza/backend/domain/menu/dtov5/IngredientGroupDtoV5;", "packageGroups", "Lru/dodopizza/backend/domain/menu/dtov5/PackageGroupDtoV5;", "images", "Lru/dodopizza/backend/domain/menu/dtov5/ImageDtoV5;", "description", "traits", "Lru/dodopizza/backend/domain/menu/dtov5/TraitDtoV5;", "allergyAdvice", "Lru/dodopizza/backend/domain/menu/dtov5/AllergyAdviceDtoV5;", "saleTime", "Lru/dodopizza/backend/domain/menu/dtov5/SaleTimeDtoV5;", "additionalData", "Lru/dodopizza/backend/domain/menu/dtov5/AdditionalDataDtoV5;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;Ljava/util/List;)V", "getAdditionalData", "()Ljava/util/List;", "getAllergyAdvice", "()Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "getDescription", "()Ljava/lang/String;", "getFoodValue", "getId", "getImages", "getIngredientGroups", "getMetaProductId", "getName", "getPackageGroups", "getPrice", "()D", "getSaleTime", "getSize", "getSizeName", "getTraits", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDtoV5 {
    @uca("additionalData")
    private final List<AdditionalDataDtoV5> additionalData;
    @uca("allergyAdvice")
    private final ReferenceWrapper<AllergyAdviceDtoV5> allergyAdvice;
    @uca("description")
    private final String description;
    @uca("foodValue")
    private final ReferenceWrapper<FoodValueDtoV5> foodValue;
    @uca("id")
    private final String id;
    @uca("images")
    private final List<ReferenceWrapper<ImageDtoV5>> images;
    @uca("ingredientGroups")
    private final List<ReferenceWrapper<IngredientGroupDtoV5>> ingredientGroups;
    @uca("metaProductId")
    private final String metaProductId;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("packageGroups")
    private final List<ReferenceWrapper<PackageGroupDtoV5>> packageGroups;
    @uca("price")
    private final double price;
    @uca("saleTime")
    private final ReferenceWrapper<SaleTimeDtoV5> saleTime;
    @uca("size")
    private final String size;
    @uca("sizeName")
    private final String sizeName;
    @uca("traits")
    private final ReferenceWrapper<TraitDtoV5> traits;

    public ProductDtoV5(String str, String str2, String str3, String str4, String str5, double d, ReferenceWrapper<FoodValueDtoV5> referenceWrapper, List<ReferenceWrapper<IngredientGroupDtoV5>> list, List<ReferenceWrapper<PackageGroupDtoV5>> list2, List<ReferenceWrapper<ImageDtoV5>> list3, String str6, ReferenceWrapper<TraitDtoV5> referenceWrapper2, ReferenceWrapper<AllergyAdviceDtoV5> referenceWrapper3, ReferenceWrapper<SaleTimeDtoV5> referenceWrapper4, List<AdditionalDataDtoV5> list4) {
        z65.h(str, "id");
        z65.h(str2, "metaProductId");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        z65.h(str4, "size");
        z65.h(str5, "sizeName");
        z65.h(referenceWrapper, "foodValue");
        z65.h(list, "ingredientGroups");
        z65.h(list2, "packageGroups");
        z65.h(list3, "images");
        z65.h(str6, "description");
        z65.h(referenceWrapper2, "traits");
        z65.h(referenceWrapper3, "allergyAdvice");
        z65.h(list4, "additionalData");
        this.id = str;
        this.metaProductId = str2;
        this.name = str3;
        this.size = str4;
        this.sizeName = str5;
        this.price = d;
        this.foodValue = referenceWrapper;
        this.ingredientGroups = list;
        this.packageGroups = list2;
        this.images = list3;
        this.description = str6;
        this.traits = referenceWrapper2;
        this.allergyAdvice = referenceWrapper3;
        this.saleTime = referenceWrapper4;
        this.additionalData = list4;
    }

    public final String component1() {
        return this.id;
    }

    public final List<ReferenceWrapper<ImageDtoV5>> component10() {
        return this.images;
    }

    public final String component11() {
        return this.description;
    }

    public final ReferenceWrapper<TraitDtoV5> component12() {
        return this.traits;
    }

    public final ReferenceWrapper<AllergyAdviceDtoV5> component13() {
        return this.allergyAdvice;
    }

    public final ReferenceWrapper<SaleTimeDtoV5> component14() {
        return this.saleTime;
    }

    public final List<AdditionalDataDtoV5> component15() {
        return this.additionalData;
    }

    public final String component2() {
        return this.metaProductId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.size;
    }

    public final String component5() {
        return this.sizeName;
    }

    public final double component6() {
        return this.price;
    }

    public final ReferenceWrapper<FoodValueDtoV5> component7() {
        return this.foodValue;
    }

    public final List<ReferenceWrapper<IngredientGroupDtoV5>> component8() {
        return this.ingredientGroups;
    }

    public final List<ReferenceWrapper<PackageGroupDtoV5>> component9() {
        return this.packageGroups;
    }

    public final ProductDtoV5 copy(String str, String str2, String str3, String str4, String str5, double d, ReferenceWrapper<FoodValueDtoV5> referenceWrapper, List<ReferenceWrapper<IngredientGroupDtoV5>> list, List<ReferenceWrapper<PackageGroupDtoV5>> list2, List<ReferenceWrapper<ImageDtoV5>> list3, String str6, ReferenceWrapper<TraitDtoV5> referenceWrapper2, ReferenceWrapper<AllergyAdviceDtoV5> referenceWrapper3, ReferenceWrapper<SaleTimeDtoV5> referenceWrapper4, List<AdditionalDataDtoV5> list4) {
        z65.h(str, "id");
        z65.h(str2, "metaProductId");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        z65.h(str4, "size");
        z65.h(str5, "sizeName");
        z65.h(referenceWrapper, "foodValue");
        z65.h(list, "ingredientGroups");
        z65.h(list2, "packageGroups");
        z65.h(list3, "images");
        z65.h(str6, "description");
        z65.h(referenceWrapper2, "traits");
        z65.h(referenceWrapper3, "allergyAdvice");
        z65.h(list4, "additionalData");
        return new ProductDtoV5(str, str2, str3, str4, str5, d, referenceWrapper, list, list2, list3, str6, referenceWrapper2, referenceWrapper3, referenceWrapper4, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDtoV5)) {
            return false;
        }
        ProductDtoV5 productDtoV5 = (ProductDtoV5) obj;
        if (z65.c(this.id, productDtoV5.id) && z65.c(this.metaProductId, productDtoV5.metaProductId) && z65.c(this.name, productDtoV5.name) && z65.c(this.size, productDtoV5.size) && z65.c(this.sizeName, productDtoV5.sizeName) && Double.compare(this.price, productDtoV5.price) == 0 && z65.c(this.foodValue, productDtoV5.foodValue) && z65.c(this.ingredientGroups, productDtoV5.ingredientGroups) && z65.c(this.packageGroups, productDtoV5.packageGroups) && z65.c(this.images, productDtoV5.images) && z65.c(this.description, productDtoV5.description) && z65.c(this.traits, productDtoV5.traits) && z65.c(this.allergyAdvice, productDtoV5.allergyAdvice) && z65.c(this.saleTime, productDtoV5.saleTime) && z65.c(this.additionalData, productDtoV5.additionalData)) {
            return true;
        }
        return false;
    }

    public final List<AdditionalDataDtoV5> getAdditionalData() {
        return this.additionalData;
    }

    public final ReferenceWrapper<AllergyAdviceDtoV5> getAllergyAdvice() {
        return this.allergyAdvice;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ReferenceWrapper<FoodValueDtoV5> getFoodValue() {
        return this.foodValue;
    }

    public final String getId() {
        return this.id;
    }

    public final List<ReferenceWrapper<ImageDtoV5>> getImages() {
        return this.images;
    }

    public final List<ReferenceWrapper<IngredientGroupDtoV5>> getIngredientGroups() {
        return this.ingredientGroups;
    }

    public final String getMetaProductId() {
        return this.metaProductId;
    }

    public final String getName() {
        return this.name;
    }

    public final List<ReferenceWrapper<PackageGroupDtoV5>> getPackageGroups() {
        return this.packageGroups;
    }

    public final double getPrice() {
        return this.price;
    }

    public final ReferenceWrapper<SaleTimeDtoV5> getSaleTime() {
        return this.saleTime;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getSizeName() {
        return this.sizeName;
    }

    public final ReferenceWrapper<TraitDtoV5> getTraits() {
        return this.traits;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((((((((((((this.id.hashCode() * 31) + this.metaProductId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.size.hashCode()) * 31) + this.sizeName.hashCode()) * 31) + nkb.a(this.price)) * 31) + this.foodValue.hashCode()) * 31) + this.ingredientGroups.hashCode()) * 31) + this.packageGroups.hashCode()) * 31) + this.images.hashCode()) * 31) + this.description.hashCode()) * 31) + this.traits.hashCode()) * 31) + this.allergyAdvice.hashCode()) * 31;
        ReferenceWrapper<SaleTimeDtoV5> referenceWrapper = this.saleTime;
        if (referenceWrapper == null) {
            hashCode = 0;
        } else {
            hashCode = referenceWrapper.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.additionalData.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.metaProductId;
        String str3 = this.name;
        String str4 = this.size;
        String str5 = this.sizeName;
        double d = this.price;
        ReferenceWrapper<FoodValueDtoV5> referenceWrapper = this.foodValue;
        List<ReferenceWrapper<IngredientGroupDtoV5>> list = this.ingredientGroups;
        List<ReferenceWrapper<PackageGroupDtoV5>> list2 = this.packageGroups;
        List<ReferenceWrapper<ImageDtoV5>> list3 = this.images;
        String str6 = this.description;
        ReferenceWrapper<TraitDtoV5> referenceWrapper2 = this.traits;
        ReferenceWrapper<AllergyAdviceDtoV5> referenceWrapper3 = this.allergyAdvice;
        ReferenceWrapper<SaleTimeDtoV5> referenceWrapper4 = this.saleTime;
        List<AdditionalDataDtoV5> list4 = this.additionalData;
        return "ProductDtoV5(id=" + str + ", metaProductId=" + str2 + ", name=" + str3 + ", size=" + str4 + ", sizeName=" + str5 + ", price=" + d + ", foodValue=" + referenceWrapper + ", ingredientGroups=" + list + ", packageGroups=" + list2 + ", images=" + list3 + ", description=" + str6 + ", traits=" + referenceWrapper2 + ", allergyAdvice=" + referenceWrapper3 + ", saleTime=" + referenceWrapper4 + ", additionalData=" + list4 + ")";
    }
}
