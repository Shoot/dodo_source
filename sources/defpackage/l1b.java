package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SubscriptionArbiter.java */
/* renamed from: l1b  reason: default package */
/* loaded from: classes3.dex */
public class l1b extends AtomicInteger implements k1b {
    k1b a;
    long b;
    final AtomicReference<k1b> c = new AtomicReference<>();
    final AtomicLong d = new AtomicLong();
    final AtomicLong e = new AtomicLong();
    final boolean f;
    volatile boolean g;
    protected boolean h;

    public l1b(boolean z) {
        this.f = z;
    }

    final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        e();
    }

    @Override // defpackage.k1b
    public void cancel() {
        if (!this.g) {
            this.g = true;
            a();
        }
    }

    final void e() {
        int i = 1;
        long j = 0;
        k1b k1bVar = null;
        do {
            k1b k1bVar2 = this.c.get();
            if (k1bVar2 != null) {
                k1bVar2 = this.c.getAndSet(null);
            }
            long j2 = this.d.get();
            if (j2 != 0) {
                j2 = this.d.getAndSet(0L);
            }
            long j3 = this.e.get();
            if (j3 != 0) {
                j3 = this.e.getAndSet(0L);
            }
            k1b k1bVar3 = this.a;
            if (this.g) {
                if (k1bVar3 != null) {
                    k1bVar3.cancel();
                    this.a = null;
                }
                if (k1bVar2 != null) {
                    k1bVar2.cancel();
                }
            } else {
                long j4 = this.b;
                if (j4 != Long.MAX_VALUE) {
                    j4 = g60.c(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            n1b.o(j4);
                            j4 = 0;
                        }
                    }
                    this.b = j4;
                }
                if (k1bVar2 != null) {
                    if (k1bVar3 != null && this.f) {
                        k1bVar3.cancel();
                    }
                    this.a = k1bVar2;
                    if (j4 != 0) {
                        j = g60.c(j, j4);
                        k1bVar = k1bVar2;
                    }
                } else if (k1bVar3 != null && j2 != 0) {
                    j = g60.c(j, j2);
                    k1bVar = k1bVar3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            k1bVar.w(j);
        }
    }

    public final boolean i() {
        return this.h;
    }

    public final void j(long j) {
        if (this.h) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.b;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                if (j3 < 0) {
                    n1b.o(j3);
                    j3 = 0;
                }
                this.b = j3;
            }
            if (decrementAndGet() == 0) {
                return;
            }
            e();
            return;
        }
        g60.a(this.e, j);
        a();
    }

    public final void k(k1b k1bVar) {
        if (this.g) {
            k1bVar.cancel();
            return;
        }
        x47.e(k1bVar, "s is null");
        if (get() == 0 && compareAndSet(0, 1)) {
            k1b k1bVar2 = this.a;
            if (k1bVar2 != null && this.f) {
                k1bVar2.cancel();
            }
            this.a = k1bVar;
            long j = this.b;
            if (decrementAndGet() != 0) {
                e();
            }
            if (j != 0) {
                k1bVar.w(j);
                return;
            }
            return;
        }
        k1b andSet = this.c.getAndSet(k1bVar);
        if (andSet != null && this.f) {
            andSet.cancel();
        }
        a();
    }

    @Override // defpackage.k1b
    public final void w(long j) {
        if (!n1b.u(j) || this.h) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.b;
            if (j2 != Long.MAX_VALUE) {
                long c = g60.c(j2, j);
                this.b = c;
                if (c == Long.MAX_VALUE) {
                    this.h = true;
                }
            }
            k1b k1bVar = this.a;
            if (decrementAndGet() != 0) {
                e();
            }
            if (k1bVar != null) {
                k1bVar.w(j);
                return;
            }
            return;
        }
        g60.a(this.d, j);
        a();
    }
}
