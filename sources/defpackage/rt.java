package defpackage;

import defpackage.nt;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: AssistantGeneratorResultCustomization.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lrt;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lnt$a;", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "removedIngredients", "<init>", "(Ljava/util/Set;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rt  reason: default package */
/* loaded from: classes2.dex */
public final class rt {
    private final Set<nt.a> a;

    public rt(Set<nt.a> set) {
        z65.h(set, "removedIngredients");
        this.a = set;
    }

    public final Set<nt.a> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rt) && z65.c(this.a, ((rt) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        Set<nt.a> set = this.a;
        return "AssistantGeneratorResultCustomization(removedIngredients=" + set + ")";
    }
}
