package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: Single.java */
/* renamed from: bma  reason: default package */
/* loaded from: classes3.dex */
public abstract class bma<T> implements tma<T> {
    public static <T> bma<T> f(Callable<? extends T> callable) {
        x47.e(callable, "callable is null");
        return tp9.o(new hma(callable));
    }

    @Override // defpackage.tma
    public final void a(kma<? super T> kmaVar) {
        x47.e(kmaVar, "observer is null");
        kma<? super T> w = tp9.w(this, kmaVar);
        x47.e(w, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            j(w);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            rl3.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final bma<T> b(long j, TimeUnit timeUnit) {
        return c(j, timeUnit, dw9.a(), false);
    }

    public final bma<T> c(long j, TimeUnit timeUnit, xv9 xv9Var, boolean z) {
        x47.e(timeUnit, "unit is null");
        x47.e(xv9Var, "scheduler is null");
        return tp9.o(new dma(this, j, timeUnit, xv9Var, z));
    }

    public final bma<T> d(wr1<? super Throwable> wr1Var) {
        x47.e(wr1Var, "onError is null");
        return tp9.o(new ema(this, wr1Var));
    }

    public final bma<T> e(wr1<? super T> wr1Var) {
        x47.e(wr1Var, "onSuccess is null");
        return tp9.o(new fma(this, wr1Var));
    }

    public final <R> bma<R> g(z84<? super T, ? extends R> z84Var) {
        x47.e(z84Var, "mapper is null");
        return tp9.o(new ima(this, z84Var));
    }

    public final bma<T> h(xv9 xv9Var) {
        x47.e(xv9Var, "scheduler is null");
        return tp9.o(new jma(this, xv9Var));
    }

    public final z33 i(wr1<? super T> wr1Var, wr1<? super Throwable> wr1Var2) {
        x47.e(wr1Var, "onSuccess is null");
        x47.e(wr1Var2, "onError is null");
        zr1 zr1Var = new zr1(wr1Var, wr1Var2);
        a(zr1Var);
        return zr1Var;
    }

    protected abstract void j(kma<? super T> kmaVar);

    public final bma<T> k(xv9 xv9Var) {
        x47.e(xv9Var, "scheduler is null");
        return tp9.o(new uma(this, xv9Var));
    }
}
