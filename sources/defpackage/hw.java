package defpackage;

import com.dodopizza.order.feature.assistant.sharing.presentation.AssistantSharingPresenter;
/* compiled from: AssistantSharingPresenter_Factory.java */
/* renamed from: hw  reason: default package */
/* loaded from: classes2.dex */
public final class hw implements no3<AssistantSharingPresenter> {
    private final as8<f63> a;
    private final as8<gc> b;
    private final as8<fw> c;

    public hw(as8<f63> as8Var, as8<gc> as8Var2, as8<fw> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static hw a(as8<f63> as8Var, as8<gc> as8Var2, as8<fw> as8Var3) {
        return new hw(as8Var, as8Var2, as8Var3);
    }

    public static AssistantSharingPresenter c(f63 f63Var, gc gcVar, fw fwVar) {
        return new AssistantSharingPresenter(f63Var, gcVar, fwVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public AssistantSharingPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
