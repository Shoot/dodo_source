package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: HalvesProductCardView$$State.java */
/* renamed from: wl4  reason: default package */
/* loaded from: classes4.dex */
public class wl4 extends MvpViewState<xl4> implements xl4 {

    /* compiled from: HalvesProductCardView$$State.java */
    /* renamed from: wl4$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<xl4> {
        public final List<hl4> a;
        public final int b;

        a(List<hl4> list, int i) {
            super("configureDoughControl", AddToEndSingleStrategy.class);
            this.a = list;
            this.b = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xl4 xl4Var) {
            xl4Var.sb(this.a, this.b);
        }
    }

    /* compiled from: HalvesProductCardView$$State.java */
    /* renamed from: wl4$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<xl4> {
        public final hl4 a;

        b(hl4 hl4Var) {
            super("setHalvesInfo", AddToEndSingleStrategy.class);
            this.a = hl4Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xl4 xl4Var) {
            xl4Var.Ad(this.a);
        }
    }

    /* compiled from: HalvesProductCardView$$State.java */
    /* renamed from: wl4$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<xl4> {
        public final hl4 a;

        c(hl4 hl4Var) {
            super("setProductViewsInfo", AddToEndSingleStrategy.class);
            this.a = hl4Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xl4 xl4Var) {
            xl4Var.vg(this.a);
        }
    }

    /* compiled from: HalvesProductCardView$$State.java */
    /* renamed from: wl4$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<xl4> {
        public final String a;

        d(String str) {
            super("setTextForButton", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xl4 xl4Var) {
            xl4Var.nf(this.a);
        }
    }

    /* compiled from: HalvesProductCardView$$State.java */
    /* renamed from: wl4$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<xl4> {
        public final b78 a;

        e(b78 b78Var) {
            super("setupImageViewForPizza", AddToEndSingleStrategy.class);
            this.a = b78Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xl4 xl4Var) {
            xl4Var.T0(this.a);
        }
    }

    /* compiled from: HalvesProductCardView$$State.java */
    /* renamed from: wl4$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<xl4> {
        public final hl4 a;

        f(hl4 hl4Var) {
            super("updateHalvesInfo", AddToEndSingleStrategy.class);
            this.a = hl4Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xl4 xl4Var) {
            xl4Var.Zg(this.a);
        }
    }

    @Override // defpackage.xl4
    public void Ad(hl4 hl4Var) {
        b bVar = new b(hl4Var);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ad(hl4Var);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.xl4
    public void T0(b78 b78Var) {
        e eVar = new e(b78Var);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.T0(b78Var);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.xl4
    public void Zg(hl4 hl4Var) {
        f fVar = new f(hl4Var);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Zg(hl4Var);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.xl4
    public void nf(String str) {
        d dVar = new d(str);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.nf(str);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.xl4
    public void sb(List<hl4> list, int i) {
        a aVar = new a(list, i);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.sb(list, i);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.xl4
    public void vg(hl4 hl4Var) {
        c cVar = new c(hl4Var);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.vg(hl4Var);
        }
        this.viewCommands.afterApply(cVar);
    }
}
