package defpackage;

import java.util.Collection;
import kotlin.Metadata;
/* compiled from: Upsale.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0016"}, d2 = {"Lksb;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lzsb;", "a", "Ljava/util/Collection;", "b", "()Ljava/util/Collection;", "upsaleProducts", "Lnsb;", "Lnsb;", "()Lnsb;", "upsaleExperimentInfo", "<init>", "(Ljava/util/Collection;Lnsb;)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: ksb  reason: default package */
/* loaded from: classes.dex */
public final class ksb {
    private final Collection<zsb> a;
    private final nsb b;

    public ksb() {
        this(null, null, 3, null);
    }

    public final nsb a() {
        return this.b;
    }

    public final Collection<zsb> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksb)) {
            return false;
        }
        ksb ksbVar = (ksb) obj;
        if (z65.c(this.a, ksbVar.a) && z65.c(this.b, ksbVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        Collection<zsb> collection = this.a;
        nsb nsbVar = this.b;
        return "Upsale(upsaleProducts=" + collection + ", upsaleExperimentInfo=" + nsbVar + ")";
    }

    public ksb(Collection<zsb> collection, nsb nsbVar) {
        z65.h(collection, "upsaleProducts");
        z65.h(nsbVar, "upsaleExperimentInfo");
        this.a = collection;
        this.b = nsbVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ksb(java.util.Collection r2, defpackage.nsb r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r1 = this;
            r5 = r4 & 1
            if (r5 == 0) goto La
            java.util.List r2 = defpackage.ic1.l()
            java.util.Collection r2 = (java.util.Collection) r2
        La:
            r4 = r4 & 2
            if (r4 == 0) goto L16
            nsb r3 = new nsb
            r4 = 0
            r5 = 3
            r0 = 0
            r3.<init>(r4, r0, r5, r0)
        L16:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksb.<init>(java.util.Collection, nsb, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
