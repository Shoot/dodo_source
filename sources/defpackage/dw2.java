package defpackage;

import defpackage.k9a;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: DeliveryAddressListView$$State.java */
/* renamed from: dw2  reason: default package */
/* loaded from: classes2.dex */
public class dw2 extends MvpViewState<ew2> implements ew2 {

    /* compiled from: DeliveryAddressListView$$State.java */
    /* renamed from: dw2$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<ew2> {
        a() {
            super("hideProgress", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ew2 ew2Var) {
            ew2Var.g();
        }
    }

    /* compiled from: DeliveryAddressListView$$State.java */
    /* renamed from: dw2$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<ew2> {
        public final ou2 a;

        b(ou2 ou2Var) {
            super("showAddressAsSelected", AddToEndSingleStrategy.class);
            this.a = ou2Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ew2 ew2Var) {
            ew2Var.Pg(this.a);
        }
    }

    /* compiled from: DeliveryAddressListView$$State.java */
    /* renamed from: dw2$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<ew2> {
        c() {
            super("showAddressFromStateAsSelected", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ew2 ew2Var) {
            ew2Var.Ef();
        }
    }

    /* compiled from: DeliveryAddressListView$$State.java */
    /* renamed from: dw2$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<ew2> {
        public final k9a.b a;

        d(k9a.b bVar) {
            super("showClearCartDialog", OneExecutionStateStrategy.class);
            this.a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ew2 ew2Var) {
            ew2Var.q(this.a);
        }
    }

    /* compiled from: DeliveryAddressListView$$State.java */
    /* renamed from: dw2$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<ew2> {
        e() {
            super("showConfirmDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ew2 ew2Var) {
            ew2Var.Dd();
        }
    }

    /* compiled from: DeliveryAddressListView$$State.java */
    /* renamed from: dw2$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<ew2> {
        public final List<? extends gv2> a;

        f(List<? extends gv2> list) {
            super("showDeliveryAddresses", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ew2 ew2Var) {
            ew2Var.u3(this.a);
        }
    }

    /* compiled from: DeliveryAddressListView$$State.java */
    /* renamed from: dw2$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<ew2> {
        public final boolean a;

        g(boolean z) {
            super("showEmptyContent", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ew2 ew2Var) {
            ew2Var.Zb(this.a);
        }
    }

    /* compiled from: DeliveryAddressListView$$State.java */
    /* renamed from: dw2$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<ew2> {
        h() {
            super("showError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ew2 ew2Var) {
            ew2Var.e();
        }
    }

    /* compiled from: DeliveryAddressListView$$State.java */
    /* renamed from: dw2$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<ew2> {
        public final ou2 a;

        i(ou2 ou2Var) {
            super("showErrorDeliverablePlaceWithoutLocality", AddToEndSingleStrategy.class);
            this.a = ou2Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ew2 ew2Var) {
            ew2Var.Ig(this.a);
        }
    }

    /* compiled from: DeliveryAddressListView$$State.java */
    /* renamed from: dw2$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<ew2> {
        j() {
            super("showProgress", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ew2 ew2Var) {
            ew2Var.f();
        }
    }

    @Override // defpackage.ew2
    public void Dd() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Dd();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.ew2
    public void Ef() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ef();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.ew2
    public void Ig(ou2 ou2Var) {
        i iVar = new i(ou2Var);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ig(ou2Var);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.ew2
    public void Pg(ou2 ou2Var) {
        b bVar = new b(ou2Var);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Pg(ou2Var);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.ew2
    public void Zb(boolean z) {
        g gVar = new g(z);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Zb(z);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.ew2
    public void e() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.e();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.ew2
    public void f() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.f();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.ew2
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

    @Override // defpackage.ew2
    public void q(k9a.b bVar) {
        d dVar = new d(bVar);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.q(bVar);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.ew2
    public void u3(List<? extends gv2> list) {
        f fVar = new f(list);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.u3(list);
        }
        this.viewCommands.afterApply(fVar);
    }
}
