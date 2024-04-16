package defpackage;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import java.util.concurrent.Callable;
/* compiled from: RxJavaPlugins.java */
/* renamed from: tp9  reason: default package */
/* loaded from: classes3.dex */
public final class tp9 {
    static volatile wr1<? super Throwable> a;
    static volatile z84<? super Runnable, ? extends Runnable> b;
    static volatile z84<? super Callable<xv9>, ? extends xv9> c;
    static volatile z84<? super Callable<xv9>, ? extends xv9> d;
    static volatile z84<? super Callable<xv9>, ? extends xv9> e;
    static volatile z84<? super Callable<xv9>, ? extends xv9> f;
    static volatile z84<? super xv9, ? extends xv9> g;
    static volatile z84<? super xv9, ? extends xv9> h;
    static volatile z84<? super l04, ? extends l04> i;
    static volatile z84<? super r57, ? extends r57> j;
    static volatile z84<? super sa6, ? extends sa6> k;
    static volatile z84<? super bma, ? extends bma> l;
    static volatile z84<? super sk1, ? extends sk1> m;
    static volatile ya0<? super l04, ? super i1b, ? extends i1b> n;
    static volatile ya0<? super sa6, ? super wa6, ? extends wa6> o;
    static volatile ya0<? super r57, ? super h67, ? extends h67> p;
    static volatile ya0<? super bma, ? super kma, ? extends kma> q;
    static volatile ya0<? super sk1, ? super dl1, ? extends dl1> r;
    static volatile boolean s;

    static <T, U, R> R a(ya0<T, U, R> ya0Var, T t, U u) {
        try {
            return ya0Var.a(t, u);
        } catch (Throwable th) {
            throw pl3.d(th);
        }
    }

    static <T, R> R b(z84<T, R> z84Var, T t) {
        try {
            return z84Var.apply(t);
        } catch (Throwable th) {
            throw pl3.d(th);
        }
    }

    static xv9 c(z84<? super Callable<xv9>, ? extends xv9> z84Var, Callable<xv9> callable) {
        return (xv9) x47.e(b(z84Var, callable), "Scheduler Callable result can't be null");
    }

    static xv9 d(Callable<xv9> callable) {
        try {
            return (xv9) x47.e(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw pl3.d(th);
        }
    }

    public static wr1<? super Throwable> e() {
        return a;
    }

    public static xv9 f(Callable<xv9> callable) {
        x47.e(callable, "Scheduler Callable can't be null");
        z84<? super Callable<xv9>, ? extends xv9> z84Var = c;
        if (z84Var == null) {
            return d(callable);
        }
        return c(z84Var, callable);
    }

    public static xv9 g(Callable<xv9> callable) {
        x47.e(callable, "Scheduler Callable can't be null");
        z84<? super Callable<xv9>, ? extends xv9> z84Var = e;
        if (z84Var == null) {
            return d(callable);
        }
        return c(z84Var, callable);
    }

    public static xv9 h(Callable<xv9> callable) {
        x47.e(callable, "Scheduler Callable can't be null");
        z84<? super Callable<xv9>, ? extends xv9> z84Var = f;
        if (z84Var == null) {
            return d(callable);
        }
        return c(z84Var, callable);
    }

    public static xv9 i(Callable<xv9> callable) {
        x47.e(callable, "Scheduler Callable can't be null");
        z84<? super Callable<xv9>, ? extends xv9> z84Var = d;
        if (z84Var == null) {
            return d(callable);
        }
        return c(z84Var, callable);
    }

    static boolean j(Throwable th) {
        if ((th instanceof OnErrorNotImplementedException) || (th instanceof MissingBackpressureException) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof CompositeException)) {
            return true;
        }
        return false;
    }

    public static sk1 k(sk1 sk1Var) {
        z84<? super sk1, ? extends sk1> z84Var = m;
        if (z84Var != null) {
            return (sk1) b(z84Var, sk1Var);
        }
        return sk1Var;
    }

    public static <T> l04<T> l(l04<T> l04Var) {
        z84<? super l04, ? extends l04> z84Var = i;
        if (z84Var != null) {
            return (l04) b(z84Var, l04Var);
        }
        return l04Var;
    }

    public static <T> sa6<T> m(sa6<T> sa6Var) {
        z84<? super sa6, ? extends sa6> z84Var = k;
        if (z84Var != null) {
            return (sa6) b(z84Var, sa6Var);
        }
        return sa6Var;
    }

    public static <T> r57<T> n(r57<T> r57Var) {
        z84<? super r57, ? extends r57> z84Var = j;
        if (z84Var != null) {
            return (r57) b(z84Var, r57Var);
        }
        return r57Var;
    }

    public static <T> bma<T> o(bma<T> bmaVar) {
        z84<? super bma, ? extends bma> z84Var = l;
        if (z84Var != null) {
            return (bma) b(z84Var, bmaVar);
        }
        return bmaVar;
    }

    public static xv9 p(xv9 xv9Var) {
        z84<? super xv9, ? extends xv9> z84Var = g;
        if (z84Var == null) {
            return xv9Var;
        }
        return (xv9) b(z84Var, xv9Var);
    }

    public static void q(Throwable th) {
        wr1<? super Throwable> wr1Var = a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!j(th)) {
            th = new UndeliverableException(th);
        }
        if (wr1Var != null) {
            try {
                wr1Var.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                z(th2);
            }
        }
        th.printStackTrace();
        z(th);
    }

    public static xv9 r(xv9 xv9Var) {
        z84<? super xv9, ? extends xv9> z84Var = h;
        if (z84Var == null) {
            return xv9Var;
        }
        return (xv9) b(z84Var, xv9Var);
    }

    public static Runnable s(Runnable runnable) {
        x47.e(runnable, "run is null");
        z84<? super Runnable, ? extends Runnable> z84Var = b;
        if (z84Var == null) {
            return runnable;
        }
        return (Runnable) b(z84Var, runnable);
    }

    public static dl1 t(sk1 sk1Var, dl1 dl1Var) {
        ya0<? super sk1, ? super dl1, ? extends dl1> ya0Var = r;
        if (ya0Var != null) {
            return (dl1) a(ya0Var, sk1Var, dl1Var);
        }
        return dl1Var;
    }

    public static <T> wa6<? super T> u(sa6<T> sa6Var, wa6<? super T> wa6Var) {
        ya0<? super sa6, ? super wa6, ? extends wa6> ya0Var = o;
        if (ya0Var != null) {
            return (wa6) a(ya0Var, sa6Var, wa6Var);
        }
        return wa6Var;
    }

    public static <T> h67<? super T> v(r57<T> r57Var, h67<? super T> h67Var) {
        ya0<? super r57, ? super h67, ? extends h67> ya0Var = p;
        if (ya0Var != null) {
            return (h67) a(ya0Var, r57Var, h67Var);
        }
        return h67Var;
    }

    public static <T> kma<? super T> w(bma<T> bmaVar, kma<? super T> kmaVar) {
        ya0<? super bma, ? super kma, ? extends kma> ya0Var = q;
        if (ya0Var != null) {
            return (kma) a(ya0Var, bmaVar, kmaVar);
        }
        return kmaVar;
    }

    public static <T> i1b<? super T> x(l04<T> l04Var, i1b<? super T> i1bVar) {
        ya0<? super l04, ? super i1b, ? extends i1b> ya0Var = n;
        if (ya0Var != null) {
            return (i1b) a(ya0Var, l04Var, i1bVar);
        }
        return i1bVar;
    }

    public static void y(wr1<? super Throwable> wr1Var) {
        if (!s) {
            a = wr1Var;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    static void z(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
