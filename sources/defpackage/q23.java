package defpackage;

import java.util.concurrent.Executor;
/* compiled from: DirectExecutor.java */
/* renamed from: q23  reason: default package */
/* loaded from: classes.dex */
enum q23 implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
