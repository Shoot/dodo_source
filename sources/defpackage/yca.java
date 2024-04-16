package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SerializerCache.java */
/* renamed from: yca  reason: default package */
/* loaded from: classes2.dex */
public final class yca {
    private final HashMap<vnb, gc5<Object>> a = new HashMap<>(64);
    private final AtomicReference<j79> b = new AtomicReference<>();

    private final synchronized j79 a() {
        j79 j79Var;
        j79Var = this.b.get();
        if (j79Var == null) {
            j79Var = j79.b(this.a);
            this.b.set(j79Var);
        }
        return j79Var;
    }

    public void b(y85 y85Var, gc5<Object> gc5Var, bda bdaVar) throws JsonMappingException {
        synchronized (this) {
            try {
                if (this.a.put(new vnb(y85Var, false), gc5Var) == null) {
                    this.b.set(null);
                }
                if (gc5Var instanceof ij9) {
                    ((ij9) gc5Var).b(bdaVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(Class<?> cls, y85 y85Var, gc5<Object> gc5Var, bda bdaVar) throws JsonMappingException {
        synchronized (this) {
            try {
                gc5<Object> put = this.a.put(new vnb(cls, false), gc5Var);
                gc5<Object> put2 = this.a.put(new vnb(y85Var, false), gc5Var);
                if (put == null || put2 == null) {
                    this.b.set(null);
                }
                if (gc5Var instanceof ij9) {
                    ((ij9) gc5Var).b(bdaVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Class<?> cls, gc5<Object> gc5Var) {
        synchronized (this) {
            try {
                if (this.a.put(new vnb(cls, true), gc5Var) == null) {
                    this.b.set(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public j79 e() {
        j79 j79Var = this.b.get();
        if (j79Var != null) {
            return j79Var;
        }
        return a();
    }

    public gc5<Object> f(Class<?> cls) {
        gc5<Object> gc5Var;
        synchronized (this) {
            gc5Var = this.a.get(new vnb(cls, true));
        }
        return gc5Var;
    }

    public gc5<Object> g(y85 y85Var) {
        gc5<Object> gc5Var;
        synchronized (this) {
            gc5Var = this.a.get(new vnb(y85Var, false));
        }
        return gc5Var;
    }

    public gc5<Object> h(Class<?> cls) {
        gc5<Object> gc5Var;
        synchronized (this) {
            gc5Var = this.a.get(new vnb(cls, false));
        }
        return gc5Var;
    }
}
