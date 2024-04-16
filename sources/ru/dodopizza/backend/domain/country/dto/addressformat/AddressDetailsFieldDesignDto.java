package ru.dodopizza.backend.domain.country.dto.addressformat;

import java.util.List;
import kotlin.Metadata;
/* compiled from: AddressDetailsFieldDesignDto.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "", "mainFieldTitle", "", "fields", "", "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressComponentDesignDto;", "localities", "Lru/dodopizza/backend/domain/country/dto/addressformat/LocalityAddressFieldsDesignDto;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getFields", "()Ljava/util/List;", "getLocalities", "getMainFieldTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddressDetailsFieldDesignDto {
    @uca("fields")
    private final List<AddressComponentDesignDto> fields;
    @uca("localities")
    private final List<LocalityAddressFieldsDesignDto> localities;
    @uca("mainFieldTitle")
    private final String mainFieldTitle;

    public AddressDetailsFieldDesignDto(String str, List<AddressComponentDesignDto> list, List<LocalityAddressFieldsDesignDto> list2) {
        z65.h(str, "mainFieldTitle");
        z65.h(list, "fields");
        this.mainFieldTitle = str;
        this.fields = list;
        this.localities = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressDetailsFieldDesignDto copy$default(AddressDetailsFieldDesignDto addressDetailsFieldDesignDto, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressDetailsFieldDesignDto.mainFieldTitle;
        }
        if ((i & 2) != 0) {
            list = addressDetailsFieldDesignDto.fields;
        }
        if ((i & 4) != 0) {
            list2 = addressDetailsFieldDesignDto.localities;
        }
        return addressDetailsFieldDesignDto.copy(str, list, list2);
    }

    public final String component1() {
        return this.mainFieldTitle;
    }

    public final List<AddressComponentDesignDto> component2() {
        return this.fields;
    }

    public final List<LocalityAddressFieldsDesignDto> component3() {
        return this.localities;
    }

    public final AddressDetailsFieldDesignDto copy(String str, List<AddressComponentDesignDto> list, List<LocalityAddressFieldsDesignDto> list2) {
        z65.h(str, "mainFieldTitle");
        z65.h(list, "fields");
        return new AddressDetailsFieldDesignDto(str, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressDetailsFieldDesignDto)) {
            return false;
        }
        AddressDetailsFieldDesignDto addressDetailsFieldDesignDto = (AddressDetailsFieldDesignDto) obj;
        if (z65.c(this.mainFieldTitle, addressDetailsFieldDesignDto.mainFieldTitle) && z65.c(this.fields, addressDetailsFieldDesignDto.fields) && z65.c(this.localities, addressDetailsFieldDesignDto.localities)) {
            return true;
        }
        return false;
    }

    public final List<AddressComponentDesignDto> getFields() {
        return this.fields;
    }

    public final List<LocalityAddressFieldsDesignDto> getLocalities() {
        return this.localities;
    }

    public final String getMainFieldTitle() {
        return this.mainFieldTitle;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.mainFieldTitle.hashCode() * 31) + this.fields.hashCode()) * 31;
        List<LocalityAddressFieldsDesignDto> list = this.localities;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.mainFieldTitle;
        List<AddressComponentDesignDto> list = this.fields;
        List<LocalityAddressFieldsDesignDto> list2 = this.localities;
        return "AddressDetailsFieldDesignDto(mainFieldTitle=" + str + ", fields=" + list + ", localities=" + list2 + ")";
    }
}
