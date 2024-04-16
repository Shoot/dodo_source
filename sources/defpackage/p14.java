package defpackage;
/* compiled from: FlowableTakePublisher.java */
/* renamed from: p14  reason: default package */
/* loaded from: classes3.dex */
public final class p14<T> extends l04<T> {
    final ls8<T> c;
    final long d;

    public p14(ls8<T> ls8Var, long j) {
        this.c = ls8Var;
        this.d = j;
    }

    @Override // defpackage.l04
    protected void S(i1b<? super T> i1bVar) {
        this.c.a(new o14(i1bVar, this.d));
    }
}
