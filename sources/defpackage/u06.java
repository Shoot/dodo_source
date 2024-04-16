package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: LoyaltyMenuData.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u000b\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u0011\u0010\u001b¨\u0006\u001f"}, d2 = {"Lu06;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lb26;", "a", "Ljava/util/Collection;", c.a, "()Ljava/util/Collection;", "productCategoryVOs", "Los8;", "b", "Los8;", DateTokenConverter.CONVERTER_KEY, "()Los8;", "purchasingState", "", "D", "()D", "actualLoyaltyBalance", "Ljava/lang/String;", "()Ljava/lang/String;", "loyaltyGuideLink", "<init>", "(Ljava/util/Collection;Los8;DLjava/lang/String;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: u06  reason: default package */
/* loaded from: classes2.dex */
public final class u06 {
    private final Collection<b26> a;
    private final os8 b;
    private final double c;
    private final String d;

    public u06(Collection<b26> collection, os8 os8Var, double d, String str) {
        z65.h(collection, "productCategoryVOs");
        z65.h(os8Var, "purchasingState");
        z65.h(str, "loyaltyGuideLink");
        this.a = collection;
        this.b = os8Var;
        this.c = d;
        this.d = str;
    }

    public final double a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final Collection<b26> c() {
        return this.a;
    }

    public final os8 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u06)) {
            return false;
        }
        u06 u06Var = (u06) obj;
        if (z65.c(this.a, u06Var.a) && z65.c(this.b, u06Var.b) && Double.compare(this.c, u06Var.c) == 0 && z65.c(this.d, u06Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + nkb.a(this.c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        Collection<b26> collection = this.a;
        os8 os8Var = this.b;
        double d = this.c;
        String str = this.d;
        return "LoyaltyMenuData(productCategoryVOs=" + collection + ", purchasingState=" + os8Var + ", actualLoyaltyBalance=" + d + ", loyaltyGuideLink=" + str + ")";
    }
}
