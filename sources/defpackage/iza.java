package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: StrictSubscriber.java */
/* renamed from: iza  reason: default package */
/* loaded from: classes3.dex */
public class iza<T> extends AtomicInteger implements m14<T>, k1b {
    final i1b<? super T> a;
    final wy b = new wy();
    final AtomicLong c = new AtomicLong();
    final AtomicReference<k1b> d = new AtomicReference<>();
    final AtomicBoolean e = new AtomicBoolean();
    volatile boolean f;

    public iza(i1b<? super T> i1bVar) {
        this.a = i1bVar;
    }

    @Override // defpackage.i1b
    public void b() {
        this.f = true;
        yj4.a(this.a, this, this.b);
    }

    @Override // defpackage.m14, defpackage.i1b
    public void c(k1b k1bVar) {
        if (this.e.compareAndSet(false, true)) {
            this.a.c(this);
            n1b.k(this.d, this.c, k1bVar);
            return;
        }
        k1bVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    @Override // defpackage.k1b
    public void cancel() {
        if (!this.f) {
            n1b.a(this.d);
        }
    }

    @Override // defpackage.i1b
    public void d(T t) {
        yj4.c(this.a, t, this, this.b);
    }

    @Override // defpackage.i1b
    public void onError(Throwable th) {
        this.f = true;
        yj4.b(this.a, th, this, this.b);
    }

    @Override // defpackage.k1b
    public void w(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        n1b.i(this.d, this.c, j);
    }
}
