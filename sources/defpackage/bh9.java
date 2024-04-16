package defpackage;
/* compiled from: RepositoryModule_ProvideDiscountConverterFactory.java */
/* renamed from: bh9  reason: default package */
/* loaded from: classes3.dex */
public final class bh9 implements no3<x23> {
    private final tg9 a;
    private final as8<hq3> b;

    public bh9(tg9 tg9Var, as8<hq3> as8Var) {
        this.a = tg9Var;
        this.b = as8Var;
    }

    public static bh9 a(tg9 tg9Var, as8<hq3> as8Var) {
        return new bh9(tg9Var, as8Var);
    }

    public static x23 c(tg9 tg9Var, hq3 hq3Var) {
        return (x23) jh8.e(tg9Var.h(hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public x23 get() {
        return c(this.a, this.b.get());
    }
}
