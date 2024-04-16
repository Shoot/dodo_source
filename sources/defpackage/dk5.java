package defpackage;
/* compiled from: LandingModule_ProvideLandingServiceFactory.java */
/* renamed from: dk5  reason: default package */
/* loaded from: classes3.dex */
public final class dk5 implements no3<ml5> {
    private final as8<nl5> a;

    public dk5(as8<nl5> as8Var) {
        this.a = as8Var;
    }

    public static dk5 a(as8<nl5> as8Var) {
        return new dk5(as8Var);
    }

    public static ml5 c(nl5 nl5Var) {
        return (ml5) jh8.e(wj5.a.d(nl5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ml5 get() {
        return c(this.a.get());
    }
}
