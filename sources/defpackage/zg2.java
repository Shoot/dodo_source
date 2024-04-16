package defpackage;

import com.dodopizza.order.feature.personaloffer.PersonalOffersFeatureDependencies;
import com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter;
import defpackage.n08;
/* compiled from: DaggerPersonalOffersComponent.java */
/* renamed from: zg2  reason: default package */
/* loaded from: classes2.dex */
public final class zg2 {

    /* compiled from: DaggerPersonalOffersComponent.java */
    /* renamed from: zg2$a */
    /* loaded from: classes2.dex */
    private static final class a implements n08.a {
        private a() {
        }

        @Override // defpackage.n08.a
        public n08 a(PersonalOffersFeatureDependencies personalOffersFeatureDependencies, o08 o08Var) {
            jh8.b(personalOffersFeatureDependencies);
            jh8.b(o08Var);
            return new b(personalOffersFeatureDependencies, o08Var);
        }
    }

    /* compiled from: DaggerPersonalOffersComponent.java */
    /* renamed from: zg2$b */
    /* loaded from: classes2.dex */
    private static final class b implements n08 {
        private final PersonalOffersFeatureDependencies a;
        private final b b;
        private as8<t52> c;
        private as8<l08> d;
        private as8<a18> e;
        private as8<nfa> f;
        private as8<gc> g;
        private as8<o08> h;
        private as8<k63> i;
        private as8<i00> j;
        private as8<hq3> k;
        private as8<PersonalOffersPresenter> l;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerPersonalOffersComponent.java */
        /* renamed from: zg2$b$a */
        /* loaded from: classes2.dex */
        public static final class a implements as8<gc> {
            private final PersonalOffersFeatureDependencies a;

            a(PersonalOffersFeatureDependencies personalOffersFeatureDependencies) {
                this.a = personalOffersFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerPersonalOffersComponent.java */
        /* renamed from: zg2$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0763b implements as8<i00> {
            private final PersonalOffersFeatureDependencies a;

            C0763b(PersonalOffersFeatureDependencies personalOffersFeatureDependencies) {
                this.a = personalOffersFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public i00 get() {
                return (i00) jh8.d(this.a.g());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerPersonalOffersComponent.java */
        /* renamed from: zg2$b$c */
        /* loaded from: classes2.dex */
        public static final class c implements as8<t52> {
            private final PersonalOffersFeatureDependencies a;

            c(PersonalOffersFeatureDependencies personalOffersFeatureDependencies) {
                this.a = personalOffersFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public t52 get() {
                return (t52) jh8.d(this.a.m());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerPersonalOffersComponent.java */
        /* renamed from: zg2$b$d */
        /* loaded from: classes2.dex */
        public static final class d implements as8<k63> {
            private final PersonalOffersFeatureDependencies a;

            d(PersonalOffersFeatureDependencies personalOffersFeatureDependencies) {
                this.a = personalOffersFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public k63 get() {
                return (k63) jh8.d(this.a.I());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerPersonalOffersComponent.java */
        /* renamed from: zg2$b$e */
        /* loaded from: classes2.dex */
        public static final class e implements as8<hq3> {
            private final PersonalOffersFeatureDependencies a;

            e(PersonalOffersFeatureDependencies personalOffersFeatureDependencies) {
                this.a = personalOffersFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hq3 get() {
                return (hq3) jh8.d(this.a.c());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerPersonalOffersComponent.java */
        /* renamed from: zg2$b$f */
        /* loaded from: classes2.dex */
        public static final class f implements as8<l08> {
            private final PersonalOffersFeatureDependencies a;

            f(PersonalOffersFeatureDependencies personalOffersFeatureDependencies) {
                this.a = personalOffersFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public l08 get() {
                return (l08) jh8.d(this.a.j3());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerPersonalOffersComponent.java */
        /* renamed from: zg2$b$g */
        /* loaded from: classes2.dex */
        public static final class g implements as8<nfa> {
            private final PersonalOffersFeatureDependencies a;

            g(PersonalOffersFeatureDependencies personalOffersFeatureDependencies) {
                this.a = personalOffersFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public nfa get() {
                return (nfa) jh8.d(this.a.b0());
            }
        }

        private void b(PersonalOffersFeatureDependencies personalOffersFeatureDependencies, o08 o08Var) {
            this.c = new c(personalOffersFeatureDependencies);
            f fVar = new f(personalOffersFeatureDependencies);
            this.d = fVar;
            this.e = e18.a(this.c, fVar, d18.a());
            this.f = new g(personalOffersFeatureDependencies);
            this.g = new a(personalOffersFeatureDependencies);
            this.h = z45.a(o08Var);
            this.i = new d(personalOffersFeatureDependencies);
            this.j = new C0763b(personalOffersFeatureDependencies);
            this.k = new e(personalOffersFeatureDependencies);
            this.l = f18.a(this.e, this.f, this.g, this.h, this.i, g18.a(), this.j, this.k);
        }

        private y08 c(y08 y08Var) {
            z08.a(y08Var, (n67) jh8.d(this.a.m2()));
            z08.b(y08Var, this.l);
            return y08Var;
        }

        @Override // defpackage.n08
        public void a(y08 y08Var) {
            c(y08Var);
        }

        private b(PersonalOffersFeatureDependencies personalOffersFeatureDependencies, o08 o08Var) {
            this.b = this;
            this.a = personalOffersFeatureDependencies;
            b(personalOffersFeatureDependencies, o08Var);
        }
    }

    public static n08.a a() {
        return new a();
    }
}
