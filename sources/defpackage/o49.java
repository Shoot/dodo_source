package defpackage;
/* compiled from: RateAppDialogModule_ProvideRateAppDialogInteractorFactory.java */
/* renamed from: o49  reason: default package */
/* loaded from: classes.dex */
public final class o49 implements no3<m49> {
    private final as8<x49> a;

    public o49(as8<x49> as8Var) {
        this.a = as8Var;
    }

    public static o49 a(as8<x49> as8Var) {
        return new o49(as8Var);
    }

    public static m49 c(x49 x49Var) {
        return (m49) jh8.e(n49.a.a(x49Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public m49 get() {
        return c(this.a.get());
    }
}
