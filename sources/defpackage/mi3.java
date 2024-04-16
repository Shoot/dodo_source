package defpackage;

import ru.dodopizza.app.presentation.entername.EnterNamePresenter;
/* compiled from: EnterNameModule_ProvidePresenterFactory.java */
/* renamed from: mi3  reason: default package */
/* loaded from: classes3.dex */
public final class mi3 implements no3<EnterNamePresenter> {
    private final as8<ei3> a;
    private final as8<ji3> b;
    private final as8<f63> c;
    private final as8<gc> d;

    public mi3(as8<ei3> as8Var, as8<ji3> as8Var2, as8<f63> as8Var3, as8<gc> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static mi3 a(as8<ei3> as8Var, as8<ji3> as8Var2, as8<f63> as8Var3, as8<gc> as8Var4) {
        return new mi3(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static EnterNamePresenter c(ei3 ei3Var, ji3 ji3Var, f63 f63Var, gc gcVar) {
        return (EnterNamePresenter) jh8.e(li3.a.a(ei3Var, ji3Var, f63Var, gcVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public EnterNamePresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
