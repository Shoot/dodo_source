package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: SpscArrayQueue.java */
/* renamed from: msa  reason: default package */
/* loaded from: classes3.dex */
public final class msa<E> extends AtomicReferenceArray<E> implements pla<E> {
    private static final Integer f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    final int a;
    final AtomicLong b;
    long c;
    final AtomicLong d;
    final int e;

    public msa(int i) {
        super(cg8.a(i));
        this.a = length() - 1;
        this.b = new AtomicLong();
        this.d = new AtomicLong();
        this.e = Math.min(i / 4, f.intValue());
    }

    int a(long j) {
        return this.a & ((int) j);
    }

    int b(long j, int i) {
        return ((int) j) & i;
    }

    E c(int i) {
        return get(i);
    }

    @Override // defpackage.rla
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    void d(long j) {
        this.d.lazySet(j);
    }

    void e(int i, E e) {
        lazySet(i, e);
    }

    void f(long j) {
        this.b.lazySet(j);
    }

    @Override // defpackage.rla
    public boolean isEmpty() {
        if (this.b.get() == this.d.get()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rla
    public boolean offer(E e) {
        if (e != null) {
            int i = this.a;
            long j = this.b.get();
            int b = b(j, i);
            if (j >= this.c) {
                long j2 = this.e + j;
                if (c(b(j2, i)) == null) {
                    this.c = j2;
                } else if (c(b) != null) {
                    return false;
                }
            }
            e(b, e);
            f(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // defpackage.pla, defpackage.rla
    public E poll() {
        long j = this.d.get();
        int a = a(j);
        E c = c(a);
        if (c == null) {
            return null;
        }
        d(j + 1);
        e(a, null);
        return c;
    }
}
