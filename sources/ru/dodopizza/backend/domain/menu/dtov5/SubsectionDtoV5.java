package ru.dodopizza.backend.domain.menu.dtov5;

import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper;
/* compiled from: SubsectionDtoV5.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0006HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/SubsectionDtoV5;", "", "code", "", "title", "items", "", "Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "Lru/dodopizza/backend/domain/menu/dtov5/SectionItemDtoV5;", "additionalData", "Lru/dodopizza/backend/domain/menu/dtov5/AdditionalDataDtoV5;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAdditionalData", "()Ljava/util/List;", "getCode", "()Ljava/lang/String;", "getItems", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SubsectionDtoV5 {
    @uca("additionalData")
    private final List<AdditionalDataDtoV5> additionalData;
    @uca("code")
    private final String code;
    @uca("items")
    private final List<ReferenceWrapper<SectionItemDtoV5>> items;
    @uca("title")
    private final String title;

    public SubsectionDtoV5(String str, String str2, List<ReferenceWrapper<SectionItemDtoV5>> list, List<AdditionalDataDtoV5> list2) {
        z65.h(str, "code");
        z65.h(str2, "title");
        z65.h(list, "items");
        z65.h(list2, "additionalData");
        this.code = str;
        this.title = str2;
        this.items = list;
        this.additionalData = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubsectionDtoV5 copy$default(SubsectionDtoV5 subsectionDtoV5, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subsectionDtoV5.code;
        }
        if ((i & 2) != 0) {
            str2 = subsectionDtoV5.title;
        }
        if ((i & 4) != 0) {
            list = subsectionDtoV5.items;
        }
        if ((i & 8) != 0) {
            list2 = subsectionDtoV5.additionalData;
        }
        return subsectionDtoV5.copy(str, str2, list, list2);
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

    public final List<AdditionalDataDtoV5> component4() {
        return this.additionalData;
    }

    public final SubsectionDtoV5 copy(String str, String str2, List<ReferenceWrapper<SectionItemDtoV5>> list, List<AdditionalDataDtoV5> list2) {
        z65.h(str, "code");
        z65.h(str2, "title");
        z65.h(list, "items");
        z65.h(list2, "additionalData");
        return new SubsectionDtoV5(str, str2, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubsectionDtoV5)) {
            return false;
        }
        SubsectionDtoV5 subsectionDtoV5 = (SubsectionDtoV5) obj;
        if (z65.c(this.code, subsectionDtoV5.code) && z65.c(this.title, subsectionDtoV5.title) && z65.c(this.items, subsectionDtoV5.items) && z65.c(this.additionalData, subsectionDtoV5.additionalData)) {
            return true;
        }
        return false;
    }

    public final List<AdditionalDataDtoV5> getAdditionalData() {
        return this.additionalData;
    }

    public final String getCode() {
        return this.code;
    }

    public final List<ReferenceWrapper<SectionItemDtoV5>> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.code.hashCode() * 31) + this.title.hashCode()) * 31) + this.items.hashCode()) * 31) + this.additionalData.hashCode();
    }

    public String toString() {
        String str = this.code;
        String str2 = this.title;
        List<ReferenceWrapper<SectionItemDtoV5>> list = this.items;
        List<AdditionalDataDtoV5> list2 = this.additionalData;
        return "SubsectionDtoV5(code=" + str + ", title=" + str2 + ", items=" + list + ", additionalData=" + list2 + ")";
    }
}
