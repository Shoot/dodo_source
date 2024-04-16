package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: BuyMoreView$$State.java */
/* renamed from: ij0  reason: default package */
/* loaded from: classes4.dex */
public class ij0 extends MvpViewState<jj0> implements jj0 {

    /* compiled from: BuyMoreView$$State.java */
    /* renamed from: ij0$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<jj0> {
        public final List<wi0> a;

        a(List<wi0> list) {
            super("showBuyMoreItems", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(jj0 jj0Var) {
            jj0Var.c1(this.a);
        }
    }

    /* compiled from: BuyMoreView$$State.java */
    /* renamed from: ij0$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<jj0> {
        b() {
            super("showNoThanks", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(jj0 jj0Var) {
            jj0Var.Ca();
        }
    }

    /* compiled from: BuyMoreView$$State.java */
    /* renamed from: ij0$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<jj0> {
        public final hn6 a;

        c(hn6 hn6Var) {
            super("showPrice", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(jj0 jj0Var) {
            jj0Var.J0(this.a);
        }
    }

    @Override // defpackage.jj0
    public void Ca() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ca();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.jj0
    public void J0(hn6 hn6Var) {
        c cVar = new c(hn6Var);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.J0(hn6Var);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.jj0
    public void c1(List<wi0> list) {
        a aVar = new a(list);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.c1(list);
        }
        this.viewCommands.afterApply(aVar);
    }
}
