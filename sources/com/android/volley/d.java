package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
/* compiled from: NetworkDispatcher.java */
/* loaded from: classes.dex */
public class d extends Thread {
    private final BlockingQueue<Request<?>> a;
    private final sv6 b;
    private final a c;
    private final lk9 d;
    private volatile boolean e = false;

    public d(BlockingQueue<Request<?>> blockingQueue, sv6 sv6Var, a aVar, lk9 lk9Var) {
        this.a = blockingQueue;
        this.b = sv6Var;
        this.c = aVar;
        this.d = lk9Var;
    }

    @TargetApi(14)
    private void a(Request<?> request) {
        TrafficStats.setThreadStatsTag(request.getTrafficStatsTag());
    }

    private void b(Request<?> request, VolleyError volleyError) {
        this.d.c(request, request.parseNetworkError(volleyError));
    }

    private void c() throws InterruptedException {
        d(this.a.take());
    }

    void d(Request<?> request) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        request.sendEvent(3);
        try {
            try {
                try {
                    request.addMarker("network-queue-take");
                } catch (VolleyError e) {
                    e.b(SystemClock.elapsedRealtime() - elapsedRealtime);
                    b(request, e);
                    request.notifyListenerResponseNotUsable();
                }
            } catch (Exception e2) {
                f.d(e2, "Unhandled exception %s", e2.toString());
                VolleyError volleyError = new VolleyError(e2);
                volleyError.b(SystemClock.elapsedRealtime() - elapsedRealtime);
                this.d.c(request, volleyError);
                request.notifyListenerResponseNotUsable();
            }
            if (request.isCanceled()) {
                request.finish("network-discard-cancelled");
                request.notifyListenerResponseNotUsable();
                return;
            }
            a(request);
            iw6 a = this.b.a(request);
            request.addMarker("network-http-complete");
            if (a.e && request.hasHadResponseDelivered()) {
                request.finish("not-modified");
                request.notifyListenerResponseNotUsable();
                return;
            }
            Response<?> parseNetworkResponse = request.parseNetworkResponse(a);
            request.addMarker("network-parse-complete");
            if (request.shouldCache() && parseNetworkResponse.b != null) {
                this.c.b(request.getCacheKey(), parseNetworkResponse.b);
                request.addMarker("network-cache-written");
            }
            request.markDelivered();
            this.d.a(request, parseNetworkResponse);
            request.notifyListenerResponseReceived(parseNetworkResponse);
        } finally {
            request.sendEvent(4);
        }
    }

    public void e() {
        this.e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                f.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
