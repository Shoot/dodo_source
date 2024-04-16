package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ch.qos.logback.core.spi.ComponentTracker;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: o5d  reason: default package */
/* loaded from: classes2.dex */
public final class o5d implements p5d {
    private static final izc<Long> A;
    private static final izc<String> B;
    private static final izc<String> C;
    private static final izc<String> D;
    private static final izc<String> E;
    private static final izc<Long> F;
    private static final izc<Long> G;
    private static final izc<Long> H;
    private static final izc<Long> I;
    private static final izc<Long> J;
    private static final izc<Long> K;
    private static final izc<Long> L;
    private static final izc<Long> M;
    private static final izc<Long> N;
    private static final izc<Long> O;
    private static final izc<Long> P;
    private static final izc<Long> Q;
    private static final izc<Long> R;
    private static final izc<Long> S;
    private static final izc<Long> T;
    private static final izc<Long> U;
    private static final izc<Long> V;
    private static final izc<String> W;
    private static final izc<Long> X;
    private static final izc<String> Y;
    private static final izc<Long> a;
    private static final izc<Long> b;
    private static final izc<Long> c;
    private static final izc<Long> d;
    private static final izc<String> e;
    private static final izc<String> f;
    private static final izc<String> g;
    private static final izc<Long> h;
    private static final izc<String> i;
    private static final izc<Long> j;
    private static final izc<Long> k;
    private static final izc<Long> l;
    private static final izc<Long> m;
    private static final izc<Long> n;
    private static final izc<Long> o;
    private static final izc<Long> p;
    private static final izc<Long> q;
    private static final izc<Long> r;
    private static final izc<Long> s;
    private static final izc<Long> t;
    private static final izc<String> u;
    private static final izc<Long> v;
    private static final izc<Long> w;
    private static final izc<Long> x;
    private static final izc<Long> y;
    private static final izc<String> z;

    static {
        e0d e2 = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e2.b("measurement.ad_id_cache_time", AbstractComponentTracker.LINGERING_TIMEOUT);
        b = e2.b("measurement.app_uninstalled_additional_ad_id_cache_time", CoreConstants.MILLIS_IN_ONE_HOUR);
        c = e2.b("measurement.max_bundles_per_iteration", 100L);
        d = e2.b("measurement.config.cache_time", CoreConstants.MILLIS_IN_ONE_DAY);
        e = e2.c("measurement.log_tag", "FA");
        f = e2.c("measurement.config.url_authority", "app-measurement.com");
        g = e2.c("measurement.config.url_scheme", "https");
        h = e2.b("measurement.upload.debug_upload_interval", 1000L);
        i = e2.c("measurement.rb.attribution.event_params", "value|currency");
        j = e2.b("measurement.id.rb.attribution.app_allowlist", 0L);
        k = e2.b("measurement.lifetimevalue.max_currency_tracked", 4L);
        l = e2.b("measurement.upload.max_event_parameter_value_length", 100L);
        m = e2.b("measurement.store.max_stored_events_per_app", 100000L);
        n = e2.b("measurement.experiment.max_ids", 50L);
        o = e2.b("measurement.audience.filter_result_max_count", 200L);
        p = e2.b("measurement.upload.max_item_scoped_custom_parameters", 27L);
        q = e2.b("measurement.rb.attribution.client.min_ad_services_version", 7L);
        r = e2.b("measurement.alarm_manager.minimum_interval", 60000L);
        s = e2.b("measurement.upload.minimum_delay", 500L);
        t = e2.b("measurement.monitoring.sample_period_millis", CoreConstants.MILLIS_IN_ONE_DAY);
        u = e2.c("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots");
        v = e2.b("measurement.upload.realtime_upload_interval", AbstractComponentTracker.LINGERING_TIMEOUT);
        w = e2.b("measurement.upload.refresh_blacklisted_config_interval", CoreConstants.MILLIS_IN_ONE_WEEK);
        x = e2.b("measurement.config.cache_time.service", CoreConstants.MILLIS_IN_ONE_HOUR);
        y = e2.b("measurement.service_client.idle_disconnect_millis", 5000L);
        z = e2.c("measurement.log_tag.service", "FA-SVC");
        A = e2.b("measurement.upload.stale_data_deletion_interval", CoreConstants.MILLIS_IN_ONE_DAY);
        B = e2.c("measurement.rb.attribution.uri_authority", "google-analytics.com");
        C = e2.c("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        D = e2.c("measurement.rb.attribution.query_parameters_to_remove", "");
        E = e2.c("measurement.rb.attribution.uri_scheme", "https");
        F = e2.b("measurement.sdk.attribution.cache.ttl", CoreConstants.MILLIS_IN_ONE_WEEK);
        G = e2.b("measurement.redaction.app_instance_id.ttl", 7200000L);
        H = e2.b("measurement.upload.backoff_period", 43200000L);
        I = e2.b("measurement.upload.initial_upload_delay_time", 15000L);
        J = e2.b("measurement.upload.interval", CoreConstants.MILLIS_IN_ONE_HOUR);
        K = e2.b("measurement.upload.max_bundle_size", 65536L);
        L = e2.b("measurement.upload.max_bundles", 100L);
        M = e2.b("measurement.upload.max_conversions_per_day", 500L);
        N = e2.b("measurement.upload.max_error_events_per_day", 1000L);
        O = e2.b("measurement.upload.max_events_per_bundle", 1000L);
        P = e2.b("measurement.upload.max_events_per_day", 100000L);
        Q = e2.b("measurement.upload.max_public_events_per_day", 50000L);
        R = e2.b("measurement.upload.max_queue_time", 2419200000L);
        S = e2.b("measurement.upload.max_realtime_events_per_day", 10L);
        T = e2.b("measurement.upload.max_batch_size", 65536L);
        U = e2.b("measurement.upload.retry_count", 6L);
        V = e2.b("measurement.upload.retry_time", ComponentTracker.DEFAULT_TIMEOUT);
        W = e2.c("measurement.upload.url", "https://app-measurement.com/a");
        X = e2.b("measurement.upload.window_interval", CoreConstants.MILLIS_IN_ONE_HOUR);
        Y = e2.c("measurement.rb.attribution.user_properties", "_npa,npa");
    }

    @Override // defpackage.p5d
    public final long A() {
        return s.b().longValue();
    }

    @Override // defpackage.p5d
    public final long B() {
        return K.b().longValue();
    }

    @Override // defpackage.p5d
    public final long C() {
        return S.b().longValue();
    }

    @Override // defpackage.p5d
    public final long D() {
        return L.b().longValue();
    }

    @Override // defpackage.p5d
    public final long E() {
        return I.b().longValue();
    }

    @Override // defpackage.p5d
    public final long F() {
        return Q.b().longValue();
    }

    @Override // defpackage.p5d
    public final long G() {
        return J.b().longValue();
    }

    @Override // defpackage.p5d
    public final long H() {
        return R.b().longValue();
    }

    @Override // defpackage.p5d
    public final String I() {
        return f.b();
    }

    @Override // defpackage.p5d
    public final String J() {
        return g.b();
    }

    @Override // defpackage.p5d
    public final long K() {
        return V.b().longValue();
    }

    @Override // defpackage.p5d
    public final long L() {
        return X.b().longValue();
    }

    @Override // defpackage.p5d
    public final String M() {
        return B.b();
    }

    @Override // defpackage.p5d
    public final String N() {
        return C.b();
    }

    @Override // defpackage.p5d
    public final long O() {
        return y.b().longValue();
    }

    @Override // defpackage.p5d
    public final String P() {
        return i.b();
    }

    @Override // defpackage.p5d
    public final long Q() {
        return t.b().longValue();
    }

    @Override // defpackage.p5d
    public final String R() {
        return u.b();
    }

    @Override // defpackage.p5d
    public final long S() {
        return O.b().longValue();
    }

    @Override // defpackage.p5d
    public final String T() {
        return W.b();
    }

    @Override // defpackage.p5d
    public final long U() {
        return G.b().longValue();
    }

    @Override // defpackage.p5d
    public final long V() {
        return H.b().longValue();
    }

    @Override // defpackage.p5d
    public final long W() {
        return P.b().longValue();
    }

    @Override // defpackage.p5d
    public final String X() {
        return Y.b();
    }

    @Override // defpackage.p5d
    public final long Y() {
        return M.b().longValue();
    }

    @Override // defpackage.p5d
    public final String Z() {
        return D.b();
    }

    @Override // defpackage.p5d
    public final long a() {
        return l.b().longValue();
    }

    @Override // defpackage.p5d
    public final long a0() {
        return A.b().longValue();
    }

    @Override // defpackage.p5d
    public final long b() {
        return b.b().longValue();
    }

    @Override // defpackage.p5d
    public final long b0() {
        return N.b().longValue();
    }

    @Override // defpackage.p5d
    public final long c() {
        return c.b().longValue();
    }

    @Override // defpackage.p5d
    public final String c0() {
        return E.b();
    }

    @Override // defpackage.p5d
    public final long d() {
        return d.b().longValue();
    }

    @Override // defpackage.p5d
    public final long d0() {
        return F.b().longValue();
    }

    @Override // defpackage.p5d
    public final long f() {
        return h.b().longValue();
    }

    @Override // defpackage.p5d
    public final long g() {
        return k.b().longValue();
    }

    @Override // defpackage.p5d
    public final long h() {
        return m.b().longValue();
    }

    @Override // defpackage.p5d
    public final long i() {
        return n.b().longValue();
    }

    @Override // defpackage.p5d
    public final long k() {
        return q.b().longValue();
    }

    @Override // defpackage.p5d
    public final long n() {
        return o.b().longValue();
    }

    @Override // defpackage.p5d
    public final long t() {
        return r.b().longValue();
    }

    @Override // defpackage.p5d
    public final long u() {
        return T.b().longValue();
    }

    @Override // defpackage.p5d
    public final long v() {
        return p.b().longValue();
    }

    @Override // defpackage.p5d
    public final long x() {
        return U.b().longValue();
    }

    @Override // defpackage.p5d
    public final long y() {
        return v.b().longValue();
    }

    @Override // defpackage.p5d
    public final long z() {
        return w.b().longValue();
    }

    @Override // defpackage.p5d
    public final long zza() {
        return a.b().longValue();
    }
}
