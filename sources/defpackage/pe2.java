package defpackage;

import defpackage.ll4;
import defpackage.ym;
import kotlin.Pair;
import ru.dodopizza.app.di.modules.presentation.product.card.halves.HalvesProductCardFeatureDependencies;
import ru.dodopizza.app.presentation.product.card.halves.HalvesProductCardPresenter;
/* compiled from: DaggerHalvesProductCardComponent.java */
/* renamed from: pe2  reason: default package */
/* loaded from: classes3.dex */
public final class pe2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerHalvesProductCardComponent.java */
    /* renamed from: pe2$a */
    /* loaded from: classes3.dex */
    public static final class a implements ll4.b {
        private a() {
        }

        @Override // defpackage.ll4.b
        public ll4 a(HalvesProductCardFeatureDependencies halvesProductCardFeatureDependencies, Pair<String, String> pair, ym.d dVar, String str) {
            jh8.b(halvesProductCardFeatureDependencies);
            jh8.b(pair);
            jh8.b(dVar);
            jh8.b(str);
            return new b(halvesProductCardFeatureDependencies, pair, dVar, str);
        }
    }

    /* compiled from: DaggerHalvesProductCardComponent.java */
    /* renamed from: pe2$b */
    /* loaded from: classes3.dex */
    private static final class b implements ll4 {
        private final b b;
        private as8<vu4> c;
        private as8<Pair<String, String>> d;
        private as8<ym.d> e;
        private as8<String> f;
        private as8<ah6> g;
        private as8<ds0> h;
        private as8<sq0> i;
        private as8<g78> j;
        private as8<e78> k;
        private as8<gc> l;
        private as8<ql4> m;
        private as8<f63> n;
        private as8<HalvesProductCardPresenter> o;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerHalvesProductCardComponent.java */
        /* renamed from: pe2$b$a */
        /* loaded from: classes3.dex */
        public static final class a implements as8<gc> {
            private final HalvesProductCardFeatureDependencies a;

            a(HalvesProductCardFeatureDependencies halvesProductCardFeatureDependencies) {
                this.a = halvesProductCardFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerHalvesProductCardComponent.java */
        /* renamed from: pe2$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0477b implements as8<sq0> {
            private final HalvesProductCardFeatureDependencies a;

            C0477b(HalvesProductCardFeatureDependencies halvesProductCardFeatureDependencies) {
                this.a = halvesProductCardFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public sq0 get() {
                return (sq0) jh8.d(this.a.u());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerHalvesProductCardComponent.java */
        /* renamed from: pe2$b$c */
        /* loaded from: classes3.dex */
        public static final class c implements as8<ds0> {
            private final HalvesProductCardFeatureDependencies a;

            c(HalvesProductCardFeatureDependencies halvesProductCardFeatureDependencies) {
                this.a = halvesProductCardFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ds0 get() {
                return (ds0) jh8.d(this.a.o());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerHalvesProductCardComponent.java */
        /* renamed from: pe2$b$d */
        /* loaded from: classes3.dex */
        public static final class d implements as8<f63> {
            private final HalvesProductCardFeatureDependencies a;

            d(HalvesProductCardFeatureDependencies halvesProductCardFeatureDependencies) {
                this.a = halvesProductCardFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.s());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerHalvesProductCardComponent.java */
        /* renamed from: pe2$b$e */
        /* loaded from: classes3.dex */
        public static final class e implements as8<ah6> {
            private final HalvesProductCardFeatureDependencies a;

            e(HalvesProductCardFeatureDependencies halvesProductCardFeatureDependencies) {
                this.a = halvesProductCardFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ah6 get() {
                return (ah6) jh8.d(this.a.l());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerHalvesProductCardComponent.java */
        /* renamed from: pe2$b$f */
        /* loaded from: classes3.dex */
        public static final class f implements as8<e78> {
            private final HalvesProductCardFeatureDependencies a;

            f(HalvesProductCardFeatureDependencies halvesProductCardFeatureDependencies) {
                this.a = halvesProductCardFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public e78 get() {
                return (e78) jh8.d(this.a.w());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerHalvesProductCardComponent.java */
        /* renamed from: pe2$b$g */
        /* loaded from: classes3.dex */
        public static final class g implements as8<g78> {
            private final HalvesProductCardFeatureDependencies a;

            g(HalvesProductCardFeatureDependencies halvesProductCardFeatureDependencies) {
                this.a = halvesProductCardFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public g78 get() {
                return (g78) jh8.d(this.a.N());
            }
        }

        private void b(HalvesProductCardFeatureDependencies halvesProductCardFeatureDependencies, Pair<String, String> pair, ym.d dVar, String str) {
            this.c = p63.a(ul4.a());
            this.d = z45.a(pair);
            this.e = z45.a(dVar);
            this.f = z45.a(str);
            this.g = new e(halvesProductCardFeatureDependencies);
            this.h = new c(halvesProductCardFeatureDependencies);
            this.i = new C0477b(halvesProductCardFeatureDependencies);
            this.j = new g(halvesProductCardFeatureDependencies);
            this.k = new f(halvesProductCardFeatureDependencies);
            a aVar = new a(halvesProductCardFeatureDependencies);
            this.l = aVar;
            this.m = p63.a(sl4.a(this.g, this.h, this.i, this.j, this.k, aVar));
            d dVar2 = new d(halvesProductCardFeatureDependencies);
            this.n = dVar2;
            this.o = p63.a(tl4.a(this.d, this.e, this.f, this.m, dVar2));
        }

        private nl4 c(nl4 nl4Var) {
            ol4.a(nl4Var, this.c.get());
            ol4.b(nl4Var, this.o);
            return nl4Var;
        }

        @Override // defpackage.ll4
        public void a(nl4 nl4Var) {
            c(nl4Var);
        }

        private b(HalvesProductCardFeatureDependencies halvesProductCardFeatureDependencies, Pair<String, String> pair, ym.d dVar, String str) {
            this.b = this;
            b(halvesProductCardFeatureDependencies, pair, dVar, str);
        }
    }

    public static ll4.b a() {
        return new a();
    }
}
