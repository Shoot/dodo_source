package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class Trace extends jp implements Parcelable, aea {
    private final WeakReference<aea> a;
    private final Trace b;
    private final GaugeManager c;
    private final String d;
    private final Map<String, Counter> e;
    private final Map<String, String> f;
    private final List<PerfSession> g;
    private final List<Trace> h;
    private final jmb i;
    private final v91 j;
    private Timer k;
    private Timer l;
    private static final sh m = sh.e();
    private static final Map<String, Trace> n = new ConcurrentHashMap();
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new a();
    static final Parcelable.Creator<Trace> o = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<Trace> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Trace createFromParcel(@NonNull Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    /* loaded from: classes2.dex */
    class b implements Parcelable.Creator<Trace> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    /* synthetic */ Trace(Parcel parcel, boolean z, a aVar) {
        this(parcel, z);
    }

    private void b(@NonNull String str, @NonNull String str2) {
        if (!l()) {
            if (!this.f.containsKey(str) && this.f.size() >= 5) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
            }
            yx7.d(str, str2);
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.d));
    }

    @NonNull
    public static Trace c(@NonNull String str) {
        return new Trace(str);
    }

    @NonNull
    private Counter m(@NonNull String str) {
        Counter counter = this.e.get(str);
        if (counter == null) {
            Counter counter2 = new Counter(str);
            this.e.put(str, counter2);
            return counter2;
        }
        return counter;
    }

    private void n(Timer timer) {
        if (this.h.isEmpty()) {
            return;
        }
        Trace trace = this.h.get(this.h.size() - 1);
        if (trace.l == null) {
            trace.l = timer;
        }
    }

    @Override // defpackage.aea
    public void a(PerfSession perfSession) {
        if (perfSession == null) {
            m.j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (j() && !l()) {
            this.g.add(perfSession);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Map<String, Counter> d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Timer e() {
        return this.l;
    }

    @NonNull
    public String f() {
        return this.d;
    }

    protected void finalize() throws Throwable {
        try {
            if (k()) {
                m.k("Trace '%s' is started but not stopped when it is destructed!", this.d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<PerfSession> g() {
        List<PerfSession> unmodifiableList;
        synchronized (this.g) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.g) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return unmodifiableList;
    }

    @Keep
    public String getAttribute(@NonNull String str) {
        return this.f.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        Counter counter;
        if (str != null) {
            counter = this.e.get(str.trim());
        } else {
            counter = null;
        }
        if (counter == null) {
            return 0L;
        }
        return counter.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Timer h() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public List<Trace> i() {
        return this.h;
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j) {
        String e = yx7.e(str);
        if (e != null) {
            m.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, e);
        } else if (!j()) {
            m.k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.d);
        } else if (l()) {
            m.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.d);
        } else {
            Counter m2 = m(str.trim());
            m2.c(j);
            m.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(m2.a()), this.d);
        }
    }

    boolean j() {
        if (this.k != null) {
            return true;
        }
        return false;
    }

    boolean k() {
        if (j() && !l()) {
            return true;
        }
        return false;
    }

    boolean l() {
        if (this.l != null) {
            return true;
        }
        return false;
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            m.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.d);
            z = true;
        } catch (Exception e) {
            m.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
        }
        if (z) {
            this.f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j) {
        String e = yx7.e(str);
        if (e != null) {
            m.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, e);
        } else if (!j()) {
            m.k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.d);
        } else if (l()) {
            m.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.d);
        } else {
            m(str.trim()).d(j);
            m.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), this.d);
        }
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (l()) {
            m.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!com.google.firebase.perf.config.a.g().K()) {
            m.a("Trace feature is disabled.");
            return;
        }
        String f = yx7.f(this.d);
        if (f != null) {
            m.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.d, f);
        } else if (this.k != null) {
            m.d("Trace '%s' has already started, should not start again!", this.d);
        } else {
            this.k = this.j.a();
            registerForAppState();
            PerfSession perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.a);
            a(perfSession);
            if (perfSession.e()) {
                this.c.collectGaugeMetricOnce(perfSession.d());
            }
        }
    }

    @Keep
    public void stop() {
        if (!j()) {
            m.d("Trace '%s' has not been started so unable to stop!", this.d);
        } else if (l()) {
            m.d("Trace '%s' has already stopped, should not stop again!", this.d);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.a);
            unregisterForAppState();
            Timer a2 = this.j.a();
            this.l = a2;
            if (this.b == null) {
                n(a2);
                if (!this.d.isEmpty()) {
                    this.i.C(new com.google.firebase.perf.metrics.a(this).a(), getAppState());
                    if (SessionManager.getInstance().perfSession().e()) {
                        this.c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
                        return;
                    }
                    return;
                }
                m.c("Trace name is empty, no log is sent to server");
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.d);
        parcel.writeList(this.h);
        parcel.writeMap(this.e);
        parcel.writeParcelable(this.k, 0);
        parcel.writeParcelable(this.l, 0);
        synchronized (this.g) {
            parcel.writeList(this.g);
        }
    }

    private Trace(@NonNull String str) {
        this(str, jmb.k(), new v91(), gp.b(), GaugeManager.getInstance());
    }

    public Trace(@NonNull String str, @NonNull jmb jmbVar, @NonNull v91 v91Var, @NonNull gp gpVar) {
        this(str, jmbVar, v91Var, gpVar, GaugeManager.getInstance());
    }

    public Trace(@NonNull String str, @NonNull jmb jmbVar, @NonNull v91 v91Var, @NonNull gp gpVar, @NonNull GaugeManager gaugeManager) {
        super(gpVar);
        this.a = new WeakReference<>(this);
        this.b = null;
        this.d = str.trim();
        this.h = new ArrayList();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.j = v91Var;
        this.i = jmbVar;
        this.g = Collections.synchronizedList(new ArrayList());
        this.c = gaugeManager;
    }

    private Trace(@NonNull Parcel parcel, boolean z) {
        super(z ? null : gp.b());
        this.a = new WeakReference<>(this);
        this.b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.e = concurrentHashMap;
        this.f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.k = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.l = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List<PerfSession> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.g = synchronizedList;
        parcel.readList(synchronizedList, PerfSession.class.getClassLoader());
        if (z) {
            this.i = null;
            this.j = null;
            this.c = null;
            return;
        }
        this.i = jmb.k();
        this.j = new v91();
        this.c = GaugeManager.getInstance();
    }
}
