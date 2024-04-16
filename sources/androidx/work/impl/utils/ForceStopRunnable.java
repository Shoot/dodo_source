package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.a;
import defpackage.b7c;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {
    private static final String d = nx5.f("ForceStopRunnable");
    private static final long e = TimeUnit.DAYS.toMillis(3650);
    private final Context a;
    private final j7c b;
    private int c = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String a = nx5.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                nx5.c().g(a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.g(context);
            }
        }
    }

    public ForceStopRunnable(@NonNull Context context, @NonNull j7c j7cVar) {
        this.a = context.getApplicationContext();
        this.b = j7cVar;
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, c(context), i);
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void g(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (gh0.c()) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        PendingIntent d2 = d(context, i);
        long currentTimeMillis = System.currentTimeMillis() + e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d2);
        }
    }

    public boolean a() {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 23) {
            z = w4b.i(this.a, this.b);
        } else {
            z = false;
        }
        WorkDatabase t = this.b.t();
        a M = t.M();
        n7c L = t.L();
        t.e();
        try {
            List<WorkSpec> p = M.p();
            if (p != null && !p.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                for (WorkSpec workSpec : p) {
                    M.u(b7c.a.ENQUEUED, workSpec.a);
                    M.l(workSpec.a, -1L);
                }
            }
            L.b();
            t.B();
            t.i();
            if (!z2 && !z) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            t.i();
            throw th;
        }
    }

    public void b() {
        boolean a = a();
        if (h()) {
            nx5.c().a(d, "Rescheduling Workers.", new Throwable[0]);
            this.b.x();
            this.b.q().c(false);
        } else if (e()) {
            nx5.c().a(d, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.b.x();
        } else if (a) {
            nx5.c().a(d, "Found unfinished work, scheduling it.", new Throwable[0]);
            ew9.b(this.b.n(), this.b.t(), this.b.s());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    public boolean e() {
        int i;
        List historicalProcessExitReasons;
        int reason;
        try {
            if (gh0.c()) {
                i = 570425344;
            } else {
                i = 536870912;
            }
            PendingIntent d2 = d(this.a, i);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d2 != null) {
                    d2.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                        reason = x44.a(historicalProcessExitReasons.get(i2)).getReason();
                        if (reason == 10) {
                            return true;
                        }
                    }
                }
            } else if (d2 == null) {
                g(this.a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e2) {
            e = e2;
            nx5.c().h(d, "Ignoring exception", e);
            return true;
        } catch (SecurityException e3) {
            e = e3;
            nx5.c().h(d, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        androidx.work.a n = this.b.n();
        if (TextUtils.isEmpty(n.c())) {
            nx5.c().a(d, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b = yk8.b(this.a, n);
        nx5.c().a(d, String.format("Is default app process = %s", Boolean.valueOf(b)), new Throwable[0]);
        return b;
    }

    boolean h() {
        return this.b.q().a();
    }

    public void i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        try {
            if (!f()) {
                return;
            }
            while (true) {
                y6c.e(this.a);
                nx5.c().a(d, "Performing cleanup operations.", new Throwable[0]);
                try {
                    b();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e2) {
                    i = this.c + 1;
                    this.c = i;
                    if (i < 3) {
                        nx5.c().a(d, String.format("Retrying after %s", Long.valueOf(i * 300)), e2);
                        i(this.c * 300);
                    } else {
                        nx5.c().b(d, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        this.b.n().d();
                        throw illegalStateException;
                    }
                }
                nx5.c().a(d, String.format("Retrying after %s", Long.valueOf(i * 300)), e2);
                i(this.c * 300);
            }
        } finally {
            this.b.w();
        }
    }
}
