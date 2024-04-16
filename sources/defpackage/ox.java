package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: AssistantWishesView$$State.java */
/* renamed from: ox  reason: default package */
/* loaded from: classes2.dex */
public class ox extends MvpViewState<px> implements px {

    /* compiled from: AssistantWishesView$$State.java */
    /* renamed from: ox$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<px> {
        public final nx a;

        a(nx nxVar) {
            super("setupWishes", AddToEndSingleStrategy.class);
            this.a = nxVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(px pxVar) {
            pxVar.Xb(this.a);
        }
    }

    @Override // defpackage.px
    public void Xb(nx nxVar) {
        a aVar = new a(nxVar);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Xb(nxVar);
        }
        this.viewCommands.afterApply(aVar);
    }
}
