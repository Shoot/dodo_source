package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: Scheduler.java */
/* renamed from: xv9  reason: default package */
/* loaded from: classes3.dex */
public abstract class xv9 {
    static boolean a = Boolean.getBoolean("rx2.scheduler.use-nanotime");
    static final long b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scheduler.java */
    /* renamed from: xv9$a */
    /* loaded from: classes3.dex */
    public static final class a implements z33, Runnable {
        final Runnable a;
        final c b;
        Thread c;

        a(Runnable runnable, c cVar) {
            this.a = runnable;
            this.b = cVar;
        }

        @Override // defpackage.z33
        public void a() {
            if (this.c == Thread.currentThread()) {
                c cVar = this.b;
                if (cVar instanceof ux6) {
                    ((ux6) cVar).j();
                    return;
                }
            }
            this.b.a();
        }

        @Override // defpackage.z33
        public boolean i() {
            return this.b.i();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c = Thread.currentThread();
            try {
                this.a.run();
            } finally {
                a();
                this.c = null;
            }
        }
    }

    /* compiled from: Scheduler.java */
    /* renamed from: xv9$b */
    /* loaded from: classes3.dex */
    static final class b implements z33, Runnable {
        final Runnable a;
        final c b;
        volatile boolean c;

        b(Runnable runnable, c cVar) {
            this.a = runnable;
            this.b = cVar;
        }

        @Override // defpackage.z33
        public void a() {
            this.c = true;
            this.b.a();
        }

        @Override // defpackage.z33
        public boolean i() {
            return this.c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.c) {
                try {
                    this.a.run();
                } catch (Throwable th) {
                    rl3.b(th);
                    this.b.a();
                    throw pl3.d(th);
                }
            }
        }
    }

    /* compiled from: Scheduler.java */
    /* renamed from: xv9$c */
    /* loaded from: classes3.dex */
    public static abstract class c implements z33 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Scheduler.java */
        /* renamed from: xv9$c$a */
        /* loaded from: classes3.dex */
        public final class a implements Runnable {
            final Runnable a;
            final eca b;
            final long c;
            long d;
            long e;
            long f;

            a(long j, Runnable runnable, long j2, eca ecaVar, long j3) {
                this.a = runnable;
                this.b = ecaVar;
                this.c = j3;
                this.e = j2;
                this.f = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                long j;
                this.a.run();
                if (!this.b.i()) {
                    c cVar = c.this;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long b = cVar.b(timeUnit);
                    long j2 = xv9.b;
                    long j3 = this.e;
                    if (b + j2 >= j3) {
                        long j4 = this.c;
                        if (b < j3 + j4 + j2) {
                            long j5 = this.f;
                            long j6 = this.d + 1;
                            this.d = j6;
                            j = j5 + (j6 * j4);
                            this.e = b;
                            this.b.b(c.this.d(this, j - b, timeUnit));
                        }
                    }
                    long j7 = this.c;
                    long j8 = b + j7;
                    long j9 = this.d + 1;
                    this.d = j9;
                    this.f = j8 - (j7 * j9);
                    j = j8;
                    this.e = b;
                    this.b.b(c.this.d(this, j - b, timeUnit));
                }
            }
        }

        public long b(TimeUnit timeUnit) {
            return xv9.a(timeUnit);
        }

        public z33 c(Runnable runnable) {
            return d(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract z33 d(Runnable runnable, long j, TimeUnit timeUnit);

        public z33 e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            eca ecaVar = new eca();
            eca ecaVar2 = new eca(ecaVar);
            Runnable s = tp9.s(runnable);
            long nanos = timeUnit.toNanos(j2);
            long b = b(TimeUnit.NANOSECONDS);
            z33 d = d(new a(b + timeUnit.toNanos(j), s, b, ecaVar2, nanos), j, timeUnit);
            if (d == ig3.INSTANCE) {
                return d;
            }
            ecaVar.b(d);
            return ecaVar2;
        }
    }

    static long a(TimeUnit timeUnit) {
        if (!a) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
        return timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public abstract c b();

    public long c(TimeUnit timeUnit) {
        return a(timeUnit);
    }

    public z33 d(Runnable runnable) {
        return e(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public z33 e(Runnable runnable, long j, TimeUnit timeUnit) {
        c b2 = b();
        a aVar = new a(tp9.s(runnable), b2);
        b2.d(aVar, j, timeUnit);
        return aVar;
    }

    public z33 f(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        c b2 = b();
        b bVar = new b(tp9.s(runnable), b2);
        z33 e = b2.e(bVar, j, j2, timeUnit);
        if (e == ig3.INSTANCE) {
            return e;
        }
        return bVar;
    }
}
