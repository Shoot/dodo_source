package defpackage;

import android.content.Context;
/* compiled from: NetworkAvailabilityCheckInterceptor_Factory.java */
/* renamed from: uv6  reason: default package */
/* loaded from: classes3.dex */
public final class uv6 implements no3<tv6> {
    private final as8<vc6> a;
    private final as8<Context> b;
    private final as8<jv5> c;

    public uv6(as8<vc6> as8Var, as8<Context> as8Var2, as8<jv5> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static uv6 a(as8<vc6> as8Var, as8<Context> as8Var2, as8<jv5> as8Var3) {
        return new uv6(as8Var, as8Var2, as8Var3);
    }

    public static tv6 c(vc6 vc6Var, Context context, jv5 jv5Var) {
        return new tv6(vc6Var, context, jv5Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public tv6 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
