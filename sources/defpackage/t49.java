package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: RateAppDialogView$$State.java */
/* renamed from: t49  reason: default package */
/* loaded from: classes.dex */
public class t49 extends MvpViewState<u49> implements u49 {

    /* compiled from: RateAppDialogView$$State.java */
    /* renamed from: t49$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<u49> {
        a() {
            super("openAppStoreForRating", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(u49 u49Var) {
            u49Var.Fa();
        }
    }

    @Override // defpackage.u49
    public void Fa() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Fa();
        }
        this.viewCommands.afterApply(aVar);
    }
}
