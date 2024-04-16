package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.work.impl.foreground.a;
import com.huawei.hms.push.constant.RemoteMessageConst;
/* loaded from: classes.dex */
public class SystemForegroundService extends rp5 implements a.b {
    private static final String f = nx5.f("SystemFgService");
    private static SystemForegroundService g = null;
    private Handler b;
    private boolean c;
    androidx.work.impl.foreground.a d;
    NotificationManager e;

    /* loaded from: classes.dex */
    class a implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ Notification b;
        final /* synthetic */ int c;

        a(int i, Notification notification, int i2) {
            this.a = i;
            this.b = notification;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.a, this.b, this.c);
            } else {
                SystemForegroundService.this.startForeground(this.a, this.b);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ Notification b;

        b(int i, Notification notification) {
            this.a = i;
            this.b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.e.notify(this.a, this.b);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        final /* synthetic */ int a;

        c(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.e.cancel(this.a);
        }
    }

    private void e() {
        this.b = new Handler(Looper.getMainLooper());
        this.e = (NotificationManager) getApplicationContext().getSystemService(RemoteMessageConst.NOTIFICATION);
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.d = aVar;
        aVar.m(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(int i, @NonNull Notification notification) {
        this.b.post(new b(i, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i, int i2, @NonNull Notification notification) {
        this.b.post(new a(i, notification, i2));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i) {
        this.b.post(new c(i));
    }

    @Override // defpackage.rp5, android.app.Service
    public void onCreate() {
        super.onCreate();
        g = this;
        e();
    }

    @Override // defpackage.rp5, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.d.k();
    }

    @Override // defpackage.rp5, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            nx5.c().d(f, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.d.k();
            e();
            this.c = false;
        }
        if (intent != null) {
            this.d.l(intent);
            return 3;
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.c = true;
        nx5.c().a(f, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        g = null;
        stopSelf();
    }
}
