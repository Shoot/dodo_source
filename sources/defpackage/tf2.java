package defpackage;

import android.content.Context;
import defpackage.k46;
import ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies;
import ru.dodopizza.app.domain.DodopizzaApi;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.app.presentation.main.MainActivity;
import ru.dodopizza.app.presentation.main.MainActivityPresenter;
/* compiled from: DaggerMainActivityComponent.java */
/* renamed from: tf2  reason: default package */
/* loaded from: classes3.dex */
public final class tf2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerMainActivityComponent.java */
    /* renamed from: tf2$a */
    /* loaded from: classes3.dex */
    public static final class a implements k46.b {
        private a() {
        }

        @Override // defpackage.k46.b
        public k46 a(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
            jh8.b(mainActivityFeatureDependencies);
            return new b(mainActivityFeatureDependencies);
        }
    }

    /* compiled from: DaggerMainActivityComponent.java */
    /* renamed from: tf2$b */
    /* loaded from: classes3.dex */
    private static final class b implements k46 {
        private as8<fz4> A;
        private as8<k37> B;
        private as8<qx1> C;
        private as8<m37> D;
        private as8<c55> E;
        private as8<hq3> F;
        private as8<e55> G;
        private as8<mqb> H;
        private as8<ru.dodopizza.app.presentation.main.a> I;
        private as8<MainActivityPresenter> J;
        private as8<ey7> K;
        private as8<h37> L;
        private final MainActivityFeatureDependencies b;
        private final b c;
        private as8<Cdo> d;
        private as8<f63> e;
        private as8<ci8> f;
        private as8<gc> g;
        private as8<jv5> h;
        private as8<CountryService> i;
        private as8<xu8> j;
        private as8<DodopizzaApi> k;
        private as8<ava> l;
        private as8<xda> m;
        private as8<tda> n;
        private as8<a98> o;
        private as8<v52> p;
        private as8<bo> q;
        private as8<vc6> r;
        private as8<Context> s;
        private as8<mh0> t;
        private as8<fm> u;
        private as8<kx1> v;
        private as8<l46> w;
        private as8<dq3> x;
        private as8<hp> y;
        private as8<k63> z;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$a */
        /* loaded from: classes3.dex */
        public static final class a implements as8<gc> {
            private final MainActivityFeatureDependencies a;

            a(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$a0 */
        /* loaded from: classes3.dex */
        public static final class a0 implements as8<mqb> {
            private final MainActivityFeatureDependencies a;

            a0(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public mqb get() {
                return (mqb) jh8.d(this.a.v1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0676b implements as8<bo> {
            private final MainActivityFeatureDependencies a;

            C0676b(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public bo get() {
                return (bo) jh8.d(this.a.x());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$c */
        /* loaded from: classes3.dex */
        public static final class c implements as8<Cdo> {
            private final MainActivityFeatureDependencies a;

            c(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public Cdo get() {
                return (Cdo) jh8.d(this.a.j());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$d */
        /* loaded from: classes3.dex */
        public static final class d implements as8<hp> {
            private final MainActivityFeatureDependencies a;

            d(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hp get() {
                return (hp) jh8.d(this.a.P());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$e */
        /* loaded from: classes3.dex */
        public static final class e implements as8<mh0> {
            private final MainActivityFeatureDependencies a;

            e(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public mh0 get() {
                return (mh0) jh8.d(this.a.i());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$f */
        /* loaded from: classes3.dex */
        public static final class f implements as8<Context> {
            private final MainActivityFeatureDependencies a;

            f(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public Context get() {
                return (Context) jh8.d(this.a.getContext());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$g */
        /* loaded from: classes3.dex */
        public static final class g implements as8<ey7> {
            private final MainActivityFeatureDependencies a;

            g(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ey7 get() {
                return (ey7) jh8.d(this.a.C0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$h */
        /* loaded from: classes3.dex */
        public static final class h implements as8<CountryService> {
            private final MainActivityFeatureDependencies a;

            h(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public CountryService get() {
                return (CountryService) jh8.d(this.a.e());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$i */
        /* loaded from: classes3.dex */
        public static final class i implements as8<v52> {
            private final MainActivityFeatureDependencies a;

            i(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public v52 get() {
                return (v52) jh8.d(this.a.c0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$j */
        /* loaded from: classes3.dex */
        public static final class j implements as8<DodopizzaApi> {
            private final MainActivityFeatureDependencies a;

            j(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public DodopizzaApi get() {
                return (DodopizzaApi) jh8.d(this.a.w0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$k */
        /* loaded from: classes3.dex */
        public static final class k implements as8<k63> {
            private final MainActivityFeatureDependencies a;

            k(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public k63 get() {
                return (k63) jh8.d(this.a.I());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$l */
        /* loaded from: classes3.dex */
        public static final class l implements as8<dq3> {
            private final MainActivityFeatureDependencies a;

            l(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public dq3 get() {
                return (dq3) jh8.d(this.a.U());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$m */
        /* loaded from: classes3.dex */
        public static final class m implements as8<hq3> {
            private final MainActivityFeatureDependencies a;

            m(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hq3 get() {
                return (hq3) jh8.d(this.a.c());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$n */
        /* loaded from: classes3.dex */
        public static final class n implements as8<fz4> {
            private final MainActivityFeatureDependencies a;

            n(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public fz4 get() {
                return (fz4) jh8.d(this.a.m1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$o */
        /* loaded from: classes3.dex */
        public static final class o implements as8<kx1> {
            private final MainActivityFeatureDependencies a;

            o(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public kx1 get() {
                return (kx1) jh8.d(this.a.d());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$p */
        /* loaded from: classes3.dex */
        public static final class p implements as8<jv5> {
            private final MainActivityFeatureDependencies a;

            p(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public jv5 get() {
                return (jv5) jh8.d(this.a.f());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$q */
        /* loaded from: classes3.dex */
        public static final class q implements as8<vc6> {
            private final MainActivityFeatureDependencies a;

            q(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public vc6 get() {
                return (vc6) jh8.d(this.a.g0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$r */
        /* loaded from: classes3.dex */
        public static final class r implements as8<a98> {
            private final MainActivityFeatureDependencies a;

            r(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public a98 get() {
                return (a98) jh8.d(this.a.s0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$s */
        /* loaded from: classes3.dex */
        public static final class s implements as8<ci8> {
            private final MainActivityFeatureDependencies a;

            s(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ci8 get() {
                return (ci8) jh8.d(this.a.G());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$t */
        /* loaded from: classes3.dex */
        public static final class t implements as8<qx1> {
            private final MainActivityFeatureDependencies a;

            t(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public qx1 get() {
                return (qx1) jh8.d(this.a.q());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$u */
        /* loaded from: classes3.dex */
        public static final class u implements as8<xu8> {
            private final MainActivityFeatureDependencies a;

            u(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public xu8 get() {
                return (xu8) jh8.d(this.a.I2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$v */
        /* loaded from: classes3.dex */
        public static final class v implements as8<ru.dodopizza.app.presentation.main.a> {
            private final MainActivityFeatureDependencies a;

            v(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ru.dodopizza.app.presentation.main.a get() {
                return (ru.dodopizza.app.presentation.main.a) jh8.d(this.a.N3());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$w */
        /* loaded from: classes3.dex */
        public static final class w implements as8<f63> {
            private final MainActivityFeatureDependencies a;

            w(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$x */
        /* loaded from: classes3.dex */
        public static final class x implements as8<tda> {
            private final MainActivityFeatureDependencies a;

            x(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public tda get() {
                return (tda) jh8.d(this.a.H2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$y */
        /* loaded from: classes3.dex */
        public static final class y implements as8<xda> {
            private final MainActivityFeatureDependencies a;

            y(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public xda get() {
                return (xda) jh8.d(this.a.W());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerMainActivityComponent.java */
        /* renamed from: tf2$b$z */
        /* loaded from: classes3.dex */
        public static final class z implements as8<ava> {
            private final MainActivityFeatureDependencies a;

            z(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
                this.a = mainActivityFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ava get() {
                return (ava) jh8.d(this.a.h());
            }
        }

        private z5 b() {
            return o46.a((sg4) jh8.d(this.b.a2()), (t28) jh8.d(this.b.A3()));
        }

        private void c(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
            this.d = new c(mainActivityFeatureDependencies);
            this.e = new w(mainActivityFeatureDependencies);
            this.f = new s(mainActivityFeatureDependencies);
            this.g = new a(mainActivityFeatureDependencies);
            this.h = new p(mainActivityFeatureDependencies);
            this.i = new h(mainActivityFeatureDependencies);
            this.j = new u(mainActivityFeatureDependencies);
            this.k = new j(mainActivityFeatureDependencies);
            this.l = new z(mainActivityFeatureDependencies);
            this.m = new y(mainActivityFeatureDependencies);
            this.n = new x(mainActivityFeatureDependencies);
            this.o = new r(mainActivityFeatureDependencies);
            this.p = new i(mainActivityFeatureDependencies);
            this.q = new C0676b(mainActivityFeatureDependencies);
            this.r = new q(mainActivityFeatureDependencies);
            this.s = new f(mainActivityFeatureDependencies);
            e eVar = new e(mainActivityFeatureDependencies);
            this.t = eVar;
            this.u = p63.a(hm.a(this.q, this.r, this.s, eVar, this.k));
            o oVar = new o(mainActivityFeatureDependencies);
            this.v = oVar;
            this.w = p63.a(m46.a(this.h, this.i, this.j, this.k, this.l, this.g, this.m, this.n, this.o, this.p, this.u, this.q, oVar));
            this.x = new l(mainActivityFeatureDependencies);
            this.y = new d(mainActivityFeatureDependencies);
            this.z = new k(mainActivityFeatureDependencies);
            this.A = new n(mainActivityFeatureDependencies);
            this.B = l37.a(this.s);
            t tVar = new t(mainActivityFeatureDependencies);
            this.C = tVar;
            this.D = p63.a(n37.a(this.g, this.f, this.B, this.v, tVar));
            this.E = d55.a(this.s);
            m mVar = new m(mainActivityFeatureDependencies);
            this.F = mVar;
            this.G = p63.a(f55.a(this.g, this.f, this.E, mVar, this.v, this.C));
            this.H = new a0(mainActivityFeatureDependencies);
            v vVar = new v(mainActivityFeatureDependencies);
            this.I = vVar;
            this.J = p63.a(p46.a(this.d, this.e, this.f, this.g, this.w, this.x, this.y, this.r, this.z, this.A, this.D, this.G, this.H, vVar));
            g gVar = new g(mainActivityFeatureDependencies);
            this.K = gVar;
            this.L = p63.a(i37.a(this.g, this.F, gVar));
        }

        private MainActivity d(MainActivity mainActivity) {
            s46.d(mainActivity, (dv6) jh8.d(this.b.K0()));
            s46.b(mainActivity, (xr0) jh8.d(this.b.G1()));
            s46.c(mainActivity, (ug4) jh8.d(this.b.q3()));
            s46.a(mainActivity, b());
            s46.f(mainActivity, (my7) jh8.d(this.b.Y2()));
            s46.h(mainActivity, (b79) jh8.d(this.b.n2()));
            s46.g(mainActivity, this.J);
            s46.e(mainActivity, this.L.get());
            return mainActivity;
        }

        @Override // defpackage.k46
        public void a(MainActivity mainActivity) {
            d(mainActivity);
        }

        private b(MainActivityFeatureDependencies mainActivityFeatureDependencies) {
            this.c = this;
            this.b = mainActivityFeatureDependencies;
            c(mainActivityFeatureDependencies);
        }
    }

    public static k46.b a() {
        return new a();
    }
}
