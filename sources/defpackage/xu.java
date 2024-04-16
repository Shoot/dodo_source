package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: AssistantMoodView$$State.java */
/* renamed from: xu  reason: default package */
/* loaded from: classes2.dex */
public class xu extends MvpViewState<yu> implements yu {

    /* compiled from: AssistantMoodView$$State.java */
    /* renamed from: xu$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<yu> {
        public final wu a;

        a(wu wuVar) {
            super("setupMoods", AddToEndSingleStrategy.class);
            this.a = wuVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(yu yuVar) {
            yuVar.o4(this.a);
        }
    }

    @Override // defpackage.yu
    public void o4(wu wuVar) {
        a aVar = new a(wuVar);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.o4(wuVar);
        }
        this.viewCommands.afterApply(aVar);
    }
}
