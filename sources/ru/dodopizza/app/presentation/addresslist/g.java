package ru.dodopizza.app.presentation.addresslist;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import ru.dodopizza.app.presentation.addresslist.i;
/* compiled from: AddressListView$$State.java */
/* loaded from: classes4.dex */
public class g extends MvpViewState<h> implements h {

    /* compiled from: AddressListView$$State.java */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<h> {
        a() {
            super("showAddressesLoadFailed", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(h hVar) {
            hVar.A8();
        }
    }

    /* compiled from: AddressListView$$State.java */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<h> {
        public final i.b a;

        b(i.b bVar) {
            super("showClearCartDialog", OneExecutionStateStrategy.class);
            this.a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(h hVar) {
            hVar.q7(this.a);
        }
    }

    /* compiled from: AddressListView$$State.java */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<h> {
        public final ou2 a;

        c(ou2 ou2Var) {
            super("showDeliverablePlaceWithoutLocality", AddToEndSingleStrategy.class);
            this.a = ou2Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(h hVar) {
            hVar.bg(this.a);
        }
    }

    /* compiled from: AddressListView$$State.java */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<h> {
        d() {
            super("showIdleState", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(h hVar) {
            hVar.Ye();
        }
    }

    /* compiled from: AddressListView$$State.java */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<h> {
        public final ou2 a;

        e(ou2 ou2Var) {
            super("showLoadingState", AddToEndSingleStrategy.class);
            this.a = ou2Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(h hVar) {
            hVar.r7(this.a);
        }
    }

    /* compiled from: AddressListView$$State.java */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<h> {
        f() {
            super("showViewReady", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(h hVar) {
            hVar.L4();
        }
    }

    @Override // ru.dodopizza.app.presentation.addresslist.h
    public void A8() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.A8();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // ru.dodopizza.app.presentation.addresslist.h
    public void L4() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.L4();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // ru.dodopizza.app.presentation.addresslist.h
    public void Ye() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ye();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // ru.dodopizza.app.presentation.addresslist.h
    public void bg(ou2 ou2Var) {
        c cVar = new c(ou2Var);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.bg(ou2Var);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // ru.dodopizza.app.presentation.addresslist.h
    public void q7(i.b bVar) {
        b bVar2 = new b(bVar);
        this.viewCommands.beforeApply(bVar2);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.q7(bVar);
        }
        this.viewCommands.afterApply(bVar2);
    }

    @Override // ru.dodopizza.app.presentation.addresslist.h
    public void r7(ou2 ou2Var) {
        e eVar = new e(ou2Var);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.r7(ou2Var);
        }
        this.viewCommands.afterApply(eVar);
    }
}
