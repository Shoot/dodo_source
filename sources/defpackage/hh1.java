package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: ComboCustomizeBuilderView$$State.java */
/* renamed from: hh1  reason: default package */
/* loaded from: classes4.dex */
public class hh1 extends MvpViewState<ih1> implements ih1 {

    /* compiled from: ComboCustomizeBuilderView$$State.java */
    /* renamed from: hh1$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<ih1> {
        a() {
            super("clearIngredients", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ih1 ih1Var) {
            ih1Var.v8();
        }
    }

    /* compiled from: ComboCustomizeBuilderView$$State.java */
    /* renamed from: hh1$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<ih1> {
        b() {
            super("clearRemovedIngredients", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ih1 ih1Var) {
            ih1Var.e0();
        }
    }

    /* compiled from: ComboCustomizeBuilderView$$State.java */
    /* renamed from: hh1$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<ih1> {
        c() {
            super("close", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ih1 ih1Var) {
            ih1Var.close();
        }
    }

    /* compiled from: ComboCustomizeBuilderView$$State.java */
    /* renamed from: hh1$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<ih1> {
        d() {
            super("hideToppings", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ih1 ih1Var) {
            ih1Var.t();
        }
    }

    /* compiled from: ComboCustomizeBuilderView$$State.java */
    /* renamed from: hh1$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<ih1> {
        e() {
            super("setIngredientsUnderToppings", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ih1 ih1Var) {
            ih1Var.S8();
        }
    }

    /* compiled from: ComboCustomizeBuilderView$$State.java */
    /* renamed from: hh1$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<ih1> {
        public final List<kjb> a;

        f(List<kjb> list) {
            super("setToppingsData", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ih1 ih1Var) {
            ih1Var.setToppingsData(this.a);
        }
    }

    /* compiled from: ComboCustomizeBuilderView$$State.java */
    /* renamed from: hh1$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<ih1> {
        g() {
            super("setToppingsUnderIngredients", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ih1 ih1Var) {
            ih1Var.Z7();
        }
    }

    /* compiled from: ComboCustomizeBuilderView$$State.java */
    /* renamed from: hh1$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<ih1> {
        h() {
            super("showCancelButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ih1 ih1Var) {
            ih1Var.Wc();
        }
    }

    /* compiled from: ComboCustomizeBuilderView$$State.java */
    /* renamed from: hh1$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<ih1> {
        public final vl8 a;

        i(vl8 vl8Var) {
            super("showIngredient", AddToEndSingleStrategy.class);
            this.a = vl8Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ih1 ih1Var) {
            ih1Var.K0(this.a);
        }
    }

    /* compiled from: ComboCustomizeBuilderView$$State.java */
    /* renamed from: hh1$j */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<ih1> {
        j() {
            super("showReceiptChangedPanel", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ih1 ih1Var) {
            ih1Var.s4();
        }
    }

    /* compiled from: ComboCustomizeBuilderView$$State.java */
    /* renamed from: hh1$k */
    /* loaded from: classes4.dex */
    public class k extends ViewCommand<ih1> {
        k() {
            super("showToppings", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ih1 ih1Var) {
            ih1Var.O();
        }
    }

    @Override // defpackage.ih1
    public void K0(vl8 vl8Var) {
        i iVar = new i(vl8Var);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.K0(vl8Var);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.ih1
    public void O() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.O();
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.ih1
    public void S8() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.S8();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.ih1
    public void Wc() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Wc();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.ih1
    public void Z7() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Z7();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.ih1
    public void close() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.close();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.ih1
    public void e0() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.e0();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.ih1
    public void s4() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.s4();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.ih1
    public void setToppingsData(List<kjb> list) {
        f fVar = new f(list);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.setToppingsData(list);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.ih1
    public void t() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.t();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.ih1
    public void v8() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.v8();
        }
        this.viewCommands.afterApply(aVar);
    }
}
