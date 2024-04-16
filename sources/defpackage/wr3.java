package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: FeedbackPhotosView$$State.java */
/* renamed from: wr3  reason: default package */
/* loaded from: classes.dex */
public class wr3 extends MvpViewState<xr3> implements xr3 {

    /* compiled from: FeedbackPhotosView$$State.java */
    /* renamed from: wr3$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<xr3> {
        public final List<q58> a;

        a(List<q58> list) {
            super("setRatingPhotos", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xr3 xr3Var) {
            xr3Var.ha(this.a);
        }
    }

    @Override // defpackage.xr3
    public void ha(List<q58> list) {
        a aVar = new a(list);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ha(list);
        }
        this.viewCommands.afterApply(aVar);
    }
}
