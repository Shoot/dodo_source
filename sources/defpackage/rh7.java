package defpackage;

import com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingPresenter;
import com.dodopizza.controlling.feature.orderrating.presentation.b;
/* compiled from: OrderRatingModule_ProvideOrderRatingPresenterFactory.java */
/* renamed from: rh7  reason: default package */
/* loaded from: classes.dex */
public final class rh7 implements no3<OrderRatingPresenter> {
    private final as8<eh7> a;
    private final as8<mh7> b;
    private final as8<gc> c;
    private final as8<hp> d;
    private final as8<wh7> e;
    private final as8<fs1> f;
    private final as8<cs1> g;
    private final as8<b.a> h;
    private final as8<li7> i;
    private final as8<s69> j;
    private final as8<jc7> k;
    private final as8<ah7> l;

    public rh7(as8<eh7> as8Var, as8<mh7> as8Var2, as8<gc> as8Var3, as8<hp> as8Var4, as8<wh7> as8Var5, as8<fs1> as8Var6, as8<cs1> as8Var7, as8<b.a> as8Var8, as8<li7> as8Var9, as8<s69> as8Var10, as8<jc7> as8Var11, as8<ah7> as8Var12) {
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
    }

    public static rh7 a(as8<eh7> as8Var, as8<mh7> as8Var2, as8<gc> as8Var3, as8<hp> as8Var4, as8<wh7> as8Var5, as8<fs1> as8Var6, as8<cs1> as8Var7, as8<b.a> as8Var8, as8<li7> as8Var9, as8<s69> as8Var10, as8<jc7> as8Var11, as8<ah7> as8Var12) {
        return new rh7(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10, as8Var11, as8Var12);
    }

    public static OrderRatingPresenter c(eh7 eh7Var, mh7 mh7Var, gc gcVar, hp hpVar, wh7 wh7Var, fs1 fs1Var, cs1 cs1Var, b.a aVar, li7 li7Var, s69 s69Var, jc7 jc7Var, ah7 ah7Var) {
        return (OrderRatingPresenter) jh8.e(nh7.a.d(eh7Var, mh7Var, gcVar, hpVar, wh7Var, fs1Var, cs1Var, aVar, li7Var, s69Var, jc7Var, ah7Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public OrderRatingPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get());
    }
}
