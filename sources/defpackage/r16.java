package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: LoyaltyMissionDetailsView$$State.java */
/* renamed from: r16  reason: default package */
/* loaded from: classes2.dex */
public class r16 extends MvpViewState<s16> implements s16 {

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<s16> {
        a() {
            super("disableSendingAbility", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.pe();
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$a0 */
    /* loaded from: classes2.dex */
    public class a0 extends ViewCommand<s16> {
        public final int a;

        a0(int i) {
            super("showTooShortAnswer", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.Ic(this.a);
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<s16> {
        b() {
            super("enableSendingAbility", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.q5();
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$b0 */
    /* loaded from: classes2.dex */
    public class b0 extends ViewCommand<s16> {
        public final int a;

        b0(int i) {
            super("showUserAnswerInput", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.pc(this.a);
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<s16> {
        c() {
            super("hideExpireTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.B();
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$c0 */
    /* loaded from: classes2.dex */
    public class c0 extends ViewCommand<s16> {
        c0() {
            super("unlockUserInputAnswer", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.ib();
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<s16> {
        d() {
            super("hideInputError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.F4();
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<s16> {
        e() {
            super("hideMissionStatus", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.Y6();
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<s16> {
        f() {
            super("hideSendLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.mg();
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<s16> {
        g() {
            super("hideUserAnswerInput", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.za();
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<s16> {
        h() {
            super("lockUserInputAnswer", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.k4();
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<s16> {
        public final String a;

        i(String str) {
            super("setMissionConditions", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.hf(this.a);
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<s16> {
        public final String a;

        j(String str) {
            super("setMissionTitle", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.tg(this.a);
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<s16> {
        public final long a;

        k(long j) {
            super("setRewardTitle", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.Cg(this.a);
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$l */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<s16> {
        public final String a;

        l(String str) {
            super("setUserAnswer", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.Hb(this.a);
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$m */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<s16> {
        m() {
            super("showCompletedStatus", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.ze();
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$n */
    /* loaded from: classes2.dex */
    public class n extends ViewCommand<s16> {
        public final int a;

        n(int i) {
            super("showDoneProgressStatus", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.r2(this.a);
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$o */
    /* loaded from: classes2.dex */
    public class o extends ViewCommand<s16> {
        o() {
            super("showErrorSendMessage", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.f1();
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$p */
    /* loaded from: classes2.dex */
    public class p extends ViewCommand<s16> {
        public final long a;

        p(long j) {
            super("showExpireTitle", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.n(this.a);
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$q */
    /* loaded from: classes2.dex */
    public class q extends ViewCommand<s16> {
        public final long a;

        q(long j) {
            super("showExpiringTitle", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.v(this.a);
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$r */
    /* loaded from: classes2.dex */
    public class r extends ViewCommand<s16> {
        public final String a;

        r(String str) {
            super("showMissionImage", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.ag(this.a);
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$s */
    /* loaded from: classes2.dex */
    public class s extends ViewCommand<s16> {
        public final int a;
        public final int b;

        s(int i, int i2) {
            super("showOnProgressStatus", AddToEndSingleStrategy.class);
            this.a = i;
            this.b = i2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.A1(this.a, this.b);
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$t */
    /* loaded from: classes2.dex */
    public class t extends ViewCommand<s16> {
        t() {
            super("showOnVerifyingStatus", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.k7();
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$u */
    /* loaded from: classes2.dex */
    public class u extends ViewCommand<s16> {
        public final String a;

        u(String str) {
            super("showOnVerifyingStatusWithMessage", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.r4(this.a);
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$v */
    /* loaded from: classes2.dex */
    public class v extends ViewCommand<s16> {
        v() {
            super("showReadyForAcceptStatus", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.be();
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$w */
    /* loaded from: classes2.dex */
    public class w extends ViewCommand<s16> {
        w() {
            super("showReadyForAnswerStatus", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.Le();
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$x */
    /* loaded from: classes2.dex */
    public class x extends ViewCommand<s16> {
        public final String a;

        x(String str) {
            super("showRetryStatus", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.u2(this.a);
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$y */
    /* loaded from: classes2.dex */
    public class y extends ViewCommand<s16> {
        y() {
            super("showSendLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.ye();
        }
    }

    /* compiled from: LoyaltyMissionDetailsView$$State.java */
    /* renamed from: r16$z */
    /* loaded from: classes2.dex */
    public class z extends ViewCommand<s16> {
        z() {
            super("showTooLongAnswer", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(s16 s16Var) {
            s16Var.Q7();
        }
    }

    @Override // defpackage.s16
    public void A1(int i2, int i3) {
        s sVar = new s(i2, i3);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.A1(i2, i3);
        }
        this.viewCommands.afterApply(sVar);
    }

    @Override // defpackage.s16
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

    @Override // defpackage.s16
    public void Cg(long j2) {
        k kVar = new k(j2);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Cg(j2);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.s16
    public void F4() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.F4();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.s16
    public void Hb(String str) {
        l lVar = new l(str);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Hb(str);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.s16
    public void Ic(int i2) {
        a0 a0Var = new a0(i2);
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ic(i2);
        }
        this.viewCommands.afterApply(a0Var);
    }

    @Override // defpackage.s16
    public void Le() {
        w wVar = new w();
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Le();
        }
        this.viewCommands.afterApply(wVar);
    }

    @Override // defpackage.s16
    public void Q7() {
        z zVar = new z();
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Q7();
        }
        this.viewCommands.afterApply(zVar);
    }

    @Override // defpackage.s16
    public void Y6() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Y6();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.s16
    public void ag(String str) {
        r rVar = new r(str);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ag(str);
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // defpackage.s16
    public void be() {
        v vVar = new v();
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.be();
        }
        this.viewCommands.afterApply(vVar);
    }

    @Override // defpackage.s16
    public void f1() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.f1();
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.s16
    public void hf(String str) {
        i iVar = new i(str);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.hf(str);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.s16
    public void ib() {
        c0 c0Var = new c0();
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ib();
        }
        this.viewCommands.afterApply(c0Var);
    }

    @Override // defpackage.s16
    public void k4() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.k4();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.s16
    public void k7() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.k7();
        }
        this.viewCommands.afterApply(tVar);
    }

    @Override // defpackage.s16
    public void mg() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.mg();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.s16
    public void n(long j2) {
        p pVar = new p(j2);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.n(j2);
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.s16
    public void pc(int i2) {
        b0 b0Var = new b0(i2);
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.pc(i2);
        }
        this.viewCommands.afterApply(b0Var);
    }

    @Override // defpackage.s16
    public void pe() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.pe();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.s16
    public void q5() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.q5();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.s16
    public void r2(int i2) {
        n nVar = new n(i2);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.r2(i2);
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.s16
    public void r4(String str) {
        u uVar = new u(str);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.r4(str);
        }
        this.viewCommands.afterApply(uVar);
    }

    @Override // defpackage.s16
    public void tg(String str) {
        j jVar = new j(str);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.tg(str);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.s16
    public void u2(String str) {
        x xVar = new x(str);
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.u2(str);
        }
        this.viewCommands.afterApply(xVar);
    }

    @Override // defpackage.s16
    public void v(long j2) {
        q qVar = new q(j2);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.v(j2);
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // defpackage.s16
    public void ye() {
        y yVar = new y();
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ye();
        }
        this.viewCommands.afterApply(yVar);
    }

    @Override // defpackage.s16
    public void za() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.za();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.s16
    public void ze() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ze();
        }
        this.viewCommands.afterApply(mVar);
    }
}
