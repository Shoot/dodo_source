package defpackage;
/* compiled from: CartModule_ProvideCartItemProcessRepositoryFactory.java */
/* renamed from: dr0  reason: default package */
/* loaded from: classes3.dex */
public final class dr0 implements no3<rr0> {
    private final as8<jk2> a;
    private final as8<sr0> b;

    public dr0(as8<jk2> as8Var, as8<sr0> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static dr0 a(as8<jk2> as8Var, as8<sr0> as8Var2) {
        return new dr0(as8Var, as8Var2);
    }

    public static rr0 c(jk2 jk2Var, sr0 sr0Var) {
        return (rr0) jh8.e(yq0.a.e(jk2Var, sr0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public rr0 get() {
        return c(this.a.get(), this.b.get());
    }
}
