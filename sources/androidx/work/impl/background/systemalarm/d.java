package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.model.WorkSpec;
import defpackage.x7c;
import java.util.Collections;
import java.util.List;
/* compiled from: DelayMetCommandHandler.java */
/* loaded from: classes.dex */
public class d implements u6c, bm3, x7c.b {
    private static final String j = nx5.f("DelayMetCommandHandler");
    private final Context a;
    private final int b;
    private final String c;
    private final e d;
    private final v6c e;
    private PowerManager.WakeLock h;
    private boolean i = false;
    private int g = 0;
    private final Object f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(@NonNull Context context, int i, @NonNull String str, @NonNull e eVar) {
        this.a = context;
        this.b = i;
        this.d = eVar;
        this.c = str;
        this.e = new v6c(context, eVar.f(), this);
    }

    private void c() {
        synchronized (this.f) {
            try {
                this.e.e();
                this.d.h().c(this.c);
                PowerManager.WakeLock wakeLock = this.h;
                if (wakeLock != null && wakeLock.isHeld()) {
                    nx5.c().a(j, String.format("Releasing wakelock %s for WorkSpec %s", this.h, this.c), new Throwable[0]);
                    this.h.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void g() {
        synchronized (this.f) {
            try {
                if (this.g < 2) {
                    this.g = 2;
                    nx5 c = nx5.c();
                    String str = j;
                    c.a(str, String.format("Stopping work for WorkSpec %s", this.c), new Throwable[0]);
                    Intent g = b.g(this.a, this.c);
                    e eVar = this.d;
                    eVar.k(new e.b(eVar, g, this.b));
                    if (this.d.d().g(this.c)) {
                        nx5.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.c), new Throwable[0]);
                        Intent f = b.f(this.a, this.c);
                        e eVar2 = this.d;
                        eVar2.k(new e.b(eVar2, f, this.b));
                    } else {
                        nx5.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.c), new Throwable[0]);
                    }
                } else {
                    nx5.c().a(j, String.format("Already stopped work for %s", this.c), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.x7c.b
    public void a(@NonNull String str) {
        nx5.c().a(j, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // defpackage.u6c
    public void b(@NonNull List<String> list) {
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.h = x2c.b(this.a, String.format("%s (%s)", this.c, Integer.valueOf(this.b)));
        nx5 c = nx5.c();
        String str = j;
        c.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.h, this.c), new Throwable[0]);
        this.h.acquire();
        WorkSpec g = this.d.g().t().M().g(this.c);
        if (g == null) {
            g();
            return;
        }
        boolean b = g.b();
        this.i = b;
        if (!b) {
            nx5.c().a(str, String.format("No constraints for %s", this.c), new Throwable[0]);
            f(Collections.singletonList(this.c));
            return;
        }
        this.e.d(Collections.singletonList(g));
    }

    @Override // defpackage.bm3
    public void e(@NonNull String str, boolean z) {
        nx5.c().a(j, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        c();
        if (z) {
            Intent f = b.f(this.a, this.c);
            e eVar = this.d;
            eVar.k(new e.b(eVar, f, this.b));
        }
        if (this.i) {
            Intent a = b.a(this.a);
            e eVar2 = this.d;
            eVar2.k(new e.b(eVar2, a, this.b));
        }
    }

    @Override // defpackage.u6c
    public void f(@NonNull List<String> list) {
        if (!list.contains(this.c)) {
            return;
        }
        synchronized (this.f) {
            try {
                if (this.g == 0) {
                    this.g = 1;
                    nx5.c().a(j, String.format("onAllConstraintsMet for %s", this.c), new Throwable[0]);
                    if (this.d.d().j(this.c)) {
                        this.d.h().b(this.c, 600000L, this);
                    } else {
                        c();
                    }
                } else {
                    nx5.c().a(j, String.format("Already started work for %s", this.c), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
