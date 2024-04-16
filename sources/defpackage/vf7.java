package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: OrderHistoryView$$State.java */
/* renamed from: vf7  reason: default package */
/* loaded from: classes2.dex */
public class vf7 extends MvpViewState<wf7> implements wf7 {

    /* compiled from: OrderHistoryView$$State.java */
    /* renamed from: vf7$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<wf7> {
        public final List<? extends uf7> a;

        a(List<? extends uf7> list) {
            super("setOrderHistories", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wf7 wf7Var) {
            wf7Var.x9(this.a);
        }
    }

    /* compiled from: OrderHistoryView$$State.java */
    /* renamed from: vf7$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<wf7> {
        b() {
            super("showContent", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wf7 wf7Var) {
            wf7Var.Fg();
        }
    }

    /* compiled from: OrderHistoryView$$State.java */
    /* renamed from: vf7$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<wf7> {
        c() {
            super("showEmptyContent", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wf7 wf7Var) {
            wf7Var.n0();
        }
    }

    /* compiled from: OrderHistoryView$$State.java */
    /* renamed from: vf7$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<wf7> {
        d() {
            super("showLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wf7 wf7Var) {
            wf7Var.b();
        }
    }

    /* compiled from: OrderHistoryView$$State.java */
    /* renamed from: vf7$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<wf7> {
        e() {
            super("showRepeatOrderError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wf7 wf7Var) {
            wf7Var.U();
        }
    }

    @Override // defpackage.wf7
    public void Fg() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Fg();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.wf7
    public void U() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.U();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.wf7
    public void b() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.wf7
    public void n0() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.n0();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.wf7
    public void x9(List<? extends uf7> list) {
        a aVar = new a(list);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.x9(list);
        }
        this.viewCommands.afterApply(aVar);
    }
}
