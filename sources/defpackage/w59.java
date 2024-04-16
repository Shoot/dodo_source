package defpackage;

import com.dodopizza.controlling.feature.ratingcomment.presentation.RatingCommentPresenter;
/* compiled from: RatingCommentModule_ProvideRatingCommentPresenterFactory.java */
/* renamed from: w59  reason: default package */
/* loaded from: classes.dex */
public final class w59 implements no3<RatingCommentPresenter> {
    private final as8<b69> a;
    private final as8<m59> b;
    private final as8<Boolean> c;
    private final as8<z59> d;

    public w59(as8<b69> as8Var, as8<m59> as8Var2, as8<Boolean> as8Var3, as8<z59> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static w59 a(as8<b69> as8Var, as8<m59> as8Var2, as8<Boolean> as8Var3, as8<z59> as8Var4) {
        return new w59(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static RatingCommentPresenter c(b69 b69Var, m59 m59Var, boolean z, z59 z59Var) {
        return (RatingCommentPresenter) jh8.e(v59.a.a(b69Var, m59Var, z, z59Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public RatingCommentPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get().booleanValue(), this.d.get());
    }
}
