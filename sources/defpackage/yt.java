package defpackage;

import com.dodopizza.order.feature.assistant.result.presentation.AssistantGeneratorResultPresenter;
/* compiled from: AssistantGeneratorResultPresenter_Factory.java */
/* renamed from: yt  reason: default package */
/* loaded from: classes2.dex */
public final class yt implements no3<AssistantGeneratorResultPresenter> {
    private final as8<st> a;
    private final as8<f63> b;
    private final as8<gc> c;
    private final as8<wt> d;

    public yt(as8<st> as8Var, as8<f63> as8Var2, as8<gc> as8Var3, as8<wt> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static yt a(as8<st> as8Var, as8<f63> as8Var2, as8<gc> as8Var3, as8<wt> as8Var4) {
        return new yt(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static AssistantGeneratorResultPresenter c(st stVar, f63 f63Var, gc gcVar, wt wtVar) {
        return new AssistantGeneratorResultPresenter(stVar, f63Var, gcVar, wtVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public AssistantGeneratorResultPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
