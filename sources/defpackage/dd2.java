package defpackage;

import com.dodopizza.order.feature.delivery.address.DeliveryAddressFeatureDependencies;
import com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressPresenter;
import defpackage.wu2;
/* compiled from: DaggerDeliveryAddressComponent.java */
/* renamed from: dd2  reason: default package */
/* loaded from: classes2.dex */
public final class dd2 {

    /* compiled from: DaggerDeliveryAddressComponent.java */
    /* renamed from: dd2$a */
    /* loaded from: classes2.dex */
    private static final class a implements wu2 {
        private final a b;
        private as8<xu2> c;
        private as8<fv2> d;
        private as8<ny1> e;
        private as8<gc> f;
        private as8<DeliveryAddressPresenter> g;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerDeliveryAddressComponent.java */
        /* renamed from: dd2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0283a implements as8<gc> {
            private final DeliveryAddressFeatureDependencies a;

            C0283a(DeliveryAddressFeatureDependencies deliveryAddressFeatureDependencies) {
                this.a = deliveryAddressFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerDeliveryAddressComponent.java */
        /* renamed from: dd2$a$b */
        /* loaded from: classes2.dex */
        public static final class b implements as8<fv2> {
            private final DeliveryAddressFeatureDependencies a;

            b(DeliveryAddressFeatureDependencies deliveryAddressFeatureDependencies) {
                this.a = deliveryAddressFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public fv2 get() {
                return (fv2) jh8.d(this.a.g2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerDeliveryAddressComponent.java */
        /* renamed from: dd2$a$c */
        /* loaded from: classes2.dex */
        public static final class c implements as8<ny1> {
            private final DeliveryAddressFeatureDependencies a;

            c(DeliveryAddressFeatureDependencies deliveryAddressFeatureDependencies) {
                this.a = deliveryAddressFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ny1 get() {
                return (ny1) jh8.d(this.a.v3());
            }
        }

        private void b(DeliveryAddressFeatureDependencies deliveryAddressFeatureDependencies, xu2 xu2Var) {
            this.c = z45.a(xu2Var);
            this.d = new b(deliveryAddressFeatureDependencies);
            this.e = new c(deliveryAddressFeatureDependencies);
            C0283a c0283a = new C0283a(deliveryAddressFeatureDependencies);
            this.f = c0283a;
            this.g = ww2.a(this.c, this.d, this.e, c0283a);
        }

        private av2 c(av2 av2Var) {
            dv2.a(av2Var, this.g);
            return av2Var;
        }

        @Override // defpackage.wu2
        public void a(av2 av2Var) {
            c(av2Var);
        }

        private a(DeliveryAddressFeatureDependencies deliveryAddressFeatureDependencies, xu2 xu2Var) {
            this.b = this;
            b(deliveryAddressFeatureDependencies, xu2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerDeliveryAddressComponent.java */
    /* renamed from: dd2$b */
    /* loaded from: classes2.dex */
    public static final class b implements wu2.b {
        private b() {
        }

        @Override // defpackage.wu2.b
        public wu2 a(xu2 xu2Var, DeliveryAddressFeatureDependencies deliveryAddressFeatureDependencies) {
            jh8.b(xu2Var);
            jh8.b(deliveryAddressFeatureDependencies);
            return new a(deliveryAddressFeatureDependencies, xu2Var);
        }
    }

    public static wu2.b a() {
        return new b();
    }
}
