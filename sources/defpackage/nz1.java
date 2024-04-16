package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: CourierTipsCardView$$State.java */
/* renamed from: nz1  reason: default package */
/* loaded from: classes.dex */
public class nz1 extends MvpViewState<oz1> implements oz1 {

    /* compiled from: CourierTipsCardView$$State.java */
    /* renamed from: nz1$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<oz1> {
        a() {
            super("hideTips", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oz1 oz1Var) {
            oz1Var.b2();
        }
    }

    /* compiled from: CourierTipsCardView$$State.java */
    /* renamed from: nz1$b */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<oz1> {
        public final List<com.dodopizza.controlling.feature.couriertipscard.presentation.a> a;

        b(List<com.dodopizza.controlling.feature.couriertipscard.presentation.a> list) {
            super("setTips", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oz1 oz1Var) {
            oz1Var.Na(this.a);
        }
    }

    /* compiled from: CourierTipsCardView$$State.java */
    /* renamed from: nz1$c */
    /* loaded from: classes.dex */
    public class c extends ViewCommand<oz1> {
        c() {
            super("showTips", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(oz1 oz1Var) {
            oz1Var.Yc();
        }
    }

    @Override // defpackage.oz1
    public void Na(List<com.dodopizza.controlling.feature.couriertipscard.presentation.a> list) {
        b bVar = new b(list);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Na(list);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.oz1
    public void Yc() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Yc();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.oz1
    public void b2() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b2();
        }
        this.viewCommands.afterApply(aVar);
    }
}
