package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: CombinedSelectionMapView$$State.java */
/* renamed from: og1  reason: default package */
/* loaded from: classes2.dex */
public class og1 extends MvpViewState<pg1> implements pg1 {

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<pg1> {
        public final s88 a;

        a(s88 s88Var) {
            super("changePizzeriasFilter", AddToEndSingleStrategy.class);
            this.a = s88Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.c5(this.a);
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<pg1> {
        b() {
            super("hideDimView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.Wf();
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<pg1> {
        c() {
            super("hideMapSwitcher", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.T8();
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<pg1> {
        d() {
            super("hidePizzeriaInfoCard", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.D9();
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<pg1> {
        e() {
            super("hidePizzeriaSearchCard", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.n1();
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<pg1> {
        f() {
            super("initializeMapFragment", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.Oe();
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<pg1> {
        public final e91 a;
        public final String b;

        g(e91 e91Var, String str) {
            super("onDeliverySuggestionSelected", OneExecutionStateStrategy.class);
            this.a = e91Var;
            this.b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.pd(this.a, this.b);
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<pg1> {
        public final String a;

        h(String str) {
            super("openDialer", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.K(this.a);
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<pg1> {
        public final d88 a;
        public final int b;

        i(d88 d88Var, int i) {
            super("pizzeriaTapInSuggestion", OneExecutionStateStrategy.class);
            this.a = d88Var;
            this.b = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.Y7(this.a, this.b);
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<pg1> {
        public final String a;
        public final String b;

        j(String str, String str2) {
            super("showCountry", AddToEndSingleStrategy.class);
            this.a = str;
            this.b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.qg(this.a, this.b);
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<pg1> {
        public final boolean a;

        k(boolean z) {
            super("showDeliveryMap", OneExecutionStateStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.Y5(this.a);
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$l */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<pg1> {
        l() {
            super("showDeliverySuggestions", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.q4();
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$m */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<pg1> {
        m() {
            super("showDimView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.l6();
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$n */
    /* loaded from: classes2.dex */
    public class n extends ViewCommand<pg1> {
        n() {
            super("showMapSwitcher", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.x5();
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$o */
    /* loaded from: classes2.dex */
    public class o extends ViewCommand<pg1> {
        public final t88 a;

        o(t88 t88Var) {
            super("showPizzeriaInfoCard", OneExecutionStateStrategy.class);
            this.a = t88Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.tb(this.a);
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$p */
    /* loaded from: classes2.dex */
    public class p extends ViewCommand<pg1> {
        p() {
            super("showPizzeriaMap", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.V1();
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$q */
    /* loaded from: classes2.dex */
    public class q extends ViewCommand<pg1> {
        q() {
            super("showPizzeriaSearchCard", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.L9();
        }
    }

    /* compiled from: CombinedSelectionMapView$$State.java */
    /* renamed from: og1$r */
    /* loaded from: classes2.dex */
    public class r extends ViewCommand<pg1> {
        r() {
            super("showPizzeriaSuggestions", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pg1 pg1Var) {
            pg1Var.C3();
        }
    }

    @Override // defpackage.pg1
    public void C3() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.C3();
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // defpackage.pg1
    public void D9() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.D9();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.pg1
    public void K(String str) {
        h hVar = new h(str);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.K(str);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.pg1
    public void L9() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.L9();
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // defpackage.pg1
    public void Oe() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Oe();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.pg1
    public void T8() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.T8();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.pg1
    public void V1() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.V1();
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.pg1
    public void Wf() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Wf();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.pg1
    public void Y5(boolean z) {
        k kVar = new k(z);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Y5(z);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.pg1
    public void Y7(d88 d88Var, int i2) {
        i iVar = new i(d88Var, i2);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Y7(d88Var, i2);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.pg1
    public void c5(s88 s88Var) {
        a aVar = new a(s88Var);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.c5(s88Var);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.pg1
    public void l6() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.l6();
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.pg1
    public void n1() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.n1();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.pg1
    public void pd(e91 e91Var, String str) {
        g gVar = new g(e91Var, str);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.pd(e91Var, str);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.pg1
    public void q4() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.q4();
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.pg1
    public void qg(String str, String str2) {
        j jVar = new j(str, str2);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.qg(str, str2);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.pg1
    public void tb(t88 t88Var) {
        o oVar = new o(t88Var);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.tb(t88Var);
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.pg1
    public void x5() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.x5();
        }
        this.viewCommands.afterApply(nVar);
    }
}
