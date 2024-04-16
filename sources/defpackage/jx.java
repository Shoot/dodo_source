package defpackage;

import kotlin.Metadata;
/* compiled from: AssistantWishesItemVO.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Ljx;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lzw;", "a", "Lzw;", "()Lzw;", "wish", "b", "Z", "()Z", "isSelected", "<init>", "(Lzw;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jx  reason: default package */
/* loaded from: classes2.dex */
public final class jx {
    private final zw a;
    private final boolean b;

    public jx(zw zwVar, boolean z) {
        z65.h(zwVar, "wish");
        this.a = zwVar;
        this.b = z;
    }

    public final zw a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx)) {
            return false;
        }
        jx jxVar = (jx) obj;
        if (z65.c(this.a, jxVar.a) && this.b == jxVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + a91.a(this.b);
    }

    public String toString() {
        zw zwVar = this.a;
        boolean z = this.b;
        return "AssistantWishesItemVO(wish=" + zwVar + ", isSelected=" + z + ")";
    }
}
