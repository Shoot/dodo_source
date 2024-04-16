package defpackage;

import com.dodopizza.controlling.feature.ratingapplied.RatingAppliedFeatureDependencies;
import com.dodopizza.controlling.feature.ratingapplied.presentation.RatingAppliedPresenter;
import defpackage.d59;
/* compiled from: DaggerRatingAppliedComponent.java */
/* renamed from: di2  reason: default package */
/* loaded from: classes.dex */
public final class di2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerRatingAppliedComponent.java */
    /* renamed from: di2$a */
    /* loaded from: classes.dex */
    public static final class a implements d59.b {
        private a() {
        }

        @Override // defpackage.d59.b
        public d59 a(String str, boolean z, RatingAppliedFeatureDependencies ratingAppliedFeatureDependencies) {
            jh8.b(str);
            jh8.b(Boolean.valueOf(z));
            jh8.b(ratingAppliedFeatureDependencies);
            return new b(ratingAppliedFeatureDependencies, str, Boolean.valueOf(z));
        }
    }

    /* compiled from: DaggerRatingAppliedComponent.java */
    /* renamed from: di2$b */
    /* loaded from: classes.dex */
    private static final class b implements d59 {
        private final String b;
        private final Boolean c;
        private final RatingAppliedFeatureDependencies d;
        private final b e;

        private j59 b() {
            return i59.a((f63) jh8.d(this.d.s()));
        }

        @Override // defpackage.d59
        public RatingAppliedPresenter a() {
            return h59.a(this.b, this.c.booleanValue(), (ay1) jh8.d(this.d.S()), b(), (ah7) jh8.d(this.d.E()));
        }

        private b(RatingAppliedFeatureDependencies ratingAppliedFeatureDependencies, String str, Boolean bool) {
            this.e = this;
            this.b = str;
            this.c = bool;
            this.d = ratingAppliedFeatureDependencies;
        }
    }

    public static d59.b a() {
        return new a();
    }
}
