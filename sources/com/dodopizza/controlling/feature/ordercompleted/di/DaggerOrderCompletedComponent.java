package com.dodopizza.controlling.feature.ordercompleted.di;

import android.content.Context;
import com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies;
import com.dodopizza.controlling.feature.ordercompleted.di.OrderCompletedComponent;
import com.dodopizza.controlling.feature.ordercompleted.presentation.OrderCompletedPresenter;
/* loaded from: classes.dex */
public final class DaggerOrderCompletedComponent {

    /* loaded from: classes.dex */
    private static final class OrderCompletedComponentImpl implements OrderCompletedComponent {
        private final OrderCompletedFeatureDependencies g;
        private final op5 h;
        private final OrderCompletedComponentImpl i;
        private as8<ic7> j;
        private as8<o69> k;
        private as8<oc7> l;
        private as8<gc> m;
        private as8<f63> n;
        private as8<jc7> o;
        private as8<ah7> p;
        private as8<OrderCompletedPresenter> q;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class a implements as8<gc> {
            private final OrderCompletedFeatureDependencies a;

            a(OrderCompletedFeatureDependencies orderCompletedFeatureDependencies) {
                this.a = orderCompletedFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class b implements as8<jc7> {
            private final OrderCompletedFeatureDependencies a;

            b(OrderCompletedFeatureDependencies orderCompletedFeatureDependencies) {
                this.a = orderCompletedFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public jc7 get() {
                return (jc7) jh8.d(this.a.c3());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class c implements as8<ah7> {
            private final OrderCompletedFeatureDependencies a;

            c(OrderCompletedFeatureDependencies orderCompletedFeatureDependencies) {
                this.a = orderCompletedFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ah7 get() {
                return (ah7) jh8.d(this.a.E());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class d implements as8<o69> {
            private final OrderCompletedFeatureDependencies a;

            d(OrderCompletedFeatureDependencies orderCompletedFeatureDependencies) {
                this.a = orderCompletedFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public o69 get() {
                return (o69) jh8.d(this.a.f0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class e implements as8<f63> {
            private final OrderCompletedFeatureDependencies a;

            e(OrderCompletedFeatureDependencies orderCompletedFeatureDependencies) {
                this.a = orderCompletedFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        private void P2(OrderCompletedFeatureDependencies orderCompletedFeatureDependencies, ic7 ic7Var, op5 op5Var) {
            this.j = z45.a(ic7Var);
            d dVar = new d(orderCompletedFeatureDependencies);
            this.k = dVar;
            this.l = p63.a(sc7.a(dVar));
            this.m = new a(orderCompletedFeatureDependencies);
            this.n = new e(orderCompletedFeatureDependencies);
            this.o = new b(orderCompletedFeatureDependencies);
            c cVar = new c(orderCompletedFeatureDependencies);
            this.p = cVar;
            this.q = p63.a(tc7.a(this.j, this.l, this.m, this.n, this.o, cVar));
        }

        private mc7 l4(mc7 mc7Var) {
            nc7.b(mc7Var, m4());
            nc7.a(mc7Var, this.q);
            return mc7Var;
        }

        private xtb m4() {
            return uc7.a(this.h, (Context) jh8.d(this.g.getContext()));
        }

        @Override // com.dodopizza.controlling.feature.couriertipscard.CourierTipsCardFeatureDependencies
        public fz1 F2() {
            return qc7.a(this.q.get());
        }

        @Override // com.dodopizza.controlling.feature.mysteryshoppercard.MysteryShopperCardFeatureDependencies
        public tr6 K3() {
            return rc7.a(this.q.get());
        }

        @Override // com.dodopizza.controlling.feature.mysteryshoppercard.MysteryShopperCardFeatureDependencies
        public es6 V() {
            return (es6) jh8.d(this.g.V());
        }

        @Override // com.dodopizza.controlling.feature.couriertipscard.CourierTipsCardFeatureDependencies, com.dodopizza.controlling.feature.mysteryshoppercard.MysteryShopperCardFeatureDependencies
        public gc a() {
            return (gc) jh8.d(this.g.a());
        }

        @Override // com.dodopizza.controlling.feature.couriertipscard.CourierTipsCardFeatureDependencies
        public tz1 e0() {
            return (tz1) jh8.d(this.g.e0());
        }

        @Override // com.dodopizza.controlling.feature.ordercompleted.di.OrderCompletedComponent
        public void h4(mc7 mc7Var) {
            l4(mc7Var);
        }

        @Override // com.dodopizza.controlling.feature.couriertipscard.CourierTipsCardFeatureDependencies
        public pz1 k0() {
            return (pz1) jh8.d(this.g.k0());
        }

        private OrderCompletedComponentImpl(OrderCompletedFeatureDependencies orderCompletedFeatureDependencies, ic7 ic7Var, op5 op5Var) {
            this.i = this;
            this.g = orderCompletedFeatureDependencies;
            this.h = op5Var;
            P2(orderCompletedFeatureDependencies, ic7Var, op5Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements OrderCompletedComponent.b {
        private a() {
        }

        @Override // com.dodopizza.controlling.feature.ordercompleted.di.OrderCompletedComponent.b
        public OrderCompletedComponent a(ic7 ic7Var, op5 op5Var, OrderCompletedFeatureDependencies orderCompletedFeatureDependencies) {
            jh8.b(ic7Var);
            jh8.b(op5Var);
            jh8.b(orderCompletedFeatureDependencies);
            return new OrderCompletedComponentImpl(orderCompletedFeatureDependencies, ic7Var, op5Var);
        }
    }

    public static OrderCompletedComponent.b a() {
        return new a();
    }
}
