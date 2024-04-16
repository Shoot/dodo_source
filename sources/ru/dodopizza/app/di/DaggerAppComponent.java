package ru.dodopizza.app.di;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.appsflyer.AppsFlyerLib;
import com.dodopizza.android.applicationstate.AppStateManager;
import com.dodopizza.checkout.CheckoutApi;
import com.dodopizza.core.domain.push.ServicePushApi;
import com.dodopizza.order.domain.assistant.AssistantApi;
import com.dodopizza.order.domain.halves.ProductTagsApi;
import com.dodopizza.order.feature.menu.ordertypeswitcher.OrderTypeSwitcherPresenter;
import com.dodopizza.orderhistory.domain.check.CheckApi;
import com.dodopizza.orderhistory.domain.orderhistory.OrderHistoryAPI;
import com.dodopizza.ospayments.PaymentsOSApi;
import com.dodopizza.persistence.entity.ServerDeltaTimeEntity;
import com.dodopizza.persistence.entity.address.AddressEntity;
import com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity;
import com.dodopizza.persistence.entity.menu.MenuItemEntity;
import com.dodopizza.persistence.entity.menu.ProductEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.facebook.flipper.plugins.network.FlipperOkhttpInterceptor;
import com.google.gson.Gson;
import defpackage.ap0;
import defpackage.d3a;
import defpackage.di3;
import defpackage.e68;
import defpackage.efb;
import defpackage.gt0;
import defpackage.ht7;
import defpackage.ib1;
import defpackage.ji1;
import defpackage.l48;
import defpackage.m38;
import defpackage.mn2;
import defpackage.mx2;
import defpackage.ni0;
import defpackage.o8;
import defpackage.q6a;
import defpackage.qd6;
import defpackage.sl5;
import defpackage.wo2;
import defpackage.xb;
import defpackage.y7;
import defpackage.yh5;
import defpackage.yk6;
import defpackage.ym;
import defpackage.z46;
import defpackage.zg1;
import defpackage.zh5;
import im.threads.business.controllers.UnreadMessagesController;
import im.threads.business.core.UnreadMessagesCountListener;
import im.threads.ui.ChatCenterPushMessageHelper;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.ConfigBuilder;
import im.threads.ui.core.ThreadsLib;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import retrofit2.Retrofit;
import ru.dodopizza.app.di.AppComponent;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.domain.DodopizzaApi;
import ru.dodopizza.app.domain.blockstore.AuthorizationBlockStoreDataSource;
import ru.dodopizza.app.domain.blockstore.BaseUrlBlockStoreDataSource;
import ru.dodopizza.app.domain.blockstore.FeatureBlockStoreDataSource;
import ru.dodopizza.app.domain.blockstore.LocalityBlockStoreDataSource;
import ru.dodopizza.app.domain.blockstore.WorkflowIdBlockStoreDataSource;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.app.domain.locality.LocalityServiceImpl;
import ru.dodopizza.app.domain.menu.promo.PromoActionsRepository;
import ru.dodopizza.app.domain.menu.promo.PromoActionsService;
import ru.dodopizza.app.presentation.addresslist.AddressListPresenter;
import ru.dodopizza.app.presentation.allpizzerias.AllPizzeriasPresenter;
import ru.dodopizza.app.presentation.catchaddress.presenter.CatchAddressPresenter;
import ru.dodopizza.app.presentation.collaboration.CollaborationPromoPresenter;
import ru.dodopizza.app.presentation.contacts.ContactsPresenter;
import ru.dodopizza.app.presentation.covid.CovidWarningPresenter;
import ru.dodopizza.app.presentation.debugtools.DebugPreferencePresenter;
import ru.dodopizza.app.presentation.debugtools.a;
import ru.dodopizza.app.presentation.deliveryaddressform.DeliveryAddressPresenter;
import ru.dodopizza.app.presentation.entername.EnterNamePresenter;
import ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter;
import ru.dodopizza.app.presentation.mainscreen.MainScreenPresenter;
import ru.dodopizza.app.presentation.payment.WebViewCardPaymentPresenter;
import ru.dodopizza.app.presentation.payment.card.CardPaymentPresenter;
import ru.dodopizza.app.presentation.payment.card.secure3d.Secure3dPresenter;
import ru.dodopizza.app.presentation.paymentbrokendialog.PaymentWorkflowBrokenPresenter;
import ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter;
import ru.dodopizza.app.presentation.phonenumberlogin.e;
import ru.dodopizza.app.presentation.phonenumberlogin.phoneprefixlist.PhonePrefixListPresenter;
import ru.dodopizza.app.presentation.pincodelogin.PinCodeLoginPresenter;
import ru.dodopizza.app.presentation.product.card.combo.BuyMorePresenter;
import ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter;
import ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderPresenter;
import ru.dodopizza.app.presentation.search.SearchPresenter;
import ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter;
import ru.dodopizza.app.presentation.selectordertype.SelectOrderTypePresenter;
import ru.dodopizza.app.presentation.splash.SplashActivityPresenter;
import ru.dodopizza.app.presentation.temporarilyblock.presenter.TemporarilyBlockPresenter;
import ru.dodopizza.backend.domain.authorization.AuthorizationAPI;
import ru.dodopizza.backend.domain.bonus.BonusActionApi;
import ru.dodopizza.backend.domain.bonus.EasyBonusApi;
import ru.dodopizza.backend.domain.cart.CartAPI;
import ru.dodopizza.backend.domain.checkout.CheckoutAPI;
import ru.dodopizza.backend.domain.clientcard.ClientCardAPI;
import ru.dodopizza.backend.domain.controlling.MysteryShopperCheckupApi;
import ru.dodopizza.backend.domain.controlling.OrderRatingAPI;
import ru.dodopizza.backend.domain.controlling.RnDigitalApi;
import ru.dodopizza.backend.domain.country.CountryApi;
import ru.dodopizza.backend.domain.covid.CovidApi;
import ru.dodopizza.backend.domain.customer.CustomerAPI;
import ru.dodopizza.backend.domain.geo.GeoApi;
import ru.dodopizza.backend.domain.inapp.InAppNotificationApi;
import ru.dodopizza.backend.domain.landing.LandingApi;
import ru.dodopizza.backend.domain.locality.LocalityAPI;
import ru.dodopizza.backend.domain.loyalty.LoyaltyApi;
import ru.dodopizza.backend.domain.menu.BuyMoreAPI;
import ru.dodopizza.backend.domain.menu.MenuAPI;
import ru.dodopizza.backend.domain.order.OrderApi;
import ru.dodopizza.backend.domain.payment.PaymentAPI;
import ru.dodopizza.backend.domain.payment.dto.sbp.SbpBankListAPI;
import ru.dodopizza.backend.domain.pizzeria.PizzeriaAPI;
import ru.dodopizza.backend.domain.servertime.ServerTimeApi;
import ru.dodopizza.backend.domain.state.WorkflowApi;
import ru.dodopizza.backend.domain.stories.StoriesApi;
import ru.dodopizza.backend.domain.upload.UploadAPI;
/* loaded from: classes3.dex */
public final class DaggerAppComponent {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class AppComponentImpl implements AppComponent {
        private as8<ry1> A;
        private as8<oh5> A0;
        private as8<rm> A1;
        private as8<fy7> A2;
        private as8<my7> A3;
        private as8<ot5> A4;
        private as8<y7a> A5;
        private as8<WorkflowIdBlockStoreDataSource> B;
        private as8<vjb> B0;
        private as8<Boolean> B1;
        private as8<wv5> B2;
        private as8<cz4> B3;
        private as8<nt5> B4;
        private as8<wt9> B5;
        private as8<cva> C;
        private as8<yjb> C0;
        private as8<tw7> C1;
        private as8<wh5> C2;
        private as8<ServerTimeApi> C3;
        private as8<kt5> C4;
        private as8<SbpBankListAPI> C5;
        private as8<f8c> D;
        private as8<ld9> D0;
        private as8<ug7> D1;
        private as8<zh5.a> D2;
        private as8<sgb> D3;
        private as8<rt5> D4;
        private as8<ep4> D5;
        private as8<BaseUrlBlockStoreDataSource> E;
        private as8<gy3> E0;
        private as8<vg7> E1;
        private as8<yh5.b> E2;
        private as8<gk2<ServerDeltaTimeEntity>> E3;
        private as8<x42> E4;
        private as8<we6> E5;
        private as8<q80> F;
        private as8<iq3> F0;
        private as8<ip4> F1;
        private as8<xv3> F2;
        private as8<ida> F3;
        private as8<bo> F4;
        private as8<pe6> F5;
        private as8<tj3> G;
        private as8<hq3> G0;
        private as8<jp3> G1;
        private as8<cz3> G2;
        private as8<f5b> G3;
        private as8<jgb> G4;
        private as8<yg6> G5;
        private as8<yj3> H;
        private as8<x23> H0;
        private as8<gk2<MenuItemEntity>> H1;
        private as8<xc> H2;
        private as8<uda> H3;
        private as8<zl5> H4;
        private as8<ee6> H5;
        private as8<xj3> I;
        private as8<oq0> I0;
        private as8<mxa> I1;
        private as8<wc> I2;
        private as8<v52> I3;
        private as8<pgb> I4;
        private as8<ds0> I5;
        private as8<s80> J;
        private as8<o63> J0;
        private as8<xf6> J1;
        private as8<y69> J2;
        private as8<t28> J3;
        private as8<lg7> J4;
        private as8<sq0> J5;
        private as8<Gson> K;
        private as8<bq> K0;
        private as8<zf6> K1;
        private as8<ny1> K2;
        private as8<y27> K3;
        private as8<an> K4;
        private as8<nz4> K5;
        private as8<AuthorizationBlockStoreDataSource> L;
        private as8<ko5> L0;
        private as8<be6<qd6.e>> L1;
        private as8<bv0> L2;
        private as8<UnreadMessagesController> L3;
        private as8<AssistantApi> L4;
        private as8<ProductTagsApi> L5;
        private as8<e00> M;
        private as8<xu8> M0;
        private as8<be6<qd6.f>> M1;
        private as8<qj6> M2;
        private as8<kfb> M3;
        private as8<yv> M4;
        private as8<qm8> M5;
        private as8<jv5> N;
        private as8<ih6> N0;
        private as8<be6<qd6>> N1;
        private as8<sn2> N2;
        private ffb N3;
        private as8<kq0> N4;
        private as8<aub> N5;
        private as8<i60> O;
        private as8<CountryApi> O0;
        private as8<xd6<qd6.e>> O1;
        private as8<rn2> O2;
        private as8<efb.b> O3;
        private as8<gk2<ShoppingInfoEntity>> O4;
        private as8<df4> O5;
        private as8<s13> P;
        private as8<el9> P0;
        private as8<xd6<qd6.f>> P1;
        private as8<uk6> P2;
        private as8<ChatCenterPushMessageHelper> P3;
        private as8<gk2<ProductEntity>> P4;
        private as8<v28> P5;
        private as8<wl5> Q;
        private as8<cy1> Q0;
        private as8<xd6<qd6>> Q1;
        private as8<tk6> Q2;
        private as8<hfb> Q3;
        private as8<yl8> Q4;
        private as8<r28> Q5;
        private as8<ko> R;
        private as8<by1> R0;
        private as8<je6> R1;
        private as8<wk6> R2;
        private as8<WorkflowApi> R3;
        private as8<uja> R4;
        private as8<GeoApi> R5;
        private as8<jo> S;
        private as8<c63> S0;
        private as8<je6> S1;
        private zk6 S2;
        private as8<LandingApi> S3;
        private as8<ns> S4;
        private as8<re4> S5;
        private as8<i32> T;
        private as8<ly1> T0;
        private as8<me6> T1;
        private as8<yk6.a> T2;
        private as8<jj5> T3;
        private as8<wt6> T4;
        private as8<ej6> T5;
        private as8<hn4> U;
        private as8<CountryService> U0;
        private as8<ne6> U1;
        private as8<dl6> U2;
        private as8<uk5> U3;
        private as8<k31> U4;
        private as8<j2c> U5;
        private as8<Retrofit> V;
        private as8<n52> V0;
        private as8<fi7> V1;
        private as8<ok6> V2;
        private as8<nl5> V3;
        private as8<ze7> V4;
        private as8<mk6> V5;
        private as8<AuthorizationAPI> W;
        private as8<ljb> W0;
        private as8<h08> W1;
        private as8<n07> W2;
        private as8<ml5> W3;
        private as8<fe7> W4;
        private as8<kz4> W5;
        private as8<b00> X;
        private as8<de9> X0;
        private as8<v06> X1;
        private as8<qx1> X2;
        private as8<m28> X3;
        private as8<j69> X4;
        private as8<h7> X5;
        private as8<gc> Y;
        private as8<c62> Y0;
        private as8<u16> Y1;
        private as8<ru.dodopizza.app.presentation.main.a> Y2;
        private as8<py1> Y3;
        private as8<UploadAPI> Y4;
        private as8<zja> Y5;
        private as8<pq> Z;
        private as8<gk2<AddressEntity>> Z0;
        private as8<bb1> Z1;
        private as8<iq> Z2;
        private as8<pl5> Z3;
        private as8<ku3> Z4;
        private as8<k63> a0;
        private as8<gk2<ClientDeliveryLocationProfileEntity>> a1;
        private as8<tb9> a2;
        private as8<kq> a3;
        private as8<CustomerAPI> a4;
        private as8<wo1> a5;
        private as8<g00> b0;
        private as8<v42> b1;
        private as8<eua> b2;
        private as8<FeatureBlockStoreDataSource> b3;
        private as8<j9a> b4;
        private as8<k69> b5;
        private as8<v53> c0;
        private as8<sr0> c1;
        private as8<dua> c2;
        private as8<pd0> c3;
        private as8<y42> c4;
        private as8<tg4> c5;
        private as8<i00> d0;
        private as8<rr0> d1;
        private as8<kx1> d2;
        private as8<prb> d3;
        private as8<lfa> d4;
        private as8<fq0> d5;
        private as8<ServicePushApi> e0;
        private as8<as0> e1;
        private as8<gy5> e2;
        private as8<n80> e3;
        private as8<sl5.a> e4;
        private as8<ClientCardAPI> e5;
        private as8<ut8> f0;
        private as8<DodopizzaApi> f1;
        private as8<mqb> f2;
        private as8<dq3> f3;
        private as8<i7> f4;
        private as8<xv7> f5;
        private final m15 g;
        private as8<com.dodopizza.core.domain.push.a> g0;
        private as8<fda> g1;
        private as8<zz> g2;
        private as8<nd0> g3;
        private as8<ia8> g4;
        private as8<PaymentAPI> g5;
        private final Application h;
        private as8<xda> h0;
        private as8<iq0> h1;
        private as8<tv6> h2;
        private as8<hp> h3;
        private as8<na8> h4;
        private as8<p80> h5;
        private final tg9 i;
        private as8<vc6> i0;
        private as8<hq0> i1;
        private as8<d32> i2;
        private as8<Cdo> i3;
        private as8<pa8> i4;
        private as8<b77> i5;
        private final AppComponentImpl j;
        private as8<ava> j0;
        private as8<hua> j1;
        private as8<nka> j2;
        private as8<wo> j3;
        private as8<PizzeriaAPI> j4;
        private as8<PaymentsOSApi> j5;
        private as8<androidx.lifecycle.d> k;
        private as8<htb> k0;
        private as8<gua> k1;
        private as8<ska> k2;
        private as8<ih> k3;
        private as8<bia> k4;
        private as8<ub3> k5;
        private as8<AppStateManager> l;
        private as8<btb> l0;
        private as8<nw7> l1;
        private as8<bo0> l2;
        private as8<oeb> l3;
        private as8<f98> l4;
        private as8<b77> l5;
        private as8<AppsFlyerLib> m;
        private as8<ktb> m0;
        private as8<xg4> m1;
        private as8<qo0> m2;
        private as8<jfb> m3;
        private as8<e98> m4;
        private as8<CheckoutApi> m5;
        private as8<mh0> n;
        private as8<tsb> n0;
        private as8<ow7> n1;
        private as8<eo0> n2;
        private as8<UnreadMessagesCountListener> n3;
        private as8<pv9> n4;
        private as8<b77> n5;
        private as8<Application> o;
        private as8<cs0> o0;
        private as8<it7> o1;
        private as8<hc> o2;
        private as8<ConfigBuilder> o3;
        private as8<r43> o4;
        private as8<xb.a> o5;
        private as8<Context> p;
        private as8<ul0> p0;
        private as8<qw7> p1;
        private as8<no0> p2;
        private as8<ChatStyle> p3;
        private as8<ew5> p4;
        private as8<q4> p5;
        private as8<b79> q;
        private as8<ml0> q0;
        private as8<sp0> q1;
        private as8<yt4> q2;
        private as8<ThreadsLib> q3;
        private as8<je4> q4;
        private as8<at7> q5;
        private as8<f89> r;
        private as8<a98> r0;
        private as8<fh4> r1;
        private as8<wt4> r2;
        private as8<bfb> r3;
        private as8<n43> r4;
        private as8<qh3> r5;
        private as8<jk2> s;
        private as8<fs0> s0;
        private as8<kh4> s1;
        private as8<li9> s2;
        private as8<f63> s3;
        private as8<fv0> s4;
        private as8<sh3> s5;
        private as8<ci8> t;
        private as8<ija> t0;
        private as8<zg4> t1;
        private as8<mi9> t2;
        private as8<dv6> t3;
        private as8<mh8> t4;
        private as8<w65> t5;
        private as8<ht5> u;
        private as8<HashMap<String, List<bq3>>> u0;
        private as8<dh4> u1;
        private as8<FlipperOkhttpInterceptor> u2;
        private as8<CartAPI> u3;
        private as8<l6a> u4;
        private as8<me8> u5;
        private as8<ih4> v;
        private as8<fq3> v0;
        private as8<Collection<String>> v1;
        private as8<Resources> v2;
        private as8<vr0> v3;
        private as8<sh5> v4;
        private as8<q56> v5;
        private as8<ld0> w;
        private as8<yhb> w0;
        private as8<kw7> w1;
        private as8<LocalityAPI> w2;
        private as8<ur0> w3;
        private as8<Retrofit> w4;
        private as8<s56> w5;
        private as8<LocalityBlockStoreDataSource> x;
        private as8<zc9> x0;
        private as8<PackageManager> x1;
        private as8<LocalityServiceImpl> x2;
        private as8<xr0> x3;
        private as8<th5> x4;
        private as8<vo0> x5;
        private as8<ev5> y;
        private as8<ji5> y0;
        private as8<cu9> y1;
        private as8<nh5> y2;
        private as8<sg4> y3;
        private as8<r68> y4;
        private as8<ew7> y5;
        private as8<dv5> z;
        private as8<ai5> z0;
        private as8<ut9> z1;
        private as8<hy7> z2;
        private as8<ug4> z3;
        private as8<ru.dodopizza.app.presentation.pincodelogin.d> z4;
        private as8<CheckoutAPI> z5;

        /* JADX INFO: Access modifiers changed from: private */
        public es6 A7() {
            return wv1.a(y7(), z7());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public jc7 B7() {
            return yv1.a(C7());
        }

        private lc7 C7() {
            return zv1.a(this.G0.get());
        }

        private OrderRatingAPI D7() {
            return aw1.a(this.V.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ah7 E7() {
            return bw1.a(F7());
        }

        private ch7 F7() {
            return cw1.a(this.G0.get());
        }

        private gk7 G7() {
            return zs8.a(h7());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public x49 H7() {
            return dw1.a(this.t.get());
        }

        private m69 I7() {
            return gw1.a(this.s.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public o69 J7() {
            return hw1.a(D7(), I7());
        }

        private RnDigitalApi K7() {
            return iw1.a(this.V.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public en9 L7() {
            return jw1.a(K7(), this.G0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public bu9 M7() {
            return wv7.a(this.g5.get(), hv7.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public vm g7() {
            return bv7.a(this.g5.get(), gv7.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public eb0 h7() {
            return nv1.a(i7());
        }

        private gb0 i7() {
            return ov1.a(this.G0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public cs1 j7() {
            return pv1.a(k7());
        }

        private ds1 k7() {
            return qv1.a(this.G0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public pz1 l7() {
            return rv1.a(m7());
        }

        private rz1 m7() {
            return sv1.a(this.G0.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public tz1 n7() {
            return tv1.a(D7());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c63 o7() {
            return uu1.c(this.p.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public xj3 p7() {
            return wj3.c(this.H.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public df4 q7() {
            return sp.c(this.i0.get());
        }

        private void s7(qk8 qk8Var, gl9 gl9Var, vu6 vu6Var, tg9 tg9Var, m15 m15Var, rz rzVar, p43 p43Var, Application application, tj3 tj3Var) {
            as8<androidx.lifecycle.d> a = p63.a(sk8.a(qk8Var));
            this.k = a;
            this.l = p63.a(fp.a(a));
            this.m = p63.a(nq.a());
            this.n = p63.a(ph0.a());
            no3 a2 = z45.a(application);
            this.o = a2;
            this.p = p63.a(mu1.a(a2));
            this.q = p63.a(dp2.a());
            this.r = p63.a(kl2.a());
            this.s = p63.a(nm2.a());
            this.t = p63.a(ll2.a(this.p));
            this.u = p63.a(su5.a());
            as8<ih4> a3 = p63.a(x15.a(m15Var, this.p));
            this.v = a3;
            as8<ld0> a4 = p63.a(md0.a(this.p, a3));
            this.w = a4;
            this.x = ft5.a(a4);
            as8<ev5> a5 = p63.a(vu5.a(this.u));
            this.y = a5;
            this.z = p63.a(wu5.a(this.s, this.t, this.u, this.x, a5));
            this.A = p63.a(pu5.a(this.s));
            as8<WorkflowIdBlockStoreDataSource> a6 = p63.a(e8c.a(this.w));
            this.B = a6;
            as8<cva> a7 = p63.a(zh9.a(tg9Var, this.r, this.z, this.A, a6));
            this.C = a7;
            this.D = p63.a(fi9.a(tg9Var, a7));
            as8<BaseUrlBlockStoreDataSource> a8 = p63.a(m80.a(this.w));
            this.E = a8;
            this.F = p63.a(r80.a(this.t, a8));
            no3 a9 = z45.a(tj3Var);
            this.G = a9;
            as8<yj3> a10 = p63.a(zj3.a(a9));
            this.H = a10;
            wj3 a11 = wj3.a(a10);
            this.I = a11;
            this.J = p63.a(t80.a(this.n, this.F, a11));
            this.K = p63.a(il2.a());
            as8<AuthorizationBlockStoreDataSource> a12 = p63.a(xz.a(this.w));
            this.L = a12;
            this.M = p63.a(f00.a(this.t, a12));
            this.N = new bu2();
            as8<i60> a13 = p63.a(el2.a(this.p));
            this.O = a13;
            this.P = p63.a(hl2.a(this.o, a13));
            this.Q = p63.a(b25.a(m15Var, this.t));
            as8<ko> a14 = p63.a(lo.a(this.p));
            this.R = a14;
            q15 a15 = q15.a(m15Var, a14);
            this.S = a15;
            as8<i32> a16 = p63.a(u15.a(m15Var, this.Q, a15));
            this.T = a16;
            this.U = in4.a(this.r, this.M, this.N, this.P, this.n, a16);
            bu2 bu2Var = new bu2();
            this.V = bu2Var;
            this.W = p63.a(hl9.a(gl9Var, bu2Var));
            this.X = p63.a(sz.a(rzVar));
            this.Y = new bu2();
            this.Z = p63.a(oq.a(this.m, this.p));
            as8<k63> a17 = p63.a(dh9.a(tg9Var));
            this.a0 = a17;
            as8<g00> a18 = p63.a(h00.a(this.W, this.X, this.Y, this.Z, this.M, a17));
            this.b0 = a18;
            as8<v53> a19 = p63.a(ch9.a(tg9Var, this.N, a18));
            this.c0 = a19;
            this.d0 = p63.a(tz.a(rzVar, a19));
            this.e0 = p63.a(at8.a(this.V));
            as8<ut8> a20 = p63.a(ws8.a(this.p));
            this.f0 = a20;
            as8<com.dodopizza.core.domain.push.a> a21 = p63.a(yda.a(this.e0, a20, this.d0, this.t));
            this.g0 = a21;
            this.h0 = bt8.a(a21);
            this.i0 = p63.a(jl2.a());
            this.j0 = p63.a(yh9.a(tg9Var, this.C));
            this.k0 = p63.a(ei9.a(tg9Var, this.s));
            as8<btb> a22 = p63.a(ci9.a(tg9Var));
            this.l0 = a22;
            as8<ktb> a23 = p63.a(di9.a(tg9Var, this.k0, a22));
            this.m0 = a23;
            this.n0 = p63.a(bi9.a(tg9Var, a23));
            this.o0 = p63.a(wg9.a(tg9Var, this.c0));
            as8<ul0> a24 = p63.a(gl2.a(this.s));
            this.p0 = a24;
            as8<ml0> a25 = p63.a(fl2.a(a24));
            this.q0 = a25;
            as8<a98> a26 = p63.a(za8.a(a25));
            this.r0 = a26;
            this.s0 = p63.a(jr0.a(a26));
            this.t0 = p63.a(lr0.a());
            this.u0 = p63.a(yp3.a());
            this.v0 = p63.a(vp3.a(this.s));
            this.w0 = p63.a(zp3.a(this.p));
            this.x0 = p63.a(d25.a(m15Var, this.n));
            as8<ji5> a27 = p63.a(hi5.a(this.p));
            this.y0 = a27;
            as8<ai5> a28 = p63.a(gi5.a(a27, this.v));
            this.z0 = a28;
            as8<oh5> a29 = p63.a(di5.a(this.p, a28));
            this.A0 = a29;
            as8<vjb> a30 = p63.a(j25.a(m15Var, a29));
            this.B0 = a30;
            as8<yjb> a31 = p63.a(k25.a(m15Var, a30));
            this.C0 = a31;
            as8<ld9> a32 = p63.a(e25.a(m15Var, this.x0, a31, this.n));
            this.D0 = a32;
            as8<gy3> a33 = p63.a(xp3.a(a32));
            this.E0 = a33;
            jq3 a34 = jq3.a(this.u0, this.v0, this.A, this.w0, this.n, a33);
            this.F0 = a34;
            as8<hq3> a35 = p63.a(wp3.a(a34));
            this.G0 = a35;
            as8<x23> a36 = p63.a(bh9.a(tg9Var, a35));
            this.H0 = a36;
            this.I0 = p63.a(vg9.a(tg9Var, a36));
            as8<o63> a37 = p63.a(eh9.a(tg9Var, this.c0));
            this.J0 = a37;
            as8<bq> a38 = p63.a(sh9.a(tg9Var, this.a0, a37));
            this.K0 = a38;
            this.L0 = p63.a(xg9.a(tg9Var, this.o0, this.s0, this.t0, this.I0, a38));
            as8<xu8> a39 = p63.a(ml2.a(this.i0));
            this.M0 = a39;
            this.N0 = p63.a(mh9.a(tg9Var, a39));
            this.O0 = p63.a(kl9.a(gl9Var, this.V));
            bu2 bu2Var2 = new bu2();
            this.P0 = bu2Var2;
            dy1 a40 = dy1.a(bu2Var2);
            this.Q0 = a40;
            this.R0 = ll9.a(gl9Var, a40);
            this.S0 = uu1.a(this.p);
            this.T0 = p63.a(nu5.a(this.w0));
            this.U0 = p63.a(xy1.a(this.O0, this.R0, this.A, this.S0, ky1.a(), this.T0, this.n));
            this.V0 = zg9.a(tg9Var, this.t);
            this.W0 = p63.a(b62.a());
            as8<de9> a41 = p63.a(a62.a());
            this.X0 = a41;
            this.Y0 = p63.a(z52.a(this.W0, a41));
            this.Z0 = p63.a(b52.a(this.s));
            as8<gk2<ClientDeliveryLocationProfileEntity>> a42 = p63.a(c52.a(this.s));
            this.a1 = a42;
            this.b1 = p63.a(d52.a(this.Z0, a42));
            as8<sr0> a43 = p63.a(er0.a(this.H0));
            this.c1 = a43;
            as8<rr0> a44 = p63.a(dr0.a(this.s, a43));
            this.d1 = a44;
            this.e1 = p63.a(hr0.a(a44, this.a0));
            this.f1 = p63.a(nl9.a(gl9Var, this.V));
        }

        private void t7(qk8 qk8Var, gl9 gl9Var, vu6 vu6Var, tg9 tg9Var, m15 m15Var, rz rzVar, p43 p43Var, Application application, tj3 tj3Var) {
            as8<fda> a = p63.a(nda.a());
            this.g1 = a;
            as8<iq0> a2 = p63.a(jq0.a(a));
            this.h1 = a2;
            ug9 a3 = ug9.a(tg9Var, a2);
            this.i1 = a3;
            as8<hua> a4 = p63.a(iua.a(a3, this.g1));
            this.j1 = a4;
            this.k1 = xh9.a(tg9Var, a4);
            this.l1 = p63.a(nv7.a());
            as8<xg4> a5 = p63.a(vu7.a());
            this.m1 = a5;
            this.n1 = p63.a(ov7.a(this.l1, a5));
            this.o1 = p63.a(jv7.a());
            this.p1 = p63.a(pv7.a(this.s, this.n1));
            this.q1 = p63.a(nu7.a(this.s));
            this.r1 = p63.a(zu7.a(this.p));
            this.s1 = p63.a(xu7.a());
            as8<zg4> a6 = p63.a(wu7.a());
            this.t1 = a6;
            this.u1 = p63.a(yu7.a(this.r1, this.s1, a6));
            as8<Collection<String>> a7 = p63.a(hu7.a());
            this.v1 = a7;
            this.w1 = p63.a(mv7.a(a7));
            qu1 a8 = qu1.a(this.p);
            this.x1 = a8;
            tv7 a9 = tv7.a(a8);
            this.y1 = a9;
            this.z1 = uv7.a(this.G0, a9);
            this.A1 = lu7.a(this.G0);
            as8<Boolean> a10 = p63.a(ev7.a());
            this.B1 = a10;
            this.C1 = p63.a(qv7.a(this.p1, this.q1, this.u1, this.w1, this.z1, this.A1, a10));
            as8<ug7> a11 = p63.a(wua.a(this.a0, this.r0));
            this.D1 = a11;
            this.E1 = p63.a(xua.a(a11));
            this.F1 = p63.a(hh9.a(tg9Var, this.M0));
            this.G1 = p63.a(fh9.a(tg9Var, this.q0));
            this.H1 = p63.a(kh9.a(tg9Var, this.s));
            this.I1 = p63.a(ai9.a(tg9Var, this.j0));
            ph9 a12 = ph9.a(tg9Var, this.g1);
            this.J1 = a12;
            as8<zf6> a13 = p63.a(fg6.a(this.j0, a12));
            this.K1 = a13;
            this.L1 = p63.a(jg6.a(a13));
            as8<be6<qd6.f>> a14 = p63.a(lg6.a(this.G0, this.K1));
            this.M1 = a14;
            this.N1 = p63.a(dg6.a(this.L1, a14));
            this.O1 = p63.a(ig6.a(this.K1));
            as8<xd6<qd6.f>> a15 = p63.a(kg6.a(this.G0, this.K1));
            this.P1 = a15;
            as8<xd6<qd6>> a16 = p63.a(cg6.a(this.O1, a15));
            this.Q1 = a16;
            this.R1 = p63.a(hg6.a(this.N1, a16));
            as8<je6> a17 = p63.a(gg6.a());
            this.S1 = a17;
            as8<me6> a18 = p63.a(eg6.a(this.G0, this.R1, a17));
            this.T1 = a18;
            this.U1 = p63.a(lh9.a(tg9Var, this.H1, this.I1, a18));
            this.V1 = p63.a(nh9.a(tg9Var, this.q0));
            this.W1 = p63.a(oh9.a(tg9Var, this.q0));
            this.X1 = p63.a(ih9.a(tg9Var, this.t, this.q0));
            this.Y1 = p63.a(jh9.a(tg9Var, this.q0));
            this.Z1 = p63.a(yg9.a(tg9Var, this.q0));
            as8<tb9> a19 = p63.a(th9.a(tg9Var, this.q0));
            this.a2 = a19;
            as8<eua> a20 = p63.a(fua.a(this.i0, this.D, this.j0, this.m0, this.n0, this.L0, this.N0, this.U0, this.N, this.c0, this.b0, this.a0, this.V0, this.Y0, this.b1, this.e1, this.f1, this.k1, this.n1, this.o1, this.C1, this.E1, this.G0, this.F1, this.G1, this.U1, this.V1, this.Y, this.K0, this.W1, this.X1, this.Y1, this.Z1, a19));
            this.b2 = a20;
            this.c2 = wh9.a(tg9Var, a20);
            y15 a21 = y15.a(m15Var);
            this.d2 = a21;
            as8<gy5> a22 = p63.a(hy5.a(this.d0, this.h0, this.c2, a21));
            this.e2 = a22;
            as8<mqb> a23 = p63.a(nqb.a(this.d0, a22, this.d2));
            this.f2 = a23;
            this.g2 = a00.a(a23);
            this.h2 = uv6.a(this.i0, this.p, this.N);
            this.i2 = e32.a(this.T);
            as8<nka> a24 = p63.a(g25.a(m15Var, this.p));
            this.j2 = a24;
            this.k2 = tka.a(a24);
            as8<bo0> a25 = p63.a(io0.a());
            this.l2 = a25;
            this.m2 = p63.a(ho0.b(a25));
            this.n2 = p63.a(fo0.a(this.K));
            as8<hc> a26 = p63.a(ic.a(this.Y));
            this.o2 = a26;
            this.p2 = p63.a(jo0.a(this.m2, this.n2, a26));
            as8<yt4> a27 = p63.a(pl9.a(gl9Var));
            this.q2 = a27;
            this.r2 = xt4.a(this.n, a27);
            as8<li9> a28 = p63.a(oi9.a());
            this.s2 = a28;
            this.t2 = ni9.a(a28);
            this.u2 = ol9.a(gl9Var);
            vu1 a29 = vu1.a(this.p);
            this.v2 = a29;
            bu2.a(this.P0, p63.a(fl9.a(this.J, this.n, this.K, this.U, this.g2, this.h2, this.i2, this.k2, this.p2, this.r2, this.t2, this.P, this.u2, a29)));
            bu2.a(this.V, p63.a(ul9.a(gl9Var, this.P0)));
            as8<LocalityAPI> a30 = p63.a(ql9.a(gl9Var, this.V));
            this.w2 = a30;
            as8<LocalityServiceImpl> a31 = p63.a(kv5.a(a30, this.z, this.S0, this.n, this.C0));
            this.x2 = a31;
            bu2.a(this.N, xu5.a(a31));
            this.y2 = p63.a(z15.a(m15Var, this.N));
            as8<hy7> a32 = p63.a(su1.a());
            this.z2 = a32;
            as8<fy7> a33 = p63.a(ru1.a(a32));
            this.A2 = a33;
            as8<wv5> a34 = p63.a(ou1.a(a33));
            this.B2 = a34;
            this.C2 = p63.a(xh5.a(this.D, this.y2, this.V0, this.Z, this.J, this.j0, a34, this.T, this.p));
            as8<zh5.a> a35 = p63.a(ci5.a(this.D0));
            this.D2 = a35;
            this.E2 = a25.a(m15Var, this.D0, a35);
            this.F2 = v15.a(m15Var, this.N);
            w15 a36 = w15.a(m15Var);
            this.G2 = a36;
            as8<xc> a37 = p63.a(yc.a(this.p, this.n, this.C2, this.E2, this.A0, this.F2, a36));
            this.H2 = a37;
            o15 a38 = o15.a(m15Var, a37);
            this.I2 = a38;
            bu2.a(this.Y, p63.a(n15.a(m15Var, a38, this.G0)));
            this.J2 = p63.a(z69.a());
            as8<ny1> a39 = p63.a(bt5.a(this.Q, this.A));
            this.K2 = a39;
            this.L2 = p63.a(cv0.a(this.j0, this.E1, this.Y0, this.z, this.r0, this.c2, this.o0, this.e1, this.N, this.Q, a39));
            this.M2 = rj6.a(this.n);
            as8<sn2> a40 = p63.a(tn2.a(this.n, this.u2));
            this.N2 = a40;
            rl9 a41 = rl9.a(gl9Var, a40);
            this.O2 = a41;
            this.P2 = vk6.a(a41);
            this.Q2 = bl6.a(this.p);
            xk6 a42 = xk6.a(this.p, this.K);
            this.R2 = a42;
            zk6 a43 = zk6.a(this.P2, this.Q2, a42, this.n);
            this.S2 = a43;
            as8<yk6.a> b = al6.b(a43);
            this.T2 = b;
            fl6 a44 = fl6.a(this.M2, b);
            this.U2 = a44;
            this.V2 = p63.a(pk6.a(a44, this.N, this.U0, this.d2));
            this.W2 = p63.a(o07.a(this.p));
            this.X2 = p63.a(rk8.a(qk8Var));
        }

        private void u7(qk8 qk8Var, gl9 gl9Var, vu6 vu6Var, tg9 tg9Var, m15 m15Var, rz rzVar, p43 p43Var, Application application, tj3 tj3Var) {
            this.Y2 = p63.a(c79.a(this.Y, this.J2, this.L2, this.V2, this.W2, this.X2, this.d2));
            as8<iq> a = p63.a(jq.a(hq.a(), this.q, this.Y2));
            this.Z2 = a;
            this.a3 = p63.a(lq.a(this.m, this.n, this.p, a));
            as8<FeatureBlockStoreDataSource> a2 = p63.a(aq3.a(this.w));
            this.b3 = a2;
            this.c3 = p63.a(qd0.a(this.v, a2));
            as8<prb> a3 = p63.a(qrb.a(this.U0, this.J, this.d2));
            this.d3 = a3;
            this.e3 = p63.a(o80.a(this.N, this.U0, this.J, this.c3, a3, this.d2));
            as8<dq3> a4 = p63.a(eq3.a(this.G0, this.n, this.N, this.d2));
            this.f3 = a4;
            this.g3 = p63.a(od0.a(this.c3, this.N, this.b0, a4, this.C, this.d2, this.X2));
            as8<hp> a5 = p63.a(r15.a(m15Var, this.l));
            this.h3 = a5;
            as8<Cdo> a6 = p63.a(eo.a(this.e3, this.g3, a5, this.X2));
            this.i3 = a6;
            this.j3 = p63.a(xo.a(this.l, this.a3, a6, this.X2));
            as8<ih> a7 = p63.a(p15.a(m15Var, this.T));
            this.k3 = a7;
            this.l3 = p63.a(veb.a(a7));
            as8<jfb> a8 = p63.a(xeb.a());
            this.m3 = a8;
            as8<UnreadMessagesCountListener> a9 = p63.a(yeb.a(a8));
            this.n3 = a9;
            this.o3 = p63.a(ueb.a(this.p, this.n, this.l3, a9));
            this.p3 = p63.a(teb.a());
            as8<ThreadsLib> a10 = p63.a(seb.a());
            this.q3 = a10;
            this.r3 = p63.a(cfb.a(this.o3, this.p3, a10));
            this.s3 = p63.a(zu6.a(vu6Var));
            this.t3 = p63.a(wu6.a(vu6Var));
            as8<CartAPI> a11 = p63.a(zq0.a(this.V));
            this.u3 = a11;
            as8<vr0> a12 = p63.a(wr0.a(a11, this.D, this.c2, this.G0, this.e1));
            this.v3 = a12;
            fr0 a13 = fr0.a(a12);
            this.w3 = a13;
            this.x3 = p63.a(gr0.a(a13, this.e1));
            as8<sg4> a14 = p63.a(tu7.a());
            this.y3 = a14;
            this.z3 = p63.a(uu7.a(a14));
            this.A3 = p63.a(tu1.a(this.z2));
            this.B3 = p63.a(dz4.a());
            this.C3 = p63.a(qda.a(this.V));
            this.D3 = p63.a(i25.a(m15Var));
            as8<gk2<ServerDeltaTimeEntity>> a15 = p63.a(oda.a(this.s));
            this.E3 = a15;
            as8<ida> a16 = p63.a(pda.a(a15));
            this.F3 = a16;
            as8<f5b> a17 = p63.a(h25.a(m15Var, this.D3, a16));
            this.G3 = a17;
            this.H3 = p63.a(vda.a(this.C3, this.g1, a17));
            this.I3 = p63.a(ah9.a(tg9Var, this.t));
            this.J3 = p63.a(d48.a());
            this.K3 = p63.a(ys8.a());
            as8<UnreadMessagesController> a18 = p63.a(afb.a());
            this.L3 = a18;
            as8<kfb> a19 = p63.a(zeb.a(a18));
            this.M3 = a19;
            ffb a20 = ffb.a(this.r3, a19, this.Y);
            this.N3 = a20;
            this.O3 = gfb.b(a20);
            as8<ChatCenterPushMessageHelper> a21 = p63.a(qeb.a());
            this.P3 = a21;
            this.Q3 = p63.a(web.a(a21));
            this.R3 = p63.a(wl9.a(gl9Var, this.V));
            this.S3 = p63.a(xj5.a(this.V));
            this.T3 = p63.a(yj5.a());
            as8<uk5> a22 = p63.a(ck5.a());
            this.U3 = a22;
            ol5 a23 = ol5.a(this.S3, this.T3, a22, this.q0);
            this.V3 = a23;
            this.W3 = p63.a(dk5.a(a23));
            this.X3 = p63.a(c48.a());
            this.Y3 = p63.a(ou5.a());
            this.Z3 = p63.a(ek5.a());
            this.a4 = p63.a(ml9.a(gl9Var, this.V));
            u42 a24 = u42.a(this.c0);
            this.b4 = a24;
            this.c4 = p63.a(z42.a(this.b1, this.a4, a24, this.G0));
            this.d4 = p63.a(mfa.a(this.R3, this.c2, iy2.a()));
            as8<sl5.a> a25 = p63.a(at5.a(this.K2));
            this.e4 = a25;
            this.f4 = p63.a(j7.a(this.O0, a25, this.q0, this.T));
            as8<ia8> a26 = p63.a(ja8.a());
            this.g4 = a26;
            this.h4 = p63.a(oa8.a(a26));
            this.i4 = p63.a(qa8.a(this.q0));
            this.j4 = p63.a(tl9.a(gl9Var, this.V));
            as8<bia> a27 = p63.a(f25.a(m15Var, this.B0));
            this.k4 = a27;
            g98 a28 = g98.a(this.r0, this.i4, this.U0, this.N, this.j4, this.j0, a27);
            this.l4 = a28;
            this.m4 = p63.a(ab8.a(a28));
            this.n4 = p63.a(bb8.a(this.G3));
            this.o4 = p63.a(xe4.a());
            this.p4 = p63.a(pu1.a(this.p));
            this.q4 = p63.a(ye4.a(this.p));
            this.r4 = p63.a(q43.a(p43Var, this.p));
            this.s4 = gv0.a(this.N);
            nh8 a29 = nh8.a(this.R3, this.c2);
            this.t4 = a29;
            this.u4 = p63.a(m6a.a(this.s4, this.L2, this.d4, a29, this.Q, this.K2, this.D));
            as8<sh5> a30 = p63.a(ei5.a());
            this.v4 = a30;
            as8<Retrofit> a31 = p63.a(ii5.a(a30));
            this.w4 = a31;
            this.x4 = p63.a(fi5.a(a31));
            this.y4 = p63.a(wz.a(rzVar));
            this.z4 = p63.a(vz.a(rzVar));
            as8<ot5> a32 = p63.a(tu5.a(this.z));
            this.A4 = a32;
            this.B4 = p63.a(uu5.a(this.s, a32));
            as8<kt5> a33 = p63.a(lt5.a());
            this.C4 = a33;
            this.D4 = p63.a(st5.a(this.w2, this.B4, a33));
            this.E4 = t42.a(this.c4);
            this.F4 = qp.a(this.i3);
            as8<jgb> a34 = p63.a(nu1.a(this.p));
            this.G4 = a34;
            this.H4 = p63.a(ze4.a(this.q4, a34));
            as8<pgb> a35 = p63.a(wu1.a());
            this.I4 = a35;
            this.J4 = p63.a(mg7.a(a35, this.r0));
            this.K4 = s15.a(m15Var, this.X2, this.h3);
            as8<AssistantApi> a36 = p63.a(rs.a(this.V));
            this.L4 = a36;
            this.M4 = p63.a(zv.a(a36, uv.a()));
            this.N4 = p63.a(br0.a(this.e1));
            this.O4 = p63.a(uh9.a(tg9Var, this.s));
            as8<gk2<ProductEntity>> a37 = p63.a(qh9.a(tg9Var, this.s));
            this.P4 = a37;
            as8<yl8> a38 = p63.a(rh9.a(tg9Var, a37));
            this.Q4 = a38;
            as8<uja> a39 = p63.a(vh9.a(tg9Var, this.O4, a38, this.U1, this.I1, this.K1));
            this.R4 = a39;
            this.S4 = p63.a(os.a(this.N4, a39));
            this.T4 = p63.a(reb.a(this.G0));
        }

        private void v7(qk8 qk8Var, gl9 gl9Var, vu6 vu6Var, tg9 tg9Var, m15 m15Var, rz rzVar, p43 p43Var, Application application, tj3 tj3Var) {
            this.U4 = p63.a(l31.a());
            this.V4 = p63.a(yu6.a(vu6Var, this.s3));
            this.W4 = p63.a(xu6.a(vu6Var, this.s3));
            this.X4 = ew1.a(this.s);
            as8<UploadAPI> a = p63.a(vl9.a(gl9Var, this.V));
            this.Y4 = a;
            this.Z4 = p63.a(gh9.a(tg9Var, a));
            as8<wo1> a2 = p63.a(t15.a(m15Var, this.p));
            this.a5 = a2;
            this.b5 = p63.a(fw1.a(this.X4, this.Z4, a2));
            this.c5 = p63.a(su7.a(this.y3));
            this.d5 = p63.a(ar0.a(this.t0, this.d1));
            this.e5 = p63.a(jl9.a(gl9Var, this.V));
            this.f5 = p63.a(kv7.a(this.s));
            this.g5 = p63.a(sl9.a(gl9Var, this.V));
            rp a3 = rp.a(this.J);
            this.h5 = a3;
            as8<b77> a4 = p63.a(fv7.a(a3, this.I, this.O2));
            this.i5 = a4;
            this.j5 = p63.a(rv7.a(a4));
            this.k5 = vb3.a(this.O2);
            as8<b77> a5 = p63.a(pu7.a(this.O2));
            this.l5 = a5;
            this.m5 = p63.a(ou7.a(a5));
            as8<b77> a6 = p63.a(ku7.a(this.O2));
            this.n5 = a6;
            as8<xb.a> a7 = p63.a(ju7.a(a6));
            this.o5 = a7;
            this.p5 = p63.a(iu7.a(this.j5, this.k5, this.m5, a7));
            this.q5 = p63.a(iv7.a());
            as8<qh3> a8 = p63.a(qu7.a());
            this.r5 = a8;
            this.s5 = p63.a(ru7.a(a8));
            as8<w65> a9 = p63.a(av7.a());
            this.t5 = a9;
            this.u5 = p63.a(sv7.a(this.g5, a9));
            cv7 a10 = cv7.a(this.Y, this.j0);
            this.v5 = a10;
            as8<s56> a11 = p63.a(dv7.a(this.u5, a10, this.K4));
            this.w5 = a11;
            as8<vo0> a12 = p63.a(mu7.a(this.f5, this.g5, this.p5, this.q5, this.s5, a11));
            this.x5 = a12;
            this.y5 = p63.a(lv7.a(this.p1, this.q1, this.e5, a12, this.C1));
            this.z5 = p63.a(il9.a(gl9Var, this.V));
            this.A5 = p63.a(av6.a(vu6Var, this.G0, this.v));
            this.B5 = p63.a(vv7.a());
            this.C5 = p63.a(av9.a(this.O2));
            this.D5 = p63.a(fp4.a());
            xe6 a13 = xe6.a(this.G0, this.K1);
            this.E5 = a13;
            as8<pe6> a14 = p63.a(qe6.a(a13));
            this.F5 = a14;
            this.G5 = p63.a(zg6.a(this.K1, a14, this.E5));
            this.H5 = p63.a(fe6.a(this.U1));
            this.I5 = p63.a(ir0.a(this.N4, this.d5));
            this.J5 = p63.a(cr0.a(this.R4));
            this.K5 = p63.a(yxa.a());
            as8<ProductTagsApi> a15 = p63.a(al4.a(this.V));
            this.L5 = a15;
            this.M5 = p63.a(rm8.a(a15, this.j0));
            this.N5 = p63.a(l25.a(m15Var));
            this.O5 = sp.a(this.i0);
            this.P5 = e48.a(this.X3);
            this.Q5 = p63.a(uz.a(rzVar, this.v, this.G0));
            ce4 a16 = ce4.a(this.V);
            this.R5 = a16;
            this.S5 = de4.a(a16);
            this.T5 = kr0.a(this.o0, this.d5, this.G0);
            this.U5 = m25.a(m15Var);
            this.V5 = p63.a(cp2.a());
            this.W5 = p63.a(lz4.a(this.p, this.G0, this.X2, this.K5, this.d2));
            this.X5 = ku5.a(this.f4);
            this.Y5 = p63.a(cka.a(this.q0));
        }

        private li0 w7(li0 li0Var) {
            mi0.b(li0Var, this.s3.get());
            mi0.a(li0Var, this.Y.get());
            return li0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ej6 x7() {
            return kr0.c(this.o0.get(), this.d5.get(), this.G0.get());
        }

        private MysteryShopperCheckupApi y7() {
            return uv1.a(this.V.get());
        }

        private bs6 z7() {
            return vv1.a(xv1.a());
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public ih4 A() {
            return this.v.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public v28 A0() {
            return e48.c(this.X3.get());
        }

        @Override // ru.dodopizza.app.di.AppComponent
        public f63 A1() {
            return this.s3.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public t28 A3() {
            return this.J3.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies
        public vg7 B() {
            return this.E1.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public GeoApi B0() {
            return ce4.c(this.V.get());
        }

        @Override // com.dodopizza.profile.feature.profilelocalelist.ProfileLocaleListFeatureDependencies
        public i32 B1() {
            return this.T.get();
        }

        @Override // ru.dodopizza.app.di.AppComponent
        public ru.dodopizza.app.presentation.pincodelogin.d B3() {
            return this.z4.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public py1 C() {
            return this.Y3.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies, ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public ey7 C0() {
            return c25.a(this.g);
        }

        @Override // ru.dodopizza.app.di.AppComponent
        public ih C1() {
            return this.k3.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public ry1 C3() {
            return this.A.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public ew5 D() {
            return this.p4.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public HashMap<String, List<bq3>> D1() {
            return this.u0.get();
        }

        @Override // ru.dodopizza.app.di.AppComponent
        public void D3(li0 li0Var) {
            w7(li0Var);
        }

        @Override // ru.dodopizza.app.di.AppComponent
        public LocalityComponent.a E2() {
            return new b0(this.j);
        }

        @Override // ru.dodopizza.app.di.AppComponent
        public r68 F3() {
            return this.y4.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies, com.dodopizza.core.feature.debugtools.toggles.FeatureTogglesFeatureDependencies
        public ci8 G() {
            return this.t.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public xr0 G1() {
            return this.x3.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.notification.NotificationFeatureDependencies
        public pq G2() {
            return this.Z.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies
        public pv9 H() {
            return this.n4.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public tda H2() {
            return rda.a(this.H3.get());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public k63 I() {
            return this.a0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public xu8 I2() {
            return this.M0.get();
        }

        @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapRoutingFeatureDependencies
        public pd3 I3() {
            return be4.a(this.s3.get());
        }

        @Override // com.dodopizza.profile.feature.profilelocalelist.ProfileLocaleListFeatureDependencies
        public wl5 J3() {
            return this.Q.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public k6a K() {
            return this.u4.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public dv6 K0() {
            return this.t3.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies
        public r43 L() {
            return this.o4.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public pl5 L0() {
            return this.Z3.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public wc L1() {
            return o15.c(this.g, this.H2.get());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.notification.NotificationFeatureDependencies
        public ok6 M1() {
            return this.V2.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public ru.dodopizza.app.presentation.main.a N3() {
            return this.Y2.get();
        }

        @Override // com.dodopizza.core.feature.captcha.CaptchaFeatureDependencies, com.dodopizza.core.feature.remoteconfig.RemoteConfigFeatureDependencies, ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public hp P() {
            return this.h3.get();
        }

        @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public h7 P0() {
            return ku5.c(this.f4.get());
        }

        @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListFeatureDependencies
        public re4 R() {
            return de4.c(B0());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.notification.NotificationFeatureDependencies
        public hfb S3() {
            return this.Q3.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, com.dodopizza.core.feature.debugtools.toggles.FeatureTogglesFeatureDependencies
        public s80 T() {
            return this.J.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public m28 T0() {
            return this.X3.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies, com.dodopizza.core.feature.debugtools.toggles.FeatureTogglesFeatureDependencies
        public dq3 U() {
            return this.f3.get();
        }

        @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListFeatureDependencies
        public j9a V0() {
            return u42.c(this.c0.get());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies, ru.dodopizza.app.di.modules.presentation.notification.NotificationFeatureDependencies
        public xda W() {
            return bt8.c(this.g0.get());
        }

        @Override // com.dodopizza.chat.feature.initializer.NativeChatInitializerDependencies, ru.dodopizza.app.di.modules.presentation.notification.NotificationFeatureDependencies
        public bfb X() {
            return this.r3.get();
        }

        @Override // com.dodopizza.core.feature.captcha.CaptchaFeatureDependencies
        public bo0 X1() {
            return this.l2.get();
        }

        @Override // ru.dodopizza.app.infrastracture.language.AppResourceLocalesInitializerDependencies, com.dodopizza.profile.feature.profilelocalelist.ProfileLocaleListFeatureDependencies
        public jo Y() {
            return q15.c(this.g, this.R.get());
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public gy3 Y0() {
            return this.E0.get();
        }

        @Override // ru.dodopizza.app.di.AppComponent
        public ib1.a Y1() {
            return new l(this.j);
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public my7 Y2() {
            return this.A3.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public ml5 Z() {
            return this.W3.get();
        }

        @Override // ru.dodopizza.app.di.AppComponent
        public d3a.a Z1() {
            return new p0(this.j);
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public LandingApi Z3() {
            return this.S3.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies, com.dodopizza.feature.webinfo.WebInfoFeatureDependencies, com.dodopizza.feature.imagepicker.ImagePickerDialogFeatureDependencies, ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies, com.dodopizza.geo.feature.selectdeliveryaddress.di.SelectDeliveryAddressFeatureDependencies, com.dodopizza.profile.feature.profilelocalelist.ProfileLocaleListFeatureDependencies, com.dodopizza.geo.feature.phonenumbercollector.PhoneNumberCollectorDependencies, com.dodopizza.order.feature.delivery.address.DeliveryAddressFeatureDependencies
        public gc a() {
            return this.Y.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public la8 a0() {
            return this.h4.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public sg4 a2() {
            return this.y3.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies, com.dodopizza.feature.webinfo.WebInfoFeatureDependencies, com.dodopizza.feature.imagepicker.ImagePickerDialogFeatureDependencies, ru.dodopizza.app.di.onboarding.OnboardingRouterFeatureDependencies, ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.controlling.feature.fullscreenimage.FullscreenImageFeatureDependencies, com.dodopizza.controlling.feature.photopickerbutton.PhotoPickerButtonFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.profile.feature.profilelocalelist.ProfileLocaleListFeatureDependencies, com.dodopizza.geo.feature.phonenumbercollector.PhoneNumberCollectorDependencies
        public f63 b() {
            return this.s3.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public ny1 b1() {
            return this.K2.get();
        }

        @Override // ru.dodopizza.app.di.AppComponent
        public vc6 b4() {
            return this.i0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies, ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureServiceDependencies, com.dodopizza.geo.feature.selectdeliveryaddress.di.SelectDeliveryAddressFeatureDependencies, com.dodopizza.core.feature.debugtools.toggles.FeatureTogglesFeatureDependencies
        public hq3 c() {
            return this.G0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public v52 c0() {
            return this.I3.get();
        }

        @Override // com.dodopizza.core.feature.captcha.CaptchaFeatureDependencies, com.dodopizza.core.feature.remoteconfig.RemoteConfigFeatureDependencies, ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies, ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, com.dodopizza.core.feature.debugtools.toggles.FeatureTogglesFeatureDependencies
        public kx1 d() {
            return y15.c(this.g);
        }

        @Override // com.dodopizza.feature.imagepicker.ImagePickerDialogFeatureDependencies
        public fy7 d0() {
            return this.A2.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public ci8 d3() {
            return this.t.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies, ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public CountryService e() {
            return this.U0.get();
        }

        @Override // ru.dodopizza.app.di.AppComponent
        public mb e2() {
            return new e(this.j);
        }

        @Override // ru.dodopizza.app.di.AppComponent
        public y8b e3() {
            return new u0(this.j);
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies, ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public jv5 f() {
            return xu5.c(this.x2.get());
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public i00 g() {
            return this.d0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public vc6 g0() {
            return this.i0.get();
        }

        @Override // com.dodopizza.order.feature.delivery.address.DeliveryAddressFeatureDependencies
        public fv2 g2() {
            return new fv2(this.u4.get(), this.d0.get(), this.G0.get(), n(), R(), f(), V0());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies, ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public Context getContext() {
            return this.p.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public ava h() {
            return this.j0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.notification.NotificationFeatureDependencies
        public n27 h2() {
            return xs8.a(this.Y.get(), this.K3.get(), this.O3.get(), G7());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies, com.dodopizza.feature.webinfo.WebInfoFeatureDependencies, ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies, com.dodopizza.geo.feature.phonenumbercollector.PhoneNumberCollectorDependencies
        public mh0 i() {
            return this.n.get();
        }

        @Override // com.dodopizza.geo.feature.phonenumbercollector.PhoneNumberCollectorDependencies
        public v28 i2() {
            return A0();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies, ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.profile.feature.profilelocalelist.ProfileLocaleListFeatureDependencies
        public Cdo j() {
            return this.i3.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public je4 k() {
            return this.q4.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public fz4 m1() {
            return xxa.a(this.B3.get());
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public x42 n() {
            return t42.c(this.c4.get());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public b79 n2() {
            return this.q.get();
        }

        @Override // ru.dodopizza.app.di.AppComponent
        public wra n3() {
            return new t0(this.j);
        }

        @Override // com.dodopizza.core.feature.captcha.CaptchaFeatureDependencies, com.dodopizza.chat.feature.initializer.NativeChatInitializerDependencies
        public Application o0() {
            return this.h;
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public wv5 p() {
            return this.B2.get();
        }

        @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies
        public b7 p0() {
            return new b7(B0());
        }

        @Override // com.dodopizza.geo.feature.selectdeliveryaddress.di.SelectDeliveryAddressRoutingFeatureDependencies
        public com.dodopizza.geo.feature.selectdeliveryaddress.a p2() {
            return fe4.a(this.s3.get());
        }

        @Override // com.dodopizza.core.feature.captcha.CaptchaFeatureDependencies, com.dodopizza.core.feature.remoteconfig.RemoteConfigFeatureDependencies, ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies, ru.dodopizza.app.di.modules.presentation.notification.NotificationFeatureDependencies, ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public qx1 q() {
            return this.X2.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public prb q0() {
            return this.d3.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public ug4 q3() {
            return this.z3.get();
        }

        @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies
        public m52 r0() {
            return new m52(r1());
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public n52 r1() {
            return zg9.c(this.i, this.t.get());
        }

        @Override // defpackage.uw9
        /* renamed from: r7 */
        public wo P2() {
            return this.j3.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public a98 s0() {
            return this.r0.get();
        }

        @Override // ru.dodopizza.app.di.AppComponent
        public th5 t0() {
            return this.x4.get();
        }

        @Override // com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListRoutingFeatureDependencies
        public com.dodopizza.geo.feature.deliveryaddresslist.presentation.c t1() {
            return zd4.a(this.s3.get());
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public AuthorizationAPI t3() {
            return this.W.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, com.dodopizza.core.feature.debugtools.toggles.FeatureTogglesFeatureDependencies
        public yhb u0() {
            return this.w0.get();
        }

        @Override // ru.dodopizza.app.di.AppComponent
        public l48.a u3() {
            return new k0(this.j);
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public n43 v() {
            return this.r4.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public mqb v1() {
            return this.f2.get();
        }

        @Override // com.dodopizza.order.feature.delivery.address.DeliveryAddressFeatureDependencies
        public ny1 v3() {
            return this.K2.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies
        public DodopizzaApi w0() {
            return this.f1.get();
        }

        @Override // com.dodopizza.core.feature.debugtools.toggles.FeatureTogglesFeatureDependencies
        public f89 w2() {
            return this.r.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.main.MainActivityFeatureDependencies, ru.dodopizza.app.di.modules.presentation.notification.NotificationFeatureDependencies, ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public bo x() {
            return qp.c(this.i3.get());
        }

        @Override // com.dodopizza.chat.feature.initializer.NativeChatInitializerDependencies, ru.dodopizza.app.di.modules.presentation.notification.NotificationFeatureDependencies
        public ih x0() {
            return this.k3.get();
        }

        public dua y0() {
            return wh9.c(this.i, this.b2.get());
        }

        @Override // com.dodopizza.geo.domain.OnDeliveryLocationSelectedDependencies
        public com.dodopizza.geo.feature.deliveryaddresslist.presentation.d y1() {
            return ee4.a();
        }

        @Override // com.dodopizza.core.feature.remoteconfig.RemoteConfigFeatureDependencies
        public ld9 y2() {
            return this.D0.get();
        }

        @Override // ru.dodopizza.app.di.AppComponent
        public mn2.a y3() {
            return new t(this.j);
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies, ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies
        public e98 z() {
            return this.m4.get();
        }

        @Override // ru.dodopizza.app.di.onboarding.OnboardingFeatureDependencies
        public hq3 z0() {
            return this.G0.get();
        }

        @Override // com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsRouterFeatureDependencies
        public jz2 z3() {
            return ae4.a(this.s3.get());
        }

        private AppComponentImpl(qk8 qk8Var, gl9 gl9Var, vu6 vu6Var, tg9 tg9Var, m15 m15Var, rz rzVar, p43 p43Var, Application application, tj3 tj3Var) {
            this.j = this;
            this.g = m15Var;
            this.h = application;
            this.i = tg9Var;
            s7(qk8Var, gl9Var, vu6Var, tg9Var, m15Var, rzVar, p43Var, application, tj3Var);
            t7(qk8Var, gl9Var, vu6Var, tg9Var, m15Var, rzVar, p43Var, application, tj3Var);
            u7(qk8Var, gl9Var, vu6Var, tg9Var, m15Var, rzVar, p43Var, application, tj3Var);
            v7(qk8Var, gl9Var, vu6Var, tg9Var, m15Var, rzVar, p43Var, application, tj3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class LocalityComponentImpl implements LocalityComponent {
        private as8<eu> A;
        private as8<BonusActionApi> A0;
        private as8<st6> B;
        private as8<de0> B0;
        private as8<jeb> C;
        private as8<rra> C0;
        private as8<mfb> D;
        private as8<qra> D0;
        private as8<bu6> E;
        private as8<l08> E0;
        private as8<g78> F;
        private as8<f1b> F0;
        private as8<e78> G;
        private as8<wo2.a> G0;
        private as8<kr3> H;
        private as8<wo2> H0;
        private as8<cz6> I;
        private as8<EasyBonusApi> I0;
        private as8<CheckApi> J;
        private as8<fc3> J0;
        private as8<n31> K;
        private as8<ec3> K0;
        private as8<i8> L;
        private as8<zb3> L0;
        private as8<h8> M;
        private as8<ow> M0;
        private as8<ly2> N;
        private as8<hl8> N0;
        private as8<pu2> O;
        private as8<jy2> O0;
        private as8<oi8> P;
        private as8<cy2> P0;
        private as8<qi8> Q;
        private as8<gi1> Q0;
        private as8<pv0> R;
        private as8<kh1> R0;
        private as8<mk7> S;
        private as8<iz4> S0;
        private as8<t41> T;
        private as8<hz4> T0;
        private as8<li7> U;
        private as8<CovidApi> U0;
        private as8<vi7> V;
        private as8<yz1> V0;
        private as8<b51> W;
        private as8<x51> X;
        private as8<tk7> Y;
        private as8<z7b> Z;
        private as8<nt2> a0;
        private as8<MenuAPI> b0;
        private as8<ll8> c0;
        private as8<cp4> d0;
        private as8<gp4> e0;
        private as8<gd6> f0;
        private final yp8 g;
        private as8<PromoActionsRepository> g0;
        private final AppComponentImpl h;
        private as8<PromoActionsService> h0;
        private final LocalityComponentImpl i;
        private as8<id6> i0;
        private as8<dt5> j;
        private as8<ah6> j0;
        private as8<ty1> k;
        private as8<BuyMoreAPI> k0;
        private as8<ay1> l;
        private as8<xi0> l0;
        private as8<h48> m;
        private as8<gj0> m0;
        private as8<t52> n;
        private as8<wr2> n0;
        private as8<qx1> o;
        private as8<StoriesApi> o0;
        private as8<hv5> p;
        private as8<f15> p0;
        private as8<OrderApi> q;
        private as8<kya> q0;
        private as8<bd> r;
        private as8<j15> r0;
        private as8<w13> s;
        private as8<zxa> s0;
        private as8<g22> t;
        private as8<nia> t0;
        private as8<i22> u;
        private as8<cl6> u0;
        private as8<hg7> v;
        private as8<zt6> v0;
        private as8<jn6> w;
        private as8<com.dodopizza.geo.feature.deliveryaddresslist.presentation.d> w0;
        private as8<mn6> x;
        private as8<lb9> x0;
        private as8<tn6> y;
        private as8<eh6> y0;
        private as8<pt> z;
        private as8<wg6> z0;

        private ow R4() {
            return new ow(this.j0.get(), (i00) this.h.d0.get(), this.n.get(), (f8c) this.h.D.get());
        }

        private uk4 W4() {
            return new uk4((f63) this.h.s3.get());
        }

        private void X4(yp8 yp8Var, qx1 qx1Var) {
            as8<dt5> a = p63.a(ru5.a(this.h.N));
            this.j = a;
            as8<ty1> a2 = p63.a(uy1.a(a, this.h.U0));
            this.k = a2;
            this.l = p63.a(mu5.a(a2));
            this.m = p63.a(cv5.a(this.h.X3, this.l));
            this.n = p63.a(u52.a(this.h.a4, this.h.V0, this.h.d0, this.h.W1, this.m, this.h.E4, this.j, this.h.G0, this.h.Z, this.h.a0, this.h.g1));
            this.o = z45.a(qx1Var);
            this.p = p63.a(iv5.a(this.j, this.l, this.h.a0, this.h.N, this.h.D4, this.h.f3, this.h.d0, this.n, this.h.T, this.h.F4, this.h.d2, this.o));
            this.q = p63.a(sg7.a(this.h.V));
            this.r = p63.a(og7.a(this.h.Y, this.h.j0, this.h.r0, this.h.o4, this.h.H4, this.h.T, this.h.n));
            this.s = p63.a(rg7.a(this.h.p, this.h.n));
            as8<g22> a3 = p63.a(pg7.a(this.h.G4, this.s));
            this.t = a3;
            this.u = p63.a(qg7.a(this.q, a3));
            this.v = p63.a(jg7.a(this.h.V1, this.q, this.r, this.h.J4, this.h.i0, this.h.c2, this.h.L0, this.u, this.h.K4, this.h.G0));
            this.w = p63.a(yu5.a());
            as8<mn6> a4 = p63.a(zu5.a());
            this.x = a4;
            this.y = p63.a(av5.a(a4));
            this.z = qt.a(this.w);
            this.A = p63.a(fu.a(this.h.L4, this.z));
            this.B = p63.a(it6.a(this.h.q3));
            this.C = p63.a(lt6.a(this.h.n));
            as8<mfb> a5 = p63.a(nfb.a(this.h.K, this.l, this.C));
            this.D = a5;
            this.E = p63.a(kt6.a(a5, this.h.q3, this.h.f0, this.h.Q3));
            this.F = p63.a(ebb.a());
            this.G = p63.a(d78.a(this.h.G0));
            this.H = p63.a(jr3.a(this.l));
            this.I = p63.a(bz6.a(this.l));
            d31 a6 = d31.a(this.h.V);
            this.J = a6;
            this.K = p63.a(o31.a(a6, g31.a(), this.h.U4));
            as8<i8> a7 = p63.a(i52.a(this.h.G0));
            this.L = a7;
            this.M = p63.a(h52.a(a7, this.j));
            as8<ly2> a8 = p63.a(k52.a());
            this.N = a8;
            this.O = p63.a(j52.a(this.M, a8));
            as8<oi8> a9 = p63.a(m51.a());
            this.P = a9;
            this.Q = p63.a(n51.a(a9, this.h.m4, this.j));
            this.R = p63.a(e51.a());
            this.S = p63.a(l51.a(this.h.E4));
            this.T = p63.a(f51.a(this.h.R3, this.h.D, this.h.j0, this.h.c2, this.h.c0, this.R, this.h.C1, this.h.G4, this.h.I4, this.S, iy2.a()));
            this.U = tg7.a(this.v);
            this.V = p63.a(k51.a(this.h.G0));
            this.W = p63.a(g51.a(this.h.I4));
            this.X = p63.a(h51.a(this.U, this.V, this.h.y5, this.h.c2, this.R, this.h.d5, this.n, this.h.z5, this.W, this.h.q0));
            this.Y = p63.a(sk7.a(this.j, this.h.D4));
            this.Z = p63.a(l52.a(this.h.G0, this.h.D, this.h.j0, this.h.R3, this.h.c2));
            this.a0 = p63.a(i51.a(this.h.I4, this.h.j0, this.h.j4, this.h.G3, this.h.G0, this.h.q0));
            this.b0 = p63.a(nf6.a(this.h.V));
            this.c0 = p63.a(sf6.a());
            this.d0 = p63.a(lf6.a());
            this.e0 = p63.a(mf6.a(this.h.j0, this.d0, this.h.D5, this.b0, this.h.U1, this.h.F5, this.h.F1, this.h.a0, this.h.G0));
            this.f0 = p63.a(of6.a());
            as8<PromoActionsRepository> a10 = p63.a(tf6.a());
            this.g0 = a10;
            this.h0 = p63.a(uf6.a(a10, this.h.G0));
            this.i0 = p63.a(pf6.a(this.h.G0, this.h0));
            this.j0 = p63.a(qf6.a(this.b0, this.h.U1, rf6.a(), this.h.Q4, this.c0, this.j, this.h.J0, this.h.a0, this.h.I1, this.h.R4, this.e0, this.f0, this.i0, ld6.a(), this.h0, this.h.G5, this.h.F5, this.h.H5, this.h.k4));
            this.k0 = p63.a(bj0.a(this.h.V));
            as8<xi0> a11 = p63.a(dj0.a(this.h.q0));
            this.l0 = a11;
            this.m0 = p63.a(ej0.a(this.k0, a11, this.j));
            this.n0 = p63.a(kf6.a());
            this.o0 = p63.a(gya.a(this.h.V));
            as8<f15> a12 = p63.a(dya.a());
            this.p0 = a12;
            as8<kya> a13 = p63.a(iya.a(this.o0, a12, this.h.j0));
            this.q0 = a13;
            as8<j15> a14 = p63.a(fya.a(a13, this.h.G0, this.h.t, this.h.K5));
            this.r0 = a14;
            this.s0 = p63.a(hya.a(this.q0, a14, this.h.m4));
            this.t0 = p63.a(qia.a(this.h.s3, this.h.Y));
            this.u0 = p63.a(jk6.a(this.l, this.j, this.h.U2));
            this.v0 = p63.a(jt6.a(this.h.m3));
            this.w0 = p63.a(bv5.a(this.T, this.Q, this.h.G0));
            this.x0 = p63.a(sb9.a(this.h.s3));
            this.y0 = fh6.a(this.j, this.j0, this.h.G0, this.h.a0, this.h.k4, this.h.j0, this.h.Y, this.h.N0, this.h.d2, this.h.X2);
            this.z0 = bj8.a(this.h.i0, this.h.j0, this.h.c0, this.h.c2, this.y0, this.h.X2);
            this.A0 = p63.a(ge0.a(this.h.V));
            as8<de0> a15 = p63.a(ee0.a());
            this.B0 = a15;
            as8<rra> a16 = p63.a(sra.a(this.A0, a15, this.h.G0));
            this.C0 = a16;
            this.D0 = ne0.a(a16);
            this.E0 = ie0.a(this.h.g1, this.h.G3, this.h.K0, this.h.G0);
            this.F0 = p63.a(g1b.a(this.h.Y, this.h.d0, this.n, this.h.a0, this.h.d2, this.h.X2));
            this.G0 = yo2.a(this.h.J);
            this.H0 = p63.a(xo2.a(this.h.F4, this.h.Y2, this.h.s3, this.h.d0, this.h.T4, this.h.V5, this.h.W5, this.h.J2, this.F0, this.h.G0, this.G0));
            as8<EasyBonusApi> a17 = p63.a(bc3.a(this.h.V));
            this.I0 = a17;
            as8<fc3> a18 = p63.a(gc3.a(a17, this.B0, this.h.G0));
            this.J0 = a18;
            this.K0 = dc3.a(a18);
            this.L0 = p63.a(cc3.a(this.h.D, this.K0));
            pw a19 = pw.a(this.j0, this.h.d0, this.n, this.h.D);
            this.M0 = a19;
            this.N0 = il8.a(a19);
            this.O0 = p63.a(zx2.a());
            this.P0 = p63.a(ay2.a(this.h.R5, this.h.q0, this.O0));
            ph1 a20 = ph1.a(this.j0, this.h.I1, this.e0, this.F, this.h.I5, this.h.Y0, oh1.a());
            this.Q0 = a20;
            this.R0 = nh1.a(a20);
            as8<iz4> a21 = p63.a(jz4.a(this.h.p, this.h.K5, this.n, this.h.T, this.h.B3));
            this.S0 = a21;
            this.T0 = eya.a(a21);
            as8<CovidApi> a22 = p63.a(wz1.a(this.h.V));
            this.U0 = a22;
            this.V0 = p63.a(xz1.a(a22, this.j, this.h.G0));
        }

        private LoyaltyApi Y4() {
            return g06.a((Retrofit) this.h.V.get());
        }

        private y26 Z4() {
            return new y26(this.j.get(), (CountryService) this.h.U0.get(), Y4(), (v06) this.h.X1.get(), (u16) this.h.Y1.get(), (bb1) this.h.Z1.get(), (tb9) this.h.a2.get(), (hq3) this.h.G0.get());
        }

        private eh6 a5() {
            return new eh6(this.j.get(), this.j0.get(), (hq3) this.h.G0.get(), (k63) this.h.a0.get(), (bia) this.h.k4.get(), (ava) this.h.j0.get(), (gc) this.h.Y.get(), (ih6) this.h.N0.get(), y15.c(this.h.g), (qx1) this.h.X2.get());
        }

        private OrderHistoryAPI b5() {
            return ue7.a((Retrofit) this.h.V.get());
        }

        private hf7 c5() {
            return ve7.a(d5());
        }

        private if7 d5() {
            return new if7((fda) this.h.g1.get(), this.G.get());
        }

        private tf7 e5() {
            return new tf7(b5(), c5(), (hq3) this.h.G0.get());
        }

        private hl8 f5() {
            return new hl8(R4());
        }

        @Override // com.dodopizza.activeorder.feature.activeorderwidget.ActiveOrderFoodMenuFeatureDependencies, ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public ih4 A() {
            return (ih4) this.h.v.get();
        }

        @Override // com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies
        public t52 A2() {
            return this.n.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public vg7 B() {
            return (vg7) this.h.E1.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public z7b C2() {
            return this.Z.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public ew5 D() {
            return (ew5) this.h.p4.get();
        }

        @Override // com.dodopizza.controlling.feature.orderrating.OrderRatingFeatureDependencies, com.dodopizza.controlling.feature.rateapp.RateAppFeatureDependencies
        public x49 D0() {
            return this.h.H7();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public ew7 D2() {
            return (ew7) this.h.y5.get();
        }

        @Override // com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies, com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies, com.dodopizza.controlling.feature.feedbackbuttons.FeedbackButtonsFeatureDependencies, com.dodopizza.controlling.feature.orderrating.OrderRatingFeatureDependencies, com.dodopizza.controlling.feature.ratingapplied.RatingAppliedFeatureDependencies
        public ah7 E() {
            return this.h.E7();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public j2c E0() {
            return m25.c(this.h.g);
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public o8.a E3() {
            return new c(this.h, this.i);
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, com.dodopizza.loyalty.menu.di.LoyaltyDependencies, com.dodopizza.loyalty.stacksgame.di.StackGameDependencies, com.dodopizza.contacts.feature.feedback.FeedbackFeatureDependencies
        public dt5 F() {
            return this.j.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.profile.feature.profilesettings.ProfileSettingsDependencies
        public qi8 F0() {
            return this.Q.get();
        }

        @Override // com.dodopizza.controlling.feature.ratingcomment.RatingCommentFeatureDependencies
        public z59 F1() {
            return p59.a((f63) this.h.s3.get());
        }

        @Override // com.dodopizza.chat.feature.chat.NativeChatFeatureDependencies, com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies
        public ci8 G() {
            return (ci8) this.h.t.get();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public ji1.a G3() {
            return new p(this.h, this.i);
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public pv9 H() {
            return (pv9) this.h.n4.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies, com.dodopizza.profile.feature.profilesettings.ProfileSettingsDependencies
        public ps1 H0() {
            return lu5.a((CountryService) this.h.U0.get(), this.h.f(), (rt5) this.h.D4.get());
        }

        @Override // com.dodopizza.order.feature.promocode.PromoCodeFeatureDependencies
        public nfa H1() {
            return b0();
        }

        @Override // com.dodopizza.order.feature.upsell.UpsaleFeatureDependencies
        public tsb H3() {
            return (tsb) this.h.n0.get();
        }

        @Override // com.dodopizza.order.feature.personaloffer.PersonalOffersFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies, com.dodopizza.order.feature.upsell.UpsaleFeatureDependencies
        public k63 I() {
            return (k63) this.h.a0.get();
        }

        @Override // com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public df4 I0() {
            return this.h.q7();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public q6a.a I1() {
            return new r0(this.h, this.i);
        }

        @Override // com.dodopizza.activeorder.feature.activeorderwidget.ActiveOrderFoodMenuFeatureDependencies, com.dodopizza.activeorder.feature.orderdetails.OrderDetailsFeatureDependencies, com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies, ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public jgb J() {
            return (jgb) this.h.G4.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public uja J0() {
            return (uja) this.h.R4.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public zt6 J2() {
            return this.v0.get();
        }

        @Override // com.dodopizza.order.feature.promoaction.SpecialOfferDialogFeatureDependency
        public kp8 K2() {
            return jp8.a((f63) this.h.s3.get(), f5());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public r43 L() {
            return (r43) this.h.o4.get();
        }

        @Override // com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies
        public li7 L2() {
            return r();
        }

        @Override // com.dodopizza.controlling.feature.rateapp.RateAppFeatureDependencies
        public q49 L3() {
            return w49.a((f63) this.h.s3.get());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies, com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.variable.VariableProductCardFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public c62 M() {
            return (c62) this.h.Y0.get();
        }

        @Override // com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public wg6 M0() {
            return bj8.c((vc6) this.h.i0.get(), (ava) this.h.j0.get(), (v53) this.h.c0.get(), this.h.y0(), a5(), (qx1) this.h.X2.get());
        }

        @Override // com.dodopizza.chat.feature.chat.NativeChatFeatureDependencies
        public st6 M3() {
            return this.B.get();
        }

        @Override // com.dodopizza.activeorder.feature.orderdetails.OrderDetailsFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.halves.HalvesProductCardFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, com.dodopizza.order.feature.upsell.UpsaleFeatureDependencies
        public g78 N() {
            return this.F.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public pv0 N0() {
            return this.R.get();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public zk7 N1() {
            return new e0(this.h, this.i);
        }

        @Override // ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies
        public gj0 N2() {
            return this.m0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies, com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.variable.VariableProductCardFeatureDependencies, com.dodopizza.loyalty.products.di.LoyaltyProductsDependencies
        public mxa O() {
            return (mxa) this.h.I1.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public x51 O0() {
            return this.X.get();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public m38.a O1() {
            return new i0(this.h, this.i);
        }

        @Override // com.dodopizza.controlling.feature.orderrating.OrderRatingFeatureDependencies
        public hp P() {
            return (hp) this.h.h3.get();
        }

        @Override // com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies
        public ze7 P3() {
            return (ze7) this.h.V4.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.variable.VariableProductCardFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public jn6 Q() {
            return this.w.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public ej6 Q0() {
            return this.h.x7();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public vm Q1() {
            return this.h.g7();
        }

        @Override // com.dodopizza.order.feature.assistant.AssistantFeatureDependencies
        public yv Q2() {
            return (yv) this.h.M4.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.product.card.snack.SnackProductCardFeatureDependencies
        public Gson R0() {
            return (Gson) this.h.K.get();
        }

        @Override // com.dodopizza.controlling.feature.orderrating.OrderRatingFeatureDependencies
        public cs1 R2() {
            return this.h.j7();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public y7.a R3() {
            return new a(this.h, this.i);
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.controlling.feature.ratingapplied.RatingAppliedFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public ay1 S() {
            return this.l.get();
        }

        @Override // com.dodopizza.controlling.feature.ratingcomment.RatingCommentFeatureDependencies
        public ur3 S0() {
            return o59.a((f63) this.h.s3.get());
        }

        @Override // com.dodopizza.controlling.feature.orderrating.OrderRatingFeatureDependencies
        public k69 S2() {
            return (k69) this.h.b5.get();
        }

        public x18 S4() {
            return je0.a((f8c) this.h.D.get(), (WorkflowApi) this.h.R3.get(), this.h.y0());
        }

        @Override // com.dodopizza.loyalty.stacksgame.di.StackGameDependencies
        public s80 T() {
            return (s80) this.h.J.get();
        }

        @Override // com.dodopizza.controlling.feature.orderrating.OrderRatingFeatureDependencies
        public wh7 T1() {
            return gh7.a((f63) this.h.s3.get());
        }

        @Override // com.dodopizza.loyalty.referralsystem.di.ReferralSystemFeatureDependencies
        public lb9 T2() {
            return this.x0.get();
        }

        public rp8 T4() {
            return ke0.a(this.h.o7());
        }

        @Override // com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies
        public dq3 U() {
            return (dq3) this.h.f3.get();
        }

        @Override // com.dodopizza.controlling.feature.ratingcomment.RatingCommentFeatureDependencies
        public k69 U0() {
            return (k69) this.h.b5.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public tg4 U1() {
            return (tg4) this.h.c5.get();
        }

        @Override // com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public bo U3() {
            return this.h.x();
        }

        public dq8 U4() {
            return le0.a((f8c) this.h.D.get(), (WorkflowApi) this.h.R3.get(), this.h.y0());
        }

        @Override // com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies, com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies
        public es6 V() {
            return this.h.A7();
        }

        @Override // com.dodopizza.controlling.feature.feedbackbuttons.FeedbackButtonsFeatureDependencies
        public yq3 V1() {
            return rq3.a((f63) this.h.s3.get());
        }

        @Override // com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardFeatureDependencies
        public g78 V2() {
            return this.F.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public wt9 V3() {
            return (wt9) this.h.B5.get();
        }

        @Override // defpackage.uw9
        /* renamed from: V4 */
        public hv5 P2() {
            return this.p.get();
        }

        @Override // com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies
        public xda W() {
            return this.h.W();
        }

        @Override // com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, com.dodopizza.order.feature.promoaction.SpecialOfferDialogFeatureDependency
        public bq W0() {
            return (bq) this.h.K0.get();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public di3.a W1() {
            return new x(this.h, this.i);
        }

        @Override // com.dodopizza.controlling.feature.rndigitalcard.RnDigitalCardFeatureDependencies
        public en9 W2() {
            return this.h.L7();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public y7a W3() {
            return (y7a) this.h.A5.get();
        }

        @Override // com.dodopizza.chat.feature.chat.NativeChatFeatureDependencies
        public bfb X() {
            return (bfb) this.h.r3.get();
        }

        @Override // com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public zxa X0() {
            return this.s0.get();
        }

        @Override // com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies
        public fe7 X2() {
            return (fe7) this.h.W4.get();
        }

        @Override // com.dodopizza.order.feature.halves.HalvesFeatureDependencies
        public tk4 X3() {
            return qu5.a(W4());
        }

        @Override // com.dodopizza.profile.feature.profilesettings.ProfileSettingsDependencies
        public jo Y() {
            return this.h.Y();
        }

        @Override // com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public gy3 Y0() {
            return (gy3) this.h.E0.get();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public ht7.a Y3() {
            return new f0(this.h, this.i);
        }

        @Override // com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public nia Z0() {
            return this.t0.get();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public vw7 Z2() {
            return new h0(this.h, this.i);
        }

        @Override // com.dodopizza.order.feature.assistant.AssistantFeatureDependencies, com.dodopizza.chat.feature.chat.NativeChatFeatureDependencies, com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies, com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies, com.dodopizza.controlling.feature.feedbackbuttons.FeedbackButtonsFeatureDependencies, com.dodopizza.controlling.feature.orderrating.OrderRatingFeatureDependencies, com.dodopizza.controlling.feature.rndigitalcard.RnDigitalCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.order.feature.personaloffer.PersonalOffersFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies, com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.halves.HalvesProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.snack.SnackProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.variable.VariableProductCardFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies, com.dodopizza.order.feature.product.card.presentation.removeingredient.RemoveIngredientsFeatureDependencies, com.dodopizza.order.feature.promocode.PromoCodeFeatureDependencies, com.dodopizza.loyalty.referralsystem.di.ReferralSystemFeatureDependencies, com.dodopizza.loyalty.menu.di.LoyaltyDependencies, com.dodopizza.loyalty.products.di.LoyaltyProductsDependencies, com.dodopizza.loyalty.missions.di.LoyaltyMissionDetailsDependencies, com.dodopizza.loyalty.stacksgame.di.StackGameDependencies, com.dodopizza.profile.feature.profilesettings.ProfileSettingsDependencies, com.dodopizza.order.feature.upsell.UpsaleFeatureDependencies, com.dodopizza.order.feature.halves.HalvesFeatureDependencies, com.dodopizza.order.feature.promoaction.SpecialOfferDialogFeatureDependency, com.dodopizza.order.feature.personaldelivery.DynamicDeliveryFeatureDependencies
        public gc a() {
            return (gc) this.h.Y.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public t41 a1() {
            return this.T.get();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public gt0.a a3() {
            return new j(this.h, this.i);
        }

        @Override // com.dodopizza.activeorder.feature.activeorderwidget.ActiveOrderFoodMenuFeatureDependencies, com.dodopizza.order.feature.assistant.AssistantFeatureDependencies, com.dodopizza.auth.features.legaldocuments.LegalDocumentsFeatureDependencies, com.dodopizza.chat.feature.chat.NativeChatFeatureDependencies, com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies, com.dodopizza.activeorder.feature.orderdetails.OrderDetailsFeatureDependencies, com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies, com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies, com.dodopizza.controlling.feature.rndigitalcard.RnDigitalCardFeatureDependencies, com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.variable.VariableProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies, com.dodopizza.loyalty.referralsystem.di.ReferralSystemFeatureDependencies, com.dodopizza.loyalty.menu.di.LoyaltyDependencies, com.dodopizza.loyalty.products.di.LoyaltyProductsDependencies, com.dodopizza.loyalty.missions.di.LoyaltyMissionDetailsDependencies, com.dodopizza.loyalty.stacksgame.di.StackGameDependencies, com.dodopizza.profile.feature.profilesettings.ProfileSettingsDependencies, com.dodopizza.contacts.feature.feedback.FeedbackFeatureDependencies, com.dodopizza.order.feature.halves.HalvesFeatureDependencies
        public f63 b() {
            return (f63) this.h.s3.get();
        }

        @Override // com.dodopizza.order.feature.personaloffer.PersonalOffersFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, com.dodopizza.order.feature.promoaction.SpecialOfferDialogFeatureDependency
        public nfa b0() {
            return me0.a(U4(), S4(), T4(), (gc) this.h.Y.get(), (hq3) this.h.G0.get(), (bq) this.h.K0.get(), y(), this.n.get(), y15.c(this.h.g));
        }

        @Override // ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public ld9 b2() {
            return (ld9) this.h.D0.get();
        }

        @Override // com.dodopizza.order.feature.halves.HalvesFeatureDependencies
        public qm8 b3() {
            return (qm8) this.h.M5.get();
        }

        @Override // com.dodopizza.activeorder.feature.activeorderwidget.ActiveOrderFoodMenuFeatureDependencies, com.dodopizza.order.feature.assistant.AssistantFeatureDependencies, com.dodopizza.auth.features.legaldocuments.LegalDocumentsFeatureDependencies, com.dodopizza.chat.feature.chat.NativeChatFeatureDependencies, com.dodopizza.activeorder.feature.orderdetails.OrderDetailsFeatureDependencies, com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies, ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.order.feature.personaloffer.PersonalOffersFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies, com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.variable.VariableProductCardFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies, com.dodopizza.order.feature.promocode.PromoCodeFeatureDependencies, com.dodopizza.loyalty.referralsystem.di.ReferralSystemFeatureDependencies, com.dodopizza.loyalty.menu.di.LoyaltyDependencies, com.dodopizza.loyalty.stacksgame.di.StackGameDependencies, com.dodopizza.profile.feature.profilesettings.ProfileSettingsDependencies, com.dodopizza.order.feature.upsell.UpsaleFeatureDependencies, com.dodopizza.order.feature.halves.HalvesFeatureDependencies
        public hq3 c() {
            return (hq3) this.h.G0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public v52 c0() {
            return (v52) this.h.I3.get();
        }

        @Override // com.dodopizza.controlling.feature.orderrating.OrderRatingFeatureDependencies
        public jc7 c1() {
            return this.h.B7();
        }

        @Override // com.dodopizza.chat.feature.chat.NativeChatFeatureDependencies
        public bu6 c2() {
            return this.E.get();
        }

        @Override // com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies
        public jc7 c3() {
            return this.h.B7();
        }

        @Override // com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies
        public kr3 c4() {
            return this.H.get();
        }

        @Override // com.dodopizza.order.feature.assistant.AssistantFeatureDependencies, com.dodopizza.chat.feature.chat.NativeChatFeatureDependencies, com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies, ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies, com.dodopizza.loyalty.referralsystem.di.ReferralSystemFeatureDependencies, com.dodopizza.loyalty.menu.di.LoyaltyDependencies, com.dodopizza.loyalty.stacksgame.di.StackGameDependencies, com.dodopizza.profile.feature.profilesettings.ProfileSettingsDependencies
        public kx1 d() {
            return y15.c(this.h.g);
        }

        @Override // com.dodopizza.chat.feature.chat.NativeChatFeatureDependencies, com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies
        public ey7 d0() {
            return c25.a(this.h.g);
        }

        @Override // com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public o63 d1() {
            return (o63) this.h.J0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public SbpBankListAPI d2() {
            return (SbpBankListAPI) this.h.C5.get();
        }

        @Override // com.dodopizza.loyalty.stacksgame.di.StackGameDependencies
        public CountryService e() {
            return (CountryService) this.h.U0.get();
        }

        @Override // com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies, com.dodopizza.controlling.feature.orderrating.OrderRatingFeatureDependencies
        public tz1 e0() {
            return this.h.n7();
        }

        @Override // com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies
        public f8c e1() {
            return (f8c) this.h.D.get();
        }

        @Override // com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public jv5 f() {
            return this.h.f();
        }

        @Override // com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies, com.dodopizza.controlling.feature.feedbackbuttons.FeedbackButtonsFeatureDependencies, com.dodopizza.controlling.feature.orderrating.OrderRatingFeatureDependencies
        public o69 f0() {
            return this.h.J7();
        }

        @Override // com.dodopizza.order.feature.upsell.UpsaleFeatureDependencies
        public ktb f1() {
            return (ktb) this.h.m0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public ok7 f2() {
            return rk7.c();
        }

        @Override // com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies
        public g78 f4() {
            return this.F.get();
        }

        @Override // com.dodopizza.chat.feature.chat.NativeChatFeatureDependencies, com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies, ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.order.feature.personaloffer.PersonalOffersFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies, com.dodopizza.order.feature.promoaction.SpecialOfferDialogFeatureDependency
        public i00 g() {
            return (i00) this.h.d0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public vc6 g0() {
            return (vc6) this.h.i0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public bu9 g1() {
            return this.h.M7();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public mx2.a g3() {
            return new v(this.h, this.i);
        }

        @Override // com.dodopizza.profile.feature.profilesettings.ProfileSettingsDependencies
        public h48 g4() {
            return this.m.get();
        }

        @Override // com.dodopizza.chat.feature.chat.NativeChatFeatureDependencies, com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies, com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies, ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public Context getContext() {
            return (Context) this.h.p.get();
        }

        @Override // com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies, ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.variable.VariableProductCardFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies, com.dodopizza.loyalty.menu.di.LoyaltyDependencies, com.dodopizza.contacts.feature.feedback.FeedbackFeatureDependencies
        public ava h() {
            return (ava) this.h.j0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public fq0 h0() {
            return (fq0) this.h.d5.get();
        }

        @Override // com.dodopizza.order.feature.assistant.AssistantFeatureDependencies
        public ns h1() {
            return (ns) this.h.S4.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public nt2 h3() {
            return this.a0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies, com.dodopizza.loyalty.stacksgame.di.StackGameDependencies, com.dodopizza.profile.feature.profilesettings.ProfileSettingsDependencies
        public mh0 i() {
            return (mh0) this.h.n.get();
        }

        @Override // com.dodopizza.order.feature.promoaction.SpecialOfferDialogFeatureDependency
        public aub i1() {
            return (aub) this.h.N5.get();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public x34 i3() {
            return new a0(this.h, this.i);
        }

        @Override // com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, com.dodopizza.profile.feature.profilesettings.ProfileSettingsDependencies
        public Cdo j() {
            return (Cdo) this.h.i3.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies, com.dodopizza.loyalty.referralsystem.di.ReferralSystemFeatureDependencies, com.dodopizza.loyalty.menu.di.LoyaltyDependencies
        public fda j0() {
            return (fda) this.h.g1.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies
        public gp4 j1() {
            return this.e0.get();
        }

        @Override // com.dodopizza.order.feature.assistant.AssistantFeatureDependencies
        public tn6 j2() {
            return this.y.get();
        }

        @Override // com.dodopizza.order.feature.personaloffer.PersonalOffersFeatureDependencies
        public l08 j3() {
            return ie0.c((fda) this.h.g1.get(), (f5b) this.h.G3.get(), (bq) this.h.K0.get(), (hq3) this.h.G0.get());
        }

        @Override // com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies
        public m31 j4() {
            return this.K.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public je4 k() {
            return (je4) this.h.q4.get();
        }

        @Override // com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies, com.dodopizza.controlling.feature.orderrating.OrderRatingFeatureDependencies
        public pz1 k0() {
            return this.h.l7();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public dh4 k1() {
            return (dh4) this.h.u1.get();
        }

        @Override // com.dodopizza.order.feature.promocode.PromoCodeFeatureDependencies
        public aq8 k2() {
            return zp8.a(this.g, (f63) this.h.s3.get());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public tk7 k3() {
            return this.Y.get();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public z46.a k4() {
            return new c0(this.h, this.i);
        }

        @Override // ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies, com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.halves.HalvesProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.snack.SnackProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.variable.VariableProductCardFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, com.dodopizza.order.feature.halves.HalvesFeatureDependencies, com.dodopizza.order.feature.promoaction.SpecialOfferDialogFeatureDependency
        public ah6 l() {
            return this.j0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public f8c l0() {
            return (f8c) this.h.D.get();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public cy9 l1() {
            return new o0(this.h, this.i);
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public ni0.a l2() {
            return new f(this.h, this.i);
        }

        @Override // com.dodopizza.order.feature.assistant.AssistantFeatureDependencies
        public eu l3() {
            return this.A.get();
        }

        @Override // com.dodopizza.chat.feature.chat.NativeChatFeatureDependencies, ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.order.feature.personaloffer.PersonalOffersFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies, com.dodopizza.loyalty.menu.di.LoyaltyDependencies, com.dodopizza.loyalty.stacksgame.di.StackGameDependencies, com.dodopizza.profile.feature.profilesettings.ProfileSettingsDependencies
        public t52 m() {
            return this.n.get();
        }

        @Override // com.dodopizza.controlling.feature.feedbackbuttons.FeedbackButtonsFeatureDependencies, com.dodopizza.controlling.feature.orderrating.OrderRatingFeatureDependencies
        public eb0 m0() {
            return this.h.h7();
        }

        @Override // com.dodopizza.order.feature.personaloffer.PersonalOffersFeatureDependencies
        public n67 m2() {
            return he0.a();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public x42 n() {
            return this.h.n();
        }

        @Override // com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.variable.VariableProductCardFeatureDependencies
        public wr2 n0() {
            return this.n0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies, com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.halves.HalvesProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.snack.SnackProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.variable.VariableProductCardFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, com.dodopizza.loyalty.menu.di.LoyaltyDependencies, com.dodopizza.loyalty.products.di.LoyaltyProductsDependencies
        public ds0 o() {
            return (ds0) this.h.I5.get();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public a02 o1() {
            return new s(this.h, this.i);
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public ks1 o3() {
            return new r(this.h, this.i);
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public wv5 p() {
            return (wv5) this.h.B2.get();
        }

        @Override // com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies
        public sf7 p1() {
            return we7.a(e5());
        }

        @Override // com.dodopizza.chat.feature.chat.NativeChatFeatureDependencies, com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies
        public qx1 q() {
            return (qx1) this.h.X2.get();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public zg1.a q1() {
            return new n(this.h, this.i);
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public mn6 q2() {
            return this.x.get();
        }

        @Override // com.dodopizza.activeorder.feature.activeorderwidget.ActiveOrderFoodMenuFeatureDependencies, com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies, com.dodopizza.activeorder.feature.orderdetails.OrderDetailsFeatureDependencies, com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies, com.dodopizza.controlling.feature.orderrating.OrderRatingFeatureDependencies, ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public li7 r() {
            return tg7.c(this.v.get());
        }

        @Override // com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public cs0 r2() {
            return (cs0) this.h.o0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public pu2 r3() {
            return this.O.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.controlling.feature.ratingapplied.RatingAppliedFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.halves.HalvesProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.snack.SnackProductCardFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, com.dodopizza.order.feature.personaldelivery.DynamicDeliveryFeatureDependencies
        public f63 s() {
            return (f63) this.h.s3.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public a98 s0() {
            return (a98) this.h.r0.get();
        }

        @Override // com.dodopizza.order.feature.upsell.UpsaleFeatureDependencies
        public jn6 s2() {
            return this.w.get();
        }

        @Override // com.dodopizza.activeorder.feature.activeorderwidget.ActiveOrderFoodMenuFeatureDependencies, com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies, com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.snack.SnackProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.variable.VariableProductCardFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public f5b t() {
            return (f5b) this.h.G3.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies, com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.halves.HalvesProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.snack.SnackProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.variable.VariableProductCardFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public sq0 u() {
            return (sq0) this.h.J5.get();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public e68.a u1() {
            return new m0(this.h, this.i);
        }

        @Override // com.dodopizza.profile.feature.profilesettings.ProfileSettingsDependencies
        public gy5 u2() {
            return (gy5) this.h.e2.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public n43 v() {
            return (n43) this.h.r4.get();
        }

        @Override // com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies
        public wt6 v0() {
            return (wt6) this.h.T4.get();
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent
        public ap0.a v2() {
            return new h(this.h, this.i);
        }

        @Override // com.dodopizza.activeorder.feature.orderdetails.OrderDetailsFeatureDependencies, com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies, com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardFeatureDependencies, ru.dodopizza.app.di.modules.presentation.product.card.halves.HalvesProductCardFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, com.dodopizza.order.feature.halves.HalvesFeatureDependencies
        public e78 w() {
            return this.G.get();
        }

        @Override // com.dodopizza.contacts.feature.feedback.FeedbackFeatureDependencies
        public DodopizzaApi w0() {
            return (DodopizzaApi) this.h.f1.get();
        }

        @Override // com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies
        public gc w1() {
            return (gc) this.h.Y.get();
        }

        @Override // com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies
        public fj7 w3() {
            return bk7.a((f63) this.h.s3.get());
        }

        @Override // com.dodopizza.chat.feature.chat.NativeChatFeatureDependencies, ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies
        public bo x() {
            return this.h.x();
        }

        @Override // com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies
        public dt5 x1() {
            return this.j.get();
        }

        @Override // com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies
        public cz6 x3() {
            return this.I.get();
        }

        @Override // com.dodopizza.activeorder.feature.ordersummary.OrderSummaryFeatureDependencies, ru.dodopizza.app.di.modules.presentation.profile.ProfileFeatureDependencies, com.dodopizza.loyalty.referralsystem.di.ReferralSystemFeatureDependencies, com.dodopizza.loyalty.menu.di.LoyaltyDependencies, com.dodopizza.loyalty.missions.di.LoyaltyMissionDetailsDependencies, com.dodopizza.loyalty.stacksgame.di.StackGameDependencies
        public x26 y() {
            return h06.a(Z4());
        }

        @Override // com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies, com.dodopizza.profile.feature.profilesettings.ProfileSettingsDependencies
        public dua y0() {
            return this.h.y0();
        }

        @Override // com.dodopizza.geo.domain.OnDeliveryLocationSelectedDependencies
        public com.dodopizza.geo.feature.deliveryaddresslist.presentation.d y1() {
            return this.w0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies, com.dodopizza.order.feature.shoppingcart.ShoppingCartFeatureDependencies
        public e98 z() {
            return (e98) this.h.m4.get();
        }

        @Override // com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies
        public hq3 z0() {
            return (hq3) this.h.G0.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.product.card.combo.ComboProductCardFeatureDependencies
        public gi1 z1() {
            return ph1.c(this.j0.get(), (mxa) this.h.I1.get(), this.e0.get(), this.F.get(), (ds0) this.h.I5.get(), (c62) this.h.Y0.get(), oh1.c());
        }

        private LocalityComponentImpl(AppComponentImpl appComponentImpl, yp8 yp8Var, qx1 qx1Var) {
            this.i = this;
            this.h = appComponentImpl;
            this.g = yp8Var;
            X4(yp8Var, qx1Var);
        }
    }

    /* loaded from: classes3.dex */
    private static final class a implements y7.a {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private f63 c;
        private Boolean d;
        private s6 e;
        private Activity f;

        @Override // defpackage.y7.a
        public y7 a() {
            jh8.a(this.c, f63.class);
            jh8.a(this.d, Boolean.class);
            jh8.a(this.e, s6.class);
            jh8.a(this.f, Activity.class);
            return new b(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        @Override // defpackage.y7.a
        /* renamed from: f */
        public a d(boolean z) {
            this.d = (Boolean) jh8.b(Boolean.valueOf(z));
            return this;
        }

        @Override // defpackage.y7.a
        /* renamed from: g */
        public a e(Activity activity) {
            this.f = (Activity) jh8.b(activity);
            return this;
        }

        @Override // defpackage.y7.a
        /* renamed from: h */
        public a b(f63 f63Var) {
            this.c = (f63) jh8.b(f63Var);
            return this;
        }

        @Override // defpackage.y7.a
        /* renamed from: i */
        public a c(s6 s6Var) {
            this.e = (s6) jh8.b(s6Var);
            return this;
        }

        private a(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class a0 implements x34 {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private final a0 c;
        private as8<he6> d;
        private as8<lp3> e;
        private as8<zd6> f;
        private as8<fj6> g;
        private as8<z83> h;
        private as8<ze6> i;
        private as8<ue6> j;
        private as8<ff6> k;
        private as8<lh6> l;
        private as8<d44> m;
        private as8<InAppNotificationApi> n;
        private as8<sy4> o;
        private as8<py4> p;
        private as8<FoodMenuPresenter> q;

        private void b() {
            this.d = n44.a(this.a.R4, this.b.j0, this.b.n0);
            this.e = g44.a(this.b.b0, this.a.G1, this.a.V0);
            this.f = m44.a(this.b.j0);
            this.g = o44.a(this.a.j0, this.a.G0, this.a.d5, this.a.T5);
            this.h = df6.a(this.a.G0, this.a.E0);
            this.i = ef6.a(this.a.G0, this.b.R0, this.h);
            this.j = ve6.a(this.a.K);
            this.k = gf6.a(this.a.G0, this.b.j0, this.a.H5, this.j);
            this.l = mh6.a(this.a.G0, this.a.G5);
            this.m = h44.a(this.b.j0, this.a.d5, this.b.n, this.a.d0, this.b.j, this.a.N, this.a.j0, this.a.G0, this.b.D0, this.a.I5, this.a.Y, this.a.J5, this.d, this.e, this.b.G, this.f, this.b.U, this.g, this.i, this.b.e0, this.a.D0, this.k, this.a.G5, this.l, this.a.k4);
            j44 a = j44.a(this.a.V);
            this.n = a;
            k44 a2 = k44.a(a, this.a.G0);
            this.o = a2;
            this.p = l44.a(a2, this.a.G0);
            this.q = q44.a(this.a.s3, this.a.i3, this.b.n, this.a.a0, this.a.O5, this.b.z0, this.m, this.b.s0, this.p, this.b.L0, this.a.Y, this.a.G0, this.b.j, this.a.k4, this.b.T0, this.b.N0, this.a.d0, this.a.T, this.l, this.b.v0);
        }

        private b44 c(b44 b44Var) {
            c44.c(b44Var, this.q);
            c44.e(b44Var, d());
            c44.f(b44Var, q18.a());
            c44.d(b44Var, (f5b) this.a.G3.get());
            c44.a(b44Var, (gc) this.a.Y.get());
            c44.b(b44Var, i44.a());
            return b44Var;
        }

        private o5b d() {
            return p44.a((hq3) this.a.G0.get());
        }

        @Override // defpackage.x34
        public void a(b44 b44Var) {
            c(b44Var);
        }

        private a0(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.c = this;
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
            b();
        }
    }

    /* loaded from: classes3.dex */
    private static final class b implements y7 {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private final b c;
        private as8<Activity> d;
        private as8<dza> e;
        private as8<np4> f;
        private as8<t7> g;
        private as8<ws3> h;
        private as8<j54> i;
        private as8<h54> j;
        private as8<Boolean> k;
        private as8<f63> l;
        private as8<r6> m;
        private as8<dt9> n;
        private as8<s6> o;
        private as8<DeliveryAddressPresenter> p;

        private void b(f63 f63Var, Boolean bool, s6 s6Var, Activity activity) {
            this.d = z45.a(activity);
            this.e = p63.a(qj1.a(this.a.f1, this.a.N, this.b.j));
            as8<np4> a = p63.a(oj1.a(this.a.f1, this.a.N, this.b.j));
            this.f = a;
            this.g = p63.a(e8.a(this.e, a));
            as8<ws3> a2 = p63.a(b8.a(this.a.p));
            this.h = a2;
            as8<j54> a3 = p63.a(a8.a(this.d, this.g, a2, this.b.l));
            this.i = a3;
            this.j = p63.a(c8.a(a3));
            this.k = z45.a(bool);
            this.l = z45.a(f63Var);
            this.m = p63.a(nj1.a(this.a.j0, this.a.c2, this.a.b4, this.a.f1));
            this.n = p63.a(pj1.a(this.a.E4));
            this.o = z45.a(s6Var);
            this.p = p63.a(f8.a(this.k, this.l, this.m, this.n, this.a.Y, this.o));
        }

        private bv2 c(bv2 bv2Var) {
            cv2.a(bv2Var, this.j.get());
            cv2.b(bv2Var, this.p);
            return bv2Var;
        }

        @Override // defpackage.y7
        public void a(bv2 bv2Var) {
            c(bv2Var);
        }

        private b(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl, f63 f63Var, Boolean bool, s6 s6Var, Activity activity) {
            this.c = this;
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
            b(f63Var, bool, s6Var, activity);
        }
    }

    /* loaded from: classes3.dex */
    private static final class b0 implements LocalityComponent.a {
        private final AppComponentImpl a;
        private qx1 b;

        @Override // ru.dodopizza.app.di.locality.LocalityComponent.a
        public LocalityComponent a() {
            jh8.a(this.b, qx1.class);
            return new LocalityComponentImpl(this.a, new yp8(), this.b);
        }

        @Override // ru.dodopizza.app.di.locality.LocalityComponent.a
        /* renamed from: c */
        public b0 b(qx1 qx1Var) {
            this.b = (qx1) jh8.b(qx1Var);
            return this;
        }

        private b0(AppComponentImpl appComponentImpl) {
            this.a = appComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class c implements o8.a {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private f63 c;
        private cl2<n8> d;
        private s8 e;

        @Override // defpackage.o8.a
        public o8 a() {
            jh8.a(this.c, f63.class);
            jh8.a(this.d, cl2.class);
            jh8.a(this.e, s8.class);
            return new d(this.a, this.b, new l61(), this.c, this.d, this.e);
        }

        @Override // defpackage.o8.a
        /* renamed from: e */
        public c c(cl2<n8> cl2Var) {
            this.d = (cl2) jh8.b(cl2Var);
            return this;
        }

        @Override // defpackage.o8.a
        /* renamed from: f */
        public c d(s8 s8Var) {
            this.e = (s8) jh8.b(s8Var);
            return this;
        }

        @Override // defpackage.o8.a
        /* renamed from: g */
        public c b(f63 f63Var) {
            this.c = (f63) jh8.b(f63Var);
            return this;
        }

        private c(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class c0 implements z46.a {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;

        @Override // defpackage.z46.a
        public z46 a(n56 n56Var) {
            jh8.b(n56Var);
            return new d0(this.a, this.b, n56Var);
        }

        private c0(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class d implements o8 {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private final d c;
        private as8<cl2<n8>> d;
        private as8<s8> e;
        private as8<h61> f;
        private as8<f61> g;
        private as8<e61> h;
        private as8<t61> i;
        private as8<ru.dodopizza.app.presentation.addresslist.i> j;
        private as8<ru.dodopizza.app.presentation.addresslist.d> k;
        private as8<f63> l;
        private as8<y8> m;
        private as8<AddressListPresenter> n;

        private void b(l61 l61Var, f63 f63Var, cl2<n8> cl2Var, s8 s8Var) {
            this.d = z45.a(cl2Var);
            this.e = z45.a(s8Var);
            this.f = p63.a(p61.a(l61Var));
            as8<f61> a = p63.a(g61.a(this.a.E4, this.a.m4, this.a.d5, this.a.G0, this.f, this.a.T5, this.a.j0, this.a.U5, this.a.D, this.b.X, this.a.d0, this.b.j, this.b.l, bp7.a()));
            this.g = a;
            this.h = r61.a(l61Var, a);
            this.i = p63.a(s61.a(l61Var, this.b.R, this.h, this.b.T, this.a.j0));
            this.j = p63.a(x8.a(this.a.S5, this.a.u4, this.a.G0, this.a.N, this.i, this.b.j));
            this.k = p63.a(v8.a(this.a.E4, this.a.b4, this.b.O, this.a.Y, this.a.E1, this.e, this.j));
            no3 a2 = z45.a(f63Var);
            this.l = a2;
            this.m = p63.a(u8.a(a2, this.e, this.b.j, this.a.d5));
            this.n = p63.a(w8.a(this.a.Y, this.d, this.k, this.m, this.a.G0, this.b.j, this.e));
        }

        @Override // defpackage.o8
        public AddressListPresenter a() {
            return this.n.get();
        }

        private d(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl, l61 l61Var, f63 f63Var, cl2<n8> cl2Var, s8 s8Var) {
            this.c = this;
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
            b(l61Var, f63Var, cl2Var, s8Var);
        }
    }

    /* loaded from: classes3.dex */
    private static final class d0 implements z46 {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private final d0 c;
        private as8<u2c> d;
        private as8<ru.dodopizza.app.presentation.mainscreen.a> e;
        private as8<qt6> f;
        private as8<n56> g;
        private as8<MainScreenPresenter> h;

        private void b(n56 n56Var) {
            this.d = p63.a(l56.a(this.b.U, this.b.X, this.a.D));
            this.e = p63.a(g56.a(this.a.d5, this.a.Y0, this.b.j0, this.b.D0, this.a.G0, this.a.d0, this.a.j0, this.a.c2, this.a.F4, this.b.j, this.b.l, this.b.n, this.b.u0, this.d, this.b.U, this.b.E0, this.a.f0, this.b.y0, this.a.d2));
            this.f = p63.a(rt6.a(this.a.r3, this.a.F4, this.a.d0, this.b.n, du6.a(), this.b.E, this.a.d2));
            this.g = z45.a(n56Var);
            this.h = p63.a(m56.a(this.e, this.a.a0, this.a.s3, this.b.H0, this.b.v0, this.a.T4, this.f, this.b.L0, k56.a(), this.a.G0, this.g, this.b.N0, this.a.v, this.a.S));
        }

        private d56 c(d56 d56Var) {
            f56.a(d56Var, this.h);
            return d56Var;
        }

        @Override // defpackage.z46
        public void a(d56 d56Var) {
            c(d56Var);
        }

        private d0(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl, n56 n56Var) {
            this.c = this;
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
            b(n56Var);
        }
    }

    /* loaded from: classes3.dex */
    private static final class e implements mb {
        private final AppComponentImpl a;
        private final e b;
        private as8<cf4> c;
        private as8<AllPizzeriasPresenter> d;

        private void b() {
            this.c = sb.a(this.a.N, this.a.D4);
            this.d = rb.a(this.a.s3, this.c);
        }

        private ob c(ob obVar) {
            pb.a(obVar, (je4) this.a.q4.get());
            pb.b(obVar, this.d);
            return obVar;
        }

        @Override // defpackage.mb
        public void a(ob obVar) {
            c(obVar);
        }

        private e(AppComponentImpl appComponentImpl) {
            this.b = this;
            this.a = appComponentImpl;
            b();
        }
    }

    /* loaded from: classes3.dex */
    private static final class e0 implements zk7 {
        private final l61 a;
        private final AppComponentImpl b;
        private final LocalityComponentImpl c;
        private final e0 d;
        private as8<com.dodopizza.order.feature.menu.ordertypeswitcher.c> e;
        private as8<h61> f;
        private as8<f61> g;
        private as8<e61> h;
        private as8<c61> i;
        private as8<t61> j;
        private as8<ad> k;
        private as8<v61> l;
        private as8<com.dodopizza.order.feature.menu.ordertypeswitcher.d> m;
        private as8<ul7> n;
        private as8<x1b> o;
        private as8<r75> p;
        private as8<OrderTypeSwitcherPresenter> q;

        private void b() {
            this.e = p63.a(ol7.a(this.b.s3, this.c.j, this.c.l));
            this.f = p63.a(p61.a(this.a));
            as8<f61> a = p63.a(g61.a(this.b.E4, this.b.m4, this.b.d5, this.b.G0, this.f, this.b.T5, this.b.j0, this.b.U5, this.b.D, this.c.X, this.b.d0, this.c.j, this.c.l, bp7.a()));
            this.g = a;
            this.h = r61.a(this.a, a);
            this.i = p63.a(o61.a(this.a, this.c.T, this.h, this.f));
            this.j = p63.a(s61.a(this.a, this.c.R, this.h, this.c.T, this.b.j0));
            as8<ad> a2 = p63.a(m61.a(this.a, this.b.j0, this.b.r0, this.b.Y, this.b.G4, this.b.U5));
            this.k = a2;
            this.l = p63.a(q61.a(this.a, this.i, this.j, a2, this.c.Q, this.f, this.b.d0, this.b.G0));
            this.m = p63.a(ml7.a(this.b.E0, this.l, this.b.E4, this.b.d0, this.b.G0, this.b.I3, this.c.j, this.b.m4, rk7.a(), this.c.Y, this.b.j0, this.b.D0, this.b.F4, this.b.c2));
            this.n = p63.a(ql7.a(this.c.O, this.b.G0, this.b.n4));
            this.o = p63.a(pl7.a(this.c.O));
            this.p = nl7.a(this.b.Y2);
            this.q = p63.a(rl7.a(this.e, this.m, this.n, this.b.F4, this.b.G0, this.b.E0, this.b.o4, this.b.B2, this.b.p4, this.b.Y, this.b.a0, this.o, this.p, this.b.Y5, this.b.v, this.b.G3));
        }

        private jl7 c(jl7 jl7Var) {
            kl7.b(jl7Var, this.q);
            kl7.a(jl7Var, (je4) this.b.q4.get());
            return jl7Var;
        }

        @Override // defpackage.zk7
        public void a(jl7 jl7Var) {
            c(jl7Var);
        }

        private e0(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.d = this;
            this.b = appComponentImpl;
            this.c = localityComponentImpl;
            this.a = new l61();
            b();
        }
    }

    /* loaded from: classes3.dex */
    private static final class f implements ni0.a {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private si0 c;

        @Override // defpackage.ni0.a
        public ni0 a() {
            jh8.a(this.c, si0.class);
            return new g(this.a, this.b, this.c);
        }

        @Override // defpackage.ni0.a
        /* renamed from: c */
        public f b(si0 si0Var) {
            this.c = (si0) jh8.b(si0Var);
            return this;
        }

        private f(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class f0 implements ht7.a {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private f63 c;
        private j4c d;
        private Long e;

        @Override // defpackage.ht7.a
        public ht7 a() {
            jh8.a(this.c, f63.class);
            jh8.a(this.d, j4c.class);
            jh8.a(this.e, Long.class);
            return new g0(this.a, this.b, this.c, this.d, this.e);
        }

        @Override // defpackage.ht7.a
        /* renamed from: e */
        public f0 b(f63 f63Var) {
            this.c = (f63) jh8.b(f63Var);
            return this;
        }

        @Override // defpackage.ht7.a
        /* renamed from: f */
        public f0 c(j4c j4cVar) {
            this.d = (j4c) jh8.b(j4cVar);
            return this;
        }

        @Override // defpackage.ht7.a
        /* renamed from: g */
        public f0 d(long j) {
            this.e = (Long) jh8.b(Long.valueOf(j));
            return this;
        }

        private f0(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class g implements ni0 {
        private final si0 a;
        private final AppComponentImpl b;
        private final LocalityComponentImpl c;
        private final g d;
        private as8<si0> e;
        private as8<ui0> f;
        private as8<BuyMorePresenter> g;

        private void b(si0 si0Var) {
            no3 a = z45.a(si0Var);
            this.e = a;
            this.f = cj0.a(a, this.b.I5, this.b.R4, this.b.J5, this.b.Y);
            this.g = fj0.a(this.b.s3, this.f, this.b.Y);
        }

        private qi0 c(qi0 qi0Var) {
            ri0.a(qi0Var, this.g);
            return qi0Var;
        }

        @Override // defpackage.ni0
        public void a(qi0 qi0Var) {
            c(qi0Var);
        }

        private g(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl, si0 si0Var) {
            this.d = this;
            this.b = appComponentImpl;
            this.c = localityComponentImpl;
            this.a = si0Var;
            b(si0Var);
        }
    }

    /* loaded from: classes3.dex */
    private static final class g0 implements ht7 {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private final g0 c;
        private as8<f63> d;
        private as8<j4c> e;
        private as8<Long> f;
        private as8<WebViewCardPaymentPresenter> g;

        private void b(f63 f63Var, j4c j4cVar, Long l) {
            this.d = z45.a(f63Var);
            this.e = z45.a(j4cVar);
            this.f = z45.a(l);
            this.g = p63.a(zt7.a(this.d, this.a.O5, this.b.z0, this.e, this.f));
        }

        @Override // defpackage.ht7
        public WebViewCardPaymentPresenter a() {
            return this.g.get();
        }

        private g0(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl, f63 f63Var, j4c j4cVar, Long l) {
            this.c = this;
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
            b(f63Var, j4cVar, l);
        }
    }

    /* loaded from: classes3.dex */
    private static final class h implements ap0.a {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private f63 c;

        @Override // defpackage.ap0.a
        public ap0 a() {
            jh8.a(this.c, f63.class);
            return new i(this.a, this.b, this.c);
        }

        @Override // defpackage.ap0.a
        /* renamed from: c */
        public h b(f63 f63Var) {
            this.c = (f63) jh8.b(f63Var);
            return this;
        }

        private h(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class h0 implements vw7 {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private final h0 c;
        private as8<xw7> d;
        private as8<PaymentWorkflowBrokenPresenter> e;

        private void b() {
            as8<xw7> a = p63.a(ax7.a(this.a.U0, this.a.N, this.a.D4, this.a.m4));
            this.d = a;
            this.e = p63.a(bx7.a(a));
        }

        @Override // defpackage.vw7
        public PaymentWorkflowBrokenPresenter a() {
            return this.e.get();
        }

        private h0(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.c = this;
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
            b();
        }
    }

    /* loaded from: classes3.dex */
    private static final class i implements ap0 {
        private final f63 a;
        private final AppComponentImpl b;
        private final LocalityComponentImpl c;
        private final i d;

        private ep0 b() {
            return ip0.a((vo0) this.b.x5.get());
        }

        private np0 c() {
            return jp0.a(this.a);
        }

        @Override // defpackage.ap0
        public CardPaymentPresenter a() {
            return kp0.a(this.a, b(), (ava) this.b.j0.get(), (hq3) this.b.G0.get(), m25.c(this.b.g), (gc) this.b.Y.get(), c());
        }

        private i(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl, f63 f63Var) {
            this.d = this;
            this.b = appComponentImpl;
            this.c = localityComponentImpl;
            this.a = f63Var;
        }
    }

    /* loaded from: classes3.dex */
    private static final class i0 implements m38.a {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private ru.dodopizza.app.presentation.phonenumberlogin.e c;

        @Override // defpackage.m38.a
        public m38 a() {
            jh8.a(this.c, ru.dodopizza.app.presentation.phonenumberlogin.e.class);
            return new j0(this.a, this.b, this.c);
        }

        @Override // defpackage.m38.a
        /* renamed from: c */
        public i0 b(ru.dodopizza.app.presentation.phonenumberlogin.e eVar) {
            this.c = (ru.dodopizza.app.presentation.phonenumberlogin.e) jh8.b(eVar);
            return this;
        }

        private i0(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class j implements gt0.a {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private String c;
        private Boolean d;

        @Override // defpackage.gt0.a
        public gt0 a() {
            jh8.a(this.c, String.class);
            jh8.a(this.d, Boolean.class);
            return new k(this.a, this.b, this.c, this.d);
        }

        @Override // defpackage.gt0.a
        /* renamed from: d */
        public j b(boolean z) {
            this.d = (Boolean) jh8.b(Boolean.valueOf(z));
            return this;
        }

        @Override // defpackage.gt0.a
        /* renamed from: e */
        public j c(String str) {
            this.c = (String) jh8.b(str);
            return this;
        }

        private j(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class j0 implements m38 {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private final j0 c;
        private as8<ru.dodopizza.app.presentation.phonenumberlogin.b> d;
        private as8<r38> e;
        private as8<ru.dodopizza.app.presentation.phonenumberlogin.e> f;
        private as8<ru.dodopizza.app.presentation.phonenumberlogin.a> g;
        private as8<PhoneNumberLoginPresenter> h;

        private void b(ru.dodopizza.app.presentation.phonenumberlogin.e eVar) {
            this.d = p63.a(v38.a());
            this.e = u38.a(this.a.G0, this.b.j, this.a.D4, this.a.U0, this.a.b0, this.d);
            this.f = z45.a(eVar);
            this.g = p63.a(t38.a());
            this.h = w38.a(this.a.s3, this.a.Y, this.e, this.a.P5, this.f, this.a.Q5, this.g, this.b.l, this.a.G0);
        }

        private p38 c(p38 p38Var) {
            q38.a(p38Var, this.h);
            return p38Var;
        }

        @Override // defpackage.m38
        public void a(p38 p38Var) {
            c(p38Var);
        }

        private j0(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl, ru.dodopizza.app.presentation.phonenumberlogin.e eVar) {
            this.c = this;
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
            b(eVar);
        }
    }

    /* loaded from: classes3.dex */
    private static final class k implements gt0 {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private final k c;
        private as8<String> d;
        private as8<Boolean> e;
        private as8<lt0> f;
        private as8<CatchAddressPresenter> g;

        private void b(String str, Boolean bool) {
            this.d = z45.a(str);
            this.e = z45.a(bool);
            this.f = p63.a(ot0.a(this.a.f1, this.a.E4, this.a.E1, this.a.Y, this.b.M));
            this.g = p63.a(pt0.a(this.d, this.e, this.a.s3, this.f, this.a.d0));
        }

        @Override // defpackage.gt0
        public CatchAddressPresenter a() {
            return this.g.get();
        }

        private k(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl, String str, Boolean bool) {
            this.c = this;
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
            b(str, bool);
        }
    }

    /* loaded from: classes3.dex */
    private static final class k0 implements l48.a {
        private final AppComponentImpl a;
        private f63 b;
        private b7a c;

        @Override // defpackage.l48.a
        public l48 a() {
            jh8.a(this.b, f63.class);
            jh8.a(this.c, b7a.class);
            return new l0(this.a, this.b, this.c);
        }

        @Override // defpackage.l48.a
        /* renamed from: d */
        public k0 c(b7a b7aVar) {
            this.c = (b7a) jh8.b(b7aVar);
            return this;
        }

        @Override // defpackage.l48.a
        /* renamed from: e */
        public k0 b(f63 f63Var) {
            this.b = (f63) jh8.b(f63Var);
            return this;
        }

        private k0(AppComponentImpl appComponentImpl) {
            this.a = appComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class l implements ib1.a {
        private final AppComponentImpl a;
        private rb1 b;

        @Override // defpackage.ib1.a
        public ib1 a() {
            jh8.a(this.b, rb1.class);
            return new m(this.a, this.b);
        }

        @Override // defpackage.ib1.a
        /* renamed from: c */
        public l b(rb1 rb1Var) {
            this.b = (rb1) jh8.b(rb1Var);
            return this;
        }

        private l(AppComponentImpl appComponentImpl) {
            this.a = appComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class l0 implements l48 {
        private final AppComponentImpl a;
        private final l0 b;
        private as8<b7a> c;
        private as8<z48> d;
        private as8<r48> e;
        private as8<f63> f;
        private as8<PhonePrefixListPresenter> g;

        private void b(f63 f63Var, b7a b7aVar) {
            this.c = z45.a(b7aVar);
            x48 a = x48.a(this.a.U0, this.a.Y3, this.a.G0, this.a.X3);
            this.d = a;
            this.e = w48.a(a);
            no3 a2 = z45.a(f63Var);
            this.f = a2;
            this.g = y48.a(this.c, this.e, a2);
        }

        private p48 c(p48 p48Var) {
            q48.a(p48Var, this.g);
            return p48Var;
        }

        @Override // defpackage.l48
        public void a(p48 p48Var) {
            c(p48Var);
        }

        private l0(AppComponentImpl appComponentImpl, f63 f63Var, b7a b7aVar) {
            this.b = this;
            this.a = appComponentImpl;
            b(f63Var, b7aVar);
        }
    }

    /* loaded from: classes3.dex */
    private static final class m implements ib1 {
        private final AppComponentImpl a;
        private final m b;
        private as8<rb1> c;
        private as8<CollaborationPromoPresenter> d;

        private void b(rb1 rb1Var) {
            no3 a = z45.a(rb1Var);
            this.c = a;
            this.d = p63.a(pb1.a(a, this.a.Y));
        }

        @Override // defpackage.ib1
        public CollaborationPromoPresenter a() {
            return this.d.get();
        }

        private m(AppComponentImpl appComponentImpl, rb1 rb1Var) {
            this.b = this;
            this.a = appComponentImpl;
            b(rb1Var);
        }
    }

    /* loaded from: classes3.dex */
    private static final class m0 implements e68.a {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private String c;
        private String d;
        private e.a e;

        @Override // defpackage.e68.a
        public e68 a() {
            jh8.a(this.c, String.class);
            jh8.a(this.d, String.class);
            jh8.a(this.e, e.a.class);
            return new n0(this.a, this.b, this.c, this.d, this.e);
        }

        @Override // defpackage.e68.a
        /* renamed from: e */
        public m0 b(String str) {
            this.d = (String) jh8.b(str);
            return this;
        }

        @Override // defpackage.e68.a
        /* renamed from: f */
        public m0 d(String str) {
            this.c = (String) jh8.b(str);
            return this;
        }

        @Override // defpackage.e68.a
        /* renamed from: g */
        public m0 c(e.a aVar) {
            this.e = (e.a) jh8.b(aVar);
            return this;
        }

        private m0(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class n implements zg1.a {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;

        @Override // defpackage.zg1.a
        public zg1 a() {
            return new o(this.a, this.b);
        }

        private n(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class n0 implements e68 {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private final n0 c;
        private as8<String> d;
        private as8<String> e;
        private as8<ru.dodopizza.app.presentation.phonenumberlogin.a> f;
        private as8<i68> g;
        private as8<e.a> h;
        private as8<PinCodeLoginPresenter> i;

        private void b(String str, String str2, e.a aVar) {
            this.d = z45.a(str);
            this.e = z45.a(str2);
            this.f = p63.a(l68.a());
            this.g = j68.a(this.b.n, this.a.b0, this.b.u0, this.a.c2, this.a.Y, this.a.h0, this.a.E1, this.f, this.b.j, this.b.l, this.a.c0, this.a.E4);
            this.h = z45.a(aVar);
            this.i = m68.a(this.a.s3, this.a.Y, this.d, this.e, this.g, this.h, this.f);
        }

        private ru.dodopizza.app.presentation.pincodelogin.a c(ru.dodopizza.app.presentation.pincodelogin.a aVar) {
            h68.a(aVar, (ru.dodopizza.app.presentation.pincodelogin.d) this.a.z4.get());
            h68.b(aVar, this.i);
            return aVar;
        }

        @Override // defpackage.e68
        public void a(ru.dodopizza.app.presentation.pincodelogin.a aVar) {
            c(aVar);
        }

        private n0(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl, String str, String str2, e.a aVar) {
            this.c = this;
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
            b(str, str2, aVar);
        }
    }

    /* loaded from: classes3.dex */
    private static final class o implements zg1 {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private final o c;

        private ah1 b() {
            return fh1.a((c62) this.a.Y0.get(), (mxa) this.a.I1.get());
        }

        @Override // defpackage.zg1
        public ComboCustomizeBuilderPresenter a() {
            return gh1.a(b(), (gy3) this.a.E0.get(), (ld9) this.a.D0.get());
        }

        private o(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.c = this;
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class o0 implements cy9 {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private final o0 c;
        private as8<zd6> d;
        private as8<z83> e;
        private as8<ze6> f;
        private as8<hy9> g;
        private as8<SearchPresenter> h;

        private void b() {
            this.d = my9.a(this.b.j0);
            this.e = df6.a(this.a.G0, this.a.E0);
            this.f = ef6.a(this.a.G0, this.b.R0, this.e);
            as8<hy9> a = p63.a(oy9.a(this.b.j0, this.b.G, this.d, this.f));
            this.g = a;
            this.h = p63.a(ny9.a(a, this.a.a0, this.a.s3, this.a.Y, this.b.N0));
        }

        private fy9 c(fy9 fy9Var) {
            gy9.a(fy9Var, this.h);
            gy9.c(fy9Var, q18.a());
            gy9.b(fy9Var, (f5b) this.a.G3.get());
            return fy9Var;
        }

        @Override // defpackage.cy9
        public void a(fy9 fy9Var) {
            c(fy9Var);
        }

        private o0(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.c = this;
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
            b();
        }
    }

    /* loaded from: classes3.dex */
    private static final class p implements ji1.a {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private String c;
        private Integer d;
        private String e;
        private ym.d f;

        @Override // defpackage.ji1.a
        public ji1 a() {
            jh8.a(this.c, String.class);
            jh8.a(this.d, Integer.class);
            jh8.a(this.e, String.class);
            jh8.a(this.f, ym.d.class);
            return new q(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        @Override // defpackage.ji1.a
        /* renamed from: f */
        public p e(String str) {
            this.c = (String) jh8.b(str);
            return this;
        }

        @Override // defpackage.ji1.a
        /* renamed from: g */
        public p d(int i) {
            this.d = (Integer) jh8.b(Integer.valueOf(i));
            return this;
        }

        @Override // defpackage.ji1.a
        /* renamed from: h */
        public p b(ym.d dVar) {
            this.f = (ym.d) jh8.b(dVar);
            return this;
        }

        @Override // defpackage.ji1.a
        /* renamed from: i */
        public p c(String str) {
            this.e = (String) jh8.b(str);
            return this;
        }

        private p(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class p0 implements d3a.a {
        private final AppComponentImpl a;
        private f63 b;
        private rs7 c;

        @Override // defpackage.d3a.a
        public d3a a() {
            jh8.a(this.b, f63.class);
            jh8.a(this.c, rs7.class);
            return new q0(this.a, this.b, this.c);
        }

        @Override // defpackage.d3a.a
        /* renamed from: d */
        public p0 c(rs7 rs7Var) {
            this.c = (rs7) jh8.b(rs7Var);
            return this;
        }

        @Override // defpackage.d3a.a
        /* renamed from: e */
        public p0 b(f63 f63Var) {
            this.b = (f63) jh8.b(f63Var);
            return this;
        }

        private p0(AppComponentImpl appComponentImpl) {
            this.a = appComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class q implements ji1 {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private final q c;
        private as8<String> d;
        private as8<Integer> e;
        private as8<String> f;
        private as8<ym.d> g;
        private as8<qi1> h;
        private as8<ah1> i;
        private as8<ComboTemplateConstructorPresenter> j;

        private void b(String str, Integer num, String str2, ym.d dVar) {
            this.d = z45.a(str);
            this.e = z45.a(num);
            this.f = z45.a(str2);
            this.g = z45.a(dVar);
            this.h = p63.a(wi1.a(this.b.j0, this.a.Y0, this.a.I1, this.b.e0, this.a.G0));
            vi1 a = vi1.a(this.a.Y0, this.a.I1);
            this.i = a;
            this.j = p63.a(xi1.a(this.d, this.e, this.f, this.g, this.h, a, this.a.Y));
        }

        private oi1 c(oi1 oi1Var) {
            pi1.a(oi1Var, (jn6) this.b.w.get());
            pi1.b(oi1Var, this.j);
            return oi1Var;
        }

        @Override // defpackage.ji1
        public void a(oi1 oi1Var) {
            c(oi1Var);
        }

        private q(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl, String str, Integer num, String str2, ym.d dVar) {
            this.c = this;
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
            b(str, num, str2, dVar);
        }
    }

    /* loaded from: classes3.dex */
    private static final class q0 implements d3a {
        private final f63 a;
        private final rs7 b;
        private final AppComponentImpl c;
        private final q0 d;

        @Override // defpackage.d3a
        public Secure3dPresenter a() {
            return h3a.a(this.a, m25.c(this.c.g), (gc) this.c.Y.get(), this.b);
        }

        private q0(AppComponentImpl appComponentImpl, f63 f63Var, rs7 rs7Var) {
            this.d = this;
            this.c = appComponentImpl;
            this.a = f63Var;
            this.b = rs7Var;
        }
    }

    /* loaded from: classes3.dex */
    private static final class r implements ks1 {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private final r c;

        @Override // defpackage.ks1
        public ContactsPresenter a() {
            return ts1.a((f63) this.a.s3.get(), (i00) this.a.d0.get(), (k63) this.a.a0.get(), this.b.H0(), this.b.M0(), this.a.q7(), (gc) this.a.Y.get(), ss1.a(), (zt6) this.b.v0.get(), (wt6) this.a.T4.get(), (hq3) this.a.G0.get());
        }

        private r(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.c = this;
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class r0 implements q6a.a {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;

        @Override // defpackage.q6a.a
        public q6a a(r6a r6aVar) {
            jh8.b(r6aVar);
            return new s0(this.a, this.b, r6aVar);
        }

        private r0(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class s implements a02 {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private final s c;
        private as8<e02> d;
        private as8<CovidWarningPresenter> e;

        private void b() {
            this.d = p63.a(h02.a(this.b.V0));
            this.e = p63.a(i02.a(this.a.s3, this.d));
        }

        private b02 c(b02 b02Var) {
            c02.b(b02Var, (aub) this.a.N5.get());
            c02.a(b02Var, this.e);
            return b02Var;
        }

        @Override // defpackage.a02
        public void a(b02 b02Var) {
            c(b02Var);
        }

        private s(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.c = this;
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
            b();
        }
    }

    /* loaded from: classes3.dex */
    private static final class s0 implements q6a {
        private final r6a a;
        private final AppComponentImpl b;
        private final LocalityComponentImpl c;
        private final s0 d;

        @Override // defpackage.q6a
        public SelectOrderTypePresenter a() {
            return w6a.a((f63) this.b.s3.get(), this.a, (gc) this.b.Y.get(), (hq3) this.b.G0.get());
        }

        private s0(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl, r6a r6aVar) {
            this.d = this;
            this.b = appComponentImpl;
            this.c = localityComponentImpl;
            this.a = r6aVar;
        }
    }

    /* loaded from: classes3.dex */
    private static final class t implements mn2.a {
        private final AppComponentImpl a;

        @Override // defpackage.mn2.a
        public mn2 a(a.C0563a.EnumC0564a enumC0564a) {
            jh8.b(enumC0564a);
            return new u(this.a, enumC0564a);
        }

        private t(AppComponentImpl appComponentImpl) {
            this.a = appComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class t0 implements wra {
        private final AppComponentImpl a;
        private final t0 b;

        @Override // defpackage.wra
        public SplashActivityPresenter a() {
            return new SplashActivityPresenter(this.a.x());
        }

        private t0(AppComponentImpl appComponentImpl) {
            this.b = this;
            this.a = appComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class u implements mn2 {
        private final a.C0563a.EnumC0564a a;
        private final AppComponentImpl b;
        private final u c;

        @Override // defpackage.mn2
        public DebugPreferencePresenter a() {
            return qn2.a((ci8) this.b.t.get(), (ug7) this.b.D1.get(), (f89) this.b.r.get(), b(), (ut8) this.b.f0.get(), this.a, (s80) this.b.J.get(), (ld0) this.b.w.get(), y15.c(this.b.g));
        }

        public uj3 b() {
            return new uj3((Context) this.b.p.get(), (s80) this.b.J.get(), this.b.p7());
        }

        private u(AppComponentImpl appComponentImpl, a.C0563a.EnumC0564a enumC0564a) {
            this.c = this;
            this.b = appComponentImpl;
            this.a = enumC0564a;
        }
    }

    /* loaded from: classes3.dex */
    private static final class u0 implements y8b {
        private final AppComponentImpl a;
        private final u0 b;

        private a9b b() {
            return c9b.a((DodopizzaApi) this.a.f1.get());
        }

        @Override // defpackage.y8b
        public TemporarilyBlockPresenter a() {
            return d9b.a(b(), (ci8) this.a.t.get());
        }

        private u0(AppComponentImpl appComponentImpl) {
            this.b = this;
            this.a = appComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class v implements mx2.a {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private f63 c;
        private rx2 d;

        @Override // defpackage.mx2.a
        public mx2 a() {
            jh8.a(this.c, f63.class);
            jh8.a(this.d, rx2.class);
            return new w(this.a, this.b, new vx2(), this.c, this.d);
        }

        @Override // defpackage.mx2.a
        /* renamed from: d */
        public v c(rx2 rx2Var) {
            this.d = (rx2) jh8.b(rx2Var);
            return this;
        }

        @Override // defpackage.mx2.a
        /* renamed from: e */
        public v b(f63 f63Var) {
            this.c = (f63) jh8.b(f63Var);
            return this;
        }

        private v(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class w implements mx2 {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private final w c;
        private as8<f63> d;
        private as8<sx2> e;
        private as8<rx2> f;
        private as8<DeliveryLocationDetailsPresenter> g;

        private void b(vx2 vx2Var, f63 f63Var, rx2 rx2Var) {
            this.d = z45.a(f63Var);
            this.e = p63.a(xx2.a(vx2Var, this.a.S5, this.b.P0, this.a.X5, this.b.l));
            no3 a = z45.a(rx2Var);
            this.f = a;
            this.g = p63.a(yx2.a(vx2Var, this.d, this.e, a, this.a.G0, this.a.Y, this.b.l));
        }

        @Override // defpackage.mx2
        public DeliveryLocationDetailsPresenter a() {
            return this.g.get();
        }

        private w(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl, vx2 vx2Var, f63 f63Var, rx2 rx2Var) {
            this.c = this;
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
            b(vx2Var, f63Var, rx2Var);
        }
    }

    /* loaded from: classes3.dex */
    private static final class x implements di3.a {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;

        @Override // defpackage.di3.a
        public di3 a(ei3 ei3Var) {
            jh8.b(ei3Var);
            return new y(this.a, this.b, ei3Var);
        }

        private x(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl) {
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class y implements di3 {
        private final AppComponentImpl a;
        private final LocalityComponentImpl b;
        private final y c;
        private as8<ei3> d;
        private as8<ji3> e;
        private as8<EnterNamePresenter> f;

        private void b(ei3 ei3Var) {
            this.d = z45.a(ei3Var);
            as8<ji3> a = p63.a(ki3.a(this.b.n, this.a.Y));
            this.e = a;
            this.f = p63.a(mi3.a(this.d, a, this.a.s3, this.a.Y));
        }

        @Override // defpackage.di3
        public EnterNamePresenter a() {
            return this.f.get();
        }

        private y(AppComponentImpl appComponentImpl, LocalityComponentImpl localityComponentImpl, ei3 ei3Var) {
            this.c = this;
            this.a = appComponentImpl;
            this.b = localityComponentImpl;
            b(ei3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class z implements AppComponent.b {
        private z() {
        }

        @Override // ru.dodopizza.app.di.AppComponent.b
        public AppComponent a(Application application, tj3 tj3Var, gl9 gl9Var, m15 m15Var) {
            jh8.b(application);
            jh8.b(tj3Var);
            jh8.b(gl9Var);
            jh8.b(m15Var);
            return new AppComponentImpl(new qk8(), gl9Var, new vu6(), new tg9(), m15Var, new rz(), new p43(), application, tj3Var);
        }
    }

    public static AppComponent.b a() {
        return new z();
    }
}
