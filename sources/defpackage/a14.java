package defpackage;
/* compiled from: FlowableInternalHelper.java */
/* renamed from: a14  reason: default package */
/* loaded from: classes3.dex */
public final class a14 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableInternalHelper.java */
    /* renamed from: a14$a */
    /* loaded from: classes3.dex */
    public static final class a<T, U> implements z84<T, ls8<T>> {
        final z84<? super T, ? extends ls8<U>> a;

        a(z84<? super T, ? extends ls8<U>> z84Var) {
            this.a = z84Var;
        }

        @Override // defpackage.z84
        /* renamed from: a */
        public ls8<T> apply(T t) throws Exception {
            return new p14((ls8) x47.e(this.a.apply(t), "The itemDelay returned a null Publisher"), 1L).G(n94.c(t)).l(t);
        }
    }

    /* compiled from: FlowableInternalHelper.java */
    /* renamed from: a14$b */
    /* loaded from: classes3.dex */
    public enum b implements wr1<k1b> {
        INSTANCE;

        @Override // defpackage.wr1
        /* renamed from: a */
        public void accept(k1b k1bVar) throws Exception {
            k1bVar.w(Long.MAX_VALUE);
        }
    }

    public static <T, U> z84<T, ls8<T>> a(z84<? super T, ? extends ls8<U>> z84Var) {
        return new a(z84Var);
    }
}
