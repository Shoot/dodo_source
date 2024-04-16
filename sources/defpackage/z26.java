package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: LoyaltyView$$State.java */
/* renamed from: z26  reason: default package */
/* loaded from: classes2.dex */
public class z26 extends MvpViewState<a36> implements a36 {

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<a36> {
        a() {
            super("hideCategoriesLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.M7();
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<a36> {
        b() {
            super("hideCoinsExpirationsItem", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.cc();
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<a36> {
        c() {
            super("hideFAQLinkItem", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.Kd();
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<a36> {
        d() {
            super("hideHistoryItem", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.z6();
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<a36> {
        e() {
            super("hideMoreOperationsLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.Ea();
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<a36> {
        public final int a;
        public final int b;

        f(int i, int i2) {
            super("setupCoinsExpirationsFAQ", AddToEndSingleStrategy.class);
            this.a = i;
            this.b = i2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.td(this.a, this.b);
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<a36> {
        public final int a;

        g(int i) {
            super("showAddedProductsDescription", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.B3(this.a);
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<a36> {
        h() {
            super("showAllAdded", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.Sb();
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<a36> {
        i() {
            super("showAlmostEnoughDescription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.p2();
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<a36> {
        j() {
            super("showCategoriesLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.M3();
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<a36> {
        public final double a;

        k(double d) {
            super("showCoinsBalance", AddToEndSingleStrategy.class);
            this.a = d;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.h2(this.a);
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$l */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<a36> {
        public final xa1 a;

        l(xa1 xa1Var) {
            super("showCoinsExpirationsItem", AddToEndSingleStrategy.class);
            this.a = xa1Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.Sd(this.a);
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$m */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<a36> {
        public final xa1 a;
        public final xa1 b;

        m(xa1 xa1Var, xa1 xa1Var2) {
            super("showCoinsExpirationsMoreItem", AddToEndSingleStrategy.class);
            this.a = xa1Var;
            this.b = xa1Var2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.Se(this.a, this.b);
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$n */
    /* loaded from: classes2.dex */
    public class n extends ViewCommand<a36> {
        n() {
            super("showEnoughDescription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.n5();
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$o */
    /* loaded from: classes2.dex */
    public class o extends ViewCommand<a36> {
        o() {
            super("showEnoughForAnythingDescription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.lb();
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$p */
    /* loaded from: classes2.dex */
    public class p extends ViewCommand<a36> {
        p() {
            super("showFAQLinkItem", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.Nf();
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$q */
    /* loaded from: classes2.dex */
    public class q extends ViewCommand<a36> {
        q() {
            super("showHistoryItem", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.Q9();
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$r */
    /* loaded from: classes2.dex */
    public class r extends ViewCommand<a36> {
        r() {
            super("showMoreOperationsLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.b4();
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$s */
    /* loaded from: classes2.dex */
    public class s extends ViewCommand<a36> {
        s() {
            super("showMoreOperationsLoadingError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.t5();
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$t */
    /* loaded from: classes2.dex */
    public class t extends ViewCommand<a36> {
        t() {
            super("showNotEnoughDescription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.Dg();
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$u */
    /* loaded from: classes2.dex */
    public class u extends ViewCommand<a36> {
        public final List<?> a;

        u(List<?> list) {
            super("showOperations", AddToEndSingleStrategy.class);
            this.a = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.R7(this.a);
        }
    }

    /* compiled from: LoyaltyView$$State.java */
    /* renamed from: z26$v */
    /* loaded from: classes2.dex */
    public class v extends ViewCommand<a36> {
        public final List<b26> a;

        v(List<b26> list) {
            super("showProductCategories", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a36 a36Var) {
            a36Var.qd(this.a);
        }
    }

    @Override // defpackage.a36
    public void B3(int i2) {
        g gVar = new g(i2);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.B3(i2);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.a36
    public void Dg() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Dg();
        }
        this.viewCommands.afterApply(tVar);
    }

    @Override // defpackage.a36
    public void Ea() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ea();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.a36
    public void Kd() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Kd();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.a36
    public void M3() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.M3();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.a36
    public void M7() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.M7();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.a36
    public void Nf() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Nf();
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.a36
    public void Q9() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Q9();
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // defpackage.a36
    public void R7(List<?> list) {
        u uVar = new u(list);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.R7(list);
        }
        this.viewCommands.afterApply(uVar);
    }

    @Override // defpackage.a36
    public void Sb() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Sb();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.a36
    public void Sd(xa1 xa1Var) {
        l lVar = new l(xa1Var);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Sd(xa1Var);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.a36
    public void Se(xa1 xa1Var, xa1 xa1Var2) {
        m mVar = new m(xa1Var, xa1Var2);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Se(xa1Var, xa1Var2);
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.a36
    public void b4() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b4();
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // defpackage.a36
    public void cc() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.cc();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.a36
    public void h2(double d2) {
        k kVar = new k(d2);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.h2(d2);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.a36
    public void lb() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.lb();
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.a36
    public void n5() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.n5();
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.a36
    public void p2() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.p2();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.a36
    public void qd(List<b26> list) {
        v vVar = new v(list);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.qd(list);
        }
        this.viewCommands.afterApply(vVar);
    }

    @Override // defpackage.a36
    public void t5() {
        s sVar = new s();
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.t5();
        }
        this.viewCommands.afterApply(sVar);
    }

    @Override // defpackage.a36
    public void td(int i2, int i3) {
        f fVar = new f(i2, i3);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.td(i2, i3);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.a36
    public void z6() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.z6();
        }
        this.viewCommands.afterApply(dVar);
    }
}
