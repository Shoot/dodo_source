package defpackage;

import com.dodopizza.activeorder.feature.orderdetails.presentation.OrderDetailsPresenter;
/* compiled from: OrderDetailsPresenter_Factory.java */
/* renamed from: id7  reason: default package */
/* loaded from: classes.dex */
public final class id7 implements no3<OrderDetailsPresenter> {
    private final as8<f63> a;
    private final as8<jgb> b;
    private final as8<dd7> c;
    private final as8<String> d;

    public id7(as8<f63> as8Var, as8<jgb> as8Var2, as8<dd7> as8Var3, as8<String> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static id7 a(as8<f63> as8Var, as8<jgb> as8Var2, as8<dd7> as8Var3, as8<String> as8Var4) {
        return new id7(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static OrderDetailsPresenter c(f63 f63Var, jgb jgbVar, dd7 dd7Var, String str) {
        return new OrderDetailsPresenter(f63Var, jgbVar, dd7Var, str);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public OrderDetailsPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
