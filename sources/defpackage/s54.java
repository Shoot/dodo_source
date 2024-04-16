package defpackage;

import java.util.concurrent.ConcurrentMap;
/* compiled from: ForwardingConcurrentMap.java */
/* renamed from: s54  reason: default package */
/* loaded from: classes2.dex */
public abstract class s54<K, V> extends v54<K, V> implements ConcurrentMap<K, V> {
    protected abstract ConcurrentMap<K, V> d();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v) {
        return d().putIfAbsent(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        return d().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v) {
        return d().replace(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v, V v2) {
        return d().replace(k, v, v2);
    }
}
