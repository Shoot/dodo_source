package com.dodopizza.controlling.feature.ordercompleted.di;

import com.dodopizza.controlling.feature.couriertipscard.CourierTipsCardFeatureDependencies;
import com.dodopizza.controlling.feature.mysteryshoppercard.MysteryShopperCardFeatureDependencies;
import com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies;
import kotlin.Metadata;
/* compiled from: OrderCompletedComponent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\ba\u0018\u0000 \u00072\u00020\u00012\u00020\u0002:\u0002\b\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/dodopizza/controlling/feature/ordercompleted/di/OrderCompletedComponent;", "Lcom/dodopizza/controlling/feature/couriertipscard/CourierTipsCardFeatureDependencies;", "Lcom/dodopizza/controlling/feature/mysteryshoppercard/MysteryShopperCardFeatureDependencies;", "Lmc7;", "fragment", "", "h4", "b", "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public interface OrderCompletedComponent extends CourierTipsCardFeatureDependencies, MysteryShopperCardFeatureDependencies {
    public static final a b = a.a;

    /* compiled from: OrderCompletedComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/dodopizza/controlling/feature/ordercompleted/di/OrderCompletedComponent$a;", "", "Lcom/dodopizza/controlling/feature/ordercompleted/di/OrderCompletedComponent$b;", "b", "Lcom/dodopizza/controlling/feature/ordercompleted/di/OrderCompletedComponent$b;", "a", "()Lcom/dodopizza/controlling/feature/ordercompleted/di/OrderCompletedComponent$b;", "factory", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final b b;

        static {
            b a2 = DaggerOrderCompletedComponent.a();
            z65.g(a2, "factory(...)");
            b = a2;
        }

        private a() {
        }

        public final b a() {
            return b;
        }
    }

    /* compiled from: OrderCompletedComponent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/dodopizza/controlling/feature/ordercompleted/di/OrderCompletedComponent$b;", "", "Lic7;", "data", "Lop5;", "lifecycleOwner", "Lcom/dodopizza/controlling/feature/ordercompleted/OrderCompletedFeatureDependencies;", "dependencies", "Lcom/dodopizza/controlling/feature/ordercompleted/di/OrderCompletedComponent;", "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public interface b {
        OrderCompletedComponent a(ic7 ic7Var, op5 op5Var, OrderCompletedFeatureDependencies orderCompletedFeatureDependencies);
    }

    void h4(mc7 mc7Var);
}
