package defpackage;
/* compiled from: CashChargeModule_ProvideInteractorFactory.java */
/* renamed from: ss0  reason: default package */
/* loaded from: classes3.dex */
public final class ss0 implements no3<os0> {
    private final as8<t41> a;
    private final as8<fq0> b;
    private final as8<jn6> c;
    private final as8<mn6> d;

    public ss0(as8<t41> as8Var, as8<fq0> as8Var2, as8<jn6> as8Var3, as8<mn6> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static ss0 a(as8<t41> as8Var, as8<fq0> as8Var2, as8<jn6> as8Var3, as8<mn6> as8Var4) {
        return new ss0(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static os0 c(t41 t41Var, fq0 fq0Var, jn6 jn6Var, mn6 mn6Var) {
        return (os0) jh8.e(qs0.a.b(t41Var, fq0Var, jn6Var, mn6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public os0 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
