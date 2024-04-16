package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: OrderRatingView$$State.java */
/* renamed from: bi7  reason: default package */
/* loaded from: classes.dex */
public class bi7 extends MvpViewState<ci7> implements ci7 {

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<ci7> {
        a() {
            super("cancelOrderRatingPushNotification", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.e5();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$a0 */
    /* loaded from: classes.dex */
    public class a0 extends ViewCommand<ci7> {
        public final String a;

        a0(String str) {
            super("showProductsTitle", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.N4(this.a);
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$b */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<ci7> {
        b() {
            super("disableSendButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.zd();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$b0 */
    /* loaded from: classes.dex */
    public class b0 extends ViewCommand<ci7> {
        public final int a;

        b0(int i) {
            super("showRatingBarWith", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.W0(this.a);
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$c */
    /* loaded from: classes.dex */
    public class c extends ViewCommand<ci7> {
        c() {
            super("enableSendButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.Vb();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$c0 */
    /* loaded from: classes.dex */
    public class c0 extends ViewCommand<ci7> {
        c0() {
            super("showRatingLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.N7();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$d */
    /* loaded from: classes.dex */
    public class d extends ViewCommand<ci7> {
        d() {
            super("hideBinaryFeedback", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.B0();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$d0 */
    /* loaded from: classes.dex */
    public class d0 extends ViewCommand<ci7> {
        public final int a;

        d0(int i) {
            super("showRatingTitleFor", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.pg(this.a);
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$e */
    /* loaded from: classes.dex */
    public class e extends ViewCommand<ci7> {
        e() {
            super("hideBinaryFeedbackTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.s8();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$e0 */
    /* loaded from: classes.dex */
    public class e0 extends ViewCommand<ci7> {
        e0() {
            super("showSendingLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.Gd();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$f */
    /* loaded from: classes.dex */
    public class f extends ViewCommand<ci7> {
        f() {
            super("hideComment", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.Aa();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$f0 */
    /* loaded from: classes.dex */
    public class f0 extends ViewCommand<ci7> {
        f0() {
            super("showTags", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.ka();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$g */
    /* loaded from: classes.dex */
    public class g extends ViewCommand<ci7> {
        g() {
            super("hideContactMeSwitch", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.Ue();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$g0 */
    /* loaded from: classes.dex */
    public class g0 extends ViewCommand<ci7> {
        g0() {
            super("showUnselectedBinaryFeedback", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.g0();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$h */
    /* loaded from: classes.dex */
    public class h extends ViewCommand<ci7> {
        h() {
            super("hideProductsTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.Rd();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$h0 */
    /* loaded from: classes.dex */
    public class h0 extends ViewCommand<ci7> {
        h0() {
            super("showUnselectedRatingTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.p3();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$i */
    /* loaded from: classes.dex */
    public class i extends ViewCommand<ci7> {
        i() {
            super("hideRatingBar", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.v0();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$i0 */
    /* loaded from: classes.dex */
    public class i0 extends ViewCommand<ci7> {
        public final boolean a;

        i0(boolean z) {
            super("switchAttachedPhotosIndicatorVisibility", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.sg(this.a);
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$j */
    /* loaded from: classes.dex */
    public class j extends ViewCommand<ci7> {
        j() {
            super("hideRatingLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.mo0if();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$k */
    /* loaded from: classes.dex */
    public class k extends ViewCommand<ci7> {
        k() {
            super("hideRatingTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.g1();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$l */
    /* loaded from: classes.dex */
    public class l extends ViewCommand<ci7> {
        l() {
            super("hideSendingLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.Q3();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$m */
    /* loaded from: classes.dex */
    public class m extends ViewCommand<ci7> {
        m() {
            super("hideTags", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.cd();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$n */
    /* loaded from: classes.dex */
    public class n extends ViewCommand<ci7> {
        n() {
            super("hideTagsTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.ba();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$o */
    /* loaded from: classes.dex */
    public class o extends ViewCommand<ci7> {
        public final String a;

        o(String str) {
            super("openUrl", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.d(this.a);
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$p */
    /* loaded from: classes.dex */
    public class p extends ViewCommand<ci7> {
        public final String a;

        p(String str) {
            super("setCommentDescription", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.Bd(this.a);
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$q */
    /* loaded from: classes.dex */
    public class q extends ViewCommand<ci7> {
        public final boolean a;

        q(boolean z) {
            super("setCourierTipsCardVisible", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.q0(this.a);
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$r */
    /* loaded from: classes.dex */
    public class r extends ViewCommand<ci7> {
        public final boolean a;

        r(boolean z) {
            super("setRnDigitalCardVisible", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.H(this.a);
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$s */
    /* loaded from: classes.dex */
    public class s extends ViewCommand<ci7> {
        public final List<r69> a;

        s(List<r69> list) {
            super("setTags", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.d3(this.a);
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$t */
    /* loaded from: classes.dex */
    public class t extends ViewCommand<ci7> {
        public final ez1 a;

        t(ez1 ez1Var) {
            super("setupCourierTipsCard", OneExecutionStateStrategy.class);
            this.a = ez1Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.t0(this.a);
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$u */
    /* loaded from: classes.dex */
    public class u extends ViewCommand<ci7> {
        public final vm9 a;

        u(vm9 vm9Var) {
            super("setupRnDigitalCard", OneExecutionStateStrategy.class);
            this.a = vm9Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.s(this.a);
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$v */
    /* loaded from: classes.dex */
    public class v extends ViewCommand<ci7> {
        v() {
            super("showBinaryFeedbackTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.N5();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$w */
    /* loaded from: classes.dex */
    public class w extends ViewCommand<ci7> {
        w() {
            super("showComment", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.v6();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$x */
    /* loaded from: classes.dex */
    public class x extends ViewCommand<ci7> {
        public final es1 a;
        public final boolean b;

        x(es1 es1Var, boolean z) {
            super("showContactMeSwitch", AddToEndSingleStrategy.class);
            this.a = es1Var;
            this.b = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.Ze(this.a, this.b);
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$y */
    /* loaded from: classes.dex */
    public class y extends ViewCommand<ci7> {
        y() {
            super("showNegativeTagsTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.O6();
        }
    }

    /* compiled from: OrderRatingView$$State.java */
    /* renamed from: bi7$z */
    /* loaded from: classes.dex */
    public class z extends ViewCommand<ci7> {
        z() {
            super("showPositiveTagsTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ci7 ci7Var) {
            ci7Var.oa();
        }
    }

    @Override // defpackage.ci7
    public void Aa() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Aa();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.ci7
    public void B0() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.B0();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.ci7
    public void Bd(String str) {
        p pVar = new p(str);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Bd(str);
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.ci7
    public void Gd() {
        e0 e0Var = new e0();
        this.viewCommands.beforeApply(e0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Gd();
        }
        this.viewCommands.afterApply(e0Var);
    }

    @Override // defpackage.ci7
    public void H(boolean z2) {
        r rVar = new r(z2);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.H(z2);
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // defpackage.ci7
    public void N4(String str) {
        a0 a0Var = new a0(str);
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.N4(str);
        }
        this.viewCommands.afterApply(a0Var);
    }

    @Override // defpackage.ci7
    public void N5() {
        v vVar = new v();
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.N5();
        }
        this.viewCommands.afterApply(vVar);
    }

    @Override // defpackage.ci7
    public void N7() {
        c0 c0Var = new c0();
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.N7();
        }
        this.viewCommands.afterApply(c0Var);
    }

    @Override // defpackage.ci7
    public void O6() {
        y yVar = new y();
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.O6();
        }
        this.viewCommands.afterApply(yVar);
    }

    @Override // defpackage.ci7
    public void Q3() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Q3();
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.ci7
    public void Rd() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Rd();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.ci7
    public void Ue() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ue();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.ci7
    public void Vb() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Vb();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.ci7
    public void W0(int i2) {
        b0 b0Var = new b0(i2);
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.W0(i2);
        }
        this.viewCommands.afterApply(b0Var);
    }

    @Override // defpackage.ci7
    public void Ze(es1 es1Var, boolean z2) {
        x xVar = new x(es1Var, z2);
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ze(es1Var, z2);
        }
        this.viewCommands.afterApply(xVar);
    }

    @Override // defpackage.ci7
    public void ba() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ba();
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.ci7
    public void cd() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.cd();
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.ci7
    public void d(String str) {
        o oVar = new o(str);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.d(str);
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.ci7
    public void d3(List<r69> list) {
        s sVar = new s(list);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.d3(list);
        }
        this.viewCommands.afterApply(sVar);
    }

    @Override // defpackage.ci7
    public void e5() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.e5();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.ci7
    public void g0() {
        g0 g0Var = new g0();
        this.viewCommands.beforeApply(g0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.g0();
        }
        this.viewCommands.afterApply(g0Var);
    }

    @Override // defpackage.ci7
    public void g1() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.g1();
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.ci7
    /* renamed from: if  reason: not valid java name */
    public void mo0if() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.mo0if();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.ci7
    public void ka() {
        f0 f0Var = new f0();
        this.viewCommands.beforeApply(f0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ka();
        }
        this.viewCommands.afterApply(f0Var);
    }

    @Override // defpackage.ci7
    public void oa() {
        z zVar = new z();
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.oa();
        }
        this.viewCommands.afterApply(zVar);
    }

    @Override // defpackage.ci7
    public void p3() {
        h0 h0Var = new h0();
        this.viewCommands.beforeApply(h0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.p3();
        }
        this.viewCommands.afterApply(h0Var);
    }

    @Override // defpackage.ci7
    public void pg(int i2) {
        d0 d0Var = new d0(i2);
        this.viewCommands.beforeApply(d0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.pg(i2);
        }
        this.viewCommands.afterApply(d0Var);
    }

    @Override // defpackage.ci7
    public void q0(boolean z2) {
        q qVar = new q(z2);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.q0(z2);
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // defpackage.ci7
    public void s(vm9 vm9Var) {
        u uVar = new u(vm9Var);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.s(vm9Var);
        }
        this.viewCommands.afterApply(uVar);
    }

    @Override // defpackage.ci7
    public void s8() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.s8();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.ci7
    public void sg(boolean z2) {
        i0 i0Var = new i0(z2);
        this.viewCommands.beforeApply(i0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.sg(z2);
        }
        this.viewCommands.afterApply(i0Var);
    }

    @Override // defpackage.ci7
    public void t0(ez1 ez1Var) {
        t tVar = new t(ez1Var);
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.t0(ez1Var);
        }
        this.viewCommands.afterApply(tVar);
    }

    @Override // defpackage.ci7
    public void v0() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.v0();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.ci7
    public void v6() {
        w wVar = new w();
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.v6();
        }
        this.viewCommands.afterApply(wVar);
    }

    @Override // defpackage.ci7
    public void zd() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.zd();
        }
        this.viewCommands.afterApply(bVar);
    }
}
