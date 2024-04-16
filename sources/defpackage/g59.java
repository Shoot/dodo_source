package defpackage;

import com.dodopizza.controlling.feature.ratingapplied.presentation.RatingAppliedPresenter;
import defpackage.tmb;
import kotlin.Metadata;
/* compiled from: RatingAppliedModule.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000eH\u0007¨\u0006\u0012"}, d2 = {"Lg59;", "", "", "orderId", "", "contactMeChecked", "Lay1;", tmb.c.COUNTRY_JSON_NAME, "Lj59;", "router", "Lah7;", "orderRatingAutoSubmitFeatureState", "Lcom/dodopizza/controlling/feature/ratingapplied/presentation/RatingAppliedPresenter;", "a", "Lf63;", "b", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: g59  reason: default package */
/* loaded from: classes.dex */
public final class g59 {
    public static final g59 a = new g59();

    private g59() {
    }

    public final RatingAppliedPresenter a(String str, boolean z, ay1 ay1Var, j59 j59Var, ah7 ah7Var) {
        z65.h(str, "orderId");
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        z65.h(j59Var, "router");
        z65.h(ah7Var, "orderRatingAutoSubmitFeatureState");
        return new RatingAppliedPresenter(str, z, ay1Var, j59Var, ah7Var);
    }

    public final j59 b(f63 f63Var) {
        z65.h(f63Var, "router");
        return new j59(f63Var);
    }
}
