package defpackage;

import android.annotation.SuppressLint;
import android.database.SQLException;
import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReportQueue.java */
/* renamed from: rg9  reason: default package */
/* loaded from: classes2.dex */
public final class rg9 {
    private final double a;
    private final double b;
    private final long c;
    private final long d;
    private final int e;
    private final BlockingQueue<Runnable> f;
    private final ThreadPoolExecutor g;
    private final ulb<j12> h;
    private final w77 i;
    private int j;
    private long k;

    /* compiled from: ReportQueue.java */
    /* renamed from: rg9$b */
    /* loaded from: classes2.dex */
    private final class b implements Runnable {
        private final a22 a;
        private final a7b<a22> b;

        @Override // java.lang.Runnable
        public void run() {
            rg9.this.p(this.a, this.b);
            rg9.this.i.c();
            double g = rg9.this.g();
            rx5 f = rx5.f();
            f.b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(g / 1000.0d)) + " s for report: " + this.a.d());
            rg9.q(g);
        }

        private b(a22 a22Var, a7b<a22> a7bVar) {
            this.a = a22Var;
            this.b = a7bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public rg9(ulb<j12> ulbVar, vfa vfaVar, w77 w77Var) {
        this(vfaVar.f, vfaVar.g, vfaVar.h * 1000, ulbVar, w77Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.a) * Math.pow(this.b, h()));
    }

    private int h() {
        int max;
        if (this.k == 0) {
            this.k = o();
        }
        int o = (int) ((o() - this.k) / this.c);
        if (l()) {
            max = Math.min(100, this.j + o);
        } else {
            max = Math.max(0, this.j - o);
        }
        if (this.j != max) {
            this.j = max;
            this.k = o();
        }
        return max;
    }

    private boolean k() {
        if (this.f.size() < this.e) {
            return true;
        }
        return false;
    }

    private boolean l() {
        if (this.f.size() == this.e) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            z44.a(this.h, xj8.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(a7b a7bVar, boolean z, a22 a22Var, Exception exc) {
        if (exc != null) {
            a7bVar.d(exc);
            return;
        }
        if (z) {
            j();
        }
        a7bVar.e(a22Var);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final a22 a22Var, final a7b<a22> a7bVar) {
        final boolean z;
        rx5 f = rx5.f();
        f.b("Sending report through Google DataTransport: " + a22Var.d());
        if (SystemClock.elapsedRealtime() - this.d < 2000) {
            z = true;
        } else {
            z = false;
        }
        this.h.b(pk3.g(a22Var.b()), new omb() { // from class: pg9
            @Override // defpackage.omb
            public final void a(Exception exc) {
                rg9.this.n(a7bVar, z, a22Var, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a7b<a22> i(a22 a22Var, boolean z) {
        synchronized (this.f) {
            try {
                a7b<a22> a7bVar = new a7b<>();
                if (z) {
                    this.i.b();
                    if (k()) {
                        rx5 f = rx5.f();
                        f.b("Enqueueing report: " + a22Var.d());
                        rx5 f2 = rx5.f();
                        f2.b("Queue size: " + this.f.size());
                        this.g.execute(new b(a22Var, a7bVar));
                        rx5 f3 = rx5.f();
                        f3.b("Closing task for report: " + a22Var.d());
                        a7bVar.e(a22Var);
                        return a7bVar;
                    }
                    h();
                    rx5 f4 = rx5.f();
                    f4.b("Dropping report due to queue being full: " + a22Var.d());
                    this.i.a();
                    a7bVar.e(a22Var);
                    return a7bVar;
                }
                p(a22Var, a7bVar);
                return a7bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: qg9
            @Override // java.lang.Runnable
            public final void run() {
                rg9.this.m(countDownLatch);
            }
        }).start();
        gvb.g(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    rg9(double d, double d2, long j, ulb<j12> ulbVar, w77 w77Var) {
        this.a = d;
        this.b = d2;
        this.c = j;
        this.h = ulbVar;
        this.i = w77Var;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }
}
