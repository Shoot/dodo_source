package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: MainActivityView$$State.java */
/* renamed from: q46  reason: default package */
/* loaded from: classes4.dex */
public class q46 extends MvpViewState<r46> implements r46 {

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<r46> {
        a() {
            super("onUnexpectedLogout", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.fe();
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<r46> {
        b() {
            super("onUnexpectedOrderPaid", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.gc();
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<r46> {
        c() {
            super("onUnexpectedOrderPlaceFailed", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.cb();
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<r46> {
        d() {
            super("onUnexpectedOrderPlaced", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.fh();
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<r46> {
        public final String a;

        e(String str) {
            super("openUrl", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.d(this.a);
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<r46> {
        public final String a;

        f(String str) {
            super("relaunchActivityWithDeepLinkInfo", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.i1(this.a);
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<r46> {
        public final qd a;

        g(qd qdVar) {
            super("requestNotificationPermission", AddToEndSingleStrategy.class);
            this.a = qdVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.X(this.a);
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<r46> {
        h() {
            super("restartApplication", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.y();
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<r46> {
        i() {
            super("restart", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.l0();
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$j */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<r46> {
        public final String a;
        public final String b;

        j(String str, String str2) {
            super("showApiBroken", AddToEndSingleStrategy.class);
            this.a = str;
            this.b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.wd(this.a, this.b);
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$k */
    /* loaded from: classes4.dex */
    public class k extends ViewCommand<r46> {
        k() {
            super("showApiTemporarilyBlock", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.P1();
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$l */
    /* loaded from: classes4.dex */
    public class l extends ViewCommand<r46> {
        l() {
            super("showLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.b();
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$m */
    /* loaded from: classes4.dex */
    public class m extends ViewCommand<r46> {
        m() {
            super("showMainContainer", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.c6();
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$n */
    /* loaded from: classes4.dex */
    public class n extends ViewCommand<r46> {
        n() {
            super("showNeedUpdate", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.Q4();
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$o */
    /* loaded from: classes4.dex */
    public class o extends ViewCommand<r46> {
        o() {
            super("showNotificationAlert", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.Ha();
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$p */
    /* loaded from: classes4.dex */
    public class p extends ViewCommand<r46> {
        p() {
            super("showSuccessSubscriptionMessage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.b0();
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$q */
    /* loaded from: classes4.dex */
    public class q extends ViewCommand<r46> {
        public final int a;

        q(int i) {
            super("updateNavigationBarColor", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.E1(this.a);
        }
    }

    /* compiled from: MainActivityView$$State.java */
    /* renamed from: q46$r */
    /* loaded from: classes4.dex */
    public class r extends ViewCommand<r46> {
        public final int a;

        r(int i) {
            super("updateStatusBarColor", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(r46 r46Var) {
            r46Var.c2(this.a);
        }
    }

    @Override // defpackage.y60
    public void E1(int i2) {
        q qVar = new q(i2);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.E1(i2);
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // defpackage.r46
    public void Ha() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ha();
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.r46
    public void P1() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.P1();
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.r46
    public void Q4() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Q4();
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.r46
    public void X(qd qdVar) {
        g gVar = new g(qdVar);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.X(qdVar);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.r46
    public void b() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b();
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.r46
    public void b0() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b0();
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.y60
    public void c2(int i2) {
        r rVar = new r(i2);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.c2(i2);
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // defpackage.r46
    public void c6() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.c6();
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.r46
    public void cb() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.cb();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.r46
    public void d(String str) {
        e eVar = new e(str);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.d(str);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.r46
    public void fe() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.fe();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.r46
    public void fh() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.fh();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.r46
    public void gc() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.gc();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.r46
    public void i1(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.i1(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.y60
    public void l0() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.l0();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.r46
    public void wd(String str, String str2) {
        j jVar = new j(str, str2);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.wd(str, str2);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.y60
    public void y() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.y();
        }
        this.viewCommands.afterApply(hVar);
    }
}
