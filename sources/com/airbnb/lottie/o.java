package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.o;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
/* compiled from: LottieTask.java */
/* loaded from: classes.dex */
public class o<T> {
    public static Executor e = Executors.newCachedThreadPool();
    private final Set<sz5<T>> a;
    private final Set<sz5<Throwable>> b;
    private final Handler c;
    private volatile yz5<T> d;

    /* compiled from: LottieTask.java */
    /* loaded from: classes.dex */
    private class a extends FutureTask<yz5<T>> {
        a(Callable<yz5<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (!isCancelled()) {
                try {
                    o.this.k(get());
                } catch (InterruptedException | ExecutionException e) {
                    o.this.k(new yz5(e));
                }
            }
        }
    }

    public o(Callable<yz5<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        yz5<T> yz5Var = this.d;
        if (yz5Var == null) {
            return;
        }
        if (yz5Var.b() != null) {
            h(yz5Var.b());
        } else {
            f(yz5Var.a());
        }
    }

    private synchronized void f(Throwable th) {
        ArrayList<sz5> arrayList = new ArrayList(this.b);
        if (arrayList.isEmpty()) {
            ox5.d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (sz5 sz5Var : arrayList) {
            sz5Var.onResult(th);
        }
    }

    private void g() {
        this.c.post(new Runnable() { // from class: zz5
            @Override // java.lang.Runnable
            public final void run() {
                o.this.e();
            }
        });
    }

    private synchronized void h(T t) {
        for (sz5 sz5Var : new ArrayList(this.a)) {
            sz5Var.onResult(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(yz5<T> yz5Var) {
        if (this.d == null) {
            this.d = yz5Var;
            g();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized o<T> c(sz5<Throwable> sz5Var) {
        try {
            yz5<T> yz5Var = this.d;
            if (yz5Var != null && yz5Var.a() != null) {
                sz5Var.onResult(yz5Var.a());
            }
            this.b.add(sz5Var);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized o<T> d(sz5<T> sz5Var) {
        try {
            yz5<T> yz5Var = this.d;
            if (yz5Var != null && yz5Var.b() != null) {
                sz5Var.onResult(yz5Var.b());
            }
            this.a.add(sz5Var);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized o<T> i(sz5<Throwable> sz5Var) {
        this.b.remove(sz5Var);
        return this;
    }

    public synchronized o<T> j(sz5<T> sz5Var) {
        this.a.remove(sz5Var);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Callable<yz5<T>> callable, boolean z) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (z) {
            try {
                k(callable.call());
                return;
            } catch (Throwable th) {
                k(new yz5<>(th));
                return;
            }
        }
        e.execute(new a(callable));
    }
}
