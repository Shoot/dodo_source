package com.dodopizza.activeorder.feature.ordersummary.di;

import com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies;
import com.dodopizza.controlling.feature.mysteryshoppercard.MysteryShopperCardFeatureDependencies;
import kotlin.Metadata;
/* compiled from: OrderSummaryComponent.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \b2\u00020\u0001:\u0002\b\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/dodopizza/activeorder/feature/ordersummary/di/OrderSummaryComponent;", "Lcom/dodopizza/controlling/feature/mysteryshoppercard/MysteryShopperCardFeatureDependencies;", "Ljj7;", "fragment", "", "Q3", "Lxj7;", "M2", "a", "b", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public interface OrderSummaryComponent extends MysteryShopperCardFeatureDependencies {
    public static final a a = a.a;

    /* compiled from: OrderSummaryComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/dodopizza/activeorder/feature/ordersummary/di/OrderSummaryComponent$a;", "", "Lcom/dodopizza/activeorder/feature/ordersummary/di/OrderSummaryComponent$b;", "a", "()Lcom/dodopizza/activeorder/feature/ordersummary/di/OrderSummaryComponent$b;", "factory", "<init>", "()V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final b a() {
            b a2 = DaggerOrderSummaryComponent.a();
            z65.g(a2, "factory(...)");
            return a2;
        }
    }

    /* compiled from: OrderSummaryComponent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/dodopizza/activeorder/feature/ordersummary/di/OrderSummaryComponent$b;", "", "Lej7;", "data", "Lcom/dodopizza/activeorder/feature/ordersummary/OrderSummaryFeatureDependencies;", "dependencies", "Lcom/dodopizza/activeorder/feature/ordersummary/di/OrderSummaryComponent;", "a", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public interface b {
        OrderSummaryComponent a(ej7 ej7Var, OrderSummaryFeatureDependencies orderSummaryFeatureDependencies);
    }

    void M2(xj7 xj7Var);

    void Q3(jj7 jj7Var);
}
