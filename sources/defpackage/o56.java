package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import ru.dodopizza.mindbox.model.MindboxProperties;
/* compiled from: MainScreenView$$State.java */
/* renamed from: o56  reason: default package */
/* loaded from: classes4.dex */
public class o56 extends MvpViewState<p56> implements p56 {

    /* compiled from: MainScreenView$$State.java */
    /* renamed from: o56$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<p56> {
        a() {
            super("applyShoppingCartFragmentFactory", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(p56 p56Var) {
            p56Var.hd();
        }
    }

    /* compiled from: MainScreenView$$State.java */
    /* renamed from: o56$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<p56> {
        b() {
            super("applyShoppingCartWithInfiniteUpsellFragmentFactory", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(p56 p56Var) {
            p56Var.g6();
        }
    }

    /* compiled from: MainScreenView$$State.java */
    /* renamed from: o56$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<p56> {
        c() {
            super("hideGoodsAmount", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(p56 p56Var) {
            p56Var.yg();
        }
    }

    /* compiled from: MainScreenView$$State.java */
    /* renamed from: o56$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<p56> {
        d() {
            super("hideUnreadChatMessagesCount", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(p56 p56Var) {
            p56Var.i();
        }
    }

    /* compiled from: MainScreenView$$State.java */
    /* renamed from: o56$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<p56> {
        public final MindboxProperties a;

        e(MindboxProperties mindboxProperties) {
            super("initMindbox", OneExecutionStateStrategy.class);
            this.a = mindboxProperties;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(p56 p56Var) {
            p56Var.Kc(this.a);
        }
    }

    /* compiled from: MainScreenView$$State.java */
    /* renamed from: o56$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<p56> {
        f() {
            super("resetFoodMenuScrollState", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(p56 p56Var) {
            p56Var.ad();
        }
    }

    /* compiled from: MainScreenView$$State.java */
    /* renamed from: o56$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<p56> {
        public final rb1 a;

        g(rb1 rb1Var) {
            super("showCollaborationPromo", OneExecutionStateStrategy.class);
            this.a = rb1Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(p56 p56Var) {
            p56Var.g4(this.a);
        }
    }

    /* compiled from: MainScreenView$$State.java */
    /* renamed from: o56$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<p56> {
        public final n56 a;

        h(n56 n56Var) {
            super("showFragment", OneExecutionStateStrategy.class);
            this.a = n56Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(p56 p56Var) {
            p56Var.f8(this.a);
        }
    }

    /* compiled from: MainScreenView$$State.java */
    /* renamed from: o56$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<p56> {
        public final int a;

        i(int i) {
            super("showGoodsAmount", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(p56 p56Var) {
            p56Var.Pa(this.a);
        }
    }

    /* compiled from: MainScreenView$$State.java */
    /* renamed from: o56$j */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<p56> {
        public final p67 a;
        public final h18 b;

        j(p67 p67Var, h18 h18Var) {
            super("showPersonalOffer", OneExecutionStateStrategy.class);
            this.a = p67Var;
            this.b = h18Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(p56 p56Var) {
            p56Var.X5(this.a, this.b);
        }
    }

    /* compiled from: MainScreenView$$State.java */
    /* renamed from: o56$k */
    /* loaded from: classes4.dex */
    public class k extends ViewCommand<p56> {
        public final cq8 a;
        public final ce0 b;

        k(cq8 cq8Var, ce0 ce0Var) {
            super("showPromoCodeOffer", OneExecutionStateStrategy.class);
            this.a = cq8Var;
            this.b = ce0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(p56 p56Var) {
            p56Var.A6(this.a, this.b);
        }
    }

    /* compiled from: MainScreenView$$State.java */
    /* renamed from: o56$l */
    /* loaded from: classes4.dex */
    public class l extends ViewCommand<p56> {
        public final ce0 a;
        public final cq8 b;

        l(ce0 ce0Var, cq8 cq8Var) {
            super("showSpecialOffer", OneExecutionStateStrategy.class);
            this.a = ce0Var;
            this.b = cq8Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(p56 p56Var) {
            p56Var.yb(this.a, this.b);
        }
    }

    /* compiled from: MainScreenView$$State.java */
    /* renamed from: o56$m */
    /* loaded from: classes4.dex */
    public class m extends ViewCommand<p56> {
        public final int a;

        m(int i) {
            super("showUnreadChatMessagesCount", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(p56 p56Var) {
            p56Var.h(this.a);
        }
    }

    /* compiled from: MainScreenView$$State.java */
    /* renamed from: o56$n */
    /* loaded from: classes4.dex */
    public class n extends ViewCommand<p56> {
        public final n56 a;

        n(n56 n56Var) {
            super("switchTab", OneExecutionStateStrategy.class);
            this.a = n56Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(p56 p56Var) {
            p56Var.C7(this.a);
        }
    }

    @Override // defpackage.p56
    public void A6(cq8 cq8Var, ce0 ce0Var) {
        k kVar = new k(cq8Var, ce0Var);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.A6(cq8Var, ce0Var);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.p56
    public void C7(n56 n56Var) {
        n nVar = new n(n56Var);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.C7(n56Var);
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.p56
    public void Kc(MindboxProperties mindboxProperties) {
        e eVar = new e(mindboxProperties);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Kc(mindboxProperties);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.p56
    public void Pa(int i2) {
        i iVar = new i(i2);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Pa(i2);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.p56
    public void X5(p67 p67Var, h18 h18Var) {
        j jVar = new j(p67Var, h18Var);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.X5(p67Var, h18Var);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.p56
    public void ad() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ad();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.p56
    public void f8(n56 n56Var) {
        h hVar = new h(n56Var);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.f8(n56Var);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.p56
    public void g4(rb1 rb1Var) {
        g gVar = new g(rb1Var);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.g4(rb1Var);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.p56
    public void g6() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.g6();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.p56
    public void h(int i2) {
        m mVar = new m(i2);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.h(i2);
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.p56
    public void hd() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.hd();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.p56
    public void i() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.i();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.p56
    public void yb(ce0 ce0Var, cq8 cq8Var) {
        l lVar = new l(ce0Var, cq8Var);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.yb(ce0Var, cq8Var);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.p56
    public void yg() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.yg();
        }
        this.viewCommands.afterApply(cVar);
    }
}
