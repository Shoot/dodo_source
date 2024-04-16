package com.dodopizza.order.feature.product.card.presentation.pizza;

import com.dodopizza.order.feature.product.card.presentation.pizza.PizzaProductCardPresenter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: PizzaProductCardView$$State.java */
/* loaded from: classes2.dex */
public class d extends MvpViewState<com.dodopizza.order.feature.product.card.presentation.pizza.e> implements com.dodopizza.order.feature.product.card.presentation.pizza.e {

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final List<Integer> a;

        a(List<Integer> list) {
            super("activateSizeDiscount", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.Xa(this.a);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class a0 extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        a0() {
            super("showToppings", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.O();
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final List<Integer> a;
        public final List<Integer> b;
        public final List<Integer> c;

        b(List<Integer> list, List<Integer> list2, List<Integer> list3) {
            super("configureDoughControls", AddToEndSingleStrategy.class);
            this.a = list;
            this.b = list2;
            this.c = list3;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.t7(this.a, this.b, this.c);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class b0 extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        b0() {
            super("startArPizza", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.Ub();
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final List<Integer> a;
        public final List<Integer> b;
        public final List<Integer> c;

        c(List<Integer> list, List<Integer> list2, List<Integer> list3) {
            super("configureSizeControls", AddToEndSingleStrategy.class);
            this.a = list;
            this.b = list2;
            this.c = list3;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.Q(this.a, this.b, this.c);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class c0 extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final boolean a;

        c0(boolean z) {
            super("switchButtonMode", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.I5(this.a);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* renamed from: com.dodopizza.order.feature.product.card.presentation.pizza.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0196d extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final int a;

        C0196d(int i) {
            super("deactivateSizeDiscount", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.R1(this.a);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class d0 extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final x78 a;

        d0(x78 x78Var) {
            super("updateViewsInfo", AddToEndSingleStrategy.class);
            this.a = x78Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.Vd(this.a);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final boolean a;

        e(boolean z) {
            super("enablePersonalPriceTimer", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.I(this.a);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        f() {
            super("hideDiscountBadge", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.N();
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        g() {
            super("hideDiscountBadgesOnVariationControl", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.G0();
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        h() {
            super("hideDoughControl", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.na();
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        i() {
            super("hideToppings", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.t();
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final int a;
        public final int b;

        j(int i, int i2) {
            super("selectPizza", AddToEndSingleStrategy.class);
            this.a = i;
            this.b = i2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.ch(this.a, this.b);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final hn6 a;

        k(hn6 hn6Var) {
            super("setAddToCartWithPriceOnButton", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.i0(this.a);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final hn6 a;
        public final PizzaProductCardPresenter.a b;

        l(hn6 hn6Var, PizzaProductCardPresenter.a aVar) {
            super("setOnePricesAndTextInBottomView", AddToEndSingleStrategy.class);
            this.a = hn6Var;
            this.b = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.X4(this.a, this.b);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final long a;

        m(long j) {
            super("setPersonalPriceTimer", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.x(this.a);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class n extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final List<kjb> a;

        n(List<kjb> list) {
            super("setToppingsDataSet", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.C0(this.a);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class o extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final hn6 a;
        public final hn6 b;
        public final PizzaProductCardPresenter.a c;

        o(hn6 hn6Var, hn6 hn6Var2, PizzaProductCardPresenter.a aVar) {
            super("setTwoPricesAndTextInBottomView", AddToEndSingleStrategy.class);
            this.a = hn6Var;
            this.b = hn6Var2;
            this.c = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.n3(this.a, this.b, this.c);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class p extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final x78 a;

        p(x78 x78Var) {
            super("setViewsInfo", AddToEndSingleStrategy.class);
            this.a = x78Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.pa(this.a);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class q extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final Map<Integer, String> a;

        q(Map<Integer, String> map) {
            super("setupDoughNames", AddToEndSingleStrategy.class);
            this.a = map;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.Ed(this.a);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class r extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final b78 a;

        r(b78 b78Var) {
            super("setupImageViewForPizza", AddToEndSingleStrategy.class);
            this.a = b78Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.T0(this.a);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class s extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final Map<Integer, String> a;

        s(Map<Integer, String> map) {
            super("setupSizeNames", AddToEndSingleStrategy.class);
            this.a = map;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.H0(this.a);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class t extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        t() {
            super("showArPizzaButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.Lg();
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class u extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final Collection<ul8> a;
        public final Collection<String> b;

        u(Collection<ul8> collection, Collection<String> collection2) {
            super("showDescription", AddToEndSingleStrategy.class);
            this.a = collection;
            this.b = collection2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.J5(this.a, this.b);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class v extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        v() {
            super("showDiscountBadge", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.p();
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class w extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        w() {
            super("showDiscountExpiredPersonalPriceBadge", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.E();
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class x extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        x() {
            super("showDoughControl", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.va();
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class y extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        public final String a;
        public final List<vl8> b;

        y(String str, List<vl8> list) {
            super("showRemoveIngredientDialog", OneExecutionStateStrategy.class);
            this.a = str;
            this.b = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.T(this.a, this.b);
        }
    }

    /* compiled from: PizzaProductCardView$$State.java */
    /* loaded from: classes2.dex */
    public class z extends ViewCommand<com.dodopizza.order.feature.product.card.presentation.pizza.e> {
        z() {
            super("showStop", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.product.card.presentation.pizza.e eVar) {
            eVar.m0();
        }
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void C0(List<kjb> list) {
        n nVar = new n(list);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.C0(list);
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void E() {
        w wVar = new w();
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.E();
        }
        this.viewCommands.afterApply(wVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void Ed(Map<Integer, String> map) {
        q qVar = new q(map);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ed(map);
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void G0() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.G0();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void H0(Map<Integer, String> map) {
        s sVar = new s(map);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.H0(map);
        }
        this.viewCommands.afterApply(sVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void I(boolean z2) {
        e eVar = new e(z2);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.I(z2);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.jl8
    public void I5(boolean z2) {
        c0 c0Var = new c0(z2);
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.I5(z2);
        }
        this.viewCommands.afterApply(c0Var);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void J5(Collection<ul8> collection, Collection<String> collection2) {
        u uVar = new u(collection, collection2);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.J5(collection, collection2);
        }
        this.viewCommands.afterApply(uVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void Lg() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Lg();
        }
        this.viewCommands.afterApply(tVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void N() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.N();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void O() {
        a0 a0Var = new a0();
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.O();
        }
        this.viewCommands.afterApply(a0Var);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void Q(List<Integer> list, List<Integer> list2, List<Integer> list3) {
        c cVar = new c(list, list2, list3);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Q(list, list2, list3);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void R1(int i2) {
        C0196d c0196d = new C0196d(i2);
        this.viewCommands.beforeApply(c0196d);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.R1(i2);
        }
        this.viewCommands.afterApply(c0196d);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void T(String str, List<vl8> list) {
        y yVar = new y(str, list);
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.T(str, list);
        }
        this.viewCommands.afterApply(yVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void T0(b78 b78Var) {
        r rVar = new r(b78Var);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.T0(b78Var);
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void Ub() {
        b0 b0Var = new b0();
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ub();
        }
        this.viewCommands.afterApply(b0Var);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void Vd(x78 x78Var) {
        d0 d0Var = new d0(x78Var);
        this.viewCommands.beforeApply(d0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Vd(x78Var);
        }
        this.viewCommands.afterApply(d0Var);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void X4(hn6 hn6Var, PizzaProductCardPresenter.a aVar) {
        l lVar = new l(hn6Var, aVar);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.X4(hn6Var, aVar);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void Xa(List<Integer> list) {
        a aVar = new a(list);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Xa(list);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void ch(int i2, int i3) {
        j jVar = new j(i2, i3);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ch(i2, i3);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void i0(hn6 hn6Var) {
        k kVar = new k(hn6Var);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.i0(hn6Var);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void m0() {
        z zVar = new z();
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.m0();
        }
        this.viewCommands.afterApply(zVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void n3(hn6 hn6Var, hn6 hn6Var2, PizzaProductCardPresenter.a aVar) {
        o oVar = new o(hn6Var, hn6Var2, aVar);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.n3(hn6Var, hn6Var2, aVar);
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void na() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.na();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void p() {
        v vVar = new v();
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.p();
        }
        this.viewCommands.afterApply(vVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void pa(x78 x78Var) {
        p pVar = new p(x78Var);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.pa(x78Var);
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void t() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.t();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void t7(List<Integer> list, List<Integer> list2, List<Integer> list3) {
        b bVar = new b(list, list2, list3);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.t7(list, list2, list3);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void va() {
        x xVar = new x();
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.va();
        }
        this.viewCommands.afterApply(xVar);
    }

    @Override // com.dodopizza.order.feature.product.card.presentation.pizza.e
    public void x(long j2) {
        m mVar = new m(j2);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.x(j2);
        }
        this.viewCommands.afterApply(mVar);
    }
}
