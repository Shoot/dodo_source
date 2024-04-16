package com.huawei.hms.hatool;

import ch.qos.logback.classic.Level;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes3.dex */
public class o0 {
    public static o0 b;
    public static o0 c;
    public static o0 d;
    public ThreadPoolExecutor a = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue((int) Level.TRACE_INT), new b());

    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        public Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.a;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    y.e("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements ThreadFactory {
        public static final AtomicInteger d = new AtomicInteger(1);
        public final ThreadGroup a;
        public final AtomicInteger b = new AtomicInteger(1);
        public final String c;

        public b() {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.a = threadGroup;
            this.c = "FormalHASDK-base-" + d.getAndIncrement();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.a;
            return new Thread(threadGroup, runnable, this.c + this.b.getAndIncrement(), 0L);
        }
    }

    static {
        new o0();
        new o0();
        b = new o0();
        c = new o0();
        d = new o0();
    }

    public static o0 a() {
        return d;
    }

    public static o0 b() {
        return c;
    }

    public static o0 c() {
        return b;
    }

    public void a(n0 n0Var) {
        try {
            this.a.execute(new a(n0Var));
        } catch (RejectedExecutionException unused) {
            y.e("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
