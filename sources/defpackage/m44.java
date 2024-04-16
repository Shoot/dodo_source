package defpackage;
/* compiled from: FoodMenuModule_ProvideMenuItemDescriptionUpdaterFactory.java */
/* renamed from: m44  reason: default package */
/* loaded from: classes3.dex */
public final class m44 implements no3<zd6> {
    private final as8<ah6> a;

    public m44(as8<ah6> as8Var) {
        this.a = as8Var;
    }

    public static m44 a(as8<ah6> as8Var) {
        return new m44(as8Var);
    }

    public static zd6 c(ah6 ah6Var) {
        return (zd6) jh8.e(f44.a.g(ah6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public zd6 get() {
        return c(this.a.get());
    }
}
