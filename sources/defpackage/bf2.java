package defpackage;

import defpackage.xk5;
import ru.dodopizza.app.di.modules.presentation.landing.smsinput.LandingSMSInputFeatureDependencies;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.app.presentation.selectlocation.landing.smsinput.LandingSMSInputPresenter;
import ru.dodopizza.backend.domain.authorization.AuthorizationAPI;
import ru.dodopizza.backend.domain.landing.LandingApi;
/* compiled from: DaggerLandingSMSInputComponent.java */
/* renamed from: bf2  reason: default package */
/* loaded from: classes3.dex */
public final class bf2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerLandingSMSInputComponent.java */
    /* renamed from: bf2$a */
    /* loaded from: classes3.dex */
    public static final class a implements xk5.b {
        private a() {
        }

        @Override // defpackage.xk5.b
        public xk5 a(LandingSMSInputFeatureDependencies landingSMSInputFeatureDependencies, String str, String str2, String str3, String str4, String str5) {
            jh8.b(landingSMSInputFeatureDependencies);
            jh8.b(str);
            jh8.b(str2);
            jh8.b(str3);
            jh8.b(str4);
            jh8.b(str5);
            return new b(landingSMSInputFeatureDependencies, str, str2, str3, str4, str5);
        }
    }

    /* compiled from: DaggerLandingSMSInputComponent.java */
    /* renamed from: bf2$b */
    /* loaded from: classes3.dex */
    private static final class b implements xk5 {
        private final b b;
        private as8<String> c;
        private as8<String> d;
        private as8<String> e;
        private as8<vfb> f;
        private as8<String> g;
        private as8<String> h;
        private as8<AuthorizationAPI> i;
        private as8<LandingApi> j;
        private as8<CountryService> k;
        private as8<il5> l;
        private as8<bl5> m;
        private as8<pl5> n;
        private as8<LandingSMSInputPresenter> o;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLandingSMSInputComponent.java */
        /* renamed from: bf2$b$a */
        /* loaded from: classes3.dex */
        public static final class a implements as8<AuthorizationAPI> {
            private final LandingSMSInputFeatureDependencies a;

            a(LandingSMSInputFeatureDependencies landingSMSInputFeatureDependencies) {
                this.a = landingSMSInputFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public AuthorizationAPI get() {
                return (AuthorizationAPI) jh8.d(this.a.O2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLandingSMSInputComponent.java */
        /* renamed from: bf2$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0068b implements as8<CountryService> {
            private final LandingSMSInputFeatureDependencies a;

            C0068b(LandingSMSInputFeatureDependencies landingSMSInputFeatureDependencies) {
                this.a = landingSMSInputFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public CountryService get() {
                return (CountryService) jh8.d(this.a.e());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLandingSMSInputComponent.java */
        /* renamed from: bf2$b$c */
        /* loaded from: classes3.dex */
        public static final class c implements as8<LandingApi> {
            private final LandingSMSInputFeatureDependencies a;

            c(LandingSMSInputFeatureDependencies landingSMSInputFeatureDependencies) {
                this.a = landingSMSInputFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public LandingApi get() {
                return (LandingApi) jh8.d(this.a.s1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLandingSMSInputComponent.java */
        /* renamed from: bf2$b$d */
        /* loaded from: classes3.dex */
        public static final class d implements as8<pl5> {
            private final LandingSMSInputFeatureDependencies a;

            d(LandingSMSInputFeatureDependencies landingSMSInputFeatureDependencies) {
                this.a = landingSMSInputFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public pl5 get() {
                return (pl5) jh8.d(this.a.L0());
            }
        }

        private void b(LandingSMSInputFeatureDependencies landingSMSInputFeatureDependencies, String str, String str2, String str3, String str4, String str5) {
            this.c = z45.a(str2);
            this.d = z45.a(str5);
            this.e = z45.a(str3);
            this.f = p63.a(hl5.a());
            this.g = z45.a(str);
            this.h = z45.a(str4);
            this.i = new a(landingSMSInputFeatureDependencies);
            this.j = new c(landingSMSInputFeatureDependencies);
            C0068b c0068b = new C0068b(landingSMSInputFeatureDependencies);
            this.k = c0068b;
            as8<il5> a2 = p63.a(gl5.a(this.i, this.j, c0068b));
            this.l = a2;
            this.m = p63.a(el5.a(this.g, this.h, a2));
            d dVar = new d(landingSMSInputFeatureDependencies);
            this.n = dVar;
            this.o = p63.a(fl5.a(this.c, this.d, this.e, this.f, this.m, dVar));
        }

        private ru.dodopizza.app.presentation.selectlocation.landing.smsinput.a c(ru.dodopizza.app.presentation.selectlocation.landing.smsinput.a aVar) {
            al5.a(aVar, this.o);
            return aVar;
        }

        @Override // defpackage.xk5
        public void a(ru.dodopizza.app.presentation.selectlocation.landing.smsinput.a aVar) {
            c(aVar);
        }

        private b(LandingSMSInputFeatureDependencies landingSMSInputFeatureDependencies, String str, String str2, String str3, String str4, String str5) {
            this.b = this;
            b(landingSMSInputFeatureDependencies, str, str2, str3, str4, str5);
        }
    }

    public static xk5.b a() {
        return new a();
    }
}
