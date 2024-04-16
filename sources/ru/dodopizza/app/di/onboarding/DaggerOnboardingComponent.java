package ru.dodopizza.app.di.onboarding;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import ru.dodopizza.app.di.onboarding.OnboardingComponent;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.authorization.AuthorizationAPI;
import ru.dodopizza.backend.domain.geo.GeoApi;
import ru.dodopizza.backend.domain.landing.LandingApi;
/* loaded from: classes3.dex */
public final class DaggerOnboardingComponent {

    /* loaded from: classes3.dex */
    private static final class OnboardingComponentImpl implements OnboardingComponent {
        private as8<ht4> A;
        private as8<GeoApi> B;
        private as8<re4> C;
        private as8<ci8> D;
        private as8<v97> E;
        private as8<dv6> F;
        private as8<jz2> G;
        private final OnboardingFeatureDependencies g;
        private final h97 h;
        private final OnboardingComponentImpl i;
        private as8<f63> j;
        private as8<h97> k;
        private as8<hq3> l;
        private as8<HashMap<String, List<bq3>>> m;
        private as8<fq3> n;
        private as8<ry1> o;
        private as8<yhb> p;
        private as8<mh0> q;
        private as8<gy3> r;
        private as8<iq3> s;
        private as8<hq3> t;
        private as8<wc> u;
        private as8<gc> v;
        private as8<f63> w;
        private as8<yo9> x;
        private as8<ih4> y;
        private as8<com.dodopizza.onboarding.feature.chooseordertype.presentation.a> z;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class a implements as8<hq3> {
            private final OnboardingFeatureDependencies a;

            a(OnboardingFeatureDependencies onboardingFeatureDependencies) {
                this.a = onboardingFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hq3 get() {
                return (hq3) jh8.d(this.a.z0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class b implements as8<wc> {
            private final OnboardingFeatureDependencies a;

            b(OnboardingFeatureDependencies onboardingFeatureDependencies) {
                this.a = onboardingFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public wc get() {
                return (wc) jh8.d(this.a.L1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class c implements as8<mh0> {
            private final OnboardingFeatureDependencies a;

            c(OnboardingFeatureDependencies onboardingFeatureDependencies) {
                this.a = onboardingFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public mh0 get() {
                return (mh0) jh8.d(this.a.i());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class d implements as8<ci8> {
            private final OnboardingFeatureDependencies a;

            d(OnboardingFeatureDependencies onboardingFeatureDependencies) {
                this.a = onboardingFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ci8 get() {
                return (ci8) jh8.d(this.a.d3());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class e implements as8<HashMap<String, List<bq3>>> {
            private final OnboardingFeatureDependencies a;

            e(OnboardingFeatureDependencies onboardingFeatureDependencies) {
                this.a = onboardingFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public HashMap<String, List<bq3>> get() {
                return (HashMap) jh8.d(this.a.D1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class f implements as8<ry1> {
            private final OnboardingFeatureDependencies a;

            f(OnboardingFeatureDependencies onboardingFeatureDependencies) {
                this.a = onboardingFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ry1 get() {
                return (ry1) jh8.d(this.a.C3());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class g implements as8<gy3> {
            private final OnboardingFeatureDependencies a;

            g(OnboardingFeatureDependencies onboardingFeatureDependencies) {
                this.a = onboardingFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gy3 get() {
                return (gy3) jh8.d(this.a.Y0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class h implements as8<GeoApi> {
            private final OnboardingFeatureDependencies a;

            h(OnboardingFeatureDependencies onboardingFeatureDependencies) {
                this.a = onboardingFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public GeoApi get() {
                return (GeoApi) jh8.d(this.a.B0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class i implements as8<ih4> {
            private final OnboardingFeatureDependencies a;

            i(OnboardingFeatureDependencies onboardingFeatureDependencies) {
                this.a = onboardingFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ih4 get() {
                return (ih4) jh8.d(this.a.A());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class j implements as8<f63> {
            private final OnboardingRouterFeatureDependencies a;

            j(OnboardingRouterFeatureDependencies onboardingRouterFeatureDependencies) {
                this.a = onboardingRouterFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class k implements as8<yhb> {
            private final OnboardingFeatureDependencies a;

            k(OnboardingFeatureDependencies onboardingFeatureDependencies) {
                this.a = onboardingFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public yhb get() {
                return (yhb) jh8.d(this.a.u0());
            }
        }

        private void P2(OnboardingFeatureDependencies onboardingFeatureDependencies, OnboardingRouterFeatureDependencies onboardingRouterFeatureDependencies, h97 h97Var) {
            this.j = p63.a(t97.a());
            this.k = z45.a(h97Var);
            this.l = new a(onboardingFeatureDependencies);
            this.m = new e(onboardingFeatureDependencies);
            this.n = p63.a(q97.a(wz4.a()));
            this.o = new f(onboardingFeatureDependencies);
            this.p = new k(onboardingFeatureDependencies);
            this.q = new c(onboardingFeatureDependencies);
            g gVar = new g(onboardingFeatureDependencies);
            this.r = gVar;
            jq3 a2 = jq3.a(this.m, this.n, this.o, this.p, this.q, gVar);
            this.s = a2;
            this.t = p63.a(r97.a(this.k, this.l, a2));
            b bVar = new b(onboardingFeatureDependencies);
            this.u = bVar;
            this.v = p63.a(n97.a(bVar, this.t));
            j jVar = new j(onboardingRouterFeatureDependencies);
            this.w = jVar;
            this.x = p63.a(u97.a(jVar, this.j));
            i iVar = new i(onboardingFeatureDependencies);
            this.y = iVar;
            this.z = p63.a(o97.a(this.x, this.t, iVar));
            this.A = p63.a(fz2.a());
            h hVar = new h(onboardingFeatureDependencies);
            this.B = hVar;
            this.C = p63.a(cz2.a(hVar));
            d dVar = new d(onboardingFeatureDependencies);
            this.D = dVar;
            this.E = p63.a(w97.a(dVar));
            this.F = p63.a(s97.a());
            this.G = p63.a(p97.a(this.j));
        }

        private z4a l4() {
            return new z4a(this.j.get());
        }

        @Override // com.dodopizza.onboarding.feature.chooseordertype.GeoChooseOrderTypeFeatureDependencies
        public ih4 A() {
            return (ih4) jh8.d(this.g.A());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.landing.phoneinput.LandingPhoneInputDependencies
        public v28 A0() {
            return (v28) jh8.d(this.g.A0());
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies
        public vg7 B() {
            return (vg7) jh8.d(this.g.B());
        }

        @Override // com.dodopizza.onboarding.feature.chooseordertype.GeoChooseOrderTypeFeatureDependencies, ru.dodopizza.app.di.modules.presentation.selectlocation.localitylist.LocalityListFeatureDependencies, com.dodopizza.onboarding.feature.selectcountry.SelectCountryDependencies, com.dodopizza.order.feature.combinedmap.CombinedSelectionMapFeatureDependencies
        public py1 C() {
            return (py1) jh8.d(this.g.C());
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public ew5 D() {
            return (ew5) jh8.d(this.g.D());
        }

        @Override // com.dodopizza.geo.feature.deliveryaddressmap.DeliveryAddressMapFeatureDependencies
        public ci8 G() {
            return (ci8) jh8.d(this.g.d3());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.selectlocation.localitylist.LocalityListFeatureDependencies, ru.dodopizza.app.di.modules.presentation.selectlocation.SelectLocationFeatureDependencies
        public yo9 G0() {
            return this.x.get();
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies
        public pv9 H() {
            return (pv9) jh8.d(this.g.H());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.selectlocation.SelectLocationFeatureDependencies
        public k6a K() {
            return (k6a) jh8.d(this.g.K());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.selectlocation.SelectLocationFeatureDependencies
        public dv6 K0() {
            return this.F.get();
        }

        @Override // com.dodopizza.onboarding.feature.chooseordertype.GeoChooseOrderTypeFeatureDependencies
        public ny1 K1() {
            return (ny1) jh8.d(this.g.b1());
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies
        public r43 L() {
            return (r43) jh8.d(this.g.L());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.landing.smsinput.LandingSMSInputFeatureDependencies
        public pl5 L0() {
            return (pl5) jh8.d(this.g.L0());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.landing.smsinput.LandingSMSInputFeatureDependencies
        public AuthorizationAPI O2() {
            return (AuthorizationAPI) jh8.d(this.g.t3());
        }

        @Override // com.dodopizza.geo.feature.deliveryaddressmap.DeliveryAddressMapFeatureDependencies
        public ey7 O3() {
            return (ey7) jh8.d(this.g.C0());
        }

        @Override // com.dodopizza.geo.feature.deliveryaddressmap.DeliveryAddressMapFeatureDependencies, com.dodopizza.order.feature.selectionmap.SelectionMapFeatureDependencies
        public re4 R() {
            return this.C.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.selectlocation.SelectLocationFeatureDependencies
        public nh5 S1() {
            return new nh5((jv5) jh8.d(this.g.f()));
        }

        @Override // ru.dodopizza.app.di.modules.presentation.selectlocation.SelectLocationFeatureDependencies
        public s80 T() {
            return (s80) jh8.d(this.g.T());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.landing.phoneinput.LandingPhoneInputDependencies
        public m28 T0() {
            return (m28) jh8.d(this.g.T0());
        }

        @Override // com.dodopizza.geo.feature.deliveryaddressmap.DeliveryAddressMapFeatureDependencies
        public ht4 T3() {
            return this.A.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.selectlocation.SelectLocationFeatureDependencies
        public v97 U2() {
            return this.E.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.landing.LandingFeatureDependencies, ru.dodopizza.app.di.modules.presentation.landing.phoneinput.LandingPhoneInputDependencies
        public ml5 Z() {
            return (ml5) jh8.d(this.g.Z());
        }

        @Override // com.dodopizza.onboarding.feature.chooseordertype.GeoChooseOrderTypeFeatureDependencies, ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies, com.dodopizza.geo.feature.selectdeliveryaddress.di.SelectDeliveryAddressFeatureDependencies, com.dodopizza.profile.feature.profilelocalelist.ProfileLocaleListFeatureDependencies, com.dodopizza.geo.feature.phonenumbercollector.PhoneNumberCollectorDependencies, com.dodopizza.order.feature.delivery.address.DeliveryAddressFeatureDependencies
        public gc a() {
            return this.v.get();
        }

        @Override // com.dodopizza.order.feature.selectionmap.SelectionMapFeatureDependencies, com.dodopizza.order.feature.pizzeriasuggestions.PizzeriaSuggestionsDependencies
        public la8 a0() {
            return (la8) jh8.d(this.g.a0());
        }

        @Override // com.dodopizza.geo.feature.deliveryaddressmap.DeliveryAddressMapFeatureDependencies
        public qx1 a4() {
            return (qx1) jh8.d(this.g.q());
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingComponent, com.dodopizza.onboarding.feature.apprestartapprove.AppRestartApproveFeatureDependencies, ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.controlling.feature.fullscreenimage.FullscreenImageFeatureDependencies, com.dodopizza.controlling.feature.photopickerbutton.PhotoPickerButtonFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.profile.feature.profilelocalelist.ProfileLocaleListFeatureDependencies, com.dodopizza.geo.feature.phonenumbercollector.PhoneNumberCollectorDependencies
        public f63 b() {
            return this.j.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.selectlocation.localitylist.LocalityListFeatureDependencies
        public ny1 b1() {
            return (ny1) jh8.d(this.g.b1());
        }

        @Override // com.dodopizza.onboarding.feature.chooseordertype.GeoChooseOrderTypeFeatureDependencies, ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureServiceDependencies, com.dodopizza.geo.feature.selectdeliveryaddress.di.SelectDeliveryAddressFeatureDependencies, com.dodopizza.core.feature.debugtools.toggles.FeatureTogglesFeatureDependencies
        public hq3 c() {
            return this.t.get();
        }

        @Override // com.dodopizza.geo.feature.deliveryaddressmap.DeliveryAddressMapFeatureDependencies, com.dodopizza.onboarding.feature.selectcountry.SelectCountryDependencies, ru.dodopizza.app.di.modules.presentation.selectlocation.SelectLocationFeatureDependencies, com.dodopizza.order.feature.pizzeriasuggestions.PizzeriaSuggestionsDependencies
        public kx1 d() {
            return (kx1) jh8.d(this.g.d());
        }

        @Override // com.dodopizza.onboarding.feature.chooseordertype.GeoChooseOrderTypeFeatureDependencies, ru.dodopizza.app.di.modules.presentation.landing.phoneinput.LandingPhoneInputDependencies, ru.dodopizza.app.di.modules.presentation.landing.smsinput.LandingSMSInputFeatureDependencies, com.dodopizza.geo.feature.deliveryaddressmap.DeliveryAddressMapFeatureDependencies, ru.dodopizza.app.di.modules.presentation.selectlocation.localitylist.LocalityListFeatureDependencies, com.dodopizza.onboarding.feature.selectcountry.SelectCountryDependencies, ru.dodopizza.app.di.modules.presentation.selectlocation.SelectLocationFeatureDependencies, com.dodopizza.order.feature.combinedmap.CombinedSelectionMapFeatureDependencies, com.dodopizza.order.feature.selectionmap.SelectionMapFeatureDependencies
        public CountryService e() {
            return (CountryService) jh8.d(this.g.e());
        }

        @Override // com.dodopizza.onboarding.feature.selectcountry.SelectCountryDependencies
        public y4a e4() {
            return l4();
        }

        @Override // com.dodopizza.onboarding.feature.chooseordertype.GeoChooseOrderTypeFeatureDependencies, com.dodopizza.geo.feature.deliveryaddressmap.DeliveryAddressMapFeatureDependencies, ru.dodopizza.app.di.modules.presentation.selectlocation.localitylist.LocalityListFeatureDependencies, com.dodopizza.onboarding.feature.selectcountry.SelectCountryDependencies, ru.dodopizza.app.di.modules.presentation.selectlocation.SelectLocationFeatureDependencies
        public jv5 f() {
            return (jv5) jh8.d(this.g.f());
        }

        @Override // com.dodopizza.geo.feature.deliveryaddressmap.DeliveryAddressMapFeatureDependencies
        public i00 g() {
            return (i00) jh8.d(this.g.g());
        }

        @Override // com.dodopizza.geo.feature.deliveryaddressmap.DeliveryAddressMapFeatureDependencies
        public Context getContext() {
            return (Context) jh8.d(this.g.getContext());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.selectlocation.SelectLocationFeatureDependencies
        public mh0 i() {
            return (mh0) jh8.d(this.g.i());
        }

        @Override // com.dodopizza.onboarding.feature.chooseordertype.GeoChooseOrderTypeFeatureDependencies, ru.dodopizza.app.di.modules.presentation.selectlocation.localitylist.LocalityListFeatureDependencies, ru.dodopizza.app.di.modules.presentation.selectlocation.SelectLocationFeatureDependencies
        public h97 i0() {
            return this.h;
        }

        @Override // com.dodopizza.onboarding.feature.chooseordertype.GeoChooseOrderTypeFeatureDependencies, ru.dodopizza.app.di.modules.presentation.selectlocation.SelectLocationFeatureDependencies
        public Cdo j() {
            return (Cdo) jh8.d(this.g.j());
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public je4 k() {
            return (je4) jh8.d(this.g.k());
        }

        @Override // com.dodopizza.geo.feature.deliveryaddressmap.DeliveryAddressMapFeatureDependencies
        public x42 n() {
            return (x42) jh8.d(this.g.n());
        }

        @Override // com.dodopizza.onboarding.feature.chooseordertype.GeoChooseOrderTypeFeatureDependencies
        public com.dodopizza.onboarding.feature.chooseordertype.presentation.a n1() {
            return this.z.get();
        }

        @Override // com.dodopizza.order.feature.combinedmap.CombinedSelectionMapFeatureDependencies
        public la8 o2() {
            return (la8) jh8.d(this.g.a0());
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public wv5 p() {
            return (wv5) jh8.d(this.g.p());
        }

        @Override // com.dodopizza.geo.feature.deliveryaddressmap.DeliveryAddressMapFeatureDependencies
        public b7 p0() {
            return new b7((GeoApi) jh8.d(this.g.B0()));
        }

        @Override // com.dodopizza.onboarding.feature.selectcountry.SelectCountryDependencies
        public prb q0() {
            return (prb) jh8.d(this.g.q0());
        }

        @Override // com.dodopizza.geo.feature.deliveryaddressmap.DeliveryAddressMapFeatureDependencies
        public m52 r0() {
            return new m52((n52) jh8.d(this.g.r1()));
        }

        @Override // ru.dodopizza.app.di.modules.presentation.landing.smsinput.LandingSMSInputFeatureDependencies
        public LandingApi s1() {
            return (LandingApi) jh8.d(this.g.Z3());
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public n43 v() {
            return (n43) jh8.d(this.g.v());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.selectlocation.SelectLocationFeatureDependencies
        public bo x() {
            return (bo) jh8.d(this.g.x());
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies
        public e98 z() {
            return (e98) jh8.d(this.g.z());
        }

        @Override // com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsRouterFeatureDependencies
        public jz2 z3() {
            return this.G.get();
        }

        private OnboardingComponentImpl(OnboardingFeatureDependencies onboardingFeatureDependencies, OnboardingRouterFeatureDependencies onboardingRouterFeatureDependencies, h97 h97Var) {
            this.i = this;
            this.g = onboardingFeatureDependencies;
            this.h = h97Var;
            P2(onboardingFeatureDependencies, onboardingRouterFeatureDependencies, h97Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a implements OnboardingComponent.a {
        private OnboardingFeatureDependencies a;
        private OnboardingRouterFeatureDependencies b;
        private h97 c;

        private a() {
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingComponent.a
        public OnboardingComponent a() {
            jh8.a(this.a, OnboardingFeatureDependencies.class);
            jh8.a(this.b, OnboardingRouterFeatureDependencies.class);
            jh8.a(this.c, h97.class);
            return new OnboardingComponentImpl(this.a, this.b, this.c);
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingComponent.a
        /* renamed from: e */
        public a c(OnboardingFeatureDependencies onboardingFeatureDependencies) {
            this.a = (OnboardingFeatureDependencies) jh8.b(onboardingFeatureDependencies);
            return this;
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingComponent.a
        /* renamed from: f */
        public a b(OnboardingRouterFeatureDependencies onboardingRouterFeatureDependencies) {
            this.b = (OnboardingRouterFeatureDependencies) jh8.b(onboardingRouterFeatureDependencies);
            return this;
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingComponent.a
        /* renamed from: g */
        public a d(h97 h97Var) {
            this.c = (h97) jh8.b(h97Var);
            return this;
        }
    }

    public static OnboardingComponent.a a() {
        return new a();
    }
}
