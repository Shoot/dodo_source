package defpackage;

import ru.dodopizza.backend.domain.order.OrderApi;
/* compiled from: OrderManagerImpl_Factory.java */
/* renamed from: jg7  reason: default package */
/* loaded from: classes4.dex */
public final class jg7 implements no3<hg7> {
    private final as8<fi7> a;
    private final as8<OrderApi> b;
    private final as8<bd> c;
    private final as8<lg7> d;
    private final as8<vc6> e;
    private final as8<dua> f;
    private final as8<ko5> g;
    private final as8<i22> h;
    private final as8<an> i;
    private final as8<hq3> j;

    public jg7(as8<fi7> as8Var, as8<OrderApi> as8Var2, as8<bd> as8Var3, as8<lg7> as8Var4, as8<vc6> as8Var5, as8<dua> as8Var6, as8<ko5> as8Var7, as8<i22> as8Var8, as8<an> as8Var9, as8<hq3> as8Var10) {
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
    }

    public static jg7 a(as8<fi7> as8Var, as8<OrderApi> as8Var2, as8<bd> as8Var3, as8<lg7> as8Var4, as8<vc6> as8Var5, as8<dua> as8Var6, as8<ko5> as8Var7, as8<i22> as8Var8, as8<an> as8Var9, as8<hq3> as8Var10) {
        return new jg7(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10);
    }

    public static hg7 c(fi7 fi7Var, OrderApi orderApi, bd bdVar, lg7 lg7Var, vc6 vc6Var, dua duaVar, ko5 ko5Var, i22 i22Var, an anVar, hq3 hq3Var) {
        return new hg7(fi7Var, orderApi, bdVar, lg7Var, vc6Var, duaVar, ko5Var, i22Var, anVar, hq3Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public hg7 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
