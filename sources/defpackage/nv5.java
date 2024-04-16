package defpackage;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.country.dto.addressformat.AddressDetailsFieldDesignDto;
/* compiled from: LocalityWithAddressDetailsFieldDesignDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0014"}, d2 = {"Lnv5;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "localityId", "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "()Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "design", "<init>", "(Ljava/lang/String;Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: nv5  reason: default package */
/* loaded from: classes4.dex */
public final class nv5 {
    private final String a;
    private final AddressDetailsFieldDesignDto b;

    public nv5(String str, AddressDetailsFieldDesignDto addressDetailsFieldDesignDto) {
        z65.h(addressDetailsFieldDesignDto, "design");
        this.a = str;
        this.b = addressDetailsFieldDesignDto;
    }

    public final AddressDetailsFieldDesignDto a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv5)) {
            return false;
        }
        nv5 nv5Var = (nv5) obj;
        if (z65.c(this.a, nv5Var.a) && z65.c(this.b, nv5Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        AddressDetailsFieldDesignDto addressDetailsFieldDesignDto = this.b;
        return "LocalityWithAddressDetailsFieldDesignDto(localityId=" + str + ", design=" + addressDetailsFieldDesignDto + ")";
    }
}
