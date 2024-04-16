package defpackage;

import com.google.android.gms.maps.model.LatLngBounds;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: DeliveryAddressMapView$$State.java */
/* renamed from: uw2  reason: default package */
/* loaded from: classes2.dex */
public class uw2 extends MvpViewState<vw2> implements vw2 {

    /* compiled from: DeliveryAddressMapView$$State.java */
    /* renamed from: uw2$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<vw2> {
        public final boolean a;

        a(boolean z) {
            super("mapZoomIn", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(vw2 vw2Var) {
            vw2Var.ea(this.a);
        }
    }

    /* compiled from: DeliveryAddressMapView$$State.java */
    /* renamed from: uw2$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<vw2> {
        public final boolean a;

        b(boolean z) {
            super("mapZoomOut", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(vw2 vw2Var) {
            vw2Var.K5(this.a);
        }
    }

    /* compiled from: DeliveryAddressMapView$$State.java */
    /* renamed from: uw2$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<vw2> {
        c() {
            super("requestAddressSubscription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(vw2 vw2Var) {
            vw2Var.kb();
        }
    }

    /* compiled from: DeliveryAddressMapView$$State.java */
    /* renamed from: uw2$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<vw2> {
        d() {
            super("requestUserLocation", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(vw2 vw2Var) {
            vw2Var.dh();
        }
    }

    /* compiled from: DeliveryAddressMapView$$State.java */
    /* renamed from: uw2$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<vw2> {
        public final boolean a;

        e(boolean z) {
            super("setMyLocationButtonVisibility", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(vw2 vw2Var) {
            vw2Var.y9(this.a);
        }
    }

    /* compiled from: DeliveryAddressMapView$$State.java */
    /* renamed from: uw2$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<vw2> {
        public final boolean a;

        f(boolean z) {
            super("setZoomButtonsVisibility", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(vw2 vw2Var) {
            vw2Var.q9(this.a);
        }
    }

    /* compiled from: DeliveryAddressMapView$$State.java */
    /* renamed from: uw2$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<vw2> {
        g() {
            super("showAddressUpdateSuccessfulSubscription", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(vw2 vw2Var) {
            vw2Var.Rf();
        }
    }

    /* compiled from: DeliveryAddressMapView$$State.java */
    /* renamed from: uw2$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<vw2> {
        public final a66 a;

        h(a66 a66Var) {
            super("show", AddToEndSingleStrategy.class);
            this.a = a66Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(vw2 vw2Var) {
            vw2Var.P5(this.a);
        }
    }

    /* compiled from: DeliveryAddressMapView$$State.java */
    /* renamed from: uw2$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<vw2> {
        i() {
            super("showError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(vw2 vw2Var) {
            vw2Var.e();
        }
    }

    /* compiled from: DeliveryAddressMapView$$State.java */
    /* renamed from: uw2$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<vw2> {
        public final LatLngBounds a;

        j(LatLngBounds latLngBounds) {
            super("showInitialBounds", AddToEndSingleStrategy.class);
            this.a = latLngBounds;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(vw2 vw2Var) {
            vw2Var.G1(this.a);
        }
    }

    /* compiled from: DeliveryAddressMapView$$State.java */
    /* renamed from: uw2$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<vw2> {
        public final boolean a;

        k(boolean z) {
            super("showLoading", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(vw2 vw2Var) {
            vw2Var.l(this.a);
        }
    }

    /* compiled from: DeliveryAddressMapView$$State.java */
    /* renamed from: uw2$l */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<vw2> {
        public final ov5 a;

        l(ov5 ov5Var) {
            super("showLocation", AddToEndSingleStrategy.class);
            this.a = ov5Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(vw2 vw2Var) {
            vw2Var.w7(this.a);
        }
    }

    /* compiled from: DeliveryAddressMapView$$State.java */
    /* renamed from: uw2$m */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<vw2> {
        m() {
            super("showPermissionDialog", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(vw2 vw2Var) {
            vw2Var.c();
        }
    }

    @Override // defpackage.vw2
    public void G1(LatLngBounds latLngBounds) {
        j jVar = new j(latLngBounds);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.G1(latLngBounds);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.vw2
    public void K5(boolean z) {
        b bVar = new b(z);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.K5(z);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.vw2
    public void P5(a66 a66Var) {
        h hVar = new h(a66Var);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.P5(a66Var);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.vw2
    public void Rf() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Rf();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.vw2
    public void c() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.c();
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.vw2
    public void dh() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.dh();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.vw2
    public void e() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.e();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.vw2
    public void ea(boolean z) {
        a aVar = new a(z);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ea(z);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.vw2
    public void kb() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.kb();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.vw2
    public void l(boolean z) {
        k kVar = new k(z);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.l(z);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.vw2
    public void q9(boolean z) {
        f fVar = new f(z);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.q9(z);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.vw2
    public void w7(ov5 ov5Var) {
        l lVar = new l(ov5Var);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.w7(ov5Var);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.vw2
    public void y9(boolean z) {
        e eVar = new e(z);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.y9(z);
        }
        this.viewCommands.afterApply(eVar);
    }
}
