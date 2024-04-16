package defpackage;
/* compiled from: LocalityModule_ProvideLocalityInfoRepositoryFactory.java */
/* renamed from: uu5  reason: default package */
/* loaded from: classes3.dex */
public final class uu5 implements no3<nt5> {
    private final as8<jk2> a;
    private final as8<ot5> b;

    public uu5(as8<jk2> as8Var, as8<ot5> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static uu5 a(as8<jk2> as8Var, as8<ot5> as8Var2) {
        return new uu5(as8Var, as8Var2);
    }

    public static nt5 c(jk2 jk2Var, ot5 ot5Var) {
        return (nt5) jh8.e(iu5.a.f(jk2Var, ot5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public nt5 get() {
        return c(this.a.get(), this.b.get());
    }
}
