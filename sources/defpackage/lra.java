package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: SpecialOfferDialogView$$State.java */
/* renamed from: lra  reason: default package */
/* loaded from: classes2.dex */
public class lra extends MvpViewState<mra> implements mra {

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<mra> {
        a() {
            super("close", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.close();
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<mra> {
        b() {
            super("hideApplyButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.w9();
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<mra> {
        c() {
            super("hideExpireTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.B();
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<mra> {
        d() {
            super("hideImage", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.w0();
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<mra> {
        e() {
            super("hideProgress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.g();
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<mra> {
        public final tra a;

        f(tra traVar) {
            super("setupOfferInformation", AddToEndSingleStrategy.class);
            this.a = traVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.ja(this.a);
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<mra> {
        g() {
            super("showCategoryButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.b1();
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<mra> {
        h() {
            super("showConfirmChangePromoActionDialog", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.I0();
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<mra> {
        i() {
            super("showError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.e();
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<mra> {
        public final long a;

        j(long j) {
            super("showExpireTitle", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.n(this.a);
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<mra> {
        public final long a;

        k(long j) {
            super("showExpiringTitle", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.v(this.a);
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$l */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<mra> {
        public final long a;

        l(long j) {
            super("showFutureExpireTitle", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.Ta(this.a);
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$m */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<mra> {
        public final String a;

        m(String str) {
            super("showImage", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.z(this.a);
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$n */
    /* loaded from: classes2.dex */
    public class n extends ViewCommand<mra> {
        public final int a;

        n(int i) {
            super("showLocalImage", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.Vc(this.a);
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$o */
    /* loaded from: classes2.dex */
    public class o extends ViewCommand<mra> {
        o() {
            super("showOfferAppliedButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.xf();
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$p */
    /* loaded from: classes2.dex */
    public class p extends ViewCommand<mra> {
        p() {
            super("showOfferApplied", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.c3();
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$q */
    /* loaded from: classes2.dex */
    public class q extends ViewCommand<mra> {
        q() {
            super("showProductButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.Yf();
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$r */
    /* loaded from: classes2.dex */
    public class r extends ViewCommand<mra> {
        r() {
            super("showProductWarning", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.ta();
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$s */
    /* loaded from: classes2.dex */
    public class s extends ViewCommand<mra> {
        s() {
            super("showProgress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.f();
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$t */
    /* loaded from: classes2.dex */
    public class t extends ViewCommand<mra> {
        t() {
            super("showPromoActionAppliedButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.J8();
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$u */
    /* loaded from: classes2.dex */
    public class u extends ViewCommand<mra> {
        u() {
            super("showPromoActionButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.y1();
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$v */
    /* loaded from: classes2.dex */
    public class v extends ViewCommand<mra> {
        v() {
            super("showPromoCodeButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.u6();
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$w */
    /* loaded from: classes2.dex */
    public class w extends ViewCommand<mra> {
        public final String a;

        w(String str) {
            super("showWarning", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.j0(this.a);
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$x */
    /* loaded from: classes2.dex */
    public class x extends ViewCommand<mra> {
        public final int a;

        x(int i) {
            super("showWarning", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.R0(this.a);
        }
    }

    /* compiled from: SpecialOfferDialogView$$State.java */
    /* renamed from: lra$y */
    /* loaded from: classes2.dex */
    public class y extends ViewCommand<mra> {
        y() {
            super("showWebSiteButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(mra mraVar) {
            mraVar.k3();
        }
    }

    @Override // defpackage.mra
    public void B() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.B();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.mra
    public void I0() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.I0();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.mra
    public void J8() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.J8();
        }
        this.viewCommands.afterApply(tVar);
    }

    @Override // defpackage.mra
    public void R0(int i2) {
        x xVar = new x(i2);
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.R0(i2);
        }
        this.viewCommands.afterApply(xVar);
    }

    @Override // defpackage.mra
    public void Ta(long j2) {
        l lVar = new l(j2);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ta(j2);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.mra
    public void Vc(int i2) {
        n nVar = new n(i2);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Vc(i2);
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.mra
    public void Yf() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Yf();
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // defpackage.mra
    public void b1() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b1();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.mra
    public void c3() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.c3();
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.mra
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

    @Override // defpackage.mra
    public void e() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.e();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.mra
    public void f() {
        s sVar = new s();
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.f();
        }
        this.viewCommands.afterApply(sVar);
    }

    @Override // defpackage.mra
    public void g() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.g();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.mra
    public void j0(String str) {
        w wVar = new w(str);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.j0(str);
        }
        this.viewCommands.afterApply(wVar);
    }

    @Override // defpackage.mra
    public void ja(tra traVar) {
        f fVar = new f(traVar);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ja(traVar);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.mra
    public void k3() {
        y yVar = new y();
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.k3();
        }
        this.viewCommands.afterApply(yVar);
    }

    @Override // defpackage.mra
    public void n(long j2) {
        j jVar = new j(j2);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.n(j2);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.mra
    public void ta() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ta();
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // defpackage.mra
    public void u6() {
        v vVar = new v();
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.u6();
        }
        this.viewCommands.afterApply(vVar);
    }

    @Override // defpackage.mra
    public void v(long j2) {
        k kVar = new k(j2);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.v(j2);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.mra
    public void w0() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.w0();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.mra
    public void w9() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.w9();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.mra
    public void xf() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.xf();
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.mra
    public void y1() {
        u uVar = new u();
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.y1();
        }
        this.viewCommands.afterApply(uVar);
    }

    @Override // defpackage.mra
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
}
