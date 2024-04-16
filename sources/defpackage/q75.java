package defpackage;

import defpackage.xv9;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: IoScheduler.java */
/* renamed from: q75  reason: default package */
/* loaded from: classes3.dex */
public final class q75 extends xv9 {
    static final vp9 e;
    static final vp9 f;
    static final c i;
    static boolean j;
    static final a k;
    final ThreadFactory c;
    final AtomicReference<a> d;
    private static final TimeUnit h = TimeUnit.SECONDS;
    private static final long g = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IoScheduler.java */
    /* renamed from: q75$a */
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        private final long a;
        private final ConcurrentLinkedQueue<c> b;
        final wn1 c;
        private final ScheduledExecutorService d;
        private final Future<?> e;
        private final ThreadFactory f;

        a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j2;
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            long j3 = j2;
            this.a = j3;
            this.b = new ConcurrentLinkedQueue<>();
            this.c = new wn1();
            this.f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, q75.f);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j3, j3, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.d = scheduledExecutorService;
            this.e = scheduledFuture;
        }

        void a() {
            if (!this.b.isEmpty()) {
                long c = c();
                Iterator<c> it = this.b.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.k() <= c) {
                        if (this.b.remove(next)) {
                            this.c.c(next);
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        c b() {
            if (this.c.i()) {
                return q75.i;
            }
            while (!this.b.isEmpty()) {
                c poll = this.b.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.f);
            this.c.b(cVar);
            return cVar;
        }

        long c() {
            return System.nanoTime();
        }

        void d(c cVar) {
            cVar.l(c() + this.a);
            this.b.offer(cVar);
        }

        void e() {
            this.c.a();
            Future<?> future = this.e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    /* compiled from: IoScheduler.java */
    /* renamed from: q75$b */
    /* loaded from: classes3.dex */
    static final class b extends xv9.c implements Runnable {
        private final a b;
        private final c c;
        final AtomicBoolean d = new AtomicBoolean();
        private final wn1 a = new wn1();

        b(a aVar) {
            this.b = aVar;
            this.c = aVar.b();
        }

        @Override // defpackage.z33
        public void a() {
            if (this.d.compareAndSet(false, true)) {
                this.a.a();
                if (q75.j) {
                    this.c.f(this, 0L, TimeUnit.NANOSECONDS, null);
                } else {
                    this.b.d(this.c);
                }
            }
        }

        @Override // defpackage.xv9.c
        public z33 d(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.a.i()) {
                return ig3.INSTANCE;
            }
            return this.c.f(runnable, j, timeUnit, this.a);
        }

        @Override // defpackage.z33
        public boolean i() {
            return this.d.get();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.d(this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IoScheduler.java */
    /* renamed from: q75$c */
    /* loaded from: classes3.dex */
    public static final class c extends ux6 {
        private long c;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.c = 0L;
        }

        public long k() {
            return this.c;
        }

        public void l(long j) {
            this.c = j;
        }
    }

    static {
        c cVar = new c(new vp9("RxCachedThreadSchedulerShutdown"));
        i = cVar;
        cVar.a();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        vp9 vp9Var = new vp9("RxCachedThreadScheduler", max);
        e = vp9Var;
        f = new vp9("RxCachedWorkerPoolEvictor", max);
        j = Boolean.getBoolean("rx2.io-scheduled-release");
        a aVar = new a(0L, null, vp9Var);
        k = aVar;
        aVar.e();
    }

    public q75() {
        this(e);
    }

    @Override // defpackage.xv9
    public xv9.c b() {
        return new b(this.d.get());
    }

    public void g() {
        a aVar = new a(g, h, this.c);
        if (!ho1.a(this.d, k, aVar)) {
            aVar.e();
        }
    }

    public q75(ThreadFactory threadFactory) {
        this.c = threadFactory;
        this.d = new AtomicReference<>(k);
        g();
    }
}
