package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: FlowableTake.java */
/* renamed from: o14  reason: default package */
/* loaded from: classes3.dex */
final class o14<T> extends AtomicBoolean implements m14<T>, k1b {
    final i1b<? super T> a;
    final long b;
    boolean c;
    k1b d;
    long e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o14(i1b<? super T> i1bVar, long j) {
        this.a = i1bVar;
        this.b = j;
        this.e = j;
    }

    @Override // defpackage.i1b
    public void b() {
        if (!this.c) {
            this.c = true;
            this.a.b();
        }
    }

    @Override // defpackage.m14, defpackage.i1b
    public void c(k1b k1bVar) {
        if (n1b.x(this.d, k1bVar)) {
            this.d = k1bVar;
            if (this.b == 0) {
                k1bVar.cancel();
                this.c = true;
                vg3.a(this.a);
                return;
            }
            this.a.c(this);
        }
    }

    @Override // defpackage.k1b
    public void cancel() {
        this.d.cancel();
    }

    @Override // defpackage.i1b
    public void d(T t) {
        boolean z;
        if (!this.c) {
            long j = this.e;
            long j2 = j - 1;
            this.e = j2;
            if (j > 0) {
                if (j2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.a.d(t);
                if (z) {
                    this.d.cancel();
                    b();
                }
            }
        }
    }

    @Override // defpackage.i1b
    public void onError(Throwable th) {
        if (!this.c) {
            this.c = true;
            this.d.cancel();
            this.a.onError(th);
            return;
        }
        tp9.q(th);
    }

    @Override // defpackage.k1b
    public void w(long j) {
        if (!n1b.u(j)) {
            return;
        }
        if (!get() && compareAndSet(false, true) && j >= this.b) {
            this.d.w(Long.MAX_VALUE);
        } else {
            this.d.w(j);
        }
    }
}
