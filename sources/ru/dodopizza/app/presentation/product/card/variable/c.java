package ru.dodopizza.app.presentation.product.card.variable;

import java.util.List;
import java.util.Map;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import ru.dodopizza.app.presentation.product.card.variable.VariableProductCardPresenter;
/* compiled from: VariableProductCardView$$State.java */
/* loaded from: classes4.dex */
public class c extends MvpViewState<ru.dodopizza.app.presentation.product.card.variable.d> implements ru.dodopizza.app.presentation.product.card.variable.d {

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        public final List<Integer> a;
        public final List<Integer> b;
        public final List<Integer> c;

        a(List<Integer> list, List<Integer> list2, List<Integer> list3) {
            super("configureSizeControls", AddToEndSingleStrategy.class);
            this.a = list;
            this.b = list2;
            this.c = list3;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.Q(this.a, this.b, this.c);
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        public final boolean a;

        b(boolean z) {
            super("enablePersonalPriceTimer", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.I(this.a);
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* renamed from: ru.dodopizza.app.presentation.product.card.variable.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0595c extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        C0595c() {
            super("hideDiscountBadge", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.N();
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        d() {
            super("hideDiscountBadgesOnVariationControl", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.G0();
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        e() {
            super("hideToppings", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.t();
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        f() {
            super("hideVariantsDiscount", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.w3();
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        public final int a;

        g(int i) {
            super("selectVariation", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.ob(this.a);
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        public final hn6 a;

        h(hn6 hn6Var) {
            super("setAddToCartWithPriceOnButton", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.i0(this.a);
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        public final hn6 a;
        public final VariableProductCardPresenter.a b;

        i(hn6 hn6Var, VariableProductCardPresenter.a aVar) {
            super("setOnePricesAndTextInBottomView", AddToEndSingleStrategy.class);
            this.a = hn6Var;
            this.b = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.E9(this.a, this.b);
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        public final long a;

        j(long j) {
            super("setPersonalPriceTimer", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.x(this.a);
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class k extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        public final List<jjb> a;

        k(List<jjb> list) {
            super("setToppingsDataSet", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.C0(this.a);
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class l extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        public final hn6 a;
        public final hn6 b;
        public final VariableProductCardPresenter.a c;

        l(hn6 hn6Var, hn6 hn6Var2, VariableProductCardPresenter.a aVar) {
            super("setTwoPricesAndTextInBottomView", AddToEndSingleStrategy.class);
            this.a = hn6Var;
            this.b = hn6Var2;
            this.c = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.Ua(this.a, this.b, this.c);
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class m extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        public final axb a;

        m(axb axbVar) {
            super("setViewsInfo", AddToEndSingleStrategy.class);
            this.a = axbVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.E5(this.a);
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class n extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        public final Map<Integer, String> a;

        n(Map<Integer, String> map) {
            super("setupSizeNames", AddToEndSingleStrategy.class);
            this.a = map;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.H0(this.a);
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class o extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        public final String a;

        o(String str) {
            super("showDescription", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.W4(this.a);
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class p extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        p() {
            super("showDiscountBadge", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.p();
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class q extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        q() {
            super("showDiscountExpiredPersonalPriceBadge", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.E();
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class r extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        public final String a;
        public final List<vl8> b;

        r(String str, List<vl8> list) {
            super("showRemoveIngredientDialog", AddToEndSingleStrategy.class);
            this.a = str;
            this.b = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.T(this.a, this.b);
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class s extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        s() {
            super("showStop", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.m0();
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class t extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        t() {
            super("showToppings", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.O();
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class u extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        public final boolean a;

        u(boolean z) {
            super("switchButtonMode", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.I5(this.a);
        }
    }

    /* compiled from: VariableProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class v extends ViewCommand<ru.dodopizza.app.presentation.product.card.variable.d> {
        public final axb a;

        v(axb axbVar) {
            super("updateViewsInfo", AddToEndSingleStrategy.class);
            this.a = axbVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.variable.d dVar) {
            dVar.Qa(this.a);
        }
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void C0(List<jjb> list) {
        k kVar = new k(list);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.C0(list);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void E() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.E();
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void E5(axb axbVar) {
        m mVar = new m(axbVar);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.E5(axbVar);
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void E9(hn6 hn6Var, VariableProductCardPresenter.a aVar) {
        i iVar = new i(hn6Var, aVar);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.E9(hn6Var, aVar);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void G0() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.G0();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void H0(Map<Integer, String> map) {
        n nVar = new n(map);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.H0(map);
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void I(boolean z) {
        b bVar = new b(z);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.I(z);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.jl8
    public void I5(boolean z) {
        u uVar = new u(z);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.I5(z);
        }
        this.viewCommands.afterApply(uVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void N() {
        C0595c c0595c = new C0595c();
        this.viewCommands.beforeApply(c0595c);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.N();
        }
        this.viewCommands.afterApply(c0595c);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void O() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.O();
        }
        this.viewCommands.afterApply(tVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void Q(List<Integer> list, List<Integer> list2, List<Integer> list3) {
        a aVar = new a(list, list2, list3);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Q(list, list2, list3);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void Qa(axb axbVar) {
        v vVar = new v(axbVar);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Qa(axbVar);
        }
        this.viewCommands.afterApply(vVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void T(String str, List<vl8> list) {
        r rVar = new r(str, list);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.T(str, list);
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void Ua(hn6 hn6Var, hn6 hn6Var2, VariableProductCardPresenter.a aVar) {
        l lVar = new l(hn6Var, hn6Var2, aVar);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ua(hn6Var, hn6Var2, aVar);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void W4(String str) {
        o oVar = new o(str);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.W4(str);
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void i0(hn6 hn6Var) {
        h hVar = new h(hn6Var);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.i0(hn6Var);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void m0() {
        s sVar = new s();
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.m0();
        }
        this.viewCommands.afterApply(sVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void ob(int i2) {
        g gVar = new g(i2);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ob(i2);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void p() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.p();
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void t() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.t();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void w3() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.w3();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.variable.d
    public void x(long j2) {
        j jVar = new j(j2);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.x(j2);
        }
        this.viewCommands.afterApply(jVar);
    }
}
