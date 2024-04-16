package defpackage;

import com.dodopizza.activeorder.feature.orderdetails.OrderDetailsFeatureDependencies;
import com.dodopizza.activeorder.feature.orderdetails.presentation.OrderDetailsPresenter;
import defpackage.yc7;
/* compiled from: DaggerOrderDetailsComponent.java */
/* renamed from: mg2  reason: default package */
/* loaded from: classes.dex */
public final class mg2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerOrderDetailsComponent.java */
    /* renamed from: mg2$a */
    /* loaded from: classes.dex */
    public static final class a implements yc7.b {
        private a() {
        }

        @Override // defpackage.yc7.b
        public yc7 a(OrderDetailsFeatureDependencies orderDetailsFeatureDependencies, String str) {
            jh8.b(orderDetailsFeatureDependencies);
            jh8.b(str);
            return new b(orderDetailsFeatureDependencies, str);
        }
    }

    /* compiled from: DaggerOrderDetailsComponent.java */
    /* renamed from: mg2$b */
    /* loaded from: classes.dex */
    private static final class b implements yc7 {
        private final b b;
        private as8<f63> c;
        private as8<jgb> d;
        private as8<li7> e;
        private as8<g78> f;
        private as8<hq3> g;
        private as8<e78> h;
        private as8<com.dodopizza.activeorder.feature.orderdetails.presentation.b> i;
        private as8<ed7> j;
        private as8<String> k;
        private as8<OrderDetailsPresenter> l;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerOrderDetailsComponent.java */
        /* renamed from: mg2$b$a */
        /* loaded from: classes.dex */
        public static final class a implements as8<hq3> {
            private final OrderDetailsFeatureDependencies a;

            a(OrderDetailsFeatureDependencies orderDetailsFeatureDependencies) {
                this.a = orderDetailsFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hq3 get() {
                return (hq3) jh8.d(this.a.c());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerOrderDetailsComponent.java */
        /* renamed from: mg2$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0439b implements as8<li7> {
            private final OrderDetailsFeatureDependencies a;

            C0439b(OrderDetailsFeatureDependencies orderDetailsFeatureDependencies) {
                this.a = orderDetailsFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public li7 get() {
                return (li7) jh8.d(this.a.r());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerOrderDetailsComponent.java */
        /* renamed from: mg2$b$c */
        /* loaded from: classes.dex */
        public static final class c implements as8<e78> {
            private final OrderDetailsFeatureDependencies a;

            c(OrderDetailsFeatureDependencies orderDetailsFeatureDependencies) {
                this.a = orderDetailsFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public e78 get() {
                return (e78) jh8.d(this.a.w());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerOrderDetailsComponent.java */
        /* renamed from: mg2$b$d */
        /* loaded from: classes.dex */
        public static final class d implements as8<g78> {
            private final OrderDetailsFeatureDependencies a;

            d(OrderDetailsFeatureDependencies orderDetailsFeatureDependencies) {
                this.a = orderDetailsFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public g78 get() {
                return (g78) jh8.d(this.a.N());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerOrderDetailsComponent.java */
        /* renamed from: mg2$b$e */
        /* loaded from: classes.dex */
        public static final class e implements as8<f63> {
            private final OrderDetailsFeatureDependencies a;

            e(OrderDetailsFeatureDependencies orderDetailsFeatureDependencies) {
                this.a = orderDetailsFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerOrderDetailsComponent.java */
        /* renamed from: mg2$b$f */
        /* loaded from: classes.dex */
        public static final class f implements as8<jgb> {
            private final OrderDetailsFeatureDependencies a;

            f(OrderDetailsFeatureDependencies orderDetailsFeatureDependencies) {
                this.a = orderDetailsFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public jgb get() {
                return (jgb) jh8.d(this.a.J());
            }
        }

        private void b(OrderDetailsFeatureDependencies orderDetailsFeatureDependencies, String str) {
            this.c = new e(orderDetailsFeatureDependencies);
            this.d = new f(orderDetailsFeatureDependencies);
            this.e = new C0439b(orderDetailsFeatureDependencies);
            this.f = new d(orderDetailsFeatureDependencies);
            this.g = new a(orderDetailsFeatureDependencies);
            c cVar = new c(orderDetailsFeatureDependencies);
            this.h = cVar;
            as8<com.dodopizza.activeorder.feature.orderdetails.presentation.b> a2 = p63.a(nd7.a(this.f, this.g, cVar));
            this.i = a2;
            this.j = p63.a(fd7.a(this.e, a2));
            no3 a3 = z45.a(str);
            this.k = a3;
            this.l = p63.a(id7.a(this.c, this.d, this.j, a3));
        }

        private bd7 c(bd7 bd7Var) {
            cd7.a(bd7Var, this.l);
            return bd7Var;
        }

        @Override // defpackage.yc7
        public void a(bd7 bd7Var) {
            c(bd7Var);
        }

        private b(OrderDetailsFeatureDependencies orderDetailsFeatureDependencies, String str) {
            this.b = this;
            b(orderDetailsFeatureDependencies, str);
        }
    }

    public static yc7.b a() {
        return new a();
    }
}
