package defpackage;
/* compiled from: ObservableJust.java */
/* renamed from: x57  reason: default package */
/* loaded from: classes3.dex */
public final class x57<T> extends r57<T> implements cv9<T> {
    private final T a;

    public x57(T t) {
        this.a = t;
    }

    @Override // defpackage.cv9, java.util.concurrent.Callable
    public T call() {
        return this.a;
    }

    @Override // defpackage.r57
    protected void r(h67<? super T> h67Var) {
        b67 b67Var = new b67(h67Var, this.a);
        h67Var.c(b67Var);
        b67Var.run();
    }
}
