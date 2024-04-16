package defpackage;

import android.content.Context;
/* compiled from: OrderModule_ProvideDeviceInfoForOrderCreatorFactory.java */
/* renamed from: rg7  reason: default package */
/* loaded from: classes3.dex */
public final class rg7 implements no3<w13> {
    private final as8<Context> a;
    private final as8<mh0> b;

    public rg7(as8<Context> as8Var, as8<mh0> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static rg7 a(as8<Context> as8Var, as8<mh0> as8Var2) {
        return new rg7(as8Var, as8Var2);
    }

    public static w13 c(Context context, mh0 mh0Var) {
        return (w13) jh8.e(ng7.a.d(context, mh0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public w13 get() {
        return c(this.a.get(), this.b.get());
    }
}
