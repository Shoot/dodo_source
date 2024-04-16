package defpackage;
/* compiled from: FeedbackPhotosModule_ProvideOrderRatingPhotosInteractorFactory.java */
/* renamed from: tr3  reason: default package */
/* loaded from: classes.dex */
public final class tr3 implements no3<vh7> {
    private final as8<k69> a;

    public tr3(as8<k69> as8Var) {
        this.a = as8Var;
    }

    public static tr3 a(as8<k69> as8Var) {
        return new tr3(as8Var);
    }

    public static vh7 c(k69 k69Var) {
        return (vh7) jh8.e(rr3.a.b(k69Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public vh7 get() {
        return c(this.a.get());
    }
}
