package defpackage;

import ru.dodopizza.backend.domain.customer.CustomerAPI;
/* compiled from: CustomerService_Factory.java */
/* renamed from: u52  reason: default package */
/* loaded from: classes4.dex */
public final class u52 implements no3<t52> {
    private final as8<CustomerAPI> a;
    private final as8<n52> b;
    private final as8<i00> c;
    private final as8<h08> d;
    private final as8<h48> e;
    private final as8<x42> f;
    private final as8<dt5> g;
    private final as8<hq3> h;
    private final as8<pq> i;
    private final as8<k63> j;
    private final as8<fda> k;

    public u52(as8<CustomerAPI> as8Var, as8<n52> as8Var2, as8<i00> as8Var3, as8<h08> as8Var4, as8<h48> as8Var5, as8<x42> as8Var6, as8<dt5> as8Var7, as8<hq3> as8Var8, as8<pq> as8Var9, as8<k63> as8Var10, as8<fda> as8Var11) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
        this.i = as8Var9;
        this.j = as8Var10;
        this.k = as8Var11;
    }

    public static u52 a(as8<CustomerAPI> as8Var, as8<n52> as8Var2, as8<i00> as8Var3, as8<h08> as8Var4, as8<h48> as8Var5, as8<x42> as8Var6, as8<dt5> as8Var7, as8<hq3> as8Var8, as8<pq> as8Var9, as8<k63> as8Var10, as8<fda> as8Var11) {
        return new u52(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10, as8Var11);
    }

    public static t52 c(as8<CustomerAPI> as8Var, n52 n52Var, i00 i00Var, h08 h08Var, as8<h48> as8Var2, x42 x42Var, dt5 dt5Var, hq3 hq3Var, pq pqVar, k63 k63Var, fda fdaVar) {
        return new t52(as8Var, n52Var, i00Var, h08Var, as8Var2, x42Var, dt5Var, hq3Var, pqVar, k63Var, fdaVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public t52 get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e, this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get());
    }
}
