package defpackage;

import com.facebook.flipper.plugins.network.FlipperOkhttpInterceptor;
/* compiled from: RetrofitModule_ProvideFlipperOkhttpInterceptorFactory.java */
/* renamed from: ol9  reason: default package */
/* loaded from: classes3.dex */
public final class ol9 implements no3<FlipperOkhttpInterceptor> {
    private final gl9 a;

    public ol9(gl9 gl9Var) {
        this.a = gl9Var;
    }

    public static ol9 a(gl9 gl9Var) {
        return new ol9(gl9Var);
    }

    public static FlipperOkhttpInterceptor c(gl9 gl9Var) {
        return (FlipperOkhttpInterceptor) jh8.e(gl9Var.h());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public FlipperOkhttpInterceptor get() {
        return c(this.a);
    }
}
