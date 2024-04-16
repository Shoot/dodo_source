package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class q9 implements ServiceConnection, b.a, b.InterfaceC0220b {
    private volatile boolean a;
    private volatile l4 b;
    final /* synthetic */ x8 c;

    /* JADX INFO: Access modifiers changed from: protected */
    public q9(x8 x8Var) {
        this.c = x8Var;
    }

    @Override // com.google.android.gms.common.internal.b.InterfaceC0220b
    public final void C(@NonNull ConnectionResult connectionResult) {
        gh8.e("MeasurementServiceConnection.onConnectionFailed");
        k4 D = this.c.a.D();
        if (D != null) {
            D.K().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.k().C(new x9(this));
    }

    public final void a() {
        this.c.l();
        Context zza = this.c.zza();
        synchronized (this) {
            try {
                if (this.a) {
                    this.c.n().J().a("Connection attempt already in progress");
                } else if (this.b != null && (this.b.isConnecting() || this.b.isConnected())) {
                    this.c.n().J().a("Already awaiting connection attempt");
                } else {
                    this.b = new l4(zza, Looper.getMainLooper(), this, this);
                    this.c.n().J().a("Connecting to remote service");
                    this.a = true;
                    gh8.j(this.b);
                    this.b.n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Intent intent) {
        q9 q9Var;
        this.c.l();
        Context zza = this.c.zza();
        uq1 b = uq1.b();
        synchronized (this) {
            try {
                if (this.a) {
                    this.c.n().J().a("Connection attempt already in progress");
                    return;
                }
                this.c.n().J().a("Using local app measurement service");
                this.a = true;
                q9Var = this.c.c;
                b.a(zza, intent, q9Var, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.b != null && (this.b.isConnected() || this.b.isConnecting())) {
            this.b.disconnect();
        }
        this.b = null;
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void onConnectionSuspended(int i) {
        gh8.e("MeasurementServiceConnection.onConnectionSuspended");
        this.c.n().E().a("Service connection suspended");
        this.c.k().C(new u9(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        q9 q9Var;
        lxc g4Var;
        gh8.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.c.n().F().a("Service connected with null binder");
                return;
            }
            lxc lxcVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof lxc) {
                        g4Var = (lxc) queryLocalInterface;
                    } else {
                        g4Var = new g4(iBinder);
                    }
                    lxcVar = g4Var;
                    this.c.n().J().a("Bound to IMeasurementService interface");
                } else {
                    this.c.n().F().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.c.n().F().a("Service connect failed to get IMeasurementService");
            }
            if (lxcVar == null) {
                this.a = false;
                try {
                    uq1 b = uq1.b();
                    Context zza = this.c.zza();
                    q9Var = this.c.c;
                    b.c(zza, q9Var);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.c.k().C(new t9(this, lxcVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        gh8.e("MeasurementServiceConnection.onServiceDisconnected");
        this.c.n().E().a("Service disconnected");
        this.c.k().C(new s9(this, componentName));
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void x(Bundle bundle) {
        gh8.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                gh8.j(this.b);
                this.c.k().C(new v9(this, this.b.A()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }
}
