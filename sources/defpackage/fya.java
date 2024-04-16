package defpackage;
/* compiled from: StoriesModule_ProvideInfoStoryServiceFactory.java */
/* renamed from: fya  reason: default package */
/* loaded from: classes3.dex */
public final class fya implements no3<j15> {
    private final as8<kya> a;
    private final as8<hq3> b;
    private final as8<ci8> c;
    private final as8<nz4> d;

    public fya(as8<kya> as8Var, as8<hq3> as8Var2, as8<ci8> as8Var3, as8<nz4> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static fya a(as8<kya> as8Var, as8<hq3> as8Var2, as8<ci8> as8Var3, as8<nz4> as8Var4) {
        return new fya(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static j15 c(kya kyaVar, hq3 hq3Var, ci8 ci8Var, nz4 nz4Var) {
        return (j15) jh8.e(cya.a.c(kyaVar, hq3Var, ci8Var, nz4Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public j15 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
