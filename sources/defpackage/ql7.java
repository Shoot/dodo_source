package defpackage;
/* compiled from: OrderTypeSwitcherModule_ProvideViewBinderFactory.java */
/* renamed from: ql7  reason: default package */
/* loaded from: classes3.dex */
public final class ql7 implements no3<ul7> {
    private final as8<pu2> a;
    private final as8<hq3> b;
    private final as8<pv9> c;

    public ql7(as8<pu2> as8Var, as8<hq3> as8Var2, as8<pv9> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static ql7 a(as8<pu2> as8Var, as8<hq3> as8Var2, as8<pv9> as8Var3) {
        return new ql7(as8Var, as8Var2, as8Var3);
    }

    public static ul7 c(pu2 pu2Var, hq3 hq3Var, pv9 pv9Var) {
        return (ul7) jh8.e(ll7.a.e(pu2Var, hq3Var, pv9Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ul7 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
