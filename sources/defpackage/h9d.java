package defpackage;

import android.os.Process;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* renamed from: h9d  reason: default package */
/* loaded from: classes2.dex */
final class h9d extends Thread {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h9d(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
