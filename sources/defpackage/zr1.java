package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ConsumerSingleObserver.java */
/* renamed from: zr1  reason: default package */
/* loaded from: classes3.dex */
public final class zr1<T> extends AtomicReference<z33> implements kma<T>, z33 {
    final wr1<? super T> a;
    final wr1<? super Throwable> b;

    public zr1(wr1<? super T> wr1Var, wr1<? super Throwable> wr1Var2) {
        this.a = wr1Var;
        this.b = wr1Var2;
    }

    @Override // defpackage.z33
    public void a() {
        g43.k(this);
    }

    @Override // defpackage.kma
    public void c(z33 z33Var) {
        g43.w(this, z33Var);
    }

    @Override // defpackage.z33
    public boolean i() {
        if (get() == g43.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // defpackage.kma
    public void onError(Throwable th) {
        lazySet(g43.DISPOSED);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            rl3.b(th2);
            tp9.q(new CompositeException(th, th2));
        }
    }

    @Override // defpackage.kma
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
