package defpackage;

import defpackage.gk5;
import ru.dodopizza.app.di.modules.presentation.landing.phoneinput.LandingPhoneInputDependencies;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter;
/* compiled from: DaggerLandingPhoneInputComponent.java */
/* renamed from: ye2  reason: default package */
/* loaded from: classes3.dex */
public final class ye2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerLandingPhoneInputComponent.java */
    /* renamed from: ye2$a */
    /* loaded from: classes3.dex */
    public static final class a implements gk5.b {
        private a() {
        }

        @Override // defpackage.gk5.b
        public gk5 a(LandingPhoneInputDependencies landingPhoneInputDependencies, String str, String str2) {
            jh8.b(landingPhoneInputDependencies);
            jh8.b(str);
            jh8.b(str2);
            return new b(landingPhoneInputDependencies, str, str2);
        }
    }

    /* compiled from: DaggerLandingPhoneInputComponent.java */
    /* renamed from: ye2$b */
    /* loaded from: classes3.dex */
    private static final class b implements gk5 {
        private final b b;
        private as8<f63> c;
        private as8<v28> d;
        private as8<m28> e;
        private as8<ml5> f;
        private as8<CountryService> g;
        private as8<String> h;
        private as8<String> i;
        private as8<lk5> j;
        private as8<LandingPhoneInputPresenter> k;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLandingPhoneInputComponent.java */
        /* renamed from: ye2$b$a */
        /* loaded from: classes3.dex */
        public static final class a implements as8<CountryService> {
            private final LandingPhoneInputDependencies a;

            a(LandingPhoneInputDependencies landingPhoneInputDependencies) {
                this.a = landingPhoneInputDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public CountryService get() {
                return (CountryService) jh8.d(this.a.e());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLandingPhoneInputComponent.java */
        /* renamed from: ye2$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0750b implements as8<ml5> {
            private final LandingPhoneInputDependencies a;

            C0750b(LandingPhoneInputDependencies landingPhoneInputDependencies) {
                this.a = landingPhoneInputDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ml5 get() {
                return (ml5) jh8.d(this.a.Z());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLandingPhoneInputComponent.java */
        /* renamed from: ye2$b$c */
        /* loaded from: classes3.dex */
        public static final class c implements as8<m28> {
            private final LandingPhoneInputDependencies a;

            c(LandingPhoneInputDependencies landingPhoneInputDependencies) {
                this.a = landingPhoneInputDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public m28 get() {
                return (m28) jh8.d(this.a.T0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLandingPhoneInputComponent.java */
        /* renamed from: ye2$b$d */
        /* loaded from: classes3.dex */
        public static final class d implements as8<v28> {
            private final LandingPhoneInputDependencies a;

            d(LandingPhoneInputDependencies landingPhoneInputDependencies) {
                this.a = landingPhoneInputDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public v28 get() {
                return (v28) jh8.d(this.a.A0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLandingPhoneInputComponent.java */
        /* renamed from: ye2$b$e */
        /* loaded from: classes3.dex */
        public static final class e implements as8<f63> {
            private final LandingPhoneInputDependencies a;

            e(LandingPhoneInputDependencies landingPhoneInputDependencies) {
                this.a = landingPhoneInputDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        private void b(LandingPhoneInputDependencies landingPhoneInputDependencies, String str, String str2) {
            this.c = new e(landingPhoneInputDependencies);
            this.d = new d(landingPhoneInputDependencies);
            this.e = new c(landingPhoneInputDependencies);
            this.f = new C0750b(landingPhoneInputDependencies);
            this.g = new a(landingPhoneInputDependencies);
            this.h = z45.a(str2);
            no3 a2 = z45.a(str);
            this.i = a2;
            as8<lk5> a3 = p63.a(ok5.a(this.f, this.g, this.h, a2));
            this.j = a3;
            this.k = p63.a(pk5.a(this.c, this.d, this.e, a3, this.i));
        }

        private jk5 c(jk5 jk5Var) {
            kk5.a(jk5Var, this.k);
            return jk5Var;
        }

        @Override // defpackage.gk5
        public void a(jk5 jk5Var) {
            c(jk5Var);
        }

        private b(LandingPhoneInputDependencies landingPhoneInputDependencies, String str, String str2) {
            this.b = this;
            b(landingPhoneInputDependencies, str, str2);
        }
    }

    public static gk5.b a() {
        return new a();
    }
}
