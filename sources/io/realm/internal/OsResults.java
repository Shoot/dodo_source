package io.realm.internal;

import io.realm.internal.ObservableCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
public class OsResults implements ku6, ObservableCollection {
    private static final long h = nativeGetFinalizerPtr();
    private final long a;
    private final OsSharedRealm b;
    private final io.realm.internal.c c;
    private final Table d;
    protected boolean e;
    private boolean f = false;
    protected final e<ObservableCollection.b> g = new e<>();

    /* loaded from: classes3.dex */
    public static abstract class a<T> implements Iterator<T> {
        protected OsResults a;
        protected int b = -1;

        public a(OsResults osResults) {
            if (!osResults.b.isClosed()) {
                this.a = osResults;
                if (osResults.f) {
                    return;
                }
                if (osResults.b.isInTransaction()) {
                    b();
                    return;
                } else {
                    this.a.b.addIterator(this);
                    return;
                }
            }
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        }

        void a() {
            if (this.a != null) {
                return;
            }
            throw new ConcurrentModificationException("No outside changes to a Realm is allowed while iterating a living Realm collection.");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b() {
            this.a = this.a.d();
        }

        T c(int i) {
            return e(i, this.a);
        }

        protected abstract T e(int i, OsResults osResults);

        /* JADX INFO: Access modifiers changed from: package-private */
        public void f() {
            this.a = null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            if (this.b + 1 < this.a.n()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            int i = this.b + 1;
            this.b = i;
            if (i < this.a.n()) {
                return c(this.b);
            }
            throw new NoSuchElementException("Cannot access index " + this.b + " when size is " + this.a.n() + ". Remember to check hasNext() before using next().");
        }

        @Override // java.util.Iterator
        @Deprecated
        public void remove() {
            throw new UnsupportedOperationException("remove() is not supported by RealmResults iterators.");
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b<T> extends a<T> implements ListIterator<T> {
        public b(OsResults osResults, int i) {
            super(osResults);
            if (i >= 0 && i <= this.a.n()) {
                this.b = i - 1;
                return;
            }
            throw new IndexOutOfBoundsException("Starting location must be a valid index: [0, " + (this.a.n() - 1) + "]. Yours was " + i);
        }

        @Override // java.util.ListIterator
        @Deprecated
        public void add(T t) {
            throw new UnsupportedOperationException("Adding an element is not supported. Use Realm.createObject() instead.");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            a();
            if (this.b >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            a();
            return this.b + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            a();
            try {
                this.b--;
                return c(this.b);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException("Cannot access index less than zero. This was " + this.b + ". Remember to check hasPrevious() before using previous().");
            }
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            a();
            return this.b;
        }

        @Override // java.util.ListIterator
        @Deprecated
        public void set(T t) {
            throw new UnsupportedOperationException("Replacing an element is not supported.");
        }
    }

    /* loaded from: classes3.dex */
    public enum c {
        EMPTY,
        TABLE,
        PRIMITIVE_LIST,
        QUERY,
        TABLEVIEW;

        static c a(byte b) {
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b == 4) {
                                return TABLEVIEW;
                            }
                            throw new IllegalArgumentException("Invalid value: " + ((int) b));
                        }
                        return QUERY;
                    }
                    return PRIMITIVE_LIST;
                }
                return TABLE;
            }
            return EMPTY;
        }
    }

    OsResults(OsSharedRealm osSharedRealm, Table table, long j) {
        this.b = osSharedRealm;
        io.realm.internal.c cVar = osSharedRealm.context;
        this.c = cVar;
        this.d = table;
        this.a = j;
        cVar.a(this);
        this.e = f() != c.QUERY;
    }

    public static OsResults c(OsSharedRealm osSharedRealm, TableQuery tableQuery) {
        tableQuery.n();
        return new OsResults(osSharedRealm, tableQuery.h(), nativeCreateResults(osSharedRealm.getNativePtr(), tableQuery.getNativePtr()));
    }

    protected static native long nativeCreateResults(long j, long j2);

    private static native long nativeCreateSnapshot(long j);

    private static native void nativeEvaluateQueryIfNeeded(long j, boolean z);

    private static native long nativeFirstRow(long j);

    private static native long nativeGetFinalizerPtr();

    private static native byte nativeGetMode(long j);

    private static native long nativeGetRow(long j, int i);

    private static native Object nativeGetValue(long j, int i);

    private static native boolean nativeIsValid(long j);

    private static native long nativeSize(long j);

    private native void nativeStopListening(long j);

    public OsResults d() {
        if (this.f) {
            return this;
        }
        OsResults osResults = new OsResults(this.b, this.d, nativeCreateSnapshot(this.a));
        osResults.f = true;
        return osResults;
    }

    public UncheckedRow e() {
        long nativeFirstRow = nativeFirstRow(this.a);
        if (nativeFirstRow != 0) {
            return this.d.s(nativeFirstRow);
        }
        return null;
    }

    public c f() {
        return c.a(nativeGetMode(this.a));
    }

    public UncheckedRow g(int i) {
        return this.d.s(nativeGetRow(this.a, i));
    }

    @Override // defpackage.ku6
    public long getNativeFinalizerPtr() {
        return h;
    }

    @Override // defpackage.ku6
    public long getNativePtr() {
        return this.a;
    }

    public Object h(int i) {
        return nativeGetValue(this.a, i);
    }

    public boolean i() {
        return this.e;
    }

    public boolean j() {
        return nativeIsValid(this.a);
    }

    public void k() {
        if (this.e) {
            return;
        }
        try {
            nativeEvaluateQueryIfNeeded(this.a, false);
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains("Cannot sort on a collection property")) {
                throw new IllegalStateException("Illegal Argument: " + e.getMessage());
            }
        } catch (IllegalStateException e2) {
            throw new IllegalArgumentException("Illegal Argument: " + e2.getMessage());
        }
        notifyChangeListeners(0L);
    }

    public <T> void l(T t, am7<T> am7Var) {
        this.g.e(t, am7Var);
        if (this.g.d()) {
            nativeStopListening(this.a);
        }
    }

    public <T> void m(T t, d89<T> d89Var) {
        l(t, new ObservableCollection.c(d89Var));
    }

    public long n() {
        return nativeSize(this.a);
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j) {
        OsCollectionChangeSet osCollectionChangeSet;
        if (j == 0) {
            osCollectionChangeSet = new io.realm.internal.a();
        } else {
            osCollectionChangeSet = new OsCollectionChangeSet(j, !i());
        }
        if (osCollectionChangeSet.e() && i()) {
            return;
        }
        this.e = true;
        this.g.c(new ObservableCollection.a(osCollectionChangeSet));
    }
}
