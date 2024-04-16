package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: PhoneNumberLoginView$$State.java */
/* renamed from: z38  reason: default package */
/* loaded from: classes4.dex */
public class z38 extends MvpViewState<a48> implements a48 {

    /* compiled from: PhoneNumberLoginView$$State.java */
    /* renamed from: z38$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<a48> {
        public final boolean a;

        a(boolean z) {
            super("enableSendButton", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a48 a48Var) {
            a48Var.Tg(this.a);
        }
    }

    /* compiled from: PhoneNumberLoginView$$State.java */
    /* renamed from: z38$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<a48> {
        b() {
            super("hideLegalInfoLink", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a48 a48Var) {
            a48Var.fa();
        }
    }

    /* compiled from: PhoneNumberLoginView$$State.java */
    /* renamed from: z38$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<a48> {
        public final String a;
        public final String b;

        c(String str, String str2) {
            super("initAuthorizationIsNotAvailableDialog", AddToEndSingleStrategy.class);
            this.a = str;
            this.b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a48 a48Var) {
            a48Var.Bf(this.a, this.b);
        }
    }

    /* compiled from: PhoneNumberLoginView$$State.java */
    /* renamed from: z38$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<a48> {
        d() {
            super("requestPhoneNumberHint", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a48 a48Var) {
            a48Var.Fe();
        }
    }

    /* compiled from: PhoneNumberLoginView$$State.java */
    /* renamed from: z38$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<a48> {
        public final String a;
        public final String b;

        e(String str, String str2) {
            super("setUpBelarusLegalInfoLink", AddToEndSingleStrategy.class);
            this.a = str;
            this.b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a48 a48Var) {
            a48Var.j2(this.a, this.b);
        }
    }

    /* compiled from: PhoneNumberLoginView$$State.java */
    /* renamed from: z38$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<a48> {
        f() {
            super("setUpTermsOfUseLink", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a48 a48Var) {
            a48Var.qb();
        }
    }

    /* compiled from: PhoneNumberLoginView$$State.java */
    /* renamed from: z38$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<a48> {
        g() {
            super("showCantSendSmsError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a48 a48Var) {
            a48Var.t2();
        }
    }

    /* compiled from: PhoneNumberLoginView$$State.java */
    /* renamed from: z38$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<a48> {
        h() {
            super("showError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a48 a48Var) {
            a48Var.e();
        }
    }

    /* compiled from: PhoneNumberLoginView$$State.java */
    /* renamed from: z38$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<a48> {
        public final boolean a;

        i(boolean z) {
            super("showLoading", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a48 a48Var) {
            a48Var.l(this.a);
        }
    }

    /* compiled from: PhoneNumberLoginView$$State.java */
    /* renamed from: z38$j */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<a48> {
        public final String a;

        j(String str) {
            super("showPhoneNumber", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a48 a48Var) {
            a48Var.A(this.a);
        }
    }

    /* compiled from: PhoneNumberLoginView$$State.java */
    /* renamed from: z38$k */
    /* loaded from: classes4.dex */
    public class k extends ViewCommand<a48> {
        public final String a;

        k(String str) {
            super("showPhonePrefix", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a48 a48Var) {
            a48Var.D(this.a);
        }
    }

    /* compiled from: PhoneNumberLoginView$$State.java */
    /* renamed from: z38$l */
    /* loaded from: classes4.dex */
    public class l extends ViewCommand<a48> {
        public final boolean a;

        l(boolean z) {
            super("showSending", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(a48 a48Var) {
            a48Var.Hg(this.a);
        }
    }

    @Override // defpackage.a48
    public void A(String str) {
        j jVar = new j(str);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.A(str);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.a48
    public void Bf(String str, String str2) {
        c cVar = new c(str, str2);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Bf(str, str2);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.a48
    public void D(String str) {
        k kVar = new k(str);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.D(str);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.a48
    public void Fe() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Fe();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.a48
    public void Hg(boolean z) {
        l lVar = new l(z);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Hg(z);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.a48
    public void Tg(boolean z) {
        a aVar = new a(z);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Tg(z);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.a48
    public void e() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.e();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.a48
    public void fa() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.fa();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.a48
    public void j2(String str, String str2) {
        e eVar = new e(str, str2);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.j2(str, str2);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.a48
    public void l(boolean z) {
        i iVar = new i(z);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.l(z);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.a48
    public void qb() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.qb();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.a48
    public void t2() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.t2();
        }
        this.viewCommands.afterApply(gVar);
    }
}
