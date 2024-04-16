package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: NativeChatView$$State.java */
/* renamed from: eu6  reason: default package */
/* loaded from: classes.dex */
public class eu6 extends MvpViewState<fu6> implements fu6 {

    /* compiled from: NativeChatView$$State.java */
    /* renamed from: eu6$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<fu6> {
        a() {
            super("displayEdnaSdkChat", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fu6 fu6Var) {
            fu6Var.R4();
        }
    }

    /* compiled from: NativeChatView$$State.java */
    /* renamed from: eu6$b */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<fu6> {
        b() {
            super("handleBackPressedByEdnaSdk", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fu6 fu6Var) {
            fu6Var.Ug();
        }
    }

    /* compiled from: NativeChatView$$State.java */
    /* renamed from: eu6$c */
    /* loaded from: classes.dex */
    public class c extends ViewCommand<fu6> {
        c() {
            super("hideEdnaSdkChat", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fu6 fu6Var) {
            fu6Var.f5();
        }
    }

    /* compiled from: NativeChatView$$State.java */
    /* renamed from: eu6$d */
    /* loaded from: classes.dex */
    public class d extends ViewCommand<fu6> {
        public final qd a;

        d(qd qdVar) {
            super("requestNotificationPermission", OneExecutionStateStrategy.class);
            this.a = qdVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fu6 fu6Var) {
            fu6Var.X(this.a);
        }
    }

    /* compiled from: NativeChatView$$State.java */
    /* renamed from: eu6$e */
    /* loaded from: classes.dex */
    public class e extends ViewCommand<fu6> {
        public final vt6 a;

        e(vt6 vt6Var) {
            super("saveState", AddToEndSingleStrategy.class);
            this.a = vt6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fu6 fu6Var) {
            fu6Var.w6(this.a);
        }
    }

    @Override // defpackage.fu6
    public void R4() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.R4();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.fu6
    public void Ug() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ug();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.fu6
    public void X(qd qdVar) {
        d dVar = new d(qdVar);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.X(qdVar);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.fu6
    public void f5() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.f5();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.fu6
    public void w6(vt6 vt6Var) {
        e eVar = new e(vt6Var);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.w6(vt6Var);
        }
        this.viewCommands.afterApply(eVar);
    }
}
