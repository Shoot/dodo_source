package io.realm;

import io.realm.internal.OsList;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* compiled from: RealmList.java */
/* loaded from: classes3.dex */
public class k0<E> extends AbstractList<E> implements OrderedRealmCollection<E> {
    protected Class<E> a;
    protected String b;
    private final u<E> c;
    public final io.realm.a d;
    private List<E> e;

    /* compiled from: RealmList.java */
    /* loaded from: classes3.dex */
    private class b implements Iterator<E> {
        int a;
        int b;
        int c;

        private b() {
            this.a = 0;
            this.b = -1;
            this.c = ((AbstractList) k0.this).modCount;
        }

        final void a() {
            if (((AbstractList) k0.this).modCount == this.c) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            k0.this.p();
            a();
            if (this.a != k0.this.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            k0.this.p();
            a();
            int i = this.a;
            try {
                E e = (E) k0.this.get(i);
                this.b = i;
                this.a = i + 1;
                return e;
            } catch (IndexOutOfBoundsException unused) {
                a();
                throw new NoSuchElementException("Cannot access index " + i + " when size is " + k0.this.size() + ". Remember to check hasNext() before using next().");
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            k0.this.p();
            if (this.b >= 0) {
                a();
                try {
                    k0.this.remove(this.b);
                    int i = this.b;
                    int i2 = this.a;
                    if (i < i2) {
                        this.a = i2 - 1;
                    }
                    this.b = -1;
                    this.c = ((AbstractList) k0.this).modCount;
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            }
            throw new IllegalStateException("Cannot call remove() twice. Must call next() in between.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealmList.java */
    /* loaded from: classes3.dex */
    public class c extends k0<E>.b implements ListIterator<E> {
        c(int i) {
            super();
            if (i >= 0 && i <= k0.this.size()) {
                this.a = i;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Starting location must be a valid index: [0, ");
            sb.append(k0.this.size() - 1);
            sb.append("]. Index was ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            k0.this.d.c();
            a();
            try {
                int i = this.a;
                k0.this.add(i, e);
                this.b = -1;
                this.a = i + 1;
                this.c = ((AbstractList) k0.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.a != 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.a;
        }

        @Override // java.util.ListIterator
        public E previous() {
            a();
            int i = this.a - 1;
            try {
                E e = (E) k0.this.get(i);
                this.a = i;
                this.b = i;
                return e;
            } catch (IndexOutOfBoundsException unused) {
                a();
                throw new NoSuchElementException("Cannot access index less than zero. This was " + i + ". Remember to check hasPrevious() before using previous().");
            }
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.a - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            k0.this.d.c();
            if (this.b >= 0) {
                a();
                try {
                    k0.this.set(this.b, e);
                    this.c = ((AbstractList) k0.this).modCount;
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            }
            throw new IllegalStateException();
        }
    }

    public k0() {
        this.d = null;
        this.c = null;
        this.e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        this.d.c();
    }

    private u<E> u(io.realm.a aVar, OsList osList, Class<E> cls, String str) {
        if (cls != null && !w(cls)) {
            if (cls == String.class) {
                return new r0(aVar, osList, cls);
            }
            if (cls != Long.class && cls != Integer.class && cls != Short.class && cls != Byte.class) {
                if (cls == Boolean.class) {
                    return new d(aVar, osList, cls);
                }
                if (cls == byte[].class) {
                    return new io.realm.b(aVar, osList, cls);
                }
                if (cls == Double.class) {
                    return new k(aVar, osList, cls);
                }
                if (cls == Float.class) {
                    return new o(aVar, osList, cls);
                }
                if (cls == Date.class) {
                    return new g(aVar, osList, cls);
                }
                if (cls == Decimal128.class) {
                    return new i(aVar, osList, cls);
                }
                if (cls == ObjectId.class) {
                    return new y(aVar, osList, cls);
                }
                if (cls == UUID.class) {
                    return new t0(aVar, osList, cls);
                }
                if (cls == e0.class) {
                    return new f0(aVar, osList, cls);
                }
                throw new IllegalArgumentException("Unexpected value class: " + cls.getName());
            }
            return new t(aVar, osList, cls);
        }
        return new l0(aVar, osList, cls, str);
    }

    private boolean v() {
        u<E> uVar = this.c;
        if (uVar != null && uVar.l()) {
            return true;
        }
        return false;
    }

    private static boolean w(Class<?> cls) {
        return o89.class.isAssignableFrom(cls);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        if (x()) {
            p();
            this.c.h(i, e);
        } else {
            this.e.add(i, e);
        }
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (x()) {
            p();
            this.c.n();
        } else {
            this.e.clear();
        }
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (x()) {
            this.d.c();
            if ((obj instanceof r89) && ((r89) obj).a().g() == g75.INSTANCE) {
                return false;
            }
            return super.contains(obj);
        }
        return this.e.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        if (x()) {
            p();
            return this.c.g(i);
        }
        return this.e.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        if (x()) {
            return new b();
        }
        return super.iterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        E remove;
        if (x()) {
            p();
            remove = get(i);
            this.c.m(i);
        } else {
            remove = this.e.remove(i);
        }
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        if (x() && !this.d.H()) {
            throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        if (x()) {
            p();
            return this.c.o(i, e);
        }
        return this.e.set(i, e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        if (x()) {
            p();
            return this.c.r();
        }
        return this.e.size();
    }

    public boolean t() {
        if (x()) {
            p();
            if (!this.c.k()) {
                this.c.f();
                ((AbstractList) this).modCount++;
                return true;
            }
            return false;
        }
        throw new UnsupportedOperationException("This method is only available in managed mode.");
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (!x()) {
            sb.append("RealmList<?>@[");
            int size = size();
            while (i < size) {
                E e = get(i);
                if (e instanceof o89) {
                    sb.append(System.identityHashCode(e));
                } else if (e instanceof byte[]) {
                    sb.append("byte[");
                    sb.append(((byte[]) e).length);
                    sb.append("]");
                } else {
                    sb.append(e);
                }
                sb.append(",");
                i++;
            }
            if (size() > 0) {
                sb.setLength(sb.length() - 1);
            }
            sb.append("]");
        } else {
            sb.append("RealmList<");
            String str = this.b;
            if (str != null) {
                sb.append(str);
            } else if (w(this.a)) {
                sb.append(this.d.u().h(this.a).a());
            } else {
                Class<E> cls = this.a;
                if (cls == byte[].class) {
                    sb.append(cls.getSimpleName());
                } else {
                    sb.append(cls.getName());
                }
            }
            sb.append(">@[");
            if (!v()) {
                sb.append("invalid");
            } else if (w(this.a)) {
                while (i < size()) {
                    sb.append(((r89) get(i)).a().g().E0());
                    sb.append(",");
                    i++;
                }
                if (size() > 0) {
                    sb.setLength(sb.length() - 1);
                }
            } else {
                while (i < size()) {
                    E e2 = get(i);
                    if (e2 instanceof byte[]) {
                        sb.append("byte[");
                        sb.append(((byte[]) e2).length);
                        sb.append("]");
                    } else {
                        sb.append(e2);
                    }
                    sb.append(",");
                    i++;
                }
                if (size() > 0) {
                    sb.setLength(sb.length() - 1);
                }
            }
            sb.append("]");
        }
        return sb.toString();
    }

    public boolean x() {
        if (this.d != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        if (x()) {
            return new c(i);
        }
        return super.listIterator(i);
    }

    public k0(E... eArr) {
        if (eArr != null) {
            this.d = null;
            this.c = null;
            ArrayList arrayList = new ArrayList(eArr.length);
            this.e = arrayList;
            Collections.addAll(arrayList, eArr);
            return;
        }
        throw new IllegalArgumentException("The objects argument cannot be null");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        if (x()) {
            p();
            this.c.a(e);
        } else {
            this.e.add(e);
        }
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        if (x() && !this.d.H()) {
            throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
        }
        return super.remove(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(Class<E> cls, OsList osList, io.realm.a aVar) {
        this.a = cls;
        this.c = u(aVar, osList, cls, null);
        this.d = aVar;
    }
}
