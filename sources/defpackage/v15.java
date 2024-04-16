package defpackage;
/* compiled from: InfrastructureModule_ProvideFirebaseDefaultInterceptorFactory.java */
/* renamed from: v15  reason: default package */
/* loaded from: classes3.dex */
public final class v15 implements no3<xv3> {
    private final m15 a;
    private final as8<jv5> b;

    public v15(m15 m15Var, as8<jv5> as8Var) {
        this.a = m15Var;
        this.b = as8Var;
    }

    public static v15 a(m15 m15Var, as8<jv5> as8Var) {
        return new v15(m15Var, as8Var);
    }

    public static xv3 c(m15 m15Var, jv5 jv5Var) {
        return (xv3) jh8.e(m15Var.l(jv5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public xv3 get() {
        return c(this.a, this.b.get());
    }
}
