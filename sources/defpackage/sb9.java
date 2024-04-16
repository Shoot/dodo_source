package defpackage;
/* compiled from: ReferralSystemModule_ProvideReferralSystemExternalRouterFactory.java */
/* renamed from: sb9  reason: default package */
/* loaded from: classes3.dex */
public final class sb9 implements no3<lb9> {
    private final as8<f63> a;

    public sb9(as8<f63> as8Var) {
        this.a = as8Var;
    }

    public static sb9 a(as8<f63> as8Var) {
        return new sb9(as8Var);
    }

    public static lb9 c(f63 f63Var) {
        return (lb9) jh8.e(rb9.a.a(f63Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public lb9 get() {
        return c(this.a.get());
    }
}
