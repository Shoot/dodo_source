package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.p;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.measurement.internal.g5;
import com.google.android.gms.measurement.internal.w6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class g5 extends ua implements i {
    private final Map<String, Map<String, String>> d;
    private final Map<String, Set<String>> e;
    private final Map<String, Map<String, Boolean>> f;
    private final Map<String, Map<String, Boolean>> g;
    private final Map<String, com.google.android.gms.internal.measurement.p> h;
    private final Map<String, Map<String, Integer>> i;
    final j36<String, gqc> j;
    final fbd k;
    private final Map<String, String> l;
    private final Map<String, String> m;
    private final Map<String, String> n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g5(va vaVar) {
        super(vaVar);
        this.d = new lr();
        this.e = new lr();
        this.f = new lr();
        this.g = new lr();
        this.h = new lr();
        this.l = new lr();
        this.m = new lr();
        this.n = new lr();
        this.i = new lr();
        this.j = new l5(this, 20);
        this.k = new k5(this);
    }

    private static Map<String, String> B(com.google.android.gms.internal.measurement.p pVar) {
        lr lrVar = new lr();
        if (pVar != null) {
            for (com.google.android.gms.internal.measurement.s sVar : pVar.Y()) {
                lrVar.put(sVar.I(), sVar.J());
            }
        }
        return lrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ gqc D(g5 g5Var, String str) {
        g5Var.t();
        gh8.f(str);
        if (!g5Var.V(str)) {
            return null;
        }
        if (g5Var.h.containsKey(str) && g5Var.h.get(str) != null) {
            g5Var.F(str, g5Var.h.get(str));
        } else {
            g5Var.f0(str);
        }
        return g5Var.j.i().get(str);
    }

    private final void E(String str, p.a aVar) {
        HashSet hashSet = new HashSet();
        lr lrVar = new lr();
        lr lrVar2 = new lr();
        lr lrVar3 = new lr();
        if (aVar != null) {
            for (com.google.android.gms.internal.measurement.n nVar : aVar.A()) {
                hashSet.add(nVar.I());
            }
            for (int i = 0; i < aVar.s(); i++) {
                o.a z = aVar.t(i).z();
                if (z.v().isEmpty()) {
                    n().K().a("EventConfig contained null event name");
                } else {
                    String v = z.v();
                    String b = d1d.b(z.v());
                    if (!TextUtils.isEmpty(b)) {
                        z = z.t(b);
                        aVar.v(i, z);
                    }
                    if (z.z() && z.w()) {
                        lrVar.put(v, Boolean.TRUE);
                    }
                    if (z.A() && z.y()) {
                        lrVar2.put(z.v(), Boolean.TRUE);
                    }
                    if (z.B()) {
                        if (z.s() >= 2 && z.s() <= 65535) {
                            lrVar3.put(z.v(), Integer.valueOf(z.s()));
                        } else {
                            n().K().c("Invalid sampling rate. Event name, sample rate", z.v(), Integer.valueOf(z.s()));
                        }
                    }
                }
            }
        }
        this.e.put(str, hashSet);
        this.f.put(str, lrVar);
        this.g.put(str, lrVar2);
        this.i.put(str, lrVar3);
    }

    private final void F(final String str, com.google.android.gms.internal.measurement.p pVar) {
        if (pVar.m() == 0) {
            this.j.f(str);
            return;
        }
        n().J().b("EES programs found", Integer.valueOf(pVar.m()));
        com.google.android.gms.internal.measurement.s0 s0Var = pVar.X().get(0);
        try {
            gqc gqcVar = new gqc();
            gqcVar.c("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.h5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new h4d("internal.remoteConfig", new n5(g5.this, str));
                }
            });
            gqcVar.c("internal.appMetadata", new Callable() { // from class: ezc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final g5 g5Var = g5.this;
                    final String str2 = str;
                    return new zbd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.i5
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            g5 g5Var2 = g5.this;
                            String str3 = str2;
                            u4 C0 = g5Var2.p().C0(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            hashMap.put("gmp_version", 84002L);
                            if (C0 != null) {
                                String h = C0.h();
                                if (h != null) {
                                    hashMap.put("app_version", h);
                                }
                                hashMap.put("app_version_int", Long.valueOf(C0.A()));
                                hashMap.put("dynamite_version", Long.valueOf(C0.e0()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            gqcVar.c("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.j5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new y9d(g5.this.k);
                }
            });
            gqcVar.b(s0Var);
            this.j.e(str, gqcVar);
            n().J().c("EES program loaded for appId, activities", str, Integer.valueOf(s0Var.H().m()));
            for (com.google.android.gms.internal.measurement.r0 r0Var : s0Var.H().J()) {
                n().J().b("EES program activity", r0Var.I());
            }
        } catch (zzc unused) {
            n().F().b("Failed to load EES program. appId", str);
        }
    }

    private final void f0(String str) {
        t();
        l();
        gh8.f(str);
        if (this.h.get(str) == null) {
            l D0 = p().D0(str);
            if (D0 == null) {
                this.d.put(str, null);
                this.f.put(str, null);
                this.e.put(str, null);
                this.g.put(str, null);
                this.h.put(str, null);
                this.l.put(str, null);
                this.m.put(str, null);
                this.n.put(str, null);
                this.i.put(str, null);
                return;
            }
            p.a z = y(str, D0.a).z();
            E(str, z);
            this.d.put(str, B((com.google.android.gms.internal.measurement.p) ((com.google.android.gms.internal.measurement.b2) z.u())));
            this.h.put(str, (com.google.android.gms.internal.measurement.p) ((com.google.android.gms.internal.measurement.b2) z.u()));
            F(str, (com.google.android.gms.internal.measurement.p) ((com.google.android.gms.internal.measurement.b2) z.u()));
            this.l.put(str, z.y());
            this.m.put(str, D0.b);
            this.n.put(str, D0.c);
        }
    }

    private final com.google.android.gms.internal.measurement.p y(String str, byte[] bArr) {
        Long l;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.p.Q();
        }
        try {
            com.google.android.gms.internal.measurement.p pVar = (com.google.android.gms.internal.measurement.p) ((com.google.android.gms.internal.measurement.b2) ((p.a) db.P(com.google.android.gms.internal.measurement.p.O(), bArr)).u());
            m4 J = n().J();
            String str2 = null;
            if (pVar.d0()) {
                l = Long.valueOf(pVar.M());
            } else {
                l = null;
            }
            if (pVar.b0()) {
                str2 = pVar.S();
            }
            J.c("Parsed config. version, gmp_app_id", l, str2);
            return pVar;
        } catch (zzjq e) {
            n().K().c("Unable to merge remote config. appId", k4.u(str), e);
            return com.google.android.gms.internal.measurement.p.Q();
        } catch (RuntimeException e2) {
            n().K().c("Unable to merge remote config. appId", k4.u(str), e2);
            return com.google.android.gms.internal.measurement.p.Q();
        }
    }

    private static w6.a z(m.e eVar) {
        int i = m5.b[eVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return w6.a.AD_PERSONALIZATION;
                }
                return w6.a.AD_USER_DATA;
            }
            return w6.a.ANALYTICS_STORAGE;
        }
        return w6.a.AD_STORAGE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w6.a A(String str, w6.a aVar) {
        l();
        f0(str);
        com.google.android.gms.internal.measurement.m I = I(str);
        if (I == null) {
            return null;
        }
        for (m.c cVar : I.L()) {
            if (aVar == z(cVar.J())) {
                return z(cVar.I());
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean G(String str, byte[] bArr, String str2, String str3) {
        t();
        l();
        gh8.f(str);
        p.a z = y(str, bArr).z();
        if (z == null) {
            return false;
        }
        E(str, z);
        F(str, (com.google.android.gms.internal.measurement.p) ((com.google.android.gms.internal.measurement.b2) z.u()));
        this.h.put(str, (com.google.android.gms.internal.measurement.p) ((com.google.android.gms.internal.measurement.b2) z.u()));
        this.l.put(str, z.y());
        this.m.put(str, str2);
        this.n.put(str, str3);
        this.d.put(str, B((com.google.android.gms.internal.measurement.p) ((com.google.android.gms.internal.measurement.b2) z.u())));
        p().Y(str, new ArrayList(z.z()));
        try {
            z.w();
            bArr = ((com.google.android.gms.internal.measurement.p) ((com.google.android.gms.internal.measurement.b2) z.u())).k();
        } catch (RuntimeException e) {
            n().K().c("Unable to serialize reduced-size config. Storing full config instead. appId", k4.u(str), e);
        }
        k p = p();
        gh8.f(str);
        p.l();
        p.t();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (p.A().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                p.n().F().b("Failed to update remote config (got 0). appId", k4.u(str));
            }
        } catch (SQLiteException e2) {
            p.n().F().c("Error storing remote config. appId", k4.u(str), e2);
        }
        this.h.put(str, (com.google.android.gms.internal.measurement.p) ((com.google.android.gms.internal.measurement.b2) z.u()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int H(String str, String str2) {
        Integer num;
        l();
        f0(str);
        Map<String, Integer> map = this.i.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.m I(String str) {
        l();
        f0(str);
        com.google.android.gms.internal.measurement.p K = K(str);
        if (K != null && K.a0()) {
            return K.N();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean J(String str, w6.a aVar) {
        l();
        f0(str);
        com.google.android.gms.internal.measurement.m I = I(str);
        if (I == null) {
            return false;
        }
        Iterator<m.b> it = I.K().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            m.b next = it.next();
            if (aVar == z(next.J())) {
                if (next.I() == m.d.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.google.android.gms.internal.measurement.p K(String str) {
        t();
        l();
        gh8.f(str);
        f0(str);
        return this.h.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean L(String str, String str2) {
        Boolean bool;
        l();
        f0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.g.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String M(String str) {
        l();
        return this.n.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean N(String str, String str2) {
        Boolean bool;
        l();
        f0(str);
        if (W(str) && jb.G0(str2)) {
            return true;
        }
        if (Y(str) && jb.I0(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String O(String str) {
        l();
        return this.m.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String P(String str) {
        l();
        f0(str);
        return this.l.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<String> Q(String str) {
        l();
        f0(str);
        return this.e.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SortedSet<String> R(String str) {
        l();
        f0(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.m I = I(str);
        if (I == null) {
            return treeSet;
        }
        for (m.f fVar : I.J()) {
            treeSet.add(fVar.I());
        }
        return treeSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void S(String str) {
        l();
        this.m.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void T(String str) {
        l();
        this.h.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean U(String str) {
        l();
        com.google.android.gms.internal.measurement.p K = K(str);
        if (K == null) {
            return false;
        }
        return K.Z();
    }

    public final boolean V(String str) {
        com.google.android.gms.internal.measurement.p pVar;
        if (TextUtils.isEmpty(str) || (pVar = this.h.get(str)) == null || pVar.m() == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean W(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean X(String str) {
        l();
        f0(str);
        com.google.android.gms.internal.measurement.m I = I(str);
        if (I == null || !I.N() || I.M()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Y(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Z(String str) {
        l();
        f0(str);
        if (this.e.get(str) != null && this.e.get(str).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ g a() {
        return super.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a0(String str) {
        l();
        f0(str);
        if (this.e.get(str) != null) {
            if (this.e.get(str).contains("device_model") || this.e.get(str).contains("device_info")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ t91 b() {
        return super.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b0(String str) {
        l();
        f0(str);
        if (this.e.get(str) != null && this.e.get(str).contains("enhanced_user_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.i
    public final String c(String str, String str2) {
        l();
        f0(str);
        Map<String, String> map = this.d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c0(String str) {
        l();
        f0(str);
        if (this.e.get(str) != null && this.e.get(str).contains("google_signals")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ c d() {
        return super.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d0(String str) {
        l();
        f0(str);
        if (this.e.get(str) != null) {
            if (this.e.get(str).contains("os_version") || this.e.get(str).contains("device_info")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w e() {
        return super.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e0(String str) {
        l();
        f0(str);
        if (this.e.get(str) != null && this.e.get(str).contains("user_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ j4 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ w4 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ jb h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ o5 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.t6
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ db m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ k4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ ob o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ k p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ g5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ w9 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ ta s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean w() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long x(String str) {
        String c = c(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(c)) {
            try {
                return Long.parseLong(c);
            } catch (NumberFormatException e) {
                n().K().c("Unable to parse timezone offset. appId", k4.u(str), e);
                return 0L;
            }
        }
        return 0L;
    }

    @Override // com.google.android.gms.measurement.internal.t6, com.google.android.gms.measurement.internal.u6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
