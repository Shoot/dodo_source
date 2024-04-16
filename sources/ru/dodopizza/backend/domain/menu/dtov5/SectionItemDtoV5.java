package ru.dodopizza.backend.domain.menu.dtov5;

import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.dtov5.deserializers.ReferenceWrapper;
/* compiled from: SectionItemDtoV5.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/SectionItemDtoV5;", "", MessageAttributes.TYPE, "", "menuItem", "Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "Lru/dodopizza/backend/domain/menu/dtov5/MenuItemDtoV5;", "subSection", "Lru/dodopizza/backend/domain/menu/dtov5/SubsectionDtoV5;", "index", "", "additionalData", "", "Lru/dodopizza/backend/domain/menu/dtov5/AdditionalDataDtoV5;", "(Ljava/lang/String;Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;ILjava/util/List;)V", "getAdditionalData", "()Ljava/util/List;", "getIndex", "()I", "getMenuItem", "()Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "getSubSection", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SectionItemDtoV5 {
    @uca("additionalData")
    private final List<AdditionalDataDtoV5> additionalData;
    @uca("index")
    private final int index;
    @uca("menuItem")
    private final ReferenceWrapper<MenuItemDtoV5> menuItem;
    @uca("subSection")
    private final ReferenceWrapper<SubsectionDtoV5> subSection;
    @uca(MessageAttributes.TYPE)
    private final String type;

    public SectionItemDtoV5(String str, ReferenceWrapper<MenuItemDtoV5> referenceWrapper, ReferenceWrapper<SubsectionDtoV5> referenceWrapper2, int i, List<AdditionalDataDtoV5> list) {
        z65.h(str, MessageAttributes.TYPE);
        z65.h(list, "additionalData");
        this.type = str;
        this.menuItem = referenceWrapper;
        this.subSection = referenceWrapper2;
        this.index = i;
        this.additionalData = list;
    }

    public static /* synthetic */ SectionItemDtoV5 copy$default(SectionItemDtoV5 sectionItemDtoV5, String str, ReferenceWrapper referenceWrapper, ReferenceWrapper referenceWrapper2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sectionItemDtoV5.type;
        }
        ReferenceWrapper<MenuItemDtoV5> referenceWrapper3 = referenceWrapper;
        if ((i2 & 2) != 0) {
            referenceWrapper3 = sectionItemDtoV5.menuItem;
        }
        ReferenceWrapper referenceWrapper4 = referenceWrapper3;
        ReferenceWrapper<SubsectionDtoV5> referenceWrapper5 = referenceWrapper2;
        if ((i2 & 4) != 0) {
            referenceWrapper5 = sectionItemDtoV5.subSection;
        }
        ReferenceWrapper referenceWrapper6 = referenceWrapper5;
        if ((i2 & 8) != 0) {
            i = sectionItemDtoV5.index;
        }
        int i3 = i;
        List<AdditionalDataDtoV5> list2 = list;
        if ((i2 & 16) != 0) {
            list2 = sectionItemDtoV5.additionalData;
        }
        return sectionItemDtoV5.copy(str, referenceWrapper4, referenceWrapper6, i3, list2);
    }

    public final String component1() {
        return this.type;
    }

    public final ReferenceWrapper<MenuItemDtoV5> component2() {
        return this.menuItem;
    }

    public final ReferenceWrapper<SubsectionDtoV5> component3() {
        return this.subSection;
    }

    public final int component4() {
        return this.index;
    }

    public final List<AdditionalDataDtoV5> component5() {
        return this.additionalData;
    }

    public final SectionItemDtoV5 copy(String str, ReferenceWrapper<MenuItemDtoV5> referenceWrapper, ReferenceWrapper<SubsectionDtoV5> referenceWrapper2, int i, List<AdditionalDataDtoV5> list) {
        z65.h(str, MessageAttributes.TYPE);
        z65.h(list, "additionalData");
        return new SectionItemDtoV5(str, referenceWrapper, referenceWrapper2, i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionItemDtoV5)) {
            return false;
        }
        SectionItemDtoV5 sectionItemDtoV5 = (SectionItemDtoV5) obj;
        if (z65.c(this.type, sectionItemDtoV5.type) && z65.c(this.menuItem, sectionItemDtoV5.menuItem) && z65.c(this.subSection, sectionItemDtoV5.subSection) && this.index == sectionItemDtoV5.index && z65.c(this.additionalData, sectionItemDtoV5.additionalData)) {
            return true;
        }
        return false;
    }

    public final List<AdditionalDataDtoV5> getAdditionalData() {
        return this.additionalData;
    }

    public final int getIndex() {
        return this.index;
    }

    public final ReferenceWrapper<MenuItemDtoV5> getMenuItem() {
        return this.menuItem;
    }

    public final ReferenceWrapper<SubsectionDtoV5> getSubSection() {
        return this.subSection;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.type.hashCode() * 31;
        ReferenceWrapper<MenuItemDtoV5> referenceWrapper = this.menuItem;
        int i = 0;
        if (referenceWrapper == null) {
            hashCode = 0;
        } else {
            hashCode = referenceWrapper.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        ReferenceWrapper<SubsectionDtoV5> referenceWrapper2 = this.subSection;
        if (referenceWrapper2 != null) {
            i = referenceWrapper2.hashCode();
        }
        return ((((i2 + i) * 31) + this.index) * 31) + this.additionalData.hashCode();
    }

    public String toString() {
        String str = this.type;
        ReferenceWrapper<MenuItemDtoV5> referenceWrapper = this.menuItem;
        ReferenceWrapper<SubsectionDtoV5> referenceWrapper2 = this.subSection;
        int i = this.index;
        List<AdditionalDataDtoV5> list = this.additionalData;
        return "SectionItemDtoV5(type=" + str + ", menuItem=" + referenceWrapper + ", subSection=" + referenceWrapper2 + ", index=" + i + ", additionalData=" + list + ")";
    }
}
