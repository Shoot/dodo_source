package defpackage;

import java.io.Serializable;
/* compiled from: NaturalOrdering.java */
/* renamed from: qu6  reason: default package */
/* loaded from: classes2.dex */
final class qu6 extends cm7<Comparable<?>> implements Serializable {
    static final qu6 a = new qu6();

    private qu6() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.cm7, java.util.Comparator
    /* renamed from: f */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        hh8.i(comparable);
        hh8.i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
