package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: FullscreenImageView$$State.java */
/* renamed from: e84  reason: default package */
/* loaded from: classes.dex */
public class e84 extends MvpViewState<f84> implements f84 {

    /* compiled from: FullscreenImageView$$State.java */
    /* renamed from: e84$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<f84> {
        public final boolean a;

        a(boolean z) {
            super("showErrorMode", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(f84 f84Var) {
            f84Var.Uf(this.a);
        }
    }

    /* compiled from: FullscreenImageView$$State.java */
    /* renamed from: e84$b */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<f84> {
        public final String a;

        b(String str) {
            super("showImage", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(f84 f84Var) {
            f84Var.z(this.a);
        }
    }

    @Override // defpackage.f84
    public void Uf(boolean z) {
        a aVar = new a(z);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Uf(z);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.f84
    public void z(String str) {
        b bVar = new b(str);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.z(str);
        }
        this.viewCommands.afterApply(bVar);
    }
}
