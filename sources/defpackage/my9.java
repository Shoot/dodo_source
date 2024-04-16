package defpackage;
/* compiled from: SearchModule_ProvideMenuItemDescriptionUpdaterFactory.java */
/* renamed from: my9  reason: default package */
/* loaded from: classes3.dex */
public final class my9 implements no3<zd6> {
    private final as8<ah6> a;

    public my9(as8<ah6> as8Var) {
        this.a = as8Var;
    }

    public static my9 a(as8<ah6> as8Var) {
        return new my9(as8Var);
    }

    public static zd6 c(ah6 ah6Var) {
        return (zd6) jh8.e(ly9.a.a(ah6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public zd6 get() {
        return c(this.a.get());
    }
}
