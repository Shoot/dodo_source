package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ScalarSubscription.java */
/* renamed from: ev9  reason: default package */
/* loaded from: classes3.dex */
public final class ev9<T> extends AtomicInteger implements dv8<T> {
    final T a;
    final i1b<? super T> b;

    public ev9(i1b<? super T> i1bVar, T t) {
        this.b = i1bVar;
        this.a = t;
    }

    @Override // defpackage.k1b
    public void cancel() {
        lazySet(2);
    }

    @Override // defpackage.rla
    public void clear() {
        lazySet(1);
    }

    @Override // defpackage.rla
    public boolean isEmpty() {
        if (get() != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bv8
    public int k(int i) {
        return i & 1;
    }

    @Override // defpackage.rla
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.rla
    public T poll() {
        if (get() == 0) {
            lazySet(1);
            return this.a;
        }
        return null;
    }

    @Override // defpackage.k1b
    public void w(long j) {
        if (n1b.u(j) && compareAndSet(0, 1)) {
            i1b<? super T> i1bVar = this.b;
            i1bVar.d((T) this.a);
            if (get() != 2) {
                i1bVar.b();
            }
        }
    }
}
