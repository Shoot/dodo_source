package defpackage;

import java.io.Serializable;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: CartItemCustomization.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0014"}, d2 = {"Lqq0;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "Lxq0;", "a", "Ljava/util/Collection;", "b", "()Ljava/util/Collection;", "removedIngredients", "addedIngredients", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: qq0  reason: default package */
/* loaded from: classes.dex */
public final class qq0 implements Serializable {
    private final Collection<xq0> a;
    private final Collection<xq0> b;

    public qq0() {
        this(null, null, 3, null);
    }

    public final Collection<xq0> a() {
        return this.b;
    }

    public final Collection<xq0> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq0)) {
            return false;
        }
        qq0 qq0Var = (qq0) obj;
        if (z65.c(this.a, qq0Var.a) && z65.c(this.b, qq0Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        Collection<xq0> collection = this.a;
        Collection<xq0> collection2 = this.b;
        return "CartItemCustomization(removedIngredients=" + collection + ", addedIngredients=" + collection2 + ")";
    }

    public qq0(Collection<xq0> collection, Collection<xq0> collection2) {
        z65.h(collection, "removedIngredients");
        z65.h(collection2, "addedIngredients");
        this.a = collection;
        this.b = collection2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ qq0(java.util.Collection r1, java.util.Collection r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto La
            java.util.List r1 = defpackage.ic1.l()
            java.util.Collection r1 = (java.util.Collection) r1
        La:
            r3 = r3 & 2
            if (r3 == 0) goto L14
            java.util.List r2 = defpackage.ic1.l()
            java.util.Collection r2 = (java.util.Collection) r2
        L14:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq0.<init>(java.util.Collection, java.util.Collection, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
