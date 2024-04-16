package defpackage;
/* compiled from: RepositoryModule_ProvideCartItemConverterFactory.java */
/* renamed from: vg9  reason: default package */
/* loaded from: classes3.dex */
public final class vg9 implements no3<oq0> {
    private final tg9 a;
    private final as8<x23> b;

    public vg9(tg9 tg9Var, as8<x23> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static vg9 a(tg9 tg9Var, as8<x23> as8Var) {
        return new vg9(tg9Var, as8Var);
    }

    public static oq0 c(tg9 tg9Var, x23 x23Var) {
        return (oq0) jh8.e(tg9Var.b(x23Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public oq0 get() {
        return c(this.a, this.b.get());
    }
}
