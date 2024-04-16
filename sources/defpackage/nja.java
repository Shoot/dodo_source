package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: ShoppingCartView$$State.java */
/* renamed from: nja  reason: default package */
/* loaded from: classes2.dex */
public class nja extends MvpViewState<oja> implements oja {

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<oja> {
        a() {
            super("hideConnectionError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.o0();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$a0 */
    /* loaded from: classes2.dex */
    public class a0 extends ViewCommand<oja> {
        public final ce0 a;

        a0(ce0 ce0Var) {
            super("showDiscountInfo", SkipStrategy.class);
            this.a = ce0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.T1(this.a);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<oja> {
        b() {
            super("hideDeliveryFee", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.J();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$b0 */
    /* loaded from: classes2.dex */
    public class b0 extends ViewCommand<oja> {
        public final List<lq3> a;

        b0(List<lq3> list) {
            super("showDynamicDeliveryInfoInEmptyCart", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.He(this.a);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<oja> {
        c() {
            super("hideLoyaltyRewardSum", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.v1();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$c0 */
    /* loaded from: classes2.dex */
    public class c0 extends ViewCommand<oja> {
        c0() {
            super("showEmptyContent", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.n0();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<oja> {
        d() {
            super("hideMinDeliveryPriceGoodsLabel", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.G5();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$d0 */
    /* loaded from: classes2.dex */
    public class d0 extends ViewCommand<oja> {
        d0() {
            super("showEnterPromoCode", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.xc();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<oja> {
        e() {
            super("hideMinDeliveryPriceMessage", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.e4();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$e0 */
    /* loaded from: classes2.dex */
    public class e0 extends ViewCommand<oja> {
        e0() {
            super("showEnterPromoCodeDialog", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.Lf();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<oja> {
        f() {
            super("hidePrizotekaView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.O9();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$f0 */
    /* loaded from: classes2.dex */
    public class f0 extends ViewCommand<oja> {
        f0() {
            super("showInfiniteUpsellBlockFragment", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.da();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<oja> {
        g() {
            super("hideTooSmallTotalCostAlert", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.Je();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$g0 */
    /* loaded from: classes2.dex */
    public class g0 extends ViewCommand<oja> {
        public final String a;

        g0(String str) {
            super("showInfoStory", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.F(this.a);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<oja> {
        h() {
            super("hideUpsale", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.R8();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$h0 */
    /* loaded from: classes2.dex */
    public class h0 extends ViewCommand<oja> {
        h0() {
            super("showLoyaltyRewardHintUAE", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.Z2();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<oja> {
        i() {
            super("hideWarning", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.r5();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$i0 */
    /* loaded from: classes2.dex */
    public class i0 extends ViewCommand<oja> {
        public final long a;

        i0(long j) {
            super("showLoyaltyRewardSum", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.oe(this.a);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<oja> {
        j() {
            super("replacePersonalOffers", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.Va();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$j0 */
    /* loaded from: classes2.dex */
    public class j0 extends ViewCommand<oja> {
        public final boolean a;

        j0(boolean z) {
            super("showMinDeliveryPriceGoodsLabel", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.S4(this.a);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<oja> {
        k() {
            super("replacePersonalOffersWithIncreaseTitleTextAppearance", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.L6();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$k0 */
    /* loaded from: classes2.dex */
    public class k0 extends ViewCommand<oja> {
        k0() {
            super("showNiceBonusInfoView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.ff();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$l */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<oja> {
        public final hn6 a;

        l(hn6 hn6Var) {
            super("setDeliveryFee", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.e3(this.a);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$l0 */
    /* loaded from: classes2.dex */
    public class l0 extends ViewCommand<oja> {
        l0() {
            super("showPersonalOffers", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.Id();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$m */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<oja> {
        m() {
            super("setDeliveryFeeNoteIncreased", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.T4();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$m0 */
    /* loaded from: classes2.dex */
    public class m0 extends ViewCommand<oja> {
        m0() {
            super("showPersonalOffersWithIncreaseTitleTextAppearance", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.Td();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$n */
    /* loaded from: classes2.dex */
    public class n extends ViewCommand<oja> {
        n() {
            super("setDeliveryFeeNoteNormal", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.kc();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$n0 */
    /* loaded from: classes2.dex */
    public class n0 extends ViewCommand<oja> {
        n0() {
            super("showPlaceOrderButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.se();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$o */
    /* loaded from: classes2.dex */
    public class o extends ViewCommand<oja> {
        public final boolean a;

        o(boolean z) {
            super("setDeliveryFeeNotePromo", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.i4(this.a);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$o0 */
    /* loaded from: classes2.dex */
    public class o0 extends ViewCommand<oja> {
        o0() {
            super("showPriceChangedError", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.h8();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$p */
    /* loaded from: classes2.dex */
    public class p extends ViewCommand<oja> {
        p() {
            super("setFreeDeliveryFee", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.yd();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$p0 */
    /* loaded from: classes2.dex */
    public class p0 extends ViewCommand<oja> {
        public final lk8 a;
        public final int b;
        public final String c;
        public final hn6 d;

        p0(lk8 lk8Var, int i, String str, hn6 hn6Var) {
            super("showPrizotekaView", AddToEndSingleStrategy.class);
            this.a = lk8Var;
            this.b = i;
            this.c = str;
            this.d = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.z8(this.a, this.b, this.c, this.d);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$q */
    /* loaded from: classes2.dex */
    public class q extends ViewCommand<oja> {
        public final hn6 a;

        q(hn6 hn6Var) {
            super("setMinDeliveryPriceButton", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.dg(this.a);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$q0 */
    /* loaded from: classes2.dex */
    public class q0 extends ViewCommand<oja> {
        q0() {
            super("showProgressBar", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.showProgressBar();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$r */
    /* loaded from: classes2.dex */
    public class r extends ViewCommand<oja> {
        public final hn6 a;

        r(hn6 hn6Var) {
            super("setMinDeliveryPriceMessage", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.R3(this.a);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$r0 */
    /* loaded from: classes2.dex */
    public class r0 extends ViewCommand<oja> {
        r0() {
            super("showPromoCodeChanged", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.C6();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$s */
    /* loaded from: classes2.dex */
    public class s extends ViewCommand<oja> {
        public final hn6 a;
        public final hn6 b;
        public final int c;
        public final int d;

        s(hn6 hn6Var, hn6 hn6Var2, int i, int i2) {
            super("setMinDeliveryPriceMessageWithAnimation", AddToEndSingleStrategy.class);
            this.a = hn6Var;
            this.b = hn6Var2;
            this.c = i;
            this.d = i2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.ld(this.a, this.b, this.c, this.d);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$s0 */
    /* loaded from: classes2.dex */
    public class s0 extends ViewCommand<oja> {
        s0() {
            super("showStopWarning", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.B5();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$t */
    /* loaded from: classes2.dex */
    public class t extends ViewCommand<oja> {
        public final boolean a;

        t(boolean z) {
            super("setPersonalBlockVisibility", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.w1(this.a);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$t0 */
    /* loaded from: classes2.dex */
    public class t0 extends ViewCommand<oja> {
        t0() {
            super("showStopsChanged", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.xg();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$u */
    /* loaded from: classes2.dex */
    public class u extends ViewCommand<oja> {
        public final hn6 a;

        u(hn6 hn6Var) {
            super("setTotal", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.L0(this.a);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$u0 */
    /* loaded from: classes2.dex */
    public class u0 extends ViewCommand<oja> {
        public final hn6 a;
        public final int b;

        u0(hn6 hn6Var, int i) {
            super("showTooSmallTotalCostAlert", AddToEndSingleStrategy.class);
            this.a = hn6Var;
            this.b = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.Yg(this.a, this.b);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$v */
    /* loaded from: classes2.dex */
    public class v extends ViewCommand<oja> {
        public final w18 a;

        v(w18 w18Var) {
            super("showAppliedPersonalPromoAction", AddToEndSingleStrategy.class);
            this.a = w18Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.Z6(this.a);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$v0 */
    /* loaded from: classes2.dex */
    public class v0 extends ViewCommand<oja> {
        public final hn6 a;
        public final hn6 b;
        public final int c;
        public final int d;

        v0(hn6 hn6Var, hn6 hn6Var2, int i, int i2) {
            super("showTooSmallTotalCostAlertWithAnimation", AddToEndSingleStrategy.class);
            this.a = hn6Var;
            this.b = hn6Var2;
            this.c = i;
            this.d = i2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.X2(this.a, this.b, this.c, this.d);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$w */
    /* loaded from: classes2.dex */
    public class w extends ViewCommand<oja> {
        public final op8 a;

        w(op8 op8Var) {
            super("showAppliedPromoCode", AddToEndSingleStrategy.class);
            this.a = op8Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.J6(this.a);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$w0 */
    /* loaded from: classes2.dex */
    public class w0 extends ViewCommand<oja> {
        w0() {
            super("showUpsaleBlockFragment", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.s1();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$x */
    /* loaded from: classes2.dex */
    public class x extends ViewCommand<oja> {
        x() {
            super("showCartItemsCountChanged", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.Eb();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$x0 */
    /* loaded from: classes2.dex */
    public class x0 extends ViewCommand<oja> {
        public final List<? extends or0> a;

        x0(List<? extends or0> list) {
            super("updateCartContent", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.Wb(this.a);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$y */
    /* loaded from: classes2.dex */
    public class y extends ViewCommand<oja> {
        y() {
            super("showConnectionError", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.S();
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$y0 */
    /* loaded from: classes2.dex */
    public class y0 extends ViewCommand<oja> {
        public final lja a;

        y0(lja ljaVar) {
            super("updateSummaryContent", AddToEndSingleStrategy.class);
            this.a = ljaVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.P6(this.a);
        }
    }

    /* compiled from: ShoppingCartView$$State.java */
    /* renamed from: nja$z */
    /* loaded from: classes2.dex */
    public class z extends ViewCommand<oja> {
        z() {
            super("showDeliveryFee", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oja ojaVar) {
            ojaVar.Da();
        }
    }

    @Override // defpackage.oja
    public void B5() {
        s0 s0Var = new s0();
        this.viewCommands.beforeApply(s0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.B5();
        }
        this.viewCommands.afterApply(s0Var);
    }

    @Override // defpackage.oja
    public void C6() {
        r0 r0Var = new r0();
        this.viewCommands.beforeApply(r0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.C6();
        }
        this.viewCommands.afterApply(r0Var);
    }

    @Override // defpackage.oja
    public void Da() {
        z zVar = new z();
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Da();
        }
        this.viewCommands.afterApply(zVar);
    }

    @Override // defpackage.oja
    public void Eb() {
        x xVar = new x();
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Eb();
        }
        this.viewCommands.afterApply(xVar);
    }

    @Override // defpackage.oja
    public void F(String str) {
        g0 g0Var = new g0(str);
        this.viewCommands.beforeApply(g0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.F(str);
        }
        this.viewCommands.afterApply(g0Var);
    }

    @Override // defpackage.oja
    public void G5() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.G5();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.oja
    public void He(List<lq3> list) {
        b0 b0Var = new b0(list);
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.He(list);
        }
        this.viewCommands.afterApply(b0Var);
    }

    @Override // defpackage.oja
    public void Id() {
        l0 l0Var = new l0();
        this.viewCommands.beforeApply(l0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Id();
        }
        this.viewCommands.afterApply(l0Var);
    }

    @Override // defpackage.oja
    public void J() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.J();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.oja
    public void J6(op8 op8Var) {
        w wVar = new w(op8Var);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.J6(op8Var);
        }
        this.viewCommands.afterApply(wVar);
    }

    @Override // defpackage.oja
    public void Je() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Je();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.oja
    public void L0(hn6 hn6Var) {
        u uVar = new u(hn6Var);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.L0(hn6Var);
        }
        this.viewCommands.afterApply(uVar);
    }

    @Override // defpackage.oja
    public void L6() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.L6();
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.oja
    public void Lf() {
        e0 e0Var = new e0();
        this.viewCommands.beforeApply(e0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Lf();
        }
        this.viewCommands.afterApply(e0Var);
    }

    @Override // defpackage.oja
    public void O9() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.O9();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.oja
    public void P6(lja ljaVar) {
        y0 y0Var = new y0(ljaVar);
        this.viewCommands.beforeApply(y0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.P6(ljaVar);
        }
        this.viewCommands.afterApply(y0Var);
    }

    @Override // defpackage.oja
    public void R3(hn6 hn6Var) {
        r rVar = new r(hn6Var);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.R3(hn6Var);
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // defpackage.oja
    public void R8() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.R8();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.oja
    public void S() {
        y yVar = new y();
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.S();
        }
        this.viewCommands.afterApply(yVar);
    }

    @Override // defpackage.oja
    public void S4(boolean z2) {
        j0 j0Var = new j0(z2);
        this.viewCommands.beforeApply(j0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.S4(z2);
        }
        this.viewCommands.afterApply(j0Var);
    }

    @Override // defpackage.oja
    public void T1(ce0 ce0Var) {
        a0 a0Var = new a0(ce0Var);
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.T1(ce0Var);
        }
        this.viewCommands.afterApply(a0Var);
    }

    @Override // defpackage.oja
    public void T4() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.T4();
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.oja
    public void Td() {
        m0 m0Var = new m0();
        this.viewCommands.beforeApply(m0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Td();
        }
        this.viewCommands.afterApply(m0Var);
    }

    @Override // defpackage.oja
    public void Va() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Va();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.oja
    public void Wb(List<? extends or0> list) {
        x0 x0Var = new x0(list);
        this.viewCommands.beforeApply(x0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Wb(list);
        }
        this.viewCommands.afterApply(x0Var);
    }

    @Override // defpackage.oja
    public void X2(hn6 hn6Var, hn6 hn6Var2, int i2, int i3) {
        v0 v0Var = new v0(hn6Var, hn6Var2, i2, i3);
        this.viewCommands.beforeApply(v0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.X2(hn6Var, hn6Var2, i2, i3);
        }
        this.viewCommands.afterApply(v0Var);
    }

    @Override // defpackage.oja
    public void Yg(hn6 hn6Var, int i2) {
        u0 u0Var = new u0(hn6Var, i2);
        this.viewCommands.beforeApply(u0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Yg(hn6Var, i2);
        }
        this.viewCommands.afterApply(u0Var);
    }

    @Override // defpackage.oja
    public void Z2() {
        h0 h0Var = new h0();
        this.viewCommands.beforeApply(h0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Z2();
        }
        this.viewCommands.afterApply(h0Var);
    }

    @Override // defpackage.oja
    public void Z6(w18 w18Var) {
        v vVar = new v(w18Var);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Z6(w18Var);
        }
        this.viewCommands.afterApply(vVar);
    }

    @Override // defpackage.oja
    public void da() {
        f0 f0Var = new f0();
        this.viewCommands.beforeApply(f0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.da();
        }
        this.viewCommands.afterApply(f0Var);
    }

    @Override // defpackage.oja
    public void dg(hn6 hn6Var) {
        q qVar = new q(hn6Var);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.dg(hn6Var);
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // defpackage.oja
    public void e3(hn6 hn6Var) {
        l lVar = new l(hn6Var);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.e3(hn6Var);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.oja
    public void e4() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.e4();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.oja
    public void ff() {
        k0 k0Var = new k0();
        this.viewCommands.beforeApply(k0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ff();
        }
        this.viewCommands.afterApply(k0Var);
    }

    @Override // defpackage.oja
    public void h8() {
        o0 o0Var = new o0();
        this.viewCommands.beforeApply(o0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.h8();
        }
        this.viewCommands.afterApply(o0Var);
    }

    @Override // defpackage.oja
    public void i4(boolean z2) {
        o oVar = new o(z2);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.i4(z2);
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.oja
    public void kc() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.kc();
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.oja
    public void ld(hn6 hn6Var, hn6 hn6Var2, int i2, int i3) {
        s sVar = new s(hn6Var, hn6Var2, i2, i3);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ld(hn6Var, hn6Var2, i2, i3);
        }
        this.viewCommands.afterApply(sVar);
    }

    @Override // defpackage.oja
    public void n0() {
        c0 c0Var = new c0();
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.n0();
        }
        this.viewCommands.afterApply(c0Var);
    }

    @Override // defpackage.oja
    public void o0() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.o0();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.oja
    public void oe(long j2) {
        i0 i0Var = new i0(j2);
        this.viewCommands.beforeApply(i0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.oe(j2);
        }
        this.viewCommands.afterApply(i0Var);
    }

    @Override // defpackage.oja
    public void r5() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.r5();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.oja
    public void s1() {
        w0 w0Var = new w0();
        this.viewCommands.beforeApply(w0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.s1();
        }
        this.viewCommands.afterApply(w0Var);
    }

    @Override // defpackage.oja
    public void se() {
        n0 n0Var = new n0();
        this.viewCommands.beforeApply(n0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.se();
        }
        this.viewCommands.afterApply(n0Var);
    }

    @Override // defpackage.oja
    public void showProgressBar() {
        q0 q0Var = new q0();
        this.viewCommands.beforeApply(q0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.showProgressBar();
        }
        this.viewCommands.afterApply(q0Var);
    }

    @Override // defpackage.oja
    public void v1() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.v1();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.oja
    public void w1(boolean z2) {
        t tVar = new t(z2);
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.w1(z2);
        }
        this.viewCommands.afterApply(tVar);
    }

    @Override // defpackage.oja
    public void xc() {
        d0 d0Var = new d0();
        this.viewCommands.beforeApply(d0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.xc();
        }
        this.viewCommands.afterApply(d0Var);
    }

    @Override // defpackage.oja
    public void xg() {
        t0 t0Var = new t0();
        this.viewCommands.beforeApply(t0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.xg();
        }
        this.viewCommands.afterApply(t0Var);
    }

    @Override // defpackage.oja
    public void yd() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.yd();
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.oja
    public void z8(lk8 lk8Var, int i2, String str, hn6 hn6Var) {
        p0 p0Var = new p0(lk8Var, i2, str, hn6Var);
        this.viewCommands.beforeApply(p0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.z8(lk8Var, i2, str, hn6Var);
        }
        this.viewCommands.afterApply(p0Var);
    }
}
