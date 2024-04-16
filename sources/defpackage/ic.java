package defpackage;
/* compiled from: AnalyticsCaptchaListener_Factory.java */
/* renamed from: ic  reason: default package */
/* loaded from: classes.dex */
public final class ic implements no3<hc> {
    private final as8<gc> a;

    public ic(as8<gc> as8Var) {
        this.a = as8Var;
    }

    public static ic a(as8<gc> as8Var) {
        return new ic(as8Var);
    }

    public static hc c(as8<gc> as8Var) {
        return new hc(as8Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public hc get() {
        return c(this.a);
    }
}
