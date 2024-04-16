package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: AssistantGeneratorResultView$$State.java */
/* renamed from: bu  reason: default package */
/* loaded from: classes2.dex */
public class bu extends MvpViewState<cu> implements cu {

    /* compiled from: AssistantGeneratorResultView$$State.java */
    /* renamed from: bu$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<cu> {
        public final au a;

        a(au auVar) {
            super("setupGeneratorResult", AddToEndSingleStrategy.class);
            this.a = auVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(cu cuVar) {
            cuVar.i7(this.a);
        }
    }

    @Override // defpackage.cu
    public void i7(au auVar) {
        a aVar = new a(auVar);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.i7(auVar);
        }
        this.viewCommands.afterApply(aVar);
    }
}
