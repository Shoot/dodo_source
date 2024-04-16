package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: ExecutorDelivery.java */
/* loaded from: classes.dex */
public class c implements lk9 {
    private final Executor a;

    /* compiled from: ExecutorDelivery.java */
    /* loaded from: classes.dex */
    class a implements Executor {
        final /* synthetic */ Handler a;

        a(Handler handler) {
            this.a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExecutorDelivery.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {
        private final Request a;
        private final Response b;
        private final Runnable c;

        public b(Request request, Response response, Runnable runnable) {
            this.a = request;
            this.b = response;
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.isCanceled()) {
                this.a.finish("canceled-at-delivery");
                return;
            }
            if (this.b.b()) {
                this.a.deliverResponse(this.b.a);
            } else {
                this.a.deliverError(this.b.c);
            }
            if (this.b.d) {
                this.a.addMarker("intermediate-response");
            } else {
                this.a.finish("done");
            }
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public c(Handler handler) {
        this.a = new a(handler);
    }

    @Override // defpackage.lk9
    public void a(Request<?> request, Response<?> response) {
        b(request, response, null);
    }

    @Override // defpackage.lk9
    public void b(Request<?> request, Response<?> response, Runnable runnable) {
        request.markDelivered();
        request.addMarker("post-response");
        this.a.execute(new b(request, response, runnable));
    }

    @Override // defpackage.lk9
    public void c(Request<?> request, VolleyError volleyError) {
        request.addMarker("post-error");
        this.a.execute(new b(request, Response.a(volleyError), null));
    }
}
