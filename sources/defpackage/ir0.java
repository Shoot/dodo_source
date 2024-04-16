package defpackage;
/* compiled from: CartModule_ProvideCartServiceFactory.java */
/* renamed from: ir0  reason: default package */
/* loaded from: classes3.dex */
public final class ir0 implements no3<ds0> {
    private final as8<kq0> a;
    private final as8<fq0> b;

    public ir0(as8<kq0> as8Var, as8<fq0> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static ir0 a(as8<kq0> as8Var, as8<fq0> as8Var2) {
        return new ir0(as8Var, as8Var2);
    }

    public static ds0 c(kq0 kq0Var, fq0 fq0Var) {
        return (ds0) jh8.e(yq0.a.j(kq0Var, fq0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ds0 get() {
        return c(this.a.get(), this.b.get());
    }
}
