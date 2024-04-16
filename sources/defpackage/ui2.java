package defpackage;

import com.dodopizza.onboarding.feature.selectcountry.SelectCountryDependencies;
import com.dodopizza.onboarding.feature.selectcountry.presentation.SelectCountryPresenter;
import defpackage.m4a;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: DaggerSelectCountryComponent.java */
/* renamed from: ui2  reason: default package */
/* loaded from: classes2.dex */
public final class ui2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerSelectCountryComponent.java */
    /* renamed from: ui2$a */
    /* loaded from: classes2.dex */
    public static final class a implements m4a.b {
        private a() {
        }

        @Override // defpackage.m4a.b
        public m4a a(SelectCountryDependencies selectCountryDependencies, n4a n4aVar) {
            jh8.b(selectCountryDependencies);
            jh8.b(n4aVar);
            return new b(selectCountryDependencies, n4aVar);
        }
    }

    /* compiled from: DaggerSelectCountryComponent.java */
    /* renamed from: ui2$b */
    /* loaded from: classes2.dex */
    private static final class b implements m4a {
        private final b b;
        private as8<n4a> c;
        private as8<y4a> d;
        private as8<CountryService> e;
        private as8<jv5> f;
        private as8<py1> g;
        private as8<gy1> h;
        private as8<prb> i;
        private as8<kx1> j;
        private as8<s4a> k;
        private as8<r4a> l;
        private as8<SelectCountryPresenter> m;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSelectCountryComponent.java */
        /* renamed from: ui2$b$a */
        /* loaded from: classes2.dex */
        public static final class a implements as8<py1> {
            private final SelectCountryDependencies a;

            a(SelectCountryDependencies selectCountryDependencies) {
                this.a = selectCountryDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public py1 get() {
                return (py1) jh8.d(this.a.C());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSelectCountryComponent.java */
        /* renamed from: ui2$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0690b implements as8<CountryService> {
            private final SelectCountryDependencies a;

            C0690b(SelectCountryDependencies selectCountryDependencies) {
                this.a = selectCountryDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public CountryService get() {
                return (CountryService) jh8.d(this.a.e());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSelectCountryComponent.java */
        /* renamed from: ui2$b$c */
        /* loaded from: classes2.dex */
        public static final class c implements as8<kx1> {
            private final SelectCountryDependencies a;

            c(SelectCountryDependencies selectCountryDependencies) {
                this.a = selectCountryDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public kx1 get() {
                return (kx1) jh8.d(this.a.d());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSelectCountryComponent.java */
        /* renamed from: ui2$b$d */
        /* loaded from: classes2.dex */
        public static final class d implements as8<jv5> {
            private final SelectCountryDependencies a;

            d(SelectCountryDependencies selectCountryDependencies) {
                this.a = selectCountryDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public jv5 get() {
                return (jv5) jh8.d(this.a.f());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSelectCountryComponent.java */
        /* renamed from: ui2$b$e */
        /* loaded from: classes2.dex */
        public static final class e implements as8<y4a> {
            private final SelectCountryDependencies a;

            e(SelectCountryDependencies selectCountryDependencies) {
                this.a = selectCountryDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public y4a get() {
                return (y4a) jh8.d(this.a.e4());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSelectCountryComponent.java */
        /* renamed from: ui2$b$f */
        /* loaded from: classes2.dex */
        public static final class f implements as8<prb> {
            private final SelectCountryDependencies a;

            f(SelectCountryDependencies selectCountryDependencies) {
                this.a = selectCountryDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public prb get() {
                return (prb) jh8.d(this.a.q0());
            }
        }

        private void b(SelectCountryDependencies selectCountryDependencies, n4a n4aVar) {
            this.c = z45.a(n4aVar);
            this.d = new e(selectCountryDependencies);
            this.e = new C0690b(selectCountryDependencies);
            this.f = new d(selectCountryDependencies);
            a aVar = new a(selectCountryDependencies);
            this.g = aVar;
            this.h = p63.a(v4a.a(aVar));
            this.i = new f(selectCountryDependencies);
            c cVar = new c(selectCountryDependencies);
            this.j = cVar;
            as8<s4a> a2 = p63.a(t4a.a(this.e, this.f, this.h, this.i, cVar));
            this.k = a2;
            w4a a3 = w4a.a(a2);
            this.l = a3;
            this.m = p63.a(x4a.a(this.c, this.d, a3));
        }

        private p4a c(p4a p4aVar) {
            q4a.a(p4aVar, this.m);
            return p4aVar;
        }

        @Override // defpackage.m4a
        public void a(p4a p4aVar) {
            c(p4aVar);
        }

        private b(SelectCountryDependencies selectCountryDependencies, n4a n4aVar) {
            this.b = this;
            b(selectCountryDependencies, n4aVar);
        }
    }

    public static m4a.b a() {
        return new a();
    }
}
