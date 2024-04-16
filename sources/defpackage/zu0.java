package defpackage;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import kotlin.Metadata;
/* compiled from: ChangeDiscount.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lzu0;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", ShoppingInfoEntity.FIELD_PRODUCT_ID, "Lqd;", "b", "Lqd;", "sender", "<init>", "(Ljava/lang/String;Lqd;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zu0  reason: default package */
/* loaded from: classes2.dex */
public final class zu0 implements dc {
    private final String a;
    private final qd b;

    public zu0(String str, qd qdVar) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(qdVar, "sender");
        this.a = str;
        this.b = qdVar;
    }

    @Override // defpackage.dc
    public qc a() {
        return vc.z(bc.e(new bc("product_badge_discount_click"), ShoppingInfoEntity.FIELD_PRODUCT_ID, this.a, false, 4, null), this.b).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu0)) {
            return false;
        }
        zu0 zu0Var = (zu0) obj;
        if (z65.c(this.a, zu0Var.a) && z65.c(this.b, zu0Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        qd qdVar = this.b;
        return "ChangeDiscount(productId=" + str + ", sender=" + qdVar + ")";
    }
}
