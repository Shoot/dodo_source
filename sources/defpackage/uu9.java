package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: SbpBankListView$$State.java */
/* renamed from: uu9  reason: default package */
/* loaded from: classes2.dex */
public class uu9 extends MvpViewState<vu9> implements vu9 {

    /* compiled from: SbpBankListView$$State.java */
    /* renamed from: uu9$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<vu9> {
        public final List<ou9> a;

        a(List<ou9> list) {
            super("onDataLoaded", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(vu9 vu9Var) {
            vu9Var.Z0(this.a);
        }
    }

    @Override // defpackage.vu9
    public void Z0(List<ou9> list) {
        a aVar = new a(list);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Z0(list);
        }
        this.viewCommands.afterApply(aVar);
    }
}
