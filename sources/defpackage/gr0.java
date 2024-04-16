package defpackage;
/* compiled from: CartModule_ProvideCartQueueProcessServiceFactory.java */
/* renamed from: gr0  reason: default package */
/* loaded from: classes3.dex */
public final class gr0 implements no3<xr0> {
    private final as8<ur0> a;
    private final as8<as0> b;

    public gr0(as8<ur0> as8Var, as8<as0> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static gr0 a(as8<ur0> as8Var, as8<as0> as8Var2) {
        return new gr0(as8Var, as8Var2);
    }

    public static xr0 c(ur0 ur0Var, as0 as0Var) {
        return (xr0) jh8.e(yq0.a.h(ur0Var, as0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public xr0 get() {
        return c(this.a.get(), this.b.get());
    }
}
