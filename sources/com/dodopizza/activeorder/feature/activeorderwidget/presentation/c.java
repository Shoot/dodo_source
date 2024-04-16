package com.dodopizza.activeorder.feature.activeorderwidget.presentation;

import com.dodopizza.activeorder.feature.activeorderwidget.presentation.e;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: ActiveOrderFoodMenuView$$State.java */
/* loaded from: classes.dex */
public class c extends MvpViewState<d> implements d {

    /* compiled from: ActiveOrderFoodMenuView$$State.java */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<d> {
        public final e.b a;

        a(e.b bVar) {
            super("showInProgressActiveOrder", AddToEndSingleStrategy.class);
            this.a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(d dVar) {
            dVar.hc(this.a);
        }
    }

    /* compiled from: ActiveOrderFoodMenuView$$State.java */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<d> {
        public final e.c a;

        b(e.c cVar) {
            super("showRateActiveOrder", AddToEndSingleStrategy.class);
            this.a = cVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(d dVar) {
            dVar.e1(this.a);
        }
    }

    /* compiled from: ActiveOrderFoodMenuView$$State.java */
    /* renamed from: com.dodopizza.activeorder.feature.activeorderwidget.presentation.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0109c extends ViewCommand<d> {
        public final e.d a;

        C0109c(e.d dVar) {
            super("showReadyActiveOrder", AddToEndSingleStrategy.class);
            this.a = dVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(d dVar) {
            dVar.W9(this.a);
        }
    }

    @Override // com.dodopizza.activeorder.feature.activeorderwidget.presentation.d
    public void W9(e.d dVar) {
        C0109c c0109c = new C0109c(dVar);
        this.viewCommands.beforeApply(c0109c);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.W9(dVar);
        }
        this.viewCommands.afterApply(c0109c);
    }

    @Override // com.dodopizza.activeorder.feature.activeorderwidget.presentation.d
    public void e1(e.c cVar) {
        b bVar = new b(cVar);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.e1(cVar);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // com.dodopizza.activeorder.feature.activeorderwidget.presentation.d
    public void hc(e.b bVar) {
        a aVar = new a(bVar);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.hc(bVar);
        }
        this.viewCommands.afterApply(aVar);
    }
}
