package defpackage;
/* compiled from: ControllingDomainModule_ProvideRatingPhotoService$controlling_releaseFactory.java */
/* renamed from: fw1  reason: default package */
/* loaded from: classes.dex */
public final class fw1 implements no3<k69> {
    private final as8<j69> a;
    private final as8<ku3> b;
    private final as8<wo1> c;

    public fw1(as8<j69> as8Var, as8<ku3> as8Var2, as8<wo1> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static fw1 a(as8<j69> as8Var, as8<ku3> as8Var2, as8<wo1> as8Var3) {
        return new fw1(as8Var, as8Var2, as8Var3);
    }

    public static k69 c(j69 j69Var, ku3 ku3Var, wo1 wo1Var) {
        return (k69) jh8.e(mv1.a.s(j69Var, ku3Var, wo1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public k69 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
