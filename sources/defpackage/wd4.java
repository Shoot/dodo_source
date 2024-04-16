package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: GeoChooseOrderTypeView$$State.java */
/* renamed from: wd4  reason: default package */
/* loaded from: classes2.dex */
public class wd4 extends MvpViewState<xd4> implements xd4 {

    /* compiled from: GeoChooseOrderTypeView$$State.java */
    /* renamed from: wd4$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<xd4> {
        a() {
            super("hideCloseButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xd4 xd4Var) {
            xd4Var.O0();
        }
    }

    /* compiled from: GeoChooseOrderTypeView$$State.java */
    /* renamed from: wd4$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<xd4> {
        b() {
            super("showApiBrokenDialog", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xd4 xd4Var) {
            xd4Var.R6();
        }
    }

    /* compiled from: GeoChooseOrderTypeView$$State.java */
    /* renamed from: wd4$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<xd4> {
        c() {
            super("showCloseButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xd4 xd4Var) {
            xd4Var.s0();
        }
    }

    /* compiled from: GeoChooseOrderTypeView$$State.java */
    /* renamed from: wd4$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<xd4> {
        public final String a;

        d(String str) {
            super("showCountryName", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(xd4 xd4Var) {
            xd4Var.z0(this.a);
        }
    }

    @Override // defpackage.xd4
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

    @Override // defpackage.xd4
    public void R6() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.R6();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.xd4
    public void s0() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.s0();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.xd4
    public void z0(String str) {
        d dVar = new d(str);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.z0(str);
        }
        this.viewCommands.afterApply(dVar);
    }
}
