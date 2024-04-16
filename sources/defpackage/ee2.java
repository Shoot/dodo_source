package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.c;
/* compiled from: DaggerFirebasePerformanceComponent.java */
/* renamed from: ee2  reason: default package */
/* loaded from: classes2.dex */
public final class ee2 implements ww3 {
    private as8<qv3> a;
    private as8<bs8<c>> b;
    private as8<ew3> c;
    private as8<bs8<xlb>> d;
    private as8<RemoteConfigManager> e;
    private as8<com.google.firebase.perf.config.a> f;
    private as8<SessionManager> g;
    private as8<vw3> h;

    /* compiled from: DaggerFirebasePerformanceComponent.java */
    /* renamed from: ee2$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private yw3 a;

        public ww3 a() {
            jh8.a(this.a, yw3.class);
            return new ee2(this.a);
        }

        public b b(yw3 yw3Var) {
            this.a = (yw3) jh8.b(yw3Var);
            return this;
        }

        private b() {
        }
    }

    public static b b() {
        return new b();
    }

    private void c(yw3 yw3Var) {
        this.a = ax3.a(yw3Var);
        this.b = cx3.a(yw3Var);
        this.c = bx3.a(yw3Var);
        this.d = fx3.a(yw3Var);
        this.e = dx3.a(yw3Var);
        this.f = zw3.a(yw3Var);
        ex3 a2 = ex3.a(yw3Var);
        this.g = a2;
        this.h = p63.a(gx3.a(this.a, this.b, this.c, this.d, this.e, this.f, a2));
    }

    @Override // defpackage.ww3
    public vw3 a() {
        return this.h.get();
    }

    private ee2(yw3 yw3Var) {
        c(yw3Var);
    }
}
