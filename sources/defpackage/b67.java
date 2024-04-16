package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ObservableScalarXMap.java */
/* renamed from: b67  reason: default package */
/* loaded from: classes3.dex */
public final class b67<T> extends AtomicInteger implements yu8<T>, Runnable {
    final h67<? super T> a;
    final T b;

    public b67(h67<? super T> h67Var, T t) {
        this.a = h67Var;
        this.b = t;
    }

    @Override // defpackage.z33
    public void a() {
        set(3);
    }

    @Override // defpackage.rla
    public void clear() {
        lazySet(3);
    }

    @Override // defpackage.z33
    public boolean i() {
        if (get() == 3) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rla
    public boolean isEmpty() {
        if (get() != 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bv8
    public int k(int i) {
        if ((i & 1) != 0) {
            lazySet(1);
            return 1;
        }
        return 0;
    }

    @Override // defpackage.rla
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.rla
    public T poll() throws Exception {
        if (get() == 1) {
            lazySet(3);
            return this.b;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.a.d((T) this.b);
            if (get() == 2) {
                lazySet(3);
                this.a.b();
            }
        }
    }
}
