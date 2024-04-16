package defpackage;

import com.dodopizza.core.domain.push.ServicePushApi;
import com.dodopizza.core.domain.push.a;
/* compiled from: ServicePushServiceImpl_Factory.java */
/* renamed from: yda  reason: default package */
/* loaded from: classes.dex */
public final class yda implements no3<a> {
    private final as8<ServicePushApi> a;
    private final as8<ut8> b;
    private final as8<i00> c;
    private final as8<ci8> d;

    public yda(as8<ServicePushApi> as8Var, as8<ut8> as8Var2, as8<i00> as8Var3, as8<ci8> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static yda a(as8<ServicePushApi> as8Var, as8<ut8> as8Var2, as8<i00> as8Var3, as8<ci8> as8Var4) {
        return new yda(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static a c(as8<ServicePushApi> as8Var, ut8 ut8Var, i00 i00Var, ci8 ci8Var) {
        return new a(as8Var, ut8Var, i00Var, ci8Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public a get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get());
    }
}
