package defpackage;

import com.dodopizza.controlling.feature.feedbackbuttons.FeedbackButtonsFeatureDependencies;
import com.dodopizza.controlling.feature.feedbackbuttons.presentation.FeedbackButtonsPresenter;
import defpackage.oq3;
/* compiled from: DaggerFeedbackButtonsComponent.java */
/* renamed from: wd2  reason: default package */
/* loaded from: classes.dex */
public final class wd2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerFeedbackButtonsComponent.java */
    /* renamed from: wd2$a */
    /* loaded from: classes.dex */
    public static final class a implements oq3.b {
        private a() {
        }

        @Override // defpackage.oq3.b
        public oq3 a(FeedbackButtonsFeatureDependencies feedbackButtonsFeatureDependencies, pq3 pq3Var) {
            jh8.b(feedbackButtonsFeatureDependencies);
            jh8.b(pq3Var);
            return new b(new vq3(), feedbackButtonsFeatureDependencies, pq3Var);
        }
    }

    /* compiled from: DaggerFeedbackButtonsComponent.java */
    /* renamed from: wd2$b */
    /* loaded from: classes.dex */
    private static final class b implements oq3 {
        private final vq3 b;
        private final pq3 c;
        private final FeedbackButtonsFeatureDependencies d;
        private final b e;

        private uq3 b() {
            return wq3.a(this.b, (o69) jh8.d(this.d.f0()), (eb0) jh8.d(this.d.m0()));
        }

        @Override // defpackage.oq3
        public FeedbackButtonsPresenter a() {
            return xq3.a(this.b, this.c, (gc) jh8.d(this.d.a()), b(), (yq3) jh8.d(this.d.V1()), (eb0) jh8.d(this.d.m0()), (ah7) jh8.d(this.d.E()));
        }

        private b(vq3 vq3Var, FeedbackButtonsFeatureDependencies feedbackButtonsFeatureDependencies, pq3 pq3Var) {
            this.e = this;
            this.b = vq3Var;
            this.c = pq3Var;
            this.d = feedbackButtonsFeatureDependencies;
        }
    }

    public static oq3.b a() {
        return new a();
    }
}
