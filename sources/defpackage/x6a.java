package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: SelectOrderTypeView$$State.java */
/* renamed from: x6a  reason: default package */
/* loaded from: classes4.dex */
public class x6a extends MvpViewState<y6a> implements y6a {

    /* compiled from: SelectOrderTypeView$$State.java */
    /* renamed from: x6a$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<y6a> {
        a() {
            super("switchToArabicPictures", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(y6a y6aVar) {
            y6aVar.Wg();
        }
    }

    @Override // defpackage.y6a
    public void Wg() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Wg();
        }
        this.viewCommands.afterApply(aVar);
    }
}
