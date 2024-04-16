package defpackage;

import ru.dodopizza.app.presentation.collaboration.CollaborationPromoPresenter;
/* compiled from: CollaborationPromoModule_ProvideCollaborationPromoPresenterFactory.java */
/* renamed from: pb1  reason: default package */
/* loaded from: classes3.dex */
public final class pb1 implements no3<CollaborationPromoPresenter> {
    private final as8<rb1> a;
    private final as8<gc> b;

    public pb1(as8<rb1> as8Var, as8<gc> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static pb1 a(as8<rb1> as8Var, as8<gc> as8Var2) {
        return new pb1(as8Var, as8Var2);
    }

    public static CollaborationPromoPresenter c(rb1 rb1Var, gc gcVar) {
        return (CollaborationPromoPresenter) jh8.e(ob1.a.a(rb1Var, gcVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public CollaborationPromoPresenter get() {
        return c(this.a.get(), this.b.get());
    }
}
