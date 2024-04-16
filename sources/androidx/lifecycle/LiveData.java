package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.d;
/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object k = new Object();
    final Object a = new Object();
    private vs9<i67<? super T>, LiveData<T>.c> b = new vs9<>();
    int c = 0;
    private boolean d;
    private volatile Object e;
    volatile Object f;
    private int g;
    private boolean h;
    private boolean i;
    private final Runnable j;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.c implements g {
        @NonNull
        final op5 e;

        LifecycleBoundObserver(@NonNull op5 op5Var, i67<? super T> i67Var) {
            super(i67Var);
            this.e = op5Var;
        }

        @Override // androidx.lifecycle.LiveData.c
        void b() {
            this.e.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean c(op5 op5Var) {
            if (this.e == op5Var) {
                return true;
            }
            return false;
        }

        @Override // androidx.lifecycle.g
        public void d(@NonNull op5 op5Var, @NonNull d.a aVar) {
            d.b b = this.e.getLifecycle().b();
            if (b == d.b.DESTROYED) {
                LiveData.this.m(this.a);
                return;
            }
            d.b bVar = null;
            while (bVar != b) {
                a(e());
                bVar = b;
                b = this.e.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean e() {
            return this.e.getLifecycle().b().i(d.b.STARTED);
        }
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.f;
                LiveData.this.f = LiveData.k;
            }
            LiveData.this.n(obj);
        }
    }

    /* loaded from: classes.dex */
    private class b extends LiveData<T>.c {
        b(i67<? super T> i67Var) {
            super(i67Var);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean e() {
            return true;
        }
    }

    public LiveData() {
        Object obj = k;
        this.f = obj;
        this.j = new a();
        this.e = obj;
        this.g = -1;
    }

    static void b(String str) {
        if (uq.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(LiveData<T>.c cVar) {
        if (!cVar.b) {
            return;
        }
        if (!cVar.e()) {
            cVar.a(false);
            return;
        }
        int i = cVar.c;
        int i2 = this.g;
        if (i >= i2) {
            return;
        }
        cVar.c = i2;
        cVar.a.a((Object) this.e);
    }

    void c(int i) {
        boolean z;
        boolean z2;
        int i2 = this.c;
        this.c = i + i2;
        if (this.d) {
            return;
        }
        this.d = true;
        while (true) {
            try {
                int i3 = this.c;
                if (i2 != i3) {
                    if (i2 == 0 && i3 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i2 > 0 && i3 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        j();
                    } else if (z2) {
                        k();
                    }
                    i2 = i3;
                } else {
                    this.d = false;
                    return;
                }
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        }
    }

    void e(LiveData<T>.c cVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                vs9<i67<? super T>, LiveData<T>.c>.d f = this.b.f();
                while (f.hasNext()) {
                    d((c) f.next().getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public T f() {
        T t = (T) this.e;
        if (t != k) {
            return t;
        }
        return null;
    }

    public boolean g() {
        if (this.c > 0) {
            return true;
        }
        return false;
    }

    public void h(@NonNull op5 op5Var, @NonNull i67<? super T> i67Var) {
        b("observe");
        if (op5Var.getLifecycle().b() == d.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(op5Var, i67Var);
        LiveData<T>.c k2 = this.b.k(i67Var, lifecycleBoundObserver);
        if (k2 != null && !k2.c(op5Var)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (k2 != null) {
            return;
        }
        op5Var.getLifecycle().a(lifecycleBoundObserver);
    }

    public void i(@NonNull i67<? super T> i67Var) {
        b("observeForever");
        b bVar = new b(i67Var);
        LiveData<T>.c k2 = this.b.k(i67Var, bVar);
        if (!(k2 instanceof LifecycleBoundObserver)) {
            if (k2 != null) {
                return;
            }
            bVar.a(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(T t) {
        boolean z;
        synchronized (this.a) {
            if (this.f == k) {
                z = true;
            } else {
                z = false;
            }
            this.f = t;
        }
        if (!z) {
            return;
        }
        uq.g().c(this.j);
    }

    public void m(@NonNull i67<? super T> i67Var) {
        b("removeObserver");
        LiveData<T>.c p = this.b.p(i67Var);
        if (p == null) {
            return;
        }
        p.b();
        p.a(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(T t) {
        b("setValue");
        this.g++;
        this.e = t;
        e(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class c {
        final i67<? super T> a;
        boolean b;
        int c = -1;

        c(i67<? super T> i67Var) {
            this.a = i67Var;
        }

        void a(boolean z) {
            int i;
            if (z == this.b) {
                return;
            }
            this.b = z;
            LiveData liveData = LiveData.this;
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            liveData.c(i);
            if (this.b) {
                LiveData.this.e(this);
            }
        }

        boolean c(op5 op5Var) {
            return false;
        }

        abstract boolean e();

        void b() {
        }
    }

    protected void j() {
    }

    protected void k() {
    }
}
