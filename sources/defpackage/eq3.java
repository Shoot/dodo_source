package defpackage;
/* compiled from: FeatureInteractor_Factory.java */
/* renamed from: eq3  reason: default package */
/* loaded from: classes4.dex */
public final class eq3 implements no3<dq3> {
    private final as8<hq3> a;
    private final as8<mh0> b;
    private final as8<jv5> c;
    private final as8<kx1> d;

    public eq3(as8<hq3> as8Var, as8<mh0> as8Var2, as8<jv5> as8Var3, as8<kx1> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static eq3 a(as8<hq3> as8Var, as8<mh0> as8Var2, as8<jv5> as8Var3, as8<kx1> as8Var4) {
        return new eq3(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static dq3 c(hq3 hq3Var, mh0 mh0Var, jv5 jv5Var, kx1 kx1Var) {
        return new dq3(hq3Var, mh0Var, jv5Var, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public dq3 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
