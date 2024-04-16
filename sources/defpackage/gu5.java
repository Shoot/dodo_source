package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: LocalityListView$$State.java */
/* renamed from: gu5  reason: default package */
/* loaded from: classes4.dex */
public class gu5 extends MvpViewState<hu5> implements hu5 {

    /* compiled from: LocalityListView$$State.java */
    /* renamed from: gu5$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<hu5> {
        a() {
            super("hideCloseButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(hu5 hu5Var) {
            hu5Var.O0();
        }
    }

    /* compiled from: LocalityListView$$State.java */
    /* renamed from: gu5$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<hu5> {
        b() {
            super("hideCountry", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(hu5 hu5Var) {
            hu5Var.hb();
        }
    }

    /* compiled from: LocalityListView$$State.java */
    /* renamed from: gu5$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<hu5> {
        public final int a;

        c(int i) {
            super("scrollToSelectedCity", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(hu5 hu5Var) {
            hu5Var.i3(this.a);
        }
    }

    /* compiled from: LocalityListView$$State.java */
    /* renamed from: gu5$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<hu5> {
        d() {
            super("showCloseButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(hu5 hu5Var) {
            hu5Var.s0();
        }
    }

    /* compiled from: LocalityListView$$State.java */
    /* renamed from: gu5$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<hu5> {
        e() {
            super("showCountry", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(hu5 hu5Var) {
            hu5Var.B9();
        }
    }

    /* compiled from: LocalityListView$$State.java */
    /* renamed from: gu5$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<hu5> {
        public final String a;

        f(String str) {
            super("showCountryName", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(hu5 hu5Var) {
            hu5Var.z0(this.a);
        }
    }

    /* compiled from: LocalityListView$$State.java */
    /* renamed from: gu5$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<hu5> {
        public final List<? extends n6a> a;

        g(List<? extends n6a> list) {
            super("showLocalityList", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(hu5 hu5Var) {
            hu5Var.yc(this.a);
        }
    }

    /* compiled from: LocalityListView$$State.java */
    /* renamed from: gu5$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<hu5> {
        public final boolean a;

        h(boolean z) {
            super("showSearchEmpty", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(hu5 hu5Var) {
            hu5Var.ie(this.a);
        }
    }

    @Override // defpackage.hu5
    public void B9() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.B9();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.hu5
    public void O0() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.O0();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.hu5
    public void hb() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.hb();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.hu5
    public void i3(int i) {
        c cVar = new c(i);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.i3(i);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.hu5
    public void ie(boolean z) {
        h hVar = new h(z);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ie(z);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.hu5
    public void s0() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.s0();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.hu5
    public void yc(List<? extends n6a> list) {
        g gVar = new g(list);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.yc(list);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.hu5
    public void z0(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.z0(str);
        }
        this.viewCommands.afterApply(fVar);
    }
}
