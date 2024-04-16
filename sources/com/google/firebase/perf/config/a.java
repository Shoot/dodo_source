package com.google.firebase.perf.config;

import android.content.Context;
/* compiled from: ConfigResolver.java */
/* loaded from: classes2.dex */
public class a {
    private static final sh d = sh.e();
    private static volatile a e;
    private final RemoteConfigManager a;
    private tw4 b;
    private r13 c;

    public a(RemoteConfigManager remoteConfigManager, tw4 tw4Var, r13 r13Var) {
        this.a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.b = tw4Var == null ? new tw4() : tw4Var;
        this.c = r13Var == null ? r13.e() : r13Var;
    }

    private boolean H(long j) {
        if (j >= 0) {
            return true;
        }
        return false;
    }

    private boolean I(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(ih0.b)) {
                return true;
            }
        }
        return false;
    }

    private boolean J(long j) {
        if (j >= 0) {
            return true;
        }
        return false;
    }

    private boolean L(double d2) {
        if (0.0d <= d2 && d2 <= 1.0d) {
            return true;
        }
        return false;
    }

    private boolean M(long j) {
        if (j > 0) {
            return true;
        }
        return false;
    }

    private boolean N(long j) {
        if (j > 0) {
            return true;
        }
        return false;
    }

    private qb7<Boolean> b(v<Boolean> vVar) {
        return this.c.b(vVar.a());
    }

    private qb7<Double> c(v<Double> vVar) {
        return this.c.c(vVar.a());
    }

    private qb7<Long> d(v<Long> vVar) {
        return this.c.f(vVar.a());
    }

    private qb7<String> e(v<String> vVar) {
        return this.c.g(vVar.a());
    }

    public static synchronized a g() {
        a aVar;
        synchronized (a.class) {
            try {
                if (e == null) {
                    e = new a(null, null, null);
                }
                aVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    private boolean k() {
        l e2 = l.e();
        qb7<Boolean> u = u(e2);
        if (u.d()) {
            if (this.a.isLastFetchFailed()) {
                return false;
            }
            this.c.m(e2.a(), u.c().booleanValue());
            return u.c().booleanValue();
        }
        qb7<Boolean> b = b(e2);
        if (b.d()) {
            return b.c().booleanValue();
        }
        return e2.d().booleanValue();
    }

    private boolean l() {
        k e2 = k.e();
        qb7<String> x = x(e2);
        if (x.d()) {
            this.c.l(e2.a(), x.c());
            return I(x.c());
        }
        qb7<String> e3 = e(e2);
        if (e3.d()) {
            return I(e3.c());
        }
        return I(e2.d());
    }

    private qb7<Boolean> n(v<Boolean> vVar) {
        return this.b.b(vVar.b());
    }

    private qb7<Double> o(v<Double> vVar) {
        return this.b.c(vVar.b());
    }

    private qb7<Long> p(v<Long> vVar) {
        return this.b.e(vVar.b());
    }

    private qb7<Boolean> u(v<Boolean> vVar) {
        return this.a.getBoolean(vVar.c());
    }

    private qb7<Double> v(v<Double> vVar) {
        return this.a.getDouble(vVar.c());
    }

    private qb7<Long> w(v<Long> vVar) {
        return this.a.getLong(vVar.c());
    }

    private qb7<String> x(v<String> vVar) {
        return this.a.getString(vVar.c());
    }

    public long A() {
        o e2 = o.e();
        qb7<Long> p = p(e2);
        if (p.d() && M(p.c().longValue())) {
            return p.c().longValue();
        }
        qb7<Long> w = w(e2);
        if (w.d() && M(w.c().longValue())) {
            this.c.k(e2.a(), w.c().longValue());
            return w.c().longValue();
        }
        qb7<Long> d2 = d(e2);
        if (d2.d() && M(d2.c().longValue())) {
            return d2.c().longValue();
        }
        return e2.d().longValue();
    }

    public long B() {
        p e2 = p.e();
        qb7<Long> p = p(e2);
        if (p.d() && J(p.c().longValue())) {
            return p.c().longValue();
        }
        qb7<Long> w = w(e2);
        if (w.d() && J(w.c().longValue())) {
            this.c.k(e2.a(), w.c().longValue());
            return w.c().longValue();
        }
        qb7<Long> d2 = d(e2);
        if (d2.d() && J(d2.c().longValue())) {
            return d2.c().longValue();
        }
        return e2.d().longValue();
    }

    public long C() {
        q f = q.f();
        qb7<Long> p = p(f);
        if (p.d() && J(p.c().longValue())) {
            return p.c().longValue();
        }
        qb7<Long> w = w(f);
        if (w.d() && J(w.c().longValue())) {
            this.c.k(f.a(), w.c().longValue());
            return w.c().longValue();
        }
        qb7<Long> d2 = d(f);
        if (d2.d() && J(d2.c().longValue())) {
            return d2.c().longValue();
        }
        if (this.a.isLastFetchFailed()) {
            return f.e().longValue();
        }
        return f.d().longValue();
    }

    public double D() {
        r f = r.f();
        qb7<Double> o = o(f);
        if (o.d()) {
            double doubleValue = o.c().doubleValue() / 100.0d;
            if (L(doubleValue)) {
                return doubleValue;
            }
        }
        qb7<Double> v = v(f);
        if (v.d() && L(v.c().doubleValue())) {
            this.c.j(f.a(), v.c().doubleValue());
            return v.c().doubleValue();
        }
        qb7<Double> c = c(f);
        if (c.d() && L(c.c().doubleValue())) {
            return c.c().doubleValue();
        }
        if (this.a.isLastFetchFailed()) {
            return f.e().doubleValue();
        }
        return f.d().doubleValue();
    }

    public long E() {
        s e2 = s.e();
        qb7<Long> w = w(e2);
        if (w.d() && H(w.c().longValue())) {
            this.c.k(e2.a(), w.c().longValue());
            return w.c().longValue();
        }
        qb7<Long> d2 = d(e2);
        if (d2.d() && H(d2.c().longValue())) {
            return d2.c().longValue();
        }
        return e2.d().longValue();
    }

    public long F() {
        t e2 = t.e();
        qb7<Long> w = w(e2);
        if (w.d() && H(w.c().longValue())) {
            this.c.k(e2.a(), w.c().longValue());
            return w.c().longValue();
        }
        qb7<Long> d2 = d(e2);
        if (d2.d() && H(d2.c().longValue())) {
            return d2.c().longValue();
        }
        return e2.d().longValue();
    }

    public double G() {
        u f = u.f();
        qb7<Double> v = v(f);
        if (v.d() && L(v.c().doubleValue())) {
            this.c.j(f.a(), v.c().doubleValue());
            return v.c().doubleValue();
        }
        qb7<Double> c = c(f);
        if (c.d() && L(c.c().doubleValue())) {
            return c.c().doubleValue();
        }
        if (this.a.isLastFetchFailed()) {
            return f.e().doubleValue();
        }
        return f.d().doubleValue();
    }

    public boolean K() {
        Boolean j = j();
        if ((j == null || j.booleanValue()) && m()) {
            return true;
        }
        return false;
    }

    public void O(Context context) {
        d.i(hvb.b(context));
        this.c.i(context);
    }

    public void P(tw4 tw4Var) {
        this.b = tw4Var;
    }

    public String a() {
        String f;
        f e2 = f.e();
        if (ih0.a.booleanValue()) {
            return e2.d();
        }
        String c = e2.c();
        long j = -1;
        if (c != null) {
            j = ((Long) this.a.getRemoteConfigValueOrDefault(c, -1L)).longValue();
        }
        String a = e2.a();
        if (f.g(j) && (f = f.f(j)) != null) {
            this.c.l(a, f);
            return f;
        }
        qb7<String> e3 = e(e2);
        if (e3.d()) {
            return e3.c();
        }
        return e2.d();
    }

    public double f() {
        e e2 = e.e();
        qb7<Double> o = o(e2);
        if (o.d()) {
            double doubleValue = o.c().doubleValue() / 100.0d;
            if (L(doubleValue)) {
                return doubleValue;
            }
        }
        qb7<Double> v = v(e2);
        if (v.d() && L(v.c().doubleValue())) {
            this.c.j(e2.a(), v.c().doubleValue());
            return v.c().doubleValue();
        }
        qb7<Double> c = c(e2);
        if (c.d() && L(c.c().doubleValue())) {
            return c.c().doubleValue();
        }
        return e2.d().doubleValue();
    }

    public boolean h() {
        d e2 = d.e();
        qb7<Boolean> n = n(e2);
        if (n.d()) {
            return n.c().booleanValue();
        }
        qb7<Boolean> u = u(e2);
        if (u.d()) {
            this.c.m(e2.a(), u.c().booleanValue());
            return u.c().booleanValue();
        }
        qb7<Boolean> b = b(e2);
        if (b.d()) {
            return b.c().booleanValue();
        }
        return e2.d().booleanValue();
    }

    public Boolean i() {
        b e2 = b.e();
        qb7<Boolean> n = n(e2);
        if (n.d()) {
            return n.c();
        }
        return e2.d();
    }

    public Boolean j() {
        if (i().booleanValue()) {
            return Boolean.FALSE;
        }
        c d2 = c.d();
        qb7<Boolean> b = b(d2);
        if (b.d()) {
            return b.c();
        }
        qb7<Boolean> n = n(d2);
        if (n.d()) {
            return n.c();
        }
        return null;
    }

    public boolean m() {
        if (k() && !l()) {
            return true;
        }
        return false;
    }

    public long q() {
        g e2 = g.e();
        qb7<Long> w = w(e2);
        if (w.d() && H(w.c().longValue())) {
            this.c.k(e2.a(), w.c().longValue());
            return w.c().longValue();
        }
        qb7<Long> d2 = d(e2);
        if (d2.d() && H(d2.c().longValue())) {
            return d2.c().longValue();
        }
        return e2.d().longValue();
    }

    public long r() {
        h e2 = h.e();
        qb7<Long> w = w(e2);
        if (w.d() && H(w.c().longValue())) {
            this.c.k(e2.a(), w.c().longValue());
            return w.c().longValue();
        }
        qb7<Long> d2 = d(e2);
        if (d2.d() && H(d2.c().longValue())) {
            return d2.c().longValue();
        }
        return e2.d().longValue();
    }

    public double s() {
        i f = i.f();
        qb7<Double> v = v(f);
        if (v.d() && L(v.c().doubleValue())) {
            this.c.j(f.a(), v.c().doubleValue());
            return v.c().doubleValue();
        }
        qb7<Double> c = c(f);
        if (c.d() && L(c.c().doubleValue())) {
            return c.c().doubleValue();
        }
        if (this.a.isLastFetchFailed()) {
            return f.e().doubleValue();
        }
        return f.d().doubleValue();
    }

    public long t() {
        j e2 = j.e();
        qb7<Long> w = w(e2);
        if (w.d() && N(w.c().longValue())) {
            this.c.k(e2.a(), w.c().longValue());
            return w.c().longValue();
        }
        qb7<Long> d2 = d(e2);
        if (d2.d() && N(d2.c().longValue())) {
            return d2.c().longValue();
        }
        return e2.d().longValue();
    }

    public long y() {
        m e2 = m.e();
        qb7<Long> p = p(e2);
        if (p.d() && J(p.c().longValue())) {
            return p.c().longValue();
        }
        qb7<Long> w = w(e2);
        if (w.d() && J(w.c().longValue())) {
            this.c.k(e2.a(), w.c().longValue());
            return w.c().longValue();
        }
        qb7<Long> d2 = d(e2);
        if (d2.d() && J(d2.c().longValue())) {
            return d2.c().longValue();
        }
        return e2.d().longValue();
    }

    public long z() {
        n f = n.f();
        qb7<Long> p = p(f);
        if (p.d() && J(p.c().longValue())) {
            return p.c().longValue();
        }
        qb7<Long> w = w(f);
        if (w.d() && J(w.c().longValue())) {
            this.c.k(f.a(), w.c().longValue());
            return w.c().longValue();
        }
        qb7<Long> d2 = d(f);
        if (d2.d() && J(d2.c().longValue())) {
            return d2.c().longValue();
        }
        if (this.a.isLastFetchFailed()) {
            return f.e().longValue();
        }
        return f.d().longValue();
    }
}
