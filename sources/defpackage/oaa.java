package defpackage;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: SelectionMapView$$State.java */
/* renamed from: oaa  reason: default package */
/* loaded from: classes2.dex */
public class oaa extends MvpViewState<com.dodopizza.order.feature.selectionmap.presentation.k> implements com.dodopizza.order.feature.selectionmap.presentation.k {

    /* compiled from: SelectionMapView$$State.java */
    /* renamed from: oaa$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<com.dodopizza.order.feature.selectionmap.presentation.k> {
        a() {
            super("hideDelivery", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.selectionmap.presentation.k kVar) {
            kVar.d6();
        }
    }

    /* compiled from: SelectionMapView$$State.java */
    /* renamed from: oaa$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<com.dodopizza.order.feature.selectionmap.presentation.k> {
        b() {
            super("hidePizzerias", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.selectionmap.presentation.k kVar) {
            kVar.y7();
        }
    }

    /* compiled from: SelectionMapView$$State.java */
    /* renamed from: oaa$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<com.dodopizza.order.feature.selectionmap.presentation.k> {
        public final boolean a;

        c(boolean z) {
            super("requestLocation", SkipStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.selectionmap.presentation.k kVar) {
            kVar.o(this.a);
        }
    }

    /* compiled from: SelectionMapView$$State.java */
    /* renamed from: oaa$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<com.dodopizza.order.feature.selectionmap.presentation.k> {
        public final boolean a;

        d(boolean z) {
            super("requestUserLocation", OneExecutionStateStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.selectionmap.presentation.k kVar) {
            kVar.E0(this.a);
        }
    }

    /* compiled from: SelectionMapView$$State.java */
    /* renamed from: oaa$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<com.dodopizza.order.feature.selectionmap.presentation.k> {
        public final aaa a;
        public final e91 b;

        e(aaa aaaVar, e91 e91Var) {
            super("showDelivery", OneExecutionStateStrategy.class);
            this.a = aaaVar;
            this.b = e91Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.selectionmap.presentation.k kVar) {
            kVar.Ne(this.a, this.b);
        }
    }

    /* compiled from: SelectionMapView$$State.java */
    /* renamed from: oaa$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<com.dodopizza.order.feature.selectionmap.presentation.k> {
        public final aaa a;
        public final e91 b;

        f(aaa aaaVar, e91 e91Var) {
            super("showDeliveryNotDefined", OneExecutionStateStrategy.class);
            this.a = aaaVar;
            this.b = e91Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.selectionmap.presentation.k kVar) {
            kVar.K7(this.a, this.b);
        }
    }

    /* compiled from: SelectionMapView$$State.java */
    /* renamed from: oaa$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<com.dodopizza.order.feature.selectionmap.presentation.k> {
        public final LatLngBounds a;

        g(LatLngBounds latLngBounds) {
            super("showInitialMapBounds", AddToEndSingleStrategy.class);
            this.a = latLngBounds;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.selectionmap.presentation.k kVar) {
            kVar.m(this.a);
        }
    }

    /* compiled from: SelectionMapView$$State.java */
    /* renamed from: oaa$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<com.dodopizza.order.feature.selectionmap.presentation.k> {
        h() {
            super("showLocationNotAvailable", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.selectionmap.presentation.k kVar) {
            kVar.j();
        }
    }

    /* compiled from: SelectionMapView$$State.java */
    /* renamed from: oaa$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<com.dodopizza.order.feature.selectionmap.presentation.k> {
        public final LatLng a;
        public final boolean b;

        i(LatLng latLng, boolean z) {
            super("showMapCoordinates", AddToEndSingleStrategy.class);
            this.a = latLng;
            this.b = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.selectionmap.presentation.k kVar) {
            kVar.Yd(this.a, this.b);
        }
    }

    /* compiled from: SelectionMapView$$State.java */
    /* renamed from: oaa$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<com.dodopizza.order.feature.selectionmap.presentation.k> {
        j() {
            super("showPermissionDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.selectionmap.presentation.k kVar) {
            kVar.c();
        }
    }

    /* compiled from: SelectionMapView$$State.java */
    /* renamed from: oaa$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<com.dodopizza.order.feature.selectionmap.presentation.k> {
        public final d88 a;

        k(d88 d88Var) {
            super("showPizzeriaInfo", AddToEndSingleStrategy.class);
            this.a = d88Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.selectionmap.presentation.k kVar) {
            kVar.x3(this.a);
        }
    }

    /* compiled from: SelectionMapView$$State.java */
    /* renamed from: oaa$l */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<com.dodopizza.order.feature.selectionmap.presentation.k> {
        public final d88 a;
        public final jb7 b;
        public final hn3 c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        l(d88 d88Var, jb7 jb7Var, hn3 hn3Var, boolean z, boolean z2, boolean z3) {
            super("showPizzeriaInfoOnMap", OneExecutionStateStrategy.class);
            this.a = d88Var;
            this.b = jb7Var;
            this.c = hn3Var;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.selectionmap.presentation.k kVar) {
            kVar.W7(this.a, this.b, this.c, this.d, this.e, this.f);
        }
    }

    /* compiled from: SelectionMapView$$State.java */
    /* renamed from: oaa$m */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<com.dodopizza.order.feature.selectionmap.presentation.k> {
        public final com.dodopizza.order.feature.selectionmap.presentation.c a;

        m(com.dodopizza.order.feature.selectionmap.presentation.c cVar) {
            super("showPizzerias", AddToEndSingleStrategy.class);
            this.a = cVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.selectionmap.presentation.k kVar) {
            kVar.L5(this.a);
        }
    }

    /* compiled from: SelectionMapView$$State.java */
    /* renamed from: oaa$n */
    /* loaded from: classes2.dex */
    public class n extends ViewCommand<com.dodopizza.order.feature.selectionmap.presentation.k> {
        public final b68 a;

        n(b68 b68Var) {
            super("showSelectedPizzeriaOnMap", OneExecutionStateStrategy.class);
            this.a = b68Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.selectionmap.presentation.k kVar) {
            kVar.c0(this.a);
        }
    }

    /* compiled from: SelectionMapView$$State.java */
    /* renamed from: oaa$o */
    /* loaded from: classes2.dex */
    public class o extends ViewCommand<com.dodopizza.order.feature.selectionmap.presentation.k> {
        public final LatLng a;

        o(LatLng latLng) {
            super("showUserOnMap", OneExecutionStateStrategy.class);
            this.a = latLng;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.order.feature.selectionmap.presentation.k kVar) {
            kVar.x0(this.a);
        }
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void E0(boolean z) {
        d dVar = new d(z);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.E0(z);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void K7(aaa aaaVar, e91 e91Var) {
        f fVar = new f(aaaVar, e91Var);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.K7(aaaVar, e91Var);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void L5(com.dodopizza.order.feature.selectionmap.presentation.c cVar) {
        m mVar = new m(cVar);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.L5(cVar);
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void Ne(aaa aaaVar, e91 e91Var) {
        e eVar = new e(aaaVar, e91Var);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ne(aaaVar, e91Var);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void W7(d88 d88Var, jb7 jb7Var, hn3 hn3Var, boolean z, boolean z2, boolean z3) {
        l lVar = new l(d88Var, jb7Var, hn3Var, z, z2, z3);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.W7(d88Var, jb7Var, hn3Var, z, z2, z3);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void Yd(LatLng latLng, boolean z) {
        i iVar = new i(latLng, z);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Yd(latLng, z);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void c() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.c();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void c0(b68 b68Var) {
        n nVar = new n(b68Var);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.c0(b68Var);
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void d6() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.d6();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void j() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.j();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void m(LatLngBounds latLngBounds) {
        g gVar = new g(latLngBounds);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.m(latLngBounds);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void o(boolean z) {
        c cVar = new c(z);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.o(z);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void x0(LatLng latLng) {
        o oVar = new o(latLng);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.x0(latLng);
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void x3(d88 d88Var) {
        k kVar = new k(d88Var);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.x3(d88Var);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void y7() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.y7();
        }
        this.viewCommands.afterApply(bVar);
    }
}
