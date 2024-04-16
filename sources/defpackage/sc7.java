package defpackage;
/* compiled from: OrderCompletedModule_ProvideOrderCompletedInteractorFactory.java */
/* renamed from: sc7  reason: default package */
/* loaded from: classes.dex */
public final class sc7 implements no3<oc7> {
    private final as8<o69> a;

    public sc7(as8<o69> as8Var) {
        this.a = as8Var;
    }

    public static sc7 a(as8<o69> as8Var) {
        return new sc7(as8Var);
    }

    public static oc7 c(o69 o69Var) {
        return (oc7) jh8.e(pc7.a.c(o69Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public oc7 get() {
        return c(this.a.get());
    }
}
