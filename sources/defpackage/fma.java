package defpackage;
/* compiled from: SingleDoOnSuccess.java */
/* renamed from: fma  reason: default package */
/* loaded from: classes3.dex */
public final class fma<T> extends bma<T> {
    final tma<T> a;
    final wr1<? super T> b;

    /* compiled from: SingleDoOnSuccess.java */
    /* renamed from: fma$a */
    /* loaded from: classes3.dex */
    final class a implements kma<T> {
        final kma<? super T> a;

        a(kma<? super T> kmaVar) {
            this.a = kmaVar;
        }

        @Override // defpackage.kma
        public void c(z33 z33Var) {
            this.a.c(z33Var);
        }

        @Override // defpackage.kma
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // defpackage.kma
        public void onSuccess(T t) {
            try {
                fma.this.b.accept(t);
                this.a.onSuccess(t);
            } catch (Throwable th) {
                rl3.b(th);
                this.a.onError(th);
            }
        }
    }

    public fma(tma<T> tmaVar, wr1<? super T> wr1Var) {
        this.a = tmaVar;
        this.b = wr1Var;
    }

    @Override // defpackage.bma
    protected void j(kma<? super T> kmaVar) {
        this.a.a(new a(kmaVar));
    }
}
