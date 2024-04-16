package defpackage;

import android.content.Context;
/* compiled from: KustoDefaultInterceptor_Factory.java */
/* renamed from: xh5  reason: default package */
/* loaded from: classes3.dex */
public final class xh5 implements no3<wh5> {
    private final as8<f8c> a;
    private final as8<nh5> b;
    private final as8<n52> c;
    private final as8<pq> d;
    private final as8<s80> e;
    private final as8<ava> f;
    private final as8<wv5> g;
    private final as8<i32> h;
    private final as8<Context> i;

    public xh5(as8<f8c> as8Var, as8<nh5> as8Var2, as8<n52> as8Var3, as8<pq> as8Var4, as8<s80> as8Var5, as8<ava> as8Var6, as8<wv5> as8Var7, as8<i32> as8Var8, as8<Context> as8Var9) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
        this.i = as8Var9;
    }

    public static xh5 a(as8<f8c> as8Var, as8<nh5> as8Var2, as8<n52> as8Var3, as8<pq> as8Var4, as8<s80> as8Var5, as8<ava> as8Var6, as8<wv5> as8Var7, as8<i32> as8Var8, as8<Context> as8Var9) {
        return new xh5(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9);
    }

    public static wh5 c(f8c f8cVar, nh5 nh5Var, n52 n52Var, pq pqVar, s80 s80Var, ava avaVar, wv5 wv5Var, i32 i32Var, Context context) {
        return new wh5(f8cVar, nh5Var, n52Var, pqVar, s80Var, avaVar, wv5Var, i32Var, context);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public wh5 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
