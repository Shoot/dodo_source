package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: CashChargeView$$State.java */
/* renamed from: xs0  reason: default package */
/* loaded from: classes4.dex */
public class xs0 extends MvpViewState<ys0> implements ys0 {

    /* compiled from: CashChargeView$$State.java */
    /* renamed from: xs0$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<ys0> {
        a() {
            super("hideKeyboard", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ys0 ys0Var) {
            ys0Var.a();
        }
    }

    /* compiled from: CashChargeView$$State.java */
    /* renamed from: xs0$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<ys0> {
        b() {
            super("hideNotEnoughMoneyError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ys0 ys0Var) {
            ys0Var.b3();
        }
    }

    /* compiled from: CashChargeView$$State.java */
    /* renamed from: xs0$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<ys0> {
        c() {
            super("onDataLoaded", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ys0 ys0Var) {
            ys0Var.P();
        }
    }

    /* compiled from: CashChargeView$$State.java */
    /* renamed from: xs0$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<ys0> {
        public final boolean a;

        d(boolean z) {
            super("setDoneButtonEnabled", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ys0 ys0Var) {
            ys0Var.C5(this.a);
        }
    }

    /* compiled from: CashChargeView$$State.java */
    /* renamed from: xs0$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<ys0> {
        e() {
            super("showDoneButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ys0 ys0Var) {
            ys0Var.Z();
        }
    }

    /* compiled from: CashChargeView$$State.java */
    /* renamed from: xs0$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<ys0> {
        f() {
            super("showExitConfirmationDialog", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ys0 ys0Var) {
            ys0Var.Fc();
        }
    }

    /* compiled from: CashChargeView$$State.java */
    /* renamed from: xs0$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<ys0> {
        g() {
            super("showHaveExactMoneyButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ys0 ys0Var) {
            ys0Var.H8();
        }
    }

    /* compiled from: CashChargeView$$State.java */
    /* renamed from: xs0$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<ys0> {
        h() {
            super("showNotEnoughMoneyError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ys0 ys0Var) {
            ys0Var.Vf();
        }
    }

    /* compiled from: CashChargeView$$State.java */
    /* renamed from: xs0$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<ys0> {
        public final String a;

        i(String str) {
            super("showNoteAmount", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ys0 ys0Var) {
            ys0Var.rg(this.a);
        }
    }

    /* compiled from: CashChargeView$$State.java */
    /* renamed from: xs0$j */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<ys0> {
        public final hn6 a;

        j(hn6 hn6Var) {
            super("showOrderTotalAmount", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ys0 ys0Var) {
            ys0Var.Cd(this.a);
        }
    }

    /* compiled from: CashChargeView$$State.java */
    /* renamed from: xs0$k */
    /* loaded from: classes4.dex */
    public class k extends ViewCommand<ys0> {
        public final String a;

        k(String str) {
            super("showPrefixCurrency", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ys0 ys0Var) {
            ys0Var.D3(this.a);
        }
    }

    /* compiled from: CashChargeView$$State.java */
    /* renamed from: xs0$l */
    /* loaded from: classes4.dex */
    public class l extends ViewCommand<ys0> {
        public final String a;

        l(String str) {
            super("showSuffixCurrency", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ys0 ys0Var) {
            ys0Var.h3(this.a);
        }
    }

    /* compiled from: CashChargeView$$State.java */
    /* renamed from: xs0$m */
    /* loaded from: classes4.dex */
    public class m extends ViewCommand<ys0> {
        m() {
            super("vibrate", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ys0 ys0Var) {
            ys0Var.u0();
        }
    }

    @Override // defpackage.ys0
    public void C5(boolean z) {
        d dVar = new d(z);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.C5(z);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.ys0
    public void Cd(hn6 hn6Var) {
        j jVar = new j(hn6Var);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Cd(hn6Var);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.ys0
    public void D3(String str) {
        k kVar = new k(str);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.D3(str);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.ys0
    public void Fc() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Fc();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.ys0
    public void H8() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.H8();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.ys0
    public void P() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.P();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.ys0
    public void Vf() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Vf();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.ys0
    public void Z() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Z();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.ys0
    public void a() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.a();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.ys0
    public void b3() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b3();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.ys0
    public void h3(String str) {
        l lVar = new l(str);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.h3(str);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.ys0
    public void rg(String str) {
        i iVar = new i(str);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.rg(str);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.ys0
    public void u0() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.u0();
        }
        this.viewCommands.afterApply(mVar);
    }
}
