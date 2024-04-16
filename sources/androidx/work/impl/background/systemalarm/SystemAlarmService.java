package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
/* loaded from: classes.dex */
public class SystemAlarmService extends rp5 implements e.c {
    private static final String d = nx5.f("SystemAlarmService");
    private e b;
    private boolean c;

    private void e() {
        e eVar = new e(this);
        this.b = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void b() {
        this.c = true;
        nx5.c().a(d, "All commands completed in dispatcher", new Throwable[0]);
        x2c.a();
        stopSelf();
    }

    @Override // defpackage.rp5, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.c = false;
    }

    @Override // defpackage.rp5, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.b.j();
    }

    @Override // defpackage.rp5, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            nx5.c().d(d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.b.j();
            e();
            this.c = false;
        }
        if (intent != null) {
            this.b.a(intent, i2);
            return 3;
        }
        return 3;
    }
}
