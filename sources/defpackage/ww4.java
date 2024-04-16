package defpackage;

import defpackage.uw4;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: ImmutableList.java */
/* renamed from: ww4  reason: default package */
/* loaded from: classes2.dex */
public abstract class ww4<E> extends uw4<E> implements List<E>, RandomAccess {
    private static final crb<Object> b = new b(nc9.e, 0);

    /* compiled from: ImmutableList.java */
    /* renamed from: ww4$a */
    /* loaded from: classes2.dex */
    public static final class a<E> extends uw4.a<E> {
        public a() {
            this(4);
        }

        public a<E> f(E... eArr) {
            super.c(eArr);
            return this;
        }

        public ww4<E> g() {
            this.c = true;
            return ww4.E(this.a, this.b);
        }

        a(int i) {
            super(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImmutableList.java */
    /* renamed from: ww4$b */
    /* loaded from: classes2.dex */
    public static class b<E> extends l1<E> {
        private final ww4<E> c;

        b(ww4<E> ww4Var, int i) {
            super(ww4Var.size(), i);
            this.c = ww4Var;
        }

        @Override // defpackage.l1
        protected E a(int i) {
            return this.c.get(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ImmutableList.java */
    /* renamed from: ww4$c */
    /* loaded from: classes2.dex */
    public static class c<E> extends ww4<E> {
        private final transient ww4<E> c;

        c(ww4<E> ww4Var) {
            this.c = ww4Var;
        }

        private int o0(int i) {
            return (size() - 1) - i;
        }

        private int p0(int i) {
            return size() - i;
        }

        @Override // defpackage.ww4, defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.c.contains(obj);
        }

        @Override // java.util.List
        public E get(int i) {
            hh8.g(i, size());
            return this.c.get(o0(i));
        }

        @Override // defpackage.ww4
        public ww4<E> h0() {
            return this.c;
        }

        @Override // defpackage.ww4, java.util.List
        public int indexOf(Object obj) {
            int lastIndexOf = this.c.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return o0(lastIndexOf);
            }
            return -1;
        }

        @Override // defpackage.ww4, defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // defpackage.ww4, java.util.List
        public int lastIndexOf(Object obj) {
            int indexOf = this.c.indexOf(obj);
            if (indexOf >= 0) {
                return o0(indexOf);
            }
            return -1;
        }

        @Override // defpackage.ww4, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // defpackage.ww4, java.util.List
        /* renamed from: m0 */
        public ww4<E> subList(int i, int i2) {
            hh8.m(i, i2, size());
            return this.c.subList(p0(i2), p0(i)).h0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.c.size();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.uw4
        public boolean u() {
            return this.c.u();
        }

        @Override // defpackage.ww4, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    /* compiled from: ImmutableList.java */
    /* renamed from: ww4$d */
    /* loaded from: classes2.dex */
    static class d implements Serializable {
        final Object[] a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(Object[] objArr) {
            this.a = objArr;
        }

        Object readResolve() {
            return ww4.H(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImmutableList.java */
    /* renamed from: ww4$e */
    /* loaded from: classes2.dex */
    public class e extends ww4<E> {
        final transient int c;
        final transient int d;

        e(int i, int i2) {
            this.c = i;
            this.d = i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.uw4
        public Object[] d() {
            return ww4.this.d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.uw4
        public int f() {
            return ww4.this.k() + this.c + this.d;
        }

        @Override // java.util.List
        public E get(int i) {
            hh8.g(i, this.d);
            return ww4.this.get(i + this.c);
        }

        @Override // defpackage.ww4, defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.uw4
        public int k() {
            return ww4.this.k() + this.c;
        }

        @Override // defpackage.ww4, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // defpackage.ww4, java.util.List
        /* renamed from: m0 */
        public ww4<E> subList(int i, int i2) {
            hh8.m(i, i2, this.d);
            ww4 ww4Var = ww4.this;
            int i3 = this.c;
            return ww4Var.subList(i + i3, i2 + i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.uw4
        public boolean u() {
            return true;
        }

        @Override // defpackage.ww4, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> ww4<E> E(Object[] objArr, int i) {
        if (i == 0) {
            return T();
        }
        return new nc9(objArr, i);
    }

    private static <E> ww4<E> G(Object... objArr) {
        return x(n47.b(objArr));
    }

    public static <E> ww4<E> H(E[] eArr) {
        if (eArr.length == 0) {
            return T();
        }
        return G((Object[]) eArr.clone());
    }

    public static <E> ww4<E> T() {
        return (ww4<E>) nc9.e;
    }

    public static <E> ww4<E> W(E e2, E e3) {
        return G(e2, e3);
    }

    public static <E> ww4<E> Z(E e2, E e3, E e4) {
        return G(e2, e3, e4);
    }

    public static <E> ww4<E> e0(E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return G(e2, e3, e4, e5, e6, e7, e8);
    }

    public static <E> ww4<E> l0(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        hh8.i(comparator);
        Object[] c2 = c85.c(iterable);
        n47.b(c2);
        Arrays.sort(c2, comparator);
        return x(c2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> ww4<E> x(Object[] objArr) {
        return E(objArr, objArr.length);
    }

    @Override // java.util.List
    /* renamed from: P */
    public crb<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: Q */
    public crb<E> listIterator(int i) {
        hh8.k(i, size());
        if (isEmpty()) {
            return (crb<E>) b;
        }
        return new b(this, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.uw4
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return mr5.a(this, obj);
    }

    public ww4<E> h0() {
        if (size() <= 1) {
            return this;
        }
        return new c(this);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return mr5.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return mr5.d(this, obj);
    }

    @Override // java.util.List
    /* renamed from: m0 */
    public ww4<E> subList(int i, int i2) {
        hh8.m(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return T();
        }
        return n0(i, i2);
    }

    ww4<E> n0(int i, int i2) {
        return new e(i, i2 - i);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: w */
    public yqb<E> iterator() {
        return listIterator();
    }

    @Override // defpackage.uw4
    Object writeReplace() {
        return new d(toArray());
    }
}
