package defpackage;

import android.os.Process;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: cmc  reason: default package */
/* loaded from: classes2.dex */
final class cmc implements Runnable {
    private final Runnable a;

    public cmc(Runnable runnable, int i) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.a.run();
    }
}
