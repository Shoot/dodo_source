package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: TemrorarilyBlockView$$State.java */
/* renamed from: e9b  reason: default package */
/* loaded from: classes4.dex */
public class e9b extends MvpViewState<f9b> implements f9b {

    /* compiled from: TemrorarilyBlockView$$State.java */
    /* renamed from: e9b$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<f9b> {
        public final boolean a;

        a(boolean z) {
            super("setShowProgress", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(f9b f9bVar) {
            f9bVar.p0(this.a);
        }
    }

    /* compiled from: TemrorarilyBlockView$$State.java */
    /* renamed from: e9b$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<f9b> {
        b() {
            super("setUnblocked", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(f9b f9bVar) {
            f9bVar.p5();
        }
    }

    @Override // defpackage.f9b
    public void p0(boolean z) {
        a aVar = new a(z);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.p0(z);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.f9b
    public void p5() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.p5();
        }
        this.viewCommands.afterApply(bVar);
    }
}
