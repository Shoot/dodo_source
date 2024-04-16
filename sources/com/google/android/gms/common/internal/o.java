package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class o implements ServiceConnection {
    private final int a;
    final /* synthetic */ b b;

    public o(b bVar, int i) {
        this.b = bVar;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        xr4 kVar;
        b bVar = this.b;
        if (iBinder != null) {
            obj = bVar.n;
            synchronized (obj) {
                try {
                    b bVar2 = this.b;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof xr4)) {
                        kVar = (xr4) queryLocalInterface;
                    } else {
                        kVar = new k(iBinder);
                    }
                    bVar2.o = kVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.b.b0(0, null, this.a);
            return;
        }
        b.a0(bVar, 16);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.b.n;
        synchronized (obj) {
            this.b.o = null;
        }
        Handler handler = this.b.l;
        handler.sendMessage(handler.obtainMessage(6, this.a, 1));
    }
}
