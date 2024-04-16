package defpackage;

import defpackage.tt5;
import ru.dodopizza.app.di.modules.presentation.selectlocation.localitylist.LocalityListFeatureDependencies;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.app.presentation.selectlocation.localitylist.LocalityListPresenter;
/* compiled from: DaggerLocalityListComponent.java */
/* renamed from: hf2  reason: default package */
/* loaded from: classes3.dex */
public final class hf2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerLocalityListComponent.java */
    /* renamed from: hf2$a */
    /* loaded from: classes3.dex */
    public static final class a implements tt5.b {
        private a() {
        }

        @Override // defpackage.tt5.b
        public tt5 a(LocalityListFeatureDependencies localityListFeatureDependencies, ut5 ut5Var) {
            jh8.b(localityListFeatureDependencies);
            jh8.b(ut5Var);
            return new b(localityListFeatureDependencies, ut5Var);
        }
    }

    /* compiled from: DaggerLocalityListComponent.java */
    /* renamed from: hf2$b */
    /* loaded from: classes3.dex */
    private static final class b implements tt5 {
        private final b b;
        private as8<h97> c;
        private as8<ut5> d;
        private as8<yo9> e;
        private as8<jv5> f;
        private as8<CountryService> g;
        private as8<ny1> h;
        private as8<py1> i;
        private as8<bu5> j;
        private as8<au5> k;
        private as8<LocalityListPresenter> l;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLocalityListComponent.java */
        /* renamed from: hf2$b$a */
        /* loaded from: classes3.dex */
        public static final class a implements as8<py1> {
            private final LocalityListFeatureDependencies a;

            a(LocalityListFeatureDependencies localityListFeatureDependencies) {
                this.a = localityListFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public py1 get() {
                return (py1) jh8.d(this.a.C());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLocalityListComponent.java */
        /* renamed from: hf2$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0346b implements as8<CountryService> {
            private final LocalityListFeatureDependencies a;

            C0346b(LocalityListFeatureDependencies localityListFeatureDependencies) {
                this.a = localityListFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public CountryService get() {
                return (CountryService) jh8.d(this.a.e());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLocalityListComponent.java */
        /* renamed from: hf2$b$c */
        /* loaded from: classes3.dex */
        public static final class c implements as8<ny1> {
            private final LocalityListFeatureDependencies a;

            c(LocalityListFeatureDependencies localityListFeatureDependencies) {
                this.a = localityListFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ny1 get() {
                return (ny1) jh8.d(this.a.b1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLocalityListComponent.java */
        /* renamed from: hf2$b$d */
        /* loaded from: classes3.dex */
        public static final class d implements as8<jv5> {
            private final LocalityListFeatureDependencies a;

            d(LocalityListFeatureDependencies localityListFeatureDependencies) {
                this.a = localityListFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public jv5 get() {
                return (jv5) jh8.d(this.a.f());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLocalityListComponent.java */
        /* renamed from: hf2$b$e */
        /* loaded from: classes3.dex */
        public static final class e implements as8<h97> {
            private final LocalityListFeatureDependencies a;

            e(LocalityListFeatureDependencies localityListFeatureDependencies) {
                this.a = localityListFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public h97 get() {
                return (h97) jh8.d(this.a.i0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLocalityListComponent.java */
        /* renamed from: hf2$b$f */
        /* loaded from: classes3.dex */
        public static final class f implements as8<yo9> {
            private final LocalityListFeatureDependencies a;

            f(LocalityListFeatureDependencies localityListFeatureDependencies) {
                this.a = localityListFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public yo9 get() {
                return (yo9) jh8.d(this.a.G0());
            }
        }

        private void b(LocalityListFeatureDependencies localityListFeatureDependencies, ut5 ut5Var) {
            this.c = new e(localityListFeatureDependencies);
            this.d = z45.a(ut5Var);
            this.e = new f(localityListFeatureDependencies);
            this.f = new d(localityListFeatureDependencies);
            this.g = new C0346b(localityListFeatureDependencies);
            this.h = new c(localityListFeatureDependencies);
            a aVar = new a(localityListFeatureDependencies);
            this.i = aVar;
            as8<bu5> a2 = p63.a(cu5.a(this.f, this.g, this.h, aVar));
            this.j = a2;
            eu5 a3 = eu5.a(a2);
            this.k = a3;
            this.l = p63.a(fu5.a(this.c, this.d, this.e, a3));
        }

        private yt5 c(yt5 yt5Var) {
            zt5.a(yt5Var, this.l);
            return yt5Var;
        }

        @Override // defpackage.tt5
        public void a(yt5 yt5Var) {
            c(yt5Var);
        }

        private b(LocalityListFeatureDependencies localityListFeatureDependencies, ut5 ut5Var) {
            this.b = this;
            b(localityListFeatureDependencies, ut5Var);
        }
    }

    public static tt5.b a() {
        return new a();
    }
}
