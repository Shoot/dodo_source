package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: Observable.java */
/* renamed from: r57  reason: default package */
/* loaded from: classes3.dex */
public abstract class r57<T> implements c67<T> {
    public static int e() {
        return l04.e();
    }

    public static <T, R> r57<R> f(z84<? super Object[], ? extends R> z84Var, int i, c67<? extends T>... c67VarArr) {
        return h(c67VarArr, z84Var, i);
    }

    public static <T1, T2, R> r57<R> g(c67<? extends T1> c67Var, c67<? extends T2> c67Var2, ya0<? super T1, ? super T2, ? extends R> ya0Var) {
        x47.e(c67Var, "source1 is null");
        x47.e(c67Var2, "source2 is null");
        return f(n94.d(ya0Var), e(), c67Var, c67Var2);
    }

    public static <T, R> r57<R> h(c67<? extends T>[] c67VarArr, z84<? super Object[], ? extends R> z84Var, int i) {
        x47.e(c67VarArr, "sources is null");
        if (c67VarArr.length == 0) {
            return j();
        }
        x47.e(z84Var, "combiner is null");
        x47.f(i, "bufferSize");
        return tp9.n(new s57(c67VarArr, null, z84Var, i << 1, false));
    }

    public static <T> r57<T> i(z57<T> z57Var) {
        x47.e(z57Var, "source is null");
        return tp9.n(new t57(z57Var));
    }

    public static <T> r57<T> j() {
        return tp9.n(v57.a);
    }

    public static <T> r57<T> l(T t) {
        x47.e(t, "item is null");
        return tp9.n(new x57(t));
    }

    public static r57<Long> v(long j, TimeUnit timeUnit) {
        return w(j, timeUnit, dw9.a());
    }

    public static r57<Long> w(long j, TimeUnit timeUnit, xv9 xv9Var) {
        x47.e(timeUnit, "unit is null");
        x47.e(xv9Var, "scheduler is null");
        return tp9.n(new f67(Math.max(j, 0L), timeUnit, xv9Var));
    }

    @Override // defpackage.c67
    public final void a(h67<? super T> h67Var) {
        x47.e(h67Var, "observer is null");
        try {
            h67<? super T> v = tp9.v(this, h67Var);
            x47.e(v, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            r(v);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            rl3.b(th);
            tp9.q(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final r57<T> k(oh8<? super T> oh8Var) {
        x47.e(oh8Var, "predicate is null");
        return tp9.n(new w57(this, oh8Var));
    }

    public final r57<T> m(xv9 xv9Var) {
        return n(xv9Var, false, e());
    }

    public final r57<T> n(xv9 xv9Var, boolean z, int i) {
        x47.e(xv9Var, "scheduler is null");
        x47.f(i, "bufferSize");
        return tp9.n(new y57(this, xv9Var, z, i));
    }

    public final z33 o(wr1<? super T> wr1Var) {
        return q(wr1Var, n94.f, n94.c, n94.a());
    }

    public final z33 p(wr1<? super T> wr1Var, wr1<? super Throwable> wr1Var2) {
        return q(wr1Var, wr1Var2, n94.c, n94.a());
    }

    public final z33 q(wr1<? super T> wr1Var, wr1<? super Throwable> wr1Var2, t4 t4Var, wr1<? super z33> wr1Var3) {
        x47.e(wr1Var, "onNext is null");
        x47.e(wr1Var2, "onError is null");
        x47.e(t4Var, "onComplete is null");
        x47.e(wr1Var3, "onSubscribe is null");
        fj5 fj5Var = new fj5(wr1Var, wr1Var2, t4Var, wr1Var3);
        a(fj5Var);
        return fj5Var;
    }

    protected abstract void r(h67<? super T> h67Var);

    public final r57<T> s(xv9 xv9Var) {
        x47.e(xv9Var, "scheduler is null");
        return tp9.n(new d67(this, xv9Var));
    }

    public final r57<T> t(long j, TimeUnit timeUnit) {
        return u(j, timeUnit, dw9.a(), false);
    }

    public final r57<T> u(long j, TimeUnit timeUnit, xv9 xv9Var, boolean z) {
        x47.e(timeUnit, "unit is null");
        x47.e(xv9Var, "scheduler is null");
        return tp9.n(new e67(this, j, timeUnit, xv9Var, z));
    }

    public final r57<T> x(xv9 xv9Var) {
        x47.e(xv9Var, "scheduler is null");
        return tp9.n(new g67(this, xv9Var));
    }
}
