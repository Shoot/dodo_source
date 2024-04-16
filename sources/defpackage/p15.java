package defpackage;
/* compiled from: InfrastructureModule_ProvideAndroidLanguageManagerFactory.java */
/* renamed from: p15  reason: default package */
/* loaded from: classes3.dex */
public final class p15 implements no3<ih> {
    private final m15 a;
    private final as8<i32> b;

    public p15(m15 m15Var, as8<i32> as8Var) {
        this.a = m15Var;
        this.b = as8Var;
    }

    public static p15 a(m15 m15Var, as8<i32> as8Var) {
        return new p15(m15Var, as8Var);
    }

    public static ih c(m15 m15Var, i32 i32Var) {
        return (ih) jh8.e(m15Var.f(i32Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ih get() {
        return c(this.a, this.b.get());
    }
}
