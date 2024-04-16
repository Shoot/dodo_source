package defpackage;
/* compiled from: ShoppingCartDelegateModule_ProvideShoppingCartDelegateFactory.java */
/* renamed from: qia  reason: default package */
/* loaded from: classes3.dex */
public final class qia implements no3<nia> {
    private final as8<f63> a;
    private final as8<gc> b;

    public qia(as8<f63> as8Var, as8<gc> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static qia a(as8<f63> as8Var, as8<gc> as8Var2) {
        return new qia(as8Var, as8Var2);
    }

    public static nia c(f63 f63Var, gc gcVar) {
        return (nia) jh8.e(pia.a.a(f63Var, gcVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public nia get() {
        return c(this.a.get(), this.b.get());
    }
}
