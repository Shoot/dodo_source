package defpackage;
/* compiled from: AddressFormModule_ProvideAddressFieldPresenterFactoryFactory.java */
/* renamed from: e8  reason: default package */
/* loaded from: classes3.dex */
public final class e8 implements no3<t7> {
    private final as8<dza> a;
    private final as8<np4> b;

    public e8(as8<dza> as8Var, as8<np4> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static e8 a(as8<dza> as8Var, as8<np4> as8Var2) {
        return new e8(as8Var, as8Var2);
    }

    public static t7 c(dza dzaVar, np4 np4Var) {
        return (t7) jh8.e(d8.a.a(dzaVar, np4Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public t7 get() {
        return c(this.a.get(), this.b.get());
    }
}
