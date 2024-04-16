package defpackage;

import defpackage.t66.i;
import defpackage.t66.n;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapMakerInternalMap.java */
/* renamed from: t66  reason: default package */
/* loaded from: classes2.dex */
public class t66<K, V, E extends i<K, V, E>, S extends n<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    static final b0<Object, Object, e> j = new a();
    final transient int a;
    final transient int b;
    final transient n<K, V, E, S>[] c;
    final int d;
    final dk3<Object> e;
    final transient j<K, V, E, S> f;
    transient Set<K> g;
    transient Collection<V> h;
    transient Set<Map.Entry<K, V>> i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$a0 */
    /* loaded from: classes2.dex */
    public interface a0<K, V, E extends i<K, V, E>> extends i<K, V, E> {
        b0<K, V, E> b();
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$b */
    /* loaded from: classes2.dex */
    static abstract class b<K, V> extends s54<K, V> implements Serializable {
        final p a;
        final p b;
        final dk3<Object> c;
        final dk3<Object> d;
        final int e;
        transient ConcurrentMap<K, V> f;

        b(p pVar, p pVar2, dk3<Object> dk3Var, dk3<Object> dk3Var2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.a = pVar;
            this.b = pVar2;
            this.c = dk3Var;
            this.d = dk3Var2;
            this.e = i;
            this.f = concurrentMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.v54
        /* renamed from: d */
        public ConcurrentMap<K, V> c() {
            return this.f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void e(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject == null) {
                    return;
                }
                this.f.put(readObject, objectInputStream.readObject());
            }
        }

        s66 i(ObjectInputStream objectInputStream) throws IOException {
            return new s66().g(objectInputStream.readInt()).j(this.a).k(this.b).h(this.c).a(this.e);
        }

        void j(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.f.size());
            for (Map.Entry<K, V> entry : this.f.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$b0 */
    /* loaded from: classes2.dex */
    public interface b0<K, V, E extends i<K, V, E>> {
        E a();

        b0<K, V, E> b(ReferenceQueue<V> referenceQueue, E e);

        void clear();

        V get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$c */
    /* loaded from: classes2.dex */
    public static abstract class c<K, V, E extends i<K, V, E>> implements i<K, V, E> {
        final K a;
        final int b;
        final E c;

        c(K k, int i, E e) {
            this.a = k;
            this.b = i;
            this.c = e;
        }

        @Override // defpackage.t66.i
        public E a() {
            return this.c;
        }

        @Override // defpackage.t66.i
        public int c() {
            return this.b;
        }

        @Override // defpackage.t66.i
        public K getKey() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$c0 */
    /* loaded from: classes2.dex */
    public static final class c0<K, V, E extends i<K, V, E>> extends WeakReference<V> implements b0<K, V, E> {
        final E a;

        c0(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.a = e;
        }

        @Override // defpackage.t66.b0
        public E a() {
            return this.a;
        }

        @Override // defpackage.t66.b0
        public b0<K, V, E> b(ReferenceQueue<V> referenceQueue, E e) {
            return new c0(referenceQueue, get(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$d */
    /* loaded from: classes2.dex */
    public static abstract class d<K, V, E extends i<K, V, E>> extends WeakReference<K> implements i<K, V, E> {
        final int a;
        final E b;

        d(ReferenceQueue<K> referenceQueue, K k, int i, E e) {
            super(k, referenceQueue);
            this.a = i;
            this.b = e;
        }

        @Override // defpackage.t66.i
        public E a() {
            return this.b;
        }

        @Override // defpackage.t66.i
        public int c() {
            return this.a;
        }

        @Override // defpackage.t66.i
        public K getKey() {
            return get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$d0 */
    /* loaded from: classes2.dex */
    public final class d0 extends r1<K, V> {
        final K a;
        V b;

        d0(K k, V v) {
            this.a = k;
            this.b = v;
        }

        @Override // defpackage.r1, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.a.equals(entry.getKey()) || !this.b.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // defpackage.r1, java.util.Map.Entry
        public K getKey() {
            return this.a;
        }

        @Override // defpackage.r1, java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // defpackage.r1, java.util.Map.Entry
        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) t66.this.put(this.a, v);
            this.b = v;
            return v2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$e */
    /* loaded from: classes2.dex */
    public static final class e implements i<Object, Object, e> {
        private e() {
            throw new AssertionError();
        }

        @Override // defpackage.t66.i
        public int c() {
            throw new AssertionError();
        }

        @Override // defpackage.t66.i
        /* renamed from: d */
        public e a() {
            throw new AssertionError();
        }

        @Override // defpackage.t66.i
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // defpackage.t66.i
        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$f */
    /* loaded from: classes2.dex */
    final class f extends t66<K, V, E, S>.h<Map.Entry<K, V>> {
        f(t66 t66Var) {
            super();
        }

        @Override // java.util.Iterator
        /* renamed from: g */
        public Map.Entry<K, V> next() {
            return c();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$g */
    /* loaded from: classes2.dex */
    final class g extends m<Map.Entry<K, V>> {
        g() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            t66.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = t66.this.get(key)) == null || !t66.this.r().d(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return t66.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(t66.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || !t66.this.remove(key, entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return t66.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$h */
    /* loaded from: classes2.dex */
    public abstract class h<T> implements Iterator<T> {
        int a;
        int b = -1;
        n<K, V, E, S> c;
        AtomicReferenceArray<E> d;
        E e;
        t66<K, V, E, S>.d0 f;
        t66<K, V, E, S>.d0 g;

        h() {
            this.a = t66.this.c.length - 1;
            a();
        }

        final void a() {
            this.f = null;
            if (e() || f()) {
                return;
            }
            while (true) {
                int i = this.a;
                if (i >= 0) {
                    n<K, V, E, S>[] nVarArr = t66.this.c;
                    this.a = i - 1;
                    n<K, V, E, S> nVar = nVarArr[i];
                    this.c = nVar;
                    if (nVar.b != 0) {
                        AtomicReferenceArray<E> atomicReferenceArray = this.c.e;
                        this.d = atomicReferenceArray;
                        this.b = atomicReferenceArray.length() - 1;
                        if (f()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        boolean b(E e) {
            try {
                Object key = e.getKey();
                Object e2 = t66.this.e(e);
                if (e2 != null) {
                    this.f = new d0(key, e2);
                    this.c.w();
                    return true;
                }
                this.c.w();
                return false;
            } catch (Throwable th) {
                this.c.w();
                throw th;
            }
        }

        t66<K, V, E, S>.d0 c() {
            t66<K, V, E, S>.d0 d0Var = this.f;
            if (d0Var != null) {
                this.g = d0Var;
                a();
                return this.g;
            }
            throw new NoSuchElementException();
        }

        boolean e() {
            E e = this.e;
            if (e == null) {
                return false;
            }
            while (true) {
                this.e = (E) e.a();
                E e2 = this.e;
                if (e2 != null) {
                    if (b(e2)) {
                        return true;
                    }
                    e = this.e;
                } else {
                    return false;
                }
            }
        }

        boolean f() {
            while (true) {
                int i = this.b;
                if (i >= 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.d;
                    this.b = i - 1;
                    E e = atomicReferenceArray.get(i);
                    this.e = e;
                    if (e != null && (b(e) || e())) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.g != null) {
                z = true;
            } else {
                z = false;
            }
            yb1.c(z);
            t66.this.remove(this.g.getKey());
            this.g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$i */
    /* loaded from: classes2.dex */
    public interface i<K, V, E extends i<K, V, E>> {
        E a();

        int c();

        K getKey();

        V getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$j */
    /* loaded from: classes2.dex */
    public interface j<K, V, E extends i<K, V, E>, S extends n<K, V, E, S>> {
        p a();

        void b(S s, E e, V v);

        E c(S s, K k, int i, E e);

        p d();

        E e(S s, E e, E e2);

        S f(t66<K, V, E, S> t66Var, int i, int i2);
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$k */
    /* loaded from: classes2.dex */
    final class k extends t66<K, V, E, S>.h<K> {
        k(t66 t66Var) {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return c().getKey();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$l */
    /* loaded from: classes2.dex */
    final class l extends m<K> {
        l() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            t66.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return t66.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return t66.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new k(t66.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (t66.this.remove(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return t66.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$m */
    /* loaded from: classes2.dex */
    private static abstract class m<E> extends AbstractSet<E> {
        private m() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return t66.o(this).toArray();
        }

        /* synthetic */ m(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) t66.o(this).toArray(tArr);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$o */
    /* loaded from: classes2.dex */
    private static final class o<K, V> extends b<K, V> {
        o(p pVar, p pVar2, dk3<Object> dk3Var, dk3<Object> dk3Var2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(pVar, pVar2, dk3Var, dk3Var2, i, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f = i(objectInputStream).i();
            e(objectInputStream);
        }

        private Object readResolve() {
            return this.f;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            j(objectOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$p */
    /* loaded from: classes2.dex */
    public static abstract class p {
        public static final p a = new a("STRONG", 0);
        public static final p b = new b("WEAK", 1);
        private static final /* synthetic */ p[] c = a();

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: t66$p$a */
        /* loaded from: classes2.dex */
        enum a extends p {
            a(String str, int i) {
                super(str, i, null);
            }

            @Override // defpackage.t66.p
            dk3<Object> i() {
                return dk3.c();
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: t66$p$b */
        /* loaded from: classes2.dex */
        enum b extends p {
            b(String str, int i) {
                super(str, i, null);
            }

            @Override // defpackage.t66.p
            dk3<Object> i() {
                return dk3.f();
            }
        }

        private p(String str, int i) {
        }

        private static /* synthetic */ p[] a() {
            return new p[]{a, b};
        }

        public static p valueOf(String str) {
            return (p) Enum.valueOf(p.class, str);
        }

        public static p[] values() {
            return (p[]) c.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract dk3<Object> i();

        /* synthetic */ p(String str, int i, a aVar) {
            this(str, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$q */
    /* loaded from: classes2.dex */
    public static final class q<K, V> extends c<K, V, q<K, V>> implements i {
        private volatile V d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: t66$q$a */
        /* loaded from: classes2.dex */
        public static final class a<K, V> implements j<K, V, q<K, V>, r<K, V>> {
            private static final a<?, ?> a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) a;
            }

            @Override // defpackage.t66.j
            public p a() {
                return p.a;
            }

            @Override // defpackage.t66.j
            public p d() {
                return p.a;
            }

            @Override // defpackage.t66.j
            /* renamed from: g */
            public q<K, V> e(r<K, V> rVar, q<K, V> qVar, q<K, V> qVar2) {
                return qVar.d(qVar2);
            }

            @Override // defpackage.t66.j
            /* renamed from: i */
            public q<K, V> c(r<K, V> rVar, K k, int i, q<K, V> qVar) {
                return new q<>(k, i, qVar);
            }

            @Override // defpackage.t66.j
            /* renamed from: j */
            public r<K, V> f(t66<K, V, q<K, V>, r<K, V>> t66Var, int i, int i2) {
                return new r<>(t66Var, i, i2);
            }

            @Override // defpackage.t66.j
            /* renamed from: k */
            public void b(r<K, V> rVar, q<K, V> qVar, V v) {
                qVar.e(v);
            }
        }

        q(K k, int i, q<K, V> qVar) {
            super(k, i, qVar);
            this.d = null;
        }

        q<K, V> d(q<K, V> qVar) {
            q<K, V> qVar2 = new q<>(this.a, this.b, qVar);
            qVar2.d = this.d;
            return qVar2;
        }

        void e(V v) {
            this.d = v;
        }

        @Override // defpackage.t66.i
        public V getValue() {
            return this.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$s */
    /* loaded from: classes2.dex */
    public static final class s<K, V> extends c<K, V, s<K, V>> implements a0<K, V, s<K, V>> {
        private volatile b0<K, V, s<K, V>> d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: t66$s$a */
        /* loaded from: classes2.dex */
        public static final class a<K, V> implements j<K, V, s<K, V>, t<K, V>> {
            private static final a<?, ?> a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) a;
            }

            @Override // defpackage.t66.j
            public p a() {
                return p.b;
            }

            @Override // defpackage.t66.j
            public p d() {
                return p.a;
            }

            @Override // defpackage.t66.j
            /* renamed from: g */
            public s<K, V> e(t<K, V> tVar, s<K, V> sVar, s<K, V> sVar2) {
                if (n.q(sVar)) {
                    return null;
                }
                return sVar.d(((t) tVar).h, sVar2);
            }

            @Override // defpackage.t66.j
            /* renamed from: i */
            public s<K, V> c(t<K, V> tVar, K k, int i, s<K, V> sVar) {
                return new s<>(k, i, sVar);
            }

            @Override // defpackage.t66.j
            /* renamed from: j */
            public t<K, V> f(t66<K, V, s<K, V>, t<K, V>> t66Var, int i, int i2) {
                return new t<>(t66Var, i, i2);
            }

            @Override // defpackage.t66.j
            /* renamed from: k */
            public void b(t<K, V> tVar, s<K, V> sVar, V v) {
                sVar.e(v, ((t) tVar).h);
            }
        }

        s(K k, int i, s<K, V> sVar) {
            super(k, i, sVar);
            this.d = t66.q();
        }

        @Override // defpackage.t66.a0
        public b0<K, V, s<K, V>> b() {
            return this.d;
        }

        s<K, V> d(ReferenceQueue<V> referenceQueue, s<K, V> sVar) {
            s<K, V> sVar2 = new s<>(this.a, this.b, sVar);
            sVar2.d = this.d.b(referenceQueue, sVar2);
            return sVar2;
        }

        void e(V v, ReferenceQueue<V> referenceQueue) {
            b0<K, V, s<K, V>> b0Var = this.d;
            this.d = new c0(referenceQueue, v, this);
            b0Var.clear();
        }

        @Override // defpackage.t66.i
        public V getValue() {
            return this.d.get();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$u */
    /* loaded from: classes2.dex */
    final class u extends t66<K, V, E, S>.h<V> {
        u(t66 t66Var) {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return c().getValue();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$v */
    /* loaded from: classes2.dex */
    final class v extends AbstractCollection<V> {
        v() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            t66.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return t66.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return t66.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new u(t66.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return t66.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return t66.o(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) t66.o(this).toArray(tArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$w */
    /* loaded from: classes2.dex */
    public static final class w<K, V> extends d<K, V, w<K, V>> implements i {
        private volatile V c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: t66$w$a */
        /* loaded from: classes2.dex */
        public static final class a<K, V> implements j<K, V, w<K, V>, x<K, V>> {
            private static final a<?, ?> a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) a;
            }

            @Override // defpackage.t66.j
            public p a() {
                return p.a;
            }

            @Override // defpackage.t66.j
            public p d() {
                return p.b;
            }

            @Override // defpackage.t66.j
            /* renamed from: g */
            public w<K, V> e(x<K, V> xVar, w<K, V> wVar, w<K, V> wVar2) {
                if (wVar.getKey() == null) {
                    return null;
                }
                return wVar.d(((x) xVar).h, wVar2);
            }

            @Override // defpackage.t66.j
            /* renamed from: i */
            public w<K, V> c(x<K, V> xVar, K k, int i, w<K, V> wVar) {
                return new w<>(((x) xVar).h, k, i, wVar);
            }

            @Override // defpackage.t66.j
            /* renamed from: j */
            public x<K, V> f(t66<K, V, w<K, V>, x<K, V>> t66Var, int i, int i2) {
                return new x<>(t66Var, i, i2);
            }

            @Override // defpackage.t66.j
            /* renamed from: k */
            public void b(x<K, V> xVar, w<K, V> wVar, V v) {
                wVar.e(v);
            }
        }

        w(ReferenceQueue<K> referenceQueue, K k, int i, w<K, V> wVar) {
            super(referenceQueue, k, i, wVar);
            this.c = null;
        }

        w<K, V> d(ReferenceQueue<K> referenceQueue, w<K, V> wVar) {
            w<K, V> wVar2 = new w<>(referenceQueue, getKey(), this.a, wVar);
            wVar2.e(this.c);
            return wVar2;
        }

        void e(V v) {
            this.c = v;
        }

        @Override // defpackage.t66.i
        public V getValue() {
            return this.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$y */
    /* loaded from: classes2.dex */
    public static final class y<K, V> extends d<K, V, y<K, V>> implements a0<K, V, y<K, V>> {
        private volatile b0<K, V, y<K, V>> c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: t66$y$a */
        /* loaded from: classes2.dex */
        public static final class a<K, V> implements j<K, V, y<K, V>, z<K, V>> {
            private static final a<?, ?> a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return (a<K, V>) a;
            }

            @Override // defpackage.t66.j
            public p a() {
                return p.b;
            }

            @Override // defpackage.t66.j
            public p d() {
                return p.b;
            }

            @Override // defpackage.t66.j
            /* renamed from: g */
            public y<K, V> e(z<K, V> zVar, y<K, V> yVar, y<K, V> yVar2) {
                if (yVar.getKey() == null || n.q(yVar)) {
                    return null;
                }
                return yVar.d(((z) zVar).h, ((z) zVar).i, yVar2);
            }

            @Override // defpackage.t66.j
            /* renamed from: i */
            public y<K, V> c(z<K, V> zVar, K k, int i, y<K, V> yVar) {
                return new y<>(((z) zVar).h, k, i, yVar);
            }

            @Override // defpackage.t66.j
            /* renamed from: j */
            public z<K, V> f(t66<K, V, y<K, V>, z<K, V>> t66Var, int i, int i2) {
                return new z<>(t66Var, i, i2);
            }

            @Override // defpackage.t66.j
            /* renamed from: k */
            public void b(z<K, V> zVar, y<K, V> yVar, V v) {
                yVar.e(v, ((z) zVar).i);
            }
        }

        y(ReferenceQueue<K> referenceQueue, K k, int i, y<K, V> yVar) {
            super(referenceQueue, k, i, yVar);
            this.c = t66.q();
        }

        @Override // defpackage.t66.a0
        public b0<K, V, y<K, V>> b() {
            return this.c;
        }

        y<K, V> d(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, y<K, V> yVar) {
            y<K, V> yVar2 = new y<>(referenceQueue, getKey(), this.a, yVar);
            yVar2.c = this.c.b(referenceQueue2, yVar2);
            return yVar2;
        }

        void e(V v, ReferenceQueue<V> referenceQueue) {
            b0<K, V, y<K, V>> b0Var = this.c;
            this.c = new c0(referenceQueue, v, this);
            b0Var.clear();
        }

        @Override // defpackage.t66.i
        public V getValue() {
            return this.c.get();
        }
    }

    private t66(s66 s66Var, j<K, V, E, S> jVar) {
        this.d = Math.min(s66Var.b(), 65536);
        this.e = s66Var.d();
        this.f = jVar;
        int min = Math.min(s66Var.c(), 1073741824);
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i4 < this.d) {
            i5++;
            i4 <<= 1;
        }
        this.b = 32 - i5;
        this.a = i4 - 1;
        this.c = j(i4);
        int i6 = min / i4;
        while (i3 < (i4 * i6 < min ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        while (true) {
            n<K, V, E, S>[] nVarArr = this.c;
            if (i2 < nVarArr.length) {
                nVarArr[i2] = d(i3, -1);
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> t66<K, V, ? extends i<K, V, ?>, ?> c(s66 s66Var) {
        p e2 = s66Var.e();
        p pVar = p.a;
        if (e2 == pVar && s66Var.f() == pVar) {
            return new t66<>(s66Var, q.a.h());
        }
        if (s66Var.e() == pVar && s66Var.f() == p.b) {
            return new t66<>(s66Var, s.a.h());
        }
        p e3 = s66Var.e();
        p pVar2 = p.b;
        if (e3 == pVar2 && s66Var.f() == pVar) {
            return new t66<>(s66Var, w.a.h());
        }
        if (s66Var.e() == pVar2 && s66Var.f() == pVar2) {
            return new t66<>(s66Var, y.a.h());
        }
        throw new AssertionError();
    }

    static int m(int i2) {
        int i3 = i2 + ((i2 << 15) ^ (-12931));
        int i4 = i3 ^ (i3 >>> 10);
        int i5 = i4 + (i4 << 3);
        int i6 = i5 ^ (i5 >>> 6);
        int i7 = i6 + (i6 << 2) + (i6 << 14);
        return i7 ^ (i7 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> o(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        e85.a(arrayList, collection.iterator());
        return arrayList;
    }

    static <K, V, E extends i<K, V, E>> b0<K, V, E> q() {
        return (b0<K, V, E>) j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (n<K, V, E, S> nVar : this.c) {
            nVar.a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int i2 = i(obj);
        return n(i2).c(obj, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        n<K, V, E, S>[] nVarArr = this.c;
        long j2 = -1;
        int i2 = 0;
        while (i2 < 3) {
            long j3 = 0;
            for (z zVar : nVarArr) {
                int i3 = zVar.b;
                AtomicReferenceArray<E> atomicReferenceArray = zVar.e;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    for (E e2 = atomicReferenceArray.get(i4); e2 != null; e2 = e2.a()) {
                        Object n2 = zVar.n(e2);
                        if (n2 != null && r().d(obj, n2)) {
                            return true;
                        }
                    }
                }
                j3 += zVar.c;
            }
            if (j3 == j2) {
                return false;
            }
            i2++;
            j2 = j3;
        }
        return false;
    }

    n<K, V, E, S> d(int i2, int i3) {
        return (S) this.f.f(this, i2, i3);
    }

    V e(E e2) {
        if (e2.getKey() == null) {
            return null;
        }
        return (V) e2.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.i;
        if (set == null) {
            g gVar = new g();
            this.i = gVar;
            return gVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int i2 = i(obj);
        return n(i2).j(obj, i2);
    }

    int i(Object obj) {
        return m(this.e.e(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        n<K, V, E, S>[] nVarArr = this.c;
        long j2 = 0;
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            if (nVarArr[i2].b != 0) {
                return false;
            }
            j2 += nVarArr[i2].c;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < nVarArr.length; i3++) {
            if (nVarArr[i3].b != 0) {
                return false;
            }
            j2 -= nVarArr[i3].c;
        }
        if (j2 != 0) {
            return false;
        }
        return true;
    }

    final n<K, V, E, S>[] j(int i2) {
        return new n[i2];
    }

    void k(E e2) {
        int c2 = e2.c();
        n(c2).E(e2, c2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.g;
        if (set == null) {
            l lVar = new l();
            this.g = lVar;
            return lVar;
        }
        return set;
    }

    void l(b0<K, V, E> b0Var) {
        E a2 = b0Var.a();
        int c2 = a2.c();
        n(c2).G((K) a2.getKey(), c2, b0Var);
    }

    n<K, V, E, S> n(int i2) {
        return this.c[(i2 >>> this.b) & this.a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v2) {
        hh8.i(k2);
        hh8.i(v2);
        int i2 = i(k2);
        return n(i2).y(k2, i2, v2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k2, V v2) {
        hh8.i(k2);
        hh8.i(v2);
        int i2 = i(k2);
        return n(i2).y(k2, i2, v2, true);
    }

    dk3<Object> r() {
        return this.f.a().i();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int i2 = i(obj);
        return n(i2).H(obj, i2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k2, V v2, V v3) {
        hh8.i(k2);
        hh8.i(v3);
        if (v2 == null) {
            return false;
        }
        int i2 = i(k2);
        return n(i2).N(k2, i2, v2, v3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = 0;
        for (n<K, V, E, S> nVar : this.c) {
            j2 += nVar.b;
        }
        return e75.b(j2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.h;
        if (collection == null) {
            v vVar = new v();
            this.h = vVar;
            return vVar;
        }
        return collection;
    }

    Object writeReplace() {
        return new o(this.f.d(), this.f.a(), this.e, this.f.a().i(), this.d, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int i2 = i(obj);
        return n(i2).K(obj, i2, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k2, V v2) {
        hh8.i(k2);
        hh8.i(v2);
        int i2 = i(k2);
        return n(i2).M(k2, i2, v2);
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$a */
    /* loaded from: classes2.dex */
    class a implements b0<Object, Object, e> {
        a() {
        }

        @Override // defpackage.t66.b0
        /* renamed from: d */
        public e a() {
            return null;
        }

        @Override // defpackage.t66.b0
        public Object get() {
            return null;
        }

        @Override // defpackage.t66.b0
        public void clear() {
        }

        @Override // defpackage.t66.b0
        /* renamed from: c */
        public b0<Object, Object, e> b(ReferenceQueue<Object> referenceQueue, e eVar) {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$n */
    /* loaded from: classes2.dex */
    public static abstract class n<K, V, E extends i<K, V, E>, S extends n<K, V, E, S>> extends ReentrantLock {
        final t66<K, V, E, S> a;
        volatile int b;
        int c;
        int d;
        volatile AtomicReferenceArray<E> e;
        final int f;
        final AtomicInteger g = new AtomicInteger();

        n(t66<K, V, E, S> t66Var, int i, int i2) {
            this.a = t66Var;
            this.f = i2;
            o(u(i));
        }

        static <K, V, E extends i<K, V, E>> boolean q(E e) {
            if (e.getValue() == null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean E(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = atomicReferenceArray.get(length);
                for (i iVar = e2; iVar != null; iVar = iVar.a()) {
                    if (iVar == e) {
                        this.c++;
                        atomicReferenceArray.set(length, L(e2, iVar));
                        this.b--;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean G(K k, int i, b0<K, V, E> b0Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (i iVar = e; iVar != null; iVar = iVar.a()) {
                    Object key = iVar.getKey();
                    if (iVar.c() == i && key != null && this.a.e.d(k, key)) {
                        if (((a0) iVar).b() != b0Var) {
                            return false;
                        }
                        this.c++;
                        atomicReferenceArray.set(length, L(e, iVar));
                        this.b--;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        V H(Object obj, int i) {
            lock();
            try {
                x();
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (i iVar = e; iVar != null; iVar = iVar.a()) {
                    Object key = iVar.getKey();
                    if (iVar.c() == i && key != null && this.a.e.d(obj, key)) {
                        V v = (V) iVar.getValue();
                        if (v == null && !q(iVar)) {
                            return null;
                        }
                        this.c++;
                        atomicReferenceArray.set(length, L(e, iVar));
                        this.b--;
                        return v;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
            if (r8.a.r().d(r11, r4.getValue()) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
            if (q(r4) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
            r8.c++;
            r0.set(r1, L(r3, r4));
            r8.b--;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
            return false;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean K(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.x()     // Catch: java.lang.Throwable -> L5c
                java.util.concurrent.atomic.AtomicReferenceArray<E extends t66$i<K, V, E>> r0 = r8.e     // Catch: java.lang.Throwable -> L5c
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L5c
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L5c
                t66$i r3 = (defpackage.t66.i) r3     // Catch: java.lang.Throwable -> L5c
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L67
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L5c
                int r7 = r4.c()     // Catch: java.lang.Throwable -> L5c
                if (r7 != r10) goto L62
                if (r6 == 0) goto L62
                t66<K, V, E extends t66$i<K, V, E>, S extends t66$n<K, V, E, S>> r7 = r8.a     // Catch: java.lang.Throwable -> L5c
                dk3<java.lang.Object> r7 = r7.e     // Catch: java.lang.Throwable -> L5c
                boolean r6 = r7.d(r9, r6)     // Catch: java.lang.Throwable -> L5c
                if (r6 == 0) goto L62
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L5c
                t66<K, V, E extends t66$i<K, V, E>, S extends t66$n<K, V, E, S>> r10 = r8.a     // Catch: java.lang.Throwable -> L5c
                dk3 r10 = r10.r()     // Catch: java.lang.Throwable -> L5c
                boolean r9 = r10.d(r11, r9)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L41
                r5 = 1
                goto L47
            L41:
                boolean r9 = q(r4)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L5e
            L47:
                int r9 = r8.c     // Catch: java.lang.Throwable -> L5c
                int r9 = r9 + r2
                r8.c = r9     // Catch: java.lang.Throwable -> L5c
                t66$i r9 = r8.L(r3, r4)     // Catch: java.lang.Throwable -> L5c
                int r10 = r8.b     // Catch: java.lang.Throwable -> L5c
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L5c
                r8.b = r10     // Catch: java.lang.Throwable -> L5c
                r8.unlock()
                return r5
            L5c:
                r9 = move-exception
                goto L6b
            L5e:
                r8.unlock()
                return r5
            L62:
                t66$i r4 = r4.a()     // Catch: java.lang.Throwable -> L5c
                goto L16
            L67:
                r8.unlock()
                return r5
            L6b:
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.t66.n.K(java.lang.Object, int, java.lang.Object):boolean");
        }

        E L(E e, E e2) {
            int i = this.b;
            E e3 = (E) e2.a();
            while (e != e2) {
                E d = d(e, e3);
                if (d != null) {
                    e3 = d;
                } else {
                    i--;
                }
                e = (E) e.a();
            }
            this.b = i;
            return e3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        V M(K k, int i, V v) {
            lock();
            try {
                x();
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (i iVar = e; iVar != null; iVar = iVar.a()) {
                    Object key = iVar.getKey();
                    if (iVar.c() == i && key != null && this.a.e.d(k, key)) {
                        V v2 = (V) iVar.getValue();
                        if (v2 == null) {
                            if (q(iVar)) {
                                this.c++;
                                atomicReferenceArray.set(length, L(e, iVar));
                                this.b--;
                            }
                            return null;
                        }
                        this.c++;
                        T(iVar, v);
                        return v2;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean N(K k, int i, V v, V v2) {
            lock();
            try {
                x();
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (i iVar = e; iVar != null; iVar = iVar.a()) {
                    Object key = iVar.getKey();
                    if (iVar.c() == i && key != null && this.a.e.d(k, key)) {
                        Object value = iVar.getValue();
                        if (value == null) {
                            if (q(iVar)) {
                                this.c++;
                                atomicReferenceArray.set(length, L(e, iVar));
                                this.b--;
                            }
                            return false;
                        } else if (!this.a.r().d(v, value)) {
                            return false;
                        } else {
                            this.c++;
                            T(iVar, v2);
                            return true;
                        }
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        void P() {
            Q();
        }

        void Q() {
            if (tryLock()) {
                try {
                    s();
                    this.g.set(0);
                } finally {
                    unlock();
                }
            }
        }

        abstract S S();

        void T(E e, V v) {
            this.a.f.b(S(), e, v);
        }

        void W() {
            if (tryLock()) {
                try {
                    s();
                } finally {
                    unlock();
                }
            }
        }

        void a() {
            if (this.b != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.e;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    r();
                    this.g.set(0);
                    this.c++;
                    this.b = 0;
                    unlock();
                } catch (Throwable th) {
                    unlock();
                    throw th;
                }
            }
        }

        <T> void b(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        boolean c(Object obj, int i) {
            try {
                boolean z = false;
                if (this.b == 0) {
                    return false;
                }
                E m = m(obj, i);
                if (m != null) {
                    if (m.getValue() != null) {
                        z = true;
                    }
                }
                return z;
            } finally {
                w();
            }
        }

        E d(E e, E e2) {
            return this.a.f.e(S(), e, e2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        void e(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll != null) {
                    this.a.k((i) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        void f(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll != null) {
                    this.a.l((b0) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        void i() {
            AtomicReferenceArray<E> atomicReferenceArray = this.e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.b;
            AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray<E>) u(length << 1);
            this.d = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E e = atomicReferenceArray.get(i2);
                if (e != null) {
                    i a = e.a();
                    int c = e.c() & length2;
                    if (a == null) {
                        atomicReferenceArray2.set(c, e);
                    } else {
                        i iVar = e;
                        while (a != null) {
                            int c2 = a.c() & length2;
                            if (c2 != c) {
                                iVar = a;
                                c = c2;
                            }
                            a = a.a();
                        }
                        atomicReferenceArray2.set(c, iVar);
                        while (e != iVar) {
                            int c3 = e.c() & length2;
                            i d = d(e, (i) atomicReferenceArray2.get(c3));
                            if (d != null) {
                                atomicReferenceArray2.set(c3, d);
                            } else {
                                i--;
                            }
                            e = e.a();
                        }
                    }
                }
            }
            this.e = atomicReferenceArray2;
            this.b = i;
        }

        V j(Object obj, int i) {
            try {
                E m = m(obj, i);
                if (m == null) {
                    w();
                    return null;
                }
                V v = (V) m.getValue();
                if (v == null) {
                    W();
                }
                return v;
            } finally {
                w();
            }
        }

        E k(Object obj, int i) {
            if (this.b != 0) {
                for (E l = l(i); l != null; l = (E) l.a()) {
                    if (l.c() == i) {
                        Object key = l.getKey();
                        if (key == null) {
                            W();
                        } else if (this.a.e.d(obj, key)) {
                            return l;
                        }
                    }
                }
                return null;
            }
            return null;
        }

        E l(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.e;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        E m(Object obj, int i) {
            return k(obj, i);
        }

        V n(E e) {
            if (e.getKey() == null) {
                W();
                return null;
            }
            V v = (V) e.getValue();
            if (v == null) {
                W();
                return null;
            }
            return v;
        }

        void o(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.d = length;
            if (length == this.f) {
                this.d = length + 1;
            }
            this.e = atomicReferenceArray;
        }

        AtomicReferenceArray<E> u(int i) {
            return new AtomicReferenceArray<>(i);
        }

        void w() {
            if ((this.g.incrementAndGet() & 63) == 0) {
                P();
            }
        }

        void x() {
            Q();
        }

        /* JADX WARN: Multi-variable type inference failed */
        V y(K k, int i, V v, boolean z) {
            lock();
            try {
                x();
                int i2 = this.b + 1;
                if (i2 > this.d) {
                    i();
                    i2 = this.b + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (i iVar = e; iVar != null; iVar = iVar.a()) {
                    Object key = iVar.getKey();
                    if (iVar.c() == i && key != null && this.a.e.d(k, key)) {
                        V v2 = (V) iVar.getValue();
                        if (v2 == null) {
                            this.c++;
                            T(iVar, v);
                            this.b = this.b;
                            unlock();
                            return null;
                        } else if (z) {
                            unlock();
                            return v2;
                        } else {
                            this.c++;
                            T(iVar, v);
                            unlock();
                            return v2;
                        }
                    }
                }
                this.c++;
                E c = this.a.f.c(S(), k, i, e);
                T(c, v);
                atomicReferenceArray.set(length, c);
                this.b = i2;
                unlock();
                return null;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }

        void r() {
        }

        void s() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$r */
    /* loaded from: classes2.dex */
    public static final class r<K, V> extends n<K, V, q<K, V>, r<K, V>> {
        r(t66<K, V, q<K, V>, r<K, V>> t66Var, int i, int i2) {
            super(t66Var, i, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.t66.n
        /* renamed from: Z */
        public r<K, V> S() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$t */
    /* loaded from: classes2.dex */
    public static final class t<K, V> extends n<K, V, s<K, V>, t<K, V>> {
        private final ReferenceQueue<V> h;

        t(t66<K, V, s<K, V>, t<K, V>> t66Var, int i, int i2) {
            super(t66Var, i, i2);
            this.h = new ReferenceQueue<>();
        }

        @Override // defpackage.t66.n
        void r() {
            b((ReferenceQueue<V>) this.h);
        }

        @Override // defpackage.t66.n
        void s() {
            f(this.h);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.t66.n
        /* renamed from: b0 */
        public t<K, V> S() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$x */
    /* loaded from: classes2.dex */
    public static final class x<K, V> extends n<K, V, w<K, V>, x<K, V>> {
        private final ReferenceQueue<K> h;

        x(t66<K, V, w<K, V>, x<K, V>> t66Var, int i, int i2) {
            super(t66Var, i, i2);
            this.h = new ReferenceQueue<>();
        }

        @Override // defpackage.t66.n
        void r() {
            b((ReferenceQueue<K>) this.h);
        }

        @Override // defpackage.t66.n
        void s() {
            e(this.h);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.t66.n
        /* renamed from: b0 */
        public x<K, V> S() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: t66$z */
    /* loaded from: classes2.dex */
    public static final class z<K, V> extends n<K, V, y<K, V>, z<K, V>> {
        private final ReferenceQueue<K> h;
        private final ReferenceQueue<V> i;

        z(t66<K, V, y<K, V>, z<K, V>> t66Var, int i, int i2) {
            super(t66Var, i, i2);
            this.h = new ReferenceQueue<>();
            this.i = new ReferenceQueue<>();
        }

        @Override // defpackage.t66.n
        void r() {
            b((ReferenceQueue<K>) this.h);
        }

        @Override // defpackage.t66.n
        void s() {
            e(this.h);
            f(this.i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.t66.n
        /* renamed from: e0 */
        public z<K, V> S() {
            return this;
        }
    }
}
