package ru.dodopizza.backend.domain.menu.dtov5;

import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper;
/* compiled from: MenuDtoV5.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003¢\u0006\u0002\u0010\bJ\u0015\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003HÆ\u0003J5\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\"\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\"\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/MenuDtoV5;", "", "items", "", "Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "Lru/dodopizza/backend/domain/menu/dtov5/MenuItemDtoV5;", "structure", "Lru/dodopizza/backend/domain/menu/dtov5/SectionDtoV5;", "(Ljava/util/List;Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "getStructure", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MenuDtoV5 {
    @uca("items")
    private final List<ReferenceWrapper<MenuItemDtoV5>> items;
    @uca("structure")
    private final List<ReferenceWrapper<SectionDtoV5>> structure;

    public MenuDtoV5(List<ReferenceWrapper<MenuItemDtoV5>> list, List<ReferenceWrapper<SectionDtoV5>> list2) {
        z65.h(list, "items");
        z65.h(list2, "structure");
        this.items = list;
        this.structure = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenuDtoV5 copy$default(MenuDtoV5 menuDtoV5, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = menuDtoV5.items;
        }
        if ((i & 2) != 0) {
            list2 = menuDtoV5.structure;
        }
        return menuDtoV5.copy(list, list2);
    }

    public final List<ReferenceWrapper<MenuItemDtoV5>> component1() {
        return this.items;
    }

    public final List<ReferenceWrapper<SectionDtoV5>> component2() {
        return this.structure;
    }

    public final MenuDtoV5 copy(List<ReferenceWrapper<MenuItemDtoV5>> list, List<ReferenceWrapper<SectionDtoV5>> list2) {
        z65.h(list, "items");
        z65.h(list2, "structure");
        return new MenuDtoV5(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuDtoV5)) {
            return false;
        }
        MenuDtoV5 menuDtoV5 = (MenuDtoV5) obj;
        if (z65.c(this.items, menuDtoV5.items) && z65.c(this.structure, menuDtoV5.structure)) {
            return true;
        }
        return false;
    }

    public final List<ReferenceWrapper<MenuItemDtoV5>> getItems() {
        return this.items;
    }

    public final List<ReferenceWrapper<SectionDtoV5>> getStructure() {
        return this.structure;
    }

    public int hashCode() {
        return (this.items.hashCode() * 31) + this.structure.hashCode();
    }

    public String toString() {
        List<ReferenceWrapper<MenuItemDtoV5>> list = this.items;
        List<ReferenceWrapper<SectionDtoV5>> list2 = this.structure;
        return "MenuDtoV5(items=" + list + ", structure=" + list2 + ")";
    }
}
