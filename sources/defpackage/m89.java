package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: RealmMap.java */
/* renamed from: m89  reason: default package */
/* loaded from: classes3.dex */
public abstract class m89<K, V> implements Map<K, V> {
    protected final b<K, V> a = new c();

    /* compiled from: RealmMap.java */
    /* renamed from: m89$b */
    /* loaded from: classes3.dex */
    static abstract class b<K, V> implements Map<K, V> {
        b() {
        }

        protected void b(K k) {
            if (k != null) {
                if (k.getClass() == String.class) {
                    String str = (String) k;
                    if (str.contains(".") || str.contains("$")) {
                        throw new IllegalArgumentException("Keys containing dots ('.') or dollar signs ('$') are not allowed.");
                    }
                    return;
                }
                return;
            }
            throw new NullPointerException("Null keys are not allowed.");
        }

        abstract V c(K k, V v);

        @Override // java.util.Map
        public V put(K k, V v) {
            b(k);
            return c(k, v);
        }
    }

    /* compiled from: RealmMap.java */
    /* renamed from: m89$c */
    /* loaded from: classes3.dex */
    private static class c<K, V> extends b<K, V> {
        private final Map<K, V> a;

        private c() {
            this.a = new HashMap();
        }

        @Override // defpackage.m89.b
        protected V c(K k, V v) {
            return this.a.put(k, v);
        }

        @Override // java.util.Map
        public void clear() {
            this.a.clear();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.a.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.a.containsValue(obj);
        }

        @Override // java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return this.a.entrySet();
        }

        @Override // java.util.Map
        public V get(Object obj) {
            return this.a.get(obj);
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            return this.a.keySet();
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.a.putAll(map);
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            return this.a.remove(obj);
        }

        @Override // java.util.Map
        public int size() {
            return this.a.size();
        }

        @Override // java.util.Map
        public Collection<V> values() {
            return this.a.values();
        }
    }

    @Override // java.util.Map
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.a.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.a.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.a.keySet();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        return this.a.put(k, v);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        this.a.putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return this.a.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.a.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.a.values();
    }
}
