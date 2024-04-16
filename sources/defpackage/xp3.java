package defpackage;
/* compiled from: FeatureAppModule_ProvideFirebaseToggleServiceFactory.java */
/* renamed from: xp3  reason: default package */
/* loaded from: classes3.dex */
public final class xp3 implements no3<gy3> {
    private final as8<ld9> a;

    public xp3(as8<ld9> as8Var) {
        this.a = as8Var;
    }

    public static xp3 a(as8<ld9> as8Var) {
        return new xp3(as8Var);
    }

    public static gy3 c(ld9 ld9Var) {
        return (gy3) jh8.e(up3.a.c(ld9Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gy3 get() {
        return c(this.a.get());
    }
}
