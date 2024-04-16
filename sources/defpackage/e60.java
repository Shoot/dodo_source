package defpackage;

import android.os.Process;
/* compiled from: BackgroundPriorityRunnable.java */
/* renamed from: e60  reason: default package */
/* loaded from: classes2.dex */
public abstract class e60 implements Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
