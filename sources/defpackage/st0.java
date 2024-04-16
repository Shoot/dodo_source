package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: CatchAddressView$$State.java */
/* renamed from: st0  reason: default package */
/* loaded from: classes4.dex */
public class st0 extends MvpViewState<tt0> implements tt0 {

    /* compiled from: CatchAddressView$$State.java */
    /* renamed from: st0$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<tt0> {
        public final boolean a;

        a(boolean z) {
            super("setOrangeButtonVisible", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tt0 tt0Var) {
            tt0Var.y2(this.a);
        }
    }

    /* compiled from: CatchAddressView$$State.java */
    /* renamed from: st0$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<tt0> {
        public final boolean a;

        b(boolean z) {
            super("setShowProgress", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tt0 tt0Var) {
            tt0Var.p0(this.a);
        }
    }

    /* compiled from: CatchAddressView$$State.java */
    /* renamed from: st0$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<tt0> {
        c() {
            super("setSuccessCarryoutMessage", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tt0 tt0Var) {
            tt0Var.w8();
        }
    }

    /* compiled from: CatchAddressView$$State.java */
    /* renamed from: st0$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<tt0> {
        d() {
            super("setSuccessMessage", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tt0 tt0Var) {
            tt0Var.X6();
        }
    }

    /* compiled from: CatchAddressView$$State.java */
    /* renamed from: st0$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<tt0> {
        e() {
            super("setSuccessMessageTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tt0 tt0Var) {
            tt0Var.a4();
        }
    }

    /* compiled from: CatchAddressView$$State.java */
    /* renamed from: st0$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<tt0> {
        public final boolean a;

        f(boolean z) {
            super("setWhiteButtonVisible", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tt0 tt0Var) {
            tt0Var.Ge(this.a);
        }
    }

    /* compiled from: CatchAddressView$$State.java */
    /* renamed from: st0$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<tt0> {
        g() {
            super("showEnterPhoneActionButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tt0 tt0Var) {
            tt0Var.I6();
        }
    }

    /* compiled from: CatchAddressView$$State.java */
    /* renamed from: st0$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<tt0> {
        h() {
            super("showErrorMessage", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tt0 tt0Var) {
            tt0Var.Of();
        }
    }

    /* compiled from: CatchAddressView$$State.java */
    /* renamed from: st0$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<tt0> {
        i() {
            super("showNotNowExitButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tt0 tt0Var) {
            tt0Var.O7();
        }
    }

    /* compiled from: CatchAddressView$$State.java */
    /* renamed from: st0$j */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<tt0> {
        j() {
            super("showOkActionButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tt0 tt0Var) {
            tt0Var.rd();
        }
    }

    /* compiled from: CatchAddressView$$State.java */
    /* renamed from: st0$k */
    /* loaded from: classes4.dex */
    public class k extends ViewCommand<tt0> {
        k() {
            super("showSubscribeActionButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tt0 tt0Var) {
            tt0Var.a5();
        }
    }

    /* compiled from: CatchAddressView$$State.java */
    /* renamed from: st0$l */
    /* loaded from: classes4.dex */
    public class l extends ViewCommand<tt0> {
        l() {
            super("showTakeawayExitButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(tt0 tt0Var) {
            tt0Var.G8();
        }
    }

    @Override // defpackage.tt0
    public void G8() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.G8();
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.tt0
    public void Ge(boolean z) {
        f fVar = new f(z);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ge(z);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.tt0
    public void I6() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.I6();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.tt0
    public void O7() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.O7();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.tt0
    public void Of() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Of();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.tt0
    public void X6() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.X6();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.tt0
    public void a4() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.a4();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.tt0
    public void a5() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.a5();
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.tt0
    public void p0(boolean z) {
        b bVar = new b(z);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.p0(z);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.tt0
    public void rd() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.rd();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.tt0
    public void w8() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.w8();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.tt0
    public void y2(boolean z) {
        a aVar = new a(z);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.y2(z);
        }
        this.viewCommands.afterApply(aVar);
    }
}
