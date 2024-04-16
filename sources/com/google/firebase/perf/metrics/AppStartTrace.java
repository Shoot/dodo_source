package com.google.firebase.perf.metrics;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.lifecycle.d;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import defpackage.tmb;
import defpackage.wjb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, np5 {
    private static volatile AppStartTrace A;
    private static ExecutorService B;
    @NonNull
    private static final Timer y = new v91().a();
    private static final long z = TimeUnit.MINUTES.toMicros(1);
    private final jmb b;
    private final v91 c;
    private final com.google.firebase.perf.config.a d;
    private final wjb.b e;
    private Context f;
    private WeakReference<Activity> g;
    private WeakReference<Activity> h;
    private final Timer j;
    private final Timer k;
    private PerfSession t;
    private boolean a = false;
    private boolean i = false;
    private Timer l = null;
    private Timer m = null;
    private Timer n = null;
    private Timer o = null;
    private Timer p = null;
    private Timer q = null;
    private Timer r = null;
    private Timer s = null;
    private boolean u = false;
    private int v = 0;
    private final b w = new b();
    private boolean x = false;

    /* loaded from: classes2.dex */
    private final class b implements ViewTreeObserver.OnDrawListener {
        private b() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.i(AppStartTrace.this);
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements Runnable {
        private final AppStartTrace a;

        public c(AppStartTrace appStartTrace) {
            this.a = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.l == null) {
                this.a.u = true;
            }
        }
    }

    AppStartTrace(@NonNull jmb jmbVar, @NonNull v91 v91Var, @NonNull com.google.firebase.perf.config.a aVar, @NonNull ExecutorService executorService) {
        Timer timer;
        long startElapsedRealtime;
        this.b = jmbVar;
        this.c = v91Var;
        this.d = aVar;
        B = executorService;
        this.e = wjb.H0().S("_experiment_app_start_ttid");
        if (Build.VERSION.SDK_INT >= 24) {
            startElapsedRealtime = Process.getStartElapsedRealtime();
            timer = Timer.f(startElapsedRealtime);
        } else {
            timer = null;
        }
        this.j = timer;
        xta xtaVar = (xta) qv3.l().j(xta.class);
        this.k = xtaVar != null ? Timer.f(xtaVar.b()) : null;
    }

    static /* synthetic */ int i(AppStartTrace appStartTrace) {
        int i = appStartTrace.v;
        appStartTrace.v = i + 1;
        return i;
    }

    @NonNull
    private Timer j() {
        Timer timer = this.k;
        if (timer != null) {
            return timer;
        }
        return y;
    }

    public static AppStartTrace k() {
        if (A != null) {
            return A;
        }
        return l(jmb.k(), new v91());
    }

    @SuppressLint({"ThreadPoolCreation"})
    static AppStartTrace l(jmb jmbVar, v91 v91Var) {
        if (A == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (A == null) {
                        A = new AppStartTrace(jmbVar, v91Var, com.google.firebase.perf.config.a.g(), new ThreadPoolExecutor(0, 1, z + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } finally {
                }
            }
        }
        return A;
    }

    @NonNull
    private Timer m() {
        Timer timer = this.j;
        if (timer != null) {
            return timer;
        }
        return j();
    }

    public static boolean n(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            String packageName = context.getPackageName();
            String str = packageName + ":";
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(str))) {
                    if (Build.VERSION.SDK_INT >= 23 || o(context)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static boolean o(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return true;
        }
        return powerManager.isInteractive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(wjb.b bVar) {
        this.b.C(bVar.a(), tp.FOREGROUND_BACKGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        wjb.b R = wjb.H0().S(er1.APP_START_TRACE_NAME.toString()).Q(j().e()).R(j().d(this.n));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(wjb.H0().S(er1.ON_CREATE_TRACE_NAME.toString()).Q(j().e()).R(j().d(this.l)).a());
        if (this.m != null) {
            wjb.b H0 = wjb.H0();
            H0.S(er1.ON_START_TRACE_NAME.toString()).Q(this.l.e()).R(this.l.d(this.m));
            arrayList.add(H0.a());
            wjb.b H02 = wjb.H0();
            H02.S(er1.ON_RESUME_TRACE_NAME.toString()).Q(this.m.e()).R(this.m.d(this.n));
            arrayList.add(H02.a());
        }
        R.J(arrayList).K(this.t.a());
        this.b.C(R.a(), tp.FOREGROUND_BACKGROUND);
    }

    private void r(final wjb.b bVar) {
        if (this.q != null && this.r != null && this.s != null) {
            B.execute(new Runnable() { // from class: dp
                @Override // java.lang.Runnable
                public final void run() {
                    AppStartTrace.this.p(bVar);
                }
            });
            w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        String str;
        if (this.s != null) {
            return;
        }
        this.s = this.c.a();
        this.e.L(wjb.H0().S("_experiment_onDrawFoQ").Q(m().e()).R(m().d(this.s)).a());
        if (this.j != null) {
            this.e.L(wjb.H0().S("_experiment_procStart_to_classLoad").Q(m().e()).R(m().d(j())).a());
        }
        wjb.b bVar = this.e;
        if (this.x) {
            str = tmb.h.TRUE_JSON_NAME;
        } else {
            str = "false";
        }
        bVar.P("systemDeterminedForeground", str);
        this.e.O("onDrawCount", this.v);
        this.e.K(this.t.a());
        r(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (this.q != null) {
            return;
        }
        this.q = this.c.a();
        this.e.Q(m().e()).R(m().d(this.q));
        r(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (this.r != null) {
            return;
        }
        this.r = this.c.a();
        this.e.L(wjb.H0().S("_experiment_preDrawFoQ").Q(m().e()).R(m().d(this.r)).a());
        r(this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x000f, B:17:0x001d, B:19:0x003e), top: B:26:0x0001 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onActivityCreated(android.app.Activity r5, android.os.Bundle r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r6 = r4.u     // Catch: java.lang.Throwable -> L1a
            if (r6 != 0) goto L42
            com.google.firebase.perf.util.Timer r6 = r4.l     // Catch: java.lang.Throwable -> L1a
            if (r6 == 0) goto La
            goto L42
        La:
            boolean r6 = r4.x     // Catch: java.lang.Throwable -> L1a
            r0 = 1
            if (r6 != 0) goto L1c
            android.content.Context r6 = r4.f     // Catch: java.lang.Throwable -> L1a
            boolean r6 = n(r6)     // Catch: java.lang.Throwable -> L1a
            if (r6 == 0) goto L18
            goto L1c
        L18:
            r6 = 0
            goto L1d
        L1a:
            r5 = move-exception
            goto L44
        L1c:
            r6 = 1
        L1d:
            r4.x = r6     // Catch: java.lang.Throwable -> L1a
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L1a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            r4.g = r6     // Catch: java.lang.Throwable -> L1a
            v91 r5 = r4.c     // Catch: java.lang.Throwable -> L1a
            com.google.firebase.perf.util.Timer r5 = r5.a()     // Catch: java.lang.Throwable -> L1a
            r4.l = r5     // Catch: java.lang.Throwable -> L1a
            com.google.firebase.perf.util.Timer r5 = r4.m()     // Catch: java.lang.Throwable -> L1a
            com.google.firebase.perf.util.Timer r6 = r4.l     // Catch: java.lang.Throwable -> L1a
            long r5 = r5.d(r6)     // Catch: java.lang.Throwable -> L1a
            long r1 = com.google.firebase.perf.metrics.AppStartTrace.z     // Catch: java.lang.Throwable -> L1a
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L40
            r4.i = r0     // Catch: java.lang.Throwable -> L1a
        L40:
            monitor-exit(r4)
            return
        L42:
            monitor-exit(r4)
            return
        L44:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (!this.u && !this.i && this.d.h()) {
            activity.findViewById(16908290).getViewTreeObserver().removeOnDrawListener(this.w);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (!this.u && !this.i) {
                boolean h = this.d.h();
                if (h) {
                    View findViewById = activity.findViewById(16908290);
                    findViewById.getViewTreeObserver().addOnDrawListener(this.w);
                    my3.e(findViewById, new Runnable() { // from class: zo
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace.this.s();
                        }
                    });
                    jg8.a(findViewById, new Runnable() { // from class: ap
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace.this.t();
                        }
                    }, new Runnable() { // from class: bp
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace.this.u();
                        }
                    });
                }
                if (this.n != null) {
                    return;
                }
                this.h = new WeakReference<>(activity);
                this.n = this.c.a();
                this.t = SessionManager.getInstance().perfSession();
                sh e = sh.e();
                e.a("onResume(): " + activity.getClass().getName() + ": " + j().d(this.n) + " microseconds");
                B.execute(new Runnable() { // from class: cp
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.q();
                    }
                });
                if (!h) {
                    w();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.u && this.m == null && !this.i) {
            this.m = this.c.a();
        }
    }

    @j(d.a.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (!this.u && !this.i && this.p == null) {
            this.p = this.c.a();
            this.e.L(wjb.H0().S("_experiment_firstBackgrounding").Q(m().e()).R(m().d(this.p)).a());
        }
    }

    @j(d.a.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (!this.u && !this.i && this.o == null) {
            this.o = this.c.a();
            this.e.L(wjb.H0().S("_experiment_firstForegrounding").Q(m().e()).R(m().d(this.o)).a());
        }
    }

    public synchronized void v(@NonNull Context context) {
        boolean z2;
        try {
            if (this.a) {
                return;
            }
            l.l().getLifecycle().a(this);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                if (!this.x && !n(applicationContext)) {
                    z2 = false;
                    this.x = z2;
                    this.a = true;
                    this.f = applicationContext;
                }
                z2 = true;
                this.x = z2;
                this.a = true;
                this.f = applicationContext;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void w() {
        if (!this.a) {
            return;
        }
        l.l().getLifecycle().d(this);
        ((Application) this.f).unregisterActivityLifecycleCallbacks(this);
        this.a = false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
