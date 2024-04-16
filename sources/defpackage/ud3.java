package defpackage;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.k9a;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: EditDeliveryAddressMapView$$State.java */
/* renamed from: ud3  reason: default package */
/* loaded from: classes2.dex */
public class ud3 extends MvpViewState<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i> implements com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i {

    /* compiled from: EditDeliveryAddressMapView$$State.java */
    /* renamed from: ud3$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i> {
        a() {
            super("hideKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i iVar) {
            iVar.a();
        }
    }

    /* compiled from: EditDeliveryAddressMapView$$State.java */
    /* renamed from: ud3$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i> {
        public final boolean a;

        b(boolean z) {
            super("requestUserLocation", OneExecutionStateStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i iVar) {
            iVar.E0(this.a);
        }
    }

    /* compiled from: EditDeliveryAddressMapView$$State.java */
    /* renamed from: ud3$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i> {
        c() {
            super("showAddressCatcherError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i iVar) {
            iVar.m7();
        }
    }

    /* compiled from: EditDeliveryAddressMapView$$State.java */
    /* renamed from: ud3$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i> {
        d() {
            super("showAddressCatcherLoading", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i iVar) {
            iVar.B4();
        }
    }

    /* compiled from: EditDeliveryAddressMapView$$State.java */
    /* renamed from: ud3$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i> {
        e() {
            super("showAddressCatcherSuccess", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i iVar) {
            iVar.Jg();
        }
    }

    /* compiled from: EditDeliveryAddressMapView$$State.java */
    /* renamed from: ud3$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i> {
        public final k9a.b a;

        f(k9a.b bVar) {
            super("showClearCartDialog", OneExecutionStateStrategy.class);
            this.a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i iVar) {
            iVar.q(this.a);
        }
    }

    /* compiled from: EditDeliveryAddressMapView$$State.java */
    /* renamed from: ud3$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i> {
        public final w56 a;

        g(w56 w56Var) {
            super("show", AddToEndSingleStrategy.class);
            this.a = w56Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i iVar) {
            iVar.D5(this.a);
        }
    }

    /* compiled from: EditDeliveryAddressMapView$$State.java */
    /* renamed from: ud3$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i> {
        h() {
            super("showDeleteConfirmDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i iVar) {
            iVar.y0();
        }
    }

    /* compiled from: EditDeliveryAddressMapView$$State.java */
    /* renamed from: ud3$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i> {
        public final LatLngBounds a;

        i(LatLngBounds latLngBounds) {
            super("showInitialMapBounds", OneExecutionStateStrategy.class);
            this.a = latLngBounds;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i iVar) {
            iVar.m(this.a);
        }
    }

    /* compiled from: EditDeliveryAddressMapView$$State.java */
    /* renamed from: ud3$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i> {
        public final LatLng a;

        j(LatLng latLng) {
            super("showInitialMapCoordinates", OneExecutionStateStrategy.class);
            this.a = latLng;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i iVar) {
            iVar.d0(this.a);
        }
    }

    /* compiled from: EditDeliveryAddressMapView$$State.java */
    /* renamed from: ud3$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i> {
        public final LatLng a;
        public final boolean b;

        k(LatLng latLng, boolean z) {
            super("showLocationWithAnimation", OneExecutionStateStrategy.class);
            this.a = latLng;
            this.b = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i iVar) {
            iVar.Q2(this.a, this.b);
        }
    }

    /* compiled from: EditDeliveryAddressMapView$$State.java */
    /* renamed from: ud3$l */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i> {
        l() {
            super("showPermissionDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i iVar) {
            iVar.c();
        }
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void B4() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.B4();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void D5(w56 w56Var) {
        g gVar = new g(w56Var);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.D5(w56Var);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void E0(boolean z) {
        b bVar = new b(z);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.E0(z);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void Jg() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Jg();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void Q2(LatLng latLng, boolean z) {
        k kVar = new k(latLng, z);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Q2(latLng, z);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void a() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.a();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void c() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.c();
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void d0(LatLng latLng) {
        j jVar = new j(latLng);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.d0(latLng);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void m(LatLngBounds latLngBounds) {
        i iVar = new i(latLngBounds);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.m(latLngBounds);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void m7() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.m7();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void q(k9a.b bVar) {
        f fVar = new f(bVar);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.q(bVar);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void y0() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.y0();
        }
        this.viewCommands.afterApply(hVar);
    }
}
