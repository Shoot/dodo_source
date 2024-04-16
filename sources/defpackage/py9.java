package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: SearchView$$State.java */
/* renamed from: py9  reason: default package */
/* loaded from: classes4.dex */
public class py9 extends MvpViewState<qy9> implements qy9 {

    /* compiled from: SearchView$$State.java */
    /* renamed from: py9$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<qy9> {
        a() {
            super("clearSearchResults", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qy9 qy9Var) {
            qy9Var.qc();
        }
    }

    /* compiled from: SearchView$$State.java */
    /* renamed from: py9$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<qy9> {
        public final String a;

        b(String str) {
            super("setSearch", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qy9 qy9Var) {
            qy9Var.X9(this.a);
        }
    }

    /* compiled from: SearchView$$State.java */
    /* renamed from: py9$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<qy9> {
        c() {
            super("showNoSearchResults", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qy9 qy9Var) {
            qy9Var.J2();
        }
    }

    /* compiled from: SearchView$$State.java */
    /* renamed from: py9$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<qy9> {
        public final List<? extends ye6> a;
        public final b78 b;

        d(List<? extends ye6> list, b78 b78Var) {
            super("showSearchResults", AddToEndSingleStrategy.class);
            this.a = list;
            this.b = b78Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qy9 qy9Var) {
            qy9Var.X3(this.a, this.b);
        }
    }

    @Override // defpackage.qy9
    public void J2() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.J2();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.qy9
    public void X3(List<? extends ye6> list, b78 b78Var) {
        d dVar = new d(list, b78Var);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.X3(list, b78Var);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.qy9
    public void X9(String str) {
        b bVar = new b(str);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.X9(str);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.qy9
    public void qc() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.qc();
        }
        this.viewCommands.afterApply(aVar);
    }
}
