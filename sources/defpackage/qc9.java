package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegularImmutableSortedSet.java */
/* renamed from: qc9  reason: default package */
/* loaded from: classes2.dex */
public final class qc9<E> extends cx4<E> {
    static final qc9<Comparable> f = new qc9<>(ww4.T(), cm7.c());
    final transient ww4<E> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qc9(ww4<E> ww4Var, Comparator<? super E> comparator) {
        super(comparator);
        this.e = ww4Var;
    }

    private int d1(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.e, obj, e1());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.cx4
    public cx4<E> N0(E e, boolean z) {
        return a1(0, b1(e, z));
    }

    @Override // defpackage.cx4
    cx4<E> R0(E e, boolean z, E e2, boolean z2) {
        return V0(e, z).N0(e2, z2);
    }

    @Override // defpackage.cx4
    cx4<E> V0(E e, boolean z) {
        return a1(c1(e, z), size());
    }

    @Override // defpackage.uw4
    int a(Object[] objArr, int i) {
        return this.e.a(objArr, i);
    }

    qc9<E> a1(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new qc9<>(this.e.subList(i, i2), this.c);
        }
        return cx4.I0(this.c);
    }

    int b1(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.e, hh8.i(e), comparator());
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    int c1(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.e, hh8.i(e), comparator());
        if (binarySearch >= 0) {
            if (!z) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    @Override // defpackage.cx4, java.util.NavigableSet
    public E ceiling(E e) {
        int c1 = c1(e, true);
        if (c1 == size()) {
            return null;
        }
        return this.e.get(c1);
    }

    @Override // defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            if (d1(obj) < 0) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof gq6) {
            collection = ((gq6) collection).O0();
        }
        if (oqa.b(comparator(), collection) && collection.size() > 1) {
            yqb<E> it = iterator();
            Iterator<?> it2 = collection.iterator();
            if (!it.hasNext()) {
                return false;
            }
            Object next = it2.next();
            E next2 = it.next();
            while (true) {
                try {
                    int W0 = W0(next2, next);
                    if (W0 < 0) {
                        if (!it.hasNext()) {
                            return false;
                        }
                        next2 = it.next();
                    } else if (W0 == 0) {
                        if (!it2.hasNext()) {
                            return true;
                        }
                        next = it2.next();
                    } else if (W0 > 0) {
                        break;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        } else {
            return super.containsAll(collection);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.uw4
    public Object[] d() {
        return this.e.d();
    }

    Comparator<Object> e1() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[Catch: ClassCastException | NoSuchElementException -> 0x0046, TryCatch #0 {ClassCastException | NoSuchElementException -> 0x0046, blocks: (B:17:0x002a, B:18:0x002e, B:20:0x0034, B:22:0x003e), top: B:29:0x002a }] */
    @Override // defpackage.zw4, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L17
            return r2
        L17:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L1e
            return r0
        L1e:
            java.util.Comparator<? super E> r1 = r5.c
            boolean r1 = defpackage.oqa.b(r1, r6)
            if (r1 == 0) goto L47
            java.util.Iterator r6 = r6.iterator()
            yqb r1 = r5.iterator()     // Catch: java.lang.Throwable -> L46
        L2e:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L44
            int r3 = r5.W0(r3, r4)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L2e
        L44:
            return r2
        L45:
            return r0
        L46:
            return r2
        L47:
            boolean r6 = r5.containsAll(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qc9.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.uw4
    public int f() {
        return this.e.f();
    }

    @Override // defpackage.cx4, java.util.SortedSet
    public E first() {
        if (!isEmpty()) {
            return this.e.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.cx4, java.util.NavigableSet
    public E floor(E e) {
        int b1 = b1(e, true) - 1;
        if (b1 == -1) {
            return null;
        }
        return this.e.get(b1);
    }

    @Override // defpackage.cx4, java.util.NavigableSet
    public E higher(E e) {
        int c1 = c1(e, false);
        if (c1 == size()) {
            return null;
        }
        return this.e.get(c1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.uw4
    public int k() {
        return this.e.k();
    }

    @Override // defpackage.cx4, java.util.SortedSet
    public E last() {
        if (!isEmpty()) {
            return this.e.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.cx4, java.util.NavigableSet
    public E lower(E e) {
        int b1 = b1(e, false) - 1;
        if (b1 == -1) {
            return null;
        }
        return this.e.get(b1);
    }

    @Override // defpackage.cx4
    cx4<E> r0() {
        Comparator reverseOrder = Collections.reverseOrder(this.c);
        if (isEmpty()) {
            return cx4.I0(reverseOrder);
        }
        return new qc9(this.e.h0(), reverseOrder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.e.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.uw4
    public boolean u() {
        return this.e.u();
    }

    @Override // defpackage.cx4, defpackage.zw4, defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: w */
    public yqb<E> iterator() {
        return this.e.iterator();
    }

    @Override // defpackage.cx4, java.util.NavigableSet
    /* renamed from: x0 */
    public yqb<E> descendingIterator() {
        return this.e.h0().iterator();
    }
}
