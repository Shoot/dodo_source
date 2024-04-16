package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: MaybeCallbackObserver.java */
/* renamed from: ta6  reason: default package */
/* loaded from: classes3.dex */
public final class ta6<T> extends AtomicReference<z33> implements wa6<T>, z33 {
    final wr1<? super T> a;
    final wr1<? super Throwable> b;
    final t4 c;

    public ta6(wr1<? super T> wr1Var, wr1<? super Throwable> wr1Var2, t4 t4Var) {
        this.a = wr1Var;
        this.b = wr1Var2;
        this.c = t4Var;
    }

    @Override // defpackage.z33
    public void a() {
        g43.k(this);
    }

    @Override // defpackage.wa6
    public void b() {
        lazySet(g43.DISPOSED);
        try {
            this.c.run();
        } catch (Throwable th) {
            rl3.b(th);
            tp9.q(th);
        }
    }

    @Override // defpackage.wa6
    public void c(z33 z33Var) {
        g43.w(this, z33Var);
    }

    @Override // defpackage.z33
    public boolean i() {
        return g43.o(get());
    }

    @Override // defpackage.wa6
    public void onError(Throwable th) {
        lazySet(g43.DISPOSED);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            rl3.b(th2);
            tp9.q(new CompositeException(th, th2));
        }
    }

    @Override // defpackage.wa6
    public void onSuccess(T t) {
        lazySet(g43.DISPOSED);
        try {
            this.a.accept(t);
        } catch (Throwable th) {
            rl3.b(th);
            tp9.q(th);
        }
    }
}
