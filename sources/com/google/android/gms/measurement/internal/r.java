package com.google.android.gms.measurement.internal;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public abstract class r {
    private static volatile Handler d;
    private final u6 a;
    private final Runnable b;
    private volatile long c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(u6 u6Var) {
        gh8.j(u6Var);
        this.a = u6Var;
        this.b = new u(this, u6Var);
    }

    private final Handler f() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (r.class) {
            try {
                if (d == null) {
                    d = new cuc(this.a.zza().getMainLooper());
                }
                handler = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c = 0L;
        f().removeCallbacks(this.b);
    }

    public final void b(long j) {
        a();
        if (j >= 0) {
            this.c = this.a.b().currentTimeMillis();
            if (!f().postDelayed(this.b, j)) {
                this.a.n().F().b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public abstract void d();

    public final boolean e() {
        if (this.c != 0) {
            return true;
        }
        return false;
    }
}
