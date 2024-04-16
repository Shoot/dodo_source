package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: OrderCompletedView$$State.java */
/* renamed from: wc7  reason: default package */
/* loaded from: classes.dex */
public class wc7 extends MvpViewState<xc7> implements xc7 {

    /* compiled from: OrderCompletedView$$State.java */
    /* renamed from: wc7$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<xc7> {
        a() {
            super("moveFeedbackButtonsToBottom", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xc7 xc7Var) {
            xc7Var.B8();
        }
    }

    /* compiled from: OrderCompletedView$$State.java */
    /* renamed from: wc7$b */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<xc7> {
        public final String a;

        b(String str) {
            super("openUrl", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xc7 xc7Var) {
            xc7Var.d(this.a);
        }
    }

    /* compiled from: OrderCompletedView$$State.java */
    /* renamed from: wc7$c */
    /* loaded from: classes.dex */
    public class c extends ViewCommand<xc7> {
        public final boolean a;

        c(boolean z) {
            super("setCourierTipsCardVisible", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xc7 xc7Var) {
            xc7Var.q0(this.a);
        }
    }

    /* compiled from: OrderCompletedView$$State.java */
    /* renamed from: wc7$d */
    /* loaded from: classes.dex */
    public class d extends ViewCommand<xc7> {
        public final boolean a;

        d(boolean z) {
            super("setMysteryShopperCardVisible", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xc7 xc7Var) {
            xc7Var.wc(this.a);
        }
    }

    /* compiled from: OrderCompletedView$$State.java */
    /* renamed from: wc7$e */
    /* loaded from: classes.dex */
    public class e extends ViewCommand<xc7> {
        public final boolean a;

        e(boolean z) {
            super("setRnDigitalCardVisible", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xc7 xc7Var) {
            xc7Var.H(this.a);
        }
    }

    /* compiled from: OrderCompletedView$$State.java */
    /* renamed from: wc7$f */
    /* loaded from: classes.dex */
    public class f extends ViewCommand<xc7> {
        public final ez1 a;

        f(ez1 ez1Var) {
            super("setupCourierTipsCard", OneExecutionStateStrategy.class);
            this.a = ez1Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xc7 xc7Var) {
            xc7Var.t0(this.a);
        }
    }

    /* compiled from: OrderCompletedView$$State.java */
    /* renamed from: wc7$g */
    /* loaded from: classes.dex */
    public class g extends ViewCommand<xc7> {
        public final pq3 a;

        g(pq3 pq3Var) {
            super("setupFeedbackButtons", OneExecutionStateStrategy.class);
            this.a = pq3Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xc7 xc7Var) {
            xc7Var.V6(this.a);
        }
    }

    /* compiled from: OrderCompletedView$$State.java */
    /* renamed from: wc7$h */
    /* loaded from: classes.dex */
    public class h extends ViewCommand<xc7> {
        public final sr6 a;

        h(sr6 sr6Var) {
            super("setupMysteryShopperCard", OneExecutionStateStrategy.class);
            this.a = sr6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xc7 xc7Var) {
            xc7Var.h7(this.a);
        }
    }

    /* compiled from: OrderCompletedView$$State.java */
    /* renamed from: wc7$i */
    /* loaded from: classes.dex */
    public class i extends ViewCommand<xc7> {
        public final ll1 a;

        i(ll1 ll1Var) {
            super("setupOrderInfo", OneExecutionStateStrategy.class);
            this.a = ll1Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xc7 xc7Var) {
            xc7Var.w4(this.a);
        }
    }

    /* compiled from: OrderCompletedView$$State.java */
    /* renamed from: wc7$j */
    /* loaded from: classes.dex */
    public class j extends ViewCommand<xc7> {
        public final vm9 a;

        j(vm9 vm9Var) {
            super("setupRnDigitalCard", OneExecutionStateStrategy.class);
            this.a = vm9Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xc7 xc7Var) {
            xc7Var.s(this.a);
        }
    }

    @Override // defpackage.xc7
    public void B8() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.B8();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.xc7
    public void H(boolean z) {
        e eVar = new e(z);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.H(z);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.xc7
    public void V6(pq3 pq3Var) {
        g gVar = new g(pq3Var);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.V6(pq3Var);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.xc7
    public void d(String str) {
        b bVar = new b(str);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.d(str);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.xc7
    public void h7(sr6 sr6Var) {
        h hVar = new h(sr6Var);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.h7(sr6Var);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.xc7
    public void q0(boolean z) {
        c cVar = new c(z);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.q0(z);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.xc7
    public void s(vm9 vm9Var) {
        j jVar = new j(vm9Var);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.s(vm9Var);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.xc7
    public void t0(ez1 ez1Var) {
        f fVar = new f(ez1Var);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.t0(ez1Var);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.xc7
    public void w4(ll1 ll1Var) {
        i iVar = new i(ll1Var);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.w4(ll1Var);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.xc7
    public void wc(boolean z) {
        d dVar = new d(z);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.wc(z);
        }
        this.viewCommands.afterApply(dVar);
    }
}
