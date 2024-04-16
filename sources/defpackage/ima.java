package defpackage;
/* compiled from: SingleMap.java */
/* renamed from: ima  reason: default package */
/* loaded from: classes3.dex */
public final class ima<T, R> extends bma<R> {
    final tma<? extends T> a;
    final z84<? super T, ? extends R> b;

    /* compiled from: SingleMap.java */
    /* renamed from: ima$a */
    /* loaded from: classes3.dex */
    static final class a<T, R> implements kma<T> {
        final kma<? super R> a;
        final z84<? super T, ? extends R> b;

        a(kma<? super R> kmaVar, z84<? super T, ? extends R> z84Var) {
            this.a = kmaVar;
            this.b = z84Var;
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
                this.a.onSuccess(x47.e(this.b.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                rl3.b(th);
                onError(th);
            }
        }
    }

    public ima(tma<? extends T> tmaVar, z84<? super T, ? extends R> z84Var) {
        this.a = tmaVar;
        this.b = z84Var;
    }

    @Override // defpackage.bma
    protected void j(kma<? super R> kmaVar) {
        this.a.a(new a(kmaVar, this.b));
    }
}
