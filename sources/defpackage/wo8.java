package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: ProfileView$$State.java */
/* renamed from: wo8  reason: default package */
/* loaded from: classes4.dex */
public class wo8 extends MvpViewState<xo8> implements xo8 {

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<xo8> {
        a() {
            super("disableSubscription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.ca();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$a0 */
    /* loaded from: classes4.dex */
    public class a0 extends ViewCommand<xo8> {
        a0() {
            super("showMissionAcceptingError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.D6();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<xo8> {
        b() {
            super("enableSubscription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.Xg();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$b0 */
    /* loaded from: classes4.dex */
    public class b0 extends ViewCommand<xo8> {
        b0() {
            super("showPersonalOffersFragment", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.d7();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<xo8> {
        c() {
            super("hideActiveOrdersList", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.F1();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$c0 */
    /* loaded from: classes4.dex */
    public class c0 extends ViewCommand<xo8> {
        c0() {
            super("showSubscription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.F5();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<xo8> {
        d() {
            super("hideConnectionError", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.o0();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$d0 */
    /* loaded from: classes4.dex */
    public class d0 extends ViewCommand<xo8> {
        d0() {
            super("showSuccessSubscriptionMessage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.b0();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<xo8> {
        e() {
            super("hideLoyaltyMissionsItem", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.t8();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$e0 */
    /* loaded from: classes4.dex */
    public class e0 extends ViewCommand<xo8> {
        e0() {
            super("showSupportButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.j7();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<xo8> {
        f() {
            super("hideSubscription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.gb();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$f0 */
    /* loaded from: classes4.dex */
    public class f0 extends ViewCommand<xo8> {
        public final com.dodopizza.profile.feature.profilesettings.presentation.a a;
        public final boolean b;
        public final boolean c;

        f0(com.dodopizza.profile.feature.profilesettings.presentation.a aVar, boolean z, boolean z2) {
            super("showSupportDialog", OneExecutionStateStrategy.class);
            this.a = aVar;
            this.b = z;
            this.c = z2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.hg(this.a, this.b, this.c);
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<xo8> {
        g() {
            super("hideSupportButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.Kb();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$g0 */
    /* loaded from: classes4.dex */
    public class g0 extends ViewCommand<xo8> {
        g0() {
            super("showUnauthorizedContainer", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.b5();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<xo8> {
        h() {
            super("hideUnreadChatMessagesCount", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.i();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$h0 */
    /* loaded from: classes4.dex */
    public class h0 extends ViewCommand<xo8> {
        public final int a;

        h0(int i) {
            super("showUnreadChatMessagesCount", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.h(this.a);
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<xo8> {
        i() {
            super("hideUserBenefitsLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.T3();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$i0 */
    /* loaded from: classes4.dex */
    public class i0 extends ViewCommand<xo8> {
        i0() {
            super("showUserBenefitsContainer", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.H3();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$j */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<xo8> {
        public final String a;

        j(String str) {
            super("openPhone", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.a0(this.a);
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$j0 */
    /* loaded from: classes4.dex */
    public class j0 extends ViewCommand<xo8> {
        j0() {
            super("showUserBenefitsLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.kd();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$k */
    /* loaded from: classes4.dex */
    public class k extends ViewCommand<xo8> {
        k() {
            super("replacePersonalOffersFragment", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.A2();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$k0 */
    /* loaded from: classes4.dex */
    public class k0 extends ViewCommand<xo8> {
        k0() {
            super("showVersion", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.U3();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$l */
    /* loaded from: classes4.dex */
    public class l extends ViewCommand<xo8> {
        public final String a;
        public final int b;
        public final String c;
        public final int d;
        public final boolean e;

        l(String str, int i, String str2, int i2, boolean z) {
            super("setVersion", AddToEndSingleStrategy.class);
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = i2;
            this.e = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.id(this.a, this.b, this.c, this.d, this.e);
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$l0 */
    /* loaded from: classes4.dex */
    public class l0 extends ViewCommand<xo8> {
        public final List<? extends q4c> a;

        l0(List<? extends q4c> list) {
            super("updatePersonalWidgets", OneExecutionStateStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.ng(this.a);
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$m */
    /* loaded from: classes4.dex */
    public class m extends ViewCommand<xo8> {
        public final List<wl7> a;

        m(List<wl7> list) {
            super("showActiveOrdersList", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.C1(this.a);
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$n */
    /* loaded from: classes4.dex */
    public class n extends ViewCommand<xo8> {
        n() {
            super("showAlmostOkMessage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.nc();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$o */
    /* loaded from: classes4.dex */
    public class o extends ViewCommand<xo8> {
        o() {
            super("showAuthorizedContainer", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.la();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$p */
    /* loaded from: classes4.dex */
    public class p extends ViewCommand<xo8> {
        public final int a;

        p(int i) {
            super("showCanceledOrderMessage", OneExecutionStateStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.N2(this.a);
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$q */
    /* loaded from: classes4.dex */
    public class q extends ViewCommand<xo8> {
        q() {
            super("showConnectionError", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.S();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$r */
    /* loaded from: classes4.dex */
    public class r extends ViewCommand<xo8> {
        r() {
            super("showFailedSubscriptionMessage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.Q1();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$s */
    /* loaded from: classes4.dex */
    public class s extends ViewCommand<xo8> {
        public final String a;

        s(String str) {
            super("showInfoStory", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.F(this.a);
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$t */
    /* loaded from: classes4.dex */
    public class t extends ViewCommand<xo8> {
        t() {
            super("showInviteCodeDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.Lb();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$u */
    /* loaded from: classes4.dex */
    public class u extends ViewCommand<xo8> {
        u() {
            super("showLegalDocuments", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.k0();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$v */
    /* loaded from: classes4.dex */
    public class v extends ViewCommand<xo8> {
        public final List<ul6> a;

        v(List<ul6> list) {
            super("showLoyaltyMissions", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.ne(this.a);
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$w */
    /* loaded from: classes4.dex */
    public class w extends ViewCommand<xo8> {
        public final String a;

        w(String str) {
            super("showLoyaltyMissionsEmptyState", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.We(this.a);
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$x */
    /* loaded from: classes4.dex */
    public class x extends ViewCommand<xo8> {
        x() {
            super("showLoyaltyMissionsFailState", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.nb();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$y */
    /* loaded from: classes4.dex */
    public class y extends ViewCommand<xo8> {
        y() {
            super("showLoyaltyMissionsItem", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.k6();
        }
    }

    /* compiled from: ProfileView$$State.java */
    /* renamed from: wo8$z */
    /* loaded from: classes4.dex */
    public class z extends ViewCommand<xo8> {
        z() {
            super("showLoyaltyMissionsLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xo8 xo8Var) {
            xo8Var.q3();
        }
    }

    @Override // defpackage.xo8
    public void A2() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.A2();
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.xo8
    public void C1(List<wl7> list) {
        m mVar = new m(list);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.C1(list);
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.xo8
    public void D6() {
        a0 a0Var = new a0();
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.D6();
        }
        this.viewCommands.afterApply(a0Var);
    }

    @Override // defpackage.xo8
    public void F(String str) {
        s sVar = new s(str);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.F(str);
        }
        this.viewCommands.afterApply(sVar);
    }

    @Override // defpackage.xo8
    public void F1() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.F1();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.xo8
    public void F5() {
        c0 c0Var = new c0();
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.F5();
        }
        this.viewCommands.afterApply(c0Var);
    }

    @Override // defpackage.xo8
    public void H3() {
        i0 i0Var = new i0();
        this.viewCommands.beforeApply(i0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.H3();
        }
        this.viewCommands.afterApply(i0Var);
    }

    @Override // defpackage.xo8
    public void Kb() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Kb();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.xo8
    public void Lb() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Lb();
        }
        this.viewCommands.afterApply(tVar);
    }

    @Override // defpackage.xo8
    public void N2(int i2) {
        p pVar = new p(i2);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.N2(i2);
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.xo8
    public void Q1() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Q1();
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // defpackage.xo8
    public void S() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.S();
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // defpackage.xo8
    public void T3() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.T3();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.xo8
    public void U3() {
        k0 k0Var = new k0();
        this.viewCommands.beforeApply(k0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.U3();
        }
        this.viewCommands.afterApply(k0Var);
    }

    @Override // defpackage.xo8
    public void We(String str) {
        w wVar = new w(str);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.We(str);
        }
        this.viewCommands.afterApply(wVar);
    }

    @Override // defpackage.xo8
    public void Xg() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Xg();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.xo8
    public void a0(String str) {
        j jVar = new j(str);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.a0(str);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.xo8
    public void b0() {
        d0 d0Var = new d0();
        this.viewCommands.beforeApply(d0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b0();
        }
        this.viewCommands.afterApply(d0Var);
    }

    @Override // defpackage.xo8
    public void b5() {
        g0 g0Var = new g0();
        this.viewCommands.beforeApply(g0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b5();
        }
        this.viewCommands.afterApply(g0Var);
    }

    @Override // defpackage.xo8
    public void ca() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ca();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.xo8
    public void d7() {
        b0 b0Var = new b0();
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.d7();
        }
        this.viewCommands.afterApply(b0Var);
    }

    @Override // defpackage.xo8
    public void gb() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.gb();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.xo8
    public void h(int i2) {
        h0 h0Var = new h0(i2);
        this.viewCommands.beforeApply(h0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.h(i2);
        }
        this.viewCommands.afterApply(h0Var);
    }

    @Override // defpackage.xo8
    public void hg(com.dodopizza.profile.feature.profilesettings.presentation.a aVar, boolean z2, boolean z3) {
        f0 f0Var = new f0(aVar, z2, z3);
        this.viewCommands.beforeApply(f0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.hg(aVar, z2, z3);
        }
        this.viewCommands.afterApply(f0Var);
    }

    @Override // defpackage.xo8
    public void i() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.i();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.xo8
    public void id(String str, int i2, String str2, int i3, boolean z2) {
        l lVar = new l(str, i2, str2, i3, z2);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.id(str, i2, str2, i3, z2);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.xo8
    public void j7() {
        e0 e0Var = new e0();
        this.viewCommands.beforeApply(e0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.j7();
        }
        this.viewCommands.afterApply(e0Var);
    }

    @Override // defpackage.xo8
    public void k0() {
        u uVar = new u();
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.k0();
        }
        this.viewCommands.afterApply(uVar);
    }

    @Override // defpackage.xo8
    public void k6() {
        y yVar = new y();
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.k6();
        }
        this.viewCommands.afterApply(yVar);
    }

    @Override // defpackage.xo8
    public void kd() {
        j0 j0Var = new j0();
        this.viewCommands.beforeApply(j0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.kd();
        }
        this.viewCommands.afterApply(j0Var);
    }

    @Override // defpackage.xo8
    public void la() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.la();
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.xo8
    public void nb() {
        x xVar = new x();
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.nb();
        }
        this.viewCommands.afterApply(xVar);
    }

    @Override // defpackage.xo8
    public void nc() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.nc();
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.xo8
    public void ne(List<ul6> list) {
        v vVar = new v(list);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ne(list);
        }
        this.viewCommands.afterApply(vVar);
    }

    @Override // defpackage.xo8
    public void ng(List<? extends q4c> list) {
        l0 l0Var = new l0(list);
        this.viewCommands.beforeApply(l0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ng(list);
        }
        this.viewCommands.afterApply(l0Var);
    }

    @Override // defpackage.xo8
    public void o0() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.o0();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.xo8
    public void q3() {
        z zVar = new z();
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.q3();
        }
        this.viewCommands.afterApply(zVar);
    }

    @Override // defpackage.xo8
    public void t8() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.t8();
        }
        this.viewCommands.afterApply(eVar);
    }
}
