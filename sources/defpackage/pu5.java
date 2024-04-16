package defpackage;
/* compiled from: LocalityModule_ProvideCountryRepositoryFactory.java */
/* renamed from: pu5  reason: default package */
/* loaded from: classes3.dex */
public final class pu5 implements no3<ry1> {
    private final as8<jk2> a;

    public pu5(as8<jk2> as8Var) {
        this.a = as8Var;
    }

    public static pu5 a(as8<jk2> as8Var) {
        return new pu5(as8Var);
    }

    public static ry1 c(jk2 jk2Var) {
        return (ry1) jh8.e(iu5.a.d(jk2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ry1 get() {
        return c(this.a.get());
    }
}
