package ru.dodopizza.backend.domain.menu.dto;

import ch.qos.logback.core.joran.action.Action;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ToppingDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/ToppingDto;", "", MessageAttributes.UUID, "", "parentUUId", Action.NAME_ATTRIBUTE, "imageUrl", "price", "", "canAddToVariation", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DZ)V", "getCanAddToVariation", "()Z", "getImageUrl", "()Ljava/lang/String;", "getName", "getParentUUId", "getPrice", "()D", "getUuid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ToppingDto {
    @uca("canAddToVariation")
    private final boolean canAddToVariation;
    @uca("menuImagePath")
    private final String imageUrl;
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca("parentUUId")
    private final String parentUUId;
    @uca("price")
    private final double price;
    @uca("uuId")
    private final String uuid;

    public ToppingDto() {
        this(null, null, null, null, 0.0d, false, 63, null);
    }

    public static /* synthetic */ ToppingDto copy$default(ToppingDto toppingDto, String str, String str2, String str3, String str4, double d, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toppingDto.uuid;
        }
        if ((i & 2) != 0) {
            str2 = toppingDto.parentUUId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = toppingDto.name;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = toppingDto.imageUrl;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            d = toppingDto.price;
        }
        double d2 = d;
        if ((i & 32) != 0) {
            z = toppingDto.canAddToVariation;
        }
        return toppingDto.copy(str, str5, str6, str7, d2, z);
    }

    public final String component1() {
        return this.uuid;
    }

    public final String component2() {
        return this.parentUUId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final double component5() {
        return this.price;
    }

    public final boolean component6() {
        return this.canAddToVariation;
    }

    public final ToppingDto copy(String str, String str2, String str3, String str4, double d, boolean z) {
        z65.h(str, MessageAttributes.UUID);
        z65.h(str2, "parentUUId");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        return new ToppingDto(str, str2, str3, str4, d, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToppingDto)) {
            return false;
        }
        ToppingDto toppingDto = (ToppingDto) obj;
        if (z65.c(this.uuid, toppingDto.uuid) && z65.c(this.parentUUId, toppingDto.parentUUId) && z65.c(this.name, toppingDto.name) && z65.c(this.imageUrl, toppingDto.imageUrl) && Double.compare(this.price, toppingDto.price) == 0 && this.canAddToVariation == toppingDto.canAddToVariation) {
            return true;
        }
        return false;
    }

    public final boolean getCanAddToVariation() {
        return this.canAddToVariation;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getParentUUId() {
        return this.parentUUId;
    }

    public final double getPrice() {
        return this.price;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.uuid.hashCode() * 31) + this.parentUUId.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str = this.imageUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + nkb.a(this.price)) * 31) + a91.a(this.canAddToVariation);
    }

    public String toString() {
        String str = this.uuid;
        String str2 = this.parentUUId;
        String str3 = this.name;
        String str4 = this.imageUrl;
        double d = this.price;
        boolean z = this.canAddToVariation;
        return "ToppingDto(uuid=" + str + ", parentUUId=" + str2 + ", name=" + str3 + ", imageUrl=" + str4 + ", price=" + d + ", canAddToVariation=" + z + ")";
    }

    public ToppingDto(String str, String str2, String str3, String str4, double d, boolean z) {
        z65.h(str, MessageAttributes.UUID);
        z65.h(str2, "parentUUId");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        this.uuid = str;
        this.parentUUId = str2;
        this.name = str3;
        this.imageUrl = str4;
        this.price = d;
        this.canAddToVariation = z;
    }

    public /* synthetic */ ToppingDto(String str, String str2, String str3, String str4, double d, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : str4, (i & 16) != 0 ? 0.0d : d, (i & 32) != 0 ? true : z);
    }
}
