package com.google.android.gms.measurement.internal;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ch.qos.logback.core.spi.ComponentTracker;
import im.threads.ui.fragments.ChatFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class b0 {
    public static final e4<Long> A;
    public static final e4<Boolean> A0;
    public static final e4<Long> B;
    public static final e4<Boolean> B0;
    public static final e4<Long> C;
    public static final e4<Boolean> C0;
    public static final e4<Long> D;
    public static final e4<Boolean> D0;
    public static final e4<Integer> E;
    public static final e4<Boolean> E0;
    public static final e4<Long> F;
    public static final e4<Boolean> F0;
    public static final e4<Integer> G;
    public static final e4<Boolean> G0;
    public static final e4<Integer> H;
    public static final e4<Boolean> H0;
    public static final e4<Integer> I;
    public static final e4<Boolean> I0;
    public static final e4<Integer> J;
    public static final e4<Boolean> J0;
    public static final e4<Integer> K;
    public static final e4<Boolean> K0;
    public static final e4<Long> L;
    private static final e4<Boolean> L0;
    public static final e4<Boolean> M;
    public static final e4<Boolean> M0;
    public static final e4<String> N;
    public static final e4<Boolean> N0;
    public static final e4<Long> O;
    public static final e4<Boolean> O0;
    public static final e4<Integer> P;
    public static final e4<Boolean> P0;
    public static final e4<Double> Q;
    public static final e4<Boolean> Q0;
    public static final e4<Integer> R;
    public static final e4<Boolean> R0;
    public static final e4<Integer> S;
    public static final e4<Boolean> S0;
    public static final e4<Integer> T;
    public static final e4<Boolean> T0;
    public static final e4<Integer> U;
    public static final e4<Boolean> U0;
    public static final e4<Long> V;
    public static final e4<Boolean> V0;
    public static final e4<Long> W;
    public static final e4<Boolean> W0;
    public static final e4<Integer> X;
    public static final e4<Boolean> X0;
    public static final e4<String> Y;
    public static e4<Boolean> Y0;
    public static final e4<String> Z;
    public static final e4<Boolean> Z0;
    public static final e4<String> a0;
    public static final e4<Boolean> a1;
    public static final e4<String> b0;
    public static final e4<Boolean> b1;
    public static final e4<Long> c;
    public static final e4<String> c0;
    public static final e4<Long> d;
    public static final e4<String> d0;
    public static final e4<Long> e;
    public static final e4<String> e0;
    public static final e4<Long> f;
    public static final e4<Boolean> f0;
    public static final e4<String> g;
    public static final e4<Boolean> g0;
    public static final e4<String> h;
    public static final e4<Boolean> h0;
    public static final e4<Integer> i;
    public static final e4<Boolean> i0;
    public static final e4<Integer> j;
    public static final e4<Boolean> j0;
    public static final e4<Integer> k;
    public static final e4<Boolean> k0;
    public static final e4<Integer> l;
    public static final e4<Boolean> l0;
    public static final e4<Integer> m;
    public static final e4<Boolean> m0;
    public static final e4<Integer> n;
    public static final e4<Boolean> n0;
    public static final e4<Integer> o;
    public static final e4<Integer> o0;
    public static final e4<Integer> p;
    public static final e4<Boolean> p0;
    public static final e4<Integer> q;
    public static final e4<Boolean> q0;
    public static final e4<Integer> r;
    public static final e4<Boolean> r0;
    public static final e4<String> s;
    public static final e4<Boolean> s0;
    public static final e4<Long> t;
    public static final e4<Boolean> t0;
    public static final e4<Long> u;
    private static final e4<Boolean> u0;
    public static final e4<Long> v;
    public static final e4<Boolean> v0;
    public static final e4<Long> w;
    public static final e4<Boolean> w0;
    public static final e4<Long> x;
    public static final e4<Boolean> x0;
    public static final e4<Long> y;
    public static final e4<Boolean> y0;
    public static final e4<Long> z;
    public static final e4<Boolean> z0;
    private static final List<e4<?>> a = Collections.synchronizedList(new ArrayList());
    private static final Set<e4<?>> b = Collections.synchronizedSet(new HashSet());

    static {
        Long valueOf = Long.valueOf((long) AbstractComponentTracker.LINGERING_TIMEOUT);
        c = a("measurement.ad_id_cache_time", valueOf, valueOf, new d4() { // from class: com.google.android.gms.measurement.internal.d0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf2;
                valueOf2 = Long.valueOf(m5d.a());
                return valueOf2;
            }
        });
        Long valueOf2 = Long.valueOf((long) CoreConstants.MILLIS_IN_ONE_HOUR);
        d = a("measurement.app_uninstalled_additional_ad_id_cache_time", valueOf2, valueOf2, new d4() { // from class: com.google.android.gms.measurement.internal.h0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf3;
                valueOf3 = Long.valueOf(m5d.w());
                return valueOf3;
            }
        });
        Long valueOf3 = Long.valueOf((long) CoreConstants.MILLIS_IN_ONE_DAY);
        e = a("measurement.monitoring.sample_period_millis", valueOf3, valueOf3, new d4() { // from class: com.google.android.gms.measurement.internal.t0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(m5d.J());
                return valueOf4;
            }
        });
        f = a("measurement.config.cache_time", valueOf3, valueOf2, new d4() { // from class: com.google.android.gms.measurement.internal.g1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(m5d.y());
                return valueOf4;
            }
        });
        g = a("measurement.config.url_scheme", "https", "https", new d4() { // from class: com.google.android.gms.measurement.internal.s1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                String n2;
                n2 = m5d.n();
                return n2;
            }
        });
        h = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new d4() { // from class: com.google.android.gms.measurement.internal.f2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                String m2;
                m2 = m5d.m();
                return m2;
            }
        });
        i = a("measurement.upload.max_bundles", 100, 100, new d4() { // from class: com.google.android.gms.measurement.internal.r2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) m5d.U());
                return valueOf4;
            }
        });
        j = a("measurement.upload.max_batch_size", 65536, 65536, new d4() { // from class: com.google.android.gms.measurement.internal.e3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) m5d.i());
                return valueOf4;
            }
        });
        k = a("measurement.upload.max_bundle_size", 65536, 65536, new d4() { // from class: com.google.android.gms.measurement.internal.q3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) m5d.T());
                return valueOf4;
            }
        });
        l = a("measurement.upload.max_events_per_bundle", 1000, 1000, new d4() { // from class: com.google.android.gms.measurement.internal.f0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) m5d.d());
                return valueOf4;
            }
        });
        m = a("measurement.upload.max_events_per_day", 100000, 100000, new d4() { // from class: com.google.android.gms.measurement.internal.p0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) m5d.e());
                return valueOf4;
            }
        });
        n = a("measurement.upload.max_error_events_per_day", 1000, 1000, new d4() { // from class: com.google.android.gms.measurement.internal.z0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) m5d.c());
                return valueOf4;
            }
        });
        o = a("measurement.upload.max_public_events_per_day", 50000, 50000, new d4() { // from class: com.google.android.gms.measurement.internal.m1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) m5d.f());
                return valueOf4;
            }
        });
        p = a("measurement.upload.max_conversions_per_day", 10000, 10000, new d4() { // from class: com.google.android.gms.measurement.internal.v1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) m5d.b());
                return valueOf4;
            }
        });
        q = a("measurement.upload.max_realtime_events_per_day", 10, 10, new d4() { // from class: com.google.android.gms.measurement.internal.j2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) m5d.h());
                return valueOf4;
            }
        });
        r = a("measurement.store.max_stored_events_per_app", 100000, 100000, new d4() { // from class: com.google.android.gms.measurement.internal.s2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) m5d.C());
                return valueOf4;
            }
        });
        s = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new d4() { // from class: com.google.android.gms.measurement.internal.g3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                String u2;
                u2 = m5d.u();
                return u2;
            }
        });
        t = a("measurement.upload.backoff_period", 43200000L, 43200000L, new d4() { // from class: com.google.android.gms.measurement.internal.p3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(m5d.Q());
                return valueOf4;
            }
        });
        u = a("measurement.upload.window_interval", valueOf2, valueOf2, new d4() { // from class: com.google.android.gms.measurement.internal.c0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(m5d.l());
                return valueOf4;
            }
        });
        v = a("measurement.upload.interval", valueOf2, valueOf2, new d4() { // from class: com.google.android.gms.measurement.internal.e0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(m5d.S());
                return valueOf4;
            }
        });
        w = a("measurement.upload.realtime_upload_interval", valueOf, valueOf, new d4() { // from class: com.google.android.gms.measurement.internal.g0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(m5d.K());
                return valueOf4;
            }
        });
        x = a("measurement.upload.debug_upload_interval", 1000L, 1000L, new d4() { // from class: com.google.android.gms.measurement.internal.j0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(m5d.z());
                return valueOf4;
            }
        });
        y = a("measurement.upload.minimum_delay", 500L, 500L, new d4() { // from class: com.google.android.gms.measurement.internal.i0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(m5d.I());
                return valueOf4;
            }
        });
        z = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new d4() { // from class: com.google.android.gms.measurement.internal.l0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(m5d.H());
                return valueOf4;
            }
        });
        A = a("measurement.upload.stale_data_deletion_interval", valueOf3, valueOf3, new d4() { // from class: com.google.android.gms.measurement.internal.k0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(m5d.N());
                return valueOf4;
            }
        });
        Long valueOf4 = Long.valueOf((long) CoreConstants.MILLIS_IN_ONE_WEEK);
        B = a("measurement.upload.refresh_blacklisted_config_interval", valueOf4, valueOf4, new d4() { // from class: com.google.android.gms.measurement.internal.n0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf5;
                valueOf5 = Long.valueOf(m5d.L());
                return valueOf5;
            }
        });
        C = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new d4() { // from class: com.google.android.gms.measurement.internal.m0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf5;
                valueOf5 = Long.valueOf(m5d.R());
                return valueOf5;
            }
        });
        Long valueOf5 = Long.valueOf((long) ComponentTracker.DEFAULT_TIMEOUT);
        D = a("measurement.upload.retry_time", valueOf5, valueOf5, new d4() { // from class: com.google.android.gms.measurement.internal.o0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf6;
                valueOf6 = Long.valueOf(m5d.k());
                return valueOf6;
            }
        });
        E = a("measurement.upload.retry_count", 6, 6, new d4() { // from class: com.google.android.gms.measurement.internal.r0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf6;
                valueOf6 = Integer.valueOf((int) m5d.j());
                return valueOf6;
            }
        });
        F = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new d4() { // from class: com.google.android.gms.measurement.internal.q0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf6;
                valueOf6 = Long.valueOf(m5d.g());
                return valueOf6;
            }
        });
        G = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, new d4() { // from class: com.google.android.gms.measurement.internal.s0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf6;
                valueOf6 = Integer.valueOf((int) m5d.A());
                return valueOf6;
            }
        });
        Integer valueOf6 = Integer.valueOf((int) ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY);
        H = a("measurement.audience.filter_result_max_count", valueOf6, valueOf6, new d4() { // from class: com.google.android.gms.measurement.internal.w0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf7;
                valueOf7 = Integer.valueOf((int) m5d.E());
                return valueOf7;
            }
        });
        I = a("measurement.upload.max_public_user_properties", 25, 25, null);
        J = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        K = a("measurement.upload.max_public_event_params", 25, 25, null);
        L = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new d4() { // from class: com.google.android.gms.measurement.internal.u0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf7;
                valueOf7 = Long.valueOf(m5d.M());
                return valueOf7;
            }
        });
        Boolean bool = Boolean.FALSE;
        M = a("measurement.test.boolean_flag", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.y0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf7;
                valueOf7 = Boolean.valueOf(a8d.e());
                return valueOf7;
            }
        });
        N = a("measurement.test.string_flag", "---", "---", new d4() { // from class: com.google.android.gms.measurement.internal.x0
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                String d2;
                d2 = a8d.d();
                return d2;
            }
        });
        O = a("measurement.test.long_flag", -1L, -1L, new d4() { // from class: com.google.android.gms.measurement.internal.a1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf7;
                valueOf7 = Long.valueOf(a8d.c());
                return valueOf7;
            }
        });
        P = a("measurement.test.int_flag", -2, -2, new d4() { // from class: com.google.android.gms.measurement.internal.c1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf7;
                valueOf7 = Integer.valueOf((int) a8d.b());
                return valueOf7;
            }
        });
        Double valueOf7 = Double.valueOf(-3.0d);
        Q = a("measurement.test.double_flag", valueOf7, valueOf7, new d4() { // from class: com.google.android.gms.measurement.internal.b1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Double valueOf8;
                valueOf8 = Double.valueOf(a8d.a());
                return valueOf8;
            }
        });
        R = a("measurement.experiment.max_ids", 50, 50, new d4() { // from class: com.google.android.gms.measurement.internal.e1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf8;
                valueOf8 = Integer.valueOf((int) m5d.D());
                return valueOf8;
            }
        });
        S = a("measurement.upload.max_item_scoped_custom_parameters", 27, 27, new d4() { // from class: com.google.android.gms.measurement.internal.d1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf8;
                valueOf8 = Integer.valueOf((int) m5d.F());
                return valueOf8;
            }
        });
        T = a("measurement.upload.max_event_parameter_value_length", 100, 100, new d4() { // from class: com.google.android.gms.measurement.internal.f1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf8;
                valueOf8 = Integer.valueOf((int) m5d.B());
                return valueOf8;
            }
        });
        U = a("measurement.max_bundles_per_iteration", 100, 100, new d4() { // from class: com.google.android.gms.measurement.internal.i1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf8;
                valueOf8 = Integer.valueOf((int) m5d.x());
                return valueOf8;
            }
        });
        V = a("measurement.sdk.attribution.cache.ttl", valueOf4, valueOf4, new d4() { // from class: com.google.android.gms.measurement.internal.h1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf8;
                valueOf8 = Long.valueOf(m5d.O());
                return valueOf8;
            }
        });
        W = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new d4() { // from class: com.google.android.gms.measurement.internal.k1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Long valueOf8;
                valueOf8 = Long.valueOf(m5d.P());
                return valueOf8;
            }
        });
        X = a("measurement.rb.attribution.client.min_ad_services_version", 7, 7, new d4() { // from class: com.google.android.gms.measurement.internal.j1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf8;
                valueOf8 = Integer.valueOf((int) m5d.G());
                return valueOf8;
            }
        });
        Y = a("measurement.rb.attribution.uri_scheme", "https", "https", new d4() { // from class: com.google.android.gms.measurement.internal.l1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                String t2;
                t2 = m5d.t();
                return t2;
            }
        });
        Z = a("measurement.rb.attribution.uri_authority", "google-analytics.com", "google-analytics.com", new d4() { // from class: com.google.android.gms.measurement.internal.o1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                String q2;
                q2 = m5d.q();
                return q2;
            }
        });
        a0 = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", "privacy-sandbox/register-app-conversion", new d4() { // from class: com.google.android.gms.measurement.internal.n1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                String r2;
                r2 = m5d.r();
                return r2;
            }
        });
        b0 = a("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots", new d4() { // from class: com.google.android.gms.measurement.internal.q1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                String p2;
                p2 = m5d.p();
                return p2;
            }
        });
        c0 = a("measurement.rb.attribution.user_properties", "_npa,npa", "_npa,npa", new d4() { // from class: com.google.android.gms.measurement.internal.p1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                String v2;
                v2 = m5d.v();
                return v2;
            }
        });
        d0 = a("measurement.rb.attribution.event_params", "value|currency", "value|currency", new d4() { // from class: com.google.android.gms.measurement.internal.r1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                String o2;
                o2 = m5d.o();
                return o2;
            }
        });
        e0 = a("measurement.rb.attribution.query_parameters_to_remove", "", "", new d4() { // from class: com.google.android.gms.measurement.internal.u1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                String s2;
                s2 = m5d.s();
                return s2;
            }
        });
        Boolean bool2 = Boolean.TRUE;
        f0 = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.t1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(b8d.a());
                return valueOf8;
            }
        });
        g0 = a("measurement.quality.checksum", bool, bool, null);
        h0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.x1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(t6d.c());
                return valueOf8;
            }
        });
        i0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.z1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(t6d.b());
                return valueOf8;
            }
        });
        j0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.y1
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(t6d.d());
                return valueOf8;
            }
        });
        k0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.b2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(m7d.a());
                return valueOf8;
            }
        });
        l0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.a2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(o9d.b());
                return valueOf8;
            }
        });
        m0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.d2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(t9d.a());
                return valueOf8;
            }
        });
        n0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.c2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(z6d.b());
                return valueOf8;
            }
        });
        o0 = a("measurement.service.storage_consent_support_version", 203600, 203600, new d4() { // from class: com.google.android.gms.measurement.internal.e2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Integer valueOf8;
                valueOf8 = Integer.valueOf((int) r5d.a());
                return valueOf8;
            }
        });
        p0 = a("measurement.service.store_null_safelist", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.h2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(d6d.b());
                return valueOf8;
            }
        });
        q0 = a("measurement.service.store_safelist", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.g2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(d6d.c());
                return valueOf8;
            }
        });
        r0 = a("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.i2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(s8d.c());
                return valueOf8;
            }
        });
        s0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.l2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(s8d.b());
                return valueOf8;
            }
        });
        t0 = a("measurement.session_stitching_token_enabled", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.k2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(s8d.d());
                return valueOf8;
            }
        });
        u0 = a("measurement.sgtm.client.dev", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.n2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(i9d.b());
                return valueOf8;
            }
        });
        v0 = a("measurement.sgtm.service", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.m2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(i9d.d());
                return valueOf8;
            }
        });
        w0 = a("measurement.sgtm.preview_mode_enabled.dev", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.p2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(i9d.c());
                return valueOf8;
            }
        });
        x0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.o2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(h8d.a());
                return valueOf8;
            }
        });
        y0 = a("measurement.redaction.scion_payload_generator", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.q2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(h8d.b());
                return valueOf8;
            }
        });
        z0 = a("measurement.sessionid.enable_client_session_id", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.t2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(n8d.b());
                return valueOf8;
            }
        });
        A0 = a("measurement.sfmc.client", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.v2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(y8d.b());
                return valueOf8;
            }
        });
        B0 = a("measurement.sfmc.service", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.u2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(y8d.c());
                return valueOf8;
            }
        });
        C0 = a("measurement.gmscore_feature_tracking", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.y2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(f7d.b());
                return valueOf8;
            }
        });
        D0 = a("measurement.fix_health_monitor_stack_trace", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.w2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(u6d.b());
                return valueOf8;
            }
        });
        E0 = a("measurement.item_scoped_custom_parameters.client", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.a3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(l7d.b());
                return valueOf8;
            }
        });
        F0 = a("measurement.item_scoped_custom_parameters.service", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.z2
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(l7d.c());
                return valueOf8;
            }
        });
        G0 = a("measurement.remove_app_background.client", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.c3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(m8d.b());
                return valueOf8;
            }
        });
        H0 = a("measurement.rb.attribution.service", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.b3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(g8d.e());
                return valueOf8;
            }
        });
        I0 = a("measurement.rb.attribution.client2", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.d3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(g8d.b());
                return valueOf8;
            }
        });
        J0 = a("measurement.rb.attribution.uuid_generation", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.f3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(g8d.g());
                return valueOf8;
            }
        });
        K0 = a("measurement.rb.attribution.enable_trigger_redaction", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.i3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(g8d.f());
                return valueOf8;
            }
        });
        L0 = a("measurement.rb.attribution.followup1.service", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.h3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(g8d.d());
                return valueOf8;
            }
        });
        M0 = a("measurement.rb.attribution.dma_fix", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.k3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(g8d.c());
                return valueOf8;
            }
        });
        N0 = a("measurement.client.sessions.enable_fix_background_engagement", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.j3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                return Boolean.valueOf(t8d.a());
            }
        });
        O0 = a("measurement.client.ad_id_consent_fix", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.m3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                return Boolean.valueOf(e6d.b());
            }
        });
        P0 = a("measurement.dma_consent.client", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.l3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(y5d.b());
                return valueOf8;
            }
        });
        Q0 = a("measurement.dma_consent.service", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.o3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(y5d.d());
                return valueOf8;
            }
        });
        R0 = a("measurement.dma_consent.client_bow_check2", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.n3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(y5d.c());
                return valueOf8;
            }
        });
        S0 = a("measurement.dma_consent.service_gcs_v2", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.s3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(y5d.e());
                return valueOf8;
            }
        });
        T0 = a("measurement.dma_consent.service_npa_remote_default", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.r3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(y5d.f());
                return valueOf8;
            }
        });
        U0 = a("measurement.dma_consent.service_split_batch_on_consent", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.u3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(y5d.g());
                return valueOf8;
            }
        });
        V0 = a("measurement.service.deferred_first_open", bool2, bool2, new d4() { // from class: com.google.android.gms.measurement.internal.t3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(s5d.b());
                return valueOf8;
            }
        });
        W0 = a("measurement.gbraid_campaign.gbraid.client.dev", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.w3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(a7d.b());
                return valueOf8;
            }
        });
        X0 = a("measurement.gbraid_campaign.gbraid.service", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.v3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(a7d.c());
                return valueOf8;
            }
        });
        Y0 = a("measurement.increase_param_lengths", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.z3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(g7d.b());
                return valueOf8;
            }
        });
        Z0 = a("measurement.disable_npa_for_dasher_and_unicorn", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.x3
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(x5d.b());
                return valueOf8;
            }
        });
        a1 = a("measurement.tcf.client.dev", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.b4
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(n9d.b());
                return valueOf8;
            }
        });
        b1 = a("measurement.tcf.service", bool, bool, new d4() { // from class: com.google.android.gms.measurement.internal.a4
            @Override // com.google.android.gms.measurement.internal.d4
            public final Object zza() {
                Boolean valueOf8;
                valueOf8 = Boolean.valueOf(n9d.c());
                return valueOf8;
            }
        });
    }

    private static <V> e4<V> a(String str, V v2, V v3, d4<V> d4Var) {
        e4<V> e4Var = new e4<>(str, v2, v3, d4Var);
        a.add(e4Var);
        return e4Var;
    }

    public static Map<String, String> c(Context context) {
        qyc b2 = qyc.b(context.getContentResolver(), fzc.a("com.google.android.gms.measurement"), new Runnable() { // from class: krc
            @Override // java.lang.Runnable
            public final void run() {
                izc.m();
            }
        });
        if (b2 == null) {
            return Collections.emptyMap();
        }
        return b2.a();
    }
}
