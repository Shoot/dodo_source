package ru.dodopizza.backend.domain.country.dto.addressformat;

import com.dodopizza.persistence.entity.BonusActionEntity;
import kotlin.Metadata;
/* compiled from: AddressComponentDesignDto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001f"}, d2 = {"Lru/dodopizza/backend/domain/country/dto/addressformat/AddressComponentDesignDto;", "", "id", "", "title", "isRequired", "", "maxLength", "", BonusActionEntity.ORDER, "size", "(Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "()Z", "getMaxLength", "()I", "getOrder", "getSize", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddressComponentDesignDto {
    @uca("id")
    private final String id;
    @uca("isRequired")
    private final boolean isRequired;
    @uca("maxLength")
    private final int maxLength;
    @uca(BonusActionEntity.ORDER)
    private final int order;
    @uca("size")
    private final String size;
    @uca("title")
    private final String title;

    public AddressComponentDesignDto(String str, String str2, boolean z, int i, int i2, String str3) {
        z65.h(str, "id");
        z65.h(str2, "title");
        z65.h(str3, "size");
        this.id = str;
        this.title = str2;
        this.isRequired = z;
        this.maxLength = i;
        this.order = i2;
        this.size = str3;
    }

    public static /* synthetic */ AddressComponentDesignDto copy$default(AddressComponentDesignDto addressComponentDesignDto, String str, String str2, boolean z, int i, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = addressComponentDesignDto.id;
        }
        if ((i3 & 2) != 0) {
            str2 = addressComponentDesignDto.title;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            z = addressComponentDesignDto.isRequired;
        }
        boolean z2 = z;
        if ((i3 & 8) != 0) {
            i = addressComponentDesignDto.maxLength;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = addressComponentDesignDto.order;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            str3 = addressComponentDesignDto.size;
        }
        return addressComponentDesignDto.copy(str, str4, z2, i4, i5, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final boolean component3() {
        return this.isRequired;
    }

    public final int component4() {
        return this.maxLength;
    }

    public final int component5() {
        return this.order;
    }

    public final String component6() {
        return this.size;
    }

    public final AddressComponentDesignDto copy(String str, String str2, boolean z, int i, int i2, String str3) {
        z65.h(str, "id");
        z65.h(str2, "title");
        z65.h(str3, "size");
        return new AddressComponentDesignDto(str, str2, z, i, i2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressComponentDesignDto)) {
            return false;
        }
        AddressComponentDesignDto addressComponentDesignDto = (AddressComponentDesignDto) obj;
        if (z65.c(this.id, addressComponentDesignDto.id) && z65.c(this.title, addressComponentDesignDto.title) && this.isRequired == addressComponentDesignDto.isRequired && this.maxLength == addressComponentDesignDto.maxLength && this.order == addressComponentDesignDto.order && z65.c(this.size, addressComponentDesignDto.size)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + a91.a(this.isRequired)) * 31) + this.maxLength) * 31) + this.order) * 31) + this.size.hashCode();
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        boolean z = this.isRequired;
        int i = this.maxLength;
        int i2 = this.order;
        String str3 = this.size;
        return "AddressComponentDesignDto(id=" + str + ", title=" + str2 + ", isRequired=" + z + ", maxLength=" + i + ", order=" + i2 + ", size=" + str3 + ")";
    }
}
