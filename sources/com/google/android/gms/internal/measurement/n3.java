package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public class n3<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int a;
    private List<s3> b;
    private Map<K, V> c;
    private boolean d;
    private volatile v3 e;
    private Map<K, V> f;
    private volatile p3 g;

    private final int b(K k) {
        int i;
        int size = this.b.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = k.compareTo((Comparable) this.b.get(i2).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.b.get(i4).getKey());
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends h2d<FieldDescriptorType>> n3<FieldDescriptorType, Object> c(int i) {
        return new m3(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V m(int i) {
        s();
        V v = (V) this.b.remove(i).getValue();
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = r().entrySet().iterator();
            this.b.add(new s3(this, it.next()));
            it.remove();
        }
        return v;
    }

    private final SortedMap<K, V> r() {
        s();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        if (!this.d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        s();
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
        if (b(comparable) < 0 && !this.c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final V put(K k, V v) {
        s();
        int b = b(k);
        if (b >= 0) {
            return (V) this.b.get(b).setValue(v);
        }
        s();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
        int i = -(b + 1);
        if (i >= this.a) {
            return r().put(k, v);
        }
        int size = this.b.size();
        int i2 = this.a;
        if (size == i2) {
            s3 remove = this.b.remove(i2 - 1);
            r().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.b.add(i, new s3(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new v3(this);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return super.equals(obj);
        }
        n3 n3Var = (n3) obj;
        int size = size();
        if (size != n3Var.size()) {
            return false;
        }
        int i = i();
        if (i != n3Var.i()) {
            return entrySet().equals(n3Var.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!j(i2).equals(n3Var.j(i2))) {
                return false;
            }
        }
        if (i == size) {
            return true;
        }
        return this.c.equals(n3Var.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b = b(comparable);
        if (b >= 0) {
            return (V) this.b.get(b).getValue();
        }
        return this.c.get(comparable);
    }

    public void h() {
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

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i = i();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.b.get(i3).hashCode();
        }
        if (this.c.size() > 0) {
            return i2 + this.c.hashCode();
        }
        return i2;
    }

    public final int i() {
        return this.b.size();
    }

    public final Map.Entry<K, V> j(int i) {
        return this.b.get(i);
    }

    public final Iterable<Map.Entry<K, V>> l() {
        if (this.c.isEmpty()) {
            return r3.a();
        }
        return this.c.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> o() {
        if (this.g == null) {
            this.g = new p3(this);
        }
        return this.g;
    }

    public final boolean q() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        s();
        Comparable comparable = (Comparable) obj;
        int b = b(comparable);
        if (b >= 0) {
            return (V) m(b);
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

    private n3(int i) {
        this.a = i;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }
}
