package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.o;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
final class a {
    private final boolean a;
    private final Executor b;
    final Map<se5, c> c;
    private final ReferenceQueue<o<?>> d;
    private o.a e;
    private volatile boolean f;

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class ThreadFactoryC0101a implements ThreadFactory {

        /* compiled from: ActiveResources.java */
        /* renamed from: com.bumptech.glide.load.engine.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0102a implements Runnable {
            final /* synthetic */ Runnable a;

            RunnableC0102a(Runnable runnable) {
                this.a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.a.run();
            }
        }

        ThreadFactoryC0101a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new RunnableC0102a(runnable), "glide-active-resources");
        }
    }

    /* compiled from: ActiveResources.java */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActiveResources.java */
    /* loaded from: classes.dex */
    public static final class c extends WeakReference<o<?>> {
        final se5 a;
        final boolean b;
        nj9<?> c;

        c(@NonNull se5 se5Var, @NonNull o<?> oVar, @NonNull ReferenceQueue<? super o<?>> referenceQueue, boolean z) {
            super(oVar, referenceQueue);
            nj9<?> nj9Var;
            this.a = (se5) eh8.d(se5Var);
            if (oVar.f() && z) {
                nj9Var = (nj9) eh8.d(oVar.e());
            } else {
                nj9Var = null;
            }
            this.c = nj9Var;
            this.b = oVar.f();
        }

        void a() {
            this.c = null;
            clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactoryC0101a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(se5 se5Var, o<?> oVar) {
        c put = this.c.put(se5Var, new c(se5Var, oVar, this.d, this.a));
        if (put != null) {
            put.a();
        }
    }

    void b() {
        while (!this.f) {
            try {
                c((c) this.d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(@NonNull c cVar) {
        nj9<?> nj9Var;
        synchronized (this) {
            this.c.remove(cVar.a);
            if (cVar.b && (nj9Var = cVar.c) != null) {
                this.e.a(cVar.a, new o<>(nj9Var, true, false, cVar.a, this.e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void d(se5 se5Var) {
        c remove = this.c.remove(se5Var);
        if (remove != null) {
            remove.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized o<?> e(se5 se5Var) {
        c cVar = this.c.get(se5Var);
        if (cVar == null) {
            return null;
        }
        o<?> oVar = cVar.get();
        if (oVar == null) {
            c(cVar);
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(o.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.e = aVar;
            }
        }
    }

    a(boolean z, Executor executor) {
        this.c = new HashMap();
        this.d = new ReferenceQueue<>();
        this.a = z;
        this.b = executor;
        executor.execute(new b());
    }
}
