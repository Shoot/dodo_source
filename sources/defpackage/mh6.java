package defpackage;
/* compiled from: MenuV5AvailabilityChecker_Factory.java */
/* renamed from: mh6  reason: default package */
/* loaded from: classes4.dex */
public final class mh6 implements no3<lh6> {
    private final as8<hq3> a;
    private final as8<yg6> b;

    public mh6(as8<hq3> as8Var, as8<yg6> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static mh6 a(as8<hq3> as8Var, as8<yg6> as8Var2) {
        return new mh6(as8Var, as8Var2);
    }

    public static lh6 c(hq3 hq3Var, yg6 yg6Var) {
        return new lh6(hq3Var, yg6Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public lh6 get() {
        return c(this.a.get(), this.b.get());
    }
}
