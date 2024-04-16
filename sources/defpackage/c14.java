package defpackage;
/* compiled from: FlowableJust.java */
/* renamed from: c14  reason: default package */
/* loaded from: classes3.dex */
public final class c14<T> extends l04<T> implements cv9<T> {
    private final T c;

    public c14(T t) {
        this.c = t;
    }

    @Override // defpackage.l04
    protected void S(i1b<? super T> i1bVar) {
        i1bVar.c(new ev9(i1bVar, this.c));
    }

    @Override // defpackage.cv9, java.util.concurrent.Callable
    public T call() {
        return this.c;
    }
}
