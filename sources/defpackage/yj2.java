package defpackage;

import com.dodopizza.order.feature.upsell.UpsaleFeatureDependencies;
import com.dodopizza.order.feature.upsell.presentation.UpsalePresenter;
import defpackage.msb;
/* compiled from: DaggerUpsaleComponent.java */
/* renamed from: yj2  reason: default package */
/* loaded from: classes2.dex */
public final class yj2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerUpsaleComponent.java */
    /* renamed from: yj2$a */
    /* loaded from: classes2.dex */
    public static final class a implements msb.b {
        private a() {
        }

        @Override // defpackage.msb.b
        public msb a(UpsaleFeatureDependencies upsaleFeatureDependencies) {
            jh8.b(upsaleFeatureDependencies);
            return new b(upsaleFeatureDependencies);
        }
    }

    /* compiled from: DaggerUpsaleComponent.java */
    /* renamed from: yj2$b */
    /* loaded from: classes2.dex */
    private static final class b implements msb {
        private final UpsaleFeatureDependencies b;
        private final b c;
        private as8<tsb> d;
        private as8<ktb> e;
        private as8<gc> f;
        private as8<rsb> g;
        private as8<hq3> h;
        private as8<k63> i;
        private as8<UpsalePresenter> j;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerUpsaleComponent.java */
        /* renamed from: yj2$b$a */
        /* loaded from: classes2.dex */
        public static final class a implements as8<gc> {
            private final UpsaleFeatureDependencies a;

            a(UpsaleFeatureDependencies upsaleFeatureDependencies) {
                this.a = upsaleFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerUpsaleComponent.java */
        /* renamed from: yj2$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0752b implements as8<k63> {
            private final UpsaleFeatureDependencies a;

            C0752b(UpsaleFeatureDependencies upsaleFeatureDependencies) {
                this.a = upsaleFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public k63 get() {
                return (k63) jh8.d(this.a.I());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerUpsaleComponent.java */
        /* renamed from: yj2$b$c */
        /* loaded from: classes2.dex */
        public static final class c implements as8<hq3> {
            private final UpsaleFeatureDependencies a;

            c(UpsaleFeatureDependencies upsaleFeatureDependencies) {
                this.a = upsaleFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hq3 get() {
                return (hq3) jh8.d(this.a.c());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerUpsaleComponent.java */
        /* renamed from: yj2$b$d */
        /* loaded from: classes2.dex */
        public static final class d implements as8<tsb> {
            private final UpsaleFeatureDependencies a;

            d(UpsaleFeatureDependencies upsaleFeatureDependencies) {
                this.a = upsaleFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public tsb get() {
                return (tsb) jh8.d(this.a.H3());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerUpsaleComponent.java */
        /* renamed from: yj2$b$e */
        /* loaded from: classes2.dex */
        public static final class e implements as8<ktb> {
            private final UpsaleFeatureDependencies a;

            e(UpsaleFeatureDependencies upsaleFeatureDependencies) {
                this.a = upsaleFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ktb get() {
                return (ktb) jh8.d(this.a.f1());
            }
        }

        private void b(UpsaleFeatureDependencies upsaleFeatureDependencies) {
            this.d = new d(upsaleFeatureDependencies);
            this.e = new e(upsaleFeatureDependencies);
            a aVar = new a(upsaleFeatureDependencies);
            this.f = aVar;
            this.g = p63.a(ysb.a(this.d, this.e, aVar));
            this.h = new c(upsaleFeatureDependencies);
            C0752b c0752b = new C0752b(upsaleFeatureDependencies);
            this.i = c0752b;
            this.j = p63.a(xsb.a(this.g, this.h, this.f, c0752b));
        }

        private psb c(psb psbVar) {
            qsb.c(psbVar, this.j);
            qsb.b(psbVar, (g78) jh8.d(this.b.N()));
            qsb.a(psbVar, (jn6) jh8.d(this.b.s2()));
            return psbVar;
        }

        @Override // defpackage.msb
        public void a(psb psbVar) {
            c(psbVar);
        }

        private b(UpsaleFeatureDependencies upsaleFeatureDependencies) {
            this.c = this;
            this.b = upsaleFeatureDependencies;
            b(upsaleFeatureDependencies);
        }
    }

    public static msb.b a() {
        return new a();
    }
}
