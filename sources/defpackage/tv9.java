package defpackage;
/* compiled from: ScheduledDirectPeriodicTask.java */
/* renamed from: tv9  reason: default package */
/* loaded from: classes3.dex */
public final class tv9 extends f1 implements Runnable {
    public tv9(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b = Thread.currentThread();
        try {
            this.a.run();
            this.b = null;
        } catch (Throwable th) {
            this.b = null;
            lazySet(f1.c);
            tp9.q(th);
        }
    }
}
