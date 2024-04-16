package defpackage;

import java.util.List;
import kotlin.Metadata;
/* compiled from: MenuV5.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\r¨\u0006\u0014"}, d2 = {"Lkh6;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lte6;", "a", "Ljava/util/List;", "()Ljava/util/List;", "items", "Lz2a;", "b", "sections", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: kh6  reason: default package */
/* loaded from: classes4.dex */
public final class kh6 {
    private final List<te6> a;
    private final List<z2a> b;

    public kh6(List<te6> list, List<z2a> list2) {
        z65.h(list, "items");
        z65.h(list2, "sections");
        this.a = list;
        this.b = list2;
    }

    public final List<te6> a() {
        return this.a;
    }

    public final List<z2a> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh6)) {
            return false;
        }
        kh6 kh6Var = (kh6) obj;
        if (z65.c(this.a, kh6Var.a) && z65.c(this.b, kh6Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        List<te6> list = this.a;
        List<z2a> list2 = this.b;
        return "MenuV5(items=" + list + ", sections=" + list2 + ")";
    }
}
