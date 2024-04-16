package defpackage;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ModernAsyncTask.java */
/* renamed from: qm6  reason: default package */
/* loaded from: classes.dex */
abstract class qm6<Params, Progress, Result> {
    private static final ThreadFactory f;
    private static final BlockingQueue<Runnable> g;
    public static final Executor h;
    private static f i;
    private static volatile Executor j;
    private final h<Params, Result> a;
    private final FutureTask<Result> b;
    private volatile g c = g.PENDING;
    final AtomicBoolean d = new AtomicBoolean();
    final AtomicBoolean e = new AtomicBoolean();

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: qm6$a */
    /* loaded from: classes.dex */
    static class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.a.getAndIncrement());
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: qm6$b */
    /* loaded from: classes.dex */
    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            qm6.this.e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) qm6.this.b(this.a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: qm6$c */
    /* loaded from: classes.dex */
    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                qm6.this.m(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                qm6.this.m(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: qm6$d */
    /* loaded from: classes.dex */
    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.values().length];
            a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModernAsyncTask.java */
    /* renamed from: qm6$e */
    /* loaded from: classes.dex */
    public static class e<Data> {
        final qm6 a;
        final Data[] b;

        e(qm6 qm6Var, Data... dataArr) {
            this.a = qm6Var;
            this.b = dataArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModernAsyncTask.java */
    /* renamed from: qm6$f */
    /* loaded from: classes.dex */
    public static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    eVar.a.k(eVar.b);
                    return;
                }
                return;
            }
            eVar.a.d(eVar.b[0]);
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: qm6$g */
    /* loaded from: classes.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: qm6$h */
    /* loaded from: classes.dex */
    private static abstract class h<Params, Result> implements Callable<Result> {
        Params[] a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        h = threadPoolExecutor;
        j = threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public qm6() {
        b bVar = new b();
        this.a = bVar;
        this.b = new c(bVar);
    }

    private static Handler e() {
        f fVar;
        synchronized (qm6.class) {
            try {
                if (i == null) {
                    i = new f();
                }
                fVar = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public final boolean a(boolean z) {
        this.d.set(true);
        return this.b.cancel(z);
    }

    protected abstract Result b(Params... paramsArr);

    public final qm6<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
        if (this.c != g.PENDING) {
            int i2 = d.a[this.c.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.c = g.RUNNING;
        j();
        this.a.a = paramsArr;
        executor.execute(this.b);
        return this;
    }

    void d(Result result) {
        if (f()) {
            h(result);
        } else {
            i(result);
        }
        this.c = g.FINISHED;
    }

    public final boolean f() {
        return this.d.get();
    }

    protected void h(Result result) {
        g();
    }

    Result l(Result result) {
        e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    void m(Result result) {
        if (!this.e.get()) {
            l(result);
        }
    }

    protected void g() {
    }

    protected void j() {
    }

    protected void i(Result result) {
    }

    protected void k(Progress... progressArr) {
    }
}
