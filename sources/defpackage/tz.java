package defpackage;
/* compiled from: AuthorizationAppModule_ProvideAuthorizationStateFactory.java */
/* renamed from: tz  reason: default package */
/* loaded from: classes3.dex */
public final class tz implements no3<i00> {
    private final rz a;
    private final as8<v53> b;

    public tz(rz rzVar, as8<v53> as8Var) {
        this.a = rzVar;
        this.b = as8Var;
    }

    public static tz a(rz rzVar, as8<v53> as8Var) {
        return new tz(rzVar, as8Var);
    }

    public static i00 c(rz rzVar, v53 v53Var) {
        return (i00) jh8.e(rzVar.c(v53Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public i00 get() {
        return c(this.a, this.b.get());
    }
}
