package defpackage;
/* compiled from: AllPizzeriasModule_ProvideGetCurrentLocalityInfoInteractorFactory.java */
/* renamed from: sb  reason: default package */
/* loaded from: classes3.dex */
public final class sb implements no3<cf4> {
    private final as8<jv5> a;
    private final as8<rt5> b;

    public sb(as8<jv5> as8Var, as8<rt5> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static sb a(as8<jv5> as8Var, as8<rt5> as8Var2) {
        return new sb(as8Var, as8Var2);
    }

    public static cf4 c(jv5 jv5Var, rt5 rt5Var) {
        return (cf4) jh8.e(qb.a.b(jv5Var, rt5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public cf4 get() {
        return c(this.a.get(), this.b.get());
    }
}
