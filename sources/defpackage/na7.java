package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: OpenProductCard.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u0006\u0010%\u001a\u00020\n¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lna7;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lqd6;", "Lqd6;", "getMenuItem", "()Lqd6;", "menuItem", "b", "I", "getPositionInMenu", "()I", "positionInMenu", "", "Ltja;", c.a, "Ljava/util/Collection;", "getShoppingItems", "()Ljava/util/Collection;", "shoppingItems", "Lqd;", DateTokenConverter.CONVERTER_KEY, "Lqd;", "getSender", "()Lqd;", "sender", e.a, "Z", "isHeroProduct", "()Z", "<init>", "(Lqd6;ILjava/util/Collection;Lqd;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: na7  reason: default package */
/* loaded from: classes4.dex */
public final class na7 implements dc {
    private final qd6 a;
    private final int b;
    private final Collection<tja> c;
    private final qd d;
    private final boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public na7(qd6 qd6Var, int i, Collection<? extends tja> collection, qd qdVar, boolean z) {
        z65.h(qd6Var, "menuItem");
        z65.h(collection, "shoppingItems");
        z65.h(qdVar, "sender");
        this.a = qd6Var;
        this.b = i;
        this.c = collection;
        this.d = qdVar;
        this.e = z;
    }

    @Override // defpackage.dc
    public qc a() {
        return bc.e(bc.e(vc.z(bc.e(vc.y(bc.e(bc.e(vc.i(new bc("open_product_card"), this.a.b()), Action.NAME_ATTRIBUTE, this.a.i(), false, 4, null), ShoppingInfoEntity.FIELD_PRODUCT_ID, vc.b(this.a.f()), false, 4, null), this.c), "position", Integer.valueOf(this.b), false, 4, null), this.d), "price", Double.valueOf(this.a.k().a()), false, 4, null), "is_hero", Boolean.valueOf(this.e), false, 4, null).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na7)) {
            return false;
        }
        na7 na7Var = (na7) obj;
        if (z65.c(this.a, na7Var.a) && this.b == na7Var.b && z65.c(this.c, na7Var.c) && z65.c(this.d, na7Var.d) && this.e == na7Var.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a91.a(this.e);
    }

    public String toString() {
        qd6 qd6Var = this.a;
        int i = this.b;
        Collection<tja> collection = this.c;
        qd qdVar = this.d;
        boolean z = this.e;
        return "OpenProductCard(menuItem=" + qd6Var + ", positionInMenu=" + i + ", shoppingItems=" + collection + ", sender=" + qdVar + ", isHeroProduct=" + z + ")";
    }
}
