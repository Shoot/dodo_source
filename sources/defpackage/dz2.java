package defpackage;
/* compiled from: DeliveryLocationSuggestionsModule_ProvideGoogleSessionManagerFactory.java */
/* renamed from: dz2  reason: default package */
/* loaded from: classes2.dex */
public final class dz2 implements no3<mh4> {
    private final as8<mh0> a;
    private final as8<ht4> b;

    public dz2(as8<mh0> as8Var, as8<ht4> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static dz2 a(as8<mh0> as8Var, as8<ht4> as8Var2) {
        return new dz2(as8Var, as8Var2);
    }

    public static mh4 c(mh0 mh0Var, ht4 ht4Var) {
        return (mh4) jh8.e(vy2.a.g(mh0Var, ht4Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public mh4 get() {
        return c(this.a.get(), this.b.get());
    }
}
