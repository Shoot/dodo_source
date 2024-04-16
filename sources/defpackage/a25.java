package defpackage;

import defpackage.yh5;
import defpackage.zh5;
/* compiled from: InfrastructureModule_ProvideKustoExperimentsInterceptorFactoryFactory.java */
/* renamed from: a25  reason: default package */
/* loaded from: classes3.dex */
public final class a25 implements no3<yh5.b> {
    private final m15 a;
    private final as8<ld9> b;
    private final as8<zh5.a> c;

    public a25(m15 m15Var, as8<ld9> as8Var, as8<zh5.a> as8Var2) {
        this.a = m15Var;
        this.b = as8Var;
        this.c = as8Var2;
    }

    public static a25 a(m15 m15Var, as8<ld9> as8Var, as8<zh5.a> as8Var2) {
        return new a25(m15Var, as8Var, as8Var2);
    }

    public static yh5.b c(m15 m15Var, ld9 ld9Var, zh5.a aVar) {
        return (yh5.b) jh8.e(m15Var.q(ld9Var, aVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public yh5.b get() {
        return c(this.a, this.b.get(), this.c.get());
    }
}
