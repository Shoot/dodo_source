package defpackage;
/* compiled from: StoriesModule_ProvideStoriesInteractorFactory.java */
/* renamed from: hya  reason: default package */
/* loaded from: classes3.dex */
public final class hya implements no3<zxa> {
    private final as8<kya> a;
    private final as8<j15> b;
    private final as8<e98> c;

    public hya(as8<kya> as8Var, as8<j15> as8Var2, as8<e98> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static hya a(as8<kya> as8Var, as8<j15> as8Var2, as8<e98> as8Var3) {
        return new hya(as8Var, as8Var2, as8Var3);
    }

    public static zxa c(kya kyaVar, j15 j15Var, e98 e98Var) {
        return (zxa) jh8.e(cya.a.e(kyaVar, j15Var, e98Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public zxa get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
