package defpackage;

import com.dodopizza.order.feature.assistant.error.presentation.AssistantErrorPresenter;
/* compiled from: AssistantErrorPresenter_Factory.java */
/* renamed from: xs  reason: default package */
/* loaded from: classes2.dex */
public final class xs implements no3<AssistantErrorPresenter> {
    private final as8<us> a;
    private final as8<f63> b;
    private final as8<gc> c;

    public xs(as8<us> as8Var, as8<f63> as8Var2, as8<gc> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static xs a(as8<us> as8Var, as8<f63> as8Var2, as8<gc> as8Var3) {
        return new xs(as8Var, as8Var2, as8Var3);
    }

    public static AssistantErrorPresenter c(us usVar, f63 f63Var, gc gcVar) {
        return new AssistantErrorPresenter(usVar, f63Var, gcVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public AssistantErrorPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
