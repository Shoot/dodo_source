package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.d;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import defpackage.f74;
import defpackage.wjb;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: AppStateMonitor.java */
/* renamed from: gp  reason: default package */
/* loaded from: classes2.dex */
public class gp implements Application.ActivityLifecycleCallbacks {
    private static final sh r = sh.e();
    private static volatile gp s;
    private final WeakHashMap<Activity, Boolean> a;
    private final WeakHashMap<Activity, g74> b;
    private final WeakHashMap<Activity, t64> c;
    private final WeakHashMap<Activity, Trace> d;
    private final Map<String, Long> e;
    private final Set<WeakReference<b>> f;
    private Set<a> g;
    private final AtomicInteger h;
    private final jmb i;
    private final com.google.firebase.perf.config.a j;
    private final v91 k;
    private final boolean l;
    private Timer m;
    private Timer n;
    private tp o;
    private boolean p;
    private boolean q;

    /* compiled from: AppStateMonitor.java */
    /* renamed from: gp$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    /* compiled from: AppStateMonitor.java */
    /* renamed from: gp$b */
    /* loaded from: classes2.dex */
    public interface b {
        void onUpdateAppState(tp tpVar);
    }

    gp(jmb jmbVar, v91 v91Var) {
        this(jmbVar, v91Var, com.google.firebase.perf.config.a.g(), g());
    }

    public static gp b() {
        if (s == null) {
            synchronized (gp.class) {
                try {
                    if (s == null) {
                        s = new gp(jmb.k(), new v91());
                    }
                } finally {
                }
            }
        }
        return s;
    }

    public static String c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    private static boolean g() {
        return g74.a();
    }

    private void l() {
        synchronized (this.g) {
            try {
                for (a aVar : this.g) {
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void m(Activity activity) {
        Trace trace = this.d.get(activity);
        if (trace == null) {
            return;
        }
        this.d.remove(activity);
        qb7<f74.a> e = this.b.get(activity).e();
        if (!e.d()) {
            r.k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
            return;
        }
        hx9.a(trace, e.c());
        trace.stop();
    }

    private void n(String str, Timer timer, Timer timer2) {
        if (!this.j.K()) {
            return;
        }
        wjb.b K = wjb.H0().S(str).Q(timer.e()).R(timer.d(timer2)).K(SessionManager.getInstance().perfSession().a());
        int andSet = this.h.getAndSet(0);
        synchronized (this.e) {
            try {
                K.M(this.e);
                if (andSet != 0) {
                    K.O(dr1.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                }
                this.e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i.C(K.a(), tp.FOREGROUND_BACKGROUND);
    }

    private void o(Activity activity) {
        if (h() && this.j.K()) {
            g74 g74Var = new g74(activity);
            this.b.put(activity, g74Var);
            if (activity instanceof d) {
                t64 t64Var = new t64(this.k, this.i, this, g74Var);
                this.c.put(activity, t64Var);
                ((d) activity).getSupportFragmentManager().o1(t64Var, true);
            }
        }
    }

    private void q(tp tpVar) {
        this.o = tpVar;
        synchronized (this.f) {
            try {
                Iterator<WeakReference<b>> it = this.f.iterator();
                while (it.hasNext()) {
                    b bVar = it.next().get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.o);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public tp a() {
        return this.o;
    }

    public void d(@NonNull String str, long j) {
        synchronized (this.e) {
            try {
                Long l = this.e.get(str);
                if (l == null) {
                    this.e.put(str, Long.valueOf(j));
                } else {
                    this.e.put(str, Long.valueOf(l.longValue() + j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(int i) {
        this.h.addAndGet(i);
    }

    public boolean f() {
        return this.q;
    }

    protected boolean h() {
        return this.l;
    }

    public synchronized void i(Context context) {
        if (this.p) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.p = true;
        }
    }

    public void j(a aVar) {
        synchronized (this.g) {
            this.g.add(aVar);
        }
    }

    public void k(WeakReference<b> weakReference) {
        synchronized (this.f) {
            this.f.add(weakReference);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        o(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.b.remove(activity);
        if (this.c.containsKey(activity)) {
            ((d) activity).getSupportFragmentManager().H1(this.c.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.a.isEmpty()) {
                this.m = this.k.a();
                this.a.put(activity, Boolean.TRUE);
                if (this.q) {
                    q(tp.FOREGROUND);
                    l();
                    this.q = false;
                } else {
                    n(er1.BACKGROUND_TRACE_NAME.toString(), this.n, this.m);
                    q(tp.FOREGROUND);
                }
            } else {
                this.a.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (h() && this.j.K()) {
                if (!this.b.containsKey(activity)) {
                    o(activity);
                }
                this.b.get(activity).c();
                Trace trace = new Trace(c(activity), this.i, this.k, this);
                trace.start();
                this.d.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        try {
            if (h()) {
                m(activity);
            }
            if (this.a.containsKey(activity)) {
                this.a.remove(activity);
                if (this.a.isEmpty()) {
                    this.n = this.k.a();
                    n(er1.FOREGROUND_TRACE_NAME.toString(), this.m, this.n);
                    q(tp.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void p(WeakReference<b> weakReference) {
        synchronized (this.f) {
            this.f.remove(weakReference);
        }
    }

    gp(jmb jmbVar, v91 v91Var, com.google.firebase.perf.config.a aVar, boolean z) {
        this.a = new WeakHashMap<>();
        this.b = new WeakHashMap<>();
        this.c = new WeakHashMap<>();
        this.d = new WeakHashMap<>();
        this.e = new HashMap();
        this.f = new HashSet();
        this.g = new HashSet();
        this.h = new AtomicInteger(0);
        this.o = tp.BACKGROUND;
        this.p = false;
        this.q = true;
        this.i = jmbVar;
        this.k = v91Var;
        this.j = aVar;
        this.l = z;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
