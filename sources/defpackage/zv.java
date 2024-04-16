package defpackage;

import com.dodopizza.order.domain.assistant.AssistantApi;
/* compiled from: AssistantSettingsService_Factory.java */
/* renamed from: zv  reason: default package */
/* loaded from: classes2.dex */
public final class zv implements no3<yv> {
    private final as8<AssistantApi> a;
    private final as8<tv> b;

    public zv(as8<AssistantApi> as8Var, as8<tv> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static zv a(as8<AssistantApi> as8Var, as8<tv> as8Var2) {
        return new zv(as8Var, as8Var2);
    }

    public static yv c(AssistantApi assistantApi, tv tvVar) {
        return new yv(assistantApi, tvVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public yv get() {
        return c(this.a.get(), this.b.get());
    }
}
