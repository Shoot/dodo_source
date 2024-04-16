package defpackage;

import java.util.Comparator;
import java.util.SortedSet;
/* compiled from: SortedIterables.java */
/* renamed from: oqa  reason: default package */
/* loaded from: classes2.dex */
final class oqa {
    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        if (comparator == null) {
            return cm7.c();
        }
        return comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        hh8.i(comparator);
        hh8.i(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else if (iterable instanceof nqa) {
            comparator2 = ((nqa) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }
}
