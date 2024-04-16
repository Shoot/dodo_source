package com.google.protobuf;

import com.google.protobuf.r;
import com.huawei.hms.framework.common.ContainerUtils;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SmallSortedMap.java */
/* loaded from: classes.dex */
public class z0<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int a;
    private List<z0<K, V>.e> b;
    private Map<K, V> c;
    private boolean d;
    private volatile z0<K, V>.g e;
    private Map<K, V> f;
    private volatile z0<K, V>.c g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public class a<FieldDescriptorType> extends z0<FieldDescriptorType, Object> {
        a(int i) {
            super(i, null);
        }

        @Override // com.google.protobuf.z0, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((Comparable) obj, obj2);
        }

        @Override // com.google.protobuf.z0
        public void r() {
            if (!q()) {
                for (int i = 0; i < m(); i++) {
                    Map.Entry<FieldDescriptorType, Object> l = l(i);
                    if (((r.b) l.getKey()).j()) {
                        l.setValue(Collections.unmodifiableList((List) l.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : o()) {
                    if (((r.b) entry.getKey()).j()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public class c extends z0<K, V>.g {
        private c() {
            super(z0.this, null);
        }

        @Override // com.google.protobuf.z0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(z0.this, null);
        }

        /* synthetic */ c(z0 z0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public static class d {
        private static final Iterator<Object> a = new a();
        private static final Iterable<Object> b = new b();

        /* compiled from: SmallSortedMap.java */
        /* loaded from: classes.dex */
        class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap.java */
        /* loaded from: classes.dex */
        class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public class e implements Map.Entry<K, V>, Comparable<z0<K, V>.e> {
        private final K a;
        private V b;

        e(z0 z0Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean g(Object obj, Object obj2) {
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
                return false;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(z0<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (g(this.a, entry.getKey()) && g(this.b, entry.getValue())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        /* renamed from: h */
        public K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k = this.a;
            int i = 0;
            if (k == null) {
                hashCode = 0;
            } else {
                hashCode = k.hashCode();
            }
            V v = this.b;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            z0.this.i();
            V v2 = this.b;
            this.b = v;
            return v2;
        }

        public String toString() {
            return this.a + ContainerUtils.KEY_VALUE_DELIMITER + this.b;
        }

        e(K k, V v) {
            this.a = k;
            this.b = v;
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    private class f implements Iterator<Map.Entry<K, V>> {
        private int a;
        private boolean b;
        private Iterator<Map.Entry<K, V>> c;

        private f() {
            this.a = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.c == null) {
                this.c = z0.this.c.entrySet().iterator();
            }
            return this.c;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.b = true;
            int i = this.a + 1;
            this.a = i;
            if (i < z0.this.b.size()) {
                return (Map.Entry) z0.this.b.get(this.a);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a + 1 < z0.this.b.size()) {
                return true;
            }
            if (!z0.this.c.isEmpty() && a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.b) {
                this.b = false;
                z0.this.i();
                if (this.a < z0.this.b.size()) {
                    z0 z0Var = z0.this;
                    int i = this.a;
                    this.a = i - 1;
                    z0Var.u(i);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ f(z0 z0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            if (!contains(entry)) {
                z0.this.put(entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            z0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = z0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(z0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                z0.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return z0.this.size();
        }

        /* synthetic */ g(z0 z0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ z0(int i, a aVar) {
        this(i);
    }

    private int h(K k) {
        int i;
        int size = this.b.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = k.compareTo(this.b.get(i2).getKey());
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            } else if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = k.compareTo(this.b.get(i4).getKey());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (compareTo2 > 0) {
                i3 = i4 + 1;
            } else {
                return i4;
            }
        }
        i = i3 + 1;
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (!this.d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private void k() {
        i();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
    }

    private SortedMap<K, V> p() {
        i();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends r.b<FieldDescriptorType>> z0<FieldDescriptorType, Object> s(int i) {
        return new a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V u(int i) {
        i();
        V value = this.b.remove(i).getValue();
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = p().entrySet().iterator();
            this.b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (h(comparable) < 0 && !this.c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new g(this, null);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return super.equals(obj);
        }
        z0 z0Var = (z0) obj;
        int size = size();
        if (size != z0Var.size()) {
            return false;
        }
        int m = m();
        if (m != z0Var.m()) {
            return entrySet().equals(z0Var.entrySet());
        }
        for (int i = 0; i < m; i++) {
            if (!l(i).equals(z0Var.l(i))) {
                return false;
            }
        }
        if (m == size) {
            return true;
        }
        return this.c.equals(z0Var.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int h = h(comparable);
        if (h >= 0) {
            return this.b.get(h).getValue();
        }
        return this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m = m();
        int i = 0;
        for (int i2 = 0; i2 < m; i2++) {
            i += this.b.get(i2).hashCode();
        }
        if (n() > 0) {
            return i + this.c.hashCode();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> j() {
        if (this.g == null) {
            this.g = new c(this, null);
        }
        return this.g;
    }

    public Map.Entry<K, V> l(int i) {
        return this.b.get(i);
    }

    public int m() {
        return this.b.size();
    }

    public int n() {
        return this.c.size();
    }

    public Iterable<Map.Entry<K, V>> o() {
        if (this.c.isEmpty()) {
            return d.b();
        }
        return this.c.entrySet();
    }

    public boolean q() {
        return this.d;
    }

    public void r() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.d) {
            if (this.c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.c);
            }
            this.c = unmodifiableMap;
            if (this.f.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f);
            }
            this.f = unmodifiableMap2;
            this.d = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int h = h(comparable);
        if (h >= 0) {
            return (V) u(h);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.b.size() + this.c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: t */
    public V put(K k, V v) {
        i();
        int h = h(k);
        if (h >= 0) {
            return this.b.get(h).setValue(v);
        }
        k();
        int i = -(h + 1);
        if (i >= this.a) {
            return p().put(k, v);
        }
        int size = this.b.size();
        int i2 = this.a;
        if (size == i2) {
            z0<K, V>.e remove = this.b.remove(i2 - 1);
            p().put((K) remove.getKey(), remove.getValue());
        }
        this.b.add(i, new e(k, v));
        return null;
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    private class b implements Iterator<Map.Entry<K, V>> {
        private int a;
        private Iterator<Map.Entry<K, V>> b;

        private b() {
            this.a = z0.this.b.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.b == null) {
                this.b = z0.this.f.entrySet().iterator();
            }
            return this.b;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (!a().hasNext()) {
                List list = z0.this.b;
                int i = this.a - 1;
                this.a = i;
                return (Map.Entry) list.get(i);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.a;
            if ((i > 0 && i <= z0.this.b.size()) || a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(z0 z0Var, a aVar) {
            this();
        }
    }

    private z0(int i) {
        this.a = i;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }
}
