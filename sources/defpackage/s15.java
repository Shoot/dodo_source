package defpackage;
/* compiled from: InfrastructureModule_ProvideBackgroundStateDetectorFactory.java */
/* renamed from: s15  reason: default package */
/* loaded from: classes3.dex */
public final class s15 implements no3<an> {
    private final m15 a;
    private final as8<qx1> b;
    private final as8<hp> c;

    public s15(m15 m15Var, as8<qx1> as8Var, as8<hp> as8Var2) {
        this.a = m15Var;
        this.b = as8Var;
        this.c = as8Var2;
    }

    public static s15 a(m15 m15Var, as8<qx1> as8Var, as8<hp> as8Var2) {
        return new s15(m15Var, as8Var, as8Var2);
    }

    public static an c(m15 m15Var, qx1 qx1Var, hp hpVar) {
        return (an) jh8.e(m15Var.i(qx1Var, hpVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public an get() {
        return c(this.a, this.b.get(), this.c.get());
    }
}
