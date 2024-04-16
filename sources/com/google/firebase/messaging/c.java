package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.messaging.a;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.k17;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: DisplayNotification.java */
/* loaded from: classes2.dex */
class c {
    private final ExecutorService a;
    private final Context b;
    private final q c;

    public c(Context context, q qVar, ExecutorService executorService) {
        this.a = executorService;
        this.b = context;
        this.c = qVar;
    }

    private boolean b() {
        if (((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!ad8.f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                if (runningAppProcessInfo.importance != 100) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private void c(a.C0243a c0243a) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.b.getSystemService(RemoteMessageConst.NOTIFICATION)).notify(c0243a.b, c0243a.c, c0243a.a.b());
    }

    private ju4 d() {
        ju4 e = ju4.e(this.c.p("gcm.n.image"));
        if (e != null) {
            e.k(this.a);
        }
        return e;
    }

    private void e(k17.e eVar, ju4 ju4Var) {
        if (ju4Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) o7b.b(ju4Var.i(), 5L, TimeUnit.SECONDS);
            eVar.z(bitmap);
            eVar.J(new k17.b().r(bitmap).q(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            ju4Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            ju4Var.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        ju4 d = d();
        a.C0243a e = a.e(this.b, this.c);
        e(e.a, d);
        c(e);
        return true;
    }
}
