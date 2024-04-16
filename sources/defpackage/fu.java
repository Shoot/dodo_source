package defpackage;

import com.dodopizza.order.domain.assistant.AssistantApi;
/* compiled from: AssistantGeneratorService_Factory.java */
/* renamed from: fu  reason: default package */
/* loaded from: classes2.dex */
public final class fu implements no3<eu> {
    private final as8<AssistantApi> a;
    private final as8<pt> b;

    public fu(as8<AssistantApi> as8Var, as8<pt> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static fu a(as8<AssistantApi> as8Var, as8<pt> as8Var2) {
        return new fu(as8Var, as8Var2);
    }

    public static eu c(AssistantApi assistantApi, pt ptVar) {
        return new eu(assistantApi, ptVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public eu get() {
        return c(this.a.get(), this.b.get());
    }
}
