package defpackage;

import java.util.concurrent.Callable;
/* compiled from: Completable.java */
/* renamed from: sk1  reason: default package */
/* loaded from: classes3.dex */
public abstract class sk1 implements el1 {
    public static sk1 b(t4 t4Var) {
        x47.e(t4Var, "run is null");
        return tp9.k(new wk1(t4Var));
    }

    public static sk1 c(Callable<?> callable) {
        x47.e(callable, "callable is null");
        return tp9.k(new xk1(callable));
    }

    private static NullPointerException h(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    @Override // defpackage.el1
    public final void a(dl1 dl1Var) {
        x47.e(dl1Var, "observer is null");
        try {
            dl1 t = tp9.t(this, dl1Var);
            x47.e(t, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            f(t);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            rl3.b(th);
            tp9.q(th);
            throw h(th);
        }
    }

    public final sk1 d(xv9 xv9Var) {
        x47.e(xv9Var, "scheduler is null");
        return tp9.k(new cl1(this, xv9Var));
    }

    public final z33 e(t4 t4Var, wr1<? super Throwable> wr1Var) {
        x47.e(wr1Var, "onError is null");
        x47.e(t4Var, "onComplete is null");
        hm0 hm0Var = new hm0(wr1Var, t4Var);
        a(hm0Var);
        return hm0Var;
    }

    protected abstract void f(dl1 dl1Var);

    public final sk1 g(xv9 xv9Var) {
        x47.e(xv9Var, "scheduler is null");
        return tp9.k(new fl1(this, xv9Var));
    }
}
