package defpackage;
/* compiled from: NavigationModule_ProvideNavigatorHolderFactory.java */
/* renamed from: wu6  reason: default package */
/* loaded from: classes3.dex */
public final class wu6 implements no3<dv6> {
    private final vu6 a;

    public wu6(vu6 vu6Var) {
        this.a = vu6Var;
    }

    public static wu6 a(vu6 vu6Var) {
        return new wu6(vu6Var);
    }

    public static dv6 c(vu6 vu6Var) {
        return (dv6) jh8.e(vu6Var.a());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public dv6 get() {
        return c(this.a);
    }
}
