package defpackage;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PreferredSlotProduct.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"Lsi8;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "slotId", "b", "t", ShoppingInfoEntity.FIELD_PRODUCT_ID, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: si8  reason: default package */
/* loaded from: classes4.dex */
public final class si8 implements Serializable {
    private final String a;
    private final String b;

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si8)) {
            return false;
        }
        si8 si8Var = (si8) obj;
        if (z65.c(this.a, si8Var.a) && z65.c(this.b, si8Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String t() {
        return this.b;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        return "PreferredSlotProduct(slotId=" + str + ", productId=" + str2 + ")";
    }
}
