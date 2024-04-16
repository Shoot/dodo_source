package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: EmailForChecksView$$State.java */
/* renamed from: jf3  reason: default package */
/* loaded from: classes4.dex */
public class jf3 extends MvpViewState<kf3> implements kf3 {

    /* compiled from: EmailForChecksView$$State.java */
    /* renamed from: jf3$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<kf3> {
        a() {
            super("hideKeyboard", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(kf3 kf3Var) {
            kf3Var.a();
        }
    }

    /* compiled from: EmailForChecksView$$State.java */
    /* renamed from: jf3$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<kf3> {
        public final boolean a;

        b(boolean z) {
            super("setSaveButtonEnabled", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(kf3 kf3Var) {
            kf3Var.Q0(this.a);
        }
    }

    /* compiled from: EmailForChecksView$$State.java */
    /* renamed from: jf3$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<kf3> {
        public final boolean a;

        c(boolean z) {
            super("setSubscribedToNews", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(kf3 kf3Var) {
            kf3Var.sc(this.a);
        }
    }

    /* compiled from: EmailForChecksView$$State.java */
    /* renamed from: jf3$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<kf3> {
        public final String a;

        d(String str) {
            super("showEmail", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(kf3 kf3Var) {
            kf3Var.Sg(this.a);
        }
    }

    @Override // defpackage.kf3
    public void Q0(boolean z) {
        b bVar = new b(z);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Q0(z);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.kf3
    public void Sg(String str) {
        d dVar = new d(str);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Sg(str);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.kf3
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

    @Override // defpackage.kf3
    public void sc(boolean z) {
        c cVar = new c(z);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.sc(z);
        }
        this.viewCommands.afterApply(cVar);
    }
}
