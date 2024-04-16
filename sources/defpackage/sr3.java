package defpackage;

import com.dodopizza.controlling.feature.feedbackphotos.presentation.FeedbackPhotosPresenter;
/* compiled from: FeedbackPhotosModule_ProvideFeedbackPhotosPresenterFactory.java */
/* renamed from: sr3  reason: default package */
/* loaded from: classes.dex */
public final class sr3 implements no3<FeedbackPhotosPresenter> {
    private final as8<nr3> a;
    private final as8<vh7> b;
    private final as8<ur3> c;
    private final as8<or3> d;

    public sr3(as8<nr3> as8Var, as8<vh7> as8Var2, as8<ur3> as8Var3, as8<or3> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static sr3 a(as8<nr3> as8Var, as8<vh7> as8Var2, as8<ur3> as8Var3, as8<or3> as8Var4) {
        return new sr3(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static FeedbackPhotosPresenter c(nr3 nr3Var, vh7 vh7Var, ur3 ur3Var, or3 or3Var) {
        return (FeedbackPhotosPresenter) jh8.e(rr3.a.a(nr3Var, vh7Var, ur3Var, or3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public FeedbackPhotosPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
