package defpackage;

import android.os.Process;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: dmc  reason: default package */
/* loaded from: classes2.dex */
final class dmc extends Thread {
    /* JADX INFO: Access modifiers changed from: package-private */
    public dmc(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
