package defpackage;
/* compiled from: EmptyDisposable.java */
/* renamed from: ig3  reason: default package */
/* loaded from: classes3.dex */
public enum ig3 implements yu8<Object> {
    INSTANCE,
    NEVER;

    public static void o(h67<?> h67Var) {
        h67Var.c(INSTANCE);
        h67Var.b();
    }

    @Override // defpackage.z33
    public boolean i() {
        if (this == INSTANCE) {
            return true;
        }
        return false;
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
    public Object poll() throws Exception {
        return null;
    }

    @Override // defpackage.z33
    public void a() {
    }

    @Override // defpackage.rla
    public void clear() {
    }
}
