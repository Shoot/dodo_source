package defpackage;
/* compiled from: RunnableDisposable.java */
/* renamed from: pp9  reason: default package */
/* loaded from: classes3.dex */
final class pp9 extends fa9<Runnable> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public pp9(Runnable runnable) {
        super(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fa9
    /* renamed from: c */
    public void b(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + i() + ", " + get() + ")";
    }
}
