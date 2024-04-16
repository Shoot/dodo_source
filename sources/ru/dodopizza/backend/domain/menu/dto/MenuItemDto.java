package ru.dodopizza.backend.domain.menu.dto;

import ch.qos.logback.core.joran.action.Action;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MenuItemDto.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\u0002\u0010\u0017J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J¥\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\bHÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006>"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/MenuItemDto;", "", "id", "", "forwardCompatibilityId", Action.NAME_ATTRIBUTE, "description", "priority", "", MessageAttributes.TYPE, "Lru/dodopizza/backend/domain/menu/dto/MenuItemTypeDto;", "category", ElementGenerator.TYPE_IMAGE, "Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "shoppingItems", "", "Lru/dodopizza/backend/domain/menu/dto/ShoppingItemDto;", "customShoppingItems", "Lru/dodopizza/backend/domain/menu/dto/CustomShoppingItemDto;", "size", "Lru/dodopizza/backend/domain/menu/dto/PizzaSizeDto;", "menuCategoryId", "subMenuCategoryIds", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILru/dodopizza/backend/domain/menu/dto/MenuItemTypeDto;Ljava/lang/String;Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;Ljava/util/List;Ljava/util/List;Lru/dodopizza/backend/domain/menu/dto/PizzaSizeDto;Ljava/lang/String;Ljava/util/List;)V", "getCategory", "()Ljava/lang/String;", "getCustomShoppingItems", "()Ljava/util/List;", "getDescription", "getForwardCompatibilityId", "getId", "getImage", "()Lru/dodopizza/backend/domain/menu/dto/ProductImageDto;", "getMenuCategoryId", "getName", "getPriority", "()I", "getShoppingItems", "getSize", "()Lru/dodopizza/backend/domain/menu/dto/PizzaSizeDto;", "getSubMenuCategoryIds", "getType", "()Lru/dodopizza/backend/domain/menu/dto/MenuItemTypeDto;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MenuItemDto {
    @uca("category")
    private final String category;
    @uca("customShoppingItems")
    private final List<CustomShoppingItemDto> customShoppingItems;
    @uca("description")
    private final String description;
    @uca("forwardCompatibilityId")
    private final String forwardCompatibilityId;
    @uca("id")
    private final String id;
    @uca(ElementGenerator.TYPE_IMAGE)
    private final ProductImageDto image;
    @uca("menuCategoryId")
    private final String menuCategoryId;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("priority")
    private final int priority;
    @uca("shoppingItems")
    private final List<ShoppingItemDto> shoppingItems;
    @uca("size")
    private final PizzaSizeDto size;
    @uca("subMenuCategoryIds")
    private final List<String> subMenuCategoryIds;
    @uca(MessageAttributes.TYPE)
    private final MenuItemTypeDto type;

    public MenuItemDto(String str, String str2, String str3, String str4, int i, MenuItemTypeDto menuItemTypeDto, String str5, ProductImageDto productImageDto, List<ShoppingItemDto> list, List<CustomShoppingItemDto> list2, PizzaSizeDto pizzaSizeDto, String str6, List<String> list3) {
        z65.h(str, "id");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        z65.h(str4, "description");
        z65.h(menuItemTypeDto, MessageAttributes.TYPE);
        z65.h(str5, "category");
        z65.h(list, "shoppingItems");
        z65.h(list2, "customShoppingItems");
        z65.h(str6, "menuCategoryId");
        this.id = str;
        this.forwardCompatibilityId = str2;
        this.name = str3;
        this.description = str4;
        this.priority = i;
        this.type = menuItemTypeDto;
        this.category = str5;
        this.image = productImageDto;
        this.shoppingItems = list;
        this.customShoppingItems = list2;
        this.size = pizzaSizeDto;
        this.menuCategoryId = str6;
        this.subMenuCategoryIds = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenuItemDto copy$default(MenuItemDto menuItemDto, String str, String str2, String str3, String str4, int i, MenuItemTypeDto menuItemTypeDto, String str5, ProductImageDto productImageDto, List list, List list2, PizzaSizeDto pizzaSizeDto, String str6, List list3, int i2, Object obj) {
        String str7;
        String str8;
        String str9;
        String str10;
        int i3;
        MenuItemTypeDto menuItemTypeDto2;
        String str11;
        ProductImageDto productImageDto2;
        List<ShoppingItemDto> list4;
        List<CustomShoppingItemDto> list5;
        PizzaSizeDto pizzaSizeDto2;
        String str12;
        List<String> list6;
        if ((i2 & 1) != 0) {
            str7 = menuItemDto.id;
        } else {
            str7 = str;
        }
        if ((i2 & 2) != 0) {
            str8 = menuItemDto.forwardCompatibilityId;
        } else {
            str8 = str2;
        }
        if ((i2 & 4) != 0) {
            str9 = menuItemDto.name;
        } else {
            str9 = str3;
        }
        if ((i2 & 8) != 0) {
            str10 = menuItemDto.description;
        } else {
            str10 = str4;
        }
        if ((i2 & 16) != 0) {
            i3 = menuItemDto.priority;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            menuItemTypeDto2 = menuItemDto.type;
        } else {
            menuItemTypeDto2 = menuItemTypeDto;
        }
        if ((i2 & 64) != 0) {
            str11 = menuItemDto.category;
        } else {
            str11 = str5;
        }
        if ((i2 & 128) != 0) {
            productImageDto2 = menuItemDto.image;
        } else {
            productImageDto2 = productImageDto;
        }
        if ((i2 & 256) != 0) {
            list4 = menuItemDto.shoppingItems;
        } else {
            list4 = list;
        }
        if ((i2 & 512) != 0) {
            list5 = menuItemDto.customShoppingItems;
        } else {
            list5 = list2;
        }
        if ((i2 & 1024) != 0) {
            pizzaSizeDto2 = menuItemDto.size;
        } else {
            pizzaSizeDto2 = pizzaSizeDto;
        }
        if ((i2 & 2048) != 0) {
            str12 = menuItemDto.menuCategoryId;
        } else {
            str12 = str6;
        }
        if ((i2 & 4096) != 0) {
            list6 = menuItemDto.subMenuCategoryIds;
        } else {
            list6 = list3;
        }
        return menuItemDto.copy(str7, str8, str9, str10, i3, menuItemTypeDto2, str11, productImageDto2, list4, list5, pizzaSizeDto2, str12, list6);
    }

    public final String component1() {
        return this.id;
    }

    public final List<CustomShoppingItemDto> component10() {
        return this.customShoppingItems;
    }

    public final PizzaSizeDto component11() {
        return this.size;
    }

    public final String component12() {
        return this.menuCategoryId;
    }

    public final List<String> component13() {
        return this.subMenuCategoryIds;
    }

    public final String component2() {
        return this.forwardCompatibilityId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.description;
    }

    public final int component5() {
        return this.priority;
    }

    public final MenuItemTypeDto component6() {
        return this.type;
    }

    public final String component7() {
        return this.category;
    }

    public final ProductImageDto component8() {
        return this.image;
    }

    public final List<ShoppingItemDto> component9() {
        return this.shoppingItems;
    }

    public final MenuItemDto copy(String str, String str2, String str3, String str4, int i, MenuItemTypeDto menuItemTypeDto, String str5, ProductImageDto productImageDto, List<ShoppingItemDto> list, List<CustomShoppingItemDto> list2, PizzaSizeDto pizzaSizeDto, String str6, List<String> list3) {
        z65.h(str, "id");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        z65.h(str4, "description");
        z65.h(menuItemTypeDto, MessageAttributes.TYPE);
        z65.h(str5, "category");
        z65.h(list, "shoppingItems");
        z65.h(list2, "customShoppingItems");
        z65.h(str6, "menuCategoryId");
        return new MenuItemDto(str, str2, str3, str4, i, menuItemTypeDto, str5, productImageDto, list, list2, pizzaSizeDto, str6, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuItemDto)) {
            return false;
        }
        MenuItemDto menuItemDto = (MenuItemDto) obj;
        if (z65.c(this.id, menuItemDto.id) && z65.c(this.forwardCompatibilityId, menuItemDto.forwardCompatibilityId) && z65.c(this.name, menuItemDto.name) && z65.c(this.description, menuItemDto.description) && this.priority == menuItemDto.priority && this.type == menuItemDto.type && z65.c(this.category, menuItemDto.category) && z65.c(this.image, menuItemDto.image) && z65.c(this.shoppingItems, menuItemDto.shoppingItems) && z65.c(this.customShoppingItems, menuItemDto.customShoppingItems) && z65.c(this.size, menuItemDto.size) && z65.c(this.menuCategoryId, menuItemDto.menuCategoryId) && z65.c(this.subMenuCategoryIds, menuItemDto.subMenuCategoryIds)) {
            return true;
        }
        return false;
    }

    public final String getCategory() {
        return this.category;
    }

    public final List<CustomShoppingItemDto> getCustomShoppingItems() {
        return this.customShoppingItems;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getForwardCompatibilityId() {
        return this.forwardCompatibilityId;
    }

    public final String getId() {
        return this.id;
    }

    public final ProductImageDto getImage() {
        return this.image;
    }

    public final String getMenuCategoryId() {
        return this.menuCategoryId;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final List<ShoppingItemDto> getShoppingItems() {
        return this.shoppingItems;
    }

    public final PizzaSizeDto getSize() {
        return this.size;
    }

    public final List<String> getSubMenuCategoryIds() {
        return this.subMenuCategoryIds;
    }

    public final MenuItemTypeDto getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.id.hashCode() * 31;
        String str = this.forwardCompatibilityId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (((((((((((hashCode4 + hashCode) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.priority) * 31) + this.type.hashCode()) * 31) + this.category.hashCode()) * 31;
        ProductImageDto productImageDto = this.image;
        if (productImageDto == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = productImageDto.hashCode();
        }
        int hashCode6 = (((((hashCode5 + hashCode2) * 31) + this.shoppingItems.hashCode()) * 31) + this.customShoppingItems.hashCode()) * 31;
        PizzaSizeDto pizzaSizeDto = this.size;
        if (pizzaSizeDto == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = pizzaSizeDto.hashCode();
        }
        int hashCode7 = (((hashCode6 + hashCode3) * 31) + this.menuCategoryId.hashCode()) * 31;
        List<String> list = this.subMenuCategoryIds;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.forwardCompatibilityId;
        String str3 = this.name;
        String str4 = this.description;
        int i = this.priority;
        MenuItemTypeDto menuItemTypeDto = this.type;
        String str5 = this.category;
        ProductImageDto productImageDto = this.image;
        List<ShoppingItemDto> list = this.shoppingItems;
        List<CustomShoppingItemDto> list2 = this.customShoppingItems;
        PizzaSizeDto pizzaSizeDto = this.size;
        String str6 = this.menuCategoryId;
        List<String> list3 = this.subMenuCategoryIds;
        return "MenuItemDto(id=" + str + ", forwardCompatibilityId=" + str2 + ", name=" + str3 + ", description=" + str4 + ", priority=" + i + ", type=" + menuItemTypeDto + ", category=" + str5 + ", image=" + productImageDto + ", shoppingItems=" + list + ", customShoppingItems=" + list2 + ", size=" + pizzaSizeDto + ", menuCategoryId=" + str6 + ", subMenuCategoryIds=" + list3 + ")";
    }
}
