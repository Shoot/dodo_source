package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* renamed from: qvc  reason: default package */
/* loaded from: classes2.dex */
public final class qvc implements ThreadFactory {
    private ThreadFactory a = Executors.defaultThreadFactory();

    /* JADX INFO: Access modifiers changed from: package-private */
    public qvc(jvc jvcVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
