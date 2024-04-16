package defpackage;

import com.dodopizza.order.feature.assistant.preferences.presentation.AssistantPreferencesPresenter;
/* compiled from: AssistantPreferencesPresenter_Factory.java */
/* renamed from: mv  reason: default package */
/* loaded from: classes2.dex */
public final class mv implements no3<AssistantPreferencesPresenter> {
    private final as8<fv> a;
    private final as8<f63> b;
    private final as8<gc> c;
    private final as8<iv> d;

    public mv(as8<fv> as8Var, as8<f63> as8Var2, as8<gc> as8Var3, as8<iv> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static mv a(as8<fv> as8Var, as8<f63> as8Var2, as8<gc> as8Var3, as8<iv> as8Var4) {
        return new mv(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static AssistantPreferencesPresenter c(fv fvVar, f63 f63Var, gc gcVar, iv ivVar) {
        return new AssistantPreferencesPresenter(fvVar, f63Var, gcVar, ivVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public AssistantPreferencesPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
