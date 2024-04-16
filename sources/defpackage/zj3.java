package defpackage;
/* compiled from: EnvironmentResolverImpl_Factory.java */
/* renamed from: zj3  reason: default package */
/* loaded from: classes4.dex */
public final class zj3 implements no3<yj3> {
    private final as8<tj3> a;

    public zj3(as8<tj3> as8Var) {
        this.a = as8Var;
    }

    public static zj3 a(as8<tj3> as8Var) {
        return new zj3(as8Var);
    }

    public static yj3 c(tj3 tj3Var) {
        return new yj3(tj3Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public yj3 get() {
        return c(this.a.get());
    }
}
