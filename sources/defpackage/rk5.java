package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: LandingPhoneInputView$$State.java */
/* renamed from: rk5  reason: default package */
/* loaded from: classes4.dex */
public class rk5 extends MvpViewState<sk5> implements sk5 {

    /* compiled from: LandingPhoneInputView$$State.java */
    /* renamed from: rk5$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<sk5> {
        a() {
            super("disableButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(sk5 sk5Var) {
            sk5Var.h0();
        }
    }

    /* compiled from: LandingPhoneInputView$$State.java */
    /* renamed from: rk5$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<sk5> {
        b() {
            super("enableButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(sk5 sk5Var) {
            sk5Var.R();
        }
    }

    /* compiled from: LandingPhoneInputView$$State.java */
    /* renamed from: rk5$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<sk5> {
        public final String a;
        public final String b;

        c(String str, String str2) {
            super("openSMSInputScreen", SkipStrategy.class);
            this.a = str;
            this.b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(sk5 sk5Var) {
            sk5Var.N0(this.a, this.b);
        }
    }

    /* compiled from: LandingPhoneInputView$$State.java */
    /* renamed from: rk5$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<sk5> {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        d(String str, String str2, String str3, String str4, String str5) {
            super("setContent", AddToEndSingleStrategy.class);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(sk5 sk5Var) {
            sk5Var.r9(this.a, this.b, this.c, this.d, this.e);
        }
    }

    /* compiled from: LandingPhoneInputView$$State.java */
    /* renamed from: rk5$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<sk5> {
        public final String a;

        e(String str) {
            super("showPhoneNumber", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(sk5 sk5Var) {
            sk5Var.A(this.a);
        }
    }

    /* compiled from: LandingPhoneInputView$$State.java */
    /* renamed from: rk5$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<sk5> {
        public final String a;

        f(String str) {
            super("showPhonePrefix", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(sk5 sk5Var) {
            sk5Var.D(this.a);
        }
    }

    @Override // defpackage.sk5
    public void A(String str) {
        e eVar = new e(str);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.A(str);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.sk5
    public void D(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.D(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.sk5
    public void N0(String str, String str2) {
        c cVar = new c(str, str2);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.N0(str, str2);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.sk5
    public void R() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.R();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.sk5
    public void h0() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.h0();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.sk5
    public void r9(String str, String str2, String str3, String str4, String str5) {
        d dVar = new d(str, str2, str3, str4, str5);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.r9(str, str2, str3, str4, str5);
        }
        this.viewCommands.afterApply(dVar);
    }
}
