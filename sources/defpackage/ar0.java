package defpackage;
/* compiled from: CartModule_ProvideCartContentServiceFactory.java */
/* renamed from: ar0  reason: default package */
/* loaded from: classes3.dex */
public final class ar0 implements no3<fq0> {
    private final as8<ija> a;
    private final as8<rr0> b;

    public ar0(as8<ija> as8Var, as8<rr0> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static ar0 a(as8<ija> as8Var, as8<rr0> as8Var2) {
        return new ar0(as8Var, as8Var2);
    }

    public static fq0 c(ija ijaVar, rr0 rr0Var) {
        return (fq0) jh8.e(yq0.a.b(ijaVar, rr0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public fq0 get() {
        return c(this.a.get(), this.b.get());
    }
}
