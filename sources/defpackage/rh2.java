package defpackage;

import com.dodopizza.profile.feature.profilelocalelist.ProfileLocaleListFeatureDependencies;
import com.dodopizza.profile.feature.profilelocalelist.presentation.ProfileLocaleListPresenter;
import defpackage.mn8;
/* compiled from: DaggerProfileLocaleListComponent.java */
/* renamed from: rh2  reason: default package */
/* loaded from: classes2.dex */
public final class rh2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerProfileLocaleListComponent.java */
    /* renamed from: rh2$a */
    /* loaded from: classes2.dex */
    public static final class a implements mn8.b {
        private a() {
        }

        @Override // defpackage.mn8.b
        public mn8 a(ProfileLocaleListFeatureDependencies profileLocaleListFeatureDependencies) {
            jh8.b(profileLocaleListFeatureDependencies);
            return new b(profileLocaleListFeatureDependencies);
        }
    }

    /* compiled from: DaggerProfileLocaleListComponent.java */
    /* renamed from: rh2$b */
    /* loaded from: classes2.dex */
    private static final class b implements mn8 {
        private final b b;
        private as8<jo> c;
        private as8<i32> d;
        private as8<wl5> e;
        private as8<qn8> f;
        private as8<Cdo> g;
        private as8<gc> h;
        private as8<f63> i;
        private as8<ProfileLocaleListPresenter> j;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerProfileLocaleListComponent.java */
        /* renamed from: rh2$b$a */
        /* loaded from: classes2.dex */
        public static final class a implements as8<gc> {
            private final ProfileLocaleListFeatureDependencies a;

            a(ProfileLocaleListFeatureDependencies profileLocaleListFeatureDependencies) {
                this.a = profileLocaleListFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerProfileLocaleListComponent.java */
        /* renamed from: rh2$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0502b implements as8<Cdo> {
            private final ProfileLocaleListFeatureDependencies a;

            C0502b(ProfileLocaleListFeatureDependencies profileLocaleListFeatureDependencies) {
                this.a = profileLocaleListFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public Cdo get() {
                return (Cdo) jh8.d(this.a.j());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerProfileLocaleListComponent.java */
        /* renamed from: rh2$b$c */
        /* loaded from: classes2.dex */
        public static final class c implements as8<jo> {
            private final ProfileLocaleListFeatureDependencies a;

            c(ProfileLocaleListFeatureDependencies profileLocaleListFeatureDependencies) {
                this.a = profileLocaleListFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public jo get() {
                return (jo) jh8.d(this.a.Y());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerProfileLocaleListComponent.java */
        /* renamed from: rh2$b$d */
        /* loaded from: classes2.dex */
        public static final class d implements as8<i32> {
            private final ProfileLocaleListFeatureDependencies a;

            d(ProfileLocaleListFeatureDependencies profileLocaleListFeatureDependencies) {
                this.a = profileLocaleListFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public i32 get() {
                return (i32) jh8.d(this.a.B1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerProfileLocaleListComponent.java */
        /* renamed from: rh2$b$e */
        /* loaded from: classes2.dex */
        public static final class e implements as8<wl5> {
            private final ProfileLocaleListFeatureDependencies a;

            e(ProfileLocaleListFeatureDependencies profileLocaleListFeatureDependencies) {
                this.a = profileLocaleListFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public wl5 get() {
                return (wl5) jh8.d(this.a.J3());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerProfileLocaleListComponent.java */
        /* renamed from: rh2$b$f */
        /* loaded from: classes2.dex */
        public static final class f implements as8<f63> {
            private final ProfileLocaleListFeatureDependencies a;

            f(ProfileLocaleListFeatureDependencies profileLocaleListFeatureDependencies) {
                this.a = profileLocaleListFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        private void b(ProfileLocaleListFeatureDependencies profileLocaleListFeatureDependencies) {
            this.c = new c(profileLocaleListFeatureDependencies);
            this.d = new d(profileLocaleListFeatureDependencies);
            e eVar = new e(profileLocaleListFeatureDependencies);
            this.e = eVar;
            this.f = rn8.a(this.c, this.d, eVar);
            this.g = new C0502b(profileLocaleListFeatureDependencies);
            this.h = new a(profileLocaleListFeatureDependencies);
            f fVar = new f(profileLocaleListFeatureDependencies);
            this.i = fVar;
            this.j = tn8.a(this.f, this.g, this.h, fVar);
        }

        private on8 c(on8 on8Var) {
            pn8.a(on8Var, this.j);
            return on8Var;
        }

        @Override // defpackage.mn8
        public void a(on8 on8Var) {
            c(on8Var);
        }

        private b(ProfileLocaleListFeatureDependencies profileLocaleListFeatureDependencies) {
            this.b = this;
            b(profileLocaleListFeatureDependencies);
        }
    }

    public static mn8.b a() {
        return new a();
    }
}
