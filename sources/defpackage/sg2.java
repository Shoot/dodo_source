package defpackage;

import com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies;
import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsPresenter;
import defpackage.ee7;
/* compiled from: DaggerOrderHistoryDetailsComponent.java */
/* renamed from: sg2  reason: default package */
/* loaded from: classes2.dex */
public final class sg2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerOrderHistoryDetailsComponent.java */
    /* renamed from: sg2$a */
    /* loaded from: classes2.dex */
    public static final class a implements ee7.a {
        private OrderHistoryFeatureDependencies a;
        private ae7 b;
        private Integer c;

        private a() {
        }

        @Override // defpackage.ee7.a
        public ee7 a() {
            jh8.a(this.a, OrderHistoryFeatureDependencies.class);
            jh8.a(this.b, ae7.class);
            jh8.a(this.c, Integer.class);
            return new b(this.a, this.b, this.c);
        }

        @Override // defpackage.ee7.a
        /* renamed from: e */
        public a d(ae7 ae7Var) {
            this.b = (ae7) jh8.b(ae7Var);
            return this;
        }

        @Override // defpackage.ee7.a
        /* renamed from: f */
        public a c(OrderHistoryFeatureDependencies orderHistoryFeatureDependencies) {
            this.a = (OrderHistoryFeatureDependencies) jh8.b(orderHistoryFeatureDependencies);
            return this;
        }

        @Override // defpackage.ee7.a
        /* renamed from: g */
        public a b(int i) {
            this.c = (Integer) jh8.b(Integer.valueOf(i));
            return this;
        }
    }

    /* compiled from: DaggerOrderHistoryDetailsComponent.java */
    /* renamed from: sg2$b */
    /* loaded from: classes2.dex */
    private static final class b implements ee7 {
        private final OrderHistoryFeatureDependencies a;
        private final b b;
        private as8<ae7> c;
        private as8<fe7> d;
        private as8<f63> e;
        private as8<pe7> f;
        private as8<li7> g;
        private as8<f8c> h;
        private as8<t52> i;
        private as8<dt5> j;
        private as8<gc> k;
        private as8<m31> l;
        private as8<me7> m;
        private as8<hq3> n;
        private as8<Integer> o;
        private as8<OrderHistoryDetailsPresenter> p;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerOrderHistoryDetailsComponent.java */
        /* renamed from: sg2$b$a */
        /* loaded from: classes2.dex */
        public static final class a implements as8<gc> {
            private final OrderHistoryFeatureDependencies a;

            a(OrderHistoryFeatureDependencies orderHistoryFeatureDependencies) {
                this.a = orderHistoryFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.w1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerOrderHistoryDetailsComponent.java */
        /* renamed from: sg2$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0665b implements as8<m31> {
            private final OrderHistoryFeatureDependencies a;

            C0665b(OrderHistoryFeatureDependencies orderHistoryFeatureDependencies) {
                this.a = orderHistoryFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public m31 get() {
                return (m31) jh8.d(this.a.j4());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerOrderHistoryDetailsComponent.java */
        /* renamed from: sg2$b$c */
        /* loaded from: classes2.dex */
        public static final class c implements as8<t52> {
            private final OrderHistoryFeatureDependencies a;

            c(OrderHistoryFeatureDependencies orderHistoryFeatureDependencies) {
                this.a = orderHistoryFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public t52 get() {
                return (t52) jh8.d(this.a.A2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerOrderHistoryDetailsComponent.java */
        /* renamed from: sg2$b$d */
        /* loaded from: classes2.dex */
        public static final class d implements as8<fe7> {
            private final OrderHistoryFeatureDependencies a;

            d(OrderHistoryFeatureDependencies orderHistoryFeatureDependencies) {
                this.a = orderHistoryFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public fe7 get() {
                return (fe7) jh8.d(this.a.X2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerOrderHistoryDetailsComponent.java */
        /* renamed from: sg2$b$e */
        /* loaded from: classes2.dex */
        public static final class e implements as8<hq3> {
            private final OrderHistoryFeatureDependencies a;

            e(OrderHistoryFeatureDependencies orderHistoryFeatureDependencies) {
                this.a = orderHistoryFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hq3 get() {
                return (hq3) jh8.d(this.a.z0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerOrderHistoryDetailsComponent.java */
        /* renamed from: sg2$b$f */
        /* loaded from: classes2.dex */
        public static final class f implements as8<f63> {
            private final OrderHistoryFeatureDependencies a;

            f(OrderHistoryFeatureDependencies orderHistoryFeatureDependencies) {
                this.a = orderHistoryFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerOrderHistoryDetailsComponent.java */
        /* renamed from: sg2$b$g */
        /* loaded from: classes2.dex */
        public static final class g implements as8<dt5> {
            private final OrderHistoryFeatureDependencies a;

            g(OrderHistoryFeatureDependencies orderHistoryFeatureDependencies) {
                this.a = orderHistoryFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public dt5 get() {
                return (dt5) jh8.d(this.a.x1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerOrderHistoryDetailsComponent.java */
        /* renamed from: sg2$b$h */
        /* loaded from: classes2.dex */
        public static final class h implements as8<li7> {
            private final OrderHistoryFeatureDependencies a;

            h(OrderHistoryFeatureDependencies orderHistoryFeatureDependencies) {
                this.a = orderHistoryFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public li7 get() {
                return (li7) jh8.d(this.a.L2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerOrderHistoryDetailsComponent.java */
        /* renamed from: sg2$b$i */
        /* loaded from: classes2.dex */
        public static final class i implements as8<f8c> {
            private final OrderHistoryFeatureDependencies a;

            i(OrderHistoryFeatureDependencies orderHistoryFeatureDependencies) {
                this.a = orderHistoryFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f8c get() {
                return (f8c) jh8.d(this.a.e1());
            }
        }

        private void b(OrderHistoryFeatureDependencies orderHistoryFeatureDependencies, ae7 ae7Var, Integer num) {
            this.c = z45.a(ae7Var);
            this.d = new d(orderHistoryFeatureDependencies);
            f fVar = new f(orderHistoryFeatureDependencies);
            this.e = fVar;
            this.f = qe7.a(this.d, fVar);
            this.g = new h(orderHistoryFeatureDependencies);
            this.h = new i(orderHistoryFeatureDependencies);
            this.i = new c(orderHistoryFeatureDependencies);
            this.j = new g(orderHistoryFeatureDependencies);
            this.k = new a(orderHistoryFeatureDependencies);
            C0665b c0665b = new C0665b(orderHistoryFeatureDependencies);
            this.l = c0665b;
            this.m = ne7.a(this.g, this.h, this.i, this.j, this.k, c0665b);
            this.n = new e(orderHistoryFeatureDependencies);
            no3 a2 = z45.a(num);
            this.o = a2;
            this.p = oe7.a(this.c, this.f, this.m, this.n, a2, this.k);
        }

        private je7 c(je7 je7Var) {
            ke7.a(je7Var, (g78) jh8.d(this.a.f4()));
            ke7.b(je7Var, this.p);
            return je7Var;
        }

        @Override // defpackage.ee7
        public void a(je7 je7Var) {
            c(je7Var);
        }

        private b(OrderHistoryFeatureDependencies orderHistoryFeatureDependencies, ae7 ae7Var, Integer num) {
            this.b = this;
            this.a = orderHistoryFeatureDependencies;
            b(orderHistoryFeatureDependencies, ae7Var, num);
        }
    }

    public static ee7.a a() {
        return new a();
    }
}
