package defpackage;
/* compiled from: LocalityModule_ProvideCountryFactory.java */
/* renamed from: mu5  reason: default package */
/* loaded from: classes3.dex */
public final class mu5 implements no3<ay1> {
    private final as8<ty1> a;

    public mu5(as8<ty1> as8Var) {
        this.a = as8Var;
    }

    public static mu5 a(as8<ty1> as8Var) {
        return new mu5(as8Var);
    }

    public static ay1 c(ty1 ty1Var) {
        return (ay1) jh8.e(ju5.a.b(ty1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ay1 get() {
        return c(this.a.get());
    }
}
