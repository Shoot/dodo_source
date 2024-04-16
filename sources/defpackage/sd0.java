package defpackage;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: BlockingAnalyticsEventLogger.java */
/* renamed from: sd0  reason: default package */
/* loaded from: classes2.dex */
public class sd0 implements tc, sc {
    private final g12 a;
    private final int b;
    private final TimeUnit c;
    private CountDownLatch e;
    private final Object d = new Object();
    private boolean f = false;

    public sd0(@NonNull g12 g12Var, int i, TimeUnit timeUnit) {
        this.a = g12Var;
        this.b = i;
        this.c = timeUnit;
    }

    @Override // defpackage.sc
    public void a(@NonNull String str, Bundle bundle) {
        synchronized (this.d) {
            try {
                rx5 f = rx5.f();
                f.i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.e = new CountDownLatch(1);
                this.f = false;
                this.a.a(str, bundle);
                rx5.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.e.await(this.b, this.c)) {
                        this.f = true;
                        rx5.f().i("App exception callback received from Analytics listener.");
                    } else {
                        rx5.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    rx5.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.tc
    public void b(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
