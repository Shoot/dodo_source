package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.UncheckedRow;
import io.realm.internal.core.NativeRealmAny;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OrderedRealmCollectionImpl.java */
/* loaded from: classes3.dex */
public abstract class a0<E> extends AbstractList<E> implements OrderedRealmCollection<E> {
    public final io.realm.a a;
    final Class<E> b;
    final String c;
    final OsResults d;
    final b<E> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes3.dex */
    public static class a extends e<Byte> {
        a(io.realm.a aVar, OsResults osResults, Class<Byte> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.a0.e, io.realm.a0.b
        /* renamed from: c */
        public Byte a(int i) {
            return Byte.valueOf(((Long) this.b.h(i)).byteValue());
        }

        @Override // io.realm.a0.e, io.realm.a0.b
        /* renamed from: d */
        public Byte b(int i, OsResults osResults) {
            Long l = (Long) osResults.h(i);
            if (l == null) {
                return null;
            }
            return Byte.valueOf(l.byteValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes3.dex */
    public static abstract class b<T> {
        protected final io.realm.a a;
        protected final OsResults b;
        protected final Class<T> c;
        protected final String d;

        b(io.realm.a aVar, OsResults osResults, Class<T> cls, String str) {
            this.a = aVar;
            this.b = osResults;
            this.c = cls;
            this.d = str;
        }

        public abstract T a(int i);

        public abstract T b(int i, OsResults osResults);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes3.dex */
    public static class c extends e<Integer> {
        c(io.realm.a aVar, OsResults osResults, Class<Integer> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.a0.e, io.realm.a0.b
        /* renamed from: c */
        public Integer a(int i) {
            return Integer.valueOf(((Long) this.b.h(i)).intValue());
        }

        @Override // io.realm.a0.e, io.realm.a0.b
        /* renamed from: d */
        public Integer b(int i, OsResults osResults) {
            Long l = (Long) osResults.h(i);
            if (l == null) {
                return null;
            }
            return Integer.valueOf(l.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes3.dex */
    public static class d<T> extends b<T> {
        d(io.realm.a aVar, OsResults osResults, Class<T> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.a0.b
        public T a(int i) {
            return (T) this.a.r(this.c, this.d, this.b.g(i));
        }

        @Override // io.realm.a0.b
        public T b(int i, OsResults osResults) {
            return c(osResults.g(i));
        }

        public T c(UncheckedRow uncheckedRow) {
            return (T) this.a.r(this.c, this.d, uncheckedRow);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes3.dex */
    public static class e<T> extends b<T> {
        e(io.realm.a aVar, OsResults osResults, Class<T> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.a0.b
        public T a(int i) {
            return (T) this.b.h(i);
        }

        @Override // io.realm.a0.b
        public T b(int i, OsResults osResults) {
            return (T) osResults.h(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes3.dex */
    public static class f extends e<e0> {
        f(io.realm.a aVar, OsResults osResults, Class<e0> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.a0.e, io.realm.a0.b
        /* renamed from: c */
        public e0 a(int i) {
            return new e0(h0.b(this.a, (NativeRealmAny) this.b.h(i)));
        }

        @Override // io.realm.a0.e, io.realm.a0.b
        /* renamed from: d */
        public e0 b(int i, OsResults osResults) {
            return new e0(h0.b(this.a, (NativeRealmAny) osResults.h(i)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes3.dex */
    public class g extends OsResults.a<E> {
        g() {
            super(a0.this.d);
        }

        @Override // io.realm.internal.OsResults.a
        protected E e(int i, OsResults osResults) {
            return a0.this.e.b(i, osResults);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes3.dex */
    public class h extends OsResults.b<E> {
        h(int i) {
            super(a0.this.d, i);
        }

        @Override // io.realm.internal.OsResults.a
        protected E e(int i, OsResults osResults) {
            return a0.this.e.b(i, osResults);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes3.dex */
    public static class i extends e<Short> {
        i(io.realm.a aVar, OsResults osResults, Class<Short> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.a0.e, io.realm.a0.b
        /* renamed from: c */
        public Short a(int i) {
            return Short.valueOf(((Long) this.b.h(i)).shortValue());
        }

        @Override // io.realm.a0.e, io.realm.a0.b
        /* renamed from: d */
        public Short b(int i, OsResults osResults) {
            Long l = (Long) osResults.h(i);
            if (l == null) {
                return null;
            }
            return Short.valueOf(l.shortValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(io.realm.a aVar, OsResults osResults, Class<E> cls, b<E> bVar) {
        this(aVar, osResults, cls, null, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> b<T> a(boolean z, io.realm.a aVar, OsResults osResults, Class<T> cls, String str) {
        if (z) {
            if (cls == Integer.class) {
                return new c(aVar, osResults, Integer.class, str);
            }
            if (cls == Short.class) {
                return new i(aVar, osResults, Short.class, str);
            }
            if (cls == Byte.class) {
                return new a(aVar, osResults, Byte.class, str);
            }
            if (cls == e0.class) {
                return new f(aVar, osResults, e0.class, str);
            }
            return new e(aVar, osResults, cls, str);
        }
        return new d(aVar, osResults, cls, str);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean add(E e2) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (!isLoaded() || ((obj instanceof r89) && ((r89) obj).a().g() == g75.INSTANCE)) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            E next = it.next();
            if ((next instanceof byte[]) && (obj instanceof byte[])) {
                if (Arrays.equals((byte[]) next, (byte[]) obj)) {
                    return true;
                }
            } else if (next != null && next.equals(obj)) {
                return true;
            } else {
                if (next == null && obj == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        this.a.c();
        return this.e.a(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new g();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new h(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public E remove(int i2) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public E set(int i2, E e2) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        if (isLoaded()) {
            long n = this.d.n();
            if (n > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) n;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(io.realm.a aVar, OsResults osResults, String str, b<E> bVar) {
        this(aVar, osResults, null, str, bVar);
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public void add(int i2, E e2) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i2) {
        return new h(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    private a0(io.realm.a aVar, OsResults osResults, Class<E> cls, String str, b<E> bVar) {
        this.a = aVar;
        this.d = osResults;
        this.b = cls;
        this.c = str;
        this.e = bVar;
    }
}
