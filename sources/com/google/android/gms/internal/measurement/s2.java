package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class s2<K, V> extends LinkedHashMap<K, V> {
    private static final s2<?, ?> b;
    private boolean a;

    static {
        s2<?, ?> s2Var = new s2<>();
        b = s2Var;
        ((s2) s2Var).a = false;
    }

    private s2() {
        this.a = true;
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return d2.d((byte[]) obj);
        }
        if (!(obj instanceof l2d)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> s2<K, V> c() {
        return (s2<K, V>) b;
    }

    private final void l() {
        if (this.a) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        l();
        super.clear();
    }

    public final void d(s2<K, V> s2Var) {
        l();
        if (!s2Var.isEmpty()) {
            putAll(s2Var);
        }
    }

    public final s2<K, V> e() {
        if (isEmpty()) {
            return new s2<>();
        }
        return new s2<>(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            } else {
                                equals = value.equals(obj2);
                                continue;
                            }
                            if (!equals) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i;
    }

    public final void i() {
        this.a = false;
    }

    public final boolean j() {
        return this.a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        l();
        d2.e(k);
        d2.e(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        l();
        for (K k : map.keySet()) {
            d2.e(k);
            d2.e(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        l();
        return (V) super.remove(obj);
    }

    private s2(Map<K, V> map) {
        super(map);
        this.a = true;
    }
}
