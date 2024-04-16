package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Protobuf.java */
/* loaded from: classes2.dex */
public final class u0 {
    private static final u0 c = new u0();
    private final ConcurrentMap<Class<?>, y0<?>> b = new ConcurrentHashMap();
    private final z0 a = new e0();

    private u0() {
    }

    public static u0 a() {
        return c;
    }

    public <T> void b(T t, x0 x0Var, o oVar) throws IOException {
        e(t).i(t, x0Var, oVar);
    }

    public y0<?> c(Class<?> cls, y0<?> y0Var) {
        y.b(cls, "messageType");
        y.b(y0Var, "schema");
        return this.b.putIfAbsent(cls, y0Var);
    }

    public <T> y0<T> d(Class<T> cls) {
        y.b(cls, "messageType");
        y0<T> y0Var = (y0<T>) this.b.get(cls);
        if (y0Var == null) {
            y0<T> a = this.a.a(cls);
            y0<T> y0Var2 = (y0<T>) c(cls, a);
            if (y0Var2 != null) {
                return y0Var2;
            }
            return a;
        }
        return y0Var;
    }

    public <T> y0<T> e(T t) {
        return d(t.getClass());
    }
}
