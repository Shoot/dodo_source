package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: StackGameView$$State.java */
/* renamed from: eta  reason: default package */
/* loaded from: classes2.dex */
public class eta extends MvpViewState<fta> implements fta {

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<fta> {
        a() {
            super("hideAmountCounter", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.vf();
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<fta> {
        b() {
            super("hideLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.C();
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<fta> {
        public final String a;
        public final nc4 b;

        c(String str, nc4 nc4Var) {
            super("loadGame", AddToEndSingleStrategy.class);
            this.a = str;
            this.b = nc4Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.Z3(this.a, this.b);
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<fta> {
        public final double a;
        public final int b;

        d(double d, int i) {
            super("showGameEnded", AddToEndSingleStrategy.class);
            this.a = d;
            this.b = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.wg(this.a, this.b);
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<fta> {
        public final int a;
        public final int b;

        e(int i, int i2) {
            super("showGameInfo", AddToEndSingleStrategy.class);
            this.a = i;
            this.b = i2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.A7(this.a, this.b);
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<fta> {
        f() {
            super("showLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.b();
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<fta> {
        public final double a;

        g(double d) {
            super("showMaxAmountCounter", AddToEndSingleStrategy.class);
            this.a = d;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.j6(this.a);
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<fta> {
        public final String a;

        h(String str) {
            super("showReachMaxCountAction", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.O4(this.a);
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<fta> {
        i() {
            super("showRestartingState", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.jb();
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<fta> {
        public final double a;
        public final String b;

        j(double d, String str) {
            super("showRewardTaken", AddToEndSingleStrategy.class);
            this.a = d;
            this.b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.de(this.a, this.b);
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<fta> {
        k() {
            super("showStartingState", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.n2();
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$l */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<fta> {
        public final String a;

        l(String str) {
            super("showTakeRewardError", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.Hd(this.a);
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$m */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<fta> {
        m() {
            super("showTakeRewardError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.F2();
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$n */
    /* loaded from: classes2.dex */
    public class n extends ViewCommand<fta> {
        n() {
            super("showTryEnded", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.o7();
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$o */
    /* loaded from: classes2.dex */
    public class o extends ViewCommand<fta> {
        public final pc4 a;

        o(pc4 pc4Var) {
            super("startGame", AddToEndSingleStrategy.class);
            this.a = pc4Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.te(this.a);
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$p */
    /* loaded from: classes2.dex */
    public class p extends ViewCommand<fta> {
        p() {
            super("stopGame", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.q6();
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$q */
    /* loaded from: classes2.dex */
    public class q extends ViewCommand<fta> {
        public final double a;
        public final double b;

        q(double d, double d2) {
            super("updateAmountCounter", AddToEndSingleStrategy.class);
            this.a = d;
            this.b = d2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.Ra(this.a, this.b);
        }
    }

    /* compiled from: StackGameView$$State.java */
    /* renamed from: eta$r */
    /* loaded from: classes2.dex */
    public class r extends ViewCommand<fta> {
        public final int a;

        r(int i) {
            super("updatePointCounter", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fta ftaVar) {
            ftaVar.S6(this.a);
        }
    }

    @Override // defpackage.fta
    public void A7(int i2, int i3) {
        e eVar = new e(i2, i3);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.A7(i2, i3);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.fta
    public void C() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.C();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.fta
    public void F2() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.F2();
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.fta
    public void Hd(String str) {
        l lVar = new l(str);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Hd(str);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.fta
    public void O4(String str) {
        h hVar = new h(str);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.O4(str);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.fta
    public void Ra(double d2, double d3) {
        q qVar = new q(d2, d3);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ra(d2, d3);
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // defpackage.fta
    public void S6(int i2) {
        r rVar = new r(i2);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.S6(i2);
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // defpackage.fta
    public void Z3(String str, nc4 nc4Var) {
        c cVar = new c(str, nc4Var);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Z3(str, nc4Var);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.fta
    public void b() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.fta
    public void de(double d2, String str) {
        j jVar = new j(d2, str);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.de(d2, str);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.fta
    public void j6(double d2) {
        g gVar = new g(d2);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.j6(d2);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.fta
    public void jb() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.jb();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.fta
    public void n2() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.n2();
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.fta
    public void o7() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.o7();
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.fta
    public void q6() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.q6();
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.fta
    public void te(pc4 pc4Var) {
        o oVar = new o(pc4Var);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.te(pc4Var);
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.fta
    public void vf() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.vf();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.fta
    public void wg(double d2, int i2) {
        d dVar = new d(d2, i2);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.wg(d2, i2);
        }
        this.viewCommands.afterApply(dVar);
    }
}
