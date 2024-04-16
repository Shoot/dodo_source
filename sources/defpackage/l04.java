package defpackage;

import defpackage.a14;
import java.util.concurrent.TimeUnit;
/* compiled from: Flowable.java */
/* renamed from: l04  reason: default package */
/* loaded from: classes3.dex */
public abstract class l04<T> implements ls8<T> {
    static final int a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());
    public static final /* synthetic */ int b = 0;

    public static <T> l04<T> B(Iterable<? extends T> iterable) {
        x47.e(iterable, "source is null");
        return tp9.l(new y04(iterable));
    }

    public static <T> l04<T> C(ls8<? extends T> ls8Var) {
        if (ls8Var instanceof l04) {
            return tp9.l((l04) ls8Var);
        }
        x47.e(ls8Var, "source is null");
        return tp9.l(new z04(ls8Var));
    }

    public static l04<Long> D(long j, long j2, TimeUnit timeUnit, xv9 xv9Var) {
        x47.e(timeUnit, "unit is null");
        x47.e(xv9Var, "scheduler is null");
        return tp9.l(new b14(Math.max(0L, j), Math.max(0L, j2), timeUnit, xv9Var));
    }

    public static l04<Long> E(long j, TimeUnit timeUnit) {
        return D(j, j, timeUnit, dw9.a());
    }

    public static <T> l04<T> F(T t) {
        x47.e(t, "item is null");
        return tp9.l(new c14(t));
    }

    public static l04<Long> Z(long j, TimeUnit timeUnit) {
        return a0(j, timeUnit, dw9.a());
    }

    public static l04<Long> a0(long j, TimeUnit timeUnit, xv9 xv9Var) {
        x47.e(timeUnit, "unit is null");
        x47.e(xv9Var, "scheduler is null");
        return tp9.l(new r14(Math.max(0L, j), timeUnit, xv9Var));
    }

    public static int e() {
        return a;
    }

    public static <T> l04<T> i(h14<T> h14Var, h60 h60Var) {
        x47.e(h14Var, "source is null");
        x47.e(h60Var, "mode is null");
        return tp9.l(new n04(h14Var, h60Var));
    }

    private l04<T> r(wr1<? super T> wr1Var, wr1<? super Throwable> wr1Var2, t4 t4Var, t4 t4Var2) {
        x47.e(wr1Var, "onNext is null");
        x47.e(wr1Var2, "onError is null");
        x47.e(t4Var, "onComplete is null");
        x47.e(t4Var2, "onAfterTerminate is null");
        return tp9.l(new r04(this, wr1Var, wr1Var2, t4Var, t4Var2));
    }

    public static <T> l04<T> u() {
        return tp9.l(u04.c);
    }

    public final <R> l04<R> A(z84<? super T, ? extends xa6<? extends R>> z84Var, boolean z, int i) {
        x47.e(z84Var, "mapper is null");
        x47.f(i, "maxConcurrency");
        return tp9.l(new x04(this, z84Var, z, i));
    }

    public final <R> l04<R> G(z84<? super T, ? extends R> z84Var) {
        x47.e(z84Var, "mapper is null");
        return tp9.l(new d14(this, z84Var));
    }

    public final l04<T> H(xv9 xv9Var) {
        return I(xv9Var, false, e());
    }

    public final l04<T> I(xv9 xv9Var, boolean z, int i) {
        x47.e(xv9Var, "scheduler is null");
        x47.f(i, "bufferSize");
        return tp9.l(new e14(this, xv9Var, z, i));
    }

    public final l04<T> J() {
        return K(e(), false, true);
    }

    public final l04<T> K(int i, boolean z, boolean z2) {
        x47.f(i, "capacity");
        return tp9.l(new f14(this, i, z2, z, n94.c));
    }

    public final l04<T> L() {
        return tp9.l(new g14(this));
    }

    public final l04<T> M(long j, TimeUnit timeUnit) {
        return N(j, timeUnit, dw9.a());
    }

    public final l04<T> N(long j, TimeUnit timeUnit, xv9 xv9Var) {
        x47.e(timeUnit, "unit is null");
        x47.e(xv9Var, "scheduler is null");
        return tp9.l(new j14(this, j, timeUnit, xv9Var, false));
    }

    public final z33 O(wr1<? super T> wr1Var) {
        return Q(wr1Var, n94.f, n94.c, a14.b.INSTANCE);
    }

    public final z33 P(wr1<? super T> wr1Var, wr1<? super Throwable> wr1Var2) {
        return Q(wr1Var, wr1Var2, n94.c, a14.b.INSTANCE);
    }

    public final z33 Q(wr1<? super T> wr1Var, wr1<? super Throwable> wr1Var2, t4 t4Var, wr1<? super k1b> wr1Var3) {
        x47.e(wr1Var, "onNext is null");
        x47.e(wr1Var2, "onError is null");
        x47.e(t4Var, "onComplete is null");
        x47.e(wr1Var3, "onSubscribe is null");
        gj5 gj5Var = new gj5(wr1Var, wr1Var2, t4Var, wr1Var3);
        R(gj5Var);
        return gj5Var;
    }

    public final void R(m14<? super T> m14Var) {
        x47.e(m14Var, "s is null");
        try {
            i1b<? super T> x = tp9.x(this, m14Var);
            x47.e(x, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            S(x);
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

    protected abstract void S(i1b<? super T> i1bVar);

    public final l04<T> T(xv9 xv9Var) {
        x47.e(xv9Var, "scheduler is null");
        return U(xv9Var, !(this instanceof n04));
    }

    public final l04<T> U(xv9 xv9Var, boolean z) {
        x47.e(xv9Var, "scheduler is null");
        return tp9.l(new l14(this, xv9Var, z));
    }

    public final l04<T> V(ls8<? extends T> ls8Var) {
        x47.e(ls8Var, "other is null");
        return tp9.l(new n14(this, ls8Var));
    }

    public final l04<T> W(long j, TimeUnit timeUnit) {
        return M(j, timeUnit);
    }

    public final l04<wgb<T>> X() {
        return Y(TimeUnit.MILLISECONDS, dw9.a());
    }

    public final l04<wgb<T>> Y(TimeUnit timeUnit, xv9 xv9Var) {
        x47.e(timeUnit, "unit is null");
        x47.e(xv9Var, "scheduler is null");
        return tp9.l(new q14(this, timeUnit, xv9Var));
    }

    @Override // defpackage.ls8
    public final void a(i1b<? super T> i1bVar) {
        if (i1bVar instanceof m14) {
            R((m14) i1bVar);
            return;
        }
        x47.e(i1bVar, "s is null");
        R(new iza(i1bVar));
    }

    public final l04<T> b0(xv9 xv9Var) {
        x47.e(xv9Var, "scheduler is null");
        return tp9.l(new s14(this, xv9Var));
    }

    public final <R> l04<R> g(z84<? super T, ? extends ls8<? extends R>> z84Var) {
        return h(z84Var, 2);
    }

    public final <R> l04<R> h(z84<? super T, ? extends ls8<? extends R>> z84Var, int i) {
        x47.e(z84Var, "mapper is null");
        x47.f(i, "prefetch");
        if (this instanceof cv9) {
            Object call = ((cv9) this).call();
            if (call == null) {
                return u();
            }
            return k14.a(call, z84Var);
        }
        return tp9.l(new m04(this, z84Var, i, jk3.IMMEDIATE));
    }

    public final l04<T> j(long j, TimeUnit timeUnit) {
        return k(j, timeUnit, dw9.a());
    }

    public final l04<T> k(long j, TimeUnit timeUnit, xv9 xv9Var) {
        x47.e(timeUnit, "unit is null");
        x47.e(xv9Var, "scheduler is null");
        return tp9.l(new o04(this, j, timeUnit, xv9Var));
    }

    public final l04<T> l(T t) {
        x47.e(t, "defaultItem is null");
        return V(F(t));
    }

    public final l04<T> m(long j, TimeUnit timeUnit) {
        return n(j, timeUnit, dw9.a(), false);
    }

    public final l04<T> n(long j, TimeUnit timeUnit, xv9 xv9Var, boolean z) {
        x47.e(timeUnit, "unit is null");
        x47.e(xv9Var, "scheduler is null");
        return tp9.l(new p04(this, Math.max(0L, j), timeUnit, xv9Var, z));
    }

    public final <U> l04<T> o(z84<? super T, ? extends ls8<U>> z84Var) {
        x47.e(z84Var, "itemDelayIndicator is null");
        return (l04<T>) x(a14.a(z84Var));
    }

    public final l04<T> p() {
        return q(n94.b());
    }

    public final <K> l04<T> q(z84<? super T, K> z84Var) {
        x47.e(z84Var, "keySelector is null");
        return tp9.l(new q04(this, z84Var, x47.d()));
    }

    public final l04<T> s(wr1<? super T> wr1Var) {
        wr1<? super Throwable> a2 = n94.a();
        t4 t4Var = n94.c;
        return r(wr1Var, a2, t4Var, t4Var);
    }

    public final sa6<T> t(long j) {
        if (j >= 0) {
            return tp9.m(new s04(this, j));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    public final l04<T> v(oh8<? super T> oh8Var) {
        x47.e(oh8Var, "predicate is null");
        return tp9.l(new v04(this, oh8Var));
    }

    public final sa6<T> w() {
        return t(0L);
    }

    public final <R> l04<R> x(z84<? super T, ? extends ls8<? extends R>> z84Var) {
        return y(z84Var, false, e(), e());
    }

    public final <R> l04<R> y(z84<? super T, ? extends ls8<? extends R>> z84Var, boolean z, int i, int i2) {
        x47.e(z84Var, "mapper is null");
        x47.f(i, "maxConcurrency");
        x47.f(i2, "bufferSize");
        if (this instanceof cv9) {
            Object call = ((cv9) this).call();
            if (call == null) {
                return u();
            }
            return k14.a(call, z84Var);
        }
        return tp9.l(new w04(this, z84Var, z, i, i2));
    }

    public final <R> l04<R> z(z84<? super T, ? extends xa6<? extends R>> z84Var) {
        return A(z84Var, false, Integer.MAX_VALUE);
    }
}
