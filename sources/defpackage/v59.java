package defpackage;

import com.dodopizza.controlling.feature.ratingcomment.presentation.RatingCommentPresenter;
import kotlin.Metadata;
/* compiled from: RatingCommentModule.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J,\u0010\u000e\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¨\u0006\u0011"}, d2 = {"Lv59;", "", "Lcom/dodopizza/controlling/feature/ratingcomment/presentation/RatingCommentPresenter;", "presenter", "Lor3;", "b", "Lb69;", "restoredState", "Lm59;", "data", "", "isCameraAvailable", "Lz59;", "router", "a", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: v59  reason: default package */
/* loaded from: classes.dex */
public final class v59 {
    public static final v59 a = new v59();

    private v59() {
    }

    public final RatingCommentPresenter a(b69 b69Var, m59 m59Var, boolean z, z59 z59Var) {
        z65.h(m59Var, "data");
        z65.h(z59Var, "router");
        return new RatingCommentPresenter(b69Var, m59Var, z, z59Var);
    }

    public final or3 b(RatingCommentPresenter ratingCommentPresenter) {
        z65.h(ratingCommentPresenter, "presenter");
        return ratingCommentPresenter;
    }
}
