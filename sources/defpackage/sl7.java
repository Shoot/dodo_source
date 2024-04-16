package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: OrderTypeSwitcherView$$State.java */
/* renamed from: sl7  reason: default package */
/* loaded from: classes2.dex */
public class sl7 extends MvpViewState<tl7> implements tl7 {

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<tl7> {
        a() {
            super("hideAddressError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.n8();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$a0 */
    /* loaded from: classes2.dex */
    public class a0 extends ViewCommand<tl7> {
        public final d88 a;

        a0(d88 d88Var) {
            super("showNearestPizzeriaSuggestion", SkipStrategy.class);
            this.a = d88Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.t1(this.a);
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<tl7> {
        b() {
            super("hideAverageDeliveryTime", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.fg();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$b0 */
    /* loaded from: classes2.dex */
    public class b0 extends ViewCommand<tl7> {
        b0() {
            super("showNoCarryoutPizzeriaText", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.t4();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<tl7> {
        c() {
            super("hide", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.Y0();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$c0 */
    /* loaded from: classes2.dex */
    public class c0 extends ViewCommand<tl7> {
        c0() {
            super("showNoDeliveryAddressText", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.z7();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<tl7> {
        d() {
            super("hideOrderTypeIcon", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.e9();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$d0 */
    /* loaded from: classes2.dex */
    public class d0 extends ViewCommand<tl7> {
        public final String a;

        d0(String str) {
            super("showNoPaymentMethodError", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.c7(this.a);
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<tl7> {
        e() {
            super("hideRestaurantDiscount", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.W();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$e0 */
    /* loaded from: classes2.dex */
    public class e0 extends ViewCommand<tl7> {
        public final String a;

        e0(String str) {
            super("showNoPaymentMethodsFlash", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.O1(this.a);
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<tl7> {
        f() {
            super("requestLocation", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.k();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$f0 */
    /* loaded from: classes2.dex */
    public class f0 extends ViewCommand<tl7> {
        f0() {
            super("showNoRestaurantPizzeriaText", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.x7();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<tl7> {
        g() {
            super("setAddressDisabledColor", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.Jb();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$g0 */
    /* loaded from: classes2.dex */
    public class g0 extends ViewCommand<tl7> {
        public final String a;

        g0(String str) {
            super("showPizzeriaClosedBySchedule", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.S1(this.a);
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<tl7> {
        h() {
            super("setAddressOrangeColor", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.Mg();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$h0 */
    /* loaded from: classes2.dex */
    public class h0 extends ViewCommand<tl7> {
        h0() {
            super("showPizzeriaInStopError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.z9();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<tl7> {
        i() {
            super("setBlackAddressColor", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.ge();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$i0 */
    /* loaded from: classes2.dex */
    public class i0 extends ViewCommand<tl7> {
        public final String a;

        i0(String str) {
            super("showRestaurantDiscount", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.P0(this.a);
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<tl7> {
        j() {
            super("setDeliverySelected", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.r6();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$j0 */
    /* loaded from: classes2.dex */
    public class j0 extends ViewCommand<tl7> {
        j0() {
            super("showRestaurantIcon", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.K3();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<tl7> {
        public final boolean a;

        k(boolean z) {
            super("setOrderTypeSwitcherEnabled", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.r1(this.a);
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$k0 */
    /* loaded from: classes2.dex */
    public class k0 extends ViewCommand<tl7> {
        k0() {
            super("showUndeliverableAddressError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.wb();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$l */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<tl7> {
        l() {
            super("setRestaurantSelected", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.N9();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$m */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<tl7> {
        public final String a;

        m(String str) {
            super("showAddress", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.A0(this.a);
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$n */
    /* loaded from: classes2.dex */
    public class n extends ViewCommand<tl7> {
        n() {
            super("showAddressInStopMessage", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.W1();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$o */
    /* loaded from: classes2.dex */
    public class o extends ViewCommand<tl7> {
        o() {
            super("showAddressView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.c4();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$p */
    /* loaded from: classes2.dex */
    public class p extends ViewCommand<tl7> {
        public final int a;

        p(int i) {
            super("showAverageDeliveryTime", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.j8(this.a);
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$q */
    /* loaded from: classes2.dex */
    public class q extends ViewCommand<tl7> {
        q() {
            super("showCarryoutIcon", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.af();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$r */
    /* loaded from: classes2.dex */
    public class r extends ViewCommand<tl7> {
        r() {
            super("showDeliveryIcon", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.c9();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$s */
    /* loaded from: classes2.dex */
    public class s extends ViewCommand<tl7> {
        s() {
            super("showDeliveryStoppedError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.Mf();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$t */
    /* loaded from: classes2.dex */
    public class t extends ViewCommand<tl7> {
        public final e91 a;

        t(e91 e91Var) {
            super("showDistanceToDeliveryAddressSuggestion", SkipStrategy.class);
            this.a = e91Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.F6(this.a);
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$u */
    /* loaded from: classes2.dex */
    public class u extends ViewCommand<tl7> {
        u() {
            super("showErrorIcon", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.N3();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$v */
    /* loaded from: classes2.dex */
    public class v extends ViewCommand<tl7> {
        public final String a;

        v(String str) {
            super("showFeeDeliveryPrice", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.bh(this.a);
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$w */
    /* loaded from: classes2.dex */
    public class w extends ViewCommand<tl7> {
        w() {
            super("showFreeDelivery", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.j3();
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$x */
    /* loaded from: classes2.dex */
    public class x extends ViewCommand<tl7> {
        public final hn6 a;
        public final hn6 b;
        public final int c;
        public final int d;

        x(hn6 hn6Var, hn6 hn6Var2, int i, int i2) {
            super("showFreeDeliveryWithMinDeliveryPriceAnimated", AddToEndSingleStrategy.class);
            this.a = hn6Var;
            this.b = hn6Var2;
            this.c = i;
            this.d = i2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.P4(this.a, this.b, this.c, this.d);
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$y */
    /* loaded from: classes2.dex */
    public class y extends ViewCommand<tl7> {
        public final hn6 a;

        y(hn6 hn6Var) {
            super("showFreeDeliveryWithMinDeliveryPrice", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.Ia(this.a);
        }
    }

    /* compiled from: OrderTypeSwitcherView$$State.java */
    /* renamed from: sl7$z */
    /* loaded from: classes2.dex */
    public class z extends ViewCommand<tl7> {
        z() {
            super("showLoader", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tl7 tl7Var) {
            tl7Var.showLoader();
        }
    }

    @Override // defpackage.tl7
    public void A0(String str) {
        m mVar = new m(str);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.A0(str);
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.tl7
    public void F6(e91 e91Var) {
        t tVar = new t(e91Var);
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.F6(e91Var);
        }
        this.viewCommands.afterApply(tVar);
    }

    @Override // defpackage.tl7
    public void Ia(hn6 hn6Var) {
        y yVar = new y(hn6Var);
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ia(hn6Var);
        }
        this.viewCommands.afterApply(yVar);
    }

    @Override // defpackage.tl7
    public void Jb() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Jb();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.tl7
    public void K3() {
        j0 j0Var = new j0();
        this.viewCommands.beforeApply(j0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.K3();
        }
        this.viewCommands.afterApply(j0Var);
    }

    @Override // defpackage.tl7
    public void Mf() {
        s sVar = new s();
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Mf();
        }
        this.viewCommands.afterApply(sVar);
    }

    @Override // defpackage.tl7
    public void Mg() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Mg();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.tl7
    public void N3() {
        u uVar = new u();
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.N3();
        }
        this.viewCommands.afterApply(uVar);
    }

    @Override // defpackage.tl7
    public void N9() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.N9();
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.tl7
    public void O1(String str) {
        e0 e0Var = new e0(str);
        this.viewCommands.beforeApply(e0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.O1(str);
        }
        this.viewCommands.afterApply(e0Var);
    }

    @Override // defpackage.tl7
    public void P0(String str) {
        i0 i0Var = new i0(str);
        this.viewCommands.beforeApply(i0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.P0(str);
        }
        this.viewCommands.afterApply(i0Var);
    }

    @Override // defpackage.tl7
    public void P4(hn6 hn6Var, hn6 hn6Var2, int i2, int i3) {
        x xVar = new x(hn6Var, hn6Var2, i2, i3);
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.P4(hn6Var, hn6Var2, i2, i3);
        }
        this.viewCommands.afterApply(xVar);
    }

    @Override // defpackage.tl7
    public void S1(String str) {
        g0 g0Var = new g0(str);
        this.viewCommands.beforeApply(g0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.S1(str);
        }
        this.viewCommands.afterApply(g0Var);
    }

    @Override // defpackage.tl7
    public void W() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.W();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.tl7
    public void W1() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.W1();
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.tl7
    public void Y0() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Y0();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.tl7
    public void af() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.af();
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // defpackage.tl7
    public void bh(String str) {
        v vVar = new v(str);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.bh(str);
        }
        this.viewCommands.afterApply(vVar);
    }

    @Override // defpackage.tl7
    public void c4() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.c4();
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.tl7
    public void c7(String str) {
        d0 d0Var = new d0(str);
        this.viewCommands.beforeApply(d0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.c7(str);
        }
        this.viewCommands.afterApply(d0Var);
    }

    @Override // defpackage.tl7
    public void c9() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.c9();
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // defpackage.tl7
    public void e9() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.e9();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.tl7
    public void fg() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.fg();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.tl7
    public void ge() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ge();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.tl7
    public void j3() {
        w wVar = new w();
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.j3();
        }
        this.viewCommands.afterApply(wVar);
    }

    @Override // defpackage.tl7
    public void j8(int i2) {
        p pVar = new p(i2);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.j8(i2);
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.tl7
    public void k() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.k();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.tl7
    public void n8() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.n8();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.tl7
    public void r1(boolean z2) {
        k kVar = new k(z2);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.r1(z2);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.tl7
    public void r6() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.r6();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.tl7
    public void showLoader() {
        z zVar = new z();
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.showLoader();
        }
        this.viewCommands.afterApply(zVar);
    }

    @Override // defpackage.tl7
    public void t1(d88 d88Var) {
        a0 a0Var = new a0(d88Var);
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.t1(d88Var);
        }
        this.viewCommands.afterApply(a0Var);
    }

    @Override // defpackage.tl7
    public void t4() {
        b0 b0Var = new b0();
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.t4();
        }
        this.viewCommands.afterApply(b0Var);
    }

    @Override // defpackage.tl7
    public void wb() {
        k0 k0Var = new k0();
        this.viewCommands.beforeApply(k0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.wb();
        }
        this.viewCommands.afterApply(k0Var);
    }

    @Override // defpackage.tl7
    public void x7() {
        f0 f0Var = new f0();
        this.viewCommands.beforeApply(f0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.x7();
        }
        this.viewCommands.afterApply(f0Var);
    }

    @Override // defpackage.tl7
    public void z7() {
        c0 c0Var = new c0();
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.z7();
        }
        this.viewCommands.afterApply(c0Var);
    }

    @Override // defpackage.tl7
    public void z9() {
        h0 h0Var = new h0();
        this.viewCommands.beforeApply(h0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.z9();
        }
        this.viewCommands.afterApply(h0Var);
    }
}
