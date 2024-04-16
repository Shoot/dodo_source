package defpackage;

import android.os.Handler;
import android.os.Process;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: RequestExecutor.java */
/* renamed from: qi9  reason: default package */
/* loaded from: classes.dex */
class qi9 {

    /* compiled from: RequestExecutor.java */
    /* renamed from: qi9$a */
    /* loaded from: classes.dex */
    private static class a implements ThreadFactory {
        private String a;
        private int b;

        /* compiled from: RequestExecutor.java */
        /* renamed from: qi9$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0487a extends Thread {
            private final int a;

            C0487a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.a = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.a);
                super.run();
            }
        }

        a(@NonNull String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0487a(runnable, this.a, this.b);
        }
    }

    /* compiled from: RequestExecutor.java */
    /* renamed from: qi9$b */
    /* loaded from: classes.dex */
    private static class b<T> implements Runnable {
        @NonNull
        private Callable<T> a;
        @NonNull
        private xr1<T> b;
        @NonNull
        private Handler c;

        /* compiled from: RequestExecutor.java */
        /* renamed from: qi9$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            final /* synthetic */ xr1 a;
            final /* synthetic */ Object b;

            a(xr1 xr1Var, Object obj) {
                this.a = xr1Var;
                this.b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.a.accept(this.b);
            }
        }

        b(@NonNull Handler handler, @NonNull Callable<T> callable, @NonNull xr1<T> xr1Var) {
            this.a = callable;
            this.b = xr1Var;
            this.c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            try {
                t = this.a.call();
            } catch (Exception unused) {
                t = null;
            }
            this.c.post(new a(this.b, t));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ThreadPoolExecutor a(@NonNull String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void b(@NonNull Executor executor, @NonNull Callable<T> callable, @NonNull xr1<T> xr1Var) {
        executor.execute(new b(pm0.a(), callable, xr1Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T c(@NonNull ExecutorService executorService, @NonNull Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
