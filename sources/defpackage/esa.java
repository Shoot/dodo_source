package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: SplashView$$State.java */
/* renamed from: esa  reason: default package */
/* loaded from: classes4.dex */
public class esa extends MvpViewState<fsa> implements fsa {

    /* compiled from: SplashView$$State.java */
    /* renamed from: esa$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<fsa> {
        a() {
            super("allowSwitchToMainScreen", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fsa fsaVar) {
            fsaVar.P2();
        }
    }

    @Override // defpackage.fsa
    public void P2() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.P2();
        }
        this.viewCommands.afterApply(aVar);
    }
}
