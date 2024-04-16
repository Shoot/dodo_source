package defpackage;

import android.content.Context;
/* compiled from: CheckoutDetailsModule_ProvideUrlOpenerFactory.java */
/* renamed from: q41  reason: default package */
/* loaded from: classes3.dex */
public final class q41 implements no3<xtb> {
    private final as8<op5> a;
    private final as8<Context> b;

    public q41(as8<op5> as8Var, as8<Context> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static q41 a(as8<op5> as8Var, as8<Context> as8Var2) {
        return new q41(as8Var, as8Var2);
    }

    public static xtb c(op5 op5Var, Context context) {
        return (xtb) jh8.e(l41.a.e(op5Var, context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public xtb get() {
        return c(this.a.get(), this.b.get());
    }
}
