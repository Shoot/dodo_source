package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PublishSubject.java */
/* renamed from: ks8  reason: default package */
/* loaded from: classes3.dex */
public final class ks8<T> extends z0b<T> {
    static final a[] c = new a[0];
    static final a[] d = new a[0];
    final AtomicReference<a<T>[]> a = new AtomicReference<>(d);
    Throwable b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PublishSubject.java */
    /* renamed from: ks8$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicBoolean implements z33 {
        final h67<? super T> a;
        final ks8<T> b;

        a(h67<? super T> h67Var, ks8<T> ks8Var) {
            this.a = h67Var;
            this.b = ks8Var;
        }

        @Override // defpackage.z33
        public void a() {
            if (compareAndSet(false, true)) {
                this.b.A(this);
            }
        }

        public void b() {
            if (!get()) {
                this.a.b();
            }
        }

        public void c(Throwable th) {
            if (get()) {
                tp9.q(th);
            } else {
                this.a.onError(th);
            }
        }

        public void d(T t) {
            if (!get()) {
                this.a.d(t);
            }
        }

        @Override // defpackage.z33
        public boolean i() {
            return get();
        }
    }

    ks8() {
    }

    public static <T> ks8<T> z() {
        return new ks8<>();
    }

    void A(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.a.get();
            if (aVarArr != c && aVarArr != d) {
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
                    aVarArr2 = d;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                    System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                    aVarArr2 = aVarArr3;
                }
            } else {
                return;
            }
        } while (!ho1.a(this.a, aVarArr, aVarArr2));
    }

    @Override // defpackage.h67
    public void b() {
        a<T>[] aVarArr = this.a.get();
        a<T>[] aVarArr2 = c;
        if (aVarArr == aVarArr2) {
            return;
        }
        for (a<T> aVar : this.a.getAndSet(aVarArr2)) {
            aVar.b();
        }
    }

    @Override // defpackage.h67
    public void c(z33 z33Var) {
        if (this.a.get() == c) {
            z33Var.a();
        }
    }

    @Override // defpackage.h67
    public void d(T t) {
        x47.e(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a<T> aVar : this.a.get()) {
            aVar.d(t);
        }
    }

    @Override // defpackage.h67
    public void onError(Throwable th) {
        x47.e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        a<T>[] aVarArr = this.a.get();
        a<T>[] aVarArr2 = c;
        if (aVarArr == aVarArr2) {
            tp9.q(th);
            return;
        }
        this.b = th;
        for (a<T> aVar : this.a.getAndSet(aVarArr2)) {
            aVar.c(th);
        }
    }

    @Override // defpackage.r57
    protected void r(h67<? super T> h67Var) {
        a<T> aVar = new a<>(h67Var, this);
        h67Var.c(aVar);
        if (y(aVar)) {
            if (aVar.i()) {
                A(aVar);
                return;
            }
            return;
        }
        Throwable th = this.b;
        if (th != null) {
            h67Var.onError(th);
        } else {
            h67Var.b();
        }
    }

    boolean y(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = this.a.get();
            if (aVarArr == c) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!ho1.a(this.a, aVarArr, aVarArr2));
        return true;
    }
}
