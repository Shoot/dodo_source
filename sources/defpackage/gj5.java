package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: LambdaSubscriber.java */
/* renamed from: gj5  reason: default package */
/* loaded from: classes3.dex */
public final class gj5<T> extends AtomicReference<k1b> implements m14<T>, k1b, z33 {
    final wr1<? super T> a;
    final wr1<? super Throwable> b;
    final t4 c;
    final wr1<? super k1b> d;

    public gj5(wr1<? super T> wr1Var, wr1<? super Throwable> wr1Var2, t4 t4Var, wr1<? super k1b> wr1Var3) {
        this.a = wr1Var;
        this.b = wr1Var2;
        this.c = t4Var;
        this.d = wr1Var3;
    }

    @Override // defpackage.z33
    public void a() {
        cancel();
    }

    @Override // defpackage.i1b
    public void b() {
        k1b k1bVar = get();
        n1b n1bVar = n1b.CANCELLED;
        if (k1bVar != n1bVar) {
            lazySet(n1bVar);
            try {
                this.c.run();
            } catch (Throwable th) {
                rl3.b(th);
                tp9.q(th);
            }
        }
    }

    @Override // defpackage.m14, defpackage.i1b
    public void c(k1b k1bVar) {
        if (n1b.s(this, k1bVar)) {
            try {
                this.d.accept(this);
            } catch (Throwable th) {
                rl3.b(th);
                k1bVar.cancel();
                onError(th);
            }
        }
    }

    @Override // defpackage.k1b
    public void cancel() {
        n1b.a(this);
    }

    @Override // defpackage.i1b
    public void d(T t) {
        if (!i()) {
            try {
                this.a.accept(t);
            } catch (Throwable th) {
                rl3.b(th);
                get().cancel();
                onError(th);
            }
        }
    }

    @Override // defpackage.z33
    public boolean i() {
        if (get() == n1b.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // defpackage.i1b
    public void onError(Throwable th) {
        k1b k1bVar = get();
        n1b n1bVar = n1b.CANCELLED;
        if (k1bVar != n1bVar) {
            lazySet(n1bVar);
            try {
                this.b.accept(th);
                return;
            } catch (Throwable th2) {
                rl3.b(th2);
                tp9.q(new CompositeException(th, th2));
                return;
            }
        }
        tp9.q(th);
    }

    @Override // defpackage.k1b
    public void w(long j) {
        get().w(j);
    }
}
