package defpackage;

import com.dodopizza.order.feature.combinedmap.CombinedSelectionMapFeatureDependencies;
import com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter;
import com.dodopizza.order.feature.selectionmap.presentation.f;
import defpackage.xf1;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: DaggerCombinedSelectionMapComponent.java */
/* renamed from: rc2  reason: default package */
/* loaded from: classes2.dex */
public final class rc2 {

    /* compiled from: DaggerCombinedSelectionMapComponent.java */
    /* renamed from: rc2$a */
    /* loaded from: classes2.dex */
    private static final class a implements xf1 {
        private final a b;
        private as8<com.dodopizza.order.feature.selectionmap.presentation.f> c;
        private as8<f63> d;
        private as8<gc> e;
        private as8<la8> f;
        private as8<py1> g;
        private as8<hq3> h;
        private as8<CountryService> i;
        private as8<jg1> j;
        private as8<CombinedSelectionMapPresenter> k;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerCombinedSelectionMapComponent.java */
        /* renamed from: rc2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0500a implements as8<gc> {
            private final CombinedSelectionMapFeatureDependencies a;

            C0500a(CombinedSelectionMapFeatureDependencies combinedSelectionMapFeatureDependencies) {
                this.a = combinedSelectionMapFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerCombinedSelectionMapComponent.java */
        /* renamed from: rc2$a$b */
        /* loaded from: classes2.dex */
        public static final class b implements as8<py1> {
            private final CombinedSelectionMapFeatureDependencies a;

            b(CombinedSelectionMapFeatureDependencies combinedSelectionMapFeatureDependencies) {
                this.a = combinedSelectionMapFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public py1 get() {
                return (py1) jh8.d(this.a.C());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerCombinedSelectionMapComponent.java */
        /* renamed from: rc2$a$c */
        /* loaded from: classes2.dex */
        public static final class c implements as8<CountryService> {
            private final CombinedSelectionMapFeatureDependencies a;

            c(CombinedSelectionMapFeatureDependencies combinedSelectionMapFeatureDependencies) {
                this.a = combinedSelectionMapFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public CountryService get() {
                return (CountryService) jh8.d(this.a.e());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerCombinedSelectionMapComponent.java */
        /* renamed from: rc2$a$d */
        /* loaded from: classes2.dex */
        public static final class d implements as8<hq3> {
            private final CombinedSelectionMapFeatureDependencies a;

            d(CombinedSelectionMapFeatureDependencies combinedSelectionMapFeatureDependencies) {
                this.a = combinedSelectionMapFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hq3 get() {
                return (hq3) jh8.d(this.a.c());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerCombinedSelectionMapComponent.java */
        /* renamed from: rc2$a$e */
        /* loaded from: classes2.dex */
        public static final class e implements as8<la8> {
            private final CombinedSelectionMapFeatureDependencies a;

            e(CombinedSelectionMapFeatureDependencies combinedSelectionMapFeatureDependencies) {
                this.a = combinedSelectionMapFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public la8 get() {
                return (la8) jh8.d(this.a.o2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerCombinedSelectionMapComponent.java */
        /* renamed from: rc2$a$f */
        /* loaded from: classes2.dex */
        public static final class f implements as8<f63> {
            private final CombinedSelectionMapFeatureDependencies a;

            f(CombinedSelectionMapFeatureDependencies combinedSelectionMapFeatureDependencies) {
                this.a = combinedSelectionMapFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        private void b(CombinedSelectionMapFeatureDependencies combinedSelectionMapFeatureDependencies, com.dodopizza.order.feature.selectionmap.presentation.f fVar) {
            this.c = z45.a(fVar);
            this.d = new f(combinedSelectionMapFeatureDependencies);
            this.e = new C0500a(combinedSelectionMapFeatureDependencies);
            this.f = new e(combinedSelectionMapFeatureDependencies);
            this.g = new b(combinedSelectionMapFeatureDependencies);
            this.h = new d(combinedSelectionMapFeatureDependencies);
            c cVar = new c(combinedSelectionMapFeatureDependencies);
            this.i = cVar;
            kg1 a = kg1.a(cVar);
            this.j = a;
            this.k = ng1.a(this.c, this.d, this.e, this.f, this.g, this.h, a);
        }

        private com.dodopizza.order.feature.combinedmap.presentation.a c(com.dodopizza.order.feature.combinedmap.presentation.a aVar) {
            ig1.a(aVar, this.k);
            return aVar;
        }

        @Override // defpackage.xf1
        public void a(com.dodopizza.order.feature.combinedmap.presentation.a aVar) {
            c(aVar);
        }

        private a(CombinedSelectionMapFeatureDependencies combinedSelectionMapFeatureDependencies, com.dodopizza.order.feature.selectionmap.presentation.f fVar) {
            this.b = this;
            b(combinedSelectionMapFeatureDependencies, fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerCombinedSelectionMapComponent.java */
    /* renamed from: rc2$b */
    /* loaded from: classes2.dex */
    public static final class b implements xf1.b {
        private b() {
        }

        @Override // defpackage.xf1.b
        public xf1 a(f fVar, CombinedSelectionMapFeatureDependencies combinedSelectionMapFeatureDependencies) {
            jh8.b(fVar);
            jh8.b(combinedSelectionMapFeatureDependencies);
            return new a(combinedSelectionMapFeatureDependencies, fVar);
        }
    }

    public static xf1.b a() {
        return new b();
    }
}
