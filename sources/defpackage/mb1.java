package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: CollaborationPromoDialogView$$State.java */
/* renamed from: mb1  reason: default package */
/* loaded from: classes4.dex */
public class mb1 extends MvpViewState<nb1> implements nb1 {

    /* compiled from: CollaborationPromoDialogView$$State.java */
    /* renamed from: mb1$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<nb1> {
        a() {
            super("close", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(nb1 nb1Var) {
            nb1Var.close();
        }
    }

    /* compiled from: CollaborationPromoDialogView$$State.java */
    /* renamed from: mb1$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<nb1> {
        public final String a;

        b(String str) {
            super("copyPromoCode", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(nb1 nb1Var) {
            nb1Var.l5(this.a);
        }
    }

    /* compiled from: CollaborationPromoDialogView$$State.java */
    /* renamed from: mb1$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<nb1> {
        c() {
            super("enablePromoCodeButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(nb1 nb1Var) {
            nb1Var.o1();
        }
    }

    /* compiled from: CollaborationPromoDialogView$$State.java */
    /* renamed from: mb1$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<nb1> {
        d() {
            super("hideExpireTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(nb1 nb1Var) {
            nb1Var.B();
        }
    }

    /* compiled from: CollaborationPromoDialogView$$State.java */
    /* renamed from: mb1$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<nb1> {
        e() {
            super("hideImage", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(nb1 nb1Var) {
            nb1Var.w0();
        }
    }

    /* compiled from: CollaborationPromoDialogView$$State.java */
    /* renamed from: mb1$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<nb1> {
        f() {
            super("hideNavigationButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(nb1 nb1Var) {
            nb1Var.M2();
        }
    }

    /* compiled from: CollaborationPromoDialogView$$State.java */
    /* renamed from: mb1$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<nb1> {
        g() {
            super("hidePromoCopyButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(nb1 nb1Var) {
            nb1Var.z4();
        }
    }

    /* compiled from: CollaborationPromoDialogView$$State.java */
    /* renamed from: mb1$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<nb1> {
        public final String a;

        h(String str) {
            super("navigateToCollaborationLink", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(nb1 nb1Var) {
            nb1Var.m1(this.a);
        }
    }

    /* compiled from: CollaborationPromoDialogView$$State.java */
    /* renamed from: mb1$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<nb1> {
        public final String a;

        i(String str) {
            super("setupOfferInformation", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(nb1 nb1Var) {
            nb1Var.Pc(this.a);
        }
    }

    /* compiled from: CollaborationPromoDialogView$$State.java */
    /* renamed from: mb1$j */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<nb1> {
        public final String a;

        j(String str) {
            super("setupOfferTitle", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(nb1 nb1Var) {
            nb1Var.W2(this.a);
        }
    }

    /* compiled from: CollaborationPromoDialogView$$State.java */
    /* renamed from: mb1$k */
    /* loaded from: classes4.dex */
    public class k extends ViewCommand<nb1> {
        public final long a;

        k(long j) {
            super("showExpireTitle", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(nb1 nb1Var) {
            nb1Var.n(this.a);
        }
    }

    /* compiled from: CollaborationPromoDialogView$$State.java */
    /* renamed from: mb1$l */
    /* loaded from: classes4.dex */
    public class l extends ViewCommand<nb1> {
        public final long a;

        l(long j) {
            super("showExpiringTitle", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(nb1 nb1Var) {
            nb1Var.v(this.a);
        }
    }

    /* compiled from: CollaborationPromoDialogView$$State.java */
    /* renamed from: mb1$m */
    /* loaded from: classes4.dex */
    public class m extends ViewCommand<nb1> {
        public final String a;

        m(String str) {
            super("showImage", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(nb1 nb1Var) {
            nb1Var.z(this.a);
        }
    }

    /* compiled from: CollaborationPromoDialogView$$State.java */
    /* renamed from: mb1$n */
    /* loaded from: classes4.dex */
    public class n extends ViewCommand<nb1> {
        n() {
            super("showNavigationButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(nb1 nb1Var) {
            nb1Var.J1();
        }
    }

    /* compiled from: CollaborationPromoDialogView$$State.java */
    /* renamed from: mb1$o */
    /* loaded from: classes4.dex */
    public class o extends ViewCommand<nb1> {
        o() {
            super("showPromoCodeCopiedButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(nb1 nb1Var) {
            nb1Var.g8();
        }
    }

    /* compiled from: CollaborationPromoDialogView$$State.java */
    /* renamed from: mb1$p */
    /* loaded from: classes4.dex */
    public class p extends ViewCommand<nb1> {
        public final String a;

        p(String str) {
            super("showPromoCodeCopyButton", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(nb1 nb1Var) {
            nb1Var.a1(this.a);
        }
    }

    @Override // defpackage.nb1
    public void B() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.B();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.nb1
    public void J1() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.J1();
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.nb1
    public void M2() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.M2();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.nb1
    public void Pc(String str) {
        i iVar = new i(str);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Pc(str);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.nb1
    public void W2(String str) {
        j jVar = new j(str);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.W2(str);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.nb1
    public void a1(String str) {
        p pVar = new p(str);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.a1(str);
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.nb1
    public void close() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.close();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.nb1
    public void g8() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.g8();
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.nb1
    public void l5(String str) {
        b bVar = new b(str);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.l5(str);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.nb1
    public void m1(String str) {
        h hVar = new h(str);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.m1(str);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.nb1
    public void n(long j2) {
        k kVar = new k(j2);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.n(j2);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.nb1
    public void o1() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.o1();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.nb1
    public void v(long j2) {
        l lVar = new l(j2);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.v(j2);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.nb1
    public void w0() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.w0();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.nb1
    public void z(String str) {
        m mVar = new m(str);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.z(str);
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.nb1
    public void z4() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.z4();
        }
        this.viewCommands.afterApply(gVar);
    }
}
