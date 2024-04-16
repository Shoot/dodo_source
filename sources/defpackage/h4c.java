package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: WebViewCardPaymentView$$State.java */
/* renamed from: h4c  reason: default package */
/* loaded from: classes4.dex */
public class h4c extends MvpViewState<i4c> implements i4c {

    /* compiled from: WebViewCardPaymentView$$State.java */
    /* renamed from: h4c$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<i4c> {
        public final boolean a;

        a(boolean z) {
            super("showConnectionError", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(i4c i4cVar) {
            i4cVar.L(this.a);
        }
    }

    /* compiled from: WebViewCardPaymentView$$State.java */
    /* renamed from: h4c$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<i4c> {
        b() {
            super("showExpirationDialog", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(i4c i4cVar) {
            i4cVar.gf();
        }
    }

    /* compiled from: WebViewCardPaymentView$$State.java */
    /* renamed from: h4c$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<i4c> {
        public final boolean a;

        c(boolean z) {
            super("showProgress", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(i4c i4cVar) {
            i4cVar.M(this.a);
        }
    }

    /* compiled from: WebViewCardPaymentView$$State.java */
    /* renamed from: h4c$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<i4c> {
        d() {
            super("showWaitMessage", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(i4c i4cVar) {
            i4cVar.Ke();
        }
    }

    @Override // defpackage.i4c
    public void Ke() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ke();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.i4c
    public void L(boolean z) {
        a aVar = new a(z);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.L(z);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.i4c
    public void M(boolean z) {
        c cVar = new c(z);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.M(z);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.i4c
    public void gf() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.gf();
        }
        this.viewCommands.afterApply(bVar);
    }
}
