package defpackage;
/* compiled from: IgnoreQueriesInterceptor_Factory.java */
/* renamed from: xt4  reason: default package */
/* loaded from: classes4.dex */
public final class xt4 implements no3<wt4> {
    private final as8<mh0> a;
    private final as8<yt4> b;

    public xt4(as8<mh0> as8Var, as8<yt4> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static xt4 a(as8<mh0> as8Var, as8<yt4> as8Var2) {
        return new xt4(as8Var, as8Var2);
    }

    public static wt4 c(mh0 mh0Var, yt4 yt4Var) {
        return new wt4(mh0Var, yt4Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public wt4 get() {
        return c(this.a.get(), this.b.get());
    }
}
