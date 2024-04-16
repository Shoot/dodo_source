package defpackage;
/* compiled from: EmptySubscription.java */
/* renamed from: vg3  reason: default package */
/* loaded from: classes3.dex */
public enum vg3 implements dv8<Object> {
    INSTANCE;

    public static void a(i1b<?> i1bVar) {
        i1bVar.c(INSTANCE);
        i1bVar.b();
    }

    public static void i(Throwable th, i1b<?> i1bVar) {
        i1bVar.c(INSTANCE);
        i1bVar.onError(th);
    }

    @Override // defpackage.rla
    public boolean isEmpty() {
        return true;
    }

    @Override // defpackage.bv8
    public int k(int i) {
        return i & 2;
    }

    @Override // defpackage.rla
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.rla
    public Object poll() {
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    @Override // defpackage.k1b
    public void w(long j) {
        n1b.u(j);
    }

    @Override // defpackage.k1b
    public void cancel() {
    }

    @Override // defpackage.rla
    public void clear() {
    }
}
