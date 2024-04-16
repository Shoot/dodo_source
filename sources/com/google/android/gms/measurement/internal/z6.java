package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.measurement.internal.w6;
import com.google.android.gms.measurement.internal.z6;
import com.google.android.gms.measurement.internal.zzmh;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import defpackage.tmb;
import im.threads.business.transport.PushMessageAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import kotlin.Unit;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class z6 extends x2 {
    protected f8 c;
    private i1d d;
    private final Set<h1d> e;
    private boolean f;
    private final AtomicReference<String> g;
    private final Object h;
    private boolean i;
    private PriorityQueue<zzmh> j;
    private w6 k;
    private final AtomicLong l;
    private long m;
    final lb n;
    private boolean o;
    private r p;
    private SharedPreferences.OnSharedPreferenceChangeListener q;
    private r r;
    private final ib s;

    /* JADX INFO: Access modifiers changed from: protected */
    public z6(u5 u5Var) {
        super(u5Var);
        this.e = new CopyOnWriteArraySet();
        this.h = new Object();
        this.i = false;
        this.o = true;
        this.s = new x7(this);
        this.g = new AtomicReference<>();
        this.k = w6.c;
        this.m = -1L;
        this.l = new AtomicLong(0L);
        this.n = new lb(u5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void L(z6 z6Var, w6 w6Var, long j, boolean z, boolean z2) {
        z6Var.l();
        z6Var.u();
        w6 K = z6Var.g().K();
        if (j <= z6Var.m && w6.k(K.b(), w6Var.b())) {
            z6Var.n().I().b("Dropped out-of-date consent setting, proposed settings", w6Var);
        } else if (z6Var.g().z(w6Var)) {
            z6Var.m = j;
            z6Var.s().T(z);
            if (z2) {
                z6Var.s().J(new AtomicReference<>());
            }
        } else {
            z6Var.n().I().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(w6Var.b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void M(z6 z6Var, w6 w6Var, w6 w6Var2) {
        w6.a aVar = w6.a.ANALYTICS_STORAGE;
        w6.a aVar2 = w6.a.AD_STORAGE;
        boolean m = w6Var.m(w6Var2, aVar, aVar2);
        boolean r = w6Var.r(w6Var2, aVar, aVar2);
        if (m || r) {
            z6Var.o().H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(Boolean bool, boolean z) {
        l();
        u();
        n().E().b("Setting app measurement enabled (FE)", bool);
        g().u(bool);
        if (z) {
            g().C(bool);
        }
        if (this.a.p() || (bool != null && !bool.booleanValue())) {
            v0();
        }
    }

    private final void U(String str, String str2, long j, Object obj) {
        k().C(new o7(this, str, str2, obj, j));
    }

    @TargetApi(30)
    private final PriorityQueue<zzmh> u0() {
        Comparator comparing;
        if (this.j == null) {
            o1d.a();
            comparing = Comparator.comparing(new Function() { // from class: l1d
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((zzmh) obj).b);
                }
            }, new Comparator() { // from class: q1d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            });
            this.j = n1d.a(comparing);
        }
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0() {
        long j;
        l();
        String a = g().o.a();
        if (a != null) {
            if ("unset".equals(a)) {
                Y("app", "_npa", null, b().currentTimeMillis());
            } else {
                if (tmb.h.TRUE_JSON_NAME.equals(a)) {
                    j = 1;
                } else {
                    j = 0;
                }
                Y("app", "_npa", Long.valueOf(j), b().currentTimeMillis());
            }
        }
        if (this.a.o() && this.o) {
            n().E().a("Recording app launch after enabling measurement for the first time (FE)");
            n0();
            if (z6d.a() && a().s(b0.n0)) {
                t().e.a();
            }
            k().C(new k7(this));
            return;
        }
        n().E().a("Updating Scion state (FE)");
        s().a0();
    }

    private final void y0(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        k().C(new p7(this, str, str2, j, jb.C(bundle), z, z2, z3, str3));
    }

    public final void A0(h1d h1dVar) {
        u();
        gh8.j(h1dVar);
        if (!this.e.remove(h1dVar)) {
            n().K().a("OnEventListener had not been registered");
        }
    }

    public final ArrayList<Bundle> B(String str, String str2) {
        if (k().I()) {
            n().F().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (c.a()) {
            n().F().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.a.k().u(atomicReference, 5000L, "get conditional user properties", new w7(this, atomicReference, null, str, str2));
            List list = (List) atomicReference.get();
            if (list == null) {
                n().F().b("Timed out waiting for get conditional user properties", null);
                return new ArrayList<>();
            }
            return jb.s0(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B0(String str, String str2, Bundle bundle) {
        l();
        S(str, str2, b().currentTimeMillis(), bundle);
    }

    public final Map<String, Object> C(String str, String str2, boolean z) {
        if (k().I()) {
            n().F().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (c.a()) {
            n().F().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.a.k().u(atomicReference, 5000L, "get user properties", new v7(this, atomicReference, null, str, str2, z));
            List<zznb> list = (List) atomicReference.get();
            if (list == null) {
                n().F().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            lr lrVar = new lr(list.size());
            for (zznb zznbVar : list) {
                Object h = zznbVar.h();
                if (h != null) {
                    lrVar.put(zznbVar.b, h);
                }
            }
            return lrVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D(long j, boolean z) {
        l();
        u();
        n().E().a("Resetting analytics data (FE)");
        ea t = t();
        t.l();
        t.f.b();
        if (s8d.a() && a().s(b0.s0)) {
            o().H();
        }
        boolean o = this.a.o();
        w4 g = g();
        g.g.b(j);
        if (!TextUtils.isEmpty(g.g().x.a())) {
            g.x.b(null);
        }
        if (z6d.a() && g.a().s(b0.n0)) {
            g.r.b(0L);
        }
        g.s.b(0L);
        if (!g.a().R()) {
            g.E(!o);
        }
        g.y.b(null);
        g.z.b(0L);
        g.A.b(null);
        if (z) {
            s().Z();
        }
        if (z6d.a() && a().s(b0.n0)) {
            t().e.a();
        }
        this.o = !o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void E(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            ((r) gh8.j(this.r)).b(500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void F(Bundle bundle) {
        if (bundle == null) {
            g().A.b(new Bundle());
            return;
        }
        Bundle a = g().A.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                h();
                if (jb.g0(obj)) {
                    h();
                    jb.Q(this.s, 27, null, null, 0);
                }
                n().L().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (jb.G0(str)) {
                n().L().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a.remove(str);
            } else if (h().k0(RemoteMessageConst.MessageBody.PARAM, str, a().q(null, false), obj)) {
                h().N(a, str, obj);
            }
        }
        h();
        if (jb.f0(a, a().F())) {
            h();
            jb.Q(this.s, 26, null, null, 0);
            n().L().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        g().A.b(a);
        s().B(a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(Bundle bundle, int i, long j) {
        String str;
        u();
        String i2 = w6.i(bundle);
        if (i2 != null) {
            n().L().b("Ignoring invalid consent setting", i2);
            n().L().a("Valid consent values are 'granted', 'denied'");
        }
        w6 c = w6.c(bundle, i);
        if (y5d.a() && a().s(b0.P0)) {
            if (c.z()) {
                K(c, j);
            }
            t b = t.b(bundle, i);
            if (b.j()) {
                I(b);
            }
            Boolean d = t.d(bundle);
            if (d != null) {
                if (i == -30) {
                    str = "tcf";
                } else {
                    str = "app";
                }
                Z(str, "allow_personalized_ads", d.toString(), false);
                return;
            }
            return;
        }
        K(c, j);
    }

    public final void H(Bundle bundle, long j) {
        gh8.j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(HiAnalyticsConstant.BI_KEY_APP_ID))) {
            n().K().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(HiAnalyticsConstant.BI_KEY_APP_ID);
        gh8.j(bundle2);
        b1d.a(bundle2, HiAnalyticsConstant.BI_KEY_APP_ID, String.class, null);
        b1d.a(bundle2, PushMessageAttributes.ORIGIN, String.class, null);
        b1d.a(bundle2, Action.NAME_ATTRIBUTE, String.class, null);
        b1d.a(bundle2, "value", Object.class, null);
        b1d.a(bundle2, "trigger_event_name", String.class, null);
        b1d.a(bundle2, "trigger_timeout", Long.class, 0L);
        b1d.a(bundle2, "timed_out_event_name", String.class, null);
        b1d.a(bundle2, "timed_out_event_params", Bundle.class, null);
        b1d.a(bundle2, "triggered_event_name", String.class, null);
        b1d.a(bundle2, "triggered_event_params", Bundle.class, null);
        b1d.a(bundle2, "time_to_live", Long.class, 0L);
        b1d.a(bundle2, "expired_event_name", String.class, null);
        b1d.a(bundle2, "expired_event_params", Bundle.class, null);
        gh8.f(bundle2.getString(Action.NAME_ATTRIBUTE));
        gh8.f(bundle2.getString(PushMessageAttributes.ORIGIN));
        gh8.j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString(Action.NAME_ATTRIBUTE);
        Object obj = bundle2.get("value");
        if (h().q0(string) != 0) {
            n().F().b("Invalid conditional user property name", f().g(string));
        } else if (h().v(string, obj) != 0) {
            n().F().c("Invalid conditional user property value", f().g(string), obj);
        } else {
            Object z0 = h().z0(string, obj);
            if (z0 == null) {
                n().F().c("Unable to normalize conditional user property value", f().g(string), obj);
                return;
            }
            b1d.b(bundle2, z0);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
                n().F().c("Invalid conditional user property timeout", f().g(string), Long.valueOf(j2));
                return;
            }
            long j3 = bundle2.getLong("time_to_live");
            if (j3 <= 15552000000L && j3 >= 1) {
                k().C(new u7(this, bundle2));
            } else {
                n().F().c("Invalid conditional user property time to live", f().g(string), Long.valueOf(j3));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I(t tVar) {
        k().C(new e8(this, tVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(w6 w6Var) {
        boolean z;
        l();
        if ((w6Var.y() && w6Var.x()) || s().d0()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.a.p()) {
            this.a.v(z);
            Boolean M = g().M();
            if (!z || M == null || M.booleanValue()) {
                Q(Boolean.valueOf(z), false);
            }
        }
    }

    public final void K(w6 w6Var, long j) {
        w6 w6Var2;
        boolean z;
        w6 w6Var3;
        boolean z2;
        boolean z3;
        u();
        int b = w6Var.b();
        if (b != -10 && w6Var.s() == null && w6Var.u() == null) {
            n().L().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.h) {
            try {
                w6Var2 = this.k;
                z = false;
                if (w6.k(b, w6Var2.b())) {
                    z3 = w6Var.t(this.k);
                    if (w6Var.y() && !this.k.y()) {
                        z = true;
                    }
                    w6 p = w6Var.p(this.k);
                    this.k = p;
                    w6Var3 = p;
                    z2 = z;
                    z = true;
                } else {
                    w6Var3 = w6Var;
                    z2 = false;
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            n().I().b("Ignoring lower-priority consent settings, proposed settings", w6Var3);
            return;
        }
        long andIncrement = this.l.getAndIncrement();
        if (z3) {
            R(null);
            k().F(new d8(this, w6Var3, j, andIncrement, z2, w6Var2));
            return;
        }
        g8 g8Var = new g8(this, w6Var3, andIncrement, z2, w6Var2);
        if (b != 30 && b != -10) {
            k().C(g8Var);
        } else {
            k().F(g8Var);
        }
    }

    public final void P(Boolean bool) {
        u();
        k().C(new b8(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R(String str) {
        this.g.set(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void S(String str, String str2, long j, Bundle bundle) {
        boolean z;
        l();
        if (this.d != null && !jb.G0(str2)) {
            z = false;
        } else {
            z = true;
        }
        T(str, str2, j, bundle, true, z, true, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void T(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        boolean b;
        String str4;
        long j2;
        String str5;
        String str6;
        Class<?> cls;
        gh8.f(str);
        gh8.j(bundle);
        l();
        u();
        if (!this.a.o()) {
            n().E().a("Event not sent since app measurement is disabled");
            return;
        }
        List<String> G = o().G();
        if (G != null && !G.contains(str2)) {
            n().E().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        int i = 0;
        if (!this.f) {
            this.f = true;
            try {
                if (!this.a.s()) {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader());
                } else {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                }
                try {
                    cls.getDeclaredMethod("initialize", Context.class).invoke(null, zza());
                } catch (Exception e) {
                    n().K().b("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                n().I().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2)) {
            if (bundle.containsKey("gclid")) {
                Y("auto", "_lgclid", bundle.getString("gclid"), b().currentTimeMillis());
            }
            if (a7d.a() && a().s(b0.W0) && bundle.containsKey("gbraid")) {
                Y("auto", "_gbraid", bundle.getString("gbraid"), b().currentTimeMillis());
            }
        }
        if (z && jb.K0(str2)) {
            h().M(bundle, g().A.a());
        }
        if (!z3 && !"_iap".equals(str2)) {
            jb K = this.a.K();
            int i2 = 2;
            if (K.B0("event", str2)) {
                if (!K.o0("event", d1d.a, d1d.b, str2)) {
                    i2 = 13;
                } else if (K.i0("event", 40, str2)) {
                    i2 = 0;
                }
            }
            if (i2 != 0) {
                n().G().b("Invalid public event name. Event will not be logged (FE)", f().c(str2));
                this.a.K();
                String I = jb.I(str2, 40, true);
                if (str2 != null) {
                    i = str2.length();
                }
                this.a.K();
                jb.Q(this.s, i2, "_ev", I, i);
                return;
            }
        }
        p8 B = r().B(false);
        if (B != null && !bundle.containsKey("_sc")) {
            B.d = true;
        }
        if (z && !z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        jb.P(B, bundle, z4);
        boolean equals = "am".equals(str);
        boolean G0 = jb.G0(str2);
        if (z && this.d != null && !G0 && !equals) {
            n().E().c("Passing event to registered event handler (FE)", f().c(str2), f().a(bundle));
            gh8.j(this.d);
            this.d.a(str, str2, bundle, j);
        } else if (this.a.r()) {
            int u = h().u(str2);
            if (u != 0) {
                n().G().b("Invalid event name. Event will not be logged (FE)", f().c(str2));
                h();
                String I2 = jb.I(str2, 40, true);
                if (str2 != null) {
                    i = str2.length();
                }
                this.a.K();
                jb.R(this.s, str3, u, "_ev", I2, i);
                return;
            }
            Bundle E = h().E(str3, str2, bundle, gc1.c("_o", "_sn", "_sc", "_si"), z3);
            gh8.j(E);
            if (r().B(false) != null && "_ae".equals(str2)) {
                la laVar = t().f;
                long b2 = laVar.d.b().b();
                long j3 = b2 - laVar.b;
                laVar.b = b2;
                if (j3 > 0) {
                    h().L(E, j3);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                jb h = h();
                String string = E.getString("_ffr");
                if (b0b.a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, h.g().x.a())) {
                    h.n().E().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                h.g().x.b(string);
            } else if ("_ae".equals(str2)) {
                String a = h().g().x.a();
                if (!TextUtils.isEmpty(a)) {
                    E.putString("_ffr", a);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(E);
            if (a().s(b0.N0)) {
                b = t().E();
            } else {
                b = g().u.b();
            }
            if (g().r.a() <= 0 || !g().x(j) || !b) {
                str4 = "_ae";
                j2 = 0;
            } else {
                n().J().a("Current session is expired, remove the session number, ID, and engagement time");
                j2 = 0;
                str4 = "_ae";
                Y("auto", "_sid", null, b().currentTimeMillis());
                Y("auto", "_sno", null, b().currentTimeMillis());
                Y("auto", "_se", null, b().currentTimeMillis());
                g().s.b(0L);
            }
            if (E.getLong("extend_session", j2) == 1) {
                n().J().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.a.J().e.b(j, true);
            }
            ArrayList arrayList2 = new ArrayList(E.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                String str7 = (String) obj;
                if (str7 != null) {
                    h();
                    Bundle[] w0 = jb.w0(E.get(str7));
                    if (w0 != null) {
                        E.putParcelableArray(str7, w0);
                    }
                }
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                Bundle bundle2 = (Bundle) arrayList.get(i4);
                if (i4 != 0) {
                    str6 = "_ep";
                    str5 = str;
                } else {
                    str5 = str;
                    str6 = str2;
                }
                bundle2.putString("_o", str5);
                if (z2) {
                    bundle2 = h().D(bundle2, null);
                }
                Bundle bundle3 = bundle2;
                s().D(new zzbe(str6, new zzaz(bundle3), str, j), str3);
                if (!equals) {
                    for (h1d h1dVar : this.e) {
                        h1dVar.a(str, str2, new Bundle(bundle3), j);
                    }
                }
            }
            if (r().B(false) != null && str4.equals(str2)) {
                t().D(true, true, b().b());
            }
        }
    }

    public final void V(String str, String str2, Bundle bundle) {
        long currentTimeMillis = b().currentTimeMillis();
        gh8.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(Action.NAME_ATTRIBUTE, str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        k().C(new t7(this, bundle2));
    }

    public final void W(String str, String str2, Bundle bundle, String str3) {
        j();
        y0(str, str2, b().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void X(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3;
        Bundle bundle2;
        boolean z3;
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (Objects.equals(str2, "screen_view")) {
            r().H(bundle2, j);
            return;
        }
        if (z2 && this.d != null && !jb.G0(str2)) {
            z3 = false;
        } else {
            z3 = true;
        }
        y0(str3, str2, j, bundle2, z2, z3, z, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            defpackage.gh8.f(r9)
            defpackage.gh8.f(r10)
            r8.l()
            r8.u()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L60
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L51
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L51
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.w4 r0 = r8.g()
            com.google.android.gms.measurement.internal.c5 r0 = r0.o
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L4b
            java.lang.String r11 = "true"
        L4b:
            r0.b(r11)
            r6 = r10
        L4f:
            r3 = r1
            goto L62
        L51:
            if (r11 != 0) goto L60
            com.google.android.gms.measurement.internal.w4 r10 = r8.g()
            com.google.android.gms.measurement.internal.c5 r10 = r10.o
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
            goto L4f
        L60:
            r3 = r10
            r6 = r11
        L62:
            com.google.android.gms.measurement.internal.u5 r10 = r8.a
            boolean r10 = r10.o()
            if (r10 != 0) goto L78
            com.google.android.gms.measurement.internal.k4 r9 = r8.n()
            com.google.android.gms.measurement.internal.m4 r9 = r9.J()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L78:
            com.google.android.gms.measurement.internal.u5 r10 = r8.a
            boolean r10 = r10.r()
            if (r10 != 0) goto L81
            return
        L81:
            com.google.android.gms.measurement.internal.zznb r10 = new com.google.android.gms.measurement.internal.zznb
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.x8 r9 = r8.s()
            r9.H(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.z6.Y(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void Z(String str, String str2, Object obj, boolean z) {
        a0(str, str2, obj, z, b().currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ g a() {
        return super.a();
    }

    public final void a0(String str, String str2, Object obj, boolean z, long j) {
        int i;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i2 = 0;
        if (z) {
            i = h().q0(str2);
        } else {
            jb h = h();
            if (h.B0("user property", str2)) {
                if (!h.n0("user property", f1d.a, str2)) {
                    i = 15;
                } else if (h.i0("user property", 24, str2)) {
                    i = 0;
                }
            }
            i = 6;
        }
        if (i != 0) {
            h();
            String I = jb.I(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.a.K();
            jb.Q(this.s, i, "_ev", I, i2);
        } else if (obj != null) {
            int v = h().v(str2, obj);
            if (v != 0) {
                h();
                String I2 = jb.I(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.a.K();
                jb.Q(this.s, v, "_ev", I2, i2);
                return;
            }
            Object z0 = h().z0(str2, obj);
            if (z0 != null) {
                U(str3, str2, j, z0);
            }
        } else {
            U(str3, str2, j, null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ t91 b() {
        return super.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b0(List list) {
        boolean contains;
        l();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> I = g().I();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzmh zzmhVar = (zzmh) it.next();
                contains = I.contains(zzmhVar.c);
                if (!contains || I.get(zzmhVar.c).longValue() < zzmhVar.b) {
                    u0().add(zzmhVar);
                }
            }
            s0();
        }
    }

    public final void c0(h1d h1dVar) {
        u();
        gh8.j(h1dVar);
        if (!this.e.add(h1dVar)) {
            n().K().a("OnEventListener already registered");
        }
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ c d() {
        return super.d();
    }

    public final void d0(i1d i1dVar) {
        i1d i1dVar2;
        boolean z;
        l();
        u();
        if (i1dVar != null && i1dVar != (i1dVar2 = this.d)) {
            if (i1dVar2 == null) {
                z = true;
            } else {
                z = false;
            }
            gh8.n(z, "EventInterceptor already set.");
        }
        this.d = i1dVar;
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w e() {
        return super.e();
    }

    public final Boolean e0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) k().u(atomicReference, 15000L, "boolean test flag value", new g7(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ j4 f() {
        return super.f();
    }

    public final Double f0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) k().u(atomicReference, 15000L, "double test flag value", new c8(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w4 g() {
        return super.g();
    }

    public final Integer g0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) k().u(atomicReference, 15000L, "int test flag value", new z7(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ jb h() {
        return super.h();
    }

    public final Long h0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) k().u(atomicReference, 15000L, "long test flag value", new a8(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.y3, com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final String i0() {
        return this.g.get();
    }

    @Override // com.google.android.gms.measurement.internal.y3, com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final String j0() {
        p8 O = this.a.H().O();
        if (O != null) {
            return O.b;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ o5 k() {
        return super.k();
    }

    public final String k0() {
        p8 O = this.a.H().O();
        if (O != null) {
            return O.a;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.y3, com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final String l0() {
        if (this.a.L() != null) {
            return this.a.L();
        }
        try {
            return new kzc(zza(), this.a.O()).b("google_app_id");
        } catch (IllegalStateException e) {
            this.a.n().F().b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ x m() {
        return super.m();
    }

    public final String m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) k().u(atomicReference, 15000L, "String test flag value", new s7(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ k4 n() {
        return super.n();
    }

    public final void n0() {
        l();
        u();
        if (!this.a.r()) {
            return;
        }
        Boolean B = a().B("google_analytics_deferred_deep_link_enabled");
        if (B != null && B.booleanValue()) {
            n().E().a("Deferred Deep Link feature enabled.");
            k().C(new Runnable() { // from class: r1d
                @Override // java.lang.Runnable
                public final void run() {
                    z6.this.q0();
                }
            });
        }
        s().W();
        this.o = false;
        String O = g().O();
        if (!TextUtils.isEmpty(O)) {
            e().o();
            if (!O.equals(Build.VERSION.RELEASE)) {
                Bundle bundle = new Bundle();
                bundle.putString("_po", O);
                B0("auto", "_ou", bundle);
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ f4 o() {
        return super.o();
    }

    public final void o0() {
        if ((zza().getApplicationContext() instanceof Application) && this.c != null) {
            ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
        }
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ i4 p() {
        return super.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p0() {
        if (g8d.a() && a().s(b0.I0)) {
            if (k().I()) {
                n().F().a("Cannot get trigger URIs from analytics worker thread");
            } else if (c.a()) {
                n().F().a("Cannot get trigger URIs from main thread");
            } else {
                u();
                n().J().a("Getting trigger URIs (FE)");
                final AtomicReference atomicReference = new AtomicReference();
                k().u(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.a7
                    @Override // java.lang.Runnable
                    public final void run() {
                        z6 z6Var = z6.this;
                        AtomicReference<List<zzmh>> atomicReference2 = atomicReference;
                        Bundle a = z6Var.g().p.a();
                        x8 s = z6Var.s();
                        if (a == null) {
                            a = new Bundle();
                        }
                        s.K(atomicReference2, a);
                    }
                });
                final List list = (List) atomicReference.get();
                if (list == null) {
                    n().F().a("Timed out waiting for get trigger URIs");
                } else {
                    k().C(new Runnable() { // from class: com.google.android.gms.measurement.internal.c7
                        @Override // java.lang.Runnable
                        public final void run() {
                            z6.this.b0(list);
                        }
                    });
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ z6 q() {
        return super.q();
    }

    public final void q0() {
        l();
        if (g().v.b()) {
            n().E().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a = g().w.a();
        g().w.b(1 + a);
        if (a >= 5) {
            n().K().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            g().v.a(true);
        } else if (y5d.a() && a().s(b0.R0)) {
            if (this.p == null) {
                this.p = new q7(this, this.a);
            }
            this.p.b(0L);
        } else {
            this.a.t();
        }
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ o8 r() {
        return super.r();
    }

    public final void r0() {
        boolean booleanValue;
        l();
        n().E().a("Handle tcf update.");
        SharedPreferences F = g().F();
        Boolean B = a().B(" google_analytics_tcf_data_enabled");
        if (B == null) {
            booleanValue = true;
        } else {
            booleanValue = B.booleanValue();
        }
        ma c = ma.c(F, booleanValue);
        if (g().A(c)) {
            Bundle b = c.b();
            if (b != Bundle.EMPTY) {
                G(b, -30, b().currentTimeMillis());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", c.e());
            B0("auto", "_tcf", bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ x8 s() {
        return super.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(30)
    public final void s0() {
        zzmh poll;
        jc6 P0;
        l();
        if (u0().isEmpty() || this.i || (poll = u0().poll()) == null || (P0 = h().P0()) == null) {
            return;
        }
        this.i = true;
        n().J().b("Registering trigger URI", poll.a);
        kr5<Unit> c = P0.c(Uri.parse(poll.a));
        if (c == null) {
            this.i = false;
            u0().add(poll);
            return;
        }
        SparseArray<Long> I = g().I();
        I.put(poll.c, Long.valueOf(poll.b));
        w4 g = g();
        int[] iArr = new int[I.size()];
        long[] jArr = new long[I.size()];
        for (int i = 0; i < I.size(); i++) {
            iArr[i] = I.keyAt(i);
            jArr[i] = I.valueAt(i).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        g.p.b(bundle);
        t94.a(c, new h7(this, poll), new j7(this));
    }

    @Override // com.google.android.gms.measurement.internal.y3
    public final /* bridge */ /* synthetic */ ea t() {
        return super.t();
    }

    public final void t0() {
        l();
        n().E().a("Register tcfPrefChangeListener.");
        if (this.q == null) {
            this.r = new m7(this, this.a);
            this.q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.f7
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    z6.this.E(sharedPreferences, str);
                }
            };
        }
        g().F().registerOnSharedPreferenceChangeListener(this.q);
    }

    public final void w0(Bundle bundle) {
        H(bundle, b().currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.x2
    protected final boolean z() {
        return false;
    }

    public final void z0(String str, String str2, Bundle bundle) {
        X(str, str2, bundle, true, true, b().currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
