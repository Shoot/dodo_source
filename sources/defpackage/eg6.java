package defpackage;
/* compiled from: MenuPersonalPriceModule_ProvideMenuItemWithPersonalPriceCreatorProviderFactory.java */
/* renamed from: eg6  reason: default package */
/* loaded from: classes3.dex */
public final class eg6 implements no3<me6> {
    private final as8<hq3> a;
    private final as8<je6> b;
    private final as8<je6> c;

    public eg6(as8<hq3> as8Var, as8<je6> as8Var2, as8<je6> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static eg6 a(as8<hq3> as8Var, as8<je6> as8Var2, as8<je6> as8Var3) {
        return new eg6(as8Var, as8Var2, as8Var3);
    }

    public static me6 c(hq3 hq3Var, je6 je6Var, je6 je6Var2) {
        return (me6) jh8.e(bg6.a.c(hq3Var, je6Var, je6Var2));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public me6 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
