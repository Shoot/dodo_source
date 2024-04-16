package defpackage;

import defpackage.mp;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: BehaviorProcessor.java */
/* renamed from: sa0  reason: default package */
/* loaded from: classes3.dex */
public final class sa0<T> extends i14<T> {
    static final Object[] j = new Object[0];
    static final a[] k = new a[0];
    static final a[] l = new a[0];
    final AtomicReference<a<T>[]> c;
    final ReadWriteLock d;
    final Lock e;
    final Lock f;
    final AtomicReference<Object> g = new AtomicReference<>();
    final AtomicReference<Throwable> h;
    long i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BehaviorProcessor.java */
    /* renamed from: sa0$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicLong implements k1b, mp.a<Object> {
        final i1b<? super T> a;
        final sa0<T> b;
        boolean c;
        boolean d;
        mp<Object> e;
        boolean f;
        volatile boolean g;
        long h;

        a(i1b<? super T> i1bVar, sa0<T> sa0Var) {
            this.a = i1bVar;
            this.b = sa0Var;
        }

        void a() {
            boolean z;
            if (this.g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.g) {
                        return;
                    }
                    if (this.c) {
                        return;
                    }
                    sa0<T> sa0Var = this.b;
                    Lock lock = sa0Var.e;
                    lock.lock();
                    this.h = sa0Var.i;
                    Object obj = sa0Var.g.get();
                    lock.unlock();
                    if (obj != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.d = z;
                    this.c = true;
                    if (obj == null || b(obj)) {
                        return;
                    }
                    c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.mp.a, defpackage.oh8
        public boolean b(Object obj) {
            if (this.g) {
                return true;
            }
            if (q27.u(obj)) {
                this.a.b();
                return true;
            } else if (q27.w(obj)) {
                this.a.onError(q27.q(obj));
                return true;
            } else {
                long j = get();
                if (j != 0) {
                    this.a.d((Object) q27.s(obj));
                    if (j != Long.MAX_VALUE) {
                        decrementAndGet();
                        return false;
                    }
                    return false;
                }
                cancel();
                this.a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
        }

        void c() {
            mp<Object> mpVar;
            while (!this.g) {
                synchronized (this) {
                    try {
                        mpVar = this.e;
                        if (mpVar == null) {
                            this.d = false;
                            return;
                        }
                        this.e = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                mpVar.c(this);
            }
        }

        @Override // defpackage.k1b
        public void cancel() {
            if (!this.g) {
                this.g = true;
                this.b.f0(this);
            }
        }

        void d(Object obj, long j) {
            if (this.g) {
                return;
            }
            if (!this.f) {
                synchronized (this) {
                    try {
                        if (this.g) {
                            return;
                        }
                        if (this.h == j) {
                            return;
                        }
                        if (this.d) {
                            mp<Object> mpVar = this.e;
                            if (mpVar == null) {
                                mpVar = new mp<>(4);
                                this.e = mpVar;
                            }
                            mpVar.b(obj);
                            return;
                        }
                        this.c = true;
                        this.f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            b(obj);
        }

        @Override // defpackage.k1b
        public void w(long j) {
            if (n1b.u(j)) {
                g60.a(this, j);
            }
        }
    }

    sa0() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.d = reentrantReadWriteLock;
        this.e = reentrantReadWriteLock.readLock();
        this.f = reentrantReadWriteLock.writeLock();
        this.c = new AtomicReference<>(k);
        this.h = new AtomicReference<>();
    }

    public static <T> sa0<T> e0() {
        return new sa0<>();
    }

    @Override // defpackage.l04
    protected void S(i1b<? super T> i1bVar) {
        a<T> aVar = new a<>(i1bVar, this);
        i1bVar.c(aVar);
        if (d0(aVar)) {
            if (aVar.g) {
                f0(aVar);
                return;
            } else {
                aVar.a();
                return;
            }
        }
        Throwable th = this.h.get();
        if (th == pl3.a) {
            i1bVar.b();
        } else {
            i1bVar.onError(th);
        }
    }

    @Override // defpackage.i1b
    public void b() {
        if (!ho1.a(this.h, null, pl3.a)) {
            return;
        }
        Object k2 = q27.k();
        for (a<T> aVar : h0(k2)) {
            aVar.d(k2, this.i);
        }
    }

    @Override // defpackage.i1b
    public void c(k1b k1bVar) {
        if (this.h.get() != null) {
            k1bVar.cancel();
        } else {
            k1bVar.w(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.i14
    public boolean c0() {
        if (this.c.get().length != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.i1b
    public void d(T t) {
        x47.e(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.h.get() != null) {
            return;
        }
        Object x = q27.x(t);
        g0(x);
        for (a<T> aVar : this.c.get()) {
            aVar.d(x, this.i);
        }
    }

    boolean d0(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.c.get();
            if (aVarArr == l) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!ho1.a(this.c, aVarArr, aVarArr2));
        return true;
    }

    void f0(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.c.get();
            int length = aVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (aVarArr[i] == aVar) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                aVarArr2 = k;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!ho1.a(this.c, aVarArr, aVarArr2));
    }

    void g0(Object obj) {
        Lock lock = this.f;
        lock.lock();
        this.i++;
        this.g.lazySet(obj);
        lock.unlock();
    }

    a<T>[] h0(Object obj) {
        a<T>[] aVarArr = this.c.get();
        a<T>[] aVarArr2 = l;
        if (aVarArr != aVarArr2 && (aVarArr = this.c.getAndSet(aVarArr2)) != aVarArr2) {
            g0(obj);
        }
        return aVarArr;
    }

    @Override // defpackage.i1b
    public void onError(Throwable th) {
        x47.e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!ho1.a(this.h, null, th)) {
            tp9.q(th);
            return;
        }
        Object o = q27.o(th);
        for (a<T> aVar : h0(o)) {
            aVar.d(o, this.i);
        }
    }
}
