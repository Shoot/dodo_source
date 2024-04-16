package defpackage;

import com.google.android.gms.wallet.PaymentDataRequest;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: CheckoutDetailsView$$State.java */
/* renamed from: v41  reason: default package */
/* loaded from: classes4.dex */
public class v41 extends MvpViewState<w41> implements w41 {

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<w41> {
        a() {
            super("hideOrderTypeSwitcher", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.a7();
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<w41> {
        b() {
            super("hideOverloadModeButton", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.Mb();
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<w41> {
        c() {
            super("hideOverloadModeContainer", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.Zf();
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<w41> {
        d() {
            super("hideOverloadModeTitle", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.jf();
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<w41> {
        e() {
            super("hideRestaurantDiscount", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.W();
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<w41> {
        public final String a;

        f(String str) {
            super("openApp2AppPayDeepLink", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.Q5(this.a);
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<w41> {
        public final String a;

        g(String str) {
            super("openReusablePackageInfoLink", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.lc(this.a);
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<w41> {
        public final String a;

        h(String str) {
            super("openSberPayDeepLink", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.Rb(this.a);
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<w41> {
        public final String a;
        public final hu9 b;

        i(String str, hu9 hu9Var) {
            super("openSbpBank", OneExecutionStateStrategy.class);
            this.a = str;
            this.b = hu9Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.x1(this.a, this.b);
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$j */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<w41> {
        j() {
            super("removeOverloadModeClickListener", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.T6();
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$k */
    /* loaded from: classes4.dex */
    public class k extends ViewCommand<w41> {
        public final int a;

        k(int i) {
            super("scrollDeferredTime", OneExecutionStateStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.f6(this.a);
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$l */
    /* loaded from: classes4.dex */
    public class l extends ViewCommand<w41> {
        l() {
            super("setOverloadModeClickListener", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.O2();
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$m */
    /* loaded from: classes4.dex */
    public class m extends ViewCommand<w41> {
        m() {
            super("setOverloadModeLaterWarning", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.P9();
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$n */
    /* loaded from: classes4.dex */
    public class n extends ViewCommand<w41> {
        n() {
            super("setOverloadModeManyOrdersWarning", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.I1();
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$o */
    /* loaded from: classes4.dex */
    public class o extends ViewCommand<w41> {
        public final b61 a;

        o(b61 b61Var) {
            super("show", AddToEndSingleStrategy.class);
            this.a = b61Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.v5(this.a);
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$p */
    /* loaded from: classes4.dex */
    public class p extends ViewCommand<w41> {
        public final ik3 a;

        p(ik3 ik3Var) {
            super("showCreateOrderError", OneExecutionStateStrategy.class);
            this.a = ik3Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.V8(this.a);
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$q */
    /* loaded from: classes4.dex */
    public class q extends ViewCommand<w41> {
        public final String a;
        public final PaymentDataRequest b;
        public final z41 c;
        public final String d;

        q(String str, PaymentDataRequest paymentDataRequest, z41 z41Var, String str2) {
            super("showGooglePayWallet", OneExecutionStateStrategy.class);
            this.a = str;
            this.b = paymentDataRequest;
            this.c = z41Var;
            this.d = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.Y3(this.a, this.b, this.c, this.d);
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$r */
    /* loaded from: classes4.dex */
    public class r extends ViewCommand<w41> {
        r() {
            super("showOrderTypeSwitcher", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.Tc();
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$s */
    /* loaded from: classes4.dex */
    public class s extends ViewCommand<w41> {
        s() {
            super("showOverloadModeButton", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.Df();
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$t */
    /* loaded from: classes4.dex */
    public class t extends ViewCommand<w41> {
        t() {
            super("showOverloadModeContainer", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.C8();
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$u */
    /* loaded from: classes4.dex */
    public class u extends ViewCommand<w41> {
        u() {
            super("showOverloadModeTitle", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.k2();
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$v */
    /* loaded from: classes4.dex */
    public class v extends ViewCommand<w41> {
        v() {
            super("showPaymentError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.L8();
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$w */
    /* loaded from: classes4.dex */
    public class w extends ViewCommand<w41> {
        public final b61 a;

        w(b61 b61Var) {
            super("showPaymentProgressIndicator", OneExecutionStateStrategy.class);
            this.a = b61Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.V3(this.a);
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$x */
    /* loaded from: classes4.dex */
    public class x extends ViewCommand<w41> {
        public final String a;

        x(String str) {
            super("showRestaurantDiscount", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.P0(this.a);
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$y */
    /* loaded from: classes4.dex */
    public class y extends ViewCommand<w41> {
        public final List<? extends ok9> a;

        y(List<? extends ok9> list) {
            super("showSelectPackaging", SkipStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.E6(this.a);
        }
    }

    /* compiled from: CheckoutDetailsView$$State.java */
    /* renamed from: v41$z */
    /* loaded from: classes4.dex */
    public class z extends ViewCommand<w41> {
        z() {
            super("updateLastLocation", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(w41 w41Var) {
            w41Var.Wd();
        }
    }

    @Override // defpackage.w41
    public void C8() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.C8();
        }
        this.viewCommands.afterApply(tVar);
    }

    @Override // defpackage.w41
    public void Df() {
        s sVar = new s();
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Df();
        }
        this.viewCommands.afterApply(sVar);
    }

    @Override // defpackage.w41
    public void E6(List<? extends ok9> list) {
        y yVar = new y(list);
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.E6(list);
        }
        this.viewCommands.afterApply(yVar);
    }

    @Override // defpackage.w41
    public void I1() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.I1();
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.w41
    public void L8() {
        v vVar = new v();
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.L8();
        }
        this.viewCommands.afterApply(vVar);
    }

    @Override // defpackage.w41
    public void Mb() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Mb();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.w41
    public void O2() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.O2();
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.w41
    public void P0(String str) {
        x xVar = new x(str);
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.P0(str);
        }
        this.viewCommands.afterApply(xVar);
    }

    @Override // defpackage.w41
    public void P9() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.P9();
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.w41
    public void Q5(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Q5(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.w41
    public void Rb(String str) {
        h hVar = new h(str);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Rb(str);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.w41
    public void T6() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.T6();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.w41
    public void Tc() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Tc();
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // defpackage.w41
    public void V3(b61 b61Var) {
        w wVar = new w(b61Var);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.V3(b61Var);
        }
        this.viewCommands.afterApply(wVar);
    }

    @Override // defpackage.w41
    public void V8(ik3 ik3Var) {
        p pVar = new p(ik3Var);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.V8(ik3Var);
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.w41
    public void W() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.W();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.w41
    public void Wd() {
        z zVar = new z();
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Wd();
        }
        this.viewCommands.afterApply(zVar);
    }

    @Override // defpackage.w41
    public void Y3(String str, PaymentDataRequest paymentDataRequest, z41 z41Var, String str2) {
        q qVar = new q(str, paymentDataRequest, z41Var, str2);
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Y3(str, paymentDataRequest, z41Var, str2);
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // defpackage.w41
    public void Zf() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Zf();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.w41
    public void a7() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.a7();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.w41
    public void f6(int i2) {
        k kVar = new k(i2);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.f6(i2);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.w41
    public void jf() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.jf();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.w41
    public void k2() {
        u uVar = new u();
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.k2();
        }
        this.viewCommands.afterApply(uVar);
    }

    @Override // defpackage.w41
    public void lc(String str) {
        g gVar = new g(str);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.lc(str);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.w41
    public void v5(b61 b61Var) {
        o oVar = new o(b61Var);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.v5(b61Var);
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.w41
    public void x1(String str, hu9 hu9Var) {
        i iVar = new i(str, hu9Var);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.x1(str, hu9Var);
        }
        this.viewCommands.afterApply(iVar);
    }
}
