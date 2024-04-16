package defpackage;

import com.dodopizza.order.feature.promocode.PromoCodeFeatureDependencies;
import com.dodopizza.order.feature.promocode.presentation.PromoCodePresenter;
import defpackage.qp8;
/* compiled from: DaggerPromoCodeComponent.java */
/* renamed from: xh2  reason: default package */
/* loaded from: classes2.dex */
public final class xh2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerPromoCodeComponent.java */
    /* renamed from: xh2$a */
    /* loaded from: classes2.dex */
    public static final class a implements qp8.b {
        private a() {
        }

        @Override // defpackage.qp8.b
        public qp8 a(cq8 cq8Var, PromoCodeFeatureDependencies promoCodeFeatureDependencies) {
            jh8.b(cq8Var);
            jh8.b(promoCodeFeatureDependencies);
            return new b(promoCodeFeatureDependencies, cq8Var);
        }
    }

    /* compiled from: DaggerPromoCodeComponent.java */
    /* renamed from: xh2$b */
    /* loaded from: classes2.dex */
    private static final class b implements qp8 {
        private final b b;
        private as8<nfa> c;
        private as8<hq3> d;
        private as8<gc> e;
        private as8<cq8> f;
        private as8<aq8> g;
        private as8<PromoCodePresenter> h;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerPromoCodeComponent.java */
        /* renamed from: xh2$b$a */
        /* loaded from: classes2.dex */
        public static final class a implements as8<gc> {
            private final PromoCodeFeatureDependencies a;

            a(PromoCodeFeatureDependencies promoCodeFeatureDependencies) {
                this.a = promoCodeFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerPromoCodeComponent.java */
        /* renamed from: xh2$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0736b implements as8<hq3> {
            private final PromoCodeFeatureDependencies a;

            C0736b(PromoCodeFeatureDependencies promoCodeFeatureDependencies) {
                this.a = promoCodeFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hq3 get() {
                return (hq3) jh8.d(this.a.c());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerPromoCodeComponent.java */
        /* renamed from: xh2$b$c */
        /* loaded from: classes2.dex */
        public static final class c implements as8<nfa> {
            private final PromoCodeFeatureDependencies a;

            c(PromoCodeFeatureDependencies promoCodeFeatureDependencies) {
                this.a = promoCodeFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public nfa get() {
                return (nfa) jh8.d(this.a.H1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerPromoCodeComponent.java */
        /* renamed from: xh2$b$d */
        /* loaded from: classes2.dex */
        public static final class d implements as8<aq8> {
            private final PromoCodeFeatureDependencies a;

            d(PromoCodeFeatureDependencies promoCodeFeatureDependencies) {
                this.a = promoCodeFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public aq8 get() {
                return (aq8) jh8.d(this.a.k2());
            }
        }

        private void b(PromoCodeFeatureDependencies promoCodeFeatureDependencies, cq8 cq8Var) {
            this.c = new c(promoCodeFeatureDependencies);
            this.d = new C0736b(promoCodeFeatureDependencies);
            this.e = new a(promoCodeFeatureDependencies);
            this.f = z45.a(cq8Var);
            d dVar = new d(promoCodeFeatureDependencies);
            this.g = dVar;
            this.h = p63.a(wp8.a(this.c, this.d, this.e, this.f, dVar));
        }

        @Override // defpackage.qp8
        public PromoCodePresenter a() {
            return this.h.get();
        }

        private b(PromoCodeFeatureDependencies promoCodeFeatureDependencies, cq8 cq8Var) {
            this.b = this;
            b(promoCodeFeatureDependencies, cq8Var);
        }
    }

    public static qp8.b a() {
        return new a();
    }
}
