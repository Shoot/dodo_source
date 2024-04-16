package defpackage;

import com.google.gson.Gson;
import defpackage.goa;
import defpackage.ym;
import ru.dodopizza.app.di.modules.presentation.product.card.snack.SnackProductCardFeatureDependencies;
import ru.dodopizza.app.presentation.product.card.snacks.SnackProductCardPresenter;
/* compiled from: DaggerSnackProductCardComponent.java */
/* renamed from: lj2  reason: default package */
/* loaded from: classes3.dex */
public final class lj2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerSnackProductCardComponent.java */
    /* renamed from: lj2$a */
    /* loaded from: classes3.dex */
    public static final class a implements goa.b {
        private a() {
        }

        @Override // defpackage.goa.b
        public goa a(SnackProductCardFeatureDependencies snackProductCardFeatureDependencies, String str, String str2, ym.d dVar) {
            jh8.b(snackProductCardFeatureDependencies);
            jh8.b(str);
            jh8.b(dVar);
            return new b(snackProductCardFeatureDependencies, str, str2, dVar);
        }
    }

    /* compiled from: DaggerSnackProductCardComponent.java */
    /* renamed from: lj2$b */
    /* loaded from: classes3.dex */
    private static final class b implements goa {
        private final b b;
        private as8<String> c;
        private as8<String> d;
        private as8<ym.d> e;
        private as8<ah6> f;
        private as8<ds0> g;
        private as8<sq0> h;
        private as8<gc> i;
        private as8<Gson> j;
        private as8<ue6> k;
        private as8<koa> l;
        private as8<f63> m;
        private as8<f5b> n;
        private as8<SnackProductCardPresenter> o;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSnackProductCardComponent.java */
        /* renamed from: lj2$b$a */
        /* loaded from: classes3.dex */
        public static final class a implements as8<gc> {
            private final SnackProductCardFeatureDependencies a;

            a(SnackProductCardFeatureDependencies snackProductCardFeatureDependencies) {
                this.a = snackProductCardFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSnackProductCardComponent.java */
        /* renamed from: lj2$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0427b implements as8<sq0> {
            private final SnackProductCardFeatureDependencies a;

            C0427b(SnackProductCardFeatureDependencies snackProductCardFeatureDependencies) {
                this.a = snackProductCardFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public sq0 get() {
                return (sq0) jh8.d(this.a.u());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSnackProductCardComponent.java */
        /* renamed from: lj2$b$c */
        /* loaded from: classes3.dex */
        public static final class c implements as8<ds0> {
            private final SnackProductCardFeatureDependencies a;

            c(SnackProductCardFeatureDependencies snackProductCardFeatureDependencies) {
                this.a = snackProductCardFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ds0 get() {
                return (ds0) jh8.d(this.a.o());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSnackProductCardComponent.java */
        /* renamed from: lj2$b$d */
        /* loaded from: classes3.dex */
        public static final class d implements as8<f63> {
            private final SnackProductCardFeatureDependencies a;

            d(SnackProductCardFeatureDependencies snackProductCardFeatureDependencies) {
                this.a = snackProductCardFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.s());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSnackProductCardComponent.java */
        /* renamed from: lj2$b$e */
        /* loaded from: classes3.dex */
        public static final class e implements as8<Gson> {
            private final SnackProductCardFeatureDependencies a;

            e(SnackProductCardFeatureDependencies snackProductCardFeatureDependencies) {
                this.a = snackProductCardFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public Gson get() {
                return (Gson) jh8.d(this.a.R0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSnackProductCardComponent.java */
        /* renamed from: lj2$b$f */
        /* loaded from: classes3.dex */
        public static final class f implements as8<ah6> {
            private final SnackProductCardFeatureDependencies a;

            f(SnackProductCardFeatureDependencies snackProductCardFeatureDependencies) {
                this.a = snackProductCardFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ah6 get() {
                return (ah6) jh8.d(this.a.l());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSnackProductCardComponent.java */
        /* renamed from: lj2$b$g */
        /* loaded from: classes3.dex */
        public static final class g implements as8<f5b> {
            private final SnackProductCardFeatureDependencies a;

            g(SnackProductCardFeatureDependencies snackProductCardFeatureDependencies) {
                this.a = snackProductCardFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f5b get() {
                return (f5b) jh8.d(this.a.t());
            }
        }

        private void b(SnackProductCardFeatureDependencies snackProductCardFeatureDependencies, String str, String str2, ym.d dVar) {
            this.c = z45.a(str);
            this.d = z45.b(str2);
            this.e = z45.a(dVar);
            this.f = new f(snackProductCardFeatureDependencies);
            this.g = new c(snackProductCardFeatureDependencies);
            this.h = new C0427b(snackProductCardFeatureDependencies);
            this.i = new a(snackProductCardFeatureDependencies);
            e eVar = new e(snackProductCardFeatureDependencies);
            this.j = eVar;
            ve6 a2 = ve6.a(eVar);
            this.k = a2;
            this.l = p63.a(noa.a(this.f, this.g, this.h, this.i, a2));
            this.m = new d(snackProductCardFeatureDependencies);
            g gVar = new g(snackProductCardFeatureDependencies);
            this.n = gVar;
            this.o = p63.a(moa.a(this.c, this.d, this.e, this.l, this.m, gVar, p18.a()));
        }

        private ioa c(ioa ioaVar) {
            joa.b(ioaVar, q18.a());
            joa.a(ioaVar, this.o);
            return ioaVar;
        }

        @Override // defpackage.goa
        public void a(ioa ioaVar) {
            c(ioaVar);
        }

        private b(SnackProductCardFeatureDependencies snackProductCardFeatureDependencies, String str, String str2, ym.d dVar) {
            this.b = this;
            b(snackProductCardFeatureDependencies, str, str2, dVar);
        }
    }

    public static goa.b a() {
        return new a();
    }
}
