package defpackage;
/* compiled from: BuyMoreModule_ProvideBuyMoreRepositoryFactory.java */
/* renamed from: dj0  reason: default package */
/* loaded from: classes3.dex */
public final class dj0 implements no3<xi0> {
    private final as8<ml0> a;

    public dj0(as8<ml0> as8Var) {
        this.a = as8Var;
    }

    public static dj0 a(as8<ml0> as8Var) {
        return new dj0(as8Var);
    }

    public static xi0 c(ml0 ml0Var) {
        return (xi0) jh8.e(aj0.a.b(ml0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public xi0 get() {
        return c(this.a.get());
    }
}
