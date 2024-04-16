package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: SpscLinkedArrayQueue.java */
/* renamed from: nsa  reason: default package */
/* loaded from: classes3.dex */
public final class nsa<T> implements pla<T> {
    static final int i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object j = new Object();
    int b;
    long c;
    final int d;
    AtomicReferenceArray<Object> e;
    final int f;
    AtomicReferenceArray<Object> g;
    final AtomicLong a = new AtomicLong();
    final AtomicLong h = new AtomicLong();

    public nsa(int i2) {
        int a = cg8.a(Math.max(8, i2));
        int i3 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.e = atomicReferenceArray;
        this.d = i3;
        a(a);
        this.g = atomicReferenceArray;
        this.f = i3;
        this.c = a - 2;
        p(0L);
    }

    private void a(int i2) {
        this.b = Math.min(i2 / 4, i);
    }

    private static int c(long j2, int i2) {
        return b(((int) j2) & i2);
    }

    private long d() {
        return this.h.get();
    }

    private long e() {
        return this.a.get();
    }

    private long f() {
        return this.h.get();
    }

    private static <E> Object g(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        return atomicReferenceArray.get(i2);
    }

    private AtomicReferenceArray<Object> h(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        int b = b(i2);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) g(atomicReferenceArray, b);
        n(atomicReferenceArray, b, null);
        return atomicReferenceArray2;
    }

    private long i() {
        return this.a.get();
    }

    private T j(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.g = atomicReferenceArray;
        int c = c(j2, i2);
        T t = (T) g(atomicReferenceArray, c);
        if (t != null) {
            n(atomicReferenceArray, c, null);
            m(j2 + 1);
        }
        return t;
    }

    private void l(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2, T t, long j3) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.e = atomicReferenceArray2;
        this.c = (j3 + j2) - 1;
        n(atomicReferenceArray2, i2, t);
        o(atomicReferenceArray, atomicReferenceArray2);
        n(atomicReferenceArray, i2, j);
        p(j2 + 1);
    }

    private void m(long j2) {
        this.h.lazySet(j2);
    }

    private static void n(AtomicReferenceArray<Object> atomicReferenceArray, int i2, Object obj) {
        atomicReferenceArray.lazySet(i2, obj);
    }

    private void o(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        n(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void p(long j2) {
        this.a.lazySet(j2);
    }

    private boolean q(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i2) {
        n(atomicReferenceArray, i2, t);
        p(j2 + 1);
        return true;
    }

    @Override // defpackage.rla
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // defpackage.rla
    public boolean isEmpty() {
        if (i() == f()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rla
    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.e;
            long e = e();
            int i2 = this.d;
            int c = c(e, i2);
            if (e < this.c) {
                return q(atomicReferenceArray, t, e, c);
            }
            long j2 = this.b + e;
            if (g(atomicReferenceArray, c(j2, i2)) == null) {
                this.c = j2 - 1;
                return q(atomicReferenceArray, t, e, c);
            } else if (g(atomicReferenceArray, c(1 + e, i2)) == null) {
                return q(atomicReferenceArray, t, e, c);
            } else {
                l(atomicReferenceArray, e, c, t, i2);
                return true;
            }
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // defpackage.pla, defpackage.rla
    public T poll() {
        boolean z;
        AtomicReferenceArray<Object> atomicReferenceArray = this.g;
        long d = d();
        int i2 = this.f;
        int c = c(d, i2);
        T t = (T) g(atomicReferenceArray, c);
        if (t == j) {
            z = true;
        } else {
            z = false;
        }
        if (t != null && !z) {
            n(atomicReferenceArray, c, null);
            m(d + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            return j(h(atomicReferenceArray, i2 + 1), d, i2);
        }
    }

    private static int b(int i2) {
        return i2;
    }
}
