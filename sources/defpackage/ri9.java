package defpackage;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: RequestFutureTarget.java */
/* renamed from: ri9  reason: default package */
/* loaded from: classes.dex */
public class ri9<R> implements s94<R>, vi9<R> {
    private static final a k = new a();
    private final int a;
    private final int b;
    private final boolean c;
    private final a d;
    private R e;
    private ii9 f;
    private boolean g;
    private boolean h;
    private boolean i;
    private GlideException j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestFutureTarget.java */
    /* renamed from: ri9$a */
    /* loaded from: classes.dex */
    public static class a {
        a() {
        }

        void a(Object obj) {
            obj.notifyAll();
        }

        void b(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    public ri9(int i, int i2) {
        this(i, i2, true, k);
    }

    private synchronized R m(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            if (this.c && !isDone()) {
                vub.a();
            }
            if (!this.g) {
                if (!this.i) {
                    if (this.h) {
                        return this.e;
                    }
                    if (l == null) {
                        this.d.b(this, 0L);
                    } else if (l.longValue() > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long longValue = l.longValue() + currentTimeMillis;
                        while (!isDone() && currentTimeMillis < longValue) {
                            this.d.b(this, longValue - currentTimeMillis);
                            currentTimeMillis = System.currentTimeMillis();
                        }
                    }
                    if (!Thread.interrupted()) {
                        if (!this.i) {
                            if (!this.g) {
                                if (this.h) {
                                    return this.e;
                                }
                                throw new TimeoutException();
                            }
                            throw new CancellationException();
                        }
                        throw new ExecutionException(this.j);
                    }
                    throw new InterruptedException();
                }
                throw new ExecutionException(this.j);
            }
            throw new CancellationException();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.n6b
    public synchronized void b(Drawable drawable) {
    }

    @Override // defpackage.n6b
    public void c(@NonNull kna knaVar) {
        knaVar.d(this.a, this.b);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.g = true;
                this.d.a(this);
                ii9 ii9Var = null;
                if (z) {
                    ii9 ii9Var2 = this.f;
                    this.f = null;
                    ii9Var = ii9Var2;
                }
                if (ii9Var != null) {
                    ii9Var.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.n6b
    public synchronized void d(@NonNull R r, dlb<? super R> dlbVar) {
    }

    @Override // defpackage.vi9
    public synchronized boolean e(GlideException glideException, Object obj, @NonNull n6b<R> n6bVar, boolean z) {
        this.i = true;
        this.j = glideException;
        this.d.a(this);
        return false;
    }

    @Override // defpackage.vi9
    public synchronized boolean f(@NonNull R r, @NonNull Object obj, n6b<R> n6bVar, @NonNull dl2 dl2Var, boolean z) {
        this.h = true;
        this.e = r;
        this.d.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return m(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.n6b
    public synchronized ii9 h() {
        return this.f;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.g;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.g && !this.h) {
            if (!this.i) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    @Override // defpackage.n6b
    public synchronized void j(ii9 ii9Var) {
        this.f = ii9Var;
    }

    public String toString() {
        ii9 ii9Var;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            try {
                ii9Var = null;
                if (this.g) {
                    str = "CANCELLED";
                } else if (this.i) {
                    str = "FAILURE";
                } else if (this.h) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    ii9Var = this.f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ii9Var != null) {
            return str2 + str + ", request=[" + ii9Var + "]]";
        }
        return str2 + str + "]";
    }

    ri9(int i, int i2, boolean z, a aVar) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = aVar;
    }

    @Override // java.util.concurrent.Future
    public R get(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return m(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // defpackage.mp5
    public void g() {
    }

    @Override // defpackage.mp5
    public void onDestroy() {
    }

    @Override // defpackage.mp5
    public void onStart() {
    }

    @Override // defpackage.n6b
    public void a(Drawable drawable) {
    }

    @Override // defpackage.n6b
    public void i(Drawable drawable) {
    }

    @Override // defpackage.n6b
    public void l(@NonNull kna knaVar) {
    }
}
