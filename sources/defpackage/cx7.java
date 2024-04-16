package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: PaymentWorkflowBrokenView$$State.java */
/* renamed from: cx7  reason: default package */
/* loaded from: classes4.dex */
public class cx7 extends MvpViewState<dx7> implements dx7 {

    /* compiled from: PaymentWorkflowBrokenView$$State.java */
    /* renamed from: cx7$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<dx7> {
        public final String a;

        a(String str) {
            super("dialPhone", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(dx7 dx7Var) {
            dx7Var.u9(this.a);
        }
    }

    /* compiled from: PaymentWorkflowBrokenView$$State.java */
    /* renamed from: cx7$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<dx7> {
        b() {
            super("dismiss", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(dx7 dx7Var) {
            dx7Var.dismiss();
        }
    }

    /* compiled from: PaymentWorkflowBrokenView$$State.java */
    /* renamed from: cx7$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<dx7> {
        public final String a;

        c(String str) {
            super("setPhone", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(dx7 dx7Var) {
            dx7Var.G6(this.a);
        }
    }

    @Override // defpackage.dx7
    public void G6(String str) {
        c cVar = new c(str);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.G6(str);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.dx7
    public void dismiss() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.dismiss();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.dx7
    public void u9(String str) {
        a aVar = new a(str);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.u9(str);
        }
        this.viewCommands.afterApply(aVar);
    }
}
