package defpackage;

import com.dodopizza.controlling.feature.rateapp.RateAppFeatureDependencies;
import com.dodopizza.controlling.feature.rateapp.presentation.RateAppDialogPresenter;
import defpackage.h49;
/* compiled from: DaggerRateAppDialogComponent.java */
/* renamed from: ai2  reason: default package */
/* loaded from: classes.dex */
public final class ai2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerRateAppDialogComponent.java */
    /* renamed from: ai2$a */
    /* loaded from: classes.dex */
    public static final class a implements h49.b {
        private a() {
        }

        @Override // defpackage.h49.b
        public h49 a(RateAppFeatureDependencies rateAppFeatureDependencies) {
            jh8.b(rateAppFeatureDependencies);
            return new b(rateAppFeatureDependencies);
        }
    }

    /* compiled from: DaggerRateAppDialogComponent.java */
    /* renamed from: ai2$b */
    /* loaded from: classes.dex */
    private static final class b implements h49 {
        private final b b;
        private as8<x49> c;
        private as8<m49> d;
        private as8<q49> e;
        private as8<RateAppDialogPresenter> f;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerRateAppDialogComponent.java */
        /* renamed from: ai2$b$a */
        /* loaded from: classes.dex */
        public static final class a implements as8<q49> {
            private final RateAppFeatureDependencies a;

            a(RateAppFeatureDependencies rateAppFeatureDependencies) {
                this.a = rateAppFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public q49 get() {
                return (q49) jh8.d(this.a.L3());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerRateAppDialogComponent.java */
        /* renamed from: ai2$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0001b implements as8<x49> {
            private final RateAppFeatureDependencies a;

            C0001b(RateAppFeatureDependencies rateAppFeatureDependencies) {
                this.a = rateAppFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public x49 get() {
                return (x49) jh8.d(this.a.D0());
            }
        }

        private void b(RateAppFeatureDependencies rateAppFeatureDependencies) {
            C0001b c0001b = new C0001b(rateAppFeatureDependencies);
            this.c = c0001b;
            this.d = p63.a(o49.a(c0001b));
            a aVar = new a(rateAppFeatureDependencies);
            this.e = aVar;
            this.f = p63.a(p49.a(this.d, aVar));
        }

        private k49 c(k49 k49Var) {
            l49.a(k49Var, this.f);
            return k49Var;
        }

        @Override // defpackage.h49
        public void a(k49 k49Var) {
            c(k49Var);
        }

        private b(RateAppFeatureDependencies rateAppFeatureDependencies) {
            this.b = this;
            b(rateAppFeatureDependencies);
        }
    }

    public static h49.b a() {
        return new a();
    }
}
