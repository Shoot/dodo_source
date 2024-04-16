package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
/* compiled from: OrderHistoryDto.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0015\u0010\u000eR\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b!\u0010\u000eR\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010,\u001a\u0004\b \u0010-\"\u0004\b.\u0010/R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b1\u0010\fR\u001a\u00103\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b\u0014\u0010&¨\u00064"}, d2 = {"Lxe7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "id", "b", e.a, "setNumber", "number", c.a, "setAddress", "address", "I", "g", "()I", "setOrderState", "(I)V", "orderState", Image.TYPE_HIGH, "setOrderType", "orderType", "f", "setCreateDate", "createDate", "", "D", "i", "()D", "setPrice", "(D)V", "price", "", "Lag7;", "Ljava/util/List;", "()Ljava/util/List;", "setOrderItems", "(Ljava/util/List;)V", "orderItems", "j", "receiptUrl", "deliveryFee", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xe7  reason: default package */
/* loaded from: classes2.dex */
public final class xe7 {
    @uca("id")
    private String a;
    @uca("orderNumber")
    private String b;
    @uca("address")
    private String c;
    @uca("orderState")
    private int d;
    @uca("orderType")
    private int e;
    @uca("createDate")
    private String f;
    @uca("totalPrice")
    private double g;
    @uca("orderItems")
    private List<ag7> h;
    @uca("receiptUrl")
    private final String i;
    @uca("deliveryFee")
    private final double j;

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.f;
    }

    public final double c() {
        return this.j;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe7)) {
            return false;
        }
        xe7 xe7Var = (xe7) obj;
        if (z65.c(this.a, xe7Var.a) && z65.c(this.b, xe7Var.b) && z65.c(this.c, xe7Var.c) && this.d == xe7Var.d && this.e == xe7Var.e && z65.c(this.f, xe7Var.f) && Double.compare(this.g, xe7Var.g) == 0 && z65.c(this.h, xe7Var.h) && z65.c(this.i, xe7Var.i) && Double.compare(this.j, xe7Var.j) == 0) {
            return true;
        }
        return false;
    }

    public final List<ag7> f() {
        return this.h;
    }

    public final int g() {
        return this.d;
    }

    public final int h() {
        return this.e;
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
        int hashCode3 = (((((((((((hashCode2 + hashCode) * 31) + this.d) * 31) + this.e) * 31) + this.f.hashCode()) * 31) + nkb.a(this.g)) * 31) + this.h.hashCode()) * 31;
        String str2 = this.i;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode3 + i) * 31) + nkb.a(this.j);
    }

    public final double i() {
        return this.g;
    }

    public final String j() {
        return this.i;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int i = this.d;
        int i2 = this.e;
        String str4 = this.f;
        double d = this.g;
        List<ag7> list = this.h;
        String str5 = this.i;
        double d2 = this.j;
        return "OrderHistoryDto(id=" + str + ", number=" + str2 + ", address=" + str3 + ", orderState=" + i + ", orderType=" + i2 + ", createDate=" + str4 + ", price=" + d + ", orderItems=" + list + ", receiptUrl=" + str5 + ", deliveryFee=" + d2 + ")";
    }
}
