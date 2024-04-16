package defpackage;

import com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies;
import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.OrderHistoryPresenter;
/* compiled from: DaggerOrderHistoryComponent.java */
/* renamed from: pg2  reason: default package */
/* loaded from: classes2.dex */
public final class pg2 {

    /* compiled from: DaggerOrderHistoryComponent.java */
    /* renamed from: pg2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private OrderHistoryFeatureDependencies a;

        public de7 a() {
            jh8.a(this.a, OrderHistoryFeatureDependencies.class);
            return new b(this.a);
        }

        public a b(OrderHistoryFeatureDependencies orderHistoryFeatureDependencies) {
            this.a = (OrderHistoryFeatureDependencies) jh8.b(orderHistoryFeatureDependencies);
            return this;
        }

        private a() {
        }
    }

    /* compiled from: DaggerOrderHistoryComponent.java */
    /* renamed from: pg2$b */
    /* loaded from: classes2.dex */
    private static final class b implements de7 {
        private final OrderHistoryFeatureDependencies a;
        private final b b;

        private ff7 b() {
            return kf7.a((sf7) jh8.d(this.a.p1()), (li7) jh8.d(this.a.L2()), (f8c) jh8.d(this.a.e1()), (t52) jh8.d(this.a.A2()), (dt5) jh8.d(this.a.x1()), (gc) jh8.d(this.a.w1()));
        }

        private pf7 c() {
            return mf7.a((ze7) jh8.d(this.a.P3()), (f63) jh8.d(this.a.b()));
        }

        @Override // defpackage.de7
        public OrderHistoryPresenter a() {
            return lf7.a(c(), b(), (gc) jh8.d(this.a.w1()));
        }

        private b(OrderHistoryFeatureDependencies orderHistoryFeatureDependencies) {
            this.b = this;
            this.a = orderHistoryFeatureDependencies;
        }
    }

    public static a a() {
        return new a();
    }
}
