package defpackage;

import android.content.Context;
/* compiled from: InfrastructureModule_ProvideGooglePlayServicesHelperFactory.java */
/* renamed from: x15  reason: default package */
/* loaded from: classes3.dex */
public final class x15 implements no3<ih4> {
    private final m15 a;
    private final as8<Context> b;

    public x15(m15 m15Var, as8<Context> as8Var) {
        this.a = m15Var;
        this.b = as8Var;
    }

    public static x15 a(m15 m15Var, as8<Context> as8Var) {
        return new x15(m15Var, as8Var);
    }

    public static ih4 c(m15 m15Var, Context context) {
        return (ih4) jh8.e(m15Var.n(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ih4 get() {
        return c(this.a, this.b.get());
    }
}
