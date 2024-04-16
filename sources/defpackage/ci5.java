package defpackage;

import defpackage.zh5;
/* compiled from: KustoModule_ProvideFeatureDataProviderFactoryFactory.java */
/* renamed from: ci5  reason: default package */
/* loaded from: classes3.dex */
public final class ci5 implements no3<zh5.a> {
    private final as8<ld9> a;

    public ci5(as8<ld9> as8Var) {
        this.a = as8Var;
    }

    public static ci5 a(as8<ld9> as8Var) {
        return new ci5(as8Var);
    }

    public static zh5.a c(ld9 ld9Var) {
        return (zh5.a) jh8.e(bi5.a.a(ld9Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public zh5.a get() {
        return c(this.a.get());
    }
}
