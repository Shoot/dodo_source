package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.f0;
import java.util.Map;
/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes2.dex */
class i0 implements h0 {
    private static <K, V> int i(int i, Object obj, Object obj2) {
        g0 g0Var = (g0) obj;
        f0 f0Var = (f0) obj2;
        int i2 = 0;
        if (g0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : g0Var.entrySet()) {
            i2 += f0Var.a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    private static <K, V> g0<K, V> j(Object obj, Object obj2) {
        g0<K, V> g0Var = (g0) obj;
        g0<K, V> g0Var2 = (g0) obj2;
        if (!g0Var2.isEmpty()) {
            if (!g0Var.m()) {
                g0Var = g0Var.q();
            }
            g0Var.o(g0Var2);
        }
        return g0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public f0.a<?, ?> b(Object obj) {
        ((f0) obj).c();
        return null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public Map<?, ?> c(Object obj) {
        return (g0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public Object d(Object obj) {
        return g0.e().q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public Map<?, ?> e(Object obj) {
        return (g0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public Object f(Object obj) {
        ((g0) obj).n();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public int g(int i, Object obj, Object obj2) {
        return i(i, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h0
    public boolean h(Object obj) {
        return !((g0) obj).m();
    }
}
