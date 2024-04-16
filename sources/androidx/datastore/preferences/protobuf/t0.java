package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Protobuf.java */
/* loaded from: classes.dex */
public final class t0 {
    private static final t0 c = new t0();
    private final ConcurrentMap<Class<?>, x0<?>> b = new ConcurrentHashMap();
    private final y0 a = new d0();

    private t0() {
    }

    public static t0 a() {
        return c;
    }

    public <T> void b(T t, w0 w0Var, n nVar) throws IOException {
        e(t).h(t, w0Var, nVar);
    }

    public x0<?> c(Class<?> cls, x0<?> x0Var) {
        x.b(cls, "messageType");
        x.b(x0Var, "schema");
        return this.b.putIfAbsent(cls, x0Var);
    }

    public <T> x0<T> d(Class<T> cls) {
        x.b(cls, "messageType");
        x0<T> x0Var = (x0<T>) this.b.get(cls);
        if (x0Var == null) {
            x0<T> a = this.a.a(cls);
            x0<T> x0Var2 = (x0<T>) c(cls, a);
            if (x0Var2 != null) {
                return x0Var2;
            }
            return a;
        }
        return x0Var;
    }

    public <T> x0<T> e(T t) {
        return d(t.getClass());
    }
}
