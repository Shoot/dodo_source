package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: CovidWarningView$$State.java */
/* renamed from: l02  reason: default package */
/* loaded from: classes4.dex */
public class l02 extends MvpViewState<m02> implements m02 {

    /* compiled from: CovidWarningView$$State.java */
    /* renamed from: l02$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<m02> {
        public final k02 a;

        a(k02 k02Var) {
            super("showCovidWarning", AddToEndSingleStrategy.class);
            this.a = k02Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(m02 m02Var) {
            m02Var.I3(this.a);
        }
    }

    @Override // defpackage.m02
    public void I3(k02 k02Var) {
        a aVar = new a(k02Var);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.I3(k02Var);
        }
        this.viewCommands.afterApply(aVar);
    }
}
