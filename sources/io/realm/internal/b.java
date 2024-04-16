package io.realm.internal;

import io.realm.log.RealmLog;
import java.lang.ref.ReferenceQueue;
/* compiled from: FinalizerRunnable.java */
/* loaded from: classes3.dex */
class b implements Runnable {
    private final ReferenceQueue<ku6> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ReferenceQueue<ku6> referenceQueue) {
        this.a = referenceQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                ((NativeObjectReference) this.a.remove()).e();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                RealmLog.c("The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore", new Object[0]);
                return;
            }
        }
    }
}
