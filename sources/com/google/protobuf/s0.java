package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Protobuf.java */
/* loaded from: classes.dex */
public final class s0 {
    private static final s0 c = new s0();
    private final ConcurrentMap<Class<?>, w0<?>> b = new ConcurrentHashMap();
    private final x0 a = new c0();

    private s0() {
    }

    public static s0 a() {
        return c;
    }

    public w0<?> b(Class<?> cls, w0<?> w0Var) {
        w.b(cls, "messageType");
        w.b(w0Var, "schema");
        return this.b.putIfAbsent(cls, w0Var);
    }

    public <T> w0<T> c(Class<T> cls) {
        w.b(cls, "messageType");
        w0<T> w0Var = (w0<T>) this.b.get(cls);
        if (w0Var == null) {
            w0<T> a = this.a.a(cls);
            w0<T> w0Var2 = (w0<T>) b(cls, a);
            if (w0Var2 != null) {
                return w0Var2;
            }
            return a;
        }
        return w0Var;
    }

    public <T> w0<T> d(T t) {
        return c(t.getClass());
    }
}
