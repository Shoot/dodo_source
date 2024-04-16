package defpackage;

import com.dodopizza.controlling.feature.feedbackphotos.FeedbackPhotosFeatureDependencies;
import com.dodopizza.controlling.feature.feedbackphotos.presentation.FeedbackPhotosPresenter;
import defpackage.mr3;
/* compiled from: DaggerFeedbackPhotosComponent.java */
/* renamed from: ce2  reason: default package */
/* loaded from: classes.dex */
public final class ce2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerFeedbackPhotosComponent.java */
    /* renamed from: ce2$a */
    /* loaded from: classes.dex */
    public static final class a implements mr3.b {
        private a() {
        }

        @Override // defpackage.mr3.b
        public mr3 a(FeedbackPhotosFeatureDependencies feedbackPhotosFeatureDependencies, nr3 nr3Var) {
            jh8.b(feedbackPhotosFeatureDependencies);
            jh8.b(nr3Var);
            return new b(feedbackPhotosFeatureDependencies, nr3Var);
        }
    }

    /* compiled from: DaggerFeedbackPhotosComponent.java */
    /* renamed from: ce2$b */
    /* loaded from: classes.dex */
    private static final class b implements mr3 {
        private final b b;
        private as8<nr3> c;
        private as8<k69> d;
        private as8<vh7> e;
        private as8<ur3> f;
        private as8<or3> g;
        private as8<FeedbackPhotosPresenter> h;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerFeedbackPhotosComponent.java */
        /* renamed from: ce2$b$a */
        /* loaded from: classes.dex */
        public static final class a implements as8<or3> {
            private final FeedbackPhotosFeatureDependencies a;

            a(FeedbackPhotosFeatureDependencies feedbackPhotosFeatureDependencies) {
                this.a = feedbackPhotosFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public or3 get() {
                return (or3) jh8.d(this.a.x2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerFeedbackPhotosComponent.java */
        /* renamed from: ce2$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0084b implements as8<ur3> {
            private final FeedbackPhotosFeatureDependencies a;

            C0084b(FeedbackPhotosFeatureDependencies feedbackPhotosFeatureDependencies) {
                this.a = feedbackPhotosFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ur3 get() {
                return (ur3) jh8.d(this.a.S0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerFeedbackPhotosComponent.java */
        /* renamed from: ce2$b$c */
        /* loaded from: classes.dex */
        public static final class c implements as8<k69> {
            private final FeedbackPhotosFeatureDependencies a;

            c(FeedbackPhotosFeatureDependencies feedbackPhotosFeatureDependencies) {
                this.a = feedbackPhotosFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public k69 get() {
                return (k69) jh8.d(this.a.U0());
            }
        }

        private void b(FeedbackPhotosFeatureDependencies feedbackPhotosFeatureDependencies, nr3 nr3Var) {
            this.c = z45.a(nr3Var);
            c cVar = new c(feedbackPhotosFeatureDependencies);
            this.d = cVar;
            this.e = p63.a(tr3.a(cVar));
            this.f = new C0084b(feedbackPhotosFeatureDependencies);
            a aVar = new a(feedbackPhotosFeatureDependencies);
            this.g = aVar;
            this.h = p63.a(sr3.a(this.c, this.e, this.f, aVar));
        }

        private pr3 c(pr3 pr3Var) {
            qr3.a(pr3Var, this.h);
            return pr3Var;
        }

        @Override // defpackage.mr3
        public void a(pr3 pr3Var) {
            c(pr3Var);
        }

        private b(FeedbackPhotosFeatureDependencies feedbackPhotosFeatureDependencies, nr3 nr3Var) {
            this.b = this;
            b(feedbackPhotosFeatureDependencies, nr3Var);
        }
    }

    public static mr3.b a() {
        return new a();
    }
}
