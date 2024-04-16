package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: BuyMoreItemVO.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0018"}, d2 = {"Lwi0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", ShoppingInfoEntity.FIELD_SHOPPING_ID, "b", Action.NAME_ATTRIBUTE, "Lhn6;", c.a, "Lhn6;", "()Lhn6;", "price", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhn6;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: wi0  reason: default package */
/* loaded from: classes4.dex */
public final class wi0 {
    private final String a;
    private final String b;
    private final hn6 c;
    private final String d;

    public wi0(String str, String str2, hn6 hn6Var, String str3) {
        z65.h(str, ShoppingInfoEntity.FIELD_SHOPPING_ID);
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(hn6Var, "price");
        z65.h(str3, "imageUrl");
        this.a = str;
        this.b = str2;
        this.c = hn6Var;
        this.d = str3;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final hn6 c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi0)) {
            return false;
        }
        wi0 wi0Var = (wi0) obj;
        if (z65.c(this.a, wi0Var.a) && z65.c(this.b, wi0Var.b) && z65.c(this.c, wi0Var.c) && z65.c(this.d, wi0Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        hn6 hn6Var = this.c;
        String str3 = this.d;
        return "BuyMoreItemVO(shoppingId=" + str + ", name=" + str2 + ", price=" + hn6Var + ", imageUrl=" + str3 + ")";
    }
}
