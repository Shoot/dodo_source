package defpackage;

import com.dodopizza.activeorder.feature.activeorderwidget.ActiveOrderFoodMenuFeatureDependencies;
import com.dodopizza.activeorder.feature.activeorderwidget.presentation.ActiveOrderFoodMenuPresenter;
import defpackage.e5;
/* compiled from: DaggerActiveOrderFoodMenuComponent.java */
/* renamed from: u82  reason: default package */
/* loaded from: classes.dex */
public final class u82 {

    /* compiled from: DaggerActiveOrderFoodMenuComponent.java */
    /* renamed from: u82$a */
    /* loaded from: classes.dex */
    private static final class a implements e5 {
        private final a b;
        private as8<li7> c;
        private as8<jgb> d;
        private as8<f5b> e;
        private as8<hq3> f;
        private as8<com.dodopizza.activeorder.feature.activeorderwidget.presentation.a> g;
        private as8<kx1> h;
        private as8<h5> i;
        private as8<f63> j;
        private as8<ih4> k;
        private as8<ActiveOrderFoodMenuPresenter> l;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerActiveOrderFoodMenuComponent.java */
        /* renamed from: u82$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0683a implements as8<hq3> {
            private final ActiveOrderFoodMenuFeatureDependencies a;

            C0683a(ActiveOrderFoodMenuFeatureDependencies activeOrderFoodMenuFeatureDependencies) {
                this.a = activeOrderFoodMenuFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hq3 get() {
                return (hq3) jh8.d(this.a.c());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerActiveOrderFoodMenuComponent.java */
        /* renamed from: u82$a$b */
        /* loaded from: classes.dex */
        public static final class b implements as8<ih4> {
            private final ActiveOrderFoodMenuFeatureDependencies a;

            b(ActiveOrderFoodMenuFeatureDependencies activeOrderFoodMenuFeatureDependencies) {
                this.a = activeOrderFoodMenuFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ih4 get() {
                return (ih4) jh8.d(this.a.A());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerActiveOrderFoodMenuComponent.java */
        /* renamed from: u82$a$c */
        /* loaded from: classes.dex */
        public static final class c implements as8<li7> {
            private final ActiveOrderFoodMenuFeatureDependencies a;

            c(ActiveOrderFoodMenuFeatureDependencies activeOrderFoodMenuFeatureDependencies) {
                this.a = activeOrderFoodMenuFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public li7 get() {
                return (li7) jh8.d(this.a.r());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerActiveOrderFoodMenuComponent.java */
        /* renamed from: u82$a$d */
        /* loaded from: classes.dex */
        public static final class d implements as8<f63> {
            private final ActiveOrderFoodMenuFeatureDependencies a;

            d(ActiveOrderFoodMenuFeatureDependencies activeOrderFoodMenuFeatureDependencies) {
                this.a = activeOrderFoodMenuFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerActiveOrderFoodMenuComponent.java */
        /* renamed from: u82$a$e */
        /* loaded from: classes.dex */
        public static final class e implements as8<f5b> {
            private final ActiveOrderFoodMenuFeatureDependencies a;

            e(ActiveOrderFoodMenuFeatureDependencies activeOrderFoodMenuFeatureDependencies) {
                this.a = activeOrderFoodMenuFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f5b get() {
                return (f5b) jh8.d(this.a.t());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerActiveOrderFoodMenuComponent.java */
        /* renamed from: u82$a$f */
        /* loaded from: classes.dex */
        public static final class f implements as8<jgb> {
            private final ActiveOrderFoodMenuFeatureDependencies a;

            f(ActiveOrderFoodMenuFeatureDependencies activeOrderFoodMenuFeatureDependencies) {
                this.a = activeOrderFoodMenuFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public jgb get() {
                return (jgb) jh8.d(this.a.J());
            }
        }

        private void b(ActiveOrderFoodMenuFeatureDependencies activeOrderFoodMenuFeatureDependencies, kx1 kx1Var) {
            this.c = new c(activeOrderFoodMenuFeatureDependencies);
            this.d = new f(activeOrderFoodMenuFeatureDependencies);
            this.e = new e(activeOrderFoodMenuFeatureDependencies);
            C0683a c0683a = new C0683a(activeOrderFoodMenuFeatureDependencies);
            this.f = c0683a;
            this.g = p63.a(c5.a(this.d, this.e, c0683a));
            no3 a = z45.a(kx1Var);
            this.h = a;
            this.i = p63.a(i5.a(this.c, this.g, a));
            this.j = new d(activeOrderFoodMenuFeatureDependencies);
            b bVar = new b(activeOrderFoodMenuFeatureDependencies);
            this.k = bVar;
            this.l = p63.a(j5.a(this.i, this.f, this.j, bVar));
        }

        private com.dodopizza.activeorder.feature.activeorderwidget.presentation.b c(com.dodopizza.activeorder.feature.activeorderwidget.presentation.b bVar) {
            f5.a(bVar, this.l);
            return bVar;
        }

        @Override // defpackage.e5
        public void a(com.dodopizza.activeorder.feature.activeorderwidget.presentation.b bVar) {
            c(bVar);
        }

        private a(ActiveOrderFoodMenuFeatureDependencies activeOrderFoodMenuFeatureDependencies, kx1 kx1Var) {
            this.b = this;
            b(activeOrderFoodMenuFeatureDependencies, kx1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerActiveOrderFoodMenuComponent.java */
    /* renamed from: u82$b */
    /* loaded from: classes.dex */
    public static final class b implements e5.b {
        private b() {
        }

        @Override // defpackage.e5.b
        public e5 a(kx1 kx1Var, ActiveOrderFoodMenuFeatureDependencies activeOrderFoodMenuFeatureDependencies) {
            jh8.b(kx1Var);
            jh8.b(activeOrderFoodMenuFeatureDependencies);
            return new a(activeOrderFoodMenuFeatureDependencies, kx1Var);
        }
    }

    public static e5.b a() {
        return new b();
    }
}
