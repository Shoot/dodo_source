package defpackage;

import com.dodopizza.contacts.feature.feedback.FeedbackFeatureDependencies;
import com.dodopizza.contacts.feature.feedback.presentation.FeedbackPresenter;
import defpackage.er3;
import ru.dodopizza.app.domain.DodopizzaApi;
/* compiled from: DaggerFeedbackComponent.java */
/* renamed from: zd2  reason: default package */
/* loaded from: classes.dex */
public final class zd2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerFeedbackComponent.java */
    /* renamed from: zd2$a */
    /* loaded from: classes.dex */
    public static final class a implements er3.b {
        private a() {
        }

        @Override // defpackage.er3.b
        public er3 a(FeedbackFeatureDependencies feedbackFeatureDependencies) {
            jh8.b(feedbackFeatureDependencies);
            return new b(feedbackFeatureDependencies);
        }
    }

    /* compiled from: DaggerFeedbackComponent.java */
    /* renamed from: zd2$b */
    /* loaded from: classes.dex */
    private static final class b implements er3 {
        private final b b;
        private as8<f63> c;
        private as8<ava> d;
        private as8<DodopizzaApi> e;
        private as8<dt5> f;
        private as8<oba> g;
        private as8<FeedbackPresenter> h;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerFeedbackComponent.java */
        /* renamed from: zd2$b$a */
        /* loaded from: classes.dex */
        public static final class a implements as8<DodopizzaApi> {
            private final FeedbackFeatureDependencies a;

            a(FeedbackFeatureDependencies feedbackFeatureDependencies) {
                this.a = feedbackFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public DodopizzaApi get() {
                return (DodopizzaApi) jh8.d(this.a.w0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerFeedbackComponent.java */
        /* renamed from: zd2$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0761b implements as8<dt5> {
            private final FeedbackFeatureDependencies a;

            C0761b(FeedbackFeatureDependencies feedbackFeatureDependencies) {
                this.a = feedbackFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public dt5 get() {
                return (dt5) jh8.d(this.a.F());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerFeedbackComponent.java */
        /* renamed from: zd2$b$c */
        /* loaded from: classes.dex */
        public static final class c implements as8<f63> {
            private final FeedbackFeatureDependencies a;

            c(FeedbackFeatureDependencies feedbackFeatureDependencies) {
                this.a = feedbackFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerFeedbackComponent.java */
        /* renamed from: zd2$b$d */
        /* loaded from: classes.dex */
        public static final class d implements as8<ava> {
            private final FeedbackFeatureDependencies a;

            d(FeedbackFeatureDependencies feedbackFeatureDependencies) {
                this.a = feedbackFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ava get() {
                return (ava) jh8.d(this.a.h());
            }
        }

        private void b(FeedbackFeatureDependencies feedbackFeatureDependencies) {
            this.c = new c(feedbackFeatureDependencies);
            this.d = new d(feedbackFeatureDependencies);
            this.e = new a(feedbackFeatureDependencies);
            C0761b c0761b = new C0761b(feedbackFeatureDependencies);
            this.f = c0761b;
            as8<oba> a2 = p63.a(pba.a(this.d, this.e, c0761b));
            this.g = a2;
            this.h = p63.a(yr3.a(this.c, a2));
        }

        private gr3 c(gr3 gr3Var) {
            hr3.a(gr3Var, this.h);
            return gr3Var;
        }

        @Override // defpackage.er3
        public void a(gr3 gr3Var) {
            c(gr3Var);
        }

        private b(FeedbackFeatureDependencies feedbackFeatureDependencies) {
            this.b = this;
            b(feedbackFeatureDependencies);
        }
    }

    public static er3.b a() {
        return new a();
    }
}
