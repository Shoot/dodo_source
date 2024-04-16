package defpackage;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: CrashlyticsBackgroundWorker.java */
/* renamed from: w02  reason: default package */
/* loaded from: classes2.dex */
public class w02 {
    private final Executor a;
    private y6b<Void> b = o7b.e(null);
    private final Object c = new Object();
    private final ThreadLocal<Boolean> d = new ThreadLocal<>();

    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* renamed from: w02$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w02.this.d.set(Boolean.TRUE);
        }
    }

    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* renamed from: w02$b */
    /* loaded from: classes2.dex */
    class b implements Callable<Void> {
        final /* synthetic */ Runnable a;

        b(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            this.a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* renamed from: w02$c */
    /* loaded from: classes2.dex */
    public class c<T> implements dv1<Void, T> {
        final /* synthetic */ Callable a;

        c(Callable callable) {
            this.a = callable;
        }

        @Override // defpackage.dv1
        public T a(@NonNull y6b<Void> y6bVar) throws Exception {
            return (T) this.a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* renamed from: w02$d */
    /* loaded from: classes2.dex */
    public class d<T> implements dv1<T, Void> {
        d() {
        }

        @Override // defpackage.dv1
        /* renamed from: b */
        public Void a(@NonNull y6b<T> y6bVar) throws Exception {
            return null;
        }
    }

    public w02(Executor executor) {
        this.a = executor;
        executor.execute(new a());
    }

    private <T> y6b<Void> d(y6b<T> y6bVar) {
        return y6bVar.j(this.a, new d());
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.d.get());
    }

    private <T> dv1<Void, T> f(Callable<T> callable) {
        return new c(callable);
    }

    public void b() {
        if (e()) {
            return;
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public Executor c() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y6b<Void> g(Runnable runnable) {
        return h(new b(runnable));
    }

    public <T> y6b<T> h(Callable<T> callable) {
        y6b<T> j;
        synchronized (this.c) {
            j = this.b.j(this.a, f(callable));
            this.b = d(j);
        }
        return j;
    }

    public <T> y6b<T> i(Callable<y6b<T>> callable) {
        y6b<T> k;
        synchronized (this.c) {
            k = this.b.k(this.a, f(callable));
            this.b = d(k);
        }
        return k;
    }
}
