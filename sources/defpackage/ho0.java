package defpackage;
/* compiled from: CaptchaDomainModule_Companion_CaptchaProviderFactoryFactory.java */
/* renamed from: ho0  reason: default package */
/* loaded from: classes.dex */
public final class ho0 implements no3<qo0> {
    private final as8<bo0> a;

    public ho0(as8<bo0> as8Var) {
        this.a = as8Var;
    }

    public static qo0 a(bo0 bo0Var) {
        return (qo0) jh8.e(go0.a.a(bo0Var));
    }

    public static ho0 b(as8<bo0> as8Var) {
        return new ho0(as8Var);
    }

    @Override // defpackage.as8
    /* renamed from: c */
    public qo0 get() {
        return a(this.a.get());
    }
}
