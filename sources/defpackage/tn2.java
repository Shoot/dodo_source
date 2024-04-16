package defpackage;

import com.facebook.flipper.plugins.network.FlipperOkhttpInterceptor;
/* compiled from: DebugOkHttpClientConfiguratorImpl_Factory.java */
/* renamed from: tn2  reason: default package */
/* loaded from: classes4.dex */
public final class tn2 implements no3<sn2> {
    private final as8<mh0> a;
    private final as8<FlipperOkhttpInterceptor> b;

    public tn2(as8<mh0> as8Var, as8<FlipperOkhttpInterceptor> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static tn2 a(as8<mh0> as8Var, as8<FlipperOkhttpInterceptor> as8Var2) {
        return new tn2(as8Var, as8Var2);
    }

    public static sn2 c(mh0 mh0Var, as8<FlipperOkhttpInterceptor> as8Var) {
        return new sn2(mh0Var, as8Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public sn2 get() {
        return c(this.a.get(), this.b);
    }
}
