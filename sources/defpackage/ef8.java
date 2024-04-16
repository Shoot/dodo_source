package defpackage;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PoolableExecutors.java */
/* renamed from: ef8  reason: default package */
/* loaded from: classes2.dex */
public class ef8 {
    private static final gm3 a;
    private static volatile gm3 b;

    /* compiled from: PoolableExecutors.java */
    /* renamed from: ef8$b */
    /* loaded from: classes2.dex */
    private static class b implements gm3 {
        private b() {
        }

        @Override // defpackage.gm3
        @NonNull
        public ExecutorService a(ThreadFactory threadFactory, ceb cebVar) {
            return b(1, threadFactory, cebVar);
        }

        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService b(int i, ThreadFactory threadFactory, ceb cebVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        b bVar = new b();
        a = bVar;
        b = bVar;
    }

    public static gm3 a() {
        return b;
    }
}
