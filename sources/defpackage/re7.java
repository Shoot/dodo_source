package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: OrderHistoryDetailsView$$State.java */
/* renamed from: re7  reason: default package */
/* loaded from: classes2.dex */
public class re7 extends MvpViewState<se7> implements se7 {

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<se7> {
        public final boolean a;

        a(boolean z) {
            super("changeCheckVisibility", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.j5(this.a);
        }
    }

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<se7> {
        b() {
            super("hideChecksLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.Od();
        }
    }

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<se7> {
        c() {
            super("hideDeliveryFee", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.J();
        }
    }

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<se7> {
        d() {
            super("hideLoader", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.w();
        }
    }

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<se7> {
        public final List<? extends xf7> a;

        e(List<? extends xf7> list) {
            super("setOrderItems", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.n9(this.a);
        }
    }

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<se7> {
        public final String a;

        f(String str) {
            super("showAddress", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.A0(this.a);
        }
    }

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<se7> {
        g() {
            super("showChecksLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.uc();
        }
    }

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<se7> {
        h() {
            super("showChecksLoadingError", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.ic();
        }
    }

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<se7> {
        public final String a;

        i(String str) {
            super("showDate", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.p8(this.a);
        }
    }

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<se7> {
        public final hn6 a;

        j(hn6 hn6Var) {
            super("showDeliveryFee", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.D0(this.a);
        }
    }

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<se7> {
        k() {
            super("showFreeDeliveryFee", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.r0();
        }
    }

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$l */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<se7> {
        l() {
            super("showLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.b();
        }
    }

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$m */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<se7> {
        public final jk7 a;

        m(jk7 jk7Var) {
            super("showOrderType", AddToEndSingleStrategy.class);
            this.a = jk7Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.M1(this.a);
        }
    }

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$n */
    /* loaded from: classes2.dex */
    public class n extends ViewCommand<se7> {
        public final hn6 a;

        n(hn6 hn6Var) {
            super("showPrice", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.J0(this.a);
        }
    }

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$o */
    /* loaded from: classes2.dex */
    public class o extends ViewCommand<se7> {
        o() {
            super("showRepeatOrderError", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.U();
        }
    }

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$p */
    /* loaded from: classes2.dex */
    public class p extends ViewCommand<se7> {
        public final List<z21> a;

        p(List<z21> list) {
            super("showSelectChecks", SkipStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.s3(this.a);
        }
    }

    /* compiled from: OrderHistoryDetailsView$$State.java */
    /* renamed from: re7$q */
    /* loaded from: classes2.dex */
    public class q extends ViewCommand<se7> {
        public final String a;

        q(String str) {
            super("showTitle", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(se7 se7Var) {
            se7Var.r(this.a);
        }
    }

    @Override // defpackage.se7
    public void A0(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.A0(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.se7
    public void D0(hn6 hn6Var) {
        j jVar = new j(hn6Var);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.D0(hn6Var);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.se7
    public void J() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.J();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.se7
    public void J0(hn6 hn6Var) {
        n nVar = new n(hn6Var);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.J0(hn6Var);
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.se7
    public void M1(jk7 jk7Var) {
        m mVar = new m(jk7Var);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.M1(jk7Var);
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.se7
    public void Od() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Od();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.se7
    public void U() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.U();
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.se7
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

    @Override // defpackage.se7
    public void ic() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ic();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.se7
    public void j5(boolean z) {
        a aVar = new a(z);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.j5(z);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.se7
    public void n9(List<? extends xf7> list) {
        e eVar = new e(list);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.n9(list);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.se7
    public void p8(String str) {
        i iVar = new i(str);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.p8(str);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.se7
    public void r(String str) {
        q qVar = new q(str);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.r(str);
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // defpackage.se7
    public void r0() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.r0();
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.se7
    public void s3(List<z21> list) {
        p pVar = new p(list);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.s3(list);
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.se7
    public void uc() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.uc();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.se7
    public void w() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.w();
        }
        this.viewCommands.afterApply(dVar);
    }
}
