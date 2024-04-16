package defpackage;

import ru.dodopizza.backend.domain.customer.CustomerAPI;
/* compiled from: CustomerAddressServiceImpl_Factory.java */
/* renamed from: z42  reason: default package */
/* loaded from: classes4.dex */
public final class z42 implements no3<y42> {
    private final as8<v42> a;
    private final as8<CustomerAPI> b;
    private final as8<j9a> c;
    private final as8<hq3> d;

    public z42(as8<v42> as8Var, as8<CustomerAPI> as8Var2, as8<j9a> as8Var3, as8<hq3> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static z42 a(as8<v42> as8Var, as8<CustomerAPI> as8Var2, as8<j9a> as8Var3, as8<hq3> as8Var4) {
        return new z42(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static y42 c(v42 v42Var, as8<CustomerAPI> as8Var, j9a j9aVar, hq3 hq3Var) {
        return new y42(v42Var, as8Var, j9aVar, hq3Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public y42 get() {
        return c(this.a.get(), this.b, this.c.get(), this.d.get());
    }
}
