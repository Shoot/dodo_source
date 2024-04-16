package defpackage;

import com.dodopizza.controlling.feature.feedbackphotos.presentation.FeedbackPhotosPresenter;
import kotlin.Metadata;
/* compiled from: FeedbackPhotosModule.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¨\u0006\u0011"}, d2 = {"Lrr3;", "", "Lnr3;", "data", "Lvh7;", "interactor", "Lur3;", "router", "Lor3;", "delegate", "Lcom/dodopizza/controlling/feature/feedbackphotos/presentation/FeedbackPhotosPresenter;", "a", "Lk69;", "ratingPhotoService", "b", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rr3  reason: default package */
/* loaded from: classes.dex */
public final class rr3 {
    public static final rr3 a = new rr3();

    private rr3() {
    }

    public final FeedbackPhotosPresenter a(nr3 nr3Var, vh7 vh7Var, ur3 ur3Var, or3 or3Var) {
        z65.h(nr3Var, "data");
        z65.h(vh7Var, "interactor");
        z65.h(ur3Var, "router");
        z65.h(or3Var, "delegate");
        return new FeedbackPhotosPresenter(nr3Var, vh7Var, ur3Var, or3Var);
    }

    public final vh7 b(k69 k69Var) {
        z65.h(k69Var, "ratingPhotoService");
        return new vh7(k69Var, null, 2, null);
    }
}
