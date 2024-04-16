package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: SelectPizzeriaView$$State.java */
/* renamed from: p8a  reason: default package */
/* loaded from: classes4.dex */
public class p8a extends MvpViewState<q8a> implements q8a {

    /* compiled from: SelectPizzeriaView$$State.java */
    /* renamed from: p8a$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<q8a> {
        a() {
            super("requestLocation", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(q8a q8aVar) {
            q8aVar.k();
        }
    }

    /* compiled from: SelectPizzeriaView$$State.java */
    /* renamed from: p8a$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<q8a> {
        b() {
            super("setDefaultToolbarTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(q8a q8aVar) {
            q8aVar.cg();
        }
    }

    /* compiled from: SelectPizzeriaView$$State.java */
    /* renamed from: p8a$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<q8a> {
        public final ov5 a;

        c(ov5 ov5Var) {
            super("setMapCenter", AddToEndSingleStrategy.class);
            this.a = ov5Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(q8a q8aVar) {
            q8aVar.M0(this.a);
        }
    }

    /* compiled from: SelectPizzeriaView$$State.java */
    /* renamed from: p8a$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<q8a> {
        public final boolean a;

        d(boolean z) {
            super("setMyLocationEnabled", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(q8a q8aVar) {
            q8aVar.S0(this.a);
        }
    }

    /* compiled from: SelectPizzeriaView$$State.java */
    /* renamed from: p8a$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<q8a> {
        public final boolean a;

        e(boolean z) {
            super("setNearbyRestaurantsViewVisibility", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(q8a q8aVar) {
            q8aVar.h1(this.a);
        }
    }

    /* compiled from: SelectPizzeriaView$$State.java */
    /* renamed from: p8a$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<q8a> {
        public final String a;

        f(String str) {
            super("setSelectedLocalityName", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(q8a q8aVar) {
            q8aVar.jd(this.a);
        }
    }

    /* compiled from: SelectPizzeriaView$$State.java */
    /* renamed from: p8a$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<q8a> {
        public final d88 a;

        g(d88 d88Var) {
            super("setSelectedPizzeriaOnMap", AddToEndSingleStrategy.class);
            this.a = d88Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(q8a q8aVar) {
            q8aVar.Pe(this.a);
        }
    }

    /* compiled from: SelectPizzeriaView$$State.java */
    /* renamed from: p8a$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<q8a> {
        public final if0 a;

        h(if0 if0Var) {
            super("showBoundingBox", AddToEndSingleStrategy.class);
            this.a = if0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(q8a q8aVar) {
            q8aVar.Y(this.a);
        }
    }

    /* compiled from: SelectPizzeriaView$$State.java */
    /* renamed from: p8a$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<q8a> {
        public final ru.dodopizza.app.presentation.selectpizzeria.g a;

        i(ru.dodopizza.app.presentation.selectpizzeria.g gVar) {
            super("show", AddToEndSingleStrategy.class);
            this.a = gVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(q8a q8aVar) {
            q8aVar.T2(this.a);
        }
    }

    /* compiled from: SelectPizzeriaView$$State.java */
    /* renamed from: p8a$j */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<q8a> {
        j() {
            super("showLocationNotAvailable", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(q8a q8aVar) {
            q8aVar.j();
        }
    }

    /* compiled from: SelectPizzeriaView$$State.java */
    /* renamed from: p8a$k */
    /* loaded from: classes4.dex */
    public class k extends ViewCommand<q8a> {
        k() {
            super("showPermissionDialog", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(q8a q8aVar) {
            q8aVar.c();
        }
    }

    /* compiled from: SelectPizzeriaView$$State.java */
    /* renamed from: p8a$l */
    /* loaded from: classes4.dex */
    public class l extends ViewCommand<q8a> {
        public final d88 a;
        public final jb7 b;
        public final gn3 c;
        public final boolean d;

        l(d88 d88Var, jb7 jb7Var, gn3 gn3Var, boolean z) {
            super("showPizzeriaInfoOnMap", AddToEndSingleStrategy.class);
            this.a = d88Var;
            this.b = jb7Var;
            this.c = gn3Var;
            this.d = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(q8a q8aVar) {
            q8aVar.G(this.a, this.b, this.c, this.d);
        }
    }

    /* compiled from: SelectPizzeriaView$$State.java */
    /* renamed from: p8a$m */
    /* loaded from: classes4.dex */
    public class m extends ViewCommand<q8a> {
        public final ov5 a;

        m(ov5 ov5Var) {
            super("showUserLocationOnMap", AddToEndSingleStrategy.class);
            this.a = ov5Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(q8a q8aVar) {
            q8aVar.X0(this.a);
        }
    }

    @Override // defpackage.q8a
    public void G(d88 d88Var, jb7 jb7Var, gn3 gn3Var, boolean z) {
        l lVar = new l(d88Var, jb7Var, gn3Var, z);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.G(d88Var, jb7Var, gn3Var, z);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.q8a
    public void M0(ov5 ov5Var) {
        c cVar = new c(ov5Var);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.M0(ov5Var);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.q8a
    public void Pe(d88 d88Var) {
        g gVar = new g(d88Var);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Pe(d88Var);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.q8a
    public void S0(boolean z) {
        d dVar = new d(z);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.S0(z);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.q8a
    public void T2(ru.dodopizza.app.presentation.selectpizzeria.g gVar) {
        i iVar = new i(gVar);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.T2(gVar);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.q8a
    public void X0(ov5 ov5Var) {
        m mVar = new m(ov5Var);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.X0(ov5Var);
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.q8a
    public void Y(if0 if0Var) {
        h hVar = new h(if0Var);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Y(if0Var);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.q8a
    public void c() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.c();
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.q8a
    public void cg() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.cg();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.q8a
    public void h1(boolean z) {
        e eVar = new e(z);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.h1(z);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.q8a
    public void j() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.j();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.q8a
    public void jd(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.jd(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.q8a
    public void k() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.k();
        }
        this.viewCommands.afterApply(aVar);
    }
}
