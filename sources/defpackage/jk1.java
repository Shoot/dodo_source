package defpackage;

import java.io.Serializable;
import java.util.Comparator;
/* compiled from: ComparatorOrdering.java */
/* renamed from: jk1  reason: default package */
/* loaded from: classes2.dex */
final class jk1<T> extends cm7<T> implements Serializable {
    final Comparator<T> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public jk1(Comparator<T> comparator) {
        this.a = (Comparator) hh8.i(comparator);
    }

    @Override // defpackage.cm7, java.util.Comparator
    public int compare(T t, T t2) {
        return this.a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jk1) {
            return this.a.equals(((jk1) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
