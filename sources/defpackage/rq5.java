package defpackage;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* compiled from: LinkedTreeMap.java */
/* renamed from: rq5  reason: default package */
/* loaded from: classes2.dex */
public final class rq5<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> h = new a();
    Comparator<? super K> a;
    e<K, V> b;
    int c;
    int d;
    final e<K, V> e;
    private rq5<K, V>.b f;
    private rq5<K, V>.c g;

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: rq5$a */
    /* loaded from: classes2.dex */
    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: rq5$b */
    /* loaded from: classes2.dex */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap.java */
        /* renamed from: rq5$b$a */
        /* loaded from: classes2.dex */
        class a extends rq5<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            rq5.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && rq5.this.d((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> d;
            if (!(obj instanceof Map.Entry) || (d = rq5.this.d((Map.Entry) obj)) == null) {
                return false;
            }
            rq5.this.j(d, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return rq5.this.c;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: rq5$c */
    /* loaded from: classes2.dex */
    final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap.java */
        /* renamed from: rq5$c$a */
        /* loaded from: classes2.dex */
        class a extends rq5<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            rq5.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return rq5.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (rq5.this.k(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return rq5.this.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LinkedTreeMap.java */
    /* renamed from: rq5$d */
    /* loaded from: classes2.dex */
    public abstract class d<T> implements Iterator<T> {
        e<K, V> a;
        e<K, V> b = null;
        int c;

        d() {
            this.a = rq5.this.e.d;
            this.c = rq5.this.d;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.a;
            rq5 rq5Var = rq5.this;
            if (eVar != rq5Var.e) {
                if (rq5Var.d == this.c) {
                    this.a = eVar.d;
                    this.b = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.a != rq5.this.e) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.b;
            if (eVar != null) {
                rq5.this.j(eVar, true);
                this.b = null;
                this.c = rq5.this.d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkedTreeMap.java */
    /* renamed from: rq5$e */
    /* loaded from: classes2.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {
        e<K, V> a;
        e<K, V> b;
        e<K, V> c;
        e<K, V> d;
        e<K, V> e;
        final K f;
        V g;
        int h;

        e() {
            this.f = null;
            this.e = this;
            this.d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.b; eVar2 != null; eVar2 = eVar2.b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.c; eVar2 != null; eVar2 = eVar2.c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.g;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k = this.f;
            int i = 0;
            if (k == null) {
                hashCode = 0;
            } else {
                hashCode = k.hashCode();
            }
            V v = this.g;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.g;
            this.g = v;
            return v2;
        }

        public String toString() {
            return this.f + ContainerUtils.KEY_VALUE_DELIMITER + this.g;
        }

        e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.a = eVar;
            this.f = k;
            this.h = 1;
            this.d = eVar2;
            this.e = eVar3;
            eVar3.d = this;
            eVar2.e = this;
        }
    }

    public rq5() {
        this(h);
    }

    private boolean b(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    private void i(e<K, V> eVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (eVar != null) {
            e<K, V> eVar2 = eVar.b;
            e<K, V> eVar3 = eVar.c;
            int i5 = 0;
            if (eVar2 != null) {
                i = eVar2.h;
            } else {
                i = 0;
            }
            if (eVar3 != null) {
                i2 = eVar3.h;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                e<K, V> eVar4 = eVar3.b;
                e<K, V> eVar5 = eVar3.c;
                if (eVar5 != null) {
                    i4 = eVar5.h;
                } else {
                    i4 = 0;
                }
                if (eVar4 != null) {
                    i5 = eVar4.h;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    n(eVar3);
                    m(eVar);
                } else {
                    m(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                e<K, V> eVar6 = eVar2.b;
                e<K, V> eVar7 = eVar2.c;
                if (eVar7 != null) {
                    i3 = eVar7.h;
                } else {
                    i3 = 0;
                }
                if (eVar6 != null) {
                    i5 = eVar6.h;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    m(eVar2);
                    n(eVar);
                } else {
                    n(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                eVar.h = i + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.h = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.a;
        }
    }

    private void l(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.a;
        eVar.a = null;
        if (eVar2 != null) {
            eVar2.a = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.b == eVar) {
                eVar3.b = eVar2;
                return;
            } else {
                eVar3.c = eVar2;
                return;
            }
        }
        this.b = eVar2;
    }

    private void m(e<K, V> eVar) {
        int i;
        int i2;
        e<K, V> eVar2 = eVar.b;
        e<K, V> eVar3 = eVar.c;
        e<K, V> eVar4 = eVar3.b;
        e<K, V> eVar5 = eVar3.c;
        eVar.c = eVar4;
        if (eVar4 != null) {
            eVar4.a = eVar;
        }
        l(eVar, eVar3);
        eVar3.b = eVar;
        eVar.a = eVar3;
        int i3 = 0;
        if (eVar2 != null) {
            i = eVar2.h;
        } else {
            i = 0;
        }
        if (eVar4 != null) {
            i2 = eVar4.h;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        eVar.h = max;
        if (eVar5 != null) {
            i3 = eVar5.h;
        }
        eVar3.h = Math.max(max, i3) + 1;
    }

    private void n(e<K, V> eVar) {
        int i;
        int i2;
        e<K, V> eVar2 = eVar.b;
        e<K, V> eVar3 = eVar.c;
        e<K, V> eVar4 = eVar2.b;
        e<K, V> eVar5 = eVar2.c;
        eVar.b = eVar5;
        if (eVar5 != null) {
            eVar5.a = eVar;
        }
        l(eVar, eVar2);
        eVar2.c = eVar;
        eVar.a = eVar2;
        int i3 = 0;
        if (eVar3 != null) {
            i = eVar3.h;
        } else {
            i = 0;
        }
        if (eVar5 != null) {
            i2 = eVar5.h;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        eVar.h = max;
        if (eVar4 != null) {
            i3 = eVar4.h;
        }
        eVar2.h = Math.max(max, i3) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    e<K, V> c(K k, boolean z) {
        int i;
        e<K, V> eVar;
        Comparable comparable;
        e<K, V> eVar2;
        Comparator<? super K> comparator = this.a;
        e<K, V> eVar3 = this.b;
        if (eVar3 != null) {
            if (comparator == h) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(eVar3.f);
                } else {
                    i = comparator.compare(k, (K) eVar3.f);
                }
                if (i == 0) {
                    return eVar3;
                }
                if (i < 0) {
                    eVar2 = eVar3.b;
                } else {
                    eVar2 = eVar3.c;
                }
                if (eVar2 == null) {
                    break;
                }
                eVar3 = eVar2;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.e;
        if (eVar3 == null) {
            if (comparator == h && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar3, k, eVar4, eVar4.e);
            this.b = eVar;
        } else {
            eVar = new e<>(eVar3, k, eVar4, eVar4.e);
            if (i < 0) {
                eVar3.b = eVar;
            } else {
                eVar3.c = eVar;
            }
            i(eVar3, true);
        }
        this.c++;
        this.d++;
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.b = null;
        this.c = 0;
        this.d++;
        e<K, V> eVar = this.e;
        eVar.e = eVar;
        eVar.d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (e(obj) != null) {
            return true;
        }
        return false;
    }

    e<K, V> d(Map.Entry<?, ?> entry) {
        e<K, V> e2 = e(entry.getKey());
        if (e2 == null || !b(e2.g, entry.getValue())) {
            return null;
        }
        return e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> e(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return c(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        rq5<K, V>.b bVar = this.f;
        if (bVar == null) {
            rq5<K, V>.b bVar2 = new b();
            this.f = bVar2;
            return bVar2;
        }
        return bVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> e2 = e(obj);
        if (e2 != null) {
            return e2.g;
        }
        return null;
    }

    void j(e<K, V> eVar, boolean z) {
        e<K, V> a2;
        int i;
        if (z) {
            e<K, V> eVar2 = eVar.e;
            eVar2.d = eVar.d;
            eVar.d.e = eVar2;
        }
        e<K, V> eVar3 = eVar.b;
        e<K, V> eVar4 = eVar.c;
        e<K, V> eVar5 = eVar.a;
        int i2 = 0;
        if (eVar3 != null && eVar4 != null) {
            if (eVar3.h > eVar4.h) {
                a2 = eVar3.b();
            } else {
                a2 = eVar4.a();
            }
            j(a2, false);
            e<K, V> eVar6 = eVar.b;
            if (eVar6 != null) {
                i = eVar6.h;
                a2.b = eVar6;
                eVar6.a = a2;
                eVar.b = null;
            } else {
                i = 0;
            }
            e<K, V> eVar7 = eVar.c;
            if (eVar7 != null) {
                i2 = eVar7.h;
                a2.c = eVar7;
                eVar7.a = a2;
                eVar.c = null;
            }
            a2.h = Math.max(i, i2) + 1;
            l(eVar, a2);
            return;
        }
        if (eVar3 != null) {
            l(eVar, eVar3);
            eVar.b = null;
        } else if (eVar4 != null) {
            l(eVar, eVar4);
            eVar.c = null;
        } else {
            l(eVar, null);
        }
        i(eVar5, false);
        this.c--;
        this.d++;
    }

    e<K, V> k(Object obj) {
        e<K, V> e2 = e(obj);
        if (e2 != null) {
            j(e2, true);
        }
        return e2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        rq5<K, V>.c cVar = this.g;
        if (cVar == null) {
            rq5<K, V>.c cVar2 = new c();
            this.g = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null) {
            e<K, V> c2 = c(k, true);
            V v2 = c2.g;
            c2.g = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> k = k(obj);
        if (k != null) {
            return k.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.c;
    }

    public rq5(Comparator<? super K> comparator) {
        this.c = 0;
        this.d = 0;
        this.e = new e<>();
        this.a = comparator == null ? h : comparator;
    }
}
