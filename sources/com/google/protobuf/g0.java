package com.google.protobuf;

import com.google.protobuf.d0;
import java.util.Map;
/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes.dex */
class g0 implements f0 {
    private static <K, V> int i(int i, Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        d0 d0Var = (d0) obj2;
        int i2 = 0;
        if (e0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : e0Var.entrySet()) {
            i2 += d0Var.a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    private static <K, V> e0<K, V> j(Object obj, Object obj2) {
        e0<K, V> e0Var = (e0) obj;
        e0<K, V> e0Var2 = (e0) obj2;
        if (!e0Var2.isEmpty()) {
            if (!e0Var.m()) {
                e0Var = e0Var.q();
            }
            e0Var.o(e0Var2);
        }
        return e0Var;
    }

    @Override // com.google.protobuf.f0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.protobuf.f0
    public d0.a<?, ?> b(Object obj) {
        return ((d0) obj).c();
    }

    @Override // com.google.protobuf.f0
    public Map<?, ?> c(Object obj) {
        return (e0) obj;
    }

    @Override // com.google.protobuf.f0
    public Object d(Object obj) {
        return e0.e().q();
    }

    @Override // com.google.protobuf.f0
    public Map<?, ?> e(Object obj) {
        return (e0) obj;
    }

    @Override // com.google.protobuf.f0
    public Object f(Object obj) {
        ((e0) obj).n();
        return obj;
    }

    @Override // com.google.protobuf.f0
    public int g(int i, Object obj, Object obj2) {
        return i(i, obj, obj2);
    }

    @Override // com.google.protobuf.f0
    public boolean h(Object obj) {
        return !((e0) obj).m();
    }
}
