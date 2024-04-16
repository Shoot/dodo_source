package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.e0;
import java.util.Map;
/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes.dex */
class h0 implements g0 {
    private static <K, V> int i(int i, Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        e0 e0Var = (e0) obj2;
        int i2 = 0;
        if (f0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : f0Var.entrySet()) {
            i2 += e0Var.a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    private static <K, V> f0<K, V> j(Object obj, Object obj2) {
        f0<K, V> f0Var = (f0) obj;
        f0<K, V> f0Var2 = (f0) obj2;
        if (!f0Var2.isEmpty()) {
            if (!f0Var.m()) {
                f0Var = f0Var.q();
            }
            f0Var.o(f0Var2);
        }
        return f0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public e0.a<?, ?> b(Object obj) {
        return ((e0) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public Map<?, ?> c(Object obj) {
        return (f0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public Object d(Object obj) {
        return f0.e().q();
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public Map<?, ?> e(Object obj) {
        return (f0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public Object f(Object obj) {
        ((f0) obj).n();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public int g(int i, Object obj, Object obj2) {
        return i(i, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public boolean h(Object obj) {
        return !((f0) obj).m();
    }
}
