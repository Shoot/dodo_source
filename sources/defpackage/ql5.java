package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: LandingView$$State.java */
/* renamed from: ql5  reason: default package */
/* loaded from: classes4.dex */
public class ql5 extends MvpViewState<rl5> implements rl5 {

    /* compiled from: LandingView$$State.java */
    /* renamed from: ql5$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<rl5> {
        a() {
            super("hideSocialNetworks", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rl5 rl5Var) {
            rl5Var.S2();
        }
    }

    /* compiled from: LandingView$$State.java */
    /* renamed from: ql5$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<rl5> {
        public final String a;

        b(String str) {
            super("openSocialNetwork", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rl5 rl5Var) {
            rl5Var.M5(this.a);
        }
    }

    /* compiled from: LandingView$$State.java */
    /* renamed from: ql5$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<rl5> {
        public final String a;

        c(String str) {
            super("setCityName", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rl5 rl5Var) {
            rl5Var.F0(this.a);
        }
    }

    /* compiled from: LandingView$$State.java */
    /* renamed from: ql5$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<rl5> {
        d() {
            super("showEmptyScreen", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rl5 rl5Var) {
            rl5Var.y6();
        }
    }

    /* compiled from: LandingView$$State.java */
    /* renamed from: ql5$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<rl5> {
        e() {
            super("showPhoneInput", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rl5 rl5Var) {
            rl5Var.p7();
        }
    }

    /* compiled from: LandingView$$State.java */
    /* renamed from: ql5$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<rl5> {
        public final String a;

        f(String str) {
            super("showSubtitle", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rl5 rl5Var) {
            rl5Var.F3(this.a);
        }
    }

    /* compiled from: LandingView$$State.java */
    /* renamed from: ql5$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<rl5> {
        public final String a;

        g(String str) {
            super("showTitle", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rl5 rl5Var) {
            rl5Var.r(this.a);
        }
    }

    @Override // defpackage.rl5
    public void F0(String str) {
        c cVar = new c(str);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.F0(str);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.rl5
    public void F3(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.F3(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.rl5
    public void M5(String str) {
        b bVar = new b(str);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.M5(str);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.rl5
    public void S2() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.S2();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.rl5
    public void p7() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.p7();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.rl5
    public void r(String str) {
        g gVar = new g(str);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.r(str);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.rl5
    public void y6() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.y6();
        }
        this.viewCommands.afterApply(dVar);
    }
}
