package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: RatingAppliedView$$State.java */
/* renamed from: k59  reason: default package */
/* loaded from: classes.dex */
public class k59 extends MvpViewState<l59> implements l59 {

    /* compiled from: RatingAppliedView$$State.java */
    /* renamed from: k59$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<l59> {
        public final ay1 a;

        a(ay1 ay1Var) {
            super("fullPromoCards", AddToEndSingleStrategy.class);
            this.a = ay1Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(l59 l59Var) {
            l59Var.uf(this.a);
        }
    }

    /* compiled from: RatingAppliedView$$State.java */
    /* renamed from: k59$b */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<l59> {
        b() {
            super("hideDoneButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(l59 l59Var) {
            l59Var.ua();
        }
    }

    /* compiled from: RatingAppliedView$$State.java */
    /* renamed from: k59$c */
    /* loaded from: classes.dex */
    public class c extends ViewCommand<l59> {
        public final String a;

        c(String str) {
            super("openUrl", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(l59 l59Var) {
            l59Var.d(this.a);
        }
    }

    /* compiled from: RatingAppliedView$$State.java */
    /* renamed from: k59$d */
    /* loaded from: classes.dex */
    public class d extends ViewCommand<l59> {
        public final boolean a;

        d(boolean z) {
            super("setRnDigitalCardVisible", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(l59 l59Var) {
            l59Var.H(this.a);
        }
    }

    /* compiled from: RatingAppliedView$$State.java */
    /* renamed from: k59$e */
    /* loaded from: classes.dex */
    public class e extends ViewCommand<l59> {
        public final vm9 a;

        e(vm9 vm9Var) {
            super("setupRnDigitalCard", OneExecutionStateStrategy.class);
            this.a = vm9Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(l59 l59Var) {
            l59Var.s(this.a);
        }
    }

    /* compiled from: RatingAppliedView$$State.java */
    /* renamed from: k59$f */
    /* loaded from: classes.dex */
    public class f extends ViewCommand<l59> {
        f() {
            super("showContactMeConfirmation", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(l59 l59Var) {
            l59Var.Ud();
        }
    }

    /* compiled from: RatingAppliedView$$State.java */
    /* renamed from: k59$g */
    /* loaded from: classes.dex */
    public class g extends ViewCommand<l59> {
        g() {
            super("showDoneButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(l59 l59Var) {
            l59Var.Z();
        }
    }

    @Override // defpackage.l59
    public void H(boolean z) {
        d dVar = new d(z);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.H(z);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.l59
    public void Ud() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ud();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.l59
    public void Z() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Z();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.l59
    public void d(String str) {
        c cVar = new c(str);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.d(str);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.l59
    public void s(vm9 vm9Var) {
        e eVar = new e(vm9Var);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.s(vm9Var);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.l59
    public void ua() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ua();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.l59
    public void uf(ay1 ay1Var) {
        a aVar = new a(ay1Var);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.uf(ay1Var);
        }
        this.viewCommands.afterApply(aVar);
    }
}
