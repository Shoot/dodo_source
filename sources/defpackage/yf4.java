package defpackage;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.dodopizza.kustoworker.KustoStorage;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: GlideExecutor.java */
/* renamed from: yf4  reason: default package */
/* loaded from: classes.dex */
public final class yf4 implements ExecutorService {
    private static final long b = TimeUnit.SECONDS.toMillis(10);
    private static volatile int c;
    private final ExecutorService a;

    /* compiled from: GlideExecutor.java */
    /* renamed from: yf4$b */
    /* loaded from: classes.dex */
    public static final class b {
        private final boolean a;
        private int b;
        private int c;
        @NonNull
        private ThreadFactory d = new c();
        @NonNull
        private e e = e.d;
        private String f;
        private long g;

        b(boolean z) {
            this.a = z;
        }

        public yf4 a() {
            if (!TextUtils.isEmpty(this.f)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.b, this.c, this.g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.d, this.f, this.e, this.a));
                if (this.g != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new yf4(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f);
        }

        public b b(String str) {
            this.f = str;
            return this;
        }

        public b c(int i) {
            this.b = i;
            this.c = i;
            return this;
        }
    }

    /* compiled from: GlideExecutor.java */
    /* renamed from: yf4$c */
    /* loaded from: classes.dex */
    private static final class c implements ThreadFactory {

        /* compiled from: GlideExecutor.java */
        /* renamed from: yf4$c$a */
        /* loaded from: classes.dex */
        class a extends Thread {
            a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new a(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GlideExecutor.java */
    /* renamed from: yf4$d */
    /* loaded from: classes.dex */
    public static final class d implements ThreadFactory {
        private final ThreadFactory a;
        private final String b;
        final e c;
        final boolean d;
        private final AtomicInteger e = new AtomicInteger();

        /* compiled from: GlideExecutor.java */
        /* renamed from: yf4$d$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            final /* synthetic */ Runnable a;

            a(Runnable runnable) {
                this.a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.a.run();
                } catch (Throwable th) {
                    d.this.c.a(th);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z) {
            this.a = threadFactory;
            this.b = str;
            this.c = eVar;
            this.d = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread newThread = this.a.newThread(new a(runnable));
            newThread.setName("glide-" + this.b + "-thread-" + this.e.getAndIncrement());
            return newThread;
        }
    }

    yf4(ExecutorService executorService) {
        this.a = executorService;
    }

    static int a() {
        if (b() >= 4) {
            return 2;
        }
        return 1;
    }

    public static int b() {
        if (c == 0) {
            c = Math.min(4, rp9.a());
        }
        return c;
    }

    public static b c() {
        return new b(true).c(a()).b("animation");
    }

    public static yf4 d() {
        return c().a();
    }

    public static b e() {
        return new b(true).c(1).b("disk-cache");
    }

    public static yf4 f() {
        return e().a();
    }

    public static b g() {
        return new b(false).c(b()).b(KustoStorage.KustoTable.COLUMN_SOURCE);
    }

    public static yf4 h() {
        return g().a();
    }

    public static yf4 j() {
        return new yf4(new ThreadPoolExecutor(0, Integer.MAX_VALUE, b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.a.submit(runnable);
    }

    public String toString() {
        return this.a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.a.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.a.submit(callable);
    }

    /* compiled from: GlideExecutor.java */
    /* renamed from: yf4$e */
    /* loaded from: classes.dex */
    public interface e {
        public static final e a = new a();
        public static final e b;
        public static final e c;
        public static final e d;

        /* compiled from: GlideExecutor.java */
        /* renamed from: yf4$e$b */
        /* loaded from: classes.dex */
        class b implements e {
            b() {
            }

            @Override // defpackage.yf4.e
            public void a(Throwable th) {
                if (th != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        /* compiled from: GlideExecutor.java */
        /* renamed from: yf4$e$c */
        /* loaded from: classes.dex */
        class c implements e {
            c() {
            }

            @Override // defpackage.yf4.e
            public void a(Throwable th) {
                if (th == null) {
                    return;
                }
                throw new RuntimeException("Request threw uncaught throwable", th);
            }
        }

        static {
            b bVar = new b();
            b = bVar;
            c = new c();
            d = bVar;
        }

        void a(Throwable th);

        /* compiled from: GlideExecutor.java */
        /* renamed from: yf4$e$a */
        /* loaded from: classes.dex */
        class a implements e {
            a() {
            }

            @Override // defpackage.yf4.e
            public void a(Throwable th) {
            }
        }
    }
}
