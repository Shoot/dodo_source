package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: PaymentMethodListView$$State.java */
/* renamed from: wt7  reason: default package */
/* loaded from: classes4.dex */
public class wt7 extends MvpViewState<xt7> implements xt7 {

    /* compiled from: PaymentMethodListView$$State.java */
    /* renamed from: wt7$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<xt7> {
        a() {
            super("hideEditViews", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xt7 xt7Var) {
            xt7Var.Og();
        }
    }

    /* compiled from: PaymentMethodListView$$State.java */
    /* renamed from: wt7$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<xt7> {
        b() {
            super("onDataLoaded", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xt7 xt7Var) {
            xt7Var.P();
        }
    }

    /* compiled from: PaymentMethodListView$$State.java */
    /* renamed from: wt7$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<xt7> {
        public final boolean a;

        c(boolean z) {
            super("setBinButtonLoading", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xt7 xt7Var) {
            xt7Var.ra(this.a);
        }
    }

    /* compiled from: PaymentMethodListView$$State.java */
    /* renamed from: wt7$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<xt7> {
        public final boolean a;

        d(boolean z) {
            super("setBinButtonVisibility", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xt7 xt7Var) {
            xt7Var.Z8(this.a);
        }
    }

    /* compiled from: PaymentMethodListView$$State.java */
    /* renamed from: wt7$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<xt7> {
        public final boolean a;

        e(boolean z) {
            super("setEditButtonVisibility", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xt7 xt7Var) {
            xt7Var.Ce(this.a);
        }
    }

    /* compiled from: PaymentMethodListView$$State.java */
    /* renamed from: wt7$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<xt7> {
        public final int a;

        f(int i) {
            super("showConfirmRemovePaymentMethodsDialog", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xt7 xt7Var) {
            xt7Var.H4(this.a);
        }
    }

    /* compiled from: PaymentMethodListView$$State.java */
    /* renamed from: wt7$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<xt7> {
        g() {
            super("showEditViews", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xt7 xt7Var) {
            xt7Var.vb();
        }
    }

    /* compiled from: PaymentMethodListView$$State.java */
    /* renamed from: wt7$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<xt7> {
        public final ru.dodopizza.app.presentation.checkout.paymentwaylist.c a;

        h(ru.dodopizza.app.presentation.checkout.paymentwaylist.c cVar) {
            super("showError", AddToEndSingleStrategy.class);
            this.a = cVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xt7 xt7Var) {
            xt7Var.o6(this.a);
        }
    }

    /* compiled from: PaymentMethodListView$$State.java */
    /* renamed from: wt7$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<xt7> {
        i() {
            super("showLoadingFailed", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xt7 xt7Var) {
            xt7Var.U8();
        }
    }

    @Override // defpackage.xt7
    public void Ce(boolean z) {
        e eVar = new e(z);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ce(z);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.xt7
    public void H4(int i2) {
        f fVar = new f(i2);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.H4(i2);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.xt7
    public void Og() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Og();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.xt7
    public void P() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.P();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.xt7
    public void U8() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.U8();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.xt7
    public void Z8(boolean z) {
        d dVar = new d(z);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Z8(z);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.xt7
    public void o6(ru.dodopizza.app.presentation.checkout.paymentwaylist.c cVar) {
        h hVar = new h(cVar);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.o6(cVar);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.xt7
    public void ra(boolean z) {
        c cVar = new c(z);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ra(z);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.xt7
    public void vb() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.vb();
        }
        this.viewCommands.afterApply(gVar);
    }
}
