package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Stats.java */
/* renamed from: pwa  reason: default package */
/* loaded from: classes3.dex */
public class pwa {
    final HandlerThread a;
    final jl0 b;
    final Handler c;
    long d;
    long e;
    long f;
    long g;
    long h;
    long i;
    long j;
    long k;
    int l;
    int m;
    int n;

    /* compiled from: Stats.java */
    /* renamed from: pwa$a */
    /* loaded from: classes3.dex */
    private static class a extends Handler {
        private final pwa a;

        /* compiled from: Stats.java */
        /* renamed from: pwa$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0482a implements Runnable {
            final /* synthetic */ Message a;

            RunnableC0482a(Message message) {
                this.a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.a.what);
            }
        }

        a(Looper looper, pwa pwaVar) {
            super(looper);
            this.a = pwaVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                s58.o.post(new RunnableC0482a(message));
                                return;
                            } else {
                                this.a.l((Long) message.obj);
                                return;
                            }
                        }
                        this.a.i(message.arg1);
                        return;
                    }
                    this.a.h(message.arg1);
                    return;
                }
                this.a.k();
                return;
            }
            this.a.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public pwa(jl0 jl0Var) {
        this.b = jl0Var;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.a = handlerThread;
        handlerThread.start();
        evb.i(handlerThread.getLooper());
        this.c = new a(handlerThread.getLooper(), this);
    }

    private static long g(int i, long j) {
        return j / i;
    }

    private void m(Bitmap bitmap, int i) {
        int j = evb.j(bitmap);
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(i, j, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public qwa a() {
        return new qwa(this.b.a(), this.b.size(), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.c.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.c.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(long j) {
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j)));
    }

    void h(long j) {
        int i = this.m + 1;
        this.m = i;
        long j2 = this.g + j;
        this.g = j2;
        this.j = g(i, j2);
    }

    void i(long j) {
        this.n++;
        long j2 = this.h + j;
        this.h = j2;
        this.k = g(this.m, j2);
    }

    void j() {
        this.d++;
    }

    void k() {
        this.e++;
    }

    void l(Long l) {
        this.l++;
        long longValue = this.f + l.longValue();
        this.f = longValue;
        this.i = g(this.l, longValue);
    }
}
