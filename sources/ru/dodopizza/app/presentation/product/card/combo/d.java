package ru.dodopizza.app.presentation.product.card.combo;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter;
/* compiled from: ComboProductCardView$$State.java */
/* loaded from: classes4.dex */
public class d extends MvpViewState<ru.dodopizza.app.presentation.product.card.combo.e> implements ru.dodopizza.app.presentation.product.card.combo.e {

    /* compiled from: ComboProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<ru.dodopizza.app.presentation.product.card.combo.e> {
        public final List<? extends ru.dodopizza.app.presentation.product.card.combo.h> a;

        a(List<? extends ru.dodopizza.app.presentation.product.card.combo.h> list) {
            super("setComboSummary", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.combo.e eVar) {
            eVar.B2(this.a);
        }
    }

    /* compiled from: ComboProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<ru.dodopizza.app.presentation.product.card.combo.e> {
        public final jh1 a;

        b(jh1 jh1Var) {
            super("setComboViewsInfo", AddToEndSingleStrategy.class);
            this.a = jh1Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.combo.e eVar) {
            eVar.l2(this.a);
        }
    }

    /* compiled from: ComboProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<ru.dodopizza.app.presentation.product.card.combo.e> {
        public final hn6 a;

        c(hn6 hn6Var) {
            super("setPriceOnButtonInBottomView", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.combo.e eVar) {
            eVar.gg(this.a);
        }
    }

    /* compiled from: ComboProductCardView$$State.java */
    /* renamed from: ru.dodopizza.app.presentation.product.card.combo.d$d  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0592d extends ViewCommand<ru.dodopizza.app.presentation.product.card.combo.e> {
        public final ComboProductCardPresenter.a a;

        C0592d(ComboProductCardPresenter.a aVar) {
            super("setTextOnButtonInBottomView", AddToEndSingleStrategy.class);
            this.a = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.combo.e eVar) {
            eVar.k5(this.a);
        }
    }

    /* compiled from: ComboProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<ru.dodopizza.app.presentation.product.card.combo.e> {
        public final hn6 a;
        public final hn6 b;
        public final ComboProductCardPresenter.a c;

        e(hn6 hn6Var, hn6 hn6Var2, ComboProductCardPresenter.a aVar) {
            super("setTwoPricesAndTextInBottomView", AddToEndSingleStrategy.class);
            this.a = hn6Var;
            this.b = hn6Var2;
            this.c = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.combo.e eVar) {
            eVar.Be(this.a, this.b, this.c);
        }
    }

    /* compiled from: ComboProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<ru.dodopizza.app.presentation.product.card.combo.e> {
        public final jh1 a;

        f(jh1 jh1Var) {
            super("showComboEntity", AddToEndSingleStrategy.class);
            this.a = jh1Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.combo.e eVar) {
            eVar.fb(this.a);
        }
    }

    /* compiled from: ComboProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<ru.dodopizza.app.presentation.product.card.combo.e> {
        g() {
            super("showSlotVariationOnboarding", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.combo.e eVar) {
            eVar.R2();
        }
    }

    /* compiled from: ComboProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<ru.dodopizza.app.presentation.product.card.combo.e> {
        public final List<String> a;

        h(List<String> list) {
            super("showToppingsRemoved", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.combo.e eVar) {
            eVar.N8(this.a);
        }
    }

    /* compiled from: ComboProductCardView$$State.java */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<ru.dodopizza.app.presentation.product.card.combo.e> {
        public final jh1 a;

        i(jh1 jh1Var) {
            super("updateComboViewsInfo", AddToEndSingleStrategy.class);
            this.a = jh1Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ru.dodopizza.app.presentation.product.card.combo.e eVar) {
            eVar.f9(this.a);
        }
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void B2(List<? extends ru.dodopizza.app.presentation.product.card.combo.h> list) {
        a aVar = new a(list);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.B2(list);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void Be(hn6 hn6Var, hn6 hn6Var2, ComboProductCardPresenter.a aVar) {
        e eVar = new e(hn6Var, hn6Var2, aVar);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Be(hn6Var, hn6Var2, aVar);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void N8(List<String> list) {
        h hVar = new h(list);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.N8(list);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void R2() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.R2();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void f9(jh1 jh1Var) {
        i iVar = new i(jh1Var);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.f9(jh1Var);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void fb(jh1 jh1Var) {
        f fVar = new f(jh1Var);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.fb(jh1Var);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void gg(hn6 hn6Var) {
        c cVar = new c(hn6Var);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.gg(hn6Var);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void k5(ComboProductCardPresenter.a aVar) {
        C0592d c0592d = new C0592d(aVar);
        this.viewCommands.beforeApply(c0592d);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.k5(aVar);
        }
        this.viewCommands.afterApply(c0592d);
    }

    @Override // ru.dodopizza.app.presentation.product.card.combo.e
    public void l2(jh1 jh1Var) {
        b bVar = new b(jh1Var);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.l2(jh1Var);
        }
        this.viewCommands.afterApply(bVar);
    }
}
