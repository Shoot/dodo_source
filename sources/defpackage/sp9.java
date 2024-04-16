package defpackage;

import java.util.concurrent.Callable;
/* compiled from: RxAndroidPlugins.java */
/* renamed from: sp9  reason: default package */
/* loaded from: classes3.dex */
public final class sp9 {
    private static volatile z84<Callable<xv9>, xv9> a;
    private static volatile z84<xv9, xv9> b;

    static <T, R> R a(z84<T, R> z84Var, T t) {
        try {
            return z84Var.apply(t);
        } catch (Throwable th) {
            throw rl3.a(th);
        }
    }

    static xv9 b(z84<Callable<xv9>, xv9> z84Var, Callable<xv9> callable) {
        xv9 xv9Var = (xv9) a(z84Var, callable);
        if (xv9Var != null) {
            return xv9Var;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    static xv9 c(Callable<xv9> callable) {
        try {
            xv9 call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw rl3.a(th);
        }
    }

    public static xv9 d(Callable<xv9> callable) {
        if (callable != null) {
            z84<Callable<xv9>, xv9> z84Var = a;
            if (z84Var == null) {
                return c(callable);
            }
            return b(z84Var, callable);
        }
        throw new NullPointerException("scheduler == null");
    }

    public static xv9 e(xv9 xv9Var) {
        if (xv9Var != null) {
            z84<xv9, xv9> z84Var = b;
            if (z84Var == null) {
                return xv9Var;
            }
            return (xv9) a(z84Var, xv9Var);
        }
        throw new NullPointerException("scheduler == null");
    }
}
