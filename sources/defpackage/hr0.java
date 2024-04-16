package defpackage;
/* compiled from: CartModule_ProvideCartQueueServiceFactory.java */
/* renamed from: hr0  reason: default package */
/* loaded from: classes3.dex */
public final class hr0 implements no3<as0> {
    private final as8<rr0> a;
    private final as8<k63> b;

    public hr0(as8<rr0> as8Var, as8<k63> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static hr0 a(as8<rr0> as8Var, as8<k63> as8Var2) {
        return new hr0(as8Var, as8Var2);
    }

    public static as0 c(rr0 rr0Var, k63 k63Var) {
        return (as0) jh8.e(yq0.a.i(rr0Var, k63Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public as0 get() {
        return c(this.a.get(), this.b.get());
    }
}
