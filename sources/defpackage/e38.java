package defpackage;
/* compiled from: PhoneNumberCollectorModule_ProvidePhoneNumberCollectorRouterFactory.java */
/* renamed from: e38  reason: default package */
/* loaded from: classes2.dex */
public final class e38 implements no3<h38> {
    private final as8<i38> a;

    public e38(as8<i38> as8Var) {
        this.a = as8Var;
    }

    public static e38 a(as8<i38> as8Var) {
        return new e38(as8Var);
    }

    public static h38 c(i38 i38Var) {
        return (h38) jh8.e(c38.a.b(i38Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public h38 get() {
        return c(this.a.get());
    }
}
