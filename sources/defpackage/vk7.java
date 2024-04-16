package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: OrderTypeDiscounts.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0019"}, d2 = {"Lvk7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "getCarryoutDiscount", "()I", "carryoutDiscount", "b", "restaurantDiscount", c.a, "Ljava/lang/String;", "getCarryoutDiscountText", "()Ljava/lang/String;", "carryoutDiscountText", DateTokenConverter.CONVERTER_KEY, "restaurantDiscountText", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vk7  reason: default package */
/* loaded from: classes4.dex */
public final class vk7 {
    private final int a;
    private final int b;
    private final String c;
    private final String d;

    public vk7(int i, int i2, String str, String str2) {
        z65.h(str, "carryoutDiscountText");
        z65.h(str2, "restaurantDiscountText");
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk7)) {
            return false;
        }
        vk7 vk7Var = (vk7) obj;
        if (this.a == vk7Var.a && this.b == vk7Var.b && z65.c(this.c, vk7Var.c) && z65.c(this.d, vk7Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        String str = this.c;
        String str2 = this.d;
        return "OrderTypeDiscounts(carryoutDiscount=" + i + ", restaurantDiscount=" + i2 + ", carryoutDiscountText=" + str + ", restaurantDiscountText=" + str2 + ")";
    }
}
