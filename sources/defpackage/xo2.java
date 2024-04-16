package defpackage;

import defpackage.wo2;
import ru.dodopizza.app.presentation.main.a;
/* compiled from: DeepLinkHandler_Factory.java */
/* renamed from: xo2  reason: default package */
/* loaded from: classes3.dex */
public final class xo2 implements no3<wo2> {
    private final as8<bo> a;
    private final as8<a> b;
    private final as8<f63> c;
    private final as8<i00> d;
    private final as8<wt6> e;
    private final as8<mk6> f;
    private final as8<kz4> g;
    private final as8<y69> h;
    private final as8<f1b> i;
    private final as8<hq3> j;
    private final as8<wo2.a> k;

    public xo2(as8<bo> as8Var, as8<a> as8Var2, as8<f63> as8Var3, as8<i00> as8Var4, as8<wt6> as8Var5, as8<mk6> as8Var6, as8<kz4> as8Var7, as8<y69> as8Var8, as8<f1b> as8Var9, as8<hq3> as8Var10, as8<wo2.a> as8Var11) {
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

    public static xo2 a(as8<bo> as8Var, as8<a> as8Var2, as8<f63> as8Var3, as8<i00> as8Var4, as8<wt6> as8Var5, as8<mk6> as8Var6, as8<kz4> as8Var7, as8<y69> as8Var8, as8<f1b> as8Var9, as8<hq3> as8Var10, as8<wo2.a> as8Var11) {
        return new xo2(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10, as8Var11);
    }

    public static wo2 c(bo boVar, a aVar, f63 f63Var, i00 i00Var, wt6 wt6Var, mk6 mk6Var, kz4 kz4Var, y69 y69Var, f1b f1bVar, hq3 hq3Var, wo2.a aVar2) {
        return new wo2(boVar, aVar, f63Var, i00Var, wt6Var, mk6Var, kz4Var, y69Var, f1bVar, hq3Var, aVar2);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public wo2 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get());
    }
}
