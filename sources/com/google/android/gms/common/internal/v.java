package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class v extends d {
    private final HashMap f = new HashMap();
    private final Context g;
    private volatile Handler h;
    private final u i;
    private final uq1 j;
    private final long k;
    private final long l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Context context, Looper looper) {
        u uVar = new u(this, null);
        this.i = uVar;
        this.g = context.getApplicationContext();
        this.h = new v0d(looper, uVar);
        this.j = uq1.b();
        this.k = 5000L;
        this.l = 300000L;
    }

    @Override // com.google.android.gms.common.internal.d
    protected final void d(y4d y4dVar, ServiceConnection serviceConnection, String str) {
        gh8.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            try {
                t tVar = (t) this.f.get(y4dVar);
                if (tVar != null) {
                    if (tVar.h(serviceConnection)) {
                        tVar.f(serviceConnection, str);
                        if (tVar.i()) {
                            this.h.sendMessageDelayed(this.h.obtainMessage(0, y4dVar), this.k);
                        }
                    } else {
                        String obj = y4dVar.toString();
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj);
                    }
                } else {
                    String obj2 = y4dVar.toString();
                    throw new IllegalStateException("Nonexistent connection status for service config: " + obj2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public final boolean f(y4d y4dVar, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j;
        gh8.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f) {
            try {
                t tVar = (t) this.f.get(y4dVar);
                if (tVar == null) {
                    tVar = new t(this, y4dVar);
                    tVar.d(serviceConnection, serviceConnection, str);
                    tVar.e(str, executor);
                    this.f.put(y4dVar, tVar);
                } else {
                    this.h.removeMessages(0, y4dVar);
                    if (!tVar.h(serviceConnection)) {
                        tVar.d(serviceConnection, serviceConnection, str);
                        int a = tVar.a();
                        if (a != 1) {
                            if (a == 2) {
                                tVar.e(str, executor);
                            }
                        } else {
                            serviceConnection.onServiceConnected(tVar.b(), tVar.c());
                        }
                    } else {
                        String obj = y4dVar.toString();
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                    }
                }
                j = tVar.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }
}
