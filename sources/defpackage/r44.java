package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: FoodMenuView$$State.java */
/* renamed from: r44  reason: default package */
/* loaded from: classes2.dex */
public class r44 extends MvpViewState<s44> implements s44 {

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<s44> {
        a() {
            super("addMarginToFirstCategoryTab", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.Af();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$a0 */
    /* loaded from: classes2.dex */
    public class a0 extends ViewCommand<s44> {
        public final boolean a;

        a0(boolean z) {
            super("showConnectionError", SkipStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.L(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<s44> {
        b() {
            super("addOrderTypeSwitcher", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.Pf();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$b0 */
    /* loaded from: classes2.dex */
    public class b0 extends ViewCommand<s44> {
        public final vy4 a;

        b0(vy4 vy4Var) {
            super("showInAppNotification", AddToEndSingleStrategy.class);
            this.a = vy4Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.xb(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<s44> {
        c() {
            super("hideActiveOrderWidget", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.Qb();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$c0 */
    /* loaded from: classes2.dex */
    public class c0 extends ViewCommand<s44> {
        public final String a;

        c0(String str) {
            super("showInfoStory", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.F(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<s44> {
        d() {
            super("hideCartButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.k9();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$d0 */
    /* loaded from: classes2.dex */
    public class d0 extends ViewCommand<s44> {
        public final double a;

        d0(double d) {
            super("showLoyaltyBalance", AddToEndSingleStrategy.class);
            this.a = d;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.tf(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<s44> {
        e() {
            super("hideInAppNotification", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.z1();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$e0 */
    /* loaded from: classes2.dex */
    public class e0 extends ViewCommand<s44> {
        public final boolean a;

        e0(boolean z) {
            super("showMenuLoading", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.ae(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<s44> {
        f() {
            super("hideLoyaltyBalance", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.cf();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$f0 */
    /* loaded from: classes2.dex */
    public class f0 extends ViewCommand<s44> {
        public final hn6 a;

        f0(hn6 hn6Var) {
            super("showMinDeliveryPrice", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.kg(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<s44> {
        g() {
            super("hideMinDeliveryPrice", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.Lc();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$g0 */
    /* loaded from: classes2.dex */
    public class g0 extends ViewCommand<s44> {
        public final nq8 a;

        g0(nq8 nq8Var) {
            super("showPromotionProducts", AddToEndSingleStrategy.class);
            this.a = nq8Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.D1(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<s44> {
        h() {
            super("hidePromotionProducts", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.s9();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$h0 */
    /* loaded from: classes2.dex */
    public class h0 extends ViewCommand<s44> {
        h0() {
            super("showSearch", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.showSearch();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<s44> {
        i() {
            super("hideSearch", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.M4();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$i0 */
    /* loaded from: classes2.dex */
    public class i0 extends ViewCommand<s44> {
        public final Collection<ce0> a;

        i0(Collection<ce0> collection) {
            super("showSpecialOffers", AddToEndSingleStrategy.class);
            this.a = collection;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.O3(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<s44> {
        j() {
            super("hideSpecialOffers", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.Ee();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$j0 */
    /* loaded from: classes2.dex */
    public class j0 extends ViewCommand<s44> {
        j0() {
            super("showSpecialOffersLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.od();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<s44> {
        k() {
            super("hideSpecialOffersLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.V9();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$k0 */
    /* loaded from: classes2.dex */
    public class k0 extends ViewCommand<s44> {
        public final Collection<String> a;

        k0(Collection<String> collection) {
            super("showStories", AddToEndSingleStrategy.class);
            this.a = collection;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.Zc(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$l */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<s44> {
        l() {
            super("hideStories", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.A9();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$l0 */
    /* loaded from: classes2.dex */
    public class l0 extends ViewCommand<s44> {
        public final int a;

        l0(int i) {
            super("showUnreadChatMessagesCount", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.h(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$m */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<s44> {
        m() {
            super("hideUnreadChatMessagesCount", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.i();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$n */
    /* loaded from: classes2.dex */
    public class n extends ViewCommand<s44> {
        public final List<String> a;

        n(List<String> list) {
            super("loadImages", SkipStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.w5(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$o */
    /* loaded from: classes2.dex */
    public class o extends ViewCommand<s44> {
        public final String a;

        o(String str) {
            super("openInAppNotificationDeepLink", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.Za(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$p */
    /* loaded from: classes2.dex */
    public class p extends ViewCommand<s44> {
        p() {
            super("removeMarginToFirstCategoryTab", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.p9();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$q */
    /* loaded from: classes2.dex */
    public class q extends ViewCommand<s44> {
        public final int a;

        q(int i) {
            super("scrollListMenuToCategory", OneExecutionStateStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.t9(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$r */
    /* loaded from: classes2.dex */
    public class r extends ViewCommand<s44> {
        public final String a;

        r(String str) {
            super("setCityName", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.F0(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$s */
    /* loaded from: classes2.dex */
    public class s extends ViewCommand<s44> {
        public final boolean a;

        s(boolean z) {
            super("setSpecialOffersTitleVisible", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.o8(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$t */
    /* loaded from: classes2.dex */
    public class t extends ViewCommand<s44> {
        public final nh6 a;

        t(nh6 nh6Var) {
            super("setupFoodMenuProducts", AddToEndSingleStrategy.class);
            this.a = nh6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.md(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$u */
    /* loaded from: classes2.dex */
    public class u extends ViewCommand<s44> {
        public final nh6 a;
        public final int b;

        u(nh6 nh6Var, int i) {
            super("setupFoodMenuProductsWithPosition", AddToEndSingleStrategy.class);
            this.a = nh6Var;
            this.b = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.H7(this.a, this.b);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$v */
    /* loaded from: classes2.dex */
    public class v extends ViewCommand<s44> {
        v() {
            super("showActiveOrderWidget", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.Ld();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$w */
    /* loaded from: classes2.dex */
    public class w extends ViewCommand<s44> {
        public final int a;
        public final Function0<Unit> b;

        w(int i, Function0<Unit> function0) {
            super("showAddToCartAnimation", OneExecutionStateStrategy.class);
            this.a = i;
            this.b = function0;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.qf(this.a, this.b);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$x */
    /* loaded from: classes2.dex */
    public class x extends ViewCommand<s44> {
        x() {
            super("showBonusActionAppliedAlert", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.n6();
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$y */
    /* loaded from: classes2.dex */
    public class y extends ViewCommand<s44> {
        public final ce0 a;

        y(ce0 ce0Var) {
            super("showBonusAction", SkipStrategy.class);
            this.a = ce0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.j9(this.a);
        }
    }

    /* compiled from: FoodMenuView$$State.java */
    /* renamed from: r44$z */
    /* loaded from: classes2.dex */
    public class z extends ViewCommand<s44> {
        z() {
            super("showCartButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s44 s44Var) {
            s44Var.eg();
        }
    }

    @Override // defpackage.s44
    public void A9() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.A9();
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.s44
    public void Af() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Af();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.s44
    public void D1(nq8 nq8Var) {
        g0 g0Var = new g0(nq8Var);
        this.viewCommands.beforeApply(g0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.D1(nq8Var);
        }
        this.viewCommands.afterApply(g0Var);
    }

    @Override // defpackage.s44
    public void Ee() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ee();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.s44
    public void F(String str) {
        c0 c0Var = new c0(str);
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.F(str);
        }
        this.viewCommands.afterApply(c0Var);
    }

    @Override // defpackage.s44
    public void F0(String str) {
        r rVar = new r(str);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.F0(str);
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // defpackage.s44
    public void H7(nh6 nh6Var, int i2) {
        u uVar = new u(nh6Var, i2);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.H7(nh6Var, i2);
        }
        this.viewCommands.afterApply(uVar);
    }

    @Override // defpackage.s44
    public void L(boolean z2) {
        a0 a0Var = new a0(z2);
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.L(z2);
        }
        this.viewCommands.afterApply(a0Var);
    }

    @Override // defpackage.s44
    public void Lc() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Lc();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.s44
    public void Ld() {
        v vVar = new v();
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ld();
        }
        this.viewCommands.afterApply(vVar);
    }

    @Override // defpackage.s44
    public void M4() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.M4();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.s44
    public void O3(Collection<ce0> collection) {
        i0 i0Var = new i0(collection);
        this.viewCommands.beforeApply(i0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.O3(collection);
        }
        this.viewCommands.afterApply(i0Var);
    }

    @Override // defpackage.s44
    public void Pf() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Pf();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.s44
    public void Qb() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Qb();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.s44
    public void V9() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.V9();
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.s44
    public void Za(String str) {
        o oVar = new o(str);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Za(str);
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.s44
    public void Zc(Collection<String> collection) {
        k0 k0Var = new k0(collection);
        this.viewCommands.beforeApply(k0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Zc(collection);
        }
        this.viewCommands.afterApply(k0Var);
    }

    @Override // defpackage.s44
    public void ae(boolean z2) {
        e0 e0Var = new e0(z2);
        this.viewCommands.beforeApply(e0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ae(z2);
        }
        this.viewCommands.afterApply(e0Var);
    }

    @Override // defpackage.s44
    public void cf() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.cf();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.s44
    public void eg() {
        z zVar = new z();
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.eg();
        }
        this.viewCommands.afterApply(zVar);
    }

    @Override // defpackage.s44
    public void h(int i2) {
        l0 l0Var = new l0(i2);
        this.viewCommands.beforeApply(l0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.h(i2);
        }
        this.viewCommands.afterApply(l0Var);
    }

    @Override // defpackage.s44
    public void i() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.i();
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.s44
    public void j9(ce0 ce0Var) {
        y yVar = new y(ce0Var);
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.j9(ce0Var);
        }
        this.viewCommands.afterApply(yVar);
    }

    @Override // defpackage.s44
    public void k9() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.k9();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.s44
    public void kg(hn6 hn6Var) {
        f0 f0Var = new f0(hn6Var);
        this.viewCommands.beforeApply(f0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.kg(hn6Var);
        }
        this.viewCommands.afterApply(f0Var);
    }

    @Override // defpackage.s44
    public void md(nh6 nh6Var) {
        t tVar = new t(nh6Var);
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.md(nh6Var);
        }
        this.viewCommands.afterApply(tVar);
    }

    @Override // defpackage.s44
    public void n6() {
        x xVar = new x();
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.n6();
        }
        this.viewCommands.afterApply(xVar);
    }

    @Override // defpackage.s44
    public void o8(boolean z2) {
        s sVar = new s(z2);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.o8(z2);
        }
        this.viewCommands.afterApply(sVar);
    }

    @Override // defpackage.s44
    public void od() {
        j0 j0Var = new j0();
        this.viewCommands.beforeApply(j0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.od();
        }
        this.viewCommands.afterApply(j0Var);
    }

    @Override // defpackage.s44
    public void p9() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.p9();
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.s44
    public void qf(int i2, Function0<Unit> function0) {
        w wVar = new w(i2, function0);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.qf(i2, function0);
        }
        this.viewCommands.afterApply(wVar);
    }

    @Override // defpackage.s44
    public void s9() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.s9();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.s44
    public void showSearch() {
        h0 h0Var = new h0();
        this.viewCommands.beforeApply(h0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.showSearch();
        }
        this.viewCommands.afterApply(h0Var);
    }

    @Override // defpackage.s44
    public void t9(int i2) {
        q qVar = new q(i2);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.t9(i2);
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // defpackage.s44
    public void tf(double d2) {
        d0 d0Var = new d0(d2);
        this.viewCommands.beforeApply(d0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.tf(d2);
        }
        this.viewCommands.afterApply(d0Var);
    }

    @Override // defpackage.s44
    public void w5(List<String> list) {
        n nVar = new n(list);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.w5(list);
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.s44
    public void xb(vy4 vy4Var) {
        b0 b0Var = new b0(vy4Var);
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.xb(vy4Var);
        }
        this.viewCommands.afterApply(b0Var);
    }

    @Override // defpackage.s44
    public void z1() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.z1();
        }
        this.viewCommands.afterApply(eVar);
    }
}
