package ru.dodopizza.backend.domain.menu.dto;

import java.util.List;
import kotlin.Metadata;
/* compiled from: MenuDto.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003HÆ\u0003J\u0087\u0001\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\tHÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014¨\u0006,"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/MenuDto;", "", "items", "", "Lru/dodopizza/backend/domain/menu/dto/MenuItemDto;", "assistantItems", "products", "Lru/dodopizza/backend/domain/menu/dto/ProductDto;", "prioritizedCategories", "", "popularProducts", "Lru/dodopizza/backend/domain/menu/dto/PopularProductDto;", "productSchemes", "Lru/dodopizza/backend/domain/menu/dto/ProductSchemesDto;", "menuCategories", "Lru/dodopizza/backend/domain/menu/dto/MenuCategoryDto;", "promoActions", "Lru/dodopizza/backend/domain/menu/dto/PromoActionItemDto;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/dodopizza/backend/domain/menu/dto/ProductSchemesDto;Ljava/util/List;Ljava/util/List;)V", "getAssistantItems", "()Ljava/util/List;", "getItems", "getMenuCategories", "getPopularProducts", "getPrioritizedCategories", "getProductSchemes", "()Lru/dodopizza/backend/domain/menu/dto/ProductSchemesDto;", "getProducts", "getPromoActions", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MenuDto {
    @uca("assistantItems")
    private final List<MenuItemDto> assistantItems;
    @uca("items")
    private final List<MenuItemDto> items;
    @uca("menuCategories")
    private final List<MenuCategoryDto> menuCategories;
    @uca("popular")
    private final List<PopularProductDto> popularProducts;
    @uca("prioritizedCategories")
    private final List<Integer> prioritizedCategories;
    @uca("productSchemes")
    private final ProductSchemesDto productSchemes;
    @uca("products")
    private final List<ProductDto> products;
    @uca("promoActions")
    private final List<PromoActionItemDto> promoActions;

    public MenuDto(List<MenuItemDto> list, List<MenuItemDto> list2, List<ProductDto> list3, List<Integer> list4, List<PopularProductDto> list5, ProductSchemesDto productSchemesDto, List<MenuCategoryDto> list6, List<PromoActionItemDto> list7) {
        z65.h(list, "items");
        z65.h(list3, "products");
        z65.h(list4, "prioritizedCategories");
        z65.h(list5, "popularProducts");
        z65.h(productSchemesDto, "productSchemes");
        z65.h(list6, "menuCategories");
        this.items = list;
        this.assistantItems = list2;
        this.products = list3;
        this.prioritizedCategories = list4;
        this.popularProducts = list5;
        this.productSchemes = productSchemesDto;
        this.menuCategories = list6;
        this.promoActions = list7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenuDto copy$default(MenuDto menuDto, List list, List list2, List list3, List list4, List list5, ProductSchemesDto productSchemesDto, List list6, List list7, int i, Object obj) {
        List<MenuItemDto> list8;
        List<MenuItemDto> list9;
        List<ProductDto> list10;
        List<Integer> list11;
        List<PopularProductDto> list12;
        ProductSchemesDto productSchemesDto2;
        List<MenuCategoryDto> list13;
        List<PromoActionItemDto> list14;
        if ((i & 1) != 0) {
            list8 = menuDto.items;
        } else {
            list8 = list;
        }
        if ((i & 2) != 0) {
            list9 = menuDto.assistantItems;
        } else {
            list9 = list2;
        }
        if ((i & 4) != 0) {
            list10 = menuDto.products;
        } else {
            list10 = list3;
        }
        if ((i & 8) != 0) {
            list11 = menuDto.prioritizedCategories;
        } else {
            list11 = list4;
        }
        if ((i & 16) != 0) {
            list12 = menuDto.popularProducts;
        } else {
            list12 = list5;
        }
        if ((i & 32) != 0) {
            productSchemesDto2 = menuDto.productSchemes;
        } else {
            productSchemesDto2 = productSchemesDto;
        }
        if ((i & 64) != 0) {
            list13 = menuDto.menuCategories;
        } else {
            list13 = list6;
        }
        if ((i & 128) != 0) {
            list14 = menuDto.promoActions;
        } else {
            list14 = list7;
        }
        return menuDto.copy(list8, list9, list10, list11, list12, productSchemesDto2, list13, list14);
    }

    public final List<MenuItemDto> component1() {
        return this.items;
    }

    public final List<MenuItemDto> component2() {
        return this.assistantItems;
    }

    public final List<ProductDto> component3() {
        return this.products;
    }

    public final List<Integer> component4() {
        return this.prioritizedCategories;
    }

    public final List<PopularProductDto> component5() {
        return this.popularProducts;
    }

    public final ProductSchemesDto component6() {
        return this.productSchemes;
    }

    public final List<MenuCategoryDto> component7() {
        return this.menuCategories;
    }

    public final List<PromoActionItemDto> component8() {
        return this.promoActions;
    }

    public final MenuDto copy(List<MenuItemDto> list, List<MenuItemDto> list2, List<ProductDto> list3, List<Integer> list4, List<PopularProductDto> list5, ProductSchemesDto productSchemesDto, List<MenuCategoryDto> list6, List<PromoActionItemDto> list7) {
        z65.h(list, "items");
        z65.h(list3, "products");
        z65.h(list4, "prioritizedCategories");
        z65.h(list5, "popularProducts");
        z65.h(productSchemesDto, "productSchemes");
        z65.h(list6, "menuCategories");
        return new MenuDto(list, list2, list3, list4, list5, productSchemesDto, list6, list7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuDto)) {
            return false;
        }
        MenuDto menuDto = (MenuDto) obj;
        if (z65.c(this.items, menuDto.items) && z65.c(this.assistantItems, menuDto.assistantItems) && z65.c(this.products, menuDto.products) && z65.c(this.prioritizedCategories, menuDto.prioritizedCategories) && z65.c(this.popularProducts, menuDto.popularProducts) && z65.c(this.productSchemes, menuDto.productSchemes) && z65.c(this.menuCategories, menuDto.menuCategories) && z65.c(this.promoActions, menuDto.promoActions)) {
            return true;
        }
        return false;
    }

    public final List<MenuItemDto> getAssistantItems() {
        return this.assistantItems;
    }

    public final List<MenuItemDto> getItems() {
        return this.items;
    }

    public final List<MenuCategoryDto> getMenuCategories() {
        return this.menuCategories;
    }

    public final List<PopularProductDto> getPopularProducts() {
        return this.popularProducts;
    }

    public final List<Integer> getPrioritizedCategories() {
        return this.prioritizedCategories;
    }

    public final ProductSchemesDto getProductSchemes() {
        return this.productSchemes;
    }

    public final List<ProductDto> getProducts() {
        return this.products;
    }

    public final List<PromoActionItemDto> getPromoActions() {
        return this.promoActions;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.items.hashCode() * 31;
        List<MenuItemDto> list = this.assistantItems;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int hashCode3 = (((((((((((hashCode2 + hashCode) * 31) + this.products.hashCode()) * 31) + this.prioritizedCategories.hashCode()) * 31) + this.popularProducts.hashCode()) * 31) + this.productSchemes.hashCode()) * 31) + this.menuCategories.hashCode()) * 31;
        List<PromoActionItemDto> list2 = this.promoActions;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        List<MenuItemDto> list = this.items;
        List<MenuItemDto> list2 = this.assistantItems;
        List<ProductDto> list3 = this.products;
        List<Integer> list4 = this.prioritizedCategories;
        List<PopularProductDto> list5 = this.popularProducts;
        ProductSchemesDto productSchemesDto = this.productSchemes;
        List<MenuCategoryDto> list6 = this.menuCategories;
        List<PromoActionItemDto> list7 = this.promoActions;
        return "MenuDto(items=" + list + ", assistantItems=" + list2 + ", products=" + list3 + ", prioritizedCategories=" + list4 + ", popularProducts=" + list5 + ", productSchemes=" + productSchemesDto + ", menuCategories=" + list6 + ", promoActions=" + list7 + ")";
    }
}
