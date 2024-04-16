package defpackage;

import com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorPresenter;
/* compiled from: AssistantGeneratorPresenter_Factory.java */
/* renamed from: lt  reason: default package */
/* loaded from: classes2.dex */
public final class lt implements no3<AssistantGeneratorPresenter> {
    private final as8<et> a;
    private final as8<f63> b;
    private final as8<gc> c;
    private final as8<jt> d;

    public lt(as8<et> as8Var, as8<f63> as8Var2, as8<gc> as8Var3, as8<jt> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static lt a(as8<et> as8Var, as8<f63> as8Var2, as8<gc> as8Var3, as8<jt> as8Var4) {
        return new lt(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static AssistantGeneratorPresenter c(et etVar, f63 f63Var, gc gcVar, jt jtVar) {
        return new AssistantGeneratorPresenter(etVar, f63Var, gcVar, jtVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public AssistantGeneratorPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
