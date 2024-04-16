package defpackage;

import defpackage.atb;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: UpsaleVO.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0016"}, d2 = {"Lltb;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Latb$a;", "a", "Ljava/util/Collection;", "b", "()Ljava/util/Collection;", "upsaleProductItemVOs", "Lnsb;", "Lnsb;", "()Lnsb;", "upsaleExperimentInfo", "<init>", "(Ljava/util/Collection;Lnsb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ltb  reason: default package */
/* loaded from: classes2.dex */
public final class ltb {
    private final Collection<atb.a> a;
    private final nsb b;

    public ltb(Collection<atb.a> collection, nsb nsbVar) {
        z65.h(collection, "upsaleProductItemVOs");
        z65.h(nsbVar, "upsaleExperimentInfo");
        this.a = collection;
        this.b = nsbVar;
    }

    public final nsb a() {
        return this.b;
    }

    public final Collection<atb.a> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltb)) {
            return false;
        }
        ltb ltbVar = (ltb) obj;
        if (z65.c(this.a, ltbVar.a) && z65.c(this.b, ltbVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        Collection<atb.a> collection = this.a;
        nsb nsbVar = this.b;
        return "UpsaleVO(upsaleProductItemVOs=" + collection + ", upsaleExperimentInfo=" + nsbVar + ")";
    }
}
