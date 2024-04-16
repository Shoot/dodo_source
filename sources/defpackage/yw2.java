package defpackage;

import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import defpackage.k9a;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: DeliveryAddressView$$State.java */
/* renamed from: yw2  reason: default package */
/* loaded from: classes2.dex */
public class yw2 extends MvpViewState<bx2> implements bx2 {

    /* compiled from: DeliveryAddressView$$State.java */
    /* renamed from: yw2$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<bx2> {
        a() {
            super("handleLocalityChanged", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(bx2 bx2Var) {
            bx2Var.La();
        }
    }

    /* compiled from: DeliveryAddressView$$State.java */
    /* renamed from: yw2$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<bx2> {
        b() {
            super("hideLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(bx2 bx2Var) {
            bx2Var.C();
        }
    }

    /* compiled from: DeliveryAddressView$$State.java */
    /* renamed from: yw2$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<bx2> {
        public final c.a.C0131a a;

        c(c.a.C0131a c0131a) {
            super("newDeliveryAddress", AddToEndSingleStrategy.class);
            this.a = c0131a;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(bx2 bx2Var) {
            bx2Var.K2(this.a);
        }
    }

    /* compiled from: DeliveryAddressView$$State.java */
    /* renamed from: yw2$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<bx2> {
        public final k9a.b a;

        d(k9a.b bVar) {
            super("showClearCartDialog", OneExecutionStateStrategy.class);
            this.a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(bx2 bx2Var) {
            bx2Var.q(this.a);
        }
    }

    /* compiled from: DeliveryAddressView$$State.java */
    /* renamed from: yw2$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<bx2> {
        public final iv0 a;

        e(iv0 iv0Var) {
            super("showDeliveryAddress", AddToEndSingleStrategy.class);
            this.a = iv0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(bx2 bx2Var) {
            bx2Var.K9(this.a);
        }
    }

    /* compiled from: DeliveryAddressView$$State.java */
    /* renamed from: yw2$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<bx2> {
        f() {
            super("showLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(bx2 bx2Var) {
            bx2Var.b();
        }
    }

    /* compiled from: DeliveryAddressView$$State.java */
    /* renamed from: yw2$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<bx2> {
        g() {
            super("showMainScreen", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(bx2 bx2Var) {
            bx2Var.Gf();
        }
    }

    /* compiled from: DeliveryAddressView$$State.java */
    /* renamed from: yw2$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<bx2> {
        h() {
            super("showUndeliverableError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(bx2 bx2Var) {
            bx2Var.z2();
        }
    }

    @Override // defpackage.bx2
    public void C() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.C();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.bx2
    public void Gf() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Gf();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.bx2
    public void K2(c.a.C0131a c0131a) {
        c cVar = new c(c0131a);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.K2(c0131a);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.bx2
    public void K9(iv0 iv0Var) {
        e eVar = new e(iv0Var);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.K9(iv0Var);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.bx2
    public void La() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.La();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.bx2
    public void b() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.bx2
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

    @Override // defpackage.bx2
    public void z2() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.z2();
        }
        this.viewCommands.afterApply(hVar);
    }
}
