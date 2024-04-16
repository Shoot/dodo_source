package defpackage;

import com.dodopizza.contacts.feature.feedback.presentation.FeedbackPresenter;
/* compiled from: FeedbackPresenter_Factory.java */
/* renamed from: yr3  reason: default package */
/* loaded from: classes.dex */
public final class yr3 implements no3<FeedbackPresenter> {
    private final as8<f63> a;
    private final as8<oba> b;

    public yr3(as8<f63> as8Var, as8<oba> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static yr3 a(as8<f63> as8Var, as8<oba> as8Var2) {
        return new yr3(as8Var, as8Var2);
    }

    public static FeedbackPresenter c(f63 f63Var, oba obaVar) {
        return new FeedbackPresenter(f63Var, obaVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public FeedbackPresenter get() {
        return c(this.a.get(), this.b.get());
    }
}
