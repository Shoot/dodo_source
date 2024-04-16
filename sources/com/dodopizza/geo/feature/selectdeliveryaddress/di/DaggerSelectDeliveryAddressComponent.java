package com.dodopizza.geo.feature.selectdeliveryaddress.di;

import com.dodopizza.geo.feature.selectdeliveryaddress.SelectDeliveryAddressPresenter;
import com.dodopizza.geo.feature.selectdeliveryaddress.b;
import com.dodopizza.geo.feature.selectdeliveryaddress.di.SelectDeliveryAddressComponent;
/* loaded from: classes2.dex */
public final class DaggerSelectDeliveryAddressComponent {

    /* loaded from: classes2.dex */
    private static final class SelectDeliveryAddressComponentImpl implements SelectDeliveryAddressComponent {
        private final SelectDeliveryAddressComponentImpl g;
        private as8<f63> h;
        private as8<jz2> i;
        private as8<com.dodopizza.geo.feature.selectdeliveryaddress.a> j;
        private as8<com.dodopizza.geo.feature.selectdeliveryaddress.b> k;
        private as8<com.dodopizza.geo.feature.deliveryaddresslist.presentation.c> l;
        private as8<pd3> m;
        private as8<dv6> n;
        private as8<hq3> o;
        private as8<gc> p;
        private as8<com.dodopizza.geo.feature.selectdeliveryaddress.c> q;
        private as8<SelectDeliveryAddressPresenter> r;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public static final class a implements as8<gc> {
            private final SelectDeliveryAddressFeatureDependencies a;

            a(SelectDeliveryAddressFeatureDependencies selectDeliveryAddressFeatureDependencies) {
                this.a = selectDeliveryAddressFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public static final class b implements as8<hq3> {
            private final SelectDeliveryAddressFeatureDependencies a;

            b(SelectDeliveryAddressFeatureDependencies selectDeliveryAddressFeatureDependencies) {
                this.a = selectDeliveryAddressFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hq3 get() {
                return (hq3) jh8.d(this.a.c());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public static final class c implements as8<com.dodopizza.geo.feature.selectdeliveryaddress.a> {
            private final SelectDeliveryAddressRoutingFeatureDependencies a;

            c(SelectDeliveryAddressRoutingFeatureDependencies selectDeliveryAddressRoutingFeatureDependencies) {
                this.a = selectDeliveryAddressRoutingFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public com.dodopizza.geo.feature.selectdeliveryaddress.a get() {
                return (com.dodopizza.geo.feature.selectdeliveryaddress.a) jh8.d(this.a.p2());
            }
        }

        private void P2(SelectDeliveryAddressFeatureDependencies selectDeliveryAddressFeatureDependencies, SelectDeliveryAddressRoutingFeatureDependencies selectDeliveryAddressRoutingFeatureDependencies, com.dodopizza.geo.feature.selectdeliveryaddress.b bVar) {
            as8<f63> a2 = p63.a(n5a.a());
            this.h = a2;
            this.i = p63.a(k5a.a(a2));
            this.j = new c(selectDeliveryAddressRoutingFeatureDependencies);
            no3 a3 = z45.a(bVar);
            this.k = a3;
            this.l = p63.a(j5a.a(this.h, this.j, a3));
            this.m = p63.a(l5a.a(this.h, this.j, this.k));
            this.n = p63.a(m5a.a());
            this.o = new b(selectDeliveryAddressFeatureDependencies);
            this.p = new a(selectDeliveryAddressFeatureDependencies);
            as8<com.dodopizza.geo.feature.selectdeliveryaddress.c> a4 = p63.a(p5a.a(this.h, this.k));
            this.q = a4;
            this.r = p63.a(o5a.a(this.o, this.k, this.p, a4, this.j));
        }

        private g5a l4(g5a g5aVar) {
            h5a.a(g5aVar, this.n.get());
            h5a.c(g5aVar, this.h.get());
            h5a.b(g5aVar, this.r);
            return g5aVar;
        }

        @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapRoutingFeatureDependencies
        public pd3 I3() {
            return this.m.get();
        }

        @Override // com.dodopizza.geo.feature.selectdeliveryaddress.di.SelectDeliveryAddressComponent
        public void p3(g5a g5aVar) {
            l4(g5aVar);
        }

        @Override // com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListRoutingFeatureDependencies
        public com.dodopizza.geo.feature.deliveryaddresslist.presentation.c t1() {
            return this.l.get();
        }

        @Override // com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsRouterFeatureDependencies
        public jz2 z3() {
            return this.i.get();
        }

        private SelectDeliveryAddressComponentImpl(SelectDeliveryAddressFeatureDependencies selectDeliveryAddressFeatureDependencies, SelectDeliveryAddressRoutingFeatureDependencies selectDeliveryAddressRoutingFeatureDependencies, com.dodopizza.geo.feature.selectdeliveryaddress.b bVar) {
            this.g = this;
            P2(selectDeliveryAddressFeatureDependencies, selectDeliveryAddressRoutingFeatureDependencies, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a implements SelectDeliveryAddressComponent.b {
        private a() {
        }

        @Override // com.dodopizza.geo.feature.selectdeliveryaddress.di.SelectDeliveryAddressComponent.b
        public SelectDeliveryAddressComponent a(SelectDeliveryAddressFeatureDependencies selectDeliveryAddressFeatureDependencies, SelectDeliveryAddressRoutingFeatureDependencies selectDeliveryAddressRoutingFeatureDependencies, b bVar) {
            jh8.b(selectDeliveryAddressFeatureDependencies);
            jh8.b(selectDeliveryAddressRoutingFeatureDependencies);
            jh8.b(bVar);
            return new SelectDeliveryAddressComponentImpl(selectDeliveryAddressFeatureDependencies, selectDeliveryAddressRoutingFeatureDependencies, bVar);
        }
    }

    public static SelectDeliveryAddressComponent.b a() {
        return new a();
    }
}
