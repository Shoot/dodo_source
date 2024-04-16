package defpackage;
/* compiled from: OnboardingFlowResolverImpl_Factory.java */
/* renamed from: l97  reason: default package */
/* loaded from: classes4.dex */
public final class l97 implements no3<k97> {
    private final as8<hq3> a;

    public l97(as8<hq3> as8Var) {
        this.a = as8Var;
    }

    public static l97 a(as8<hq3> as8Var) {
        return new l97(as8Var);
    }

    public static k97 c(hq3 hq3Var) {
        return new k97(hq3Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public k97 get() {
        return c(this.a.get());
    }
}
