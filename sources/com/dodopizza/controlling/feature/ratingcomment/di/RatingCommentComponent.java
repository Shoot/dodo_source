package com.dodopizza.controlling.feature.ratingcomment.di;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.feedbackphotos.FeedbackPhotosFeatureDependencies;
import com.dodopizza.controlling.feature.ratingcomment.RatingCommentFeatureDependencies;
import kotlin.Metadata;
/* compiled from: RatingCommentComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lcom/dodopizza/controlling/feature/ratingcomment/di/RatingCommentComponent;", "Lcom/dodopizza/controlling/feature/feedbackphotos/FeedbackPhotosFeatureDependencies;", "Lt59;", "fragment", "", "P1", DateTokenConverter.CONVERTER_KEY, "a", "b", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public interface RatingCommentComponent extends FeedbackPhotosFeatureDependencies {
    public static final a d = a.a;

    /* compiled from: RatingCommentComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/dodopizza/controlling/feature/ratingcomment/di/RatingCommentComponent$a;", "", "Lcom/dodopizza/controlling/feature/ratingcomment/di/RatingCommentComponent$b;", "a", "()Lcom/dodopizza/controlling/feature/ratingcomment/di/RatingCommentComponent$b;", "factory", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final b a() {
            b a2 = DaggerRatingCommentComponent.a();
            z65.g(a2, "factory(...)");
            return a2;
        }
    }

    /* compiled from: RatingCommentComponent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J0\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lcom/dodopizza/controlling/feature/ratingcomment/di/RatingCommentComponent$b;", "", "Lb69;", "restoredState", "Lm59;", "data", "", "isCameraAvailable", "Lcom/dodopizza/controlling/feature/ratingcomment/RatingCommentFeatureDependencies;", "dependencies", "Lcom/dodopizza/controlling/feature/ratingcomment/di/RatingCommentComponent;", "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public interface b {
        RatingCommentComponent a(b69 b69Var, m59 m59Var, boolean z, RatingCommentFeatureDependencies ratingCommentFeatureDependencies);
    }

    void P1(t59 t59Var);
}
