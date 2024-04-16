package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: ComboConstructorPreset.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\r\u001a\u00020\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0017"}, d2 = {"Lwg1;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lzi1;", "a", "Lzi1;", "()Lzi1;", "comboProduct", "", "b", "Ljava/util/Collection;", c.a, "()Ljava/util/Collection;", "productIdsStopList", "hotAndReadyProductIds", "<init>", "(Lzi1;Ljava/util/Collection;Ljava/util/Collection;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: wg1  reason: default package */
/* loaded from: classes4.dex */
public final class wg1 {
    private final zi1 a;
    private final Collection<String> b;
    private final Collection<String> c;

    public wg1(zi1 zi1Var, Collection<String> collection, Collection<String> collection2) {
        z65.h(zi1Var, "comboProduct");
        z65.h(collection, "productIdsStopList");
        z65.h(collection2, "hotAndReadyProductIds");
        this.a = zi1Var;
        this.b = collection;
        this.c = collection2;
    }

    public final zi1 a() {
        return this.a;
    }

    public final Collection<String> b() {
        return this.c;
    }

    public final Collection<String> c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg1)) {
            return false;
        }
        wg1 wg1Var = (wg1) obj;
        if (z65.c(this.a, wg1Var.a) && z65.c(this.b, wg1Var.b) && z65.c(this.c, wg1Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        zi1 zi1Var = this.a;
        Collection<String> collection = this.b;
        Collection<String> collection2 = this.c;
        return "ComboConstructorPreset(comboProduct=" + zi1Var + ", productIdsStopList=" + collection + ", hotAndReadyProductIds=" + collection2 + ")";
    }
}
