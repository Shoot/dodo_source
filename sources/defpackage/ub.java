package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: AllPizzeriasView$$State.java */
/* renamed from: ub  reason: default package */
/* loaded from: classes4.dex */
public class ub extends MvpViewState<vb> implements vb {

    /* compiled from: AllPizzeriasView$$State.java */
    /* renamed from: ub$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<vb> {
        public final String a;

        a(String str) {
            super("setMapLink", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(vb vbVar) {
            vbVar.O5(this.a);
        }
    }

    @Override // defpackage.vb
    public void O5(String str) {
        a aVar = new a(str);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.O5(str);
        }
        this.viewCommands.afterApply(aVar);
    }
}
