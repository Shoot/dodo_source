package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: LoyaltyProgramAnalytics.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0011¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u0017\u0010'\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0015¨\u0006*"}, d2 = {"Lq26;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lu26;", "Lu26;", "getSender", "()Lu26;", "sender", "", "b", "D", "getCoinBalance", "()D", "coinBalance", c.a, "Ljava/lang/String;", "getShoppingId", "()Ljava/lang/String;", ShoppingInfoEntity.FIELD_SHOPPING_ID, DateTokenConverter.CONVERTER_KEY, "getName", Action.NAME_ATTRIBUTE, e.a, "getCategory", "category", "f", "getCurrency", "currency", "g", "getPrice", "price", "<init>", "(Lu26;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: q26  reason: default package */
/* loaded from: classes4.dex */
public final class q26 implements dc {
    private final u26 a;
    private final double b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final double g;

    public q26(u26 u26Var, double d, String str, String str2, String str3, String str4, double d2) {
        z65.h(u26Var, "sender");
        z65.h(str, ShoppingInfoEntity.FIELD_SHOPPING_ID);
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "category");
        z65.h(str4, "currency");
        this.a = u26Var;
        this.b = d;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = d2;
    }

    @Override // defpackage.dc
    public qc a() {
        od odVar = new od(this.d, this.c, Double.valueOf(this.g), this.f, vc.f(this.e), null, 1, 32, null);
        return nv3.c(bc.e(vc.z(pd.a(new bc("add_to_cart"), odVar), this.a), "coins", Double.valueOf(this.b), false, 4, null), odVar).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q26)) {
            return false;
        }
        q26 q26Var = (q26) obj;
        if (this.a == q26Var.a && Double.compare(this.b, q26Var.b) == 0 && z65.c(this.c, q26Var.c) && z65.c(this.d, q26Var.d) && z65.c(this.e, q26Var.e) && z65.c(this.f, q26Var.f) && Double.compare(this.g, q26Var.g) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + nkb.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + nkb.a(this.g);
    }

    public String toString() {
        u26 u26Var = this.a;
        double d = this.b;
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        double d2 = this.g;
        return "AddToCartFromLoyaltyEvent(sender=" + u26Var + ", coinBalance=" + d + ", shoppingId=" + str + ", name=" + str2 + ", category=" + str3 + ", currency=" + str4 + ", price=" + d2 + ")";
    }
}
