package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import ch.qos.logback.core.spi.ComponentTracker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.measurement.internal.w6;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class w4 extends s6 {
    static final Pair<String, Long> B = new Pair<>("", 0L);
    public final y4 A;
    private SharedPreferences c;
    private Object d;
    private SharedPreferences e;
    public a5 f;
    public final b5 g;
    public final b5 h;
    public final c5 i;
    private String j;
    private boolean k;
    private long l;
    public final b5 m;
    public final z4 n;
    public final c5 o;
    public final y4 p;
    public final z4 q;
    public final b5 r;
    public final b5 s;
    public boolean t;
    public z4 u;
    public z4 v;
    public b5 w;
    public final c5 x;
    public final c5 y;
    public final b5 z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w4(u5 u5Var) {
        super(u5Var);
        this.d = new Object();
        this.m = new b5(this, "session_timeout", ComponentTracker.DEFAULT_TIMEOUT);
        this.n = new z4(this, "start_new_session", true);
        this.r = new b5(this, "last_pause_time", 0L);
        this.s = new b5(this, "session_id", 0L);
        this.o = new c5(this, "non_personalized_ads", null);
        this.p = new y4(this, "last_received_uri_timestamps_by_source", null);
        this.q = new z4(this, "allow_remote_dynamite", false);
        this.g = new b5(this, "first_open_time", 0L);
        this.h = new b5(this, "app_install_time", 0L);
        this.i = new c5(this, "app_instance_id", null);
        this.u = new z4(this, "app_backgrounded", false);
        this.v = new z4(this, "deep_link_retrieval_complete", false);
        this.w = new b5(this, "deep_link_retrieval_attempts", 0L);
        this.x = new c5(this, "firebase_feature_rollouts", null);
        this.y = new c5(this, "deferred_attribution_cache", null);
        this.z = new b5(this, "deferred_attribution_cache_timestamp", 0L);
        this.A = new y4(this, "default_event_parameters", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean A(ma maVar) {
        l();
        String string = H().getString("stored_tcf_param", "");
        String g = maVar.g();
        if (!g.equals(string)) {
            SharedPreferences.Editor edit = H().edit();
            edit.putString("stored_tcf_param", g);
            edit.apply();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean B() {
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C(Boolean bool) {
        l();
        SharedPreferences.Editor edit = H().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D(String str) {
        l();
        SharedPreferences.Editor edit = H().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(boolean z) {
        l();
        n().J().b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = H().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences F() {
        l();
        o();
        if (this.e == null) {
            synchronized (this.d) {
                try {
                    if (this.e == null) {
                        String packageName = zza().getPackageName();
                        this.e = zza().getSharedPreferences(packageName + "_preferences", 0);
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(String str) {
        l();
        SharedPreferences.Editor edit = H().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences H() {
        l();
        o();
        gh8.j(this.c);
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SparseArray<Long> I() {
        Bundle a = this.p.a();
        if (a == null) {
            return new SparseArray<>();
        }
        int[] intArray = a.getIntArray("uriSources");
        long[] longArray = a.getLongArray("uriTimestamps");
        if (intArray != null && longArray != null) {
            if (intArray.length != longArray.length) {
                n().F().a("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray<>();
            }
            SparseArray<Long> sparseArray = new SparseArray<>();
            for (int i = 0; i < intArray.length; i++) {
                sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
            }
            return sparseArray;
        }
        return new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final t J() {
        l();
        return t.c(H().getString("dma_consent_settings", null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w6 K() {
        l();
        return w6.f(H().getString("consent_settings", "G1"), H().getInt("consent_source", 100));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean L() {
        l();
        if (!H().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(H().getBoolean("use_service", false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean M() {
        l();
        if (H().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(H().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean N() {
        l();
        if (H().contains("measurement_enabled")) {
            return Boolean.valueOf(H().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String O() {
        l();
        String string = H().getString("previous_os_version", null);
        e().o();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = H().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String P() {
        l();
        return H().getString("admob_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String Q() {
        l();
        return H().getString("gmp_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R() {
        l();
        Boolean N = N();
        SharedPreferences.Editor edit = H().edit();
        edit.clear();
        edit.apply();
        if (N != null) {
            u(N);
        }
    }

    @Override // com.google.android.gms.measurement.internal.s6
    protected final void m() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.t = z;
        if (!z) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f = new a5(this, "health_monitor", Math.max(0L, b0.e.a(null).longValue()));
    }

    @Override // com.google.android.gms.measurement.internal.s6
    protected final boolean s() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair<String, Boolean> t(String str) {
        l();
        if (e6d.a() && a().s(b0.O0) && !K().l(w6.a.AD_STORAGE)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long b = b().b();
        if (this.j != null && b < this.l) {
            return new Pair<>(this.j, Boolean.valueOf(this.k));
        }
        this.l = b + a().z(str);
        AdvertisingIdClient.a(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            this.j = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.j = id;
            }
            this.k = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            n().E().b("Unable to get advertising id", e);
            this.j = "";
        }
        AdvertisingIdClient.a(false);
        return new Pair<>(this.j, Boolean.valueOf(this.k));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(Boolean bool) {
        l();
        SharedPreferences.Editor edit = H().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(boolean z) {
        l();
        SharedPreferences.Editor edit = H().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w(int i) {
        return w6.k(i, H().getInt("consent_source", 100));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean x(long j) {
        if (j - this.m.a() > this.r.a()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean y(t tVar) {
        l();
        if (w6.k(tVar.a(), J().a())) {
            SharedPreferences.Editor edit = H().edit();
            edit.putString("dma_consent_settings", tVar.i());
            edit.apply();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean z(w6 w6Var) {
        l();
        int b = w6Var.b();
        if (w(b)) {
            SharedPreferences.Editor edit = H().edit();
            edit.putString("consent_settings", w6Var.v());
            edit.putInt("consent_source", b);
            edit.apply();
            return true;
        }
        return false;
    }
}
