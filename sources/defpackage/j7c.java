package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import defpackage.nx5;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
/* compiled from: WorkManagerImpl.java */
/* renamed from: j7c  reason: default package */
/* loaded from: classes.dex */
public class j7c extends h7c {
    private static final String j = nx5.f("WorkManagerImpl");
    private static j7c k = null;
    private static j7c l = null;
    private static final Object m = new Object();
    private Context a;
    private a b;
    private WorkDatabase c;
    private d7b d;
    private List<yv9> e;
    private al8 f;
    private ai8 g;
    private boolean h;
    private BroadcastReceiver.PendingResult i;

    public j7c(@NonNull Context context, @NonNull a aVar, @NonNull d7b d7bVar) {
        this(context, aVar, d7bVar, context.getResources().getBoolean(bw8.workmanager_test_configuration));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
        if (defpackage.j7c.l != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
        defpackage.j7c.l = new defpackage.j7c(r4, r5, new defpackage.k7c(r5.l()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        defpackage.j7c.k = defpackage.j7c.l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull androidx.work.a r5) {
        /*
            java.lang.Object r0 = defpackage.j7c.m
            monitor-enter(r0)
            j7c r1 = defpackage.j7c.k     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            j7c r2 = defpackage.j7c.l     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L14
            throw r4     // Catch: java.lang.Throwable -> L14
        L14:
            r4 = move-exception
            goto L36
        L16:
            if (r1 != 0) goto L34
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            j7c r1 = defpackage.j7c.l     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L30
            j7c r1 = new j7c     // Catch: java.lang.Throwable -> L14
            k7c r2 = new k7c     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.Executor r3 = r5.l()     // Catch: java.lang.Throwable -> L14
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L14
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L14
            defpackage.j7c.l = r1     // Catch: java.lang.Throwable -> L14
        L30:
            j7c r4 = defpackage.j7c.l     // Catch: java.lang.Throwable -> L14
            defpackage.j7c.k = r4     // Catch: java.lang.Throwable -> L14
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j7c.j(android.content.Context, androidx.work.a):void");
    }

    @Deprecated
    public static j7c o() {
        synchronized (m) {
            try {
                j7c j7cVar = k;
                if (j7cVar != null) {
                    return j7cVar;
                }
                return l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public static j7c p(@NonNull Context context) {
        j7c o;
        synchronized (m) {
            try {
                o = o();
                if (o == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext instanceof a.c) {
                        j(applicationContext, ((a.c) applicationContext).a());
                        o = p(applicationContext);
                    } else {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o;
    }

    private void v(@NonNull Context context, @NonNull a aVar, @NonNull d7b d7bVar, @NonNull WorkDatabase workDatabase, @NonNull List<yv9> list, @NonNull al8 al8Var) {
        boolean isDeviceProtectedStorage;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = aVar;
        this.d = d7bVar;
        this.c = workDatabase;
        this.e = list;
        this.f = al8Var;
        this.g = new ai8(workDatabase);
        this.h = false;
        if (Build.VERSION.SDK_INT >= 24) {
            isDeviceProtectedStorage = applicationContext.isDeviceProtectedStorage();
            if (isDeviceProtectedStorage) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
        }
        this.d.b(new ForceStopRunnable(applicationContext, this));
    }

    public void A(@NonNull String str, WorkerParameters.a aVar) {
        this.d.b(new sta(this, str, aVar));
    }

    public void B(@NonNull String str) {
        this.d.b(new oxa(this, str, true));
    }

    public void C(@NonNull String str) {
        this.d.b(new oxa(this, str, false));
    }

    @Override // defpackage.h7c
    @NonNull
    public w6c b(@NonNull String str, @NonNull ym3 ym3Var, @NonNull List<aa7> list) {
        if (!list.isEmpty()) {
            return new x6c(this, str, ym3Var, list);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    @Override // defpackage.h7c
    @NonNull
    public ua7 c(@NonNull String str) {
        bn0 d = bn0.d(str, this);
        this.d.b(d);
        return d.e();
    }

    @Override // defpackage.h7c
    @NonNull
    public ua7 e(@NonNull List<? extends s7c> list) {
        if (!list.isEmpty()) {
            return new x6c(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @Override // defpackage.h7c
    @NonNull
    public ua7 g(@NonNull String str, @NonNull ym3 ym3Var, @NonNull List<aa7> list) {
        return new x6c(this, str, ym3Var, list).a();
    }

    @NonNull
    public ua7 k(@NonNull UUID uuid) {
        bn0 b = bn0.b(uuid, this);
        this.d.b(b);
        return b.e();
    }

    @NonNull
    public List<yv9> l(@NonNull Context context, @NonNull a aVar, @NonNull d7b d7bVar) {
        return Arrays.asList(ew9.a(context, this), new ki4(context, aVar, d7bVar, this));
    }

    @NonNull
    public Context m() {
        return this.a;
    }

    @NonNull
    public a n() {
        return this.b;
    }

    @NonNull
    public ai8 q() {
        return this.g;
    }

    @NonNull
    public al8 r() {
        return this.f;
    }

    @NonNull
    public List<yv9> s() {
        return this.e;
    }

    @NonNull
    public WorkDatabase t() {
        return this.c;
    }

    @NonNull
    public d7b u() {
        return this.d;
    }

    public void w() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        if (Build.VERSION.SDK_INT >= 23) {
            w4b.b(m());
        }
        t().M().k();
        ew9.b(n(), t(), s());
    }

    public void y(@NonNull BroadcastReceiver.PendingResult pendingResult) {
        synchronized (m) {
            try {
                this.i = pendingResult;
                if (this.h) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z(@NonNull String str) {
        A(str, null);
    }

    public j7c(@NonNull Context context, @NonNull a aVar, @NonNull d7b d7bVar, boolean z) {
        this(context, aVar, d7bVar, WorkDatabase.D(context.getApplicationContext(), d7bVar.c(), z));
    }

    public j7c(@NonNull Context context, @NonNull a aVar, @NonNull d7b d7bVar, @NonNull WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        nx5.e(new nx5.a(aVar.j()));
        List<yv9> l2 = l(applicationContext, aVar, d7bVar);
        v(context, aVar, d7bVar, workDatabase, l2, new al8(context, aVar, d7bVar, workDatabase, l2));
    }
}
