package com.dodopizza.controlling.feature.ratingcomment.di;

import com.dodopizza.controlling.feature.ratingcomment.RatingCommentFeatureDependencies;
import com.dodopizza.controlling.feature.ratingcomment.di.RatingCommentComponent;
import com.dodopizza.controlling.feature.ratingcomment.presentation.RatingCommentPresenter;
/* loaded from: classes.dex */
public final class DaggerRatingCommentComponent {

    /* loaded from: classes.dex */
    private static final class RatingCommentComponentImpl implements RatingCommentComponent {
        private final RatingCommentFeatureDependencies g;
        private final RatingCommentComponentImpl h;
        private as8<b69> i;
        private as8<m59> j;
        private as8<Boolean> k;
        private as8<z59> l;
        private as8<RatingCommentPresenter> m;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class a implements as8<z59> {
            private final RatingCommentFeatureDependencies a;

            a(RatingCommentFeatureDependencies ratingCommentFeatureDependencies) {
                this.a = ratingCommentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public z59 get() {
                return (z59) jh8.d(this.a.F1());
            }
        }

        private void P2(RatingCommentFeatureDependencies ratingCommentFeatureDependencies, b69 b69Var, m59 m59Var, Boolean bool) {
            this.i = z45.b(b69Var);
            this.j = z45.a(m59Var);
            this.k = z45.a(bool);
            a aVar = new a(ratingCommentFeatureDependencies);
            this.l = aVar;
            this.m = p63.a(w59.a(this.i, this.j, this.k, aVar));
        }

        private t59 l4(t59 t59Var) {
            u59.a(t59Var, this.m);
            return t59Var;
        }

        @Override // com.dodopizza.controlling.feature.ratingcomment.di.RatingCommentComponent
        public void P1(t59 t59Var) {
            l4(t59Var);
        }

        @Override // com.dodopizza.controlling.feature.feedbackphotos.FeedbackPhotosFeatureDependencies
        public ur3 S0() {
            return (ur3) jh8.d(this.g.S0());
        }

        @Override // com.dodopizza.controlling.feature.feedbackphotos.FeedbackPhotosFeatureDependencies
        public k69 U0() {
            return (k69) jh8.d(this.g.U0());
        }

        @Override // com.dodopizza.controlling.feature.feedbackphotos.FeedbackPhotosFeatureDependencies
        public or3 x2() {
            return x59.a(this.m.get());
        }

        private RatingCommentComponentImpl(RatingCommentFeatureDependencies ratingCommentFeatureDependencies, b69 b69Var, m59 m59Var, Boolean bool) {
            this.h = this;
            this.g = ratingCommentFeatureDependencies;
            P2(ratingCommentFeatureDependencies, b69Var, m59Var, bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements RatingCommentComponent.b {
        private a() {
        }

        @Override // com.dodopizza.controlling.feature.ratingcomment.di.RatingCommentComponent.b
        public RatingCommentComponent a(b69 b69Var, m59 m59Var, boolean z, RatingCommentFeatureDependencies ratingCommentFeatureDependencies) {
            jh8.b(m59Var);
            jh8.b(Boolean.valueOf(z));
            jh8.b(ratingCommentFeatureDependencies);
            return new RatingCommentComponentImpl(ratingCommentFeatureDependencies, b69Var, m59Var, Boolean.valueOf(z));
        }
    }

    public static RatingCommentComponent.b a() {
        return new a();
    }
}
