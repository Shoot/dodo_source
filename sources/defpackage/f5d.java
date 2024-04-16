package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* renamed from: f5d  reason: default package */
/* loaded from: classes2.dex */
public final class f5d extends ThreadPoolExecutor {
    final /* synthetic */ bad a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5d(bad badVar) {
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.a = badVar;
        setThreadFactory(new y7d(null));
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new k4d(this, runnable, t);
    }
}
