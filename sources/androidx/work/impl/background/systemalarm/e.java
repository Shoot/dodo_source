package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SystemAlarmDispatcher.java */
/* loaded from: classes.dex */
public class e implements bm3 {
    static final String k = nx5.f("SystemAlarmDispatcher");
    final Context a;
    private final d7b b;
    private final x7c c;
    private final al8 d;
    private final j7c e;
    final androidx.work.impl.background.systemalarm.b f;
    private final Handler g;
    final List<Intent> h;
    Intent i;
    private c j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.h) {
                e eVar2 = e.this;
                eVar2.i = eVar2.h.get(0);
            }
            Intent intent = e.this.i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.i.getIntExtra("KEY_START_ID", 0);
                nx5 c = nx5.c();
                String str = e.k;
                c.a(str, String.format("Processing command %s, %s", e.this.i, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock b = x2c.b(e.this.a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    nx5.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, b), new Throwable[0]);
                    b.acquire();
                    e eVar3 = e.this;
                    eVar3.f.p(eVar3.i, intExtra, eVar3);
                    nx5.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, b), new Throwable[0]);
                    b.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    try {
                        nx5 c2 = nx5.c();
                        String str2 = e.k;
                        c2.b(str2, "Unexpected error in onHandleIntent", th);
                        nx5.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, b), new Throwable[0]);
                        b.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th2) {
                        nx5.c().a(e.k, String.format("Releasing operation wake lock (%s) %s", action, b), new Throwable[0]);
                        b.release();
                        e eVar4 = e.this;
                        eVar4.k(new d(eVar4));
                        throw th2;
                    }
                }
                eVar.k(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {
        private final e a;
        private final Intent b;
        private final int c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(@NonNull e eVar, @NonNull Intent intent, int i) {
            this.a = eVar;
            this.b = intent;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public interface c {
        void b();
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    static class d implements Runnable {
        private final e a;

        d(@NonNull e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(@NonNull Context context) {
        this(context, null, null);
    }

    private void b() {
        if (this.g.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    private boolean i(@NonNull String str) {
        b();
        synchronized (this.h) {
            try {
                for (Intent intent : this.h) {
                    if (str.equals(intent.getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        b();
        PowerManager.WakeLock b2 = x2c.b(this.a, "ProcessCommand");
        try {
            b2.acquire();
            this.e.u().b(new a());
        } finally {
            b2.release();
        }
    }

    public boolean a(@NonNull Intent intent, int i) {
        nx5 c2 = nx5.c();
        String str = k;
        c2.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            nx5.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.h) {
                try {
                    boolean z = !this.h.isEmpty();
                    this.h.add(intent);
                    if (!z) {
                        l();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    void c() {
        nx5 c2 = nx5.c();
        String str = k;
        c2.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.h) {
            try {
                if (this.i != null) {
                    nx5.c().a(str, String.format("Removing command %s", this.i), new Throwable[0]);
                    if (this.h.remove(0).equals(this.i)) {
                        this.i = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                kca c3 = this.b.c();
                if (!this.f.o() && this.h.isEmpty() && !c3.a()) {
                    nx5.c().a(str, "No more commands & intents.", new Throwable[0]);
                    c cVar = this.j;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else if (!this.h.isEmpty()) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public al8 d() {
        return this.d;
    }

    @Override // defpackage.bm3
    public void e(@NonNull String str, boolean z) {
        k(new b(this, androidx.work.impl.background.systemalarm.b.c(this.a, str, z), 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d7b f() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j7c g() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x7c h() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        nx5.c().a(k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.d.i(this);
        this.c.a();
        this.j = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(@NonNull Runnable runnable) {
        this.g.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(@NonNull c cVar) {
        if (this.j != null) {
            nx5.c().b(k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.j = cVar;
        }
    }

    e(@NonNull Context context, al8 al8Var, j7c j7cVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.c = new x7c();
        j7cVar = j7cVar == null ? j7c.p(context) : j7cVar;
        this.e = j7cVar;
        al8Var = al8Var == null ? j7cVar.r() : al8Var;
        this.d = al8Var;
        this.b = j7cVar.u();
        al8Var.c(this);
        this.h = new ArrayList();
        this.i = null;
        this.g = new Handler(Looper.getMainLooper());
    }
}
