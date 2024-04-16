package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.common.ImageUrls;
import ru.dodopizza.backend.domain.orderhistory.dto.SizeDetailsDto;
/* compiled from: OrderProductDto.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0019\u0010\u000eR\"\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\t\u0010$\"\u0004\b%\u0010&R\"\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\n\u001a\u0004\b\"\u0010\f\"\u0004\b(\u0010\u000eR\u001c\u0010-\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b\u0018\u0010,¨\u0006."}, d2 = {"Lzg7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", Action.NAME_ATTRIBUTE, "Lru/dodopizza/backend/domain/orderhistory/dto/SizeDetailsDto;", "b", "Lru/dodopizza/backend/domain/orderhistory/dto/SizeDetailsDto;", "f", "()Lru/dodopizza/backend/domain/orderhistory/dto/SizeDetailsDto;", "setSizeDetails", "(Lru/dodopizza/backend/domain/orderhistory/dto/SizeDetailsDto;)V", "sizeDetails", c.a, "setImageUrl", "imageUrl", "I", "g", "()I", "setSortOrder", "(I)V", "sortOrder", "Lyg7;", e.a, "Lyg7;", "()Lyg7;", "setCustomization", "(Lyg7;)V", "customization", "setProductCategory", "productCategory", "Lru/dodopizza/backend/domain/common/ImageUrls;", "Lru/dodopizza/backend/domain/common/ImageUrls;", "()Lru/dodopizza/backend/domain/common/ImageUrls;", "imageUrls", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zg7  reason: default package */
/* loaded from: classes2.dex */
public final class zg7 {
    @uca(Action.NAME_ATTRIBUTE)
    private String a;
    @uca("sizeDetails")
    private SizeDetailsDto b;
    @uca("imageUrl")
    private String c;
    @uca("sortOrder")
    private int d;
    @uca("customization")
    private yg7 e;
    @uca("category")
    private String f;
    @uca("imageUrls")
    private final ImageUrls g;

    public final yg7 a() {
        return this.e;
    }

    public final String b() {
        return this.c;
    }

    public final ImageUrls c() {
        return this.g;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg7)) {
            return false;
        }
        zg7 zg7Var = (zg7) obj;
        if (z65.c(this.a, zg7Var.a) && z65.c(this.b, zg7Var.b) && z65.c(this.c, zg7Var.c) && this.d == zg7Var.d && z65.c(this.e, zg7Var.e) && z65.c(this.f, zg7Var.f) && z65.c(this.g, zg7Var.g)) {
            return true;
        }
        return false;
    }

    public final SizeDetailsDto f() {
        return this.b;
    }

    public final int g() {
        return this.d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((((hashCode2 + hashCode) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        ImageUrls imageUrls = this.g;
        if (imageUrls != null) {
            i = imageUrls.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.a;
        SizeDetailsDto sizeDetailsDto = this.b;
        String str2 = this.c;
        int i = this.d;
        yg7 yg7Var = this.e;
        String str3 = this.f;
        ImageUrls imageUrls = this.g;
        return "OrderProductDto(name=" + str + ", sizeDetails=" + sizeDetailsDto + ", imageUrl=" + str2 + ", sortOrder=" + i + ", customization=" + yg7Var + ", productCategory=" + str3 + ", imageUrls=" + imageUrls + ")";
    }
}
