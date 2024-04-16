package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: EnterNameView$$State.java */
/* renamed from: pi3  reason: default package */
/* loaded from: classes4.dex */
public class pi3 extends MvpViewState<qi3> implements qi3 {

    /* compiled from: EnterNameView$$State.java */
    /* renamed from: pi3$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<qi3> {
        a() {
            super("disableApplyButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qi3 qi3Var) {
            qi3Var.U5();
        }
    }

    /* compiled from: EnterNameView$$State.java */
    /* renamed from: pi3$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<qi3> {
        b() {
            super("enableApplyButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qi3 qi3Var) {
            qi3Var.Y8();
        }
    }

    /* compiled from: EnterNameView$$State.java */
    /* renamed from: pi3$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<qi3> {
        c() {
            super("hideKeyboard", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qi3 qi3Var) {
            qi3Var.a();
        }
    }

    /* compiled from: EnterNameView$$State.java */
    /* renamed from: pi3$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<qi3> {
        d() {
            super("hideLoadingIndicator", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qi3 qi3Var) {
            qi3Var.rf();
        }
    }

    /* compiled from: EnterNameView$$State.java */
    /* renamed from: pi3$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<qi3> {
        e() {
            super("hideSubscriptionSwitcher", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qi3 qi3Var) {
            qi3Var.u1();
        }
    }

    /* compiled from: EnterNameView$$State.java */
    /* renamed from: pi3$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<qi3> {
        f() {
            super("showError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qi3 qi3Var) {
            qi3Var.e();
        }
    }

    /* compiled from: EnterNameView$$State.java */
    /* renamed from: pi3$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<qi3> {
        g() {
            super("showLoadingIndicator", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qi3 qi3Var) {
            qi3Var.mb();
        }
    }

    /* compiled from: EnterNameView$$State.java */
    /* renamed from: pi3$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<qi3> {
        h() {
            super("showSubscriptionSwitcher", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qi3 qi3Var) {
            qi3Var.Bg();
        }
    }

    @Override // defpackage.qi3
    public void Bg() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Bg();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.qi3
    public void U5() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.U5();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.qi3
    public void Y8() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Y8();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.qi3
    public void a() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.a();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.qi3
    public void e() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.e();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.qi3
    public void mb() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.mb();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.qi3
    public void rf() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.rf();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.qi3
    public void u1() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.u1();
        }
        this.viewCommands.afterApply(eVar);
    }
}
