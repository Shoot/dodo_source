package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: PinCodeLoginView$$State.java */
/* renamed from: n68  reason: default package */
/* loaded from: classes4.dex */
public class n68 extends MvpViewState<o68> implements o68 {

    /* compiled from: PinCodeLoginView$$State.java */
    /* renamed from: n68$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<o68> {
        public final boolean a;

        a(boolean z) {
            super("blockResendButton", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o68 o68Var) {
            o68Var.Qc(this.a);
        }
    }

    /* compiled from: PinCodeLoginView$$State.java */
    /* renamed from: n68$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<o68> {
        public final long a;

        b(long j) {
            super("clearPinWithDelay", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o68 o68Var) {
            o68Var.f0(this.a);
        }
    }

    /* compiled from: PinCodeLoginView$$State.java */
    /* renamed from: n68$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<o68> {
        c() {
            super("showFailedVerification", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o68 o68Var) {
            o68Var.y3();
        }
    }

    /* compiled from: PinCodeLoginView$$State.java */
    /* renamed from: n68$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<o68> {
        public final boolean a;

        d(boolean z) {
            super("showLoading", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o68 o68Var) {
            o68Var.l(this.a);
        }
    }

    /* compiled from: PinCodeLoginView$$State.java */
    /* renamed from: n68$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<o68> {
        public final boolean a;

        e(boolean z) {
            super("showResendPinDescription", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o68 o68Var) {
            o68Var.M9(this.a);
        }
    }

    /* compiled from: PinCodeLoginView$$State.java */
    /* renamed from: n68$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<o68> {
        f() {
            super("showSixtySecondsTimer", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o68 o68Var) {
            o68Var.Sc();
        }
    }

    /* compiled from: PinCodeLoginView$$State.java */
    /* renamed from: n68$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<o68> {
        public final int a;
        public final String b;

        g(int i, String str) {
            super("showSubtitle", AddToEndSingleStrategy.class);
            this.a = i;
            this.b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o68 o68Var) {
            o68Var.k8(this.a, this.b);
        }
    }

    /* compiled from: PinCodeLoginView$$State.java */
    /* renamed from: n68$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<o68> {
        public final int a;

        h(int i) {
            super("showTitle", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o68 o68Var) {
            o68Var.ac(this.a);
        }
    }

    /* compiled from: PinCodeLoginView$$State.java */
    /* renamed from: n68$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<o68> {
        i() {
            super("showWrongPing", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o68 o68Var) {
            o68Var.R5();
        }
    }

    /* compiled from: PinCodeLoginView$$State.java */
    /* renamed from: n68$j */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<o68> {
        j() {
            super("startReceivingPinCodeSms", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o68 o68Var) {
            o68Var.Z1();
        }
    }

    @Override // defpackage.o68
    public void M9(boolean z) {
        e eVar = new e(z);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.M9(z);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.o68
    public void Qc(boolean z) {
        a aVar = new a(z);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Qc(z);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.o68
    public void R5() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.R5();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.o68
    public void Sc() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Sc();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.o68
    public void Z1() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Z1();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.o68
    public void ac(int i2) {
        h hVar = new h(i2);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ac(i2);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.o68
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

    @Override // defpackage.o68
    public void k8(int i2, String str) {
        g gVar = new g(i2, str);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.k8(i2, str);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.o68
    public void l(boolean z) {
        d dVar = new d(z);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.l(z);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.o68
    public void y3() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.y3();
        }
        this.viewCommands.afterApply(cVar);
    }
}
