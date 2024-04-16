package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: LegalDocumentsView$$State.java */
/* renamed from: uo5  reason: default package */
/* loaded from: classes.dex */
public class uo5 extends MvpViewState<vo5> implements vo5 {

    /* compiled from: LegalDocumentsView$$State.java */
    /* renamed from: uo5$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<vo5> {
        public final List<?> a;

        a(List<?> list) {
            super("showLegalDocuments", AddToEndSingleStrategy.class);
            this.a = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(vo5 vo5Var) {
            vo5Var.Cf(this.a);
        }
    }

    @Override // defpackage.vo5
    public void Cf(List<?> list) {
        a aVar = new a(list);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Cf(list);
        }
        this.viewCommands.afterApply(aVar);
    }
}
