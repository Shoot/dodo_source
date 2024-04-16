package defpackage;

import android.content.Context;
import defpackage.yh5;
/* compiled from: AnalyticsFactoryImpl_Factory.java */
/* renamed from: yc  reason: default package */
/* loaded from: classes3.dex */
public final class yc implements no3<xc> {
    private final as8<Context> a;
    private final as8<mh0> b;
    private final as8<wh5> c;
    private final as8<yh5.b> d;
    private final as8<oh5> e;
    private final as8<xv3> f;
    private final as8<cz3> g;

    public yc(as8<Context> as8Var, as8<mh0> as8Var2, as8<wh5> as8Var3, as8<yh5.b> as8Var4, as8<oh5> as8Var5, as8<xv3> as8Var6, as8<cz3> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static yc a(as8<Context> as8Var, as8<mh0> as8Var2, as8<wh5> as8Var3, as8<yh5.b> as8Var4, as8<oh5> as8Var5, as8<xv3> as8Var6, as8<cz3> as8Var7) {
        return new yc(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static xc c(Context context, mh0 mh0Var, wh5 wh5Var, yh5.b bVar, oh5 oh5Var, xv3 xv3Var, as8<cz3> as8Var) {
        return new xc(context, mh0Var, wh5Var, bVar, oh5Var, xv3Var, as8Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public xc get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g);
    }
}
