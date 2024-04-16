package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: AssistantWelcomeView$$State.java */
/* renamed from: xw  reason: default package */
/* loaded from: classes2.dex */
public class xw extends MvpViewState<yw> implements yw {

    /* compiled from: AssistantWelcomeView$$State.java */
    /* renamed from: xw$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<yw> {
        public final ww a;

        a(ww wwVar) {
            super("setupWelcomeInfo", AddToEndSingleStrategy.class);
            this.a = wwVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(yw ywVar) {
            ywVar.Ae(this.a);
        }
    }

    @Override // defpackage.yw
    public void Ae(ww wwVar) {
        a aVar = new a(wwVar);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ae(wwVar);
        }
        this.viewCommands.afterApply(aVar);
    }
}
