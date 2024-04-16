package defpackage;

import androidx.annotation.NonNull;
import defpackage.vs9;
import java.util.HashMap;
import java.util.Map;
/* compiled from: FastSafeIterableMap.java */
/* renamed from: cp3  reason: default package */
/* loaded from: classes.dex */
public class cp3<K, V> extends vs9<K, V> {
    private final HashMap<K, vs9.c<K, V>> e = new HashMap<>();

    public boolean contains(K k) {
        return this.e.containsKey(k);
    }

    @Override // defpackage.vs9
    protected vs9.c<K, V> d(K k) {
        return this.e.get(k);
    }

    @Override // defpackage.vs9
    public V k(@NonNull K k, @NonNull V v) {
        vs9.c<K, V> d = d(k);
        if (d != null) {
            return d.b;
        }
        this.e.put(k, h(k, v));
        return null;
    }

    @Override // defpackage.vs9
    public V p(@NonNull K k) {
        V v = (V) super.p(k);
        this.e.remove(k);
        return v;
    }

    public Map.Entry<K, V> t(K k) {
        if (contains(k)) {
            return this.e.get(k).d;
        }
        return null;
    }
}
