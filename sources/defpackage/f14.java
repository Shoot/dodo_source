package defpackage;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: FlowableOnBackpressureBuffer.java */
/* renamed from: f14  reason: default package */
/* loaded from: classes3.dex */
public final class f14<T> extends j1<T, T> {
    final int d;
    final boolean e;
    final boolean f;
    final t4 g;

    /* compiled from: FlowableOnBackpressureBuffer.java */
    /* renamed from: f14$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends l90<T> implements m14<T> {
        final i1b<? super T> a;
        final pla<T> b;
        final boolean c;
        final t4 d;
        k1b e;
        volatile boolean f;
        volatile boolean g;
        Throwable h;
        final AtomicLong i = new AtomicLong();
        boolean j;

        a(i1b<? super T> i1bVar, int i, boolean z, boolean z2, t4 t4Var) {
            pla<T> msaVar;
            this.a = i1bVar;
            this.d = t4Var;
            this.c = z2;
            if (z) {
                msaVar = new nsa<>(i);
            } else {
                msaVar = new msa<>(i);
            }
            this.b = msaVar;
        }

        boolean a(boolean z, boolean z2, i1b<? super T> i1bVar) {
            if (this.f) {
                this.b.clear();
                return true;
            } else if (z) {
                if (this.c) {
                    if (z2) {
                        Throwable th = this.h;
                        if (th != null) {
                            i1bVar.onError(th);
                        } else {
                            i1bVar.b();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.h;
                if (th2 != null) {
                    this.b.clear();
                    i1bVar.onError(th2);
                    return true;
                } else if (z2) {
                    i1bVar.b();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override // defpackage.i1b
        public void b() {
            this.g = true;
            if (this.j) {
                this.a.b();
            } else {
                e();
            }
        }

        @Override // defpackage.m14, defpackage.i1b
        public void c(k1b k1bVar) {
            if (n1b.x(this.e, k1bVar)) {
                this.e = k1bVar;
                this.a.c(this);
                k1bVar.w(Long.MAX_VALUE);
            }
        }

        @Override // defpackage.k1b
        public void cancel() {
            if (!this.f) {
                this.f = true;
                this.e.cancel();
                if (!this.j && getAndIncrement() == 0) {
                    this.b.clear();
                }
            }
        }

        @Override // defpackage.rla
        public void clear() {
            this.b.clear();
        }

        @Override // defpackage.i1b
        public void d(T t) {
            if (!this.b.offer(t)) {
                this.e.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.d.run();
                } catch (Throwable th) {
                    rl3.b(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
            } else if (this.j) {
                this.a.d(null);
            } else {
                e();
            }
        }

        void e() {
            int i;
            boolean z;
            if (getAndIncrement() == 0) {
                pla<T> plaVar = this.b;
                i1b<? super T> i1bVar = this.a;
                int i2 = 1;
                while (!a(this.g, plaVar.isEmpty(), i1bVar)) {
                    long j = this.i.get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        }
                        boolean z2 = this.g;
                        Object obj = (T) plaVar.poll();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (a(z2, z, i1bVar)) {
                            return;
                        }
                        if (z) {
                            break;
                        }
                        i1bVar.d(obj);
                        j2++;
                    }
                    if (i == 0 && a(this.g, plaVar.isEmpty(), i1bVar)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.i.addAndGet(-j2);
                    }
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // defpackage.rla
        public boolean isEmpty() {
            return this.b.isEmpty();
        }

        @Override // defpackage.bv8
        public int k(int i) {
            if ((i & 2) != 0) {
                this.j = true;
                return 2;
            }
            return 0;
        }

        @Override // defpackage.i1b
        public void onError(Throwable th) {
            this.h = th;
            this.g = true;
            if (this.j) {
                this.a.onError(th);
            } else {
                e();
            }
        }

        @Override // defpackage.rla
        public T poll() throws Exception {
            return this.b.poll();
        }

        @Override // defpackage.k1b
        public void w(long j) {
            if (!this.j && n1b.u(j)) {
                g60.a(this.i, j);
                e();
            }
        }
    }

    public f14(l04<T> l04Var, int i, boolean z, boolean z2, t4 t4Var) {
        super(l04Var);
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = t4Var;
    }

    @Override // defpackage.l04
    protected void S(i1b<? super T> i1bVar) {
        this.c.R(new a(i1bVar, this.d, this.e, this.f, this.g));
    }
}
