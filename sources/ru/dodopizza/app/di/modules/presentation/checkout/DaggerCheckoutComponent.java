package ru.dodopizza.app.di.modules.presentation.checkout;

import android.content.Context;
import com.dodopizza.order.feature.checkout.sbp.presentation.SbpBankListPresenter;
import defpackage.c41;
import defpackage.df3;
import defpackage.iu9;
import defpackage.js0;
import defpackage.kt7;
import defpackage.t7b;
import defpackage.ts2;
import ru.dodopizza.app.presentation.checkout.cashcharge.CashChargePresenter;
import ru.dodopizza.app.presentation.checkout.deferredtime.DeferredTimePresenter;
import ru.dodopizza.app.presentation.checkout.deliverytotable.TableNumberSelectionPresenter;
import ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter;
import ru.dodopizza.app.presentation.checkout.emailforchecks.EmailForChecksPresenter;
import ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListPresenter;
import ru.dodopizza.app.presentation.checkout.taxpayerid.TaxPayerIdPresenter;
import ru.dodopizza.backend.domain.payment.dto.sbp.SbpBankListAPI;
/* loaded from: classes3.dex */
public final class DaggerCheckoutComponent {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class CheckoutComponentImpl implements CheckoutComponent {
        private as8<gc> A;
        private as8<qi8> B;
        private as8<t52> C;
        private as8<li7> D;
        private as8<ew7> E;
        private as8<dh4> F;
        private as8<vg7> G;
        private as8<ok7> H;
        private as8<tk7> I;
        private as8<bu9> J;
        private as8<vm> K;
        private as8<bo> L;
        private as8<kx1> M;
        private as8<f63> N;
        private as8<Context> O;
        private as8<wt9> P;
        private as8<ih4> Q;
        private as8<z7b> R;
        private as8<SbpBankListAPI> S;
        private as8<jn6> T;
        private as8<mn6> U;
        private as8<nt2> V;
        private as8<dv6> W;
        private final CheckoutComponentFeatureDependencies g;
        private final CheckoutComponentImpl h;
        private as8<f63> i;
        private as8<com.dodopizza.geo.feature.selectdeliveryaddress.a> j;
        private as8<jgb> k;
        private as8<hq3> l;
        private as8<t41> m;
        private as8<x42> n;
        private as8<e98> o;
        private as8<fq0> p;
        private as8<ej6> q;
        private as8<ava> r;
        private as8<j2c> s;
        private as8<f8c> t;
        private as8<x51> u;
        private as8<i00> v;
        private as8<dt5> w;
        private as8<ay1> x;
        private as8<pv0> y;
        private as8<a98> z;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class a implements as8<gc> {
            private final CheckoutComponentFeatureDependencies a;

            a(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class a0 implements as8<ew7> {
            private final CheckoutComponentFeatureDependencies a;

            a0(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ew7 get() {
                return (ew7) jh8.d(this.a.D2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class b implements as8<vm> {
            private final CheckoutComponentFeatureDependencies a;

            b(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public vm get() {
                return (vm) jh8.d(this.a.Q1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class b0 implements as8<a98> {
            private final CheckoutComponentFeatureDependencies a;

            b0(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public a98 get() {
                return (a98) jh8.d(this.a.s0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class c implements as8<bo> {
            private final CheckoutComponentFeatureDependencies a;

            c(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public bo get() {
                return (bo) jh8.d(this.a.x());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class c0 implements as8<e98> {
            private final CheckoutComponentFeatureDependencies a;

            c0(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public e98 get() {
                return (e98) jh8.d(this.a.z());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class d implements as8<i00> {
            private final CheckoutComponentFeatureDependencies a;

            d(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public i00 get() {
                return (i00) jh8.d(this.a.g());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class d0 implements as8<qi8> {
            private final CheckoutComponentFeatureDependencies a;

            d0(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public qi8 get() {
                return (qi8) jh8.d(this.a.F0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class e implements as8<fq0> {
            private final CheckoutComponentFeatureDependencies a;

            e(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public fq0 get() {
                return (fq0) jh8.d(this.a.h0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class e0 implements as8<wt9> {
            private final CheckoutComponentFeatureDependencies a;

            e0(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public wt9 get() {
                return (wt9) jh8.d(this.a.V3());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class f implements as8<pv0> {
            private final CheckoutComponentFeatureDependencies a;

            f(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public pv0 get() {
                return (pv0) jh8.d(this.a.N0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class f0 implements as8<bu9> {
            private final CheckoutComponentFeatureDependencies a;

            f0(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public bu9 get() {
                return (bu9) jh8.d(this.a.g1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class g implements as8<t41> {
            private final CheckoutComponentFeatureDependencies a;

            g(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public t41 get() {
                return (t41) jh8.d(this.a.a1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class g0 implements as8<SbpBankListAPI> {
            private final CheckoutComponentFeatureDependencies a;

            g0(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public SbpBankListAPI get() {
                return (SbpBankListAPI) jh8.d(this.a.d2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class h implements as8<x51> {
            private final CheckoutComponentFeatureDependencies a;

            h(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public x51 get() {
                return (x51) jh8.d(this.a.O0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class h0 implements as8<ava> {
            private final CheckoutComponentFeatureDependencies a;

            h0(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ava get() {
                return (ava) jh8.d(this.a.h());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class i implements as8<Context> {
            private final CheckoutComponentFeatureDependencies a;

            i(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public Context get() {
                return (Context) jh8.d(this.a.getContext());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class i0 implements as8<z7b> {
            private final CheckoutComponentFeatureDependencies a;

            i0(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public z7b get() {
                return (z7b) jh8.d(this.a.C2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class j implements as8<ay1> {
            private final CheckoutComponentFeatureDependencies a;

            j(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ay1 get() {
                return (ay1) jh8.d(this.a.S());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class j0 implements as8<jgb> {
            private final CheckoutComponentFeatureDependencies a;

            j0(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public jgb get() {
                return (jgb) jh8.d(this.a.J());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class k implements as8<x42> {
            private final CheckoutComponentFeatureDependencies a;

            k(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public x42 get() {
                return (x42) jh8.d(this.a.n());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class k0 implements as8<j2c> {
            private final CheckoutComponentFeatureDependencies a;

            k0(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public j2c get() {
                return (j2c) jh8.d(this.a.E0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class l implements as8<t52> {
            private final CheckoutComponentFeatureDependencies a;

            l(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public t52 get() {
                return (t52) jh8.d(this.a.m());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class l0 implements as8<f8c> {
            private final CheckoutComponentFeatureDependencies a;

            l0(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f8c get() {
                return (f8c) jh8.d(this.a.l0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class m implements as8<nt2> {
            private final CheckoutComponentFeatureDependencies a;

            m(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public nt2 get() {
                return (nt2) jh8.d(this.a.h3());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class n implements as8<f63> {
            private final CheckoutComponentFeatureDependencies a;

            n(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.s());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class o implements as8<hq3> {
            private final CheckoutComponentFeatureDependencies a;

            o(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hq3 get() {
                return (hq3) jh8.d(this.a.c());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class p implements as8<dh4> {
            private final CheckoutComponentFeatureDependencies a;

            p(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public dh4 get() {
                return (dh4) jh8.d(this.a.k1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class q implements as8<ih4> {
            private final CheckoutComponentFeatureDependencies a;

            q(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ih4 get() {
                return (ih4) jh8.d(this.a.A());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class r implements as8<kx1> {
            private final CheckoutComponentFeatureDependencies a;

            r(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public kx1 get() {
                return (kx1) jh8.d(this.a.d());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class s implements as8<dt5> {
            private final CheckoutComponentFeatureDependencies a;

            s(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public dt5 get() {
                return (dt5) jh8.d(this.a.F());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class t implements as8<ej6> {
            private final CheckoutComponentFeatureDependencies a;

            t(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ej6 get() {
                return (ej6) jh8.d(this.a.Q0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class u implements as8<jn6> {
            private final CheckoutComponentFeatureDependencies a;

            u(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public jn6 get() {
                return (jn6) jh8.d(this.a.Q());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class v implements as8<mn6> {
            private final CheckoutComponentFeatureDependencies a;

            v(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public mn6 get() {
                return (mn6) jh8.d(this.a.q2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class w implements as8<vg7> {
            private final CheckoutComponentFeatureDependencies a;

            w(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public vg7 get() {
                return (vg7) jh8.d(this.a.B());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class x implements as8<li7> {
            private final CheckoutComponentFeatureDependencies a;

            x(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public li7 get() {
                return (li7) jh8.d(this.a.r());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class y implements as8<ok7> {
            private final CheckoutComponentFeatureDependencies a;

            y(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ok7 get() {
                return (ok7) jh8.d(this.a.f2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static final class z implements as8<tk7> {
            private final CheckoutComponentFeatureDependencies a;

            z(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
                this.a = checkoutComponentFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public tk7 get() {
                return (tk7) jh8.d(this.a.k3());
            }
        }

        private void Z4(c51 c51Var, CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
            as8<f63> a2 = p63.a(o51.a(c51Var));
            this.i = a2;
            this.j = p63.a(p51.a(c51Var, a2));
            this.k = new j0(checkoutComponentFeatureDependencies);
            this.l = new o(checkoutComponentFeatureDependencies);
            this.m = new g(checkoutComponentFeatureDependencies);
            this.n = new k(checkoutComponentFeatureDependencies);
            this.o = new c0(checkoutComponentFeatureDependencies);
            this.p = new e(checkoutComponentFeatureDependencies);
            this.q = new t(checkoutComponentFeatureDependencies);
            this.r = new h0(checkoutComponentFeatureDependencies);
            this.s = new k0(checkoutComponentFeatureDependencies);
            this.t = new l0(checkoutComponentFeatureDependencies);
            this.u = new h(checkoutComponentFeatureDependencies);
            this.v = new d(checkoutComponentFeatureDependencies);
            this.w = new s(checkoutComponentFeatureDependencies);
            this.x = new j(checkoutComponentFeatureDependencies);
            this.y = new f(checkoutComponentFeatureDependencies);
            this.z = new b0(checkoutComponentFeatureDependencies);
            this.A = new a(checkoutComponentFeatureDependencies);
            this.B = new d0(checkoutComponentFeatureDependencies);
            this.C = new l(checkoutComponentFeatureDependencies);
            this.D = new x(checkoutComponentFeatureDependencies);
            this.E = new a0(checkoutComponentFeatureDependencies);
            this.F = new p(checkoutComponentFeatureDependencies);
            this.G = new w(checkoutComponentFeatureDependencies);
            this.H = new y(checkoutComponentFeatureDependencies);
            this.I = new z(checkoutComponentFeatureDependencies);
            this.J = new f0(checkoutComponentFeatureDependencies);
            this.K = new b(checkoutComponentFeatureDependencies);
            this.L = new c(checkoutComponentFeatureDependencies);
            this.M = new r(checkoutComponentFeatureDependencies);
            this.N = new n(checkoutComponentFeatureDependencies);
            this.O = new i(checkoutComponentFeatureDependencies);
            this.P = new e0(checkoutComponentFeatureDependencies);
            this.Q = new q(checkoutComponentFeatureDependencies);
            this.R = new i0(checkoutComponentFeatureDependencies);
            this.S = new g0(checkoutComponentFeatureDependencies);
            this.T = new u(checkoutComponentFeatureDependencies);
            this.U = new v(checkoutComponentFeatureDependencies);
            this.V = new m(checkoutComponentFeatureDependencies);
            this.W = p63.a(j51.a(c51Var));
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies
        public vg7 B() {
            return (vg7) jh8.d(this.g.B());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent
        public c41.a B2() {
            return new e(this.h);
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public ew5 D() {
            return (ew5) jh8.d(this.g.D());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent
        public js0.a E1() {
            return new b(this.h);
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies
        public pv9 H() {
            return (pv9) jh8.d(this.g.H());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent
        public df3.a J1() {
            return new j(this.h);
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies
        public r43 L() {
            return (r43) jh8.d(this.g.L());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent
        public f9a R1() {
            return new p(this.h);
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies, com.dodopizza.geo.feature.selectdeliveryaddress.di.SelectDeliveryAddressFeatureDependencies, com.dodopizza.profile.feature.profilelocalelist.ProfileLocaleListFeatureDependencies, com.dodopizza.geo.feature.phonenumbercollector.PhoneNumberCollectorDependencies, com.dodopizza.order.feature.delivery.address.DeliveryAddressFeatureDependencies
        public gc a() {
            return (gc) jh8.d(this.g.a());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent, ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.controlling.feature.fullscreenimage.FullscreenImageFeatureDependencies, com.dodopizza.controlling.feature.photopickerbutton.PhotoPickerButtonFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.profile.feature.profilelocalelist.ProfileLocaleListFeatureDependencies, com.dodopizza.geo.feature.phonenumbercollector.PhoneNumberCollectorDependencies
        public f63 b() {
            return this.i.get();
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureServiceDependencies, com.dodopizza.geo.feature.selectdeliveryaddress.di.SelectDeliveryAddressFeatureDependencies, com.dodopizza.core.feature.debugtools.toggles.FeatureTogglesFeatureDependencies
        public hq3 c() {
            return (hq3) jh8.d(this.g.c());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent
        public kt7.a d4() {
            return new l(this.h);
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent
        public uz2 f3() {
            return new i(this.h);
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent
        public t7b.a i4() {
            return new q(this.h);
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public je4 k() {
            return (je4) jh8.d(this.g.k());
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent
        public ts2.a m3() {
            return new g(this.h);
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public wv5 p() {
            return (wv5) jh8.d(this.g.p());
        }

        @Override // com.dodopizza.geo.feature.selectdeliveryaddress.di.SelectDeliveryAddressRoutingFeatureDependencies
        public com.dodopizza.geo.feature.selectdeliveryaddress.a p2() {
            return this.j.get();
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent
        public x31 s3() {
            return new d(this.h);
        }

        @Override // ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent
        public iu9.a t2() {
            return new n(this.h);
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies, com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies
        public n43 v() {
            return (n43) jh8.d(this.g.v());
        }

        @Override // ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFeatureDependencies
        public e98 z() {
            return (e98) jh8.d(this.g.z());
        }

        private CheckoutComponentImpl(c51 c51Var, CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
            this.h = this;
            this.g = checkoutComponentFeatureDependencies;
            Z4(c51Var, checkoutComponentFeatureDependencies);
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private c51 a;
        private CheckoutComponentFeatureDependencies b;

        public CheckoutComponent a() {
            if (this.a == null) {
                this.a = new c51();
            }
            jh8.a(this.b, CheckoutComponentFeatureDependencies.class);
            return new CheckoutComponentImpl(this.a, this.b);
        }

        public a b(CheckoutComponentFeatureDependencies checkoutComponentFeatureDependencies) {
            this.b = (CheckoutComponentFeatureDependencies) jh8.b(checkoutComponentFeatureDependencies);
            return this;
        }

        private a() {
        }
    }

    /* loaded from: classes3.dex */
    private static final class b implements js0.a {
        private final CheckoutComponentImpl a;

        @Override // defpackage.js0.a
        public js0 a() {
            return new c(this.a);
        }

        private b(CheckoutComponentImpl checkoutComponentImpl) {
            this.a = checkoutComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class c implements js0 {
        private final CheckoutComponentImpl a;
        private final c b;
        private as8<os0> c;
        private as8<zs0> d;
        private as8<vn6> e;
        private as8<on6> f;
        private as8<CashChargePresenter> g;

        private void b() {
            this.c = p63.a(ss0.a(this.a.m, this.a.p, this.a.T, this.a.U));
            this.d = p63.a(rs0.a());
            this.e = p63.a(us0.a(this.a.l));
            this.f = p63.a(ts0.a());
            this.g = p63.a(vs0.a(this.c, this.a.i, this.a.T, this.d, this.e, this.f));
        }

        @Override // defpackage.js0
        public CashChargePresenter a() {
            return this.g.get();
        }

        private c(CheckoutComponentImpl checkoutComponentImpl) {
            this.b = this;
            this.a = checkoutComponentImpl;
            b();
        }
    }

    /* loaded from: classes3.dex */
    private static final class d implements x31 {
        private final CheckoutComponentImpl a;
        private final d b;

        private y31 b(y31 y31Var) {
            z31.a(y31Var, (dv6) this.a.W.get());
            z31.b(y31Var, (f63) this.a.i.get());
            return y31Var;
        }

        @Override // defpackage.x31
        public void a(y31 y31Var) {
            b(y31Var);
        }

        private d(CheckoutComponentImpl checkoutComponentImpl) {
            this.b = this;
            this.a = checkoutComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class e implements c41.a {
        private final CheckoutComponentImpl a;
        private b61 b;
        private op5 c;

        @Override // defpackage.c41.a
        public c41 a() {
            jh8.a(this.b, b61.class);
            jh8.a(this.c, op5.class);
            return new f(this.a, new l61(), this.b, this.c);
        }

        @Override // defpackage.c41.a
        /* renamed from: d */
        public e c(b61 b61Var) {
            this.b = (b61) jh8.b(b61Var);
            return this;
        }

        @Override // defpackage.c41.a
        /* renamed from: e */
        public e b(op5 op5Var) {
            this.c = (op5) jh8.b(op5Var);
            return this;
        }

        private e(CheckoutComponentImpl checkoutComponentImpl) {
            this.a = checkoutComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class f implements c41 {
        private final CheckoutComponentImpl a;
        private final f b;
        private as8<vs2> c;
        private as8<b61> d;
        private as8<h61> e;
        private as8<f61> f;
        private as8<e61> g;
        private as8<c61> h;
        private as8<t61> i;
        private as8<ad> j;
        private as8<v61> k;
        private as8<q51> l;
        private as8<j41> m;
        private as8<i41> n;
        private as8<op5> o;
        private as8<xtb> p;
        private as8<s41> q;
        private as8<CheckoutDetailsPresenter> r;

        private void b(l61 l61Var, b61 b61Var, op5 op5Var) {
            this.c = p63.a(n41.a(this.a.k, this.a.l));
            this.d = z45.a(b61Var);
            this.e = p63.a(p61.a(l61Var));
            as8<f61> a = p63.a(g61.a(this.a.n, this.a.o, this.a.p, this.a.l, this.e, this.a.q, this.a.r, this.a.s, this.a.t, this.a.u, this.a.v, this.a.w, this.a.x, bp7.a()));
            this.f = a;
            this.g = r61.a(l61Var, a);
            this.h = p63.a(o61.a(l61Var, this.a.m, this.g, this.e));
            this.i = p63.a(s61.a(l61Var, this.a.y, this.g, this.a.m, this.a.r));
            as8<ad> a2 = p63.a(m61.a(l61Var, this.a.r, this.a.z, this.a.A, this.a.k, this.a.s));
            this.j = a2;
            this.k = p63.a(q61.a(l61Var, this.h, this.i, a2, this.a.B, this.e, this.a.v, this.a.l));
            as8<q51> a3 = p63.a(n61.a(l61Var, this.a.u, this.i, this.a.t, this.a.C, this.j, this.a.D, this.a.E, this.a.F, this.e));
            this.l = a3;
            as8<j41> a4 = p63.a(k41.a(this.k, a3, this.a.A, this.a.G, this.a.H, this.a.I, this.a.J, this.a.K, this.a.r, this.a.L, this.a.M));
            this.m = a4;
            this.n = o41.a(a4);
            no3 a5 = z45.a(op5Var);
            this.o = a5;
            this.p = p63.a(q41.a(a5, this.a.O));
            this.q = m41.a(this.a.i);
            this.r = p63.a(r41.a(this.d, this.n, this.a.w, this.a.i, this.a.N, this.a.l, this.a.x, this.p, this.a.A, this.a.P, this.q, this.a.Q));
        }

        private ru.dodopizza.app.presentation.checkout.details.c c(ru.dodopizza.app.presentation.checkout.details.c cVar) {
            h41.g(cVar, (pv9) jh8.d(this.a.g.H()));
            h41.d(cVar, (tg4) jh8.d(this.a.g.U1()));
            h41.h(cVar, this.c.get());
            h41.b(cVar, (pu2) jh8.d(this.a.g.r3()));
            h41.f(cVar, p41.a());
            h41.c(cVar, (je4) jh8.d(this.a.g.k()));
            h41.e(cVar, this.r);
            h41.a(cVar, (ay1) jh8.d(this.a.g.S()));
            return cVar;
        }

        @Override // defpackage.c41
        public void a(ru.dodopizza.app.presentation.checkout.details.c cVar) {
            c(cVar);
        }

        private f(CheckoutComponentImpl checkoutComponentImpl, l61 l61Var, b61 b61Var, op5 op5Var) {
            this.b = this;
            this.a = checkoutComponentImpl;
            b(l61Var, b61Var, op5Var);
        }
    }

    /* loaded from: classes3.dex */
    private static final class g implements ts2.a {
        private final CheckoutComponentImpl a;
        private pt2 b;
        private Boolean c;
        private Integer d;

        @Override // defpackage.ts2.a
        public ts2 a() {
            jh8.a(this.b, pt2.class);
            jh8.a(this.c, Boolean.class);
            jh8.a(this.d, Integer.class);
            return new h(this.a, this.b, this.c, this.d);
        }

        @Override // defpackage.ts2.a
        /* renamed from: e */
        public g c(pt2 pt2Var) {
            this.b = (pt2) jh8.b(pt2Var);
            return this;
        }

        @Override // defpackage.ts2.a
        /* renamed from: f */
        public g b(int i) {
            this.d = (Integer) jh8.b(Integer.valueOf(i));
            return this;
        }

        @Override // defpackage.ts2.a
        /* renamed from: g */
        public g d(boolean z) {
            this.c = (Boolean) jh8.b(Boolean.valueOf(z));
            return this;
        }

        private g(CheckoutComponentImpl checkoutComponentImpl) {
            this.a = checkoutComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class h implements ts2 {
        private final CheckoutComponentImpl a;
        private final h b;
        private as8<Boolean> c;
        private as8<vs2> d;
        private as8<pt2> e;
        private as8<Integer> f;
        private as8<ps2> g;
        private as8<dt2> h;
        private as8<DeferredTimePresenter> i;

        private void b(pt2 pt2Var, Boolean bool, Integer num) {
            this.c = z45.a(bool);
            this.d = p63.a(it2.a(this.a.k, this.a.l));
            this.e = z45.a(pt2Var);
            this.f = z45.a(num);
            this.g = p63.a(ht2.a());
            this.h = p63.a(jt2.a(this.a.V, this.d, this.e, this.f, this.a.l, this.a.u, this.a.t, this.g));
            this.i = p63.a(kt2.a(this.c, this.a.r, this.h, this.a.i, this.a.A));
        }

        private at2 c(at2 at2Var) {
            ct2.a(at2Var, this.i);
            return at2Var;
        }

        @Override // defpackage.ts2
        public void a(at2 at2Var) {
            c(at2Var);
        }

        private h(CheckoutComponentImpl checkoutComponentImpl, pt2 pt2Var, Boolean bool, Integer num) {
            this.b = this;
            this.a = checkoutComponentImpl;
            b(pt2Var, bool, num);
        }
    }

    /* loaded from: classes3.dex */
    private static final class i implements uz2 {
        private final CheckoutComponentImpl a;
        private final i b;
        private as8<TableNumberSelectionPresenter> c;

        private void b() {
            this.c = p63.a(wz2.a(this.a.i, this.a.A));
        }

        @Override // defpackage.uz2
        public TableNumberSelectionPresenter a() {
            return this.c.get();
        }

        private i(CheckoutComponentImpl checkoutComponentImpl) {
            this.b = this;
            this.a = checkoutComponentImpl;
            b();
        }
    }

    /* loaded from: classes3.dex */
    private static final class j implements df3.a {
        private final CheckoutComponentImpl a;
        private String b;
        private Boolean c;

        @Override // defpackage.df3.a
        public df3 a() {
            jh8.a(this.b, String.class);
            jh8.a(this.c, Boolean.class);
            return new k(this.a, this.b, this.c);
        }

        @Override // defpackage.df3.a
        /* renamed from: d */
        public j b(String str) {
            this.b = (String) jh8.b(str);
            return this;
        }

        @Override // defpackage.df3.a
        /* renamed from: e */
        public j c(boolean z) {
            this.c = (Boolean) jh8.b(Boolean.valueOf(z));
            return this;
        }

        private j(CheckoutComponentImpl checkoutComponentImpl) {
            this.a = checkoutComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class k implements df3 {
        private final CheckoutComponentImpl a;
        private final k b;
        private as8<String> c;
        private as8<Boolean> d;
        private as8<EmailForChecksPresenter> e;

        private void b(String str, Boolean bool) {
            this.c = z45.a(str);
            no3 a = z45.a(bool);
            this.d = a;
            this.e = p63.a(if3.a(this.c, a, this.a.i));
        }

        @Override // defpackage.df3
        public EmailForChecksPresenter a() {
            return this.e.get();
        }

        private k(CheckoutComponentImpl checkoutComponentImpl, String str, Boolean bool) {
            this.b = this;
            this.a = checkoutComponentImpl;
            b(str, bool);
        }
    }

    /* loaded from: classes3.dex */
    private static final class l implements kt7.a {
        private final CheckoutComponentImpl a;
        private cl2<et7> b;
        private Boolean c;

        @Override // defpackage.kt7.a
        public kt7 a() {
            jh8.a(this.b, cl2.class);
            jh8.a(this.c, Boolean.class);
            return new m(this.a, this.b, this.c);
        }

        @Override // defpackage.kt7.a
        /* renamed from: d */
        public l c(cl2<et7> cl2Var) {
            this.b = (cl2) jh8.b(cl2Var);
            return this;
        }

        @Override // defpackage.kt7.a
        /* renamed from: e */
        public l b(boolean z) {
            this.c = (Boolean) jh8.b(Boolean.valueOf(z));
            return this;
        }

        private l(CheckoutComponentImpl checkoutComponentImpl) {
            this.a = checkoutComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class m implements kt7 {
        private final CheckoutComponentImpl a;
        private final m b;
        private as8<cl2<et7>> c;
        private as8<ot7> d;
        private as8<ut7> e;
        private as8<Boolean> f;
        private as8<PaymentMethodListPresenter> g;

        private void b(cl2<et7> cl2Var, Boolean bool) {
            this.c = z45.a(cl2Var);
            this.d = p63.a(rt7.a(this.a.m, this.a.E, this.a.C, this.a.R, this.a.A, this.a.G));
            this.e = p63.a(tt7.a(this.a.i));
            no3 a = z45.a(bool);
            this.f = a;
            this.g = p63.a(st7.a(this.c, this.d, this.e, a));
        }

        @Override // defpackage.kt7
        public PaymentMethodListPresenter a() {
            return this.g.get();
        }

        private m(CheckoutComponentImpl checkoutComponentImpl, cl2<et7> cl2Var, Boolean bool) {
            this.b = this;
            this.a = checkoutComponentImpl;
            b(cl2Var, bool);
        }
    }

    /* loaded from: classes3.dex */
    private static final class n implements iu9.a {
        private final CheckoutComponentImpl a;
        private cl2<ou9> b;
        private String c;

        @Override // defpackage.iu9.a
        public iu9 a() {
            jh8.a(this.b, cl2.class);
            jh8.a(this.c, String.class);
            return new o(this.a, this.b, this.c);
        }

        @Override // defpackage.iu9.a
        /* renamed from: d */
        public n c(cl2<ou9> cl2Var) {
            this.b = (cl2) jh8.b(cl2Var);
            return this;
        }

        @Override // defpackage.iu9.a
        /* renamed from: e */
        public n b(String str) {
            this.c = (String) jh8.b(str);
            return this;
        }

        private n(CheckoutComponentImpl checkoutComponentImpl) {
            this.a = checkoutComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class o implements iu9 {
        private final CheckoutComponentImpl a;
        private final o b;
        private as8<cl2<ou9>> c;
        private as8<xu9> d;
        private as8<lu9> e;
        private as8<su9> f;
        private as8<String> g;
        private as8<SbpBankListPresenter> h;

        private void b(cl2<ou9> cl2Var, String str) {
            this.c = z45.a(cl2Var);
            as8<xu9> a = p63.a(ru9.a(this.a.S));
            this.d = a;
            this.e = mu9.a(a);
            this.f = tu9.a(this.a.i);
            this.g = z45.a(str);
            this.h = p63.a(qu9.a(this.c, this.e, this.f, this.a.A, this.g, this.a.s));
        }

        @Override // defpackage.iu9
        public SbpBankListPresenter a() {
            return this.h.get();
        }

        private o(CheckoutComponentImpl checkoutComponentImpl, cl2<ou9> cl2Var, String str) {
            this.b = this;
            this.a = checkoutComponentImpl;
            b(cl2Var, str);
        }
    }

    /* loaded from: classes3.dex */
    private static final class p implements f9a {
        private final CheckoutComponentImpl a;
        private final p b;

        private v7a b(v7a v7aVar) {
            w7a.a(v7aVar, (y7a) jh8.d(this.a.g.W3()));
            return v7aVar;
        }

        @Override // defpackage.f9a
        public void a(v7a v7aVar) {
            b(v7aVar);
        }

        private p(CheckoutComponentImpl checkoutComponentImpl) {
            this.b = this;
            this.a = checkoutComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class q implements t7b.a {
        private final CheckoutComponentImpl a;
        private String b;

        @Override // defpackage.t7b.a
        public t7b a() {
            jh8.a(this.b, String.class);
            return new r(this.a, this.b);
        }

        @Override // defpackage.t7b.a
        /* renamed from: c */
        public q b(String str) {
            this.b = (String) jh8.b(str);
            return this;
        }

        private q(CheckoutComponentImpl checkoutComponentImpl) {
            this.a = checkoutComponentImpl;
        }
    }

    /* loaded from: classes3.dex */
    private static final class r implements t7b {
        private final CheckoutComponentImpl a;
        private final r b;
        private as8<String> c;
        private as8<b8b> d;
        private as8<TaxPayerIdPresenter> e;

        private void b(String str) {
            this.c = z45.a(str);
            this.d = p63.a(y7b.a(this.a.x));
            this.e = p63.a(x7b.a(this.c, this.a.i, this.d));
        }

        @Override // defpackage.t7b
        public TaxPayerIdPresenter a() {
            return this.e.get();
        }

        private r(CheckoutComponentImpl checkoutComponentImpl, String str) {
            this.b = this;
            this.a = checkoutComponentImpl;
            b(str);
        }
    }

    public static a a() {
        return new a();
    }
}
