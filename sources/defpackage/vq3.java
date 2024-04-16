package defpackage;

import com.dodopizza.controlling.feature.feedbackbuttons.presentation.FeedbackButtonsPresenter;
import kotlin.Metadata;
/* compiled from: FeedbackButtonsModule.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J8\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\u0015"}, d2 = {"Lvq3;", "", "Lpq3;", "data", "Lgc;", "analytics", "Luq3;", "interactor", "Lyq3;", "router", "Leb0;", "binaryFeedbackFeatureState", "Lah7;", "orderRatingAutoSubmitFeatureState", "Lcom/dodopizza/controlling/feature/feedbackbuttons/presentation/FeedbackButtonsPresenter;", "b", "Lo69;", "ratingService", "a", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vq3  reason: default package */
/* loaded from: classes.dex */
public final class vq3 {
    public final uq3 a(o69 o69Var, eb0 eb0Var) {
        z65.h(o69Var, "ratingService");
        z65.h(eb0Var, "binaryFeedbackFeatureState");
        return new uq3(o69Var, eb0Var, null, 4, null);
    }

    public final FeedbackButtonsPresenter b(pq3 pq3Var, gc gcVar, uq3 uq3Var, yq3 yq3Var, eb0 eb0Var, ah7 ah7Var) {
        z65.h(pq3Var, "data");
        z65.h(gcVar, "analytics");
        z65.h(uq3Var, "interactor");
        z65.h(yq3Var, "router");
        z65.h(eb0Var, "binaryFeedbackFeatureState");
        z65.h(ah7Var, "orderRatingAutoSubmitFeatureState");
        return new FeedbackButtonsPresenter(pq3Var, gcVar, uq3Var, yq3Var, eb0Var, ah7Var);
    }
}
