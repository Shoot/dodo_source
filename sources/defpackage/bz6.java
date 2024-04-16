package defpackage;
/* compiled from: NoGlovesModule_ProvideNoGlovesServiceFactory.java */
/* renamed from: bz6  reason: default package */
/* loaded from: classes3.dex */
public final class bz6 implements no3<cz6> {
    private final as8<ay1> a;

    public bz6(as8<ay1> as8Var) {
        this.a = as8Var;
    }

    public static bz6 a(as8<ay1> as8Var) {
        return new bz6(as8Var);
    }

    public static cz6 c(ay1 ay1Var) {
        return (cz6) jh8.e(az6.a.a(ay1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public cz6 get() {
        return c(this.a.get());
    }
}
