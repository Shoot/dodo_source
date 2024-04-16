package defpackage;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: SelectPizzeriaWithGoogleMapsView$$State.java */
/* renamed from: d9a  reason: default package */
/* loaded from: classes4.dex */
public class d9a extends MvpViewState<e9a> implements e9a {

    /* compiled from: SelectPizzeriaWithGoogleMapsView$$State.java */
    /* renamed from: d9a$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<e9a> {
        a() {
            super("mapZoomIn", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(e9a e9aVar) {
            e9aVar.lg();
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsView$$State.java */
    /* renamed from: d9a$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<e9a> {
        b() {
            super("mapZoomOut", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(e9a e9aVar) {
            e9aVar.xa();
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsView$$State.java */
    /* renamed from: d9a$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<e9a> {
        public final String a;

        c(String str) {
            super("openDialer", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(e9a e9aVar) {
            e9aVar.K(this.a);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsView$$State.java */
    /* renamed from: d9a$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<e9a> {
        public final boolean a;

        d(boolean z) {
            super("requestLocation", SkipStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(e9a e9aVar) {
            e9aVar.o(this.a);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsView$$State.java */
    /* renamed from: d9a$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<e9a> {
        public final d88 a;
        public final boolean b;

        e(d88 d88Var, boolean z) {
            super("showBottomSheet", AddToEndSingleStrategy.class);
            this.a = d88Var;
            this.b = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(e9a e9aVar) {
            e9aVar.U0(this.a, this.b);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsView$$State.java */
    /* renamed from: d9a$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<e9a> {
        public final ru.dodopizza.app.presentation.selectpizzeria.combined.a a;

        f(ru.dodopizza.app.presentation.selectpizzeria.combined.a aVar) {
            super("show", AddToEndSingleStrategy.class);
            this.a = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(e9a e9aVar) {
            e9aVar.V0(this.a);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsView$$State.java */
    /* renamed from: d9a$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<e9a> {
        public final LatLngBounds a;

        g(LatLngBounds latLngBounds) {
            super("showInitialMapBounds", AddToEndSingleStrategy.class);
            this.a = latLngBounds;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(e9a e9aVar) {
            e9aVar.m(this.a);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsView$$State.java */
    /* renamed from: d9a$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<e9a> {
        public final LatLng a;

        h(LatLng latLng) {
            super("showInitialMapCoordinates", AddToEndSingleStrategy.class);
            this.a = latLng;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(e9a e9aVar) {
            e9aVar.d0(this.a);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsView$$State.java */
    /* renamed from: d9a$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<e9a> {
        i() {
            super("showLocationNotAvailable", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(e9a e9aVar) {
            e9aVar.j();
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsView$$State.java */
    /* renamed from: d9a$j */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<e9a> {
        j() {
            super("showPermissionDialog", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(e9a e9aVar) {
            e9aVar.c();
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsView$$State.java */
    /* renamed from: d9a$k */
    /* loaded from: classes4.dex */
    public class k extends ViewCommand<e9a> {
        public final d88 a;
        public final jb7 b;
        public final gn3 c;
        public final boolean d;

        k(d88 d88Var, jb7 jb7Var, gn3 gn3Var, boolean z) {
            super("showPizzeriaInfoOnMap", AddToEndSingleStrategy.class);
            this.a = d88Var;
            this.b = jb7Var;
            this.c = gn3Var;
            this.d = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(e9a e9aVar) {
            e9aVar.G(this.a, this.b, this.c, this.d);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsView$$State.java */
    /* renamed from: d9a$l */
    /* loaded from: classes4.dex */
    public class l extends ViewCommand<e9a> {
        public final b68 a;

        l(b68 b68Var) {
            super("showSelectedPizzeriaOnMap", AddToEndSingleStrategy.class);
            this.a = b68Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(e9a e9aVar) {
            e9aVar.c0(this.a);
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsView$$State.java */
    /* renamed from: d9a$m */
    /* loaded from: classes4.dex */
    public class m extends ViewCommand<e9a> {
        public final LatLng a;

        m(LatLng latLng) {
            super("showUserOnMap", AddToEndSingleStrategy.class);
            this.a = latLng;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(e9a e9aVar) {
            e9aVar.x0(this.a);
        }
    }

    @Override // defpackage.e9a
    public void G(d88 d88Var, jb7 jb7Var, gn3 gn3Var, boolean z) {
        k kVar = new k(d88Var, jb7Var, gn3Var, z);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.G(d88Var, jb7Var, gn3Var, z);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.e9a
    public void K(String str) {
        c cVar = new c(str);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.K(str);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.e9a
    public void U0(d88 d88Var, boolean z) {
        e eVar = new e(d88Var, z);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.U0(d88Var, z);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.e9a
    public void V0(ru.dodopizza.app.presentation.selectpizzeria.combined.a aVar) {
        f fVar = new f(aVar);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.V0(aVar);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.e9a
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

    @Override // defpackage.e9a
    public void c0(b68 b68Var) {
        l lVar = new l(b68Var);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.c0(b68Var);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.e9a
    public void d0(LatLng latLng) {
        h hVar = new h(latLng);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.d0(latLng);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.e9a
    public void j() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.j();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.e9a
    public void lg() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.lg();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.e9a
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

    @Override // defpackage.e9a
    public void o(boolean z) {
        d dVar = new d(z);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.o(z);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.e9a
    public void x0(LatLng latLng) {
        m mVar = new m(latLng);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.x0(latLng);
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.e9a
    public void xa() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.xa();
        }
        this.viewCommands.afterApply(bVar);
    }
}
