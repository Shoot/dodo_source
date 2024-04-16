package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: PersonalOffersView$$State.java */
/* renamed from: j18  reason: default package */
/* loaded from: classes2.dex */
public class j18 extends MvpViewState<k18> implements k18 {

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<k18> {
        a() {
            super("animateShowTier", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.V2();
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<k18> {
        b() {
            super("hidePersonalOfferDescription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.vd();
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<k18> {
        public final boolean a;

        c(boolean z) {
            super("setEntireViewVisibility", OneExecutionStateStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.D8(this.a);
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<k18> {
        public final List<? extends p67> a;

        d(List<? extends p67> list) {
            super("setOffers", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.F8(this.a);
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<k18> {
        public final int a;

        e(int i) {
            super("setPersonalBlockTitleAppearance", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.z3(this.a);
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<k18> {
        public final rb1 a;

        f(rb1 rb1Var) {
            super("showCollaborationPromoDetails", OneExecutionStateStrategy.class);
            this.a = rb1Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.Gg(this.a);
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<k18> {
        g() {
            super("showConfirmChangePromoActionDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.I0();
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<k18> {
        h() {
            super("showExpiringOffersDescription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.L2();
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<k18> {
        i() {
            super("showManyPersonalOffersDescription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.le();
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<k18> {
        public final t2a a;
        public final cq8 b;

        j(t2a t2aVar, cq8 cq8Var) {
            super("showMoreAboutOffer", OneExecutionStateStrategy.class);
            this.a = t2aVar;
            this.b = cq8Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.Re(this.a, this.b);
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<k18> {
        public final p67 a;
        public final cq8 b;

        k(p67 p67Var, cq8 cq8Var) {
            super("showMoreAboutOffer", OneExecutionStateStrategy.class);
            this.a = p67Var;
            this.b = cq8Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.l3(this.a, this.b);
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$l */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<k18> {
        l() {
            super("showOffersState", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.Pd();
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$m */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<k18> {
        m() {
            super("showOffersStateWithOpenSecretOffer", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.K4();
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$n */
    /* loaded from: classes2.dex */
    public class n extends ViewCommand<k18> {
        n() {
            super("showOffersStateWithSecretOffer", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.i9();
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$o */
    /* loaded from: classes2.dex */
    public class o extends ViewCommand<k18> {
        public final String a;

        o(String str) {
            super("showPersonalBlockTitle", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.A4(this.a);
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$p */
    /* loaded from: classes2.dex */
    public class p extends ViewCommand<k18> {
        p() {
            super("showPersonalOfferApplied", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.Me();
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$q */
    /* loaded from: classes2.dex */
    public class q extends ViewCommand<k18> {
        q() {
            super("showPersonalOfferApplyingError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.I9();
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$r */
    /* loaded from: classes2.dex */
    public class r extends ViewCommand<k18> {
        r() {
            super("showPersonalOfferPartlyApplied", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.ub();
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$s */
    /* loaded from: classes2.dex */
    public class s extends ViewCommand<k18> {
        s() {
            super("showPersonalOffersEmptyState", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.q8();
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$t */
    /* loaded from: classes2.dex */
    public class t extends ViewCommand<k18> {
        t() {
            super("showPersonalOffersFailState", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.Y9();
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$u */
    /* loaded from: classes2.dex */
    public class u extends ViewCommand<k18> {
        u() {
            super("showPersonalOffersLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.Nc();
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$v */
    /* loaded from: classes2.dex */
    public class v extends ViewCommand<k18> {
        v() {
            super("showSinglePersonalOffersDescription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.W5();
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$w */
    /* loaded from: classes2.dex */
    public class w extends ViewCommand<k18> {
        public final int a;

        w(int i) {
            super("showWarning", OneExecutionStateStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.R0(this.a);
        }
    }

    /* compiled from: PersonalOffersView$$State.java */
    /* renamed from: j18$x */
    /* loaded from: classes2.dex */
    public class x extends ViewCommand<k18> {
        public final String a;

        x(String str) {
            super("showWarning", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(k18 k18Var) {
            k18Var.j0(this.a);
        }
    }

    @Override // defpackage.k18
    public void A4(String str) {
        o oVar = new o(str);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.A4(str);
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.k18
    public void D8(boolean z) {
        c cVar = new c(z);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.D8(z);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.k18
    public void F8(List<? extends p67> list) {
        d dVar = new d(list);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.F8(list);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.k18
    public void Gg(rb1 rb1Var) {
        f fVar = new f(rb1Var);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Gg(rb1Var);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.k18
    public void I0() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.I0();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.k18
    public void I9() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.I9();
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // defpackage.k18
    public void K4() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.K4();
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.k18
    public void L2() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.L2();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.k18
    public void Me() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Me();
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.k18
    public void Nc() {
        u uVar = new u();
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Nc();
        }
        this.viewCommands.afterApply(uVar);
    }

    @Override // defpackage.k18
    public void Pd() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Pd();
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.k18
    public void R0(int i2) {
        w wVar = new w(i2);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.R0(i2);
        }
        this.viewCommands.afterApply(wVar);
    }

    @Override // defpackage.k18
    public void Re(t2a t2aVar, cq8 cq8Var) {
        j jVar = new j(t2aVar, cq8Var);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Re(t2aVar, cq8Var);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.k18
    public void V2() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.V2();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.k18
    public void W5() {
        v vVar = new v();
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.W5();
        }
        this.viewCommands.afterApply(vVar);
    }

    @Override // defpackage.k18
    public void Y9() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Y9();
        }
        this.viewCommands.afterApply(tVar);
    }

    @Override // defpackage.k18
    public void i9() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.i9();
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.k18
    public void j0(String str) {
        x xVar = new x(str);
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.j0(str);
        }
        this.viewCommands.afterApply(xVar);
    }

    @Override // defpackage.k18
    public void l3(p67 p67Var, cq8 cq8Var) {
        k kVar = new k(p67Var, cq8Var);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.l3(p67Var, cq8Var);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.k18
    public void le() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.le();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.k18
    public void q8() {
        s sVar = new s();
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.q8();
        }
        this.viewCommands.afterApply(sVar);
    }

    @Override // defpackage.k18
    public void ub() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ub();
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // defpackage.k18
    public void vd() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.vd();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.k18
    public void z3(int i2) {
        e eVar = new e(i2);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.z3(i2);
        }
        this.viewCommands.afterApply(eVar);
    }
}
