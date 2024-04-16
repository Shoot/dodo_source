package defpackage;

import java.util.concurrent.Callable;
/* compiled from: ScheduledDirectTask.java */
/* renamed from: uv9  reason: default package */
/* loaded from: classes3.dex */
public final class uv9 extends f1 implements Callable<Void> {
    public uv9(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: c */
    public Void call() throws Exception {
        this.b = Thread.currentThread();
        try {
            this.a.run();
            return null;
        } finally {
            lazySet(f1.c);
            this.b = null;
        }
    }
}
