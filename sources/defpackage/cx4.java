package defpackage;

import defpackage.zw4;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
/* compiled from: ImmutableSortedSet.java */
/* renamed from: cx4  reason: default package */
/* loaded from: classes2.dex */
public abstract class cx4<E> extends dx4<E> implements NavigableSet<E>, nqa<E> {
    final transient Comparator<? super E> c;
    transient cx4<E> d;

    /* compiled from: ImmutableSortedSet.java */
    /* renamed from: cx4$a */
    /* loaded from: classes2.dex */
    public static final class a<E> extends zw4.a<E> {
        private final Comparator<? super E> f;

        public a(Comparator<? super E> comparator) {
            this.f = (Comparator) hh8.i(comparator);
        }

        @Override // defpackage.zw4.a
        /* renamed from: j */
        public a<E> f(E e) {
            super.f(e);
            return this;
        }

        public a<E> k(E... eArr) {
            super.g(eArr);
            return this;
        }

        @Override // defpackage.zw4.a
        /* renamed from: l */
        public cx4<E> i() {
            cx4<E> o0 = cx4.o0(this.f, this.b, this.a);
            this.b = o0.size();
            this.c = true;
            return o0;
        }
    }

    /* compiled from: ImmutableSortedSet.java */
    /* renamed from: cx4$b */
    /* loaded from: classes2.dex */
    private static class b<E> implements Serializable {
        final Comparator<? super E> a;
        final Object[] b;

        public b(Comparator<? super E> comparator, Object[] objArr) {
            this.a = comparator;
            this.b = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            return new a(this.a).k(this.b).i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public cx4(Comparator<? super E> comparator) {
        this.c = comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> qc9<E> I0(Comparator<? super E> comparator) {
        if (cm7.c().equals(comparator)) {
            return (qc9<E>) qc9.f;
        }
        return new qc9<>(ww4.T(), comparator);
    }

    static int X0(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> cx4<E> o0(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return I0(comparator);
        }
        n47.c(eArr, i);
        Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = (Object) eArr[i3];
            if (comparator.compare(obj, (Object) eArr[i2 - 1]) != 0) {
                eArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        if (i2 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i2);
        }
        return new qc9(ww4.E(eArr, i2), comparator);
    }

    public static <E> cx4<E> p0(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        hh8.i(comparator);
        if (oqa.b(comparator, iterable) && (iterable instanceof cx4)) {
            cx4<E> cx4Var = (cx4) iterable;
            if (!cx4Var.u()) {
                return cx4Var;
            }
        }
        Object[] c = c85.c(iterable);
        return o0(comparator, c.length, c);
    }

    public static <E> cx4<E> q0(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return p0(comparator, collection);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.NavigableSet
    /* renamed from: F0 */
    public cx4<E> descendingSet() {
        cx4<E> cx4Var = this.d;
        if (cx4Var == null) {
            cx4<E> r0 = r0();
            this.d = r0;
            r0.d = this;
            return r0;
        }
        return cx4Var;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: J0 */
    public cx4<E> headSet(E e) {
        return headSet(e, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: L0 */
    public cx4<E> headSet(E e, boolean z) {
        return N0(hh8.i(e), z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract cx4<E> N0(E e, boolean z);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: P0 */
    public cx4<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: Q0 */
    public cx4<E> subSet(E e, boolean z, E e2, boolean z2) {
        boolean z3;
        hh8.i(e);
        hh8.i(e2);
        if (this.c.compare(e, e2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        hh8.d(z3);
        return R0(e, z, e2, z2);
    }

    abstract cx4<E> R0(E e, boolean z, E e2, boolean z2);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: T0 */
    public cx4<E> tailSet(E e) {
        return tailSet(e, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: U0 */
    public cx4<E> tailSet(E e, boolean z) {
        return V0(hh8.i(e), z);
    }

    abstract cx4<E> V0(E e, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public int W0(Object obj, Object obj2) {
        return X0(this.c, obj, obj2);
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e) {
        return (E) c85.b(tailSet(e, true), null);
    }

    @Override // java.util.SortedSet, defpackage.nqa
    public Comparator<? super E> comparator() {
        return this.c;
    }

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public E floor(E e) {
        return (E) e85.c(headSet(e, true).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    public E higher(E e) {
        return (E) c85.b(tailSet(e, false), null);
    }

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public E lower(E e) {
        return (E) e85.c(headSet(e, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    abstract cx4<E> r0();

    @Override // defpackage.zw4, defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: w */
    public abstract yqb<E> iterator();

    @Override // defpackage.zw4, defpackage.uw4
    Object writeReplace() {
        return new b(this.c, toArray());
    }

    @Override // java.util.NavigableSet
    /* renamed from: x0 */
    public abstract yqb<E> descendingIterator();
}
