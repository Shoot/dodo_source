package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: SelectPizzeriaCombinedView$$State.java */
/* renamed from: m7a  reason: default package */
/* loaded from: classes4.dex */
public class m7a extends MvpViewState<n7a> implements n7a {

    /* compiled from: SelectPizzeriaCombinedView$$State.java */
    /* renamed from: m7a$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<n7a> {
        public final String a;

        a(String str) {
            super("openDialer", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(n7a n7aVar) {
            n7aVar.K(this.a);
        }
    }

    /* compiled from: SelectPizzeriaCombinedView$$State.java */
    /* renamed from: m7a$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<n7a> {
        public final boolean a;

        b(boolean z) {
            super("requestLocation", SkipStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(n7a n7aVar) {
            n7aVar.o(this.a);
        }
    }

    /* compiled from: SelectPizzeriaCombinedView$$State.java */
    /* renamed from: m7a$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<n7a> {
        public final ov5 a;

        c(ov5 ov5Var) {
            super("setMapCenter", AddToEndSingleStrategy.class);
            this.a = ov5Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(n7a n7aVar) {
            n7aVar.M0(this.a);
        }
    }

    /* compiled from: SelectPizzeriaCombinedView$$State.java */
    /* renamed from: m7a$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<n7a> {
        public final boolean a;

        d(boolean z) {
            super("setMyLocationEnabled", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(n7a n7aVar) {
            n7aVar.S0(this.a);
        }
    }

    /* compiled from: SelectPizzeriaCombinedView$$State.java */
    /* renamed from: m7a$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<n7a> {
        public final d88 a;
        public final boolean b;

        e(d88 d88Var, boolean z) {
            super("showBottomSheet", AddToEndSingleStrategy.class);
            this.a = d88Var;
            this.b = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(n7a n7aVar) {
            n7aVar.U0(this.a, this.b);
        }
    }

    /* compiled from: SelectPizzeriaCombinedView$$State.java */
    /* renamed from: m7a$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<n7a> {
        public final if0 a;

        f(if0 if0Var) {
            super("showBoundingBox", AddToEndSingleStrategy.class);
            this.a = if0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(n7a n7aVar) {
            n7aVar.Y(this.a);
        }
    }

    /* compiled from: SelectPizzeriaCombinedView$$State.java */
    /* renamed from: m7a$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<n7a> {
        public final ru.dodopizza.app.presentation.selectpizzeria.combined.a a;

        g(ru.dodopizza.app.presentation.selectpizzeria.combined.a aVar) {
            super("show", AddToEndSingleStrategy.class);
            this.a = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(n7a n7aVar) {
            n7aVar.V0(this.a);
        }
    }

    /* compiled from: SelectPizzeriaCombinedView$$State.java */
    /* renamed from: m7a$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<n7a> {
        h() {
            super("showLocationNotAvailable", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(n7a n7aVar) {
            n7aVar.j();
        }
    }

    /* compiled from: SelectPizzeriaCombinedView$$State.java */
    /* renamed from: m7a$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<n7a> {
        i() {
            super("showPermissionDialog", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(n7a n7aVar) {
            n7aVar.c();
        }
    }

    /* compiled from: SelectPizzeriaCombinedView$$State.java */
    /* renamed from: m7a$j */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<n7a> {
        public final d88 a;
        public final jb7 b;
        public final gn3 c;
        public final boolean d;

        j(d88 d88Var, jb7 jb7Var, gn3 gn3Var, boolean z) {
            super("showPizzeriaInfoOnMap", AddToEndSingleStrategy.class);
            this.a = d88Var;
            this.b = jb7Var;
            this.c = gn3Var;
            this.d = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(n7a n7aVar) {
            n7aVar.G(this.a, this.b, this.c, this.d);
        }
    }

    /* compiled from: SelectPizzeriaCombinedView$$State.java */
    /* renamed from: m7a$k */
    /* loaded from: classes4.dex */
    public class k extends ViewCommand<n7a> {
        public final ov5 a;

        k(ov5 ov5Var) {
            super("showUserLocationOnMap", AddToEndSingleStrategy.class);
            this.a = ov5Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(n7a n7aVar) {
            n7aVar.X0(this.a);
        }
    }

    @Override // defpackage.n7a
    public void G(d88 d88Var, jb7 jb7Var, gn3 gn3Var, boolean z) {
        j jVar = new j(d88Var, jb7Var, gn3Var, z);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.G(d88Var, jb7Var, gn3Var, z);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.n7a
    public void K(String str) {
        a aVar = new a(str);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.K(str);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.n7a
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

    @Override // defpackage.n7a
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

    @Override // defpackage.n7a
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

    @Override // defpackage.n7a
    public void V0(ru.dodopizza.app.presentation.selectpizzeria.combined.a aVar) {
        g gVar = new g(aVar);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.V0(aVar);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.n7a
    public void X0(ov5 ov5Var) {
        k kVar = new k(ov5Var);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.X0(ov5Var);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.n7a
    public void Y(if0 if0Var) {
        f fVar = new f(if0Var);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Y(if0Var);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.n7a
    public void c() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.c();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.n7a
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

    @Override // defpackage.n7a
    public void o(boolean z) {
        b bVar = new b(z);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.o(z);
        }
        this.viewCommands.afterApply(bVar);
    }
}
