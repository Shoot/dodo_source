package defpackage;

import java.util.concurrent.Callable;
/* compiled from: SingleFromCallable.java */
/* renamed from: hma  reason: default package */
/* loaded from: classes3.dex */
public final class hma<T> extends bma<T> {
    final Callable<? extends T> a;

    public hma(Callable<? extends T> callable) {
        this.a = callable;
    }

    @Override // defpackage.bma
    protected void j(kma<? super T> kmaVar) {
        z33 b = j43.b();
        kmaVar.c(b);
        if (b.i()) {
            return;
        }
        try {
            Object obj = (Object) x47.e(this.a.call(), "The callable returned a null value");
            if (!b.i()) {
                kmaVar.onSuccess(obj);
            }
        } catch (Throwable th) {
            rl3.b(th);
            if (!b.i()) {
                kmaVar.onError(th);
            } else {
                tp9.q(th);
            }
        }
    }
}
