package defpackage;

import defpackage.xv9;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: TrampolineScheduler.java */
/* renamed from: ekb  reason: default package */
/* loaded from: classes3.dex */
public final class ekb extends xv9 {
    private static final ekb c = new ekb();

    /* compiled from: TrampolineScheduler.java */
    /* renamed from: ekb$a */
    /* loaded from: classes3.dex */
    static final class a implements Runnable {
        private final Runnable a;
        private final c b;
        private final long c;

        a(Runnable runnable, c cVar, long j) {
            this.a = runnable;
            this.b = cVar;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.b.d) {
                long b = this.b.b(TimeUnit.MILLISECONDS);
                long j = this.c;
                if (j > b) {
                    try {
                        Thread.sleep(j - b);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        tp9.q(e);
                        return;
                    }
                }
                if (!this.b.d) {
                    this.a.run();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TrampolineScheduler.java */
    /* renamed from: ekb$b */
    /* loaded from: classes3.dex */
    public static final class b implements Comparable<b> {
        final Runnable a;
        final long b;
        final int c;
        volatile boolean d;

        b(Runnable runnable, Long l, int i) {
            this.a = runnable;
            this.b = l.longValue();
            this.c = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b bVar) {
            int b = x47.b(this.b, bVar.b);
            if (b == 0) {
                return x47.a(this.c, bVar.c);
            }
            return b;
        }
    }

    /* compiled from: TrampolineScheduler.java */
    /* renamed from: ekb$c */
    /* loaded from: classes3.dex */
    static final class c extends xv9.c implements z33 {
        final PriorityBlockingQueue<b> a = new PriorityBlockingQueue<>();
        private final AtomicInteger b = new AtomicInteger();
        final AtomicInteger c = new AtomicInteger();
        volatile boolean d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TrampolineScheduler.java */
        /* renamed from: ekb$c$a */
        /* loaded from: classes3.dex */
        public final class a implements Runnable {
            final b a;

            a(b bVar) {
                this.a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.d = true;
                c.this.a.remove(this.a);
            }
        }

        c() {
        }

        @Override // defpackage.z33
        public void a() {
            this.d = true;
        }

        @Override // defpackage.xv9.c
        public z33 c(Runnable runnable) {
            return f(runnable, b(TimeUnit.MILLISECONDS));
        }

        @Override // defpackage.xv9.c
        public z33 d(Runnable runnable, long j, TimeUnit timeUnit) {
            long b = b(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return f(new a(runnable, this, b), b);
        }

        z33 f(Runnable runnable, long j) {
            if (this.d) {
                return ig3.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j), this.c.incrementAndGet());
            this.a.add(bVar);
            if (this.b.getAndIncrement() == 0) {
                int i = 1;
                while (!this.d) {
                    b poll = this.a.poll();
                    if (poll == null) {
                        i = this.b.addAndGet(-i);
                        if (i == 0) {
                            return ig3.INSTANCE;
                        }
                    } else if (!poll.d) {
                        poll.a.run();
                    }
                }
                this.a.clear();
                return ig3.INSTANCE;
            }
            return j43.c(new a(bVar));
        }

        @Override // defpackage.z33
        public boolean i() {
            return this.d;
        }
    }

    ekb() {
    }

    public static ekb g() {
        return c;
    }

    @Override // defpackage.xv9
    public xv9.c b() {
        return new c();
    }

    @Override // defpackage.xv9
    public z33 d(Runnable runnable) {
        tp9.s(runnable).run();
        return ig3.INSTANCE;
    }

    @Override // defpackage.xv9
    public z33 e(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            tp9.s(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            tp9.q(e);
        }
        return ig3.INSTANCE;
    }
}
