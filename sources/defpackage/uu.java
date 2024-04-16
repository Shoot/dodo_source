package defpackage;

import com.dodopizza.order.feature.assistant.mood.presentation.AssistantMoodPresenter;
/* compiled from: AssistantMoodPresenter_Factory.java */
/* renamed from: uu  reason: default package */
/* loaded from: classes2.dex */
public final class uu implements no3<AssistantMoodPresenter> {
    private final as8<f63> a;
    private final as8<gc> b;
    private final as8<qu> c;

    public uu(as8<f63> as8Var, as8<gc> as8Var2, as8<qu> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static uu a(as8<f63> as8Var, as8<gc> as8Var2, as8<qu> as8Var3) {
        return new uu(as8Var, as8Var2, as8Var3);
    }

    public static AssistantMoodPresenter c(f63 f63Var, gc gcVar, qu quVar) {
        return new AssistantMoodPresenter(f63Var, gcVar, quVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public AssistantMoodPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
