package defpackage;

import android.content.res.Resources;
import com.facebook.flipper.plugins.network.FlipperOkhttpInterceptor;
import com.google.gson.Gson;
/* compiled from: RetrofitFactory_Factory.java */
/* renamed from: fl9  reason: default package */
/* loaded from: classes.dex */
public final class fl9 implements no3<el9> {
    private final as8<s80> a;
    private final as8<mh0> b;
    private final as8<Gson> c;
    private final as8<hn4> d;
    private final as8<zz> e;
    private final as8<tv6> f;
    private final as8<d32> g;
    private final as8<ska> h;
    private final as8<no0> i;
    private final as8<wt4> j;
    private final as8<mi9> k;
    private final as8<s13> l;
    private final as8<FlipperOkhttpInterceptor> m;
    private final as8<Resources> n;

    public fl9(as8<s80> as8Var, as8<mh0> as8Var2, as8<Gson> as8Var3, as8<hn4> as8Var4, as8<zz> as8Var5, as8<tv6> as8Var6, as8<d32> as8Var7, as8<ska> as8Var8, as8<no0> as8Var9, as8<wt4> as8Var10, as8<mi9> as8Var11, as8<s13> as8Var12, as8<FlipperOkhttpInterceptor> as8Var13, as8<Resources> as8Var14) {
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
        this.l = as8Var12;
        this.m = as8Var13;
        this.n = as8Var14;
    }

    public static fl9 a(as8<s80> as8Var, as8<mh0> as8Var2, as8<Gson> as8Var3, as8<hn4> as8Var4, as8<zz> as8Var5, as8<tv6> as8Var6, as8<d32> as8Var7, as8<ska> as8Var8, as8<no0> as8Var9, as8<wt4> as8Var10, as8<mi9> as8Var11, as8<s13> as8Var12, as8<FlipperOkhttpInterceptor> as8Var13, as8<Resources> as8Var14) {
        return new fl9(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10, as8Var11, as8Var12, as8Var13, as8Var14);
    }

    public static el9 c(as8<s80> as8Var, mh0 mh0Var, as8<Gson> as8Var2, as8<hn4> as8Var3, as8<zz> as8Var4, as8<tv6> as8Var5, as8<d32> as8Var6, as8<ska> as8Var7, as8<no0> as8Var8, as8<wt4> as8Var9, as8<mi9> as8Var10, as8<s13> as8Var11, as8<FlipperOkhttpInterceptor> as8Var12, Resources resources) {
        return new el9(as8Var, mh0Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10, as8Var11, as8Var12, resources);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public el9 get() {
        return c(this.a, this.b.get(), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n.get());
    }
}
