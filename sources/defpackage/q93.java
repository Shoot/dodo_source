package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DynamicDeliveryInfoBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lq93;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "Llq3;", "a", "Ljava/util/List;", "()Ljava/util/List;", "levels", "<init>", "(Ljava/util/List;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: q93  reason: default package */
/* loaded from: classes2.dex */
public final class q93 implements Serializable {
    private final List<lq3> a;

    public q93(List<lq3> list) {
        z65.h(list, "levels");
        this.a = list;
    }

    public final List<lq3> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q93) && z65.c(this.a, ((q93) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        List<lq3> list = this.a;
        return "DynamicDeliveryData(levels=" + list + ")";
    }
}
