package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: PizzeriaSuggestionsView$$State.java */
/* renamed from: z98  reason: default package */
/* loaded from: classes2.dex */
public class z98 extends MvpViewState<aa8> implements aa8 {

    /* compiled from: PizzeriaSuggestionsView$$State.java */
    /* renamed from: z98$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<aa8> {
        a() {
            super("hideKeyboard", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(aa8 aa8Var) {
            aa8Var.a();
        }
    }

    /* compiled from: PizzeriaSuggestionsView$$State.java */
    /* renamed from: z98$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<aa8> {
        b() {
            super("hideToolbar", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(aa8 aa8Var) {
            aa8Var.h9();
        }
    }

    /* compiled from: PizzeriaSuggestionsView$$State.java */
    /* renamed from: z98$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<aa8> {
        c() {
            super("onBackClicked", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(aa8 aa8Var) {
            aa8Var.d9();
        }
    }

    /* compiled from: PizzeriaSuggestionsView$$State.java */
    /* renamed from: z98$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<aa8> {
        d() {
            super("requestLocation", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(aa8 aa8Var) {
            aa8Var.k();
        }
    }

    /* compiled from: PizzeriaSuggestionsView$$State.java */
    /* renamed from: z98$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<aa8> {
        e() {
            super("requestLocationWithPermissions", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(aa8 aa8Var) {
            aa8Var.i6();
        }
    }

    /* compiled from: PizzeriaSuggestionsView$$State.java */
    /* renamed from: z98$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<aa8> {
        public final t88 a;

        f(t88 t88Var) {
            super("selectPizzeria", AddToEndSingleStrategy.class);
            this.a = t88Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(aa8 aa8Var) {
            aa8Var.ab(this.a);
        }
    }

    /* compiled from: PizzeriaSuggestionsView$$State.java */
    /* renamed from: z98$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<aa8> {
        public final boolean a;

        g(boolean z) {
            super("setNearestPizzeriasButtonVisibility", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(aa8 aa8Var) {
            aa8Var.v3(this.a);
        }
    }

    /* compiled from: PizzeriaSuggestionsView$$State.java */
    /* renamed from: z98$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<aa8> {
        h() {
            super("showLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(aa8 aa8Var) {
            aa8Var.b();
        }
    }

    /* compiled from: PizzeriaSuggestionsView$$State.java */
    /* renamed from: z98$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<aa8> {
        i() {
            super("showPermissionDialog", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(aa8 aa8Var) {
            aa8Var.c();
        }
    }

    /* compiled from: PizzeriaSuggestionsView$$State.java */
    /* renamed from: z98$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<aa8> {
        public final y98 a;

        j(y98 y98Var) {
            super("showPizzerias", AddToEndSingleStrategy.class);
            this.a = y98Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(aa8 aa8Var) {
            aa8Var.f7(this.a);
        }
    }

    /* compiled from: PizzeriaSuggestionsView$$State.java */
    /* renamed from: z98$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<aa8> {
        k() {
            super("showToolbar", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(aa8 aa8Var) {
            aa8Var.a9();
        }
    }

    @Override // defpackage.aa8
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

    @Override // defpackage.aa8
    public void a9() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.a9();
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.aa8
    public void ab(t88 t88Var) {
        f fVar = new f(t88Var);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ab(t88Var);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.aa8
    public void b() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.aa8
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

    @Override // defpackage.aa8
    public void d9() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.d9();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.aa8
    public void f7(y98 y98Var) {
        j jVar = new j(y98Var);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.f7(y98Var);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.aa8
    public void h9() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.h9();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.aa8
    public void i6() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.i6();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.aa8
    public void k() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.k();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.aa8
    public void v3(boolean z) {
        g gVar = new g(z);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.v3(z);
        }
        this.viewCommands.afterApply(gVar);
    }
}
