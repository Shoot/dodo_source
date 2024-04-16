package defpackage;
/* compiled from: FoodMenuModule_ProvideMenuItemImageUrlProviderFactory.java */
/* renamed from: n44  reason: default package */
/* loaded from: classes3.dex */
public final class n44 implements no3<he6> {
    private final as8<uja> a;
    private final as8<ah6> b;
    private final as8<wr2> c;

    public n44(as8<uja> as8Var, as8<ah6> as8Var2, as8<wr2> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static n44 a(as8<uja> as8Var, as8<ah6> as8Var2, as8<wr2> as8Var3) {
        return new n44(as8Var, as8Var2, as8Var3);
    }

    public static he6 c(uja ujaVar, ah6 ah6Var, wr2 wr2Var) {
        return (he6) jh8.e(f44.a.h(ujaVar, ah6Var, wr2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public he6 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
