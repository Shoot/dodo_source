package defpackage;

import defpackage.ww4;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: ImmutableCollection.java */
/* renamed from: uw4  reason: default package */
/* loaded from: classes2.dex */
public abstract class uw4<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] a = new Object[0];

    /* compiled from: ImmutableCollection.java */
    /* renamed from: uw4$a */
    /* loaded from: classes2.dex */
    static abstract class a<E> extends b<E> {
        Object[] a;
        int b;
        boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i) {
            yb1.b(i, "initialCapacity");
            this.a = new Object[i];
            this.b = 0;
        }

        private void e(int i) {
            Object[] objArr = this.a;
            if (objArr.length < i) {
                this.a = Arrays.copyOf(objArr, b.a(objArr.length, i));
                this.c = false;
            } else if (this.c) {
                this.a = (Object[]) objArr.clone();
                this.c = false;
            }
        }

        public a<E> b(E e) {
            hh8.i(e);
            e(this.b + 1);
            Object[] objArr = this.a;
            int i = this.b;
            this.b = i + 1;
            objArr[i] = e;
            return this;
        }

        public b<E> c(E... eArr) {
            d(eArr, eArr.length);
            return this;
        }

        final void d(Object[] objArr, int i) {
            n47.c(objArr, i);
            e(this.b + i);
            System.arraycopy(objArr, 0, this.a, this.b, i);
            this.b += i;
        }
    }

    /* compiled from: ImmutableCollection.java */
    /* renamed from: uw4$b */
    /* loaded from: classes2.dex */
    public static abstract class b<E> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static int a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    int a(Object[] objArr, int i) {
        yqb<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] d() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean u();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: w */
    public abstract yqb<E> iterator();

    Object writeReplace() {
        return new ww4.d(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        hh8.i(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] d = d();
            if (d != null) {
                return (T[]) yb8.a(d, k(), f(), tArr);
            }
            tArr = (T[]) n47.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}
