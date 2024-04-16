package defpackage;

import com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies;
import com.dodopizza.controlling.feature.ordercompleted.presentation.orderinfo.CompletedOrderInfoPresenter;
import defpackage.kl1;
/* compiled from: DaggerCompletedOrderInfoComponent.java */
/* renamed from: yc2  reason: default package */
/* loaded from: classes.dex */
public final class yc2 {

    /* compiled from: DaggerCompletedOrderInfoComponent.java */
    /* renamed from: yc2$a */
    /* loaded from: classes.dex */
    private static final class a implements kl1 {
        private final ll1 b;
        private final OrderCompletedFeatureDependencies c;
        private final a d;

        private nl1 b() {
            return pl1.a((li7) jh8.d(this.c.r()));
        }

        @Override // defpackage.kl1
        public CompletedOrderInfoPresenter a() {
            return ql1.a(this.b, b());
        }

        private a(OrderCompletedFeatureDependencies orderCompletedFeatureDependencies, ll1 ll1Var) {
            this.d = this;
            this.b = ll1Var;
            this.c = orderCompletedFeatureDependencies;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerCompletedOrderInfoComponent.java */
    /* renamed from: yc2$b */
    /* loaded from: classes.dex */
    public static final class b implements kl1.b {
        private b() {
        }

        @Override // defpackage.kl1.b
        public kl1 a(ll1 ll1Var, OrderCompletedFeatureDependencies orderCompletedFeatureDependencies) {
            jh8.b(ll1Var);
            jh8.b(orderCompletedFeatureDependencies);
            return new a(orderCompletedFeatureDependencies, ll1Var);
        }
    }

    public static kl1.b a() {
        return new b();
    }
}
