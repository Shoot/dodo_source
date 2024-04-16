package defpackage;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: EventBus.java */
/* renamed from: rk3  reason: default package */
/* loaded from: classes2.dex */
class rk3 implements j1b, ms8 {
    private final Map<Class<?>, ConcurrentHashMap<vk3<Object>, Executor>> a = new HashMap();
    private Queue<nk3<?>> b = new ArrayDeque();
    private final Executor c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public rk3(Executor executor) {
        this.c = executor;
    }

    private synchronized Set<Map.Entry<vk3<Object>, Executor>> e(nk3<?> nk3Var) {
        Set<Map.Entry<vk3<Object>, Executor>> entrySet;
        try {
            ConcurrentHashMap<vk3<Object>, Executor> concurrentHashMap = this.a.get(nk3Var.b());
            if (concurrentHashMap == null) {
                entrySet = Collections.emptySet();
            } else {
                entrySet = concurrentHashMap.entrySet();
            }
        } catch (Throwable th) {
            throw th;
        }
        return entrySet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Map.Entry entry, nk3 nk3Var) {
        ((vk3) entry.getKey()).a(nk3Var);
    }

    @Override // defpackage.j1b
    public synchronized <T> void a(Class<T> cls, Executor executor, vk3<? super T> vk3Var) {
        try {
            ih8.b(cls);
            ih8.b(vk3Var);
            ih8.b(executor);
            if (!this.a.containsKey(cls)) {
                this.a.put(cls, new ConcurrentHashMap<>());
            }
            this.a.get(cls).put(vk3Var, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.j1b
    public <T> void b(Class<T> cls, vk3<? super T> vk3Var) {
        a(cls, this.c, vk3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Queue<nk3<?>> queue;
        synchronized (this) {
            try {
                queue = this.b;
                if (queue != null) {
                    this.b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            for (nk3<?> nk3Var : queue) {
                g(nk3Var);
            }
        }
    }

    public void g(final nk3<?> nk3Var) {
        ih8.b(nk3Var);
        synchronized (this) {
            try {
                Queue<nk3<?>> queue = this.b;
                if (queue != null) {
                    queue.add(nk3Var);
                    return;
                }
                for (final Map.Entry<vk3<Object>, Executor> entry : e(nk3Var)) {
                    entry.getValue().execute(new Runnable() { // from class: qk3
                        @Override // java.lang.Runnable
                        public final void run() {
                            rk3.f(entry, nk3Var);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
