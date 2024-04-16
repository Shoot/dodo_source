package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes2.dex */
public final class r {
    private static r e;
    private final Context a;
    private final ScheduledExecutorService b;
    private m c = new m(this, null);
    private int d = 1;

    r(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context a(r rVar) {
        return rVar.a;
    }

    public static synchronized r b(Context context) {
        r rVar;
        synchronized (r.class) {
            try {
                if (e == null) {
                    awc.a();
                    e = new r(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new rs6("MessengerIpcClient"))));
                }
                rVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService e(r rVar) {
        return rVar.b;
    }

    private final synchronized int f() {
        int i;
        i = this.d;
        this.d = i + 1;
        return i;
    }

    private final synchronized y6b g(p pVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(pVar.toString()));
            }
            if (!this.c.g(pVar)) {
                m mVar = new m(this, null);
                this.c = mVar;
                mVar.g(pVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return pVar.b.a();
    }

    public final y6b c(int i, Bundle bundle) {
        return g(new o(f(), i, bundle));
    }

    public final y6b d(int i, Bundle bundle) {
        return g(new q(f(), 1, bundle));
    }
}
