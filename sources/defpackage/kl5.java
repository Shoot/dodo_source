package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: LandingSMSInputView$$State.java */
/* renamed from: kl5  reason: default package */
/* loaded from: classes4.dex */
public class kl5 extends MvpViewState<ll5> implements ll5 {

    /* compiled from: LandingSMSInputView$$State.java */
    /* renamed from: kl5$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<ll5> {
        a() {
            super("blockPinEntry", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ll5 ll5Var) {
            ll5Var.Fb();
        }
    }

    /* compiled from: LandingSMSInputView$$State.java */
    /* renamed from: kl5$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<ll5> {
        public final long a;

        b(long j) {
            super("clearPinWithDelay", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ll5 ll5Var) {
            ll5Var.f0(this.a);
        }
    }

    /* compiled from: LandingSMSInputView$$State.java */
    /* renamed from: kl5$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<ll5> {
        c() {
            super("disableButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ll5 ll5Var) {
            ll5Var.h0();
        }
    }

    /* compiled from: LandingSMSInputView$$State.java */
    /* renamed from: kl5$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<ll5> {
        d() {
            super("enableButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ll5 ll5Var) {
            ll5Var.R();
        }
    }

    /* compiled from: LandingSMSInputView$$State.java */
    /* renamed from: kl5$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<ll5> {
        public final String a;

        e(String str) {
            super("setAddress", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ll5 ll5Var) {
            ll5Var.setAddress(this.a);
        }
    }

    /* compiled from: LandingSMSInputView$$State.java */
    /* renamed from: kl5$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<ll5> {
        public final long a;

        f(long j) {
            super("showCountDownTime", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ll5 ll5Var) {
            ll5Var.F9(this.a);
        }
    }

    /* compiled from: LandingSMSInputView$$State.java */
    /* renamed from: kl5$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<ll5> {
        g() {
            super("showError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ll5 ll5Var) {
            ll5Var.e();
        }
    }

    /* compiled from: LandingSMSInputView$$State.java */
    /* renamed from: kl5$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<ll5> {
        public final boolean a;

        h(boolean z) {
            super("showLoading", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ll5 ll5Var) {
            ll5Var.l(this.a);
        }
    }

    /* compiled from: LandingSMSInputView$$State.java */
    /* renamed from: kl5$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<ll5> {
        i() {
            super("showOffBoarding", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ll5 ll5Var) {
            ll5Var.Q8();
        }
    }

    /* compiled from: LandingSMSInputView$$State.java */
    /* renamed from: kl5$j */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<ll5> {
        j() {
            super("showWrongPin", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ll5 ll5Var) {
            ll5Var.E8();
        }
    }

    /* compiled from: LandingSMSInputView$$State.java */
    /* renamed from: kl5$k */
    /* loaded from: classes4.dex */
    public class k extends ViewCommand<ll5> {
        k() {
            super("unblockPinEntry", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ll5 ll5Var) {
            ll5Var.i2();
        }
    }

    @Override // defpackage.ll5
    public void E8() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.E8();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.ll5
    public void F9(long j2) {
        f fVar = new f(j2);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.F9(j2);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.ll5
    public void Fb() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Fb();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.ll5
    public void Q8() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Q8();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.ll5
    public void R() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.R();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.ll5
    public void e() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.e();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.ll5
    public void f0(long j2) {
        b bVar = new b(j2);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.f0(j2);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.ll5
    public void h0() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.h0();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.ll5
    public void i2() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.i2();
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.ll5
    public void l(boolean z) {
        h hVar = new h(z);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.l(z);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.ll5
    public void setAddress(String str) {
        e eVar = new e(str);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.setAddress(str);
        }
        this.viewCommands.afterApply(eVar);
    }
}
