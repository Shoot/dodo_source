package defpackage;

import android.annotation.TargetApi;
import ch.qos.logback.core.spi.ComponentTracker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* renamed from: a0d  reason: default package */
/* loaded from: classes2.dex */
public final class a0d {
    private final c3d a;
    private final t91 b;
    private boolean c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private boolean i;
    private final Map<Class<? extends g2d>, g2d> j;
    private final List<rad> k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0d(a0d a0dVar) {
        this.a = a0dVar.a;
        this.b = a0dVar.b;
        this.d = a0dVar.d;
        this.e = a0dVar.e;
        this.f = a0dVar.f;
        this.g = a0dVar.g;
        this.h = a0dVar.h;
        this.k = new ArrayList(a0dVar.k);
        this.j = new HashMap(a0dVar.j.size());
        for (Map.Entry<Class<? extends g2d>, g2d> entry : a0dVar.j.entrySet()) {
            g2d n = n(entry.getKey());
            entry.getValue().zzc(n);
            this.j.put(entry.getKey(), n);
        }
    }

    @TargetApi(19)
    private static <T extends g2d> T n(Class<T> cls) {
        try {
            return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            if (!(e instanceof InstantiationException)) {
                if (!(e instanceof IllegalAccessException)) {
                    if (e instanceof ReflectiveOperationException) {
                        throw new IllegalArgumentException("Linkage exception", e);
                    }
                    throw new RuntimeException(e);
                }
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            }
            throw new IllegalArgumentException("dataType doesn't have default constructor", e);
        }
    }

    public final long a() {
        return this.d;
    }

    public final <T extends g2d> T b(Class<T> cls) {
        T t = (T) this.j.get(cls);
        if (t == null) {
            T t2 = (T) n(cls);
            this.j.put(cls, t2);
            return t2;
        }
        return t;
    }

    public final <T extends g2d> T c(Class<T> cls) {
        return (T) this.j.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c3d d() {
        return this.a;
    }

    public final Collection<g2d> e() {
        return this.j.values();
    }

    public final List<rad> f() {
        return this.k;
    }

    public final void g(g2d g2dVar) {
        gh8.j(g2dVar);
        Class<?> cls = g2dVar.getClass();
        if (cls.getSuperclass() == g2d.class) {
            g2dVar.zzc(b(cls));
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.f = this.b.b();
        long j = this.e;
        if (j != 0) {
            this.d = j;
        } else {
            this.d = this.b.currentTimeMillis();
        }
        this.c = true;
    }

    public final void j(long j) {
        this.e = j;
    }

    public final void k() {
        this.a.b().k(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        return this.i;
    }

    public final boolean m() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0d(c3d c3dVar, t91 t91Var) {
        gh8.j(c3dVar);
        gh8.j(t91Var);
        this.a = c3dVar;
        this.b = t91Var;
        this.g = ComponentTracker.DEFAULT_TIMEOUT;
        this.h = 3024000000L;
        this.j = new HashMap();
        this.k = new ArrayList();
    }
}
