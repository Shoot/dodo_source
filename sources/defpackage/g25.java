package defpackage;

import android.content.Context;
/* compiled from: InfrastructureModule_ProvideSignerFactory.java */
/* renamed from: g25  reason: default package */
/* loaded from: classes3.dex */
public final class g25 implements no3<nka> {
    private final m15 a;
    private final as8<Context> b;

    public g25(m15 m15Var, as8<Context> as8Var) {
        this.a = m15Var;
        this.b = as8Var;
    }

    public static g25 a(m15 m15Var, as8<Context> as8Var) {
        return new g25(m15Var, as8Var);
    }

    public static nka c(m15 m15Var, Context context) {
        return (nka) jh8.e(m15Var.w(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public nka get() {
        return c(this.a, this.b.get());
    }
}
