package defpackage;

import kotlin.Metadata;
/* compiled from: SelectionMapData.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lx9a;", "", "", "toString", "", "hashCode", "other", "", "equals", "Laaa;", "a", "Laaa;", "()Laaa;", "b", "(Laaa;)V", "deliveryVOData", "<init>", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: x9a  reason: default package */
/* loaded from: classes2.dex */
public final class x9a {
    private aaa a;

    public x9a(aaa aaaVar) {
        z65.h(aaaVar, "deliveryVOData");
        this.a = aaaVar;
    }

    public final aaa a() {
        return this.a;
    }

    public final void b(aaa aaaVar) {
        z65.h(aaaVar, "<set-?>");
        this.a = aaaVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x9a) && z65.c(this.a, ((x9a) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        aaa aaaVar = this.a;
        return "DeliveryData(deliveryVOData=" + aaaVar + ")";
    }
}
