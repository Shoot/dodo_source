package defpackage;

import com.dodopizza.order.feature.promoaction.SpecialOfferDialogFeatureDependency;
import com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter;
import defpackage.fra;
/* compiled from: DaggerSpecialOfferComponent.java */
/* renamed from: oj2  reason: default package */
/* loaded from: classes2.dex */
public final class oj2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerSpecialOfferComponent.java */
    /* renamed from: oj2$a */
    /* loaded from: classes2.dex */
    public static final class a implements fra.b {
        private a() {
        }

        @Override // defpackage.fra.b
        public fra a(tra traVar, cq8 cq8Var, SpecialOfferDialogFeatureDependency specialOfferDialogFeatureDependency) {
            jh8.b(traVar);
            jh8.b(cq8Var);
            jh8.b(specialOfferDialogFeatureDependency);
            return new b(specialOfferDialogFeatureDependency, traVar, cq8Var);
        }
    }

    /* compiled from: DaggerSpecialOfferComponent.java */
    /* renamed from: oj2$b */
    /* loaded from: classes2.dex */
    private static final class b implements fra {
        private final b b;
        private as8<tra> c;
        private as8<cq8> d;
        private as8<nfa> e;
        private as8<kp8> f;
        private as8<i00> g;
        private as8<gc> h;
        private as8<ah6> i;
        private as8<jra> j;
        private as8<aub> k;
        private as8<bq> l;
        private as8<SpecialOfferDialogPresenter> m;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSpecialOfferComponent.java */
        /* renamed from: oj2$b$a */
        /* loaded from: classes2.dex */
        public static final class a implements as8<gc> {
            private final SpecialOfferDialogFeatureDependency a;

            a(SpecialOfferDialogFeatureDependency specialOfferDialogFeatureDependency) {
                this.a = specialOfferDialogFeatureDependency;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSpecialOfferComponent.java */
        /* renamed from: oj2$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0461b implements as8<bq> {
            private final SpecialOfferDialogFeatureDependency a;

            C0461b(SpecialOfferDialogFeatureDependency specialOfferDialogFeatureDependency) {
                this.a = specialOfferDialogFeatureDependency;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public bq get() {
                return (bq) jh8.d(this.a.W0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSpecialOfferComponent.java */
        /* renamed from: oj2$b$c */
        /* loaded from: classes2.dex */
        public static final class c implements as8<i00> {
            private final SpecialOfferDialogFeatureDependency a;

            c(SpecialOfferDialogFeatureDependency specialOfferDialogFeatureDependency) {
                this.a = specialOfferDialogFeatureDependency;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public i00 get() {
                return (i00) jh8.d(this.a.g());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSpecialOfferComponent.java */
        /* renamed from: oj2$b$d */
        /* loaded from: classes2.dex */
        public static final class d implements as8<ah6> {
            private final SpecialOfferDialogFeatureDependency a;

            d(SpecialOfferDialogFeatureDependency specialOfferDialogFeatureDependency) {
                this.a = specialOfferDialogFeatureDependency;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ah6 get() {
                return (ah6) jh8.d(this.a.l());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSpecialOfferComponent.java */
        /* renamed from: oj2$b$e */
        /* loaded from: classes2.dex */
        public static final class e implements as8<kp8> {
            private final SpecialOfferDialogFeatureDependency a;

            e(SpecialOfferDialogFeatureDependency specialOfferDialogFeatureDependency) {
                this.a = specialOfferDialogFeatureDependency;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public kp8 get() {
                return (kp8) jh8.d(this.a.K2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSpecialOfferComponent.java */
        /* renamed from: oj2$b$f */
        /* loaded from: classes2.dex */
        public static final class f implements as8<nfa> {
            private final SpecialOfferDialogFeatureDependency a;

            f(SpecialOfferDialogFeatureDependency specialOfferDialogFeatureDependency) {
                this.a = specialOfferDialogFeatureDependency;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public nfa get() {
                return (nfa) jh8.d(this.a.b0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerSpecialOfferComponent.java */
        /* renamed from: oj2$b$g */
        /* loaded from: classes2.dex */
        public static final class g implements as8<aub> {
            private final SpecialOfferDialogFeatureDependency a;

            g(SpecialOfferDialogFeatureDependency specialOfferDialogFeatureDependency) {
                this.a = specialOfferDialogFeatureDependency;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public aub get() {
                return (aub) jh8.d(this.a.i1());
            }
        }

        private void b(SpecialOfferDialogFeatureDependency specialOfferDialogFeatureDependency, tra traVar, cq8 cq8Var) {
            this.c = z45.a(traVar);
            this.d = z45.a(cq8Var);
            this.e = new f(specialOfferDialogFeatureDependency);
            this.f = new e(specialOfferDialogFeatureDependency);
            this.g = new c(specialOfferDialogFeatureDependency);
            this.h = new a(specialOfferDialogFeatureDependency);
            d dVar = new d(specialOfferDialogFeatureDependency);
            this.i = dVar;
            this.j = p63.a(ora.a(dVar));
            this.k = new g(specialOfferDialogFeatureDependency);
            C0461b c0461b = new C0461b(specialOfferDialogFeatureDependency);
            this.l = c0461b;
            this.m = p63.a(pra.a(this.c, this.d, this.e, this.f, this.g, this.h, this.j, this.k, c0461b));
        }

        @Override // defpackage.fra
        public SpecialOfferDialogPresenter a() {
            return this.m.get();
        }

        private b(SpecialOfferDialogFeatureDependency specialOfferDialogFeatureDependency, tra traVar, cq8 cq8Var) {
            this.b = this;
            b(specialOfferDialogFeatureDependency, traVar, cq8Var);
        }
    }

    public static fra.b a() {
        return new a();
    }
}
