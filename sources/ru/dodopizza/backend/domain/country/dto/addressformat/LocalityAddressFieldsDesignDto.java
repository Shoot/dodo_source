package ru.dodopizza.backend.domain.country.dto.addressformat;

import java.util.List;
import kotlin.Metadata;
/* compiled from: LocalityAddressFieldsDesignDto.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/dodopizza/backend/domain/country/dto/addressformat/LocalityAddressFieldsDesignDto;", "", "localityId", "", "mainFieldTitle", "fields", "", "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressComponentDesignDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getFields", "()Ljava/util/List;", "getLocalityId", "()Ljava/lang/String;", "getMainFieldTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocalityAddressFieldsDesignDto {
    @uca("fields")
    private final List<AddressComponentDesignDto> fields;
    @uca("localityId")
    private final String localityId;
    @uca("mainFieldTitle")
    private final String mainFieldTitle;

    public LocalityAddressFieldsDesignDto(String str, String str2, List<AddressComponentDesignDto> list) {
        z65.h(str, "localityId");
        z65.h(str2, "mainFieldTitle");
        z65.h(list, "fields");
        this.localityId = str;
        this.mainFieldTitle = str2;
        this.fields = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalityAddressFieldsDesignDto copy$default(LocalityAddressFieldsDesignDto localityAddressFieldsDesignDto, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localityAddressFieldsDesignDto.localityId;
        }
        if ((i & 2) != 0) {
            str2 = localityAddressFieldsDesignDto.mainFieldTitle;
        }
        if ((i & 4) != 0) {
            list = localityAddressFieldsDesignDto.fields;
        }
        return localityAddressFieldsDesignDto.copy(str, str2, list);
    }

    public final String component1() {
        return this.localityId;
    }

    public final String component2() {
        return this.mainFieldTitle;
    }

    public final List<AddressComponentDesignDto> component3() {
        return this.fields;
    }

    public final LocalityAddressFieldsDesignDto copy(String str, String str2, List<AddressComponentDesignDto> list) {
        z65.h(str, "localityId");
        z65.h(str2, "mainFieldTitle");
        z65.h(list, "fields");
        return new LocalityAddressFieldsDesignDto(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalityAddressFieldsDesignDto)) {
            return false;
        }
        LocalityAddressFieldsDesignDto localityAddressFieldsDesignDto = (LocalityAddressFieldsDesignDto) obj;
        if (z65.c(this.localityId, localityAddressFieldsDesignDto.localityId) && z65.c(this.mainFieldTitle, localityAddressFieldsDesignDto.mainFieldTitle) && z65.c(this.fields, localityAddressFieldsDesignDto.fields)) {
            return true;
        }
        return false;
    }

    public final List<AddressComponentDesignDto> getFields() {
        return this.fields;
    }

    public final String getLocalityId() {
        return this.localityId;
    }

    public final String getMainFieldTitle() {
        return this.mainFieldTitle;
    }

    public int hashCode() {
        return (((this.localityId.hashCode() * 31) + this.mainFieldTitle.hashCode()) * 31) + this.fields.hashCode();
    }

    public String toString() {
        String str = this.localityId;
        String str2 = this.mainFieldTitle;
        List<AddressComponentDesignDto> list = this.fields;
        return "LocalityAddressFieldsDesignDto(localityId=" + str + ", mainFieldTitle=" + str2 + ", fields=" + list + ")";
    }
}
