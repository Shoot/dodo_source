package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: LambdaObserver.java */
/* renamed from: fj5  reason: default package */
/* loaded from: classes3.dex */
public final class fj5<T> extends AtomicReference<z33> implements h67<T>, z33 {
    final wr1<? super T> a;
    final wr1<? super Throwable> b;
    final t4 c;
    final wr1<? super z33> d;

    public fj5(wr1<? super T> wr1Var, wr1<? super Throwable> wr1Var2, t4 t4Var, wr1<? super z33> wr1Var3) {
        this.a = wr1Var;
        this.b = wr1Var2;
        this.c = t4Var;
        this.d = wr1Var3;
    }

    @Override // defpackage.z33
    public void a() {
        g43.k(this);
    }

    @Override // defpackage.h67
    public void b() {
        if (!i()) {
            lazySet(g43.DISPOSED);
            try {
                this.c.run();
            } catch (Throwable th) {
                rl3.b(th);
                tp9.q(th);
            }
        }
    }

    @Override // defpackage.h67
    public void c(z33 z33Var) {
        if (g43.w(this, z33Var)) {
            try {
                this.d.accept(this);
            } catch (Throwable th) {
                rl3.b(th);
                z33Var.a();
                onError(th);
            }
        }
    }

    @Override // defpackage.h67
    public void d(T t) {
        if (!i()) {
            try {
                this.a.accept(t);
            } catch (Throwable th) {
                rl3.b(th);
                get().a();
                onError(th);
            }
        }
    }

    @Override // defpackage.z33
    public boolean i() {
        if (get() == g43.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // defpackage.h67
    public void onError(Throwable th) {
        if (!i()) {
            lazySet(g43.DISPOSED);
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
}
