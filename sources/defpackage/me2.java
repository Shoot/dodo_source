package defpackage;

import com.dodopizza.order.feature.halves.HalvesFeatureDependencies;
import com.dodopizza.order.feature.halves.constructor.presentation.HalvesConstructorPresenter;
import defpackage.dk4;
/* compiled from: DaggerHalvesConstructorComponent.java */
/* renamed from: me2  reason: default package */
/* loaded from: classes2.dex */
public final class me2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerHalvesConstructorComponent.java */
    /* renamed from: me2$a */
    /* loaded from: classes2.dex */
    public static final class a implements dk4.b {
        private a() {
        }

        @Override // defpackage.dk4.b
        public dk4 a(ek4 ek4Var, HalvesFeatureDependencies halvesFeatureDependencies) {
            jh8.b(ek4Var);
            jh8.b(halvesFeatureDependencies);
            return new b(halvesFeatureDependencies, ek4Var);
        }
    }

    /* compiled from: DaggerHalvesConstructorComponent.java */
    /* renamed from: me2$b */
    /* loaded from: classes2.dex */
    private static final class b implements dk4 {
        private final b b;
        private as8<ek4> c;
        private as8<ah6> d;
        private as8<e78> e;
        private as8<qm8> f;
        private as8<lk4> g;
        private as8<f63> h;
        private as8<gc> i;
        private as8<tk4> j;
        private as8<hq3> k;
        private as8<HalvesConstructorPresenter> l;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerHalvesConstructorComponent.java */
        /* renamed from: me2$b$a */
        /* loaded from: classes2.dex */
        public static final class a implements as8<gc> {
            private final HalvesFeatureDependencies a;

            a(HalvesFeatureDependencies halvesFeatureDependencies) {
                this.a = halvesFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerHalvesConstructorComponent.java */
        /* renamed from: me2$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0437b implements as8<tk4> {
            private final HalvesFeatureDependencies a;

            C0437b(HalvesFeatureDependencies halvesFeatureDependencies) {
                this.a = halvesFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public tk4 get() {
                return (tk4) jh8.d(this.a.X3());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerHalvesConstructorComponent.java */
        /* renamed from: me2$b$c */
        /* loaded from: classes2.dex */
        public static final class c implements as8<hq3> {
            private final HalvesFeatureDependencies a;

            c(HalvesFeatureDependencies halvesFeatureDependencies) {
                this.a = halvesFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hq3 get() {
                return (hq3) jh8.d(this.a.c());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerHalvesConstructorComponent.java */
        /* renamed from: me2$b$d */
        /* loaded from: classes2.dex */
        public static final class d implements as8<ah6> {
            private final HalvesFeatureDependencies a;

            d(HalvesFeatureDependencies halvesFeatureDependencies) {
                this.a = halvesFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ah6 get() {
                return (ah6) jh8.d(this.a.l());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerHalvesConstructorComponent.java */
        /* renamed from: me2$b$e */
        /* loaded from: classes2.dex */
        public static final class e implements as8<e78> {
            private final HalvesFeatureDependencies a;

            e(HalvesFeatureDependencies halvesFeatureDependencies) {
                this.a = halvesFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public e78 get() {
                return (e78) jh8.d(this.a.w());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerHalvesConstructorComponent.java */
        /* renamed from: me2$b$f */
        /* loaded from: classes2.dex */
        public static final class f implements as8<f63> {
            private final HalvesFeatureDependencies a;

            f(HalvesFeatureDependencies halvesFeatureDependencies) {
                this.a = halvesFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerHalvesConstructorComponent.java */
        /* renamed from: me2$b$g */
        /* loaded from: classes2.dex */
        public static final class g implements as8<qm8> {
            private final HalvesFeatureDependencies a;

            g(HalvesFeatureDependencies halvesFeatureDependencies) {
                this.a = halvesFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public qm8 get() {
                return (qm8) jh8.d(this.a.b3());
            }
        }

        private void b(HalvesFeatureDependencies halvesFeatureDependencies, ek4 ek4Var) {
            this.c = z45.a(ek4Var);
            this.d = new d(halvesFeatureDependencies);
            this.e = new e(halvesFeatureDependencies);
            g gVar = new g(halvesFeatureDependencies);
            this.f = gVar;
            this.g = p63.a(mk4.a(this.d, this.e, gVar));
            this.h = new f(halvesFeatureDependencies);
            this.i = new a(halvesFeatureDependencies);
            this.j = new C0437b(halvesFeatureDependencies);
            this.k = new c(halvesFeatureDependencies);
            this.l = p63.a(rk4.a(this.c, this.g, this.h, pk4.a(), this.i, this.j, this.k));
        }

        private com.dodopizza.order.feature.halves.constructor.presentation.a c(com.dodopizza.order.feature.halves.constructor.presentation.a aVar) {
            kk4.a(aVar, this.l);
            return aVar;
        }

        @Override // defpackage.dk4
        public void a(com.dodopizza.order.feature.halves.constructor.presentation.a aVar) {
            c(aVar);
        }

        private b(HalvesFeatureDependencies halvesFeatureDependencies, ek4 ek4Var) {
            this.b = this;
            b(halvesFeatureDependencies, ek4Var);
        }
    }

    public static dk4.b a() {
        return new a();
    }
}
