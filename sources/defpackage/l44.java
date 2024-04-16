package defpackage;
/* compiled from: FoodMenuModule_ProvideInAppNotificationsInteractorFactory.java */
/* renamed from: l44  reason: default package */
/* loaded from: classes3.dex */
public final class l44 implements no3<py4> {
    private final as8<sy4> a;
    private final as8<hq3> b;

    public l44(as8<sy4> as8Var, as8<hq3> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static l44 a(as8<sy4> as8Var, as8<hq3> as8Var2) {
        return new l44(as8Var, as8Var2);
    }

    public static py4 c(sy4 sy4Var, hq3 hq3Var) {
        return (py4) jh8.e(f44.a.f(sy4Var, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public py4 get() {
        return c(this.a.get(), this.b.get());
    }
}
