package defpackage;

import com.dodopizza.order.feature.assistant.wishes.presentation.AssistantWishesPresenter;
/* compiled from: AssistantWishesPresenter_Factory.java */
/* renamed from: lx  reason: default package */
/* loaded from: classes2.dex */
public final class lx implements no3<AssistantWishesPresenter> {
    private final as8<ex> a;
    private final as8<f63> b;
    private final as8<gc> c;
    private final as8<hx> d;

    public lx(as8<ex> as8Var, as8<f63> as8Var2, as8<gc> as8Var3, as8<hx> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static lx a(as8<ex> as8Var, as8<f63> as8Var2, as8<gc> as8Var3, as8<hx> as8Var4) {
        return new lx(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static AssistantWishesPresenter c(ex exVar, f63 f63Var, gc gcVar, hx hxVar) {
        return new AssistantWishesPresenter(exVar, f63Var, gcVar, hxVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public AssistantWishesPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
