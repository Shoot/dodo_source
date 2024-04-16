package defpackage;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* compiled from: WorkTimer.java */
/* renamed from: x7c  reason: default package */
/* loaded from: classes.dex */
public class x7c {
    private static final String f = nx5.f("WorkTimer");
    private final ThreadFactory a;
    private final ScheduledExecutorService b;
    final Map<String, c> c;
    final Map<String, b> d;
    final Object e;

    /* compiled from: WorkTimer.java */
    /* renamed from: x7c$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {
        private int a = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.a);
            this.a = this.a + 1;
            return newThread;
        }
    }

    /* compiled from: WorkTimer.java */
    /* renamed from: x7c$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(@NonNull String str);
    }

    /* compiled from: WorkTimer.java */
    /* renamed from: x7c$c */
    /* loaded from: classes.dex */
    public static class c implements Runnable {
        private final x7c a;
        private final String b;

        c(@NonNull x7c x7cVar, @NonNull String str) {
            this.a = x7cVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.a.e) {
                try {
                    if (this.a.c.remove(this.b) != null) {
                        b remove = this.a.d.remove(this.b);
                        if (remove != null) {
                            remove.a(this.b);
                        }
                    } else {
                        nx5.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.b), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public x7c() {
        a aVar = new a();
        this.a = aVar;
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new Object();
        this.b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (!this.b.isShutdown()) {
            this.b.shutdownNow();
        }
    }

    public void b(@NonNull String str, long j, @NonNull b bVar) {
        synchronized (this.e) {
            nx5.c().a(f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.c.put(str, cVar);
            this.d.put(str, bVar);
            this.b.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    public void c(@NonNull String str) {
        synchronized (this.e) {
            try {
                if (this.c.remove(str) != null) {
                    nx5.c().a(f, String.format("Stopping timer for %s", str), new Throwable[0]);
                    this.d.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
