package defpackage;

import defpackage.mp;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: BehaviorSubject.java */
/* renamed from: ta0  reason: default package */
/* loaded from: classes3.dex */
public final class ta0<T> extends z0b<T> {
    private static final Object[] h = new Object[0];
    static final a[] i = new a[0];
    static final a[] j = new a[0];
    final AtomicReference<Object> a;
    final AtomicReference<a<T>[]> b;
    final ReadWriteLock c;
    final Lock d;
    final Lock e;
    final AtomicReference<Throwable> f;
    long g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BehaviorSubject.java */
    /* renamed from: ta0$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements z33, mp.a<Object> {
        final h67<? super T> a;
        final ta0<T> b;
        boolean c;
        boolean d;
        mp<Object> e;
        boolean f;
        volatile boolean g;
        long h;

        a(h67<? super T> h67Var, ta0<T> ta0Var) {
            this.a = h67Var;
            this.b = ta0Var;
        }

        @Override // defpackage.z33
        public void a() {
            if (!this.g) {
                this.g = true;
                this.b.B(this);
            }
        }

        @Override // defpackage.mp.a, defpackage.oh8
        public boolean b(Object obj) {
            if (!this.g && !q27.a(obj, this.a)) {
                return false;
            }
            return true;
        }

        void c() {
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
                    ta0<T> ta0Var = this.b;
                    Lock lock = ta0Var.d;
                    lock.lock();
                    this.h = ta0Var.g;
                    Object obj = ta0Var.a.get();
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
                    d();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void d() {
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

        void e(Object obj, long j) {
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

        @Override // defpackage.z33
        public boolean i() {
            return this.g;
        }
    }

    ta0() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock;
        this.d = reentrantReadWriteLock.readLock();
        this.e = reentrantReadWriteLock.writeLock();
        this.b = new AtomicReference<>(i);
        this.a = new AtomicReference<>();
        this.f = new AtomicReference<>();
    }

    public static <T> ta0<T> z(T t) {
        return new ta0<>(t);
    }

    public T A() {
        Object obj = this.a.get();
        if (!q27.u(obj) && !q27.w(obj)) {
            return (T) q27.s(obj);
        }
        return null;
    }

    void B(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.b.get();
            int length = aVarArr.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (aVarArr[i2] == aVar) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr2 = i;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i2);
                System.arraycopy(aVarArr, i2 + 1, aVarArr3, i2, (length - i2) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!ho1.a(this.b, aVarArr, aVarArr2));
    }

    void C(Object obj) {
        this.e.lock();
        this.g++;
        this.a.lazySet(obj);
        this.e.unlock();
    }

    a<T>[] D(Object obj) {
        AtomicReference<a<T>[]> atomicReference = this.b;
        a<T>[] aVarArr = j;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr);
        if (andSet != aVarArr) {
            C(obj);
        }
        return andSet;
    }

    @Override // defpackage.h67
    public void b() {
        if (!ho1.a(this.f, null, pl3.a)) {
            return;
        }
        Object k = q27.k();
        for (a<T> aVar : D(k)) {
            aVar.e(k, this.g);
        }
    }

    @Override // defpackage.h67
    public void c(z33 z33Var) {
        if (this.f.get() != null) {
            z33Var.a();
        }
    }

    @Override // defpackage.h67
    public void d(T t) {
        x47.e(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f.get() != null) {
            return;
        }
        Object x = q27.x(t);
        C(x);
        for (a<T> aVar : this.b.get()) {
            aVar.e(x, this.g);
        }
    }

    @Override // defpackage.h67
    public void onError(Throwable th) {
        x47.e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!ho1.a(this.f, null, th)) {
            tp9.q(th);
            return;
        }
        Object o = q27.o(th);
        for (a<T> aVar : D(o)) {
            aVar.e(o, this.g);
        }
    }

    @Override // defpackage.r57
    protected void r(h67<? super T> h67Var) {
        a<T> aVar = new a<>(h67Var, this);
        h67Var.c(aVar);
        if (y(aVar)) {
            if (aVar.g) {
                B(aVar);
                return;
            } else {
                aVar.c();
                return;
            }
        }
        Throwable th = this.f.get();
        if (th == pl3.a) {
            h67Var.b();
        } else {
            h67Var.onError(th);
        }
    }

    boolean y(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.b.get();
            if (aVarArr == j) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!ho1.a(this.b, aVarArr, aVarArr2));
        return true;
    }

    ta0(T t) {
        this();
        this.a.lazySet(x47.e(t, "defaultValue is null"));
    }
}
