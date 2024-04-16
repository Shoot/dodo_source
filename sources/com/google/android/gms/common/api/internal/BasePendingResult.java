package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.sx7;
import defpackage.tk9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
@KeepName
/* loaded from: classes2.dex */
public abstract class BasePendingResult<R extends tk9> extends sx7<R> {
    static final ThreadLocal zaa = new o0();
    @KeepName
    private p0 mResultGuardian;
    @NonNull
    protected final a zab;
    @NonNull
    protected final WeakReference zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList zag;
    private uk9 zah;
    private final AtomicReference zai;
    private tk9 zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private boolean zaq;

    /* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
    /* loaded from: classes2.dex */
    public static class a<R extends tk9> extends hlc {
        public a(@NonNull Looper looper) {
            super(looper);
        }

        public final void a(@NonNull uk9 uk9Var, @NonNull tk9 tk9Var) {
            ThreadLocal threadLocal = BasePendingResult.zaa;
            sendMessage(obtainMessage(1, new Pair((uk9) gh8.j(uk9Var), tk9Var)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    Log.wtf("BasePendingResult", "Don't know how to handle message: " + i, new Exception());
                    return;
                }
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.j);
                return;
            }
            Pair pair = (Pair) message.obj;
            uk9 uk9Var = (uk9) pair.first;
            tk9 tk9Var = (tk9) pair.second;
            try {
                uk9Var.a(tk9Var);
            } catch (RuntimeException e) {
                BasePendingResult.zal(tk9Var);
                throw e;
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(Looper.getMainLooper());
        this.zac = new WeakReference(null);
    }

    private final tk9 zaa() {
        tk9 tk9Var;
        synchronized (this.zae) {
            gh8.n(!this.zal, "Result has already been consumed.");
            gh8.n(isReady(), "Result is not ready.");
            tk9Var = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (((e0) this.zai.getAndSet(null)) == null) {
            return (tk9) gh8.j(tk9Var);
        }
        throw null;
    }

    private final void zab(tk9 tk9Var) {
        this.zaj = tk9Var;
        this.zak = tk9Var.d();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            uk9 uk9Var = this.zah;
            if (uk9Var == null) {
                if (this.zaj instanceof tc9) {
                    this.mResultGuardian = new p0(this, null);
                }
            } else {
                this.zab.removeMessages(2);
                this.zab.a(uk9Var, zaa());
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((sx7.a) arrayList.get(i)).a(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(tk9 tk9Var) {
        if (tk9Var instanceof tc9) {
            try {
                ((tc9) tk9Var).release();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(tk9Var)), e);
            }
        }
    }

    @Override // defpackage.sx7
    public final void addStatusListener(@NonNull sx7.a aVar) {
        boolean z;
        if (aVar != null) {
            z = true;
        } else {
            z = false;
        }
        gh8.b(z, "Callback cannot be null.");
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    aVar.a(this.zak);
                } else {
                    this.zag.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.sx7
    @NonNull
    @ResultIgnorabilityUnspecified
    public final R await(long j, @NonNull TimeUnit timeUnit) {
        if (j > 0) {
            gh8.i("await must not be called on the UI thread when time is greater than zero.");
        }
        gh8.n(!this.zal, "Result has already been consumed.");
        gh8.n(true, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j, timeUnit)) {
                forceFailureUnlessReady(Status.j);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.h);
        }
        gh8.n(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    @NonNull
    public abstract R createFailedResult(@NonNull Status status);

    @Deprecated
    public final void forceFailureUnlessReady(@NonNull Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isReady() {
        if (this.zaf.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final void setResult(@NonNull R r) {
        synchronized (this.zae) {
            try {
                if (!this.zan && !this.zam) {
                    isReady();
                    gh8.n(!isReady(), "Results have already been set");
                    gh8.n(!this.zal, "Result has already been consumed");
                    zab(r);
                    return;
                }
                zal(r);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zak() {
        boolean z = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z = false;
        }
        this.zaq = z;
    }

    public BasePendingResult(com.google.android.gms.common.api.c cVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(cVar != null ? cVar.c() : Looper.getMainLooper());
        this.zac = new WeakReference(cVar);
    }
}
