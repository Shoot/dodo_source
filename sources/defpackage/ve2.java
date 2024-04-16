package defpackage;

import defpackage.ij5;
import ru.dodopizza.app.di.modules.presentation.landing.LandingFeatureDependencies;
import ru.dodopizza.app.presentation.selectlocation.landing.LandingPresenter;
/* compiled from: DaggerLandingComponent.java */
/* renamed from: ve2  reason: default package */
/* loaded from: classes3.dex */
public final class ve2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerLandingComponent.java */
    /* renamed from: ve2$a */
    /* loaded from: classes3.dex */
    public static final class a implements ij5.b {
        private a() {
        }

        @Override // defpackage.ij5.b
        public ij5 a(LandingFeatureDependencies landingFeatureDependencies, String str, String str2, String str3) {
            jh8.b(landingFeatureDependencies);
            jh8.b(str);
            jh8.b(str2);
            jh8.b(str3);
            return new b(landingFeatureDependencies, str, str2, str3);
        }
    }

    /* compiled from: DaggerLandingComponent.java */
    /* renamed from: ve2$b */
    /* loaded from: classes3.dex */
    private static final class b implements ij5 {
        private final b b;
        private as8<String> c;
        private as8<f63> d;
        private as8<String> e;
        private as8<String> f;
        private as8<ml5> g;
        private as8<uj5> h;
        private as8<rj5> i;
        private as8<LandingPresenter> j;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLandingComponent.java */
        /* renamed from: ve2$b$a */
        /* loaded from: classes3.dex */
        public static final class a implements as8<ml5> {
            private final LandingFeatureDependencies a;

            a(LandingFeatureDependencies landingFeatureDependencies) {
                this.a = landingFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ml5 get() {
                return (ml5) jh8.d(this.a.Z());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLandingComponent.java */
        /* renamed from: ve2$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0699b implements as8<f63> {
            private final LandingFeatureDependencies a;

            C0699b(LandingFeatureDependencies landingFeatureDependencies) {
                this.a = landingFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        private void b(LandingFeatureDependencies landingFeatureDependencies, String str, String str2, String str3) {
            this.c = z45.a(str3);
            this.d = new C0699b(landingFeatureDependencies);
            this.e = z45.a(str);
            this.f = z45.a(str2);
            this.g = new a(landingFeatureDependencies);
            as8<uj5> a2 = p63.a(ak5.a());
            this.h = a2;
            as8<rj5> a3 = p63.a(zj5.a(this.e, this.f, this.g, a2));
            this.i = a3;
            this.j = p63.a(bk5.a(this.c, this.d, a3));
        }

        private oj5 c(oj5 oj5Var) {
            qj5.a(oj5Var, this.j);
            return oj5Var;
        }

        @Override // defpackage.ij5
        public void a(oj5 oj5Var) {
            c(oj5Var);
        }

        private b(LandingFeatureDependencies landingFeatureDependencies, String str, String str2, String str3) {
            this.b = this;
            b(landingFeatureDependencies, str, str2, str3);
        }
    }

    public static ij5.b a() {
        return new a();
    }
}
