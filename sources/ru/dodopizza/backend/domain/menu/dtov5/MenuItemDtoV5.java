package ru.dodopizza.backend.domain.menu.dtov5;

import ch.qos.logback.core.joran.action.Action;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper;
/* compiled from: MenuItemDtoV5.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b0\u0007\u0012\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u0007\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007¢\u0006\u0002\u0010\u0017J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u0015\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u0007HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0015\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010#J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\bHÆ\u0003J\u0015\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b0\u0007HÆ\u0003J²\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\b2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b0\u00072\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u00072\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u000bHÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\"\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019¨\u0006<"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/MenuItemDtoV5;", "", "id", "", Action.NAME_ATTRIBUTE, "description", "images", "", "Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "Lru/dodopizza/backend/domain/menu/dtov5/ImageDtoV5;", "maxCountPerOrder", "", MessageAttributes.TYPE, "price", "", "saleTime", "Lru/dodopizza/backend/domain/menu/dtov5/SaleTimeDtoV5;", "slots", "Lru/dodopizza/backend/domain/menu/dtov5/ComboTemplateSlotDtoV5;", "variations", "Lru/dodopizza/backend/domain/menu/dtov5/VariationDtoV5;", "additionalData", "Lru/dodopizza/backend/domain/menu/dtov5/AdditionalDataDtoV5;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAdditionalData", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getId", "getImages", "getMaxCountPerOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSaleTime", "()Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "getSlots", "getType", "getVariations", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lru/dodopizza/backend/domain/menu/dtov5/MenuItemDtoV5;", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MenuItemDtoV5 {
    @uca("additionalData")
    private final List<AdditionalDataDtoV5> additionalData;
    @uca("description")
    private final String description;
    @uca("id")
    private final String id;
    @uca("images")
    private final List<ReferenceWrapper<ImageDtoV5>> images;
    @uca("maxCountPerOrder")
    private final Integer maxCountPerOrder;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("price")
    private final Double price;
    @uca("saleTime")
    private final ReferenceWrapper<SaleTimeDtoV5> saleTime;
    @uca("slots")
    private final List<ReferenceWrapper<ComboTemplateSlotDtoV5>> slots;
    @uca(MessageAttributes.TYPE)
    private final String type;
    @uca("variations")
    private final List<ReferenceWrapper<VariationDtoV5>> variations;

    public MenuItemDtoV5(String str, String str2, String str3, List<ReferenceWrapper<ImageDtoV5>> list, Integer num, String str4, Double d, ReferenceWrapper<SaleTimeDtoV5> referenceWrapper, List<ReferenceWrapper<ComboTemplateSlotDtoV5>> list2, List<ReferenceWrapper<VariationDtoV5>> list3, List<AdditionalDataDtoV5> list4) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "description");
        z65.h(list, "images");
        z65.h(str4, MessageAttributes.TYPE);
        z65.h(list2, "slots");
        z65.h(list3, "variations");
        z65.h(list4, "additionalData");
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.images = list;
        this.maxCountPerOrder = num;
        this.type = str4;
        this.price = d;
        this.saleTime = referenceWrapper;
        this.slots = list2;
        this.variations = list3;
        this.additionalData = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenuItemDtoV5 copy$default(MenuItemDtoV5 menuItemDtoV5, String str, String str2, String str3, List list, Integer num, String str4, Double d, ReferenceWrapper referenceWrapper, List list2, List list3, List list4, int i, Object obj) {
        String str5;
        String str6;
        String str7;
        List<ReferenceWrapper<ImageDtoV5>> list5;
        Integer num2;
        String str8;
        Double d2;
        ReferenceWrapper<SaleTimeDtoV5> referenceWrapper2;
        List<ReferenceWrapper<ComboTemplateSlotDtoV5>> list6;
        List<ReferenceWrapper<VariationDtoV5>> list7;
        List<AdditionalDataDtoV5> list8;
        if ((i & 1) != 0) {
            str5 = menuItemDtoV5.id;
        } else {
            str5 = str;
        }
        if ((i & 2) != 0) {
            str6 = menuItemDtoV5.name;
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            str7 = menuItemDtoV5.description;
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            list5 = menuItemDtoV5.images;
        } else {
            list5 = list;
        }
        if ((i & 16) != 0) {
            num2 = menuItemDtoV5.maxCountPerOrder;
        } else {
            num2 = num;
        }
        if ((i & 32) != 0) {
            str8 = menuItemDtoV5.type;
        } else {
            str8 = str4;
        }
        if ((i & 64) != 0) {
            d2 = menuItemDtoV5.price;
        } else {
            d2 = d;
        }
        if ((i & 128) != 0) {
            referenceWrapper2 = menuItemDtoV5.saleTime;
        } else {
            referenceWrapper2 = referenceWrapper;
        }
        if ((i & 256) != 0) {
            list6 = menuItemDtoV5.slots;
        } else {
            list6 = list2;
        }
        if ((i & 512) != 0) {
            list7 = menuItemDtoV5.variations;
        } else {
            list7 = list3;
        }
        if ((i & 1024) != 0) {
            list8 = menuItemDtoV5.additionalData;
        } else {
            list8 = list4;
        }
        return menuItemDtoV5.copy(str5, str6, str7, list5, num2, str8, d2, referenceWrapper2, list6, list7, list8);
    }

    public final String component1() {
        return this.id;
    }

    public final List<ReferenceWrapper<VariationDtoV5>> component10() {
        return this.variations;
    }

    public final List<AdditionalDataDtoV5> component11() {
        return this.additionalData;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final List<ReferenceWrapper<ImageDtoV5>> component4() {
        return this.images;
    }

    public final Integer component5() {
        return this.maxCountPerOrder;
    }

    public final String component6() {
        return this.type;
    }

    public final Double component7() {
        return this.price;
    }

    public final ReferenceWrapper<SaleTimeDtoV5> component8() {
        return this.saleTime;
    }

    public final List<ReferenceWrapper<ComboTemplateSlotDtoV5>> component9() {
        return this.slots;
    }

    public final MenuItemDtoV5 copy(String str, String str2, String str3, List<ReferenceWrapper<ImageDtoV5>> list, Integer num, String str4, Double d, ReferenceWrapper<SaleTimeDtoV5> referenceWrapper, List<ReferenceWrapper<ComboTemplateSlotDtoV5>> list2, List<ReferenceWrapper<VariationDtoV5>> list3, List<AdditionalDataDtoV5> list4) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "description");
        z65.h(list, "images");
        z65.h(str4, MessageAttributes.TYPE);
        z65.h(list2, "slots");
        z65.h(list3, "variations");
        z65.h(list4, "additionalData");
        return new MenuItemDtoV5(str, str2, str3, list, num, str4, d, referenceWrapper, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuItemDtoV5)) {
            return false;
        }
        MenuItemDtoV5 menuItemDtoV5 = (MenuItemDtoV5) obj;
        if (z65.c(this.id, menuItemDtoV5.id) && z65.c(this.name, menuItemDtoV5.name) && z65.c(this.description, menuItemDtoV5.description) && z65.c(this.images, menuItemDtoV5.images) && z65.c(this.maxCountPerOrder, menuItemDtoV5.maxCountPerOrder) && z65.c(this.type, menuItemDtoV5.type) && z65.c(this.price, menuItemDtoV5.price) && z65.c(this.saleTime, menuItemDtoV5.saleTime) && z65.c(this.slots, menuItemDtoV5.slots) && z65.c(this.variations, menuItemDtoV5.variations) && z65.c(this.additionalData, menuItemDtoV5.additionalData)) {
            return true;
        }
        return false;
    }

    public final List<AdditionalDataDtoV5> getAdditionalData() {
        return this.additionalData;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final List<ReferenceWrapper<ImageDtoV5>> getImages() {
        return this.images;
    }

    public final Integer getMaxCountPerOrder() {
        return this.maxCountPerOrder;
    }

    public final String getName() {
        return this.name;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final ReferenceWrapper<SaleTimeDtoV5> getSaleTime() {
        return this.saleTime;
    }

    public final List<ReferenceWrapper<ComboTemplateSlotDtoV5>> getSlots() {
        return this.slots;
    }

    public final String getType() {
        return this.type;
    }

    public final List<ReferenceWrapper<VariationDtoV5>> getVariations() {
        return this.variations;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.images.hashCode()) * 31;
        Integer num = this.maxCountPerOrder;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode4 = (((hashCode3 + hashCode) * 31) + this.type.hashCode()) * 31;
        Double d = this.price;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i2 = (hashCode4 + hashCode2) * 31;
        ReferenceWrapper<SaleTimeDtoV5> referenceWrapper = this.saleTime;
        if (referenceWrapper != null) {
            i = referenceWrapper.hashCode();
        }
        return ((((((i2 + i) * 31) + this.slots.hashCode()) * 31) + this.variations.hashCode()) * 31) + this.additionalData.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.description;
        List<ReferenceWrapper<ImageDtoV5>> list = this.images;
        Integer num = this.maxCountPerOrder;
        String str4 = this.type;
        Double d = this.price;
        ReferenceWrapper<SaleTimeDtoV5> referenceWrapper = this.saleTime;
        List<ReferenceWrapper<ComboTemplateSlotDtoV5>> list2 = this.slots;
        List<ReferenceWrapper<VariationDtoV5>> list3 = this.variations;
        List<AdditionalDataDtoV5> list4 = this.additionalData;
        return "MenuItemDtoV5(id=" + str + ", name=" + str2 + ", description=" + str3 + ", images=" + list + ", maxCountPerOrder=" + num + ", type=" + str4 + ", price=" + d + ", saleTime=" + referenceWrapper + ", slots=" + list2 + ", variations=" + list3 + ", additionalData=" + list4 + ")";
    }
}
