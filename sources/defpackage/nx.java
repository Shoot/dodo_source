package defpackage;

import java.util.List;
import kotlin.Metadata;
/* compiled from: AssistantWishesVO.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lnx;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Ljx;", "a", "Ljava/util/List;", "()Ljava/util/List;", "wishes", "<init>", "(Ljava/util/List;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nx  reason: default package */
/* loaded from: classes2.dex */
public final class nx {
    private final List<jx> a;

    public nx(List<jx> list) {
        z65.h(list, "wishes");
        this.a = list;
    }

    public final List<jx> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nx) && z65.c(this.a, ((nx) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        List<jx> list = this.a;
        return "AssistantWishesVO(wishes=" + list + ")";
    }
}
