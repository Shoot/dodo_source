package defpackage;
/* compiled from: ProfileModule_ProvideGetNumberCanceledOrderInteractorFactory.java */
/* renamed from: zn8  reason: default package */
/* loaded from: classes3.dex */
public final class zn8 implements no3<ef4> {
    private final as8<vc6> a;

    public zn8(as8<vc6> as8Var) {
        this.a = as8Var;
    }

    public static zn8 a(as8<vc6> as8Var) {
        return new zn8(as8Var);
    }

    public static ef4 c(vc6 vc6Var) {
        return (ef4) jh8.e(xn8.a.b(vc6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ef4 get() {
        return c(this.a.get());
    }
}
