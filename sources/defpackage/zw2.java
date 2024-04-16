package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: DeliveryAddressView$$State.java */
/* renamed from: zw2  reason: default package */
/* loaded from: classes4.dex */
public class zw2 extends MvpViewState<ax2> implements ax2 {

    /* compiled from: DeliveryAddressView$$State.java */
    /* renamed from: zw2$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<ax2> {
        a() {
            super("showFailedToSetAddress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ax2 ax2Var) {
            ax2Var.H5();
        }
    }

    /* compiled from: DeliveryAddressView$$State.java */
    /* renamed from: zw2$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<ax2> {
        public final boolean a;

        b(boolean z) {
            super("showProgress", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ax2 ax2Var) {
            ax2Var.M(this.a);
        }
    }

    /* compiled from: DeliveryAddressView$$State.java */
    /* renamed from: zw2$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<ax2> {
        public final boolean a;

        c(boolean z) {
            super("showSaveButton", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ax2 ax2Var) {
            ax2Var.Xe(this.a);
        }
    }

    @Override // defpackage.ax2
    public void H5() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.H5();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.ax2
    public void M(boolean z) {
        b bVar = new b(z);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.M(z);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.ax2
    public void Xe(boolean z) {
        c cVar = new c(z);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Xe(z);
        }
        this.viewCommands.afterApply(cVar);
    }
}
