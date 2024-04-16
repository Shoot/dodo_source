package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: PhoneNumberCollectorView$$State.java */
/* renamed from: k38  reason: default package */
/* loaded from: classes2.dex */
public class k38 extends MvpViewState<l38> implements l38 {

    /* compiled from: PhoneNumberCollectorView$$State.java */
    /* renamed from: k38$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<l38> {
        public final boolean a;

        a(boolean z) {
            super("enableNextButton", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(l38 l38Var) {
            l38Var.ke(this.a);
        }
    }

    /* compiled from: PhoneNumberCollectorView$$State.java */
    /* renamed from: k38$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<l38> {
        public final String a;

        b(String str) {
            super("showPhoneNumber", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(l38 l38Var) {
            l38Var.A(this.a);
        }
    }

    /* compiled from: PhoneNumberCollectorView$$State.java */
    /* renamed from: k38$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<l38> {
        public final String a;

        c(String str) {
            super("showPhonePrefix", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(l38 l38Var) {
            l38Var.D(this.a);
        }
    }

    @Override // defpackage.l38
    public void A(String str) {
        b bVar = new b(str);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.A(str);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.l38
    public void D(String str) {
        c cVar = new c(str);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.D(str);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.l38
    public void ke(boolean z) {
        a aVar = new a(z);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ke(z);
        }
        this.viewCommands.afterApply(aVar);
    }
}
