package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.x;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: MapFieldLite.java */
/* loaded from: classes.dex */
public final class f0<K, V> extends LinkedHashMap<K, V> {
    private static final f0 b;
    private boolean a;

    static {
        f0 f0Var = new f0();
        b = f0Var;
        f0Var.n();
    }

    private f0() {
        this.a = true;
    }

    static <K, V> int b(Map<K, V> map) {
        int i = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i += c(entry.getValue()) ^ c(entry.getKey());
        }
        return i;
    }

    private static int c(Object obj) {
        if (obj instanceof byte[]) {
            return x.d((byte[]) obj);
        }
        if (!(obj instanceof x.c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private static void d(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            x.a(obj);
            x.a(map.get(obj));
        }
    }

    public static <K, V> f0<K, V> e() {
        return b;
    }

    private void i() {
        if (m()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private static boolean j(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <K, V> boolean l(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L10
            return r3
        L10:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L2f
            return r3
        L2f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = j(r2, r1)
            if (r1 != 0) goto L18
            return r3
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.f0.l(java.util.Map, java.util.Map):boolean");
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if ((obj instanceof Map) && l(this, (Map) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return b(this);
    }

    public boolean m() {
        return this.a;
    }

    public void n() {
        this.a = false;
    }

    public void o(f0<K, V> f0Var) {
        i();
        if (!f0Var.isEmpty()) {
            putAll(f0Var);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        i();
        x.a(k);
        x.a(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        i();
        d(map);
        super.putAll(map);
    }

    public f0<K, V> q() {
        if (isEmpty()) {
            return new f0<>();
        }
        return new f0<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        i();
        return (V) super.remove(obj);
    }

    private f0(Map<K, V> map) {
        super(map);
        this.a = true;
    }
}
