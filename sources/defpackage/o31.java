package defpackage;

import com.dodopizza.orderhistory.domain.check.CheckApi;
/* compiled from: CheckServiceImpl_Factory.java */
/* renamed from: o31  reason: default package */
/* loaded from: classes2.dex */
public final class o31 implements no3<n31> {
    private final as8<CheckApi> a;
    private final as8<f31> b;
    private final as8<j31> c;

    public o31(as8<CheckApi> as8Var, as8<f31> as8Var2, as8<j31> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static o31 a(as8<CheckApi> as8Var, as8<f31> as8Var2, as8<j31> as8Var3) {
        return new o31(as8Var, as8Var2, as8Var3);
    }

    public static n31 c(CheckApi checkApi, f31 f31Var, j31 j31Var) {
        return new n31(checkApi, f31Var, j31Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public n31 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
