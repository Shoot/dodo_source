package defpackage;

import com.dodopizza.order.feature.assistant.welcome.presentation.AssistantWelcomePresenter;
/* compiled from: AssistantWelcomePresenter_Factory.java */
/* renamed from: uw  reason: default package */
/* loaded from: classes2.dex */
public final class uw implements no3<AssistantWelcomePresenter> {
    private final as8<nw> a;
    private final as8<f63> b;
    private final as8<gc> c;
    private final as8<sw> d;

    public uw(as8<nw> as8Var, as8<f63> as8Var2, as8<gc> as8Var3, as8<sw> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static uw a(as8<nw> as8Var, as8<f63> as8Var2, as8<gc> as8Var3, as8<sw> as8Var4) {
        return new uw(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static AssistantWelcomePresenter c(nw nwVar, f63 f63Var, gc gcVar, sw swVar) {
        return new AssistantWelcomePresenter(nwVar, f63Var, gcVar, swVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public AssistantWelcomePresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
