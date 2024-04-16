package defpackage;

import io.reactivex.exceptions.CompositeException;
/* compiled from: SingleDoOnError.java */
/* renamed from: ema  reason: default package */
/* loaded from: classes3.dex */
public final class ema<T> extends bma<T> {
    final tma<T> a;
    final wr1<? super Throwable> b;

    /* compiled from: SingleDoOnError.java */
    /* renamed from: ema$a */
    /* loaded from: classes3.dex */
    final class a implements kma<T> {
        private final kma<? super T> a;

        a(kma<? super T> kmaVar) {
            this.a = kmaVar;
        }

        @Override // defpackage.kma
        public void c(z33 z33Var) {
            this.a.c(z33Var);
        }

        @Override // defpackage.kma
        public void onError(Throwable th) {
            try {
                ema.this.b.accept(th);
            } catch (Throwable th2) {
                rl3.b(th2);
                th = new CompositeException(th, th2);
            }
            this.a.onError(th);
        }

        @Override // defpackage.kma
        public void onSuccess(T t) {
            this.a.onSuccess(t);
        }
    }

    public ema(tma<T> tmaVar, wr1<? super Throwable> wr1Var) {
        this.a = tmaVar;
        this.b = wr1Var;
    }

    @Override // defpackage.bma
    protected void j(kma<? super T> kmaVar) {
        this.a.a(new a(kmaVar));
    }
}
