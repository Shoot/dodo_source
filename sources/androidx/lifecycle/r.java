package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ViewModel.java */
/* loaded from: classes.dex */
public abstract class r {
    private final Map<String, Object> a = new HashMap();
    private final Set<Closeable> b = new LinkedHashSet();
    private volatile boolean c = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c = true;
        Map<String, Object> map = this.a;
        if (map != null) {
            synchronized (map) {
                try {
                    for (Object obj : this.a.values()) {
                        b(obj);
                    }
                } finally {
                }
            }
        }
        Set<Closeable> set = this.b;
        if (set != null) {
            synchronized (set) {
                try {
                    for (Closeable closeable : this.b) {
                        b(closeable);
                    }
                } finally {
                }
            }
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> T c(String str) {
        T t;
        Map<String, Object> map = this.a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.a.get(str);
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> T e(String str, T t) {
        Object obj;
        synchronized (this.a) {
            try {
                obj = this.a.get(str);
                if (obj == null) {
                    this.a.put(str, t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            t = obj;
        }
        if (this.c) {
            b(t);
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
    }
}
