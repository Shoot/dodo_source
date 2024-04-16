package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: ProfileLocaleListView$$State.java */
/* renamed from: vn8  reason: default package */
/* loaded from: classes2.dex */
public class vn8 extends MvpViewState<wn8> implements wn8 {

    /* compiled from: ProfileLocaleListView$$State.java */
    /* renamed from: vn8$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<wn8> {
        public final List<ct5> a;

        a(List<ct5> list) {
            super("showList", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wn8 wn8Var) {
            wn8Var.u(this.a);
        }
    }

    @Override // defpackage.wn8
    public void u(List<ct5> list) {
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
