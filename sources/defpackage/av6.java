package defpackage;
/* compiled from: NavigationModule_ProvideSelectPizzeriaFragmentProviderFactory.java */
/* renamed from: av6  reason: default package */
/* loaded from: classes3.dex */
public final class av6 implements no3<y7a> {
    private final vu6 a;
    private final as8<hq3> b;
    private final as8<ih4> c;

    public av6(vu6 vu6Var, as8<hq3> as8Var, as8<ih4> as8Var2) {
        this.a = vu6Var;
        this.b = as8Var;
        this.c = as8Var2;
    }

    public static av6 a(vu6 vu6Var, as8<hq3> as8Var, as8<ih4> as8Var2) {
        return new av6(vu6Var, as8Var, as8Var2);
    }

    public static y7a c(vu6 vu6Var, hq3 hq3Var, ih4 ih4Var) {
        return (y7a) jh8.e(vu6Var.e(hq3Var, ih4Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public y7a get() {
        return c(this.a, this.b.get(), this.c.get());
    }
}
