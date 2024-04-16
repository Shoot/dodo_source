package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: OrderSummaryView$$State.java */
/* renamed from: ek7  reason: default package */
/* loaded from: classes.dex */
public class ek7 extends MvpViewState<fk7> implements fk7 {

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<fk7> {
        public final String a;

        a(String str) {
            super("callByPhone", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.ec(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$a0 */
    /* loaded from: classes.dex */
    public class a0 extends ViewCommand<fk7> {
        public final boolean a;

        a0(boolean z) {
            super("setMysteryShopperCheckupCardVisible", OneExecutionStateStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.l1(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$b */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<fk7> {
        b() {
            super("hideAdditionalInfo", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.s6();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$b0 */
    /* loaded from: classes.dex */
    public class b0 extends ViewCommand<fk7> {
        public final int a;
        public final String b;

        b0(int i, String str) {
            super("setOrderInfo", AddToEndSingleStrategy.class);
            this.a = i;
            this.b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.C4(this.a, this.b);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$c */
    /* loaded from: classes.dex */
    public class c extends ViewCommand<fk7> {
        c() {
            super("hideCancelProgress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.a3();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$c0 */
    /* loaded from: classes.dex */
    public class c0 extends ViewCommand<fk7> {
        public final int a;
        public final String b;

        c0(int i, String str) {
            super("setOrderTitle", AddToEndSingleStrategy.class);
            this.a = i;
            this.b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.Ob(this.a, this.b);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$d */
    /* loaded from: classes.dex */
    public class d extends ViewCommand<fk7> {
        d() {
            super("hideCancelSector", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.V5();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$d0 */
    /* loaded from: classes.dex */
    public class d0 extends ViewCommand<fk7> {
        public final List<eg7> a;

        d0(List<eg7> list) {
            super("setOrderedGoods", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.Vg(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$e */
    /* loaded from: classes.dex */
    public class e extends ViewCommand<fk7> {
        e() {
            super("hideCertificateClarification", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.ce();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$e0 */
    /* loaded from: classes.dex */
    public class e0 extends ViewCommand<fk7> {
        public final int a;
        public final int b;

        e0(int i, int i2) {
            super("setProgressInOrderState", AddToEndSingleStrategy.class);
            this.a = i;
            this.b = i2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.V7(this.a, this.b);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$f */
    /* loaded from: classes.dex */
    public class f extends ViewCommand<fk7> {
        f() {
            super("hideContactSupportButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.H1();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$f0 */
    /* loaded from: classes.dex */
    public class f0 extends ViewCommand<fk7> {
        f0() {
            super("setRestaurantSubTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.e6();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$g */
    /* loaded from: classes.dex */
    public class g extends ViewCommand<fk7> {
        g() {
            super("hideContactSupportDialog", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.Z4();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$g0 */
    /* loaded from: classes.dex */
    public class g0 extends ViewCommand<fk7> {
        public final long a;

        g0(long j) {
            super("setTimer", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.Cc(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$h */
    /* loaded from: classes.dex */
    public class h extends ViewCommand<fk7> {
        h() {
            super("hideFeedbackButtons", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.Md();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$h0 */
    /* loaded from: classes.dex */
    public class h0 extends ViewCommand<fk7> {
        public final int a;
        public final String[] b;

        h0(int i, String[] strArr) {
            super("setTitleInOrderState", AddToEndSingleStrategy.class);
            this.a = i;
            this.b = strArr;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.G4(this.a, this.b);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$i */
    /* loaded from: classes.dex */
    public class i extends ViewCommand<fk7> {
        i() {
            super("hideNakedHandsText", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.G2();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$i0 */
    /* loaded from: classes.dex */
    public class i0 extends ViewCommand<fk7> {
        public final gg7 a;
        public final tv5 b;

        i0(gg7 gg7Var, tv5 tv5Var) {
            super("setUnitMarker", AddToEndSingleStrategy.class);
            this.a = gg7Var;
            this.b = tv5Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.Xd(this.a, this.b);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$j */
    /* loaded from: classes.dex */
    public class j extends ViewCommand<fk7> {
        j() {
            super("hideNiceBonusBanner", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.Y2();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$j0 */
    /* loaded from: classes.dex */
    public class j0 extends ViewCommand<fk7> {
        public final String a;

        j0(String str) {
            super("setVideoUrl", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.Ga(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$k */
    /* loaded from: classes.dex */
    public class k extends ViewCommand<fk7> {
        k() {
            super("hideStackGameView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.B1();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$k0 */
    /* loaded from: classes.dex */
    public class k0 extends ViewCommand<fk7> {
        public final sr6 a;

        k0(sr6 sr6Var) {
            super("setupMysteryShopperCheckupCard", OneExecutionStateStrategy.class);
            this.a = sr6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.Y4(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$l */
    /* loaded from: classes.dex */
    public class l extends ViewCommand<fk7> {
        l() {
            super("hideVideoSection", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.p1();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$l0 */
    /* loaded from: classes.dex */
    public class l0 extends ViewCommand<fk7> {
        public final int a;

        l0(int i) {
            super("showCancelError", SkipStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.dd(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$m */
    /* loaded from: classes.dex */
    public class m extends ViewCommand<fk7> {
        public final String a;

        m(String str) {
            super("openUrl", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.d(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$m0 */
    /* loaded from: classes.dex */
    public class m0 extends ViewCommand<fk7> {
        m0() {
            super("showCancelProgress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.Ag();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$n */
    /* loaded from: classes.dex */
    public class n extends ViewCommand<fk7> {
        n() {
            super("playFullscreenAnimation", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.B6();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$n0 */
    /* loaded from: classes.dex */
    public class n0 extends ViewCommand<fk7> {
        n0() {
            super("showCancelSector", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.J7();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$o */
    /* loaded from: classes.dex */
    public class o extends ViewCommand<fk7> {
        public final qd a;

        o(qd qdVar) {
            super("requestNotificationsPermission", OneExecutionStateStrategy.class);
            this.a = qdVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.K8(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$o0 */
    /* loaded from: classes.dex */
    public class o0 extends ViewCommand<fk7> {
        public final String a;

        o0(String str) {
            super("showCertificateClarification", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.H6(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$p */
    /* loaded from: classes.dex */
    public class p extends ViewCommand<fk7> {
        p() {
            super("saveScrollPosition", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.Ff();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$p0 */
    /* loaded from: classes.dex */
    public class p0 extends ViewCommand<fk7> {
        public final String a;

        p0(String str) {
            super("showConfirmationDialog", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.G7(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$q */
    /* loaded from: classes.dex */
    public class q extends ViewCommand<fk7> {
        q() {
            super("setCheckMark", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.x4();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$q0 */
    /* loaded from: classes.dex */
    public class q0 extends ViewCommand<fk7> {
        q0() {
            super("showContactSupportButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.s5();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$r */
    /* loaded from: classes.dex */
    public class r extends ViewCommand<fk7> {
        r() {
            super("setClearMarkers", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.v9();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$r0 */
    /* loaded from: classes.dex */
    public class r0 extends ViewCommand<fk7> {
        r0() {
            super("showContactSupportDialog", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.Xf();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$s */
    /* loaded from: classes.dex */
    public class s extends ViewCommand<fk7> {
        public final boolean a;

        s(boolean z) {
            super("setContactSupportByChatAvailable", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.Hc(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$s0 */
    /* loaded from: classes.dex */
    public class s0 extends ViewCommand<fk7> {
        public final int a;

        s0(int i) {
            super("showDeliveryToTableInfo", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.r3(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$t */
    /* loaded from: classes.dex */
    public class t extends ViewCommand<fk7> {
        public final boolean a;

        t(boolean z) {
            super("setContactSupportByPhoneAvailable", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.u4(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$t0 */
    /* loaded from: classes.dex */
    public class t0 extends ViewCommand<fk7> {
        t0() {
            super("showDraftRatingResultMessage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.wa();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$u */
    /* loaded from: classes.dex */
    public class u extends ViewCommand<fk7> {
        public final xf8 a;
        public final tv5 b;

        u(xf8 xf8Var, tv5 tv5Var) {
            super("setCourierMarker", AddToEndSingleStrategy.class);
            this.a = xf8Var;
            this.b = tv5Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.w2(this.a, this.b);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$u0 */
    /* loaded from: classes.dex */
    public class u0 extends ViewCommand<fk7> {
        u0() {
            super("showErrorRatingResultMessage", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.zc();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$v */
    /* loaded from: classes.dex */
    public class v extends ViewCommand<fk7> {
        public final gg7 a;
        public final tv5 b;

        v(gg7 gg7Var, tv5 tv5Var) {
            super("setCourierStandMarker", AddToEndSingleStrategy.class);
            this.a = gg7Var;
            this.b = tv5Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.d8(this.a, this.b);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$v0 */
    /* loaded from: classes.dex */
    public class v0 extends ViewCommand<fk7> {
        public final pq3 a;

        v0(pq3 pq3Var) {
            super("showFeedbackButtons", AddToEndSingleStrategy.class);
            this.a = pq3Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.K6(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$w */
    /* loaded from: classes.dex */
    public class w extends ViewCommand<fk7> {
        public final gg7 a;
        public final tv5 b;

        w(gg7 gg7Var, tv5 tv5Var) {
            super("setDeliveryMarker", AddToEndSingleStrategy.class);
            this.a = gg7Var;
            this.b = tv5Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.T7(this.a, this.b);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$w0 */
    /* loaded from: classes.dex */
    public class w0 extends ViewCommand<fk7> {
        w0() {
            super("showNakedHandsText", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.P7();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$x */
    /* loaded from: classes.dex */
    public class x extends ViewCommand<fk7> {
        x() {
            super("setDeliverySubTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.Ja();
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$x0 */
    /* loaded from: classes.dex */
    public class x0 extends ViewCommand<fk7> {
        public final ik8 a;

        x0(ik8 ik8Var) {
            super("showNiceBonusBanner", AddToEndSingleStrategy.class);
            this.a = ik8Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.Yb(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$y */
    /* loaded from: classes.dex */
    public class y extends ViewCommand<fk7> {
        public final int a;
        public final hn6 b;

        y(int i, hn6 hn6Var) {
            super("setGoodsSummary", AddToEndSingleStrategy.class);
            this.a = i;
            this.b = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.T5(this.a, this.b);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$y0 */
    /* loaded from: classes.dex */
    public class y0 extends ViewCommand<fk7> {
        public final oc4 a;

        y0(oc4 oc4Var) {
            super("showStackGameView", AddToEndSingleStrategy.class);
            this.a = oc4Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.f3(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$z */
    /* loaded from: classes.dex */
    public class z extends ViewCommand<fk7> {
        public final boolean a;

        z(boolean z) {
            super("setMoveCamera", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.Xc(this.a);
        }
    }

    /* compiled from: OrderSummaryView$$State.java */
    /* renamed from: ek7$z0 */
    /* loaded from: classes.dex */
    public class z0 extends ViewCommand<fk7> {
        z0() {
            super("showVideoSection", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fk7 fk7Var) {
            fk7Var.he();
        }
    }

    @Override // defpackage.fk7
    public void Ag() {
        m0 m0Var = new m0();
        this.viewCommands.beforeApply(m0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ag();
        }
        this.viewCommands.afterApply(m0Var);
    }

    @Override // defpackage.fk7
    public void B1() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.B1();
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.fk7
    public void B6() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.B6();
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.fk7
    public void C4(int i2, String str) {
        b0 b0Var = new b0(i2, str);
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.C4(i2, str);
        }
        this.viewCommands.afterApply(b0Var);
    }

    @Override // defpackage.fk7
    public void Cc(long j2) {
        g0 g0Var = new g0(j2);
        this.viewCommands.beforeApply(g0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Cc(j2);
        }
        this.viewCommands.afterApply(g0Var);
    }

    @Override // defpackage.fk7
    public void Ff() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ff();
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.fk7
    public void G2() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.G2();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.fk7
    public void G4(int i2, String[] strArr) {
        h0 h0Var = new h0(i2, strArr);
        this.viewCommands.beforeApply(h0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.G4(i2, strArr);
        }
        this.viewCommands.afterApply(h0Var);
    }

    @Override // defpackage.fk7
    public void G7(String str) {
        p0 p0Var = new p0(str);
        this.viewCommands.beforeApply(p0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.G7(str);
        }
        this.viewCommands.afterApply(p0Var);
    }

    @Override // defpackage.fk7
    public void Ga(String str) {
        j0 j0Var = new j0(str);
        this.viewCommands.beforeApply(j0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ga(str);
        }
        this.viewCommands.afterApply(j0Var);
    }

    @Override // defpackage.fk7
    public void H1() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.H1();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.fk7
    public void H6(String str) {
        o0 o0Var = new o0(str);
        this.viewCommands.beforeApply(o0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.H6(str);
        }
        this.viewCommands.afterApply(o0Var);
    }

    @Override // defpackage.fk7
    public void Hc(boolean z2) {
        s sVar = new s(z2);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Hc(z2);
        }
        this.viewCommands.afterApply(sVar);
    }

    @Override // defpackage.fk7
    public void J7() {
        n0 n0Var = new n0();
        this.viewCommands.beforeApply(n0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.J7();
        }
        this.viewCommands.afterApply(n0Var);
    }

    @Override // defpackage.fk7
    public void Ja() {
        x xVar = new x();
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ja();
        }
        this.viewCommands.afterApply(xVar);
    }

    @Override // defpackage.fk7
    public void K6(pq3 pq3Var) {
        v0 v0Var = new v0(pq3Var);
        this.viewCommands.beforeApply(v0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.K6(pq3Var);
        }
        this.viewCommands.afterApply(v0Var);
    }

    @Override // defpackage.fk7
    public void K8(qd qdVar) {
        o oVar = new o(qdVar);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.K8(qdVar);
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.fk7
    public void Md() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Md();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.fk7
    public void Ob(int i2, String str) {
        c0 c0Var = new c0(i2, str);
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ob(i2, str);
        }
        this.viewCommands.afterApply(c0Var);
    }

    @Override // defpackage.fk7
    public void P7() {
        w0 w0Var = new w0();
        this.viewCommands.beforeApply(w0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.P7();
        }
        this.viewCommands.afterApply(w0Var);
    }

    @Override // defpackage.fk7
    public void T5(int i2, hn6 hn6Var) {
        y yVar = new y(i2, hn6Var);
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.T5(i2, hn6Var);
        }
        this.viewCommands.afterApply(yVar);
    }

    @Override // defpackage.fk7
    public void T7(gg7 gg7Var, tv5 tv5Var) {
        w wVar = new w(gg7Var, tv5Var);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.T7(gg7Var, tv5Var);
        }
        this.viewCommands.afterApply(wVar);
    }

    @Override // defpackage.fk7
    public void V5() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.V5();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.fk7
    public void V7(int i2, int i3) {
        e0 e0Var = new e0(i2, i3);
        this.viewCommands.beforeApply(e0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.V7(i2, i3);
        }
        this.viewCommands.afterApply(e0Var);
    }

    @Override // defpackage.fk7
    public void Vg(List<eg7> list) {
        d0 d0Var = new d0(list);
        this.viewCommands.beforeApply(d0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Vg(list);
        }
        this.viewCommands.afterApply(d0Var);
    }

    @Override // defpackage.fk7
    public void Xc(boolean z2) {
        z zVar = new z(z2);
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Xc(z2);
        }
        this.viewCommands.afterApply(zVar);
    }

    @Override // defpackage.fk7
    public void Xd(gg7 gg7Var, tv5 tv5Var) {
        i0 i0Var = new i0(gg7Var, tv5Var);
        this.viewCommands.beforeApply(i0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Xd(gg7Var, tv5Var);
        }
        this.viewCommands.afterApply(i0Var);
    }

    @Override // defpackage.fk7
    public void Xf() {
        r0 r0Var = new r0();
        this.viewCommands.beforeApply(r0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Xf();
        }
        this.viewCommands.afterApply(r0Var);
    }

    @Override // defpackage.fk7
    public void Y2() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Y2();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.fk7
    public void Y4(sr6 sr6Var) {
        k0 k0Var = new k0(sr6Var);
        this.viewCommands.beforeApply(k0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Y4(sr6Var);
        }
        this.viewCommands.afterApply(k0Var);
    }

    @Override // defpackage.fk7
    public void Yb(ik8 ik8Var) {
        x0 x0Var = new x0(ik8Var);
        this.viewCommands.beforeApply(x0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Yb(ik8Var);
        }
        this.viewCommands.afterApply(x0Var);
    }

    @Override // defpackage.fk7
    public void Z4() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Z4();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.fk7
    public void a3() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.a3();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.fk7
    public void ce() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ce();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.fk7
    public void d(String str) {
        m mVar = new m(str);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.d(str);
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.fk7
    public void d8(gg7 gg7Var, tv5 tv5Var) {
        v vVar = new v(gg7Var, tv5Var);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.d8(gg7Var, tv5Var);
        }
        this.viewCommands.afterApply(vVar);
    }

    @Override // defpackage.fk7
    public void dd(int i2) {
        l0 l0Var = new l0(i2);
        this.viewCommands.beforeApply(l0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.dd(i2);
        }
        this.viewCommands.afterApply(l0Var);
    }

    @Override // defpackage.fk7
    public void e6() {
        f0 f0Var = new f0();
        this.viewCommands.beforeApply(f0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.e6();
        }
        this.viewCommands.afterApply(f0Var);
    }

    @Override // defpackage.fk7
    public void ec(String str) {
        a aVar = new a(str);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ec(str);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.fk7
    public void f3(oc4 oc4Var) {
        y0 y0Var = new y0(oc4Var);
        this.viewCommands.beforeApply(y0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.f3(oc4Var);
        }
        this.viewCommands.afterApply(y0Var);
    }

    @Override // defpackage.fk7
    public void he() {
        z0 z0Var = new z0();
        this.viewCommands.beforeApply(z0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.he();
        }
        this.viewCommands.afterApply(z0Var);
    }

    @Override // defpackage.fk7
    public void l1(boolean z2) {
        a0 a0Var = new a0(z2);
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.l1(z2);
        }
        this.viewCommands.afterApply(a0Var);
    }

    @Override // defpackage.fk7
    public void p1() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.p1();
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.fk7
    public void r3(int i2) {
        s0 s0Var = new s0(i2);
        this.viewCommands.beforeApply(s0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.r3(i2);
        }
        this.viewCommands.afterApply(s0Var);
    }

    @Override // defpackage.fk7
    public void s5() {
        q0 q0Var = new q0();
        this.viewCommands.beforeApply(q0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.s5();
        }
        this.viewCommands.afterApply(q0Var);
    }

    @Override // defpackage.fk7
    public void s6() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.s6();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.fk7
    public void u4(boolean z2) {
        t tVar = new t(z2);
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.u4(z2);
        }
        this.viewCommands.afterApply(tVar);
    }

    @Override // defpackage.fk7
    public void v9() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.v9();
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // defpackage.fk7
    public void w2(xf8 xf8Var, tv5 tv5Var) {
        u uVar = new u(xf8Var, tv5Var);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.w2(xf8Var, tv5Var);
        }
        this.viewCommands.afterApply(uVar);
    }

    @Override // defpackage.fk7
    public void wa() {
        t0 t0Var = new t0();
        this.viewCommands.beforeApply(t0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.wa();
        }
        this.viewCommands.afterApply(t0Var);
    }

    @Override // defpackage.fk7
    public void x4() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.x4();
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // defpackage.fk7
    public void zc() {
        u0 u0Var = new u0();
        this.viewCommands.beforeApply(u0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.zc();
        }
        this.viewCommands.afterApply(u0Var);
    }
}
