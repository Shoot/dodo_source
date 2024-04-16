package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.d;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes2.dex */
public class AdvertisingIdClient {
    wd0 a;
    axc b;
    boolean c;
    final Object d = new Object();
    b e;
    private final Context f;
    final long g;

    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    /* loaded from: classes2.dex */
    public static final class Info {
        private final String a;
        private final boolean b;

        @Deprecated
        public Info(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public String getId() {
            return this.a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.b;
        }

        @NonNull
        public String toString() {
            String str = this.a;
            boolean z = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(@NonNull Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        gh8.j(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.c = false;
        this.g = j;
    }

    private final Info e(int i) throws IOException {
        Info info;
        gh8.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        b bVar = this.e;
                        if (bVar == null || !bVar.d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c(false);
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                gh8.j(this.a);
                gh8.j(this.b);
                try {
                    info = new Info(this.b.c(), this.b.O(true));
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
        return info;
    }

    private final void f() {
        synchronized (this.d) {
            b bVar = this.e;
            if (bVar != null) {
                bVar.c.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new b(this, j);
            }
        }
    }

    @NonNull
    public static Info getAdvertisingIdInfo(@NonNull Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.c(false);
            Info e = advertisingIdClient.e(-1);
            advertisingIdClient.d(e, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return e;
        } finally {
        }
    }

    public final void b() {
        gh8.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f != null && this.a != null) {
                    if (this.c) {
                        uq1.b().c(this.f, this.a);
                    }
                    this.c = false;
                    this.b = null;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void c(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        gh8.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    b();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int h = com.google.android.gms.common.b.f().h(context, d.a);
                    if (h != 0 && h != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    wd0 wd0Var = new wd0();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (uq1.b().a(context, intent, wd0Var, 1)) {
                        this.a = wd0Var;
                        try {
                            this.b = yvc.x(wd0Var.a(AbstractComponentTracker.LINGERING_TIMEOUT, TimeUnit.MILLISECONDS));
                            this.c = true;
                            if (z) {
                                f();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } else {
                        throw new IOException("Connection failure");
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean d(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str2 = "1";
            hashMap.put("app_context", "1");
            if (info != null) {
                if (true != info.isLimitAdTrackingEnabled()) {
                    str2 = "0";
                }
                hashMap.put("limit_ad_tracking", str2);
                String id = info.getId();
                if (id != null) {
                    hashMap.put("ad_id_size", Integer.toString(id.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put(RemoteMessageConst.Notification.TAG, "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new a(this, hashMap).start();
            return true;
        }
        return false;
    }

    protected final void finalize() throws Throwable {
        b();
        super.finalize();
    }

    public static void a(boolean z) {
    }
}
