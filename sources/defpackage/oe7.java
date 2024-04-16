package defpackage;

import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsPresenter;
/* compiled from: OrderHistoryDetailsPresenter_Factory.java */
/* renamed from: oe7  reason: default package */
/* loaded from: classes2.dex */
public final class oe7 implements no3<OrderHistoryDetailsPresenter> {
    private final as8<ae7> a;
    private final as8<pe7> b;
    private final as8<le7> c;
    private final as8<hq3> d;
    private final as8<Integer> e;
    private final as8<gc> f;

    public oe7(as8<ae7> as8Var, as8<pe7> as8Var2, as8<le7> as8Var3, as8<hq3> as8Var4, as8<Integer> as8Var5, as8<gc> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static oe7 a(as8<ae7> as8Var, as8<pe7> as8Var2, as8<le7> as8Var3, as8<hq3> as8Var4, as8<Integer> as8Var5, as8<gc> as8Var6) {
        return new oe7(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static OrderHistoryDetailsPresenter c(ae7 ae7Var, pe7 pe7Var, le7 le7Var, hq3 hq3Var, int i, gc gcVar) {
        return new OrderHistoryDetailsPresenter(ae7Var, pe7Var, le7Var, hq3Var, i, gcVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public OrderHistoryDetailsPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get().intValue(), this.f.get());
    }
}
