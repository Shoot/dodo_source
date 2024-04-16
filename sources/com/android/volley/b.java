package com.android.volley;

import android.os.Process;
import com.android.volley.a;
import java.util.concurrent.BlockingQueue;
/* compiled from: CacheDispatcher.java */
/* loaded from: classes.dex */
public class b extends Thread {
    private static final boolean g = f.b;
    private final BlockingQueue<Request<?>> a;
    private final BlockingQueue<Request<?>> b;
    private final com.android.volley.a c;
    private final lk9 d;
    private volatile boolean e = false;
    private final g f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CacheDispatcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        final /* synthetic */ Request a;

        a(Request request) {
            this.a = request;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.b.put(this.a);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public b(BlockingQueue<Request<?>> blockingQueue, BlockingQueue<Request<?>> blockingQueue2, com.android.volley.a aVar, lk9 lk9Var) {
        this.a = blockingQueue;
        this.b = blockingQueue2;
        this.c = aVar;
        this.d = lk9Var;
        this.f = new g(this, blockingQueue2, lk9Var);
    }

    private void b() throws InterruptedException {
        c(this.a.take());
    }

    void c(Request<?> request) throws InterruptedException {
        request.addMarker("cache-queue-take");
        request.sendEvent(1);
        try {
            if (request.isCanceled()) {
                request.finish("cache-discard-canceled");
                return;
            }
            a.C0093a c0093a = this.c.get(request.getCacheKey());
            if (c0093a == null) {
                request.addMarker("cache-miss");
                if (!this.f.a(request)) {
                    this.b.put(request);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (c0093a.b(currentTimeMillis)) {
                request.addMarker("cache-hit-expired");
                request.setCacheEntry(c0093a);
                if (!this.f.a(request)) {
                    this.b.put(request);
                }
                return;
            }
            request.addMarker("cache-hit");
            Response<?> parseNetworkResponse = request.parseNetworkResponse(new iw6(c0093a.a, c0093a.g));
            request.addMarker("cache-hit-parsed");
            if (!parseNetworkResponse.b()) {
                request.addMarker("cache-parsing-failed");
                this.c.a(request.getCacheKey(), true);
                request.setCacheEntry(null);
                if (!this.f.a(request)) {
                    this.b.put(request);
                }
                return;
            }
            if (!c0093a.c(currentTimeMillis)) {
                this.d.a(request, parseNetworkResponse);
            } else {
                request.addMarker("cache-hit-refresh-needed");
                request.setCacheEntry(c0093a);
                parseNetworkResponse.d = true;
                if (!this.f.a(request)) {
                    this.d.b(request, parseNetworkResponse, new a(request));
                } else {
                    this.d.a(request, parseNetworkResponse);
                }
            }
        } finally {
            request.sendEvent(2);
        }
    }

    public void d() {
        this.e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (g) {
            f.e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.c.initialize();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                f.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
