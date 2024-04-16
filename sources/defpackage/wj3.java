package defpackage;
/* compiled from: EnvironmentModule_ProvideEnvironmentResolverFactory.java */
/* renamed from: wj3  reason: default package */
/* loaded from: classes3.dex */
public final class wj3 implements no3<xj3> {
    private final as8<yj3> a;

    public wj3(as8<yj3> as8Var) {
        this.a = as8Var;
    }

    public static wj3 a(as8<yj3> as8Var) {
        return new wj3(as8Var);
    }

    public static xj3 c(yj3 yj3Var) {
        return (xj3) jh8.e(vj3.a.a(yj3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public xj3 get() {
        return c(this.a.get());
    }
}
