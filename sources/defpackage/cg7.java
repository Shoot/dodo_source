package defpackage;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: OrderItemCustomization.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0012"}, d2 = {"Lcg7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", Action.NAME_ATTRIBUTE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cg7  reason: default package */
/* loaded from: classes4.dex */
public final class cg7 {
    private final String a;
    private final String b;

    public cg7(String str, String str2) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg7)) {
            return false;
        }
        cg7 cg7Var = (cg7) obj;
        if (z65.c(this.a, cg7Var.a) && z65.c(this.b, cg7Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        return "OrderItemRemovedIngredient(id=" + str + ", name=" + str2 + ")";
    }
}
