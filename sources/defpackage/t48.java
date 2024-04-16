package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: PhonePrefixListView$$State.java */
/* renamed from: t48  reason: default package */
/* loaded from: classes4.dex */
public class t48 extends MvpViewState<u48> implements u48 {

    /* compiled from: PhonePrefixListView$$State.java */
    /* renamed from: t48$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<u48> {
        public final List<a58> a;

        a(List<a58> list) {
            super("showList", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(u48 u48Var) {
            u48Var.u(this.a);
        }
    }

    @Override // defpackage.u48
    public void u(List<a58> list) {
        a aVar = new a(list);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.u(list);
        }
        this.viewCommands.afterApply(aVar);
    }
}
