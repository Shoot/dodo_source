package defpackage;

import defpackage.tmb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SchedulerPoolFactory.java */
/* renamed from: bw9  reason: default package */
/* loaded from: classes3.dex */
public final class bw9 {
    public static final boolean a;
    public static final int b;
    static final AtomicReference<ScheduledExecutorService> c = new AtomicReference<>();
    static final Map<ScheduledThreadPoolExecutor, Object> d = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SchedulerPoolFactory.java */
    /* renamed from: bw9$a */
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(bw9.d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    bw9.d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* compiled from: SchedulerPoolFactory.java */
    /* renamed from: bw9$b */
    /* loaded from: classes3.dex */
    static final class b implements z84<String, String> {
        b() {
        }

        @Override // defpackage.z84
        /* renamed from: a */
        public String apply(String str) throws Exception {
            return System.getProperty(str);
        }
    }

    static {
        b bVar = new b();
        boolean b2 = b(true, "rx2.purge-enabled", true, true, bVar);
        a = b2;
        b = c(b2, "rx2.purge-period-seconds", 1, 1, bVar);
        d();
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        e(a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    static boolean b(boolean z, String str, boolean z2, boolean z3, z84<String, String> z84Var) {
        if (z) {
            try {
                String apply = z84Var.apply(str);
                if (apply == null) {
                    return z2;
                }
                return tmb.h.TRUE_JSON_NAME.equals(apply);
            } catch (Throwable unused) {
                return z2;
            }
        }
        return z3;
    }

    static int c(boolean z, String str, int i, int i2, z84<String, String> z84Var) {
        if (z) {
            try {
                String apply = z84Var.apply(str);
                if (apply == null) {
                    return i;
                }
                return Integer.parseInt(apply);
            } catch (Throwable unused) {
                return i;
            }
        }
        return i2;
    }

    public static void d() {
        f(a);
    }

    static void e(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    static void f(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = c;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new vp9("RxSchedulerPurge"));
            if (ho1.a(atomicReference, scheduledExecutorService, newScheduledThreadPool)) {
                a aVar = new a();
                int i = b;
                newScheduledThreadPool.scheduleAtFixedRate(aVar, i, i, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }
}
