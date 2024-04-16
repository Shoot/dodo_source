package ru.dodopizza.backend.domain.menu.dtov5;

import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper;
/* compiled from: SectionDtoV5.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\nHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001d"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/SectionDtoV5;", "", "code", "", "title", "items", "", "Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "Lru/dodopizza/backend/domain/menu/dtov5/SectionItemDtoV5;", "index", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V", "getCode", "()Ljava/lang/String;", "getIndex", "()I", "getItems", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SectionDtoV5 {
    @uca("code")
    private final String code;
    @uca("index")
    private final int index;
    @uca("items")
    private final List<ReferenceWrapper<SectionItemDtoV5>> items;
    @uca("title")
    private final String title;

    public SectionDtoV5(String str, String str2, List<ReferenceWrapper<SectionItemDtoV5>> list, int i) {
        z65.h(str, "code");
        z65.h(str2, "title");
        z65.h(list, "items");
        this.code = str;
        this.title = str2;
        this.items = list;
        this.index = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionDtoV5 copy$default(SectionDtoV5 sectionDtoV5, String str, String str2, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sectionDtoV5.code;
        }
        if ((i2 & 2) != 0) {
            str2 = sectionDtoV5.title;
        }
        if ((i2 & 4) != 0) {
            list = sectionDtoV5.items;
        }
        if ((i2 & 8) != 0) {
            i = sectionDtoV5.index;
        }
        return sectionDtoV5.copy(str, str2, list, i);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.title;
    }

    public final List<ReferenceWrapper<SectionItemDtoV5>> component3() {
        return this.items;
    }

    public final int component4() {
        return this.index;
    }

    public final SectionDtoV5 copy(String str, String str2, List<ReferenceWrapper<SectionItemDtoV5>> list, int i) {
        z65.h(str, "code");
        z65.h(str2, "title");
        z65.h(list, "items");
        return new SectionDtoV5(str, str2, list, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionDtoV5)) {
            return false;
        }
        SectionDtoV5 sectionDtoV5 = (SectionDtoV5) obj;
        if (z65.c(this.code, sectionDtoV5.code) && z65.c(this.title, sectionDtoV5.title) && z65.c(this.items, sectionDtoV5.items) && this.index == sectionDtoV5.index) {
            return true;
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final int getIndex() {
        return this.index;
    }

    public final List<ReferenceWrapper<SectionItemDtoV5>> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.code.hashCode() * 31) + this.title.hashCode()) * 31) + this.items.hashCode()) * 31) + this.index;
    }

    public String toString() {
        String str = this.code;
        String str2 = this.title;
        List<ReferenceWrapper<SectionItemDtoV5>> list = this.items;
        int i = this.index;
        return "SectionDtoV5(code=" + str + ", title=" + str2 + ", items=" + list + ", index=" + i + ")";
    }
}
