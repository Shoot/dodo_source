package defpackage;

import android.content.Context;
/* compiled from: InfrastructureModule_ProvideCompressFactoryFactory.java */
/* renamed from: t15  reason: default package */
/* loaded from: classes3.dex */
public final class t15 implements no3<wo1> {
    private final m15 a;
    private final as8<Context> b;

    public t15(m15 m15Var, as8<Context> as8Var) {
        this.a = m15Var;
        this.b = as8Var;
    }

    public static t15 a(m15 m15Var, as8<Context> as8Var) {
        return new t15(m15Var, as8Var);
    }

    public static wo1 c(m15 m15Var, Context context) {
        return (wo1) jh8.e(m15Var.j(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public wo1 get() {
        return c(this.a, this.b.get());
    }
}
