package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public abstract class n0 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean b;
    protected final AtomicReference c;
    private final Handler d;
    protected final com.google.android.gms.common.a e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(kp5 kp5Var, com.google.android.gms.common.a aVar) {
        super(kp5Var);
        this.c = new AtomicReference(null);
        this.d = new hlc(Looper.getMainLooper());
        this.e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(ConnectionResult connectionResult, int i) {
        this.c.set(null);
        m(connectionResult, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.c.set(null);
        n();
    }

    private static final int p(k0 k0Var) {
        if (k0Var == null) {
            return -1;
        }
        return k0Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i, int i2, Intent intent) {
        k0 k0Var = (k0) this.c.get();
        if (i != 1) {
            if (i == 2) {
                int g = this.e.g(b());
                if (g == 0) {
                    o();
                    return;
                } else if (k0Var == null) {
                    return;
                } else {
                    if (k0Var.b().h() == 18 && g == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            o();
            return;
        } else if (i2 == 0) {
            if (k0Var == null) {
                return;
            }
            int i3 = 13;
            if (intent != null) {
                i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
            }
            l(new ConnectionResult(i3, null, k0Var.b().toString()), p(k0Var));
            return;
        }
        if (k0Var != null) {
            l(k0Var.b(), k0Var.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        k0 k0Var;
        super.f(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.c;
            if (bundle.getBoolean("resolving_error", false)) {
                k0Var = new k0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                k0Var = null;
            }
            atomicReference.set(k0Var);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        k0 k0Var = (k0) this.c.get();
        if (k0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", k0Var.a());
        bundle.putInt("failed_status", k0Var.b().h());
        bundle.putParcelable("failed_resolution", k0Var.b().p());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.b = false;
    }

    protected abstract void m(ConnectionResult connectionResult, int i);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new ConnectionResult(13, null), p((k0) this.c.get()));
    }

    public final void s(ConnectionResult connectionResult, int i) {
        k0 k0Var = new k0(connectionResult, i);
        AtomicReference atomicReference = this.c;
        while (!ho1.a(atomicReference, null, k0Var)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.d.post(new m0(this, k0Var));
    }
}
