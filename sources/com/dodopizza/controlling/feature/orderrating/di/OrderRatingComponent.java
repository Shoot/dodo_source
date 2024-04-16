package com.dodopizza.controlling.feature.orderrating.di;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.dodopizza.controlling.feature.couriertipscard.CourierTipsCardFeatureDependencies;
import com.dodopizza.controlling.feature.orderrating.OrderRatingFeatureDependencies;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: OrderRatingComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lcom/dodopizza/controlling/feature/orderrating/di/OrderRatingComponent;", "Lcom/dodopizza/controlling/feature/couriertipscard/CourierTipsCardFeatureDependencies;", "Lkh7;", "fragment", "", "z2", c.a, "a", "b", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public interface OrderRatingComponent extends CourierTipsCardFeatureDependencies {
    public static final a c = a.a;

    /* compiled from: OrderRatingComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/dodopizza/controlling/feature/orderrating/di/OrderRatingComponent$a;", "", "Lcom/dodopizza/controlling/feature/orderrating/di/OrderRatingComponent$b;", "a", "()Lcom/dodopizza/controlling/feature/orderrating/di/OrderRatingComponent$b;", "factory", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final b a() {
            b a2 = DaggerOrderRatingComponent.a();
            z65.g(a2, "factory(...)");
            return a2;
        }
    }

    /* compiled from: OrderRatingComponent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lcom/dodopizza/controlling/feature/orderrating/di/OrderRatingComponent$b;", "", "Leh7;", "data", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lop5;", "lifecycleOwner", "Lcom/dodopizza/controlling/feature/orderrating/OrderRatingFeatureDependencies;", "dependencies", "Lcom/dodopizza/controlling/feature/orderrating/di/OrderRatingComponent;", "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public interface b {
        OrderRatingComponent a(eh7 eh7Var, Context context, op5 op5Var, OrderRatingFeatureDependencies orderRatingFeatureDependencies);
    }

    void z2(kh7 kh7Var);
}
