package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: RequestQueue.java */
/* loaded from: classes.dex */
public class e {
    private final AtomicInteger a;
    private final Set<Request<?>> b;
    private final PriorityBlockingQueue<Request<?>> c;
    private final PriorityBlockingQueue<Request<?>> d;
    private final com.android.volley.a e;
    private final sv6 f;
    private final lk9 g;
    private final d[] h;
    private com.android.volley.b i;
    private final List<c> j;
    private final List<a> k;

    /* compiled from: RequestQueue.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(Request<?> request, int i);
    }

    /* compiled from: RequestQueue.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(Request<?> request);
    }

    /* compiled from: RequestQueue.java */
    @Deprecated
    /* loaded from: classes.dex */
    public interface c<T> {
        void a(Request<T> request);
    }

    public e(com.android.volley.a aVar, sv6 sv6Var, int i, lk9 lk9Var) {
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue<>();
        this.d = new PriorityBlockingQueue<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.e = aVar;
        this.f = sv6Var;
        this.h = new d[i];
        this.g = lk9Var;
    }

    public <T> Request<T> a(Request<T> request) {
        request.setRequestQueue(this);
        synchronized (this.b) {
            this.b.add(request);
        }
        request.setSequence(e());
        request.addMarker("add-to-queue");
        f(request, 0);
        b(request);
        return request;
    }

    <T> void b(Request<T> request) {
        if (!request.shouldCache()) {
            g(request);
        } else {
            this.c.add(request);
        }
    }

    public void c(b bVar) {
        synchronized (this.b) {
            try {
                for (Request<?> request : this.b) {
                    if (bVar.a(request)) {
                        request.cancel();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> void d(Request<T> request) {
        synchronized (this.b) {
            this.b.remove(request);
        }
        synchronized (this.j) {
            try {
                for (c cVar : this.j) {
                    cVar.a(request);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f(request, 5);
    }

    public int e() {
        return this.a.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Request<?> request, int i) {
        synchronized (this.k) {
            try {
                for (a aVar : this.k) {
                    aVar.a(request, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> void g(Request<T> request) {
        this.d.add(request);
    }

    public void h() {
        i();
        com.android.volley.b bVar = new com.android.volley.b(this.c, this.d, this.e, this.g);
        this.i = bVar;
        bVar.start();
        for (int i = 0; i < this.h.length; i++) {
            d dVar = new d(this.d, this.f, this.e, this.g);
            this.h[i] = dVar;
            dVar.start();
        }
    }

    public void i() {
        d[] dVarArr;
        com.android.volley.b bVar = this.i;
        if (bVar != null) {
            bVar.d();
        }
        for (d dVar : this.h) {
            if (dVar != null) {
                dVar.e();
            }
        }
    }

    public e(com.android.volley.a aVar, sv6 sv6Var, int i) {
        this(aVar, sv6Var, i, new com.android.volley.c(new Handler(Looper.getMainLooper())));
    }

    public e(com.android.volley.a aVar, sv6 sv6Var) {
        this(aVar, sv6Var, 4);
    }
}
