package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: CardPaymentView$$State.java */
/* renamed from: qp0  reason: default package */
/* loaded from: classes4.dex */
public class qp0 extends MvpViewState<rp0> implements rp0 {

    /* compiled from: CardPaymentView$$State.java */
    /* renamed from: qp0$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<rp0> {
        a() {
            super("disableCardExpiryValidation", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rp0 rp0Var) {
            rp0Var.e2();
        }
    }

    /* compiled from: CardPaymentView$$State.java */
    /* renamed from: qp0$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<rp0> {
        b() {
            super("hideProgress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rp0 rp0Var) {
            rp0Var.g();
        }
    }

    /* compiled from: CardPaymentView$$State.java */
    /* renamed from: qp0$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<rp0> {
        public final String a;

        c(String str) {
            super("showAcquirerInfo", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rp0 rp0Var) {
            rp0Var.v7(this.a);
        }
    }

    /* compiled from: CardPaymentView$$State.java */
    /* renamed from: qp0$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<rp0> {
        public final int a;

        d(int i) {
            super("showPaymentErrorMessage", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rp0 rp0Var) {
            rp0Var.l4(this.a);
        }
    }

    /* compiled from: CardPaymentView$$State.java */
    /* renamed from: qp0$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<rp0> {
        e() {
            super("showProgress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rp0 rp0Var) {
            rp0Var.f();
        }
    }

    @Override // defpackage.rp0
    public void e2() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.e2();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.rp0
    public void f() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.f();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.rp0
    public void g() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.g();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.rp0
    public void l4(int i) {
        d dVar = new d(i);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.l4(i);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.rp0
    public void v7(String str) {
        c cVar = new c(str);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.v7(str);
        }
        this.viewCommands.afterApply(cVar);
    }
}
