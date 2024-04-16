package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: AssistantSharingView$$State.java */
/* renamed from: kw  reason: default package */
/* loaded from: classes2.dex */
public class kw extends MvpViewState<lw> implements lw {

    /* compiled from: AssistantSharingView$$State.java */
    /* renamed from: kw$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<lw> {
        a() {
            super("initiateSharing", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(lw lwVar) {
            lwVar.db();
        }
    }

    /* compiled from: AssistantSharingView$$State.java */
    /* renamed from: kw$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<lw> {
        public final jw a;

        b(jw jwVar) {
            super("setupSharingInfo", AddToEndSingleStrategy.class);
            this.a = jwVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(lw lwVar) {
            lwVar.C9(this.a);
        }
    }

    @Override // defpackage.lw
    public void C9(jw jwVar) {
        b bVar = new b(jwVar);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.C9(jwVar);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.lw
    public void db() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.db();
        }
        this.viewCommands.afterApply(aVar);
    }
}
