package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class g3 {
    private static final g3 c = new g3();
    private final ConcurrentMap<Class<?>, j3<?>> b = new ConcurrentHashMap();
    private final l3 a = new m2();

    private g3() {
    }

    public static g3 a() {
        return c;
    }

    public final <T> j3<T> b(Class<T> cls) {
        d2.f(cls, "messageType");
        j3<T> j3Var = (j3<T>) this.b.get(cls);
        if (j3Var == null) {
            j3<T> a = this.a.a(cls);
            d2.f(cls, "messageType");
            d2.f(a, "schema");
            j3<T> j3Var2 = (j3<T>) this.b.putIfAbsent(cls, a);
            if (j3Var2 != null) {
                return j3Var2;
            }
            return a;
        }
        return j3Var;
    }

    public final <T> j3<T> c(T t) {
        return b(t.getClass());
    }
}
