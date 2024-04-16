package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: CompletedOrderInfoView$$State.java */
/* renamed from: rl1  reason: default package */
/* loaded from: classes.dex */
public class rl1 extends MvpViewState<sl1> implements sl1 {

    /* compiled from: CompletedOrderInfoView$$State.java */
    /* renamed from: rl1$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<sl1> {
        a() {
            super("hideWrapItemsDescriptionButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(sl1 sl1Var) {
            sl1Var.M6();
        }
    }

    /* compiled from: CompletedOrderInfoView$$State.java */
    /* renamed from: rl1$b */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<sl1> {
        public final jl1 a;

        b(jl1 jl1Var) {
            super("showOrderInfo", AddToEndSingleStrategy.class);
            this.a = jl1Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(sl1 sl1Var) {
            sl1Var.a2(this.a);
        }
    }

    /* compiled from: CompletedOrderInfoView$$State.java */
    /* renamed from: rl1$c */
    /* loaded from: classes.dex */
    public class c extends ViewCommand<sl1> {
        c() {
            super("showWrapItemsDescriptionButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(sl1 sl1Var) {
            sl1Var.f2();
        }
    }

    /* compiled from: CompletedOrderInfoView$$State.java */
    /* renamed from: rl1$d */
    /* loaded from: classes.dex */
    public class d extends ViewCommand<sl1> {
        d() {
            super("unwrapItemsDescription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(sl1 sl1Var) {
            sl1Var.gd();
        }
    }

    /* compiled from: CompletedOrderInfoView$$State.java */
    /* renamed from: rl1$e */
    /* loaded from: classes.dex */
    public class e extends ViewCommand<sl1> {
        e() {
            super("wrapItemsDescription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(sl1 sl1Var) {
            sl1Var.a8();
        }
    }

    @Override // defpackage.sl1
    public void M6() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.M6();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.sl1
    public void a2(jl1 jl1Var) {
        b bVar = new b(jl1Var);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.a2(jl1Var);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.sl1
    public void a8() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.a8();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.sl1
    public void f2() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.f2();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.sl1
    public void gd() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.gd();
        }
        this.viewCommands.afterApply(dVar);
    }
}
