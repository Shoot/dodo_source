package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: AssistantPreferencesView$$State.java */
/* renamed from: pv  reason: default package */
/* loaded from: classes2.dex */
public class pv extends MvpViewState<qv> implements qv {

    /* compiled from: AssistantPreferencesView$$State.java */
    /* renamed from: pv$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<qv> {
        public final ov a;

        a(ov ovVar) {
            super("setupPreferences", AddToEndSingleStrategy.class);
            this.a = ovVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qv qvVar) {
            qvVar.X7(this.a);
        }
    }

    @Override // defpackage.qv
    public void X7(ov ovVar) {
        a aVar = new a(ovVar);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.X7(ovVar);
        }
        this.viewCommands.afterApply(aVar);
    }
}
