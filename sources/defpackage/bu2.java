package defpackage;
/* compiled from: DelegateFactory.java */
/* renamed from: bu2  reason: default package */
/* loaded from: classes3.dex */
public final class bu2<T> implements no3<T> {
    private as8<T> a;

    public static <T> void a(as8<T> as8Var, as8<T> as8Var2) {
        jh8.b(as8Var2);
        bu2 bu2Var = (bu2) as8Var;
        if (bu2Var.a == null) {
            bu2Var.a = as8Var2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.as8
    public T get() {
        as8<T> as8Var = this.a;
        if (as8Var != null) {
            return as8Var.get();
        }
        throw new IllegalStateException();
    }
}
