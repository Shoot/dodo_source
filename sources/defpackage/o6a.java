package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: SelectLocationView$$State.java */
/* renamed from: o6a  reason: default package */
/* loaded from: classes4.dex */
public class o6a extends MvpViewState<p6a> implements p6a {

    /* compiled from: SelectLocationView$$State.java */
    /* renamed from: o6a$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<p6a> {
        a() {
            super("hideProgress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(p6a p6aVar) {
            p6aVar.g();
        }
    }

    /* compiled from: SelectLocationView$$State.java */
    /* renamed from: o6a$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<p6a> {
        b() {
            super("showProgress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(p6a p6aVar) {
            p6aVar.f();
        }
    }

    @Override // defpackage.p6a
    public void f() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.f();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.p6a
    public void g() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.g();
        }
        this.viewCommands.afterApply(aVar);
    }
}
