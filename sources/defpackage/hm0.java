package defpackage;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: CallbackCompletableObserver.java */
/* renamed from: hm0  reason: default package */
/* loaded from: classes3.dex */
public final class hm0 extends AtomicReference<z33> implements dl1, z33, wr1<Throwable> {
    final wr1<? super Throwable> a;
    final t4 b;

    public hm0(wr1<? super Throwable> wr1Var, t4 t4Var) {
        this.a = wr1Var;
        this.b = t4Var;
    }

    @Override // defpackage.z33
    public void a() {
        g43.k(this);
    }

    @Override // defpackage.dl1
    public void b() {
        try {
            this.b.run();
        } catch (Throwable th) {
            rl3.b(th);
            tp9.q(th);
        }
        lazySet(g43.DISPOSED);
    }

    @Override // defpackage.dl1
    public void c(z33 z33Var) {
        g43.w(this, z33Var);
    }

    @Override // defpackage.wr1
    /* renamed from: d */
    public void accept(Throwable th) {
        tp9.q(new OnErrorNotImplementedException(th));
    }

    @Override // defpackage.z33
    public boolean i() {
        if (get() == g43.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dl1
    public void onError(Throwable th) {
        try {
            this.a.accept(th);
        } catch (Throwable th2) {
            rl3.b(th2);
            tp9.q(th2);
        }
        lazySet(g43.DISPOSED);
    }
}
