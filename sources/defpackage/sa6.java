package defpackage;

import java.util.concurrent.Callable;
/* compiled from: Maybe.java */
/* renamed from: sa6  reason: default package */
/* loaded from: classes3.dex */
public abstract class sa6<T> implements xa6<T> {
    public static <T> sa6<T> b(Callable<? extends T> callable) {
        x47.e(callable, "callable is null");
        return tp9.m(new ua6(callable));
    }

    @Override // defpackage.xa6
    public final void a(wa6<? super T> wa6Var) {
        x47.e(wa6Var, "observer is null");
        wa6<? super T> u = tp9.u(this, wa6Var);
        x47.e(u, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            f(u);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            rl3.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final sa6<T> c(xv9 xv9Var) {
        x47.e(xv9Var, "scheduler is null");
        return tp9.m(new va6(this, xv9Var));
    }

    public final z33 d(wr1<? super T> wr1Var, wr1<? super Throwable> wr1Var2) {
        return e(wr1Var, wr1Var2, n94.c);
    }

    public final z33 e(wr1<? super T> wr1Var, wr1<? super Throwable> wr1Var2, t4 t4Var) {
        x47.e(wr1Var, "onSuccess is null");
        x47.e(wr1Var2, "onError is null");
        x47.e(t4Var, "onComplete is null");
        return (z33) g(new ta6(wr1Var, wr1Var2, t4Var));
    }

    protected abstract void f(wa6<? super T> wa6Var);

    public final <E extends wa6<? super T>> E g(E e) {
        a(e);
        return e;
    }
}
