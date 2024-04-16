package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes2.dex */
final class b extends Thread {
    private final WeakReference<AdvertisingIdClient> a;
    private final long b;
    final CountDownLatch c = new CountDownLatch(1);
    boolean d = false;

    public b(AdvertisingIdClient advertisingIdClient, long j) {
        this.a = new WeakReference<>(advertisingIdClient);
        this.b = j;
        start();
    }

    private final void a() {
        AdvertisingIdClient advertisingIdClient = this.a.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.b();
            this.d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (!this.c.await(this.b, TimeUnit.MILLISECONDS)) {
                a();
            }
        } catch (InterruptedException unused) {
            a();
        }
    }
}
