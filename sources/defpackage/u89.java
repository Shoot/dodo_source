package defpackage;

import io.realm.RealmCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: RealmSet.java */
/* renamed from: u89  reason: default package */
/* loaded from: classes3.dex */
public class u89<E> implements Set<E>, RealmCollection<E> {
    protected final b<E> a = new c();

    /* compiled from: RealmSet.java */
    /* renamed from: u89$b */
    /* loaded from: classes3.dex */
    private static abstract class b<E> implements Set<E>, RealmCollection<E> {
        private b() {
        }
    }

    /* compiled from: RealmSet.java */
    /* renamed from: u89$c */
    /* loaded from: classes3.dex */
    private static class c<E> extends b<E> {
        private final Set<E> a;

        c() {
            super();
            this.a = new HashSet();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(E e) {
            return this.a.add(e);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            return this.a.addAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.a.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return this.a.contains(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return this.a.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return this.a.iterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return this.a.remove(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return this.a.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return this.a.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.a.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return this.a.toArray();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.a.toArray(tArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e) {
        return this.a.add(e);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.a.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.a.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.a.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.a.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.a.toArray(tArr);
    }
}
