package defpackage;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PublishProcessor.java */
/* renamed from: js8  reason: default package */
/* loaded from: classes3.dex */
public final class js8<T> extends i14<T> {
    static final a[] e = new a[0];
    static final a[] f = new a[0];
    final AtomicReference<a<T>[]> c = new AtomicReference<>(f);
    Throwable d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PublishProcessor.java */
    /* renamed from: js8$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicLong implements k1b {
        final i1b<? super T> a;
        final js8<T> b;

        a(i1b<? super T> i1bVar, js8<T> js8Var) {
            this.a = i1bVar;
            this.b = js8Var;
        }

        public boolean a() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        public void b() {
            if (get() != Long.MIN_VALUE) {
                this.a.b();
            }
        }

        public void c(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.a.onError(th);
            } else {
                tp9.q(th);
            }
        }

        @Override // defpackage.k1b
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.b.f0(this);
            }
        }

        public void d(T t) {
            long j = get();
            if (j == Long.MIN_VALUE) {
                return;
            }
            if (j != 0) {
                this.a.d(t);
                g60.e(this, 1L);
                return;
            }
            cancel();
            this.a.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
        }

        @Override // defpackage.k1b
        public void w(long j) {
            if (n1b.u(j)) {
                g60.b(this, j);
            }
        }
    }

    js8() {
    }

    public static <T> js8<T> e0() {
        return new js8<>();
    }

    @Override // defpackage.l04
    protected void S(i1b<? super T> i1bVar) {
        a<T> aVar = new a<>(i1bVar, this);
        i1bVar.c(aVar);
        if (d0(aVar)) {
            if (aVar.a()) {
                f0(aVar);
                return;
            }
            return;
        }
        Throwable th = this.d;
        if (th != null) {
            i1bVar.onError(th);
        } else {
            i1bVar.b();
        }
    }

    @Override // defpackage.i1b
    public void b() {
        a<T>[] aVarArr = this.c.get();
        a<T>[] aVarArr2 = e;
        if (aVarArr == aVarArr2) {
            return;
        }
        for (a<T> aVar : this.c.getAndSet(aVarArr2)) {
            aVar.b();
        }
    }

    @Override // defpackage.i1b
    public void c(k1b k1bVar) {
        if (this.c.get() == e) {
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
        for (a<T> aVar : this.c.get()) {
            aVar.d(t);
        }
    }

    boolean d0(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.c.get();
            if (aVarArr == e) {
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
            if (aVarArr != e && aVarArr != f) {
                int length = aVarArr.length;
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
                    aVarArr2 = f;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                    System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                    aVarArr2 = aVarArr3;
                }
            } else {
                return;
            }
        } while (!ho1.a(this.c, aVarArr, aVarArr2));
    }

    @Override // defpackage.i1b
    public void onError(Throwable th) {
        x47.e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        a<T>[] aVarArr = this.c.get();
        a<T>[] aVarArr2 = e;
        if (aVarArr == aVarArr2) {
            tp9.q(th);
            return;
        }
        this.d = th;
        for (a<T> aVar : this.c.getAndSet(aVarArr2)) {
            aVar.c(th);
        }
    }
}
