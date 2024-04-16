package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: ComboTemplateConstructorView$$State.java */
/* renamed from: si1  reason: default package */
/* loaded from: classes4.dex */
public class si1 extends MvpViewState<ti1> implements ti1 {

    /* compiled from: ComboTemplateConstructorView$$State.java */
    /* renamed from: si1$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<ti1> {
        a() {
            super("close", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ti1 ti1Var) {
            ti1Var.close();
        }
    }

    /* compiled from: ComboTemplateConstructorView$$State.java */
    /* renamed from: si1$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<ti1> {
        b() {
            super("sendResultAction", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ti1 ti1Var) {
            ti1Var.N1();
        }
    }

    /* compiled from: ComboTemplateConstructorView$$State.java */
    /* renamed from: si1$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<ti1> {
        public final l6<x89> a;
        public final int b;

        c(l6<x89> l6Var, int i) {
            super("showProducts", AddToEndSingleStrategy.class);
            this.a = l6Var;
            this.b = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ti1 ti1Var) {
            ti1Var.If(this.a, this.b);
        }
    }

    /* compiled from: ComboTemplateConstructorView$$State.java */
    /* renamed from: si1$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<ti1> {
        public final int a;
        public final y89 b;

        d(int i, y89 y89Var) {
            super("updateProduct", AddToEndSingleStrategy.class);
            this.a = i;
            this.b = y89Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(ti1 ti1Var) {
            ti1Var.o9(this.a, this.b);
        }
    }

    @Override // defpackage.ti1
    public void If(l6<x89> l6Var, int i) {
        c cVar = new c(l6Var, i);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.If(l6Var, i);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.ti1
    public void N1() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.N1();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.ti1
    public void close() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.close();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.ti1
    public void o9(int i, y89 y89Var) {
        d dVar = new d(i, y89Var);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.o9(i, y89Var);
        }
        this.viewCommands.afterApply(dVar);
    }
}
